package com.guying.ilearn.study.valid;

import com.guying.ilearn.study.global.BizException;
import org.apache.commons.lang3.StringUtils;

/**
 * 统一校验
 * 1、定义业务断言类：主要针对BIZ层出现的参数及业务结果进行断言，避免重复写if...else...判断。
 * 2、自定义的统一异常处理类（全局）
 */
public class BizAssert {
    public static void notEmpty(String param) {
        if (StringUtils.isEmpty(param)) {
            throw new BizException("1234", "5678");
        }
    }
}
