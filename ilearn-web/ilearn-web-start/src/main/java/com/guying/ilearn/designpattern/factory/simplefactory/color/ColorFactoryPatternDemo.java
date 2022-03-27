/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/27 14:22 星期日
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.factory.simplefactory.color;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/27 14:22 星期日
 */
public class ColorFactoryPatternDemo {
    public static void main(String[] args) {
        ColorFactory colorFactory = new ColorFactory();

        Color color = colorFactory.getColor(ColorFactory.COLOR_RED);
        Color color1 = colorFactory.getColor(ColorFactory.COLOR_GREEN);
        Color color2 = colorFactory.getColor(ColorFactory.COLOR_BLUE);

        color.fill();
        color1.fill();
        color2.fill();
    }
}
