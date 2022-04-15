/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/29 22:55 星期二
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.builder;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/29 22:55 星期二
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBugger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBugger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
