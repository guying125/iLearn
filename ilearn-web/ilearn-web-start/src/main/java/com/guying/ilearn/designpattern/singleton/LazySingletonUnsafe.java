/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 23:29 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：懒汉式
 * 懒加载，线程不安全
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 23:29 星期日
 */
public class LazySingletonUnsafe {
    private LazySingletonUnsafe() {
    }

    private static LazySingletonUnsafe instance;

    private static LazySingletonUnsafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonUnsafe();
        }
        return instance;
    }
}
