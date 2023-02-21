package com.guying.ilearn.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 问题：
 * 1、如何使用设计模式优化代码结构？
 * 2、是否利用一些高级特性来简化代码实现？
 * 3、有没有借助框架的能力来扩展应用能力？
 * 4、自己设计的业务模型够不够抽象？
 * 5、代码扩展性强不强，需求如果有变化模块代码能不能做到最小化修改？
 * <p>
 * https://mp.weixin.qq.com/s/uVM1zQIBmj5rDVtTCaj7mA
 */
@Service
public class NoDuplicateCode {
    @Value("${test.name}")
    private String name;

    void showName() {
        System.out.println(name);
    }


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a";
        String s3 = "bc";

        System.out.println((s1 == (s2 + s3)));

        System.out.println(s1.equals(s2 + s3));

        String abc = new String("abc");
        System.out.println(s1.equals(abc));

        System.out.println(s1 == abc);

    }
}
