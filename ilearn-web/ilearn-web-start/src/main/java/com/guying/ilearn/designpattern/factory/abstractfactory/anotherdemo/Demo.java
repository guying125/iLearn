/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 17:04 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 17:04 星期日
 */
public class Demo {
    public static void main(String[] args) {
        IHouseholdElectricFactory factory = new GeliHouseholdFactory();
        IFridge fridge = factory.createFridge();
        IWasher washer = factory.createWasher();

        fridge.coldStorage();
        fridge.freezing();
        washer.wash();
    }
}
