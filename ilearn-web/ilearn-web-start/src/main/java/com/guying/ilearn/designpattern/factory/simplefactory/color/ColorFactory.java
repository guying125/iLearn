/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 14:16 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.simplefactory.color;

import com.guying.ilearn.designpattern.factory.abstractfactory.AbstractFactory;
import com.guying.ilearn.designpattern.factory.simplefactory.shape.Shape;
import org.apache.commons.lang3.StringUtils;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 14:16 星期日
 */
public class ColorFactory extends AbstractFactory {

    public static final String COLOR_RED = "RED";
    public static final String COLOR_GREEN = "GREEN";
    public static final String COLOR_BLUE = "BLUE";

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if (StringUtils.isBlank(colorType)) {
            return null;
        }

        if (COLOR_RED.equalsIgnoreCase(colorType)) {
            return new Red();
        } else if (COLOR_GREEN.equalsIgnoreCase(colorType)) {
            return new Green();
        } else if (COLOR_BLUE.equalsIgnoreCase(colorType)) {
            return new Blue();
        }

        return null;
    }
}
