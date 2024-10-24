package com.prj.mapper;
import java.util.List;
import com.prj.domain.SalaryLevel;
public interface SalaryLevelMapper
{
    //根据id查询薪资信息
    public SalaryLevel selectSalaryLevelById(Long id);
    //根据参数查询薪资信息
    public List<SalaryLevel> selectSalaryLevelList(SalaryLevel salaryLevel);
    //插入薪资信息
    public int insertSalaryLevel(SalaryLevel salaryLevel);
    //更新薪资信息
    public int updateSalaryLevel(SalaryLevel salaryLevel);
    //删除指定id的薪资信息
    public int deleteSalaryLevelById(Long id);
    //删除指定id列表的薪资信息
    public int deleteSalaryLevelByIds(Long[] ids);
}
