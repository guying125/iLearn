/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 16:42 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

/**
 * 描述：美的洗衣机
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 16:42 星期日
 */
public class MediaWasher implements IWasher {
    @Override
    public void wash() {
        System.out.println("美的洗衣机，洗");
    }
}
