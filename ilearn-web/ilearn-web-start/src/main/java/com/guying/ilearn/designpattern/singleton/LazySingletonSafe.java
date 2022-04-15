/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 23:48 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：懒汉式
 * 懒加载，线程安全
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 23:48 星期日
 */
public class LazySingletonSafe {
    private LazySingletonSafe() {
    }

    private static LazySingletonSafe instance;

    public static synchronized LazySingletonSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonSafe();
        }

        return instance;
    }
}
