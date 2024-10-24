package com.prj.mapper;

import java.util.List;
import com.prj.domain.Dept;


public interface DeptMapper 
{
    /**
     * 查询部门信息管理
     * 
     * @param id 部门信息管理主键
     * @return 部门信息管理
     */
    public Dept selectDeptById(Long id);

    /**
     * 查询部门信息管理列表
     * 
     * @param dept 部门信息管理
     * @return 部门信息管理集合
     */
    public List<Dept> selectDeptList(Dept dept);

    /**
     * 新增部门信息管理
     * 
     * @param dept 部门信息管理
     * @return 结果
     */
    public int insertDept(Dept dept);

    /**
     * 修改部门信息管理
     * 
     * @param dept 部门信息管理
     * @return 结果
     */
    public int updateDept(Dept dept);

    /**
     * 删除部门信息管理
     * 
     * @param id 部门信息管理主键
     * @return 结果
     */
    public int deleteDeptById(Long id);

    /**
     * 批量删除部门信息管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDeptByIds(Long[] ids);
}
