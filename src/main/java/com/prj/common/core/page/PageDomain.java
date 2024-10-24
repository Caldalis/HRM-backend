package com.prj.common.core.page;

import org.apache.commons.lang3.StringUtils;

public class PageDomain
{
    // 起始索引
    private Integer pageNum;

    //每页显示数量
    private Integer pageSize;

    // 排序列
    private String orderByColumn;

    //排序方式 "desc" 或者 "asc"
    private String isAsc = "asc";

    public String getOrderBy()
    {
        if (StringUtils.isEmpty(orderByColumn))
        {
            return "";
        }
        return orderByColumn + " " + isAsc;
    }

    public Integer getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(Integer pageNum)
    {
        this.pageNum = pageNum;
    }

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn()
    {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn)
    {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc()
    {
        return isAsc;
    }

    public void setIsAsc(String isAsc)
    {
        if ("ascending".equals(isAsc))
        {
            isAsc = "asc";
        }
        else
        {
            isAsc = "desc";
        }
        this.isAsc = isAsc;
    }
}
