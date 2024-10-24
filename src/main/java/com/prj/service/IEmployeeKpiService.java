package com.prj.service;

import java.util.List;
import com.prj.domain.EmployeeKpi;

public interface IEmployeeKpiService
{
    public EmployeeKpi selectEmployeeKpiById(Long id);

    public List<EmployeeKpi> selectEmployeeKpiList(EmployeeKpi employeeKpi);

    public int insertEmployeeKpi(EmployeeKpi employeeKpi);

    public int updateEmployeeKpi(EmployeeKpi employeeKpi);

    public int deleteEmployeeKpiByIds(Long[] ids);

    public int deleteEmployeeKpiById(Long id);
}
