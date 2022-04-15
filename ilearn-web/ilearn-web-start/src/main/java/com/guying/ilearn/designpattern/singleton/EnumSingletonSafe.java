/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/28 01:03 星期一
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.singleton;

/**
 * 描述：枚举
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/28 01:03 星期一
 */
public enum EnumSingletonSafe {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("输出");
    }
}
