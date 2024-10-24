package com.prj.domain;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SalaryLevel
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 职位类型 */
    private String jobType;

    /** 薪资水平 */
    private BigDecimal salary;

    /** 上下幅度 */
    private BigDecimal salaryrange;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setJobType(String jobType) 
    {
        this.jobType = jobType;
    }

    public String getJobType() 
    {
        return jobType;
    }
    public void setSalary(BigDecimal salary) 
    {
        this.salary = salary;
    }

    public BigDecimal getSalary() 
    {
        return salary;
    }
    public void setSalaryrange(BigDecimal salaryrange) 
    {
        this.salaryrange = salaryrange;
    }

    public BigDecimal getSalaryrange() 
    {
        return salaryrange;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("jobType", getJobType())
            .append("salary", getSalary())
            .append("salaryrange", getSalaryrange())
            .toString();
    }
}
