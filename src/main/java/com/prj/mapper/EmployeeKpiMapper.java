package com.prj.mapper;

import java.util.List;
import com.prj.domain.EmployeeKpi;

/**
 * 员工评价管理Mapper接口
 * 
 * @author author
 * @date 2022-11-16
 */
public interface EmployeeKpiMapper 
{
    /**
     * 查询员工评价管理
     * 
     * @param id 员工评价管理主键
     * @return 员工评价管理
     */
    public EmployeeKpi selectEmployeeKpiById(Long id);

    /**
     * 查询员工评价管理列表
     * 
     * @param employeeKpi 员工评价管理
     * @return 员工评价管理集合
     */
    public List<EmployeeKpi> selectEmployeeKpiList(EmployeeKpi employeeKpi);

    /**
     * 新增员工评价管理
     * 
     * @param employeeKpi 员工评价管理
     * @return 结果
     */
    public int insertEmployeeKpi(EmployeeKpi employeeKpi);

    /**
     * 修改员工评价管理
     * 
     * @param employeeKpi 员工评价管理
     * @return 结果
     */
    public int updateEmployeeKpi(EmployeeKpi employeeKpi);

    /**
     * 删除员工评价管理
     * 
     * @param id 员工评价管理主键
     * @return 结果
     */
    public int deleteEmployeeKpiById(Long id);

    /**
     * 批量删除员工评价管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEmployeeKpiByIds(Long[] ids);
}
