/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/29 22:50 星期二
 * ==============   ============   ===================================
 */
package com.guying.ilearn.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/29 22:50 星期二
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public float getCost() {
        float totalCost = 0.0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println(item.name() + ", " + item.packing().pack() + ", " + item.price());
        }
    }
}
