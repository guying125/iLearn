package com.guying.ilearn.web;

import com.guying.ilearn.anno.Excel2;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 描述:
 *
 * @author : qingjun
 * @version : 1.0
 * @date : 2022/12/17 09:46
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    @Excel2(name = "姓名")
    private String name;
    @Excel2(name = "年龄")
    private int age;
    @Excel2(name = "性别", dictVal = "0=女,1=男")
    private int gender;

    public User(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
