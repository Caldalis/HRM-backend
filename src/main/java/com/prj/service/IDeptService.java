package com.prj.service;

import java.util.List;
import com.prj.domain.Dept;

public interface IDeptService
{
    public Dept selectDeptById(Long id);

    public List<Dept> selectDeptList(Dept dept);

    public int insertDept(Dept dept);

    public int updateDept(Dept dept);

    public int deleteDeptByIds(Long[] ids);

    public int deleteDeptById(Long id);
}
