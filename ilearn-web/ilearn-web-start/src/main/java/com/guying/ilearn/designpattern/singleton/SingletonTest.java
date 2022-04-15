/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 23:26 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：测试类
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 23:26 星期日
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton.getInstance().showMessage();

        EnumSingletonSafe.INSTANCE.whateverMethod();
    }
}
