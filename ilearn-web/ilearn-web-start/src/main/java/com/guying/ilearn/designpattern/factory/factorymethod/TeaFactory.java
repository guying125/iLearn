/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 15:05 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.factorymethod;

/**
 * 接口描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 15:05 星期日
 */
public interface TeaFactory {
    /**
     * 生产茶叶
     *
     * @return Tea
     */
    public Tea createTea();
}
