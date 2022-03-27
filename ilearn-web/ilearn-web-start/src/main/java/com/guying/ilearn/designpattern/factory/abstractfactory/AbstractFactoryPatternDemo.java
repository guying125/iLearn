/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 14:49 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory;

import com.guying.ilearn.designpattern.factory.simplefactory.color.Color;
import com.guying.ilearn.designpattern.factory.simplefactory.color.ColorFactory;
import com.guying.ilearn.designpattern.factory.simplefactory.shape.Shape;
import com.guying.ilearn.designpattern.factory.simplefactory.shape.ShapeFactory;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 14:49 星期日
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.FACTORY_SHAPE);
        // 取形状为Circle的对象
        Shape shape = factory.getShape(ShapeFactory.SHAPE_CIRCLE);
        // 绘制图像
        shape.draw();

        // 获取颜色工厂
        AbstractFactory factory1 = FactoryProducer.getFactory(FactoryProducer.FACTORY_COLOR);
        // 取红色
        Color color = factory1.getColor(ColorFactory.COLOR_RED);
        // 填充颜色
        color.fill();
    }
}
