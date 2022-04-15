/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/31 22:20 星期四
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.prototype;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/31 22:20 星期四
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
