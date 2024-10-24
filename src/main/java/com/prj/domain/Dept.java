package com.prj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Dept {
    private static final long serialVersionUID = 1L;

    /**
     * 部门编号
     */
    private Long id;

    /**
     * 部门名
     */
    private String name;

    /**
     * 部门经理
     */
    private String manager;

    /**
     * 汇报对象
     */
    private String reportto;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setReportto(String reportto) {
        this.reportto = reportto;
    }

    public String getReportto() {
        return reportto;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("manager", getManager())
                .append("reportto", getReportto())
                .toString();
    }
}
