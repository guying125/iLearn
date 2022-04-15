/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/29 22:44 星期二
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.builder;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/29 22:44 星期二
 */
public abstract class Bugger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
