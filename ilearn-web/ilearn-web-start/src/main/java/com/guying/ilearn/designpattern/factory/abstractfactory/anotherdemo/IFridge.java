/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 16:38 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory.anotherdemo;

/**
 * 接口描述：冰箱产品
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 16:38 星期日
 */
public interface IFridge {
    /**
     * 冷藏
     */
    public void coldStorage();

    /**
     * 冷冻
     */
    public void freezing();
}
