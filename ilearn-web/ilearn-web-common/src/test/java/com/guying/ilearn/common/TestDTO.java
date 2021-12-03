/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-28 15:59 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 描述：
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-11-28 15:59 星期日
 */
@Data
@Accessors(chain = true)
public class TestDTO {
    private Integer num;
    private String name;
    private String gen;
}
