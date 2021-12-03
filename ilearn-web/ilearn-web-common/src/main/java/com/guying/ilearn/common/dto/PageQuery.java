/*
 * 修改说明：
 * ==============   ===============     =================================
 *      操作          用户                  日期
 * ==============   ===============     =================================
 *      新增          CODE POTER          2021-11-28 22:51 星期日
 * ==============   ===============     =================================
 */
package com.guying.ilearn.common.dto;

/**
 * 描述：Page Query Param
 *
 * @author CODE POTER
 * @version 1.0
 * @date 2021-11-28 22:51 星期日
 */
public abstract class PageQuery extends Query {

    /**
     * 排序类型：升序
     */
    public static final String ORDER_ASC = "ASC";

    /**
     * 排序类型：降序
     */
    public static final String ORDER_DESC = "DESC";

    /**
     * 默认每页数量
     */
    private static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 最小页面值
     */
    private static final int MIN_PAGE_INDEX = 1;

    /**
     * 每页数量设置，初始化为默认页数量
     */
    private int pageSize = DEFAULT_PAGE_SIZE;

    /**
     * 当前页，初始化为初始页
     */
    private int pageIndex = MIN_PAGE_INDEX;

    /**
     * 以某一字段排序
     */
    private String orderBy;

    /**
     * 排序类型，默认降序
     */
    private String orderDirection = ORDER_DESC;

    /**
     * 以某一字段分组
     */
    private String groupBy;

    /**
     * 是否需要返回总数量
     * true：需要
     * false：不需要
     */
    private boolean needTotalCount = true;

    public int getPageIndex() {
        return Math.max(pageIndex, MIN_PAGE_INDEX);
    }

    public PageQuery setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public int getPageSize() {
        return pageSize < 1 ? DEFAULT_PAGE_SIZE : pageSize;
    }

    public PageQuery setPageSize(int pageSize) {
        this.pageSize = pageSize < 1 ? DEFAULT_PAGE_SIZE : pageSize;
        return this;
    }

    public int getOffset() {
        return (getPageIndex() - 1) * getPageSize();
    }

    public String getOrderBy() {
        return orderBy;
    }

    public PageQuery setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public PageQuery setOrderDirection(String orderDirection) {
        if (ORDER_ASC.equalsIgnoreCase(orderDirection) || ORDER_DESC.equalsIgnoreCase(orderDirection)) {
            this.orderDirection = orderDirection;
        }
        return this;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    public boolean isNeedTotalCount() {
        return needTotalCount;
    }

    public PageQuery setNeedTotalCount(boolean needTotalCount) {
        this.needTotalCount = needTotalCount;
        return this;
    }
}
