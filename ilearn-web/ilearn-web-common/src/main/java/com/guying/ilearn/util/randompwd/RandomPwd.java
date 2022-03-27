/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-12-12 22:49 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.util.randompwd;

import java.security.SecureRandom;

/**
 * 描述：要求：密码需要有大写、小写、特殊字符、长度在 8-20 位
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-12-12 22:49 星期日
 */
public class RandomPwd {
    private static final String LOW_STR = "abcdefghijklmnopqrstuvwxyz";
    private static final String SPECIAL_STR = "~!@#$%^&*()_+/-=[]{};:'<>?.";
    private static final String NUM_STR = "0123456789";

    /**
     * 随机获取字符串字符
     */
    private static char getRandomChar(String str) {
        SecureRandom random = new SecureRandom();
        return str.charAt(random.nextInt(str.length()));
    }


    public static void main(String[] args) {
        System.out.println(getRandomChar(LOW_STR));
    }

}
