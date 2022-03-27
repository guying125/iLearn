/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 15:07 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.factorymethod;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 15:07 星期日
 */
public class BiluochunTeaFactory implements TeaFactory {
    @Override
    public Tea createTea() {
        return new BiluochunTea();
    }
}
