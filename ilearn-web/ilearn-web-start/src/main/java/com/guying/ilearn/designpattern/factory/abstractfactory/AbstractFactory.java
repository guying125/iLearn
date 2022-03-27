/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 14:14 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.abstractfactory;

import com.guying.ilearn.designpattern.factory.simplefactory.color.Color;
import com.guying.ilearn.designpattern.factory.simplefactory.shape.Shape;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 14:14 星期日
 */
public abstract class AbstractFactory {
    /**
     * 创建形状
     *
     * @param shapeType
     * @return
     */
    public abstract Shape getShape(String shapeType);

    /**
     * 填充颜色
     *
     * @param colorType
     * @return
     */
    public abstract Color getColor(String colorType);
}
