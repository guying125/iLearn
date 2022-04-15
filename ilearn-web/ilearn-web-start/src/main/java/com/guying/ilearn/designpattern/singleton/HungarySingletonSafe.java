/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 23:50 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：饿汉式
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 23:50 星期日
 */
public class HungarySingletonSafe {
    private HungarySingletonSafe() {
    }

    private static HungarySingletonSafe instance = new HungarySingletonSafe();

    public static HungarySingletonSafe getInstance() {
        return instance;
    }
}
