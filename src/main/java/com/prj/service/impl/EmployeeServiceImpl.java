package com.prj.service.impl;

import java.util.List;

import com.prj.repo.EmployeeRedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prj.mapper.EmployeeMapper;
import com.prj.domain.Employee;
import com.prj.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeRedisDao employeeRedisDao;


    @Override
    public Employee selectEmployeeById(Long id) {
        Employee employee = employeeRedisDao.findByID(id.toString());
        if (employee != null) {
            return employee;
        } else {
            employee = employeeMapper.selectEmployeeById(id);
            employeeRedisDao.saveEmployee(id.toString(), 24 * 60 * 60, employee);
            return employee;
        }
    }

    @Override
    public List<Employee> selectEmployeeList(Employee employee) {
        return employeeMapper.selectEmployeeList(employee);
    }

    @Override
    public int insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        //在更新前，删除缓存中的数据
        employeeRedisDao.deleteByID(employee.getId().toString());
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployeeByIds(Long[] ids) {
        for (int cnt = 0; cnt < ids.length; cnt++) {
            employeeRedisDao.deleteByID(ids[cnt].toString());
        }

        return employeeMapper.deleteEmployeeByIds(ids);
    }

    @Override
    public int deleteEmployeeById(Long id) {
        //在删除数据前，删除缓存中的数据
        employeeRedisDao.deleteByID(id.toString());
        return employeeMapper.deleteEmployeeById(id);
    }
}
