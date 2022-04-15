/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/29 22:47 星期二
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.builder;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/29 22:47 星期二
 */
public class VegBugger extends Bugger {
    @Override
    public String name() {
        return "VerBugger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
