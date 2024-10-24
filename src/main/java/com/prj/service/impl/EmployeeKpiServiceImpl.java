package com.prj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prj.mapper.EmployeeKpiMapper;
import com.prj.domain.EmployeeKpi;
import com.prj.service.IEmployeeKpiService;

@Service
public class EmployeeKpiServiceImpl implements IEmployeeKpiService {
    @Autowired
    private EmployeeKpiMapper employeeKpiMapper;

    @Override
    public EmployeeKpi selectEmployeeKpiById(Long id) {
        return employeeKpiMapper.selectEmployeeKpiById(id);
    }

    @Override
    public List<EmployeeKpi> selectEmployeeKpiList(EmployeeKpi employeeKpi) {
        return employeeKpiMapper.selectEmployeeKpiList(employeeKpi);
    }

    @Override
    public int insertEmployeeKpi(EmployeeKpi employeeKpi) {
        return employeeKpiMapper.insertEmployeeKpi(employeeKpi);
    }

    @Override
    public int updateEmployeeKpi(EmployeeKpi employeeKpi) {
        return employeeKpiMapper.updateEmployeeKpi(employeeKpi);
    }

    @Override
    public int deleteEmployeeKpiByIds(Long[] ids) {
        return employeeKpiMapper.deleteEmployeeKpiByIds(ids);
    }

    @Override
    public int deleteEmployeeKpiById(Long id) {
        return employeeKpiMapper.deleteEmployeeKpiById(id);
    }
}
