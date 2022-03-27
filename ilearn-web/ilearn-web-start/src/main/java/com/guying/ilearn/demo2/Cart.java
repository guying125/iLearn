/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/17 11:18 下午 星期四
 * ==============   ============   ===================================
 */
package com.guying.ilearn.demo2;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：购物车
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/17 11:18 下午 星期四
 */
@Data
public class Cart {
    private List<Item> items = new ArrayList<>();
    private BigDecimal totalDiscount;
    private BigDecimal totalItemPrice;
    private BigDecimal totalDeliveryPrice;
    private BigDecimal payPrice;
}
