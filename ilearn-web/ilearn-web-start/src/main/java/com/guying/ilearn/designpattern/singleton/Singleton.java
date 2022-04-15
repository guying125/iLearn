/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 23:21 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：单例模式
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 23:21 星期日
 */
public class Singleton {
    /**
     * 构造方法私有化
     */
    private Singleton() {
    }

    /**
     * 单例对象
     */
    private static Singleton instance = new Singleton();

    /**
     * 获取实例对象
     */
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hi Singleton");
    }
}
