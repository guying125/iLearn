package com.guying.ilearn.study.global;

public class BizException extends RuntimeException {
    public BizException(String errCode, String errMessage) {
        throw new RuntimeException(errCode + errMessage);
    }
}
