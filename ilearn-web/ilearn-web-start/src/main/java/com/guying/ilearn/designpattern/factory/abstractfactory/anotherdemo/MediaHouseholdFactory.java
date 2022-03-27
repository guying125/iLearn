/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 17:01 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

/**
 * 描述：美的生产工厂
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 17:01 星期日
 */
public class MediaHouseholdFactory implements IHouseholdElectricFactory {
    @Override
    public IFridge createFridge() {
        return new MediaFridge();
    }

    @Override
    public IWasher createWasher() {
        return new MediaWasher();
    }
}
