package com.prj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class EmployeeKpi
{
    private static final long serialVersionUID = 1L;

    /** 员工编号 */
    private Long id;

    /** 考评结果 */
    private String kpi;

    /** 奖金 */
    private String bonus;

    /** 考评人 */
    private String manager;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKpi(String kpi) 
    {
        this.kpi = kpi;
    }

    public String getKpi() 
    {
        return kpi;
    }
    public void setBonus(String bonus) 
    {
        this.bonus = bonus;
    }

    public String getBonus() 
    {
        return bonus;
    }
    public void setManager(String manager) 
    {
        this.manager = manager;
    }

    public String getManager() 
    {
        return manager;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kpi", getKpi())
            .append("bonus", getBonus())
            .append("manager", getManager())
            .toString();
    }
}
