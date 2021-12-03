/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-28 23:17 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 描述：Response with batch page record to return, usually use in page query
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-11-28 23:17 星期日
 */
public class PageResponse<T> extends Response {
    private static final long serialVersionUID = 1L;

    /**
     * 默认每页数量
     */
    private static final int MIN_PAGE_SIZE = 1;

    /**
     * 最小页面值
     */
    private static final int MIN_PAGE_INDEX = 1;

    private int totalCount = 0;

    private int pageSize = 1;

    private int pageIndex = 1;

    private Collection<T> data;

    public int getTotalCount() {
        return totalCount;
    }

    public PageResponse<T> setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public int getPageSize() {
        return Math.max(pageSize, MIN_PAGE_SIZE);
    }

    public PageResponse<T> setPageSize(int pageSize) {
        this.pageSize = Math.max(pageSize, MIN_PAGE_SIZE);
        return this;
    }

    public int getPageIndex() {
        return Math.max(pageIndex, MIN_PAGE_INDEX);
    }

    public PageResponse<T> setPageIndex(int pageIndex) {
        this.pageIndex = Math.max(pageIndex, MIN_PAGE_INDEX);
        return this;
    }

    public List<T> getData() {
        return null == data ? Collections.emptyList() : new ArrayList<>(data);
    }

    public PageResponse<T> setData(Collection<T> data) {
        this.data = data;
        return this;
    }

    public int getTotalPages() {
        return this.totalCount % this.pageSize == 0 ? this.totalCount
                / this.pageSize : (this.totalCount / this.pageSize) + 1;
    }

    public boolean isEmpty() {
        return data == null || data.size() == 0;
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public static PageResponse buildSuccess() {
        PageResponse response = new PageResponse();
        response.setSuccess(true);

        return response;
    }

    public static PageResponse buildFailure(String errCode, String errMsg) {
        PageResponse response = new PageResponse();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMsg(errMsg);

        return response;
    }

    public static <T> PageResponse<T> of(int pageSize, int pageIndex) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setData(Collections.emptyList());
        response.setTotalCount(0);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);

        return response;
    }

    public static <T> PageResponse<T> of(Collection<T> data, int totalCount, int pageSize, int pageIndex) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setData(data);
        response.setTotalCount(totalCount);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);
        return response;
    }

}
