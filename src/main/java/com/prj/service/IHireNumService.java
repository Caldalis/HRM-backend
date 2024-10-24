package com.prj.service;

import java.util.List;
import com.prj.domain.HireNum;

public interface IHireNumService
{
    public HireNum selectHireNumById(Long id);

    public List<HireNum> selectHireNumList(HireNum hireNum);

    public int insertHireNum(HireNum hireNum);

    public int updateHireNum(HireNum hireNum);

    public int deleteHireNumByIds(Long[] ids);

    public int deleteHireNumById(Long id);
}
