package com.guying.ilearn.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

public class GuavaDemo {
    /**
     * 连接器
     */
    private static final Joiner joiner = Joiner.on("|").skipNulls();
    /**
     * 分割器
     */
    private static final Splitter splitter = Splitter.on("|").trimResults().omitEmptyStrings();

    private static final CharMatcher digit = CharMatcher.DIGIT;

    public static void main(String[] args) {
        String s = new String("bac|def|ghi");
        String[] s1 = s.split("\\|");

        for (String s2 : s1) {
            System.out.println(s2);
        }


        System.out.println("-------------");

        // 将集合/数组中的元素join在一起
        String join = joiner.join(Lists.newArrayList("a1", null, "b2"));
        System.out.println(join);

        System.out.println("-------------");

        Iterable<String> split = splitter.split(" a|   |b||");
        for (String s2 : split) {
            System.out.println(s2);
        }


    }
}
