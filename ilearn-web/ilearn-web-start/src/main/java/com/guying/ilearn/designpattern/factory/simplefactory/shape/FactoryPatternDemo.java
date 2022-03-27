/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 12:19 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.simplefactory.shape;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 12:19 星期日
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeCircle = shapeFactory.getShape(ShapeFactory.SHAPE_CIRCLE);
        shapeCircle.draw();
        Shape shapeSquare = shapeFactory.getShape(ShapeFactory.SHAPE_SQUARE);
        shapeSquare.draw();
        Shape shapeRectangle = shapeFactory.getShape(ShapeFactory.SHAPE_RECTANGLE);
        shapeRectangle.draw();
    }
}
