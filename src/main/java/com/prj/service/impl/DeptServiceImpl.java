package com.prj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prj.mapper.DeptMapper;
import com.prj.domain.Dept;
import com.prj.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept selectDeptById(Long id) {
        return deptMapper.selectDeptById(id);
    }

    @Override
    public List<Dept> selectDeptList(Dept dept) {
        return deptMapper.selectDeptList(dept);
    }

    @Override
    public int insertDept(Dept dept) {
        return deptMapper.insertDept(dept);
    }

    @Override
    public int updateDept(Dept dept) {
        return deptMapper.updateDept(dept);
    }

    @Override
    public int deleteDeptByIds(Long[] ids) {
        return deptMapper.deleteDeptByIds(ids);
    }

    @Override
    public int deleteDeptById(Long id) {
        return deptMapper.deleteDeptById(id);
    }
}
