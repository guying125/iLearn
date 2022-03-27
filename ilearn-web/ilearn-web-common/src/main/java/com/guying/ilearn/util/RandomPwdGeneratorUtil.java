/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-12-04 01:31 星期六
 * ==============   ===============     =================================
 */
package com.guying.ilearn.util;

import java.util.Random;

/**
 * 描述：随机密码生成器 Random Password Generator
 * 1.生成指定位数的随机密码，密码中需要包含大写字母、小写字母、数字和特殊字符中至少三种类型。
 * <p>
 * 2.参照招行手机银行APP的密码规则：
 * 输入6-8位数字、字母或数字字母组合，并与常用软件的密码不同；
 * <p>
 * 3.指定密码规则
 * 1）所用字符是否包含A-Z
 * 2）所用字符是否包含a-z
 * 3）所用字符是否包含0-9
 * 4）所用字符是否包含特殊字符
 * 5）密码长度6-24位
 * 6）是否允许排除字符
 * 7）是否允许字符重复
 * <p>
 * 4.密码强度校验
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-12-04 01:31 星期六
 */
public class RandomPwdGeneratorUtil {
    private RandomPwdGeneratorUtil() {}

    /**
     * 密码能包含的特殊字符
     */
    public static final char[] ALLOWED_SPECIAL_CHARACTERS = "!@#$%^&*".toCharArray();

    /**
     * 数字
     */
    public static final char[] NUMBER_CHARACTER = "0123456789".toCharArray();

    /**
     * 小写字母
     */
    public static final char[] LOWER_CASE_LETTERS_CHARACTER = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * 大写字母
     */
    public static final char[] UPPER_CASE_LETTERS_CHARACTER = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();

    /**
     * 字母长度，默认26
     */
    private static final int LETTER_RANGE = 26;

    /**
     * 数字长度，默认10
     */
    private static final int NUMBER_RANGE = 10;
    /**
     * 特殊字符的长度
     */
    private static final int SP_CHARACTER_RANGE = ALLOWED_SPECIAL_CHARACTERS.length;

    private static final Random random = new Random();

    /**
     * 密码的长度
     */
    private int passwordLength;

    /**
     * 密码包含字符的最少种类
     */
    private int minVariousType;

    //
    private static final String lowStr = "abcdefghijklmnopqrstuvwxyz";
    private static final String specialStr = "~!@#$%^&*()_+/-=[]{};:'<>?.";
    private static final String numStr = "0123456789";

    /**
     *
     */
    public static String generateRandomPwd() {

        return "";
    }


}
