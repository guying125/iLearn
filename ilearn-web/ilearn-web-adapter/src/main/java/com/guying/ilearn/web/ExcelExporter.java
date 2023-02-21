package com.guying.ilearn.web;

import com.guying.ilearn.anno.Excel2;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 描述:
 *
 * @author : qingjun
 * @version : 1.0
 * @date : 2022/12/17 09:51
 **/
@RestController
public class ExcelExporter {

    public static void export(List<User> users, OutputStream outputStream) {
        // 创建工作表
        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("用户数据");
            // 写入标题行
            Row head = sheet.createRow(0);
            Field[] declaredFields = User.class.getDeclaredFields();
            List<String> names = Stream.of(declaredFields)
                    .filter(f -> f.isAnnotationPresent(Excel2.class))
                    .map(m -> m.getAnnotation(Excel2.class).name()).collect(Collectors.toList());
            for (int i = 0; i < names.size(); i++) {
                Cell cell = head.createCell(i);
                cell.setCellValue(names.get(i));
            }

            // 写入数据
            int ui = 1;
            for (User user : users) {
                Row userRow = sheet.createRow(ui++);
                writeRowData(userRow, user);
            }
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeRowData(Row userRow, User user) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();
        List<Field> filterFields = Arrays.stream(declaredFields)
                .filter(f -> f.isAnnotationPresent(Excel2.class))
                .collect(Collectors.toList());
        for (int i = 0; i < filterFields.size(); i++) {
            Cell cell = userRow.createCell(i);
            Field field = filterFields.get(i);
            field.setAccessible(true);
            cell.setCellValue(String.valueOf(field.get(user)));
            field.setAccessible(false);
        }

    }

    public static void main(String[] args) throws IOException {
        List<User> users = new ArrayList<>();
        User user1 = new User("张三", 21, 1);
        User user2 = new User("里斯", 19, 0);
        User user3 = new User("王武", 18, 1);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        OutputStream outputStream = Files.newOutputStream(Paths.get("/Users/qingjun/workspace/gitProj/iLearn/ilearn-web/ilearn-web-adapter/users.xlsx"));
        ExcelExporter.export(users, outputStream);

    }
}
