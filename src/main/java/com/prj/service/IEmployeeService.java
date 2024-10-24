package com.prj.service;

import java.util.List;

import com.prj.domain.Employee;

public interface IEmployeeService {
    public Employee selectEmployeeById(Long id);

    public List<Employee> selectEmployeeList(Employee employee);

    public int insertEmployee(Employee employee);

    public int updateEmployee(Employee employee);

    public int deleteEmployeeByIds(Long[] ids);

    public int deleteEmployeeById(Long id);
}
