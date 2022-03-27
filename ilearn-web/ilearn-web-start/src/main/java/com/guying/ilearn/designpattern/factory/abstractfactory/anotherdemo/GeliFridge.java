/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 16:43 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

/**
 * 描述：格力冰箱
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 16:43 星期日
 */
public class GeliFridge implements IFridge {
    @Override
    public void coldStorage() {
        System.out.println("格力冰箱，冷藏");
    }

    @Override
    public void freezing() {
        System.out.println("格力冰箱，冷冻");
    }
}
