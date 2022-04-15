/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/28 00:21 星期一
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：静态内部类
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/28 00:21 星期一
 */
public class StaticNestedClassSingletonSafe {
    private static class SingleHolder {
        private static final StaticNestedClassSingletonSafe INSTANCE = new StaticNestedClassSingletonSafe();
    }

    private StaticNestedClassSingletonSafe() {
    }

    public static final StaticNestedClassSingletonSafe getInstance() {
        return SingleHolder.INSTANCE;
    }
}
