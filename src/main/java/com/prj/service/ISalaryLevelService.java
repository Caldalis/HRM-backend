package com.prj.service;

import java.util.List;
import com.prj.domain.SalaryLevel;

public interface ISalaryLevelService
{
    public SalaryLevel selectSalaryLevelById(Long id);

    public List<SalaryLevel> selectSalaryLevelList(SalaryLevel salaryLevel);

    public int insertSalaryLevel(SalaryLevel salaryLevel);

    public int updateSalaryLevel(SalaryLevel salaryLevel);

    public int deleteSalaryLevelByIds(Long[] ids);

    public int deleteSalaryLevelById(Long id);
}
