/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-21 17:01 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 描述：Response to caller
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-11-21 17:01 星期日
 */
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Data
public class Response extends DTO {

    private static final long serialVersionUID = 1L;

    /**
     * 响应结果是否成功
     */
    private boolean success;

    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误消息
     */
    private String errMsg;

    @Override
    public String toString() {
        return "Response [success=" + success + ", errCode=" + errCode + ", errMsg=" + errMsg + "]";
    }

    /**
     * 构建成功响应
     *
     * @return 成功的响应对象
     */
    public static Response buildSuccess() {
        return new Response().setSuccess(true);
    }

    /**
     * 构建失败响应
     *
     * @param errCode 错误码
     * @param errMsg  错误消息
     * @return 失败的响应对象
     */
    public static Response buildFailure(String errCode, String errMsg) {
        return new Response().setSuccess(false).setErrCode(errCode).setErrMsg(errMsg);
    }
}
