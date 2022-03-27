/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 15:11 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.factorymethod;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 15:11 星期日
 */
public class BiluochunTea implements Tea {
    @Override
    public void makeTea() {
        System.out.println("碧螺春茶");
    }
}
