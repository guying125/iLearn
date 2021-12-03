/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-21 17:45 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 描述：Response with single record to return
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-11-21 17:45 星期日
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Data
public class SingleResponse<T> extends Response {
    private static final long serialVersionUID = 1L;

    /**
     * 响应数据
     */
    private T data;

    @Override
    public String toString() {
        return "SingleResponse [success=" + super.isSuccess() + ", errCode=" + super.getErrCode() + ", errMsg=" + super.getErrMsg() + ", data=" + data + "]";
    }

    /**
     * 构建成功响应
     *
     * @return 成功的响应对象
     */
    public static SingleResponse buildSuccess() {
        SingleResponse response = new SingleResponse();
        response.setSuccess(true);

        return response;
    }

    /**
     * 构建失败响应
     *
     * @param errCode 错误码
     * @param errMsg  错误消息
     * @return 失败的响应对象
     */
    public static SingleResponse buildFailure(String errCode, String errMsg) {
        SingleResponse response = new SingleResponse();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMsg(errMsg);

        return response;
    }

    /**
     * 构建成功响应，并返回数据
     *
     * @param data 单响应数据
     * @return 成功的响应对象
     */
    public static <T> SingleResponse<T> of(T data) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setData(data);

        return response;
    }
}
