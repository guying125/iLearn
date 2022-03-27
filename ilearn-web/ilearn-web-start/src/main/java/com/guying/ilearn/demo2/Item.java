/*
 * 修改说明：
 * ==============   ============   ===================================
 *      操作            用户            日期
 * ==============   ============   ===================================
 *      新增            JoFlow        2022/3/17 11:20 下午 星期四
 * ==============   ============   ===================================
 */
package com.guying.ilearn.demo2;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 描述：商品
 *
 * @author JoFlow
 * @version v1.0
 * @date 2022/3/17 11:20 下午 星期四
 */
@Data
public class Item {
    private  long id;
    private int quantity;
    private BigDecimal price;
    private BigDecimal couponPrice;
    private BigDecimal deliveryPrice;
}
