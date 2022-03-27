/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 16:58 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

/**
 * 接口描述：家用电器工厂，生产冰箱和洗衣机
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 16:58 星期日
 */
public interface IHouseholdElectricFactory {
    /**
     * 生产冰箱
     *
     * @return 冰箱
     */
    IFridge createFridge();

    /**
     * 生产洗衣机
     *
     * @return 洗衣机
     */
    IWasher createWasher();
}
