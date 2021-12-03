/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-28 16:24 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common;

import com.guying.ilearn.common.dto.MultiResponse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MultiResponseTest {

    @Test
    void isEmpty() {
        MultiResponse<Object> multiResponse = new MultiResponse<>();
        System.out.println(multiResponse.isEmpty());
    }

    @Test
    void isNotEmpty() {
        MultiResponse<Object> multiResponse = new MultiResponse<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        multiResponse.setData(Collections.singleton(list));
        System.out.println(multiResponse.isNotEmpty());
    }

    @Test
    void buildSuccess() {
        System.out.println(MultiResponse.buildSuccess());
    }

    @Test
    void buildFailure() {
        System.out.println(MultiResponse.buildFailure("312", "shdu"));
    }

    @Test
    void of() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        MultiResponse<Integer> of = MultiResponse.of(list);
        System.out.println(of);
    }
}