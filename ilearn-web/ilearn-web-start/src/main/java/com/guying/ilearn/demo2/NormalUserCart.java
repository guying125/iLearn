/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/17 11:26 下午 星期四
 * ==============   ============   ===================================
 */
package com.guying.ilearn.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 描述：普通用户购物车处理
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/17 11:26 下午 星期四
 */
public class NormalUserCart {
    public Cart process(long userId, Map<Long, Integer> items) {
        Cart cart = new Cart();

        List<Item> itemList = new ArrayList<>();
        items.entrySet().stream().forEach(entry -> {
            Item item = new Item();
            item.setId(entry.getKey());
//            item.set
        });

        return null;
    }
}
