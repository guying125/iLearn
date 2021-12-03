/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-21 18:10 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common.dto;

import lombok.EqualsAndHashCode;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 描述：Response with batch record to return, usually use in conditional query
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-11-21 18:10 星期日
 */
@EqualsAndHashCode(callSuper = true)
public class MultiResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private Collection<T> data;

    public List<T> getData() {
        return null == data ? Collections.emptyList() : new ArrayList<>(data);
    }

    public MultiResponse<T> setData(Collection<T> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "MultiResponse [success=" + super.isSuccess() + ", errCode=" + super.getErrCode() + ", errMsg=" + super.getErrMsg() + ", data=" + data + "]";
    }

    /**
     * 判断返回集合是否为空
     *
     * @return true|false
     */
    public boolean isEmpty() {
        return CollectionUtils.isEmpty(data);
    }

    /**
     * 判断返回集合是否非空
     *
     * @return true|false
     */
    public boolean isNotEmpty() {
        return !isEmpty();
    }

    /**
     * 构建成功，无返回数据
     *
     * @return 响应成功的对象
     */
    public static MultiResponse buildSuccess() {
        MultiResponse response = new MultiResponse();
        response.setSuccess(true);

        return response;
    }

    /**
     * 构建失败
     *
     * @param errCode 错误码
     * @param errMsg  错误消息
     * @return 响应失败的对象
     */
    public static MultiResponse buildFailure(String errCode, String errMsg) {
        MultiResponse response = new MultiResponse();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMsg(errMsg);

        return response;
    }

    /**
     * 构建成功响应，并返回数据
     *
     * @param data 数据
     * @param <T>  泛型类型
     * @return 响应成功的对象，含返回数据
     */
    public static <T> MultiResponse<T> of(Collection<T> data) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setData(data);

        return response;
    }
}
