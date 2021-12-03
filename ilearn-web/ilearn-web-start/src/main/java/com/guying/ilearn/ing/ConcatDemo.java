/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-10-23 20:10 星期六
 * ==============   ===============     =================================
 */
package com.guying.ilearn.ing;

import lombok.Data;

import java.util.Arrays;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-10-23 20:10 星期六
 */
@Data
public class ConcatDemo {
    private final char[] value;

    public static void main(String[] args) {
//        String str1 = "aaa";
//        String str2 = "123";
//        String concat = str2.concat(str1);
//        System.out.println(str2);
//        System.out.println(concat);
        int i = 1;
        i = i++;
        System.out.println(i);

    }

//    public String concat(String str) {
//        int otherLen = str.length();
//        if (otherLen == 0) {
//            return new String();
//        }
//        int len = value.length;
//        char[] buf = Arrays.copyOf(value, len + otherLen);
//        str.getChars(buf,len);
//        return new String(buf, true);
//    }
}
