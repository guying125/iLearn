/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-28 15:44 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common;

import com.guying.ilearn.common.dto.SingleResponse;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SingleResponseTest {

    @Test
    void testToString() {
        //        System.out.println(singleResponse.toString());
        SingleResponse<Object> singleResponse = new SingleResponse<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(5, 4);
        map.put(3, 7);
        singleResponse.setData(map);
        singleResponse.setSuccess(false);
        singleResponse.setErrCode("123");
        singleResponse.setErrMsg("524");

        System.out.println(singleResponse.toString());

        SingleResponse<Object> singleResponse2 = new SingleResponse<>();
        TestDTO testDTO = new TestDTO().setNum(1).setName("qyw").setGen("F");

        singleResponse2.setData(testDTO);
        singleResponse2.setSuccess(false);
        singleResponse2.setErrCode("123");
        singleResponse2.setErrMsg("524");


        System.out.println(singleResponse2.toString());
    }

    @Test
    void buildSuccess() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(5, 4);
        map.put(3, 7);
        System.out.println(SingleResponse.of(map));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(SingleResponse.of(list));
    }

    @Test
    void buildFailure() {
        System.out.println(SingleResponse.buildFailure("78127", "HAudh"));
    }
}