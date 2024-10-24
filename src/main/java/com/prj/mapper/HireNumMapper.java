package com.prj.mapper;

import java.util.List;
import com.prj.domain.HireNum;

/**
 * 招人名额Mapper接口
 * 
 * @author author
 * @date 2022-11-15
 */
public interface HireNumMapper 
{
    /**
     * 查询招人名额
     * 
     * @param id 招人名额主键
     * @return 招人名额
     */
    public HireNum selectHireNumById(Long id);

    /**
     * 查询招人名额列表
     * 
     * @param hireNum 招人名额
     * @return 招人名额集合
     */
    public List<HireNum> selectHireNumList(HireNum hireNum);

    /**
     * 新增招人名额
     * 
     * @param hireNum 招人名额
     * @return 结果
     */
    public int insertHireNum(HireNum hireNum);

    /**
     * 修改招人名额
     * 
     * @param hireNum 招人名额
     * @return 结果
     */
    public int updateHireNum(HireNum hireNum);

    /**
     * 删除招人名额
     * 
     * @param id 招人名额主键
     * @return 结果
     */
    public int deleteHireNumById(Long id);

    /**
     * 批量删除招人名额
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHireNumByIds(Long[] ids);
}
