/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 12:11 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.simplefactory.shape;

import com.guying.ilearn.designpattern.factory.abstractfactory.AbstractFactory;
import com.guying.ilearn.designpattern.factory.simplefactory.color.Color;
import org.apache.commons.lang3.StringUtils;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 12:11 星期日
 */
public class ShapeFactory extends AbstractFactory {

    public static final String SHAPE_CIRCLE = "CIRCLE";
    public static final String SHAPE_SQUARE = "SQUARE";
    public static final String SHAPE_RECTANGLE = "RECTANGLE";

    @Override
    public Shape getShape(String shapeType) {
        if (StringUtils.isBlank(shapeType)) {
            return null;
        }

        if (SHAPE_CIRCLE.equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (SHAPE_SQUARE.equalsIgnoreCase(shapeType)) {
            return new Square();
        } else if (SHAPE_RECTANGLE.equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
