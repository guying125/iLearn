/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 14:45 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory;

import com.guying.ilearn.designpattern.factory.simplefactory.color.ColorFactory;
import com.guying.ilearn.designpattern.factory.simplefactory.shape.ShapeFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 14:45 星期日
 */
public class FactoryProducer {

    public static final String FACTORY_SHAPE = "SHAPE";
    public static final String FACTORY_COLOR = "COLOR";

    public static AbstractFactory getFactory(String choice) {
        if (StringUtils.isBlank(choice)) {
            return null;
        }
        if (FACTORY_SHAPE.equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        } else if (FACTORY_COLOR.equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
