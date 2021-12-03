/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-28 15:19 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common;

import com.guying.ilearn.common.dto.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

@AutoConfigureMockMvc
class ResponseTest {

    @Test
    void buildSuccess() {
        System.out.println(Response.buildSuccess());
    }

    @Test
    void buildFailure() {
        System.out.println(Response.buildFailure("123", "wer"));
    }
}