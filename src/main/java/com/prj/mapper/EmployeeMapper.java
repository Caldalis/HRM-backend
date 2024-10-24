package com.prj.mapper;

import java.util.List;

import com.prj.domain.Employee;

/**
 * 员工信息管理Mapper接口
 *
 * @author author
 * @date 2022-11-16
 */
public interface EmployeeMapper {
    /**
     * 查询员工信息管理
     *
     * @param id 员工信息管理主键
     * @return 员工信息管理
     */
    public Employee selectEmployeeById(Long id);

    /**
     * 查询员工信息管理列表
     *
     * @param employee 员工信息管理
     * @return 员工信息管理集合
     */
    public List<Employee> selectEmployeeList(Employee employee);

    /**
     * 新增员工信息管理
     *
     * @param employee 员工信息管理
     * @return 结果
     */
    public int insertEmployee(Employee employee);

    /**
     * 修改员工信息管理
     *
     * @param employee 员工信息管理
     * @return 结果
     */
    public int updateEmployee(Employee employee);

    /**
     * 删除员工信息管理
     *
     * @param id 员工信息管理主键
     * @return 结果
     */
    public int deleteEmployeeById(Long id);

    /**
     * 批量删除员工信息管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeByIds(Long[] ids);
}
