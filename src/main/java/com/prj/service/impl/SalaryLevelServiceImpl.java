package com.prj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prj.mapper.SalaryLevelMapper;
import com.prj.domain.SalaryLevel;
import com.prj.service.ISalaryLevelService;

@Service
public class SalaryLevelServiceImpl implements ISalaryLevelService 
{
    @Autowired
    private SalaryLevelMapper salaryLevelMapper;

    @Override
    public SalaryLevel selectSalaryLevelById(Long id)
    {
        return salaryLevelMapper.selectSalaryLevelById(id);
    }

    @Override
    public List<SalaryLevel> selectSalaryLevelList(SalaryLevel salaryLevel)
    {
        return salaryLevelMapper.selectSalaryLevelList(salaryLevel);
    }

    @Override
    public int insertSalaryLevel(SalaryLevel salaryLevel)
    {
        return salaryLevelMapper.insertSalaryLevel(salaryLevel);
    }

    @Override
    public int updateSalaryLevel(SalaryLevel salaryLevel)
    {
        return salaryLevelMapper.updateSalaryLevel(salaryLevel);
    }

    @Override
    public int deleteSalaryLevelByIds(Long[] ids)
    {
        return salaryLevelMapper.deleteSalaryLevelByIds(ids);
    }

    @Override
    public int deleteSalaryLevelById(Long id)
    {
        return salaryLevelMapper.deleteSalaryLevelById(id);
    }
}
