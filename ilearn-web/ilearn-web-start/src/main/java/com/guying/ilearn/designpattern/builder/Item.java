/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/29 22:36 星期二
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.builder;

/**
 * 接口描述：食物
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/29 22:36 星期二
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
