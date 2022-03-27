/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 17:02 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

/**
 * 描述：格力生产工厂
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 17:02 星期日
 */
public class GeliHouseholdFactory implements IHouseholdElectricFactory {
    @Override
    public IFridge createFridge() {
        return new GeliFridge();
    }

    @Override
    public IWasher createWasher() {
        return new GeliWasher();
    }
}
