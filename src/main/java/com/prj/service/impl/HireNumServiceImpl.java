package com.prj.service.impl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.prj.repo.HirenumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import com.prj.mapper.HireNumMapper;
import com.prj.domain.HireNum;
import com.prj.service.IHireNumService;

@Service
public class HireNumServiceImpl implements IHireNumService {
    @Autowired
    //private HireNumMapper hireNumMapper; //原Mybatis代码
    private HirenumRepo hirenumRepo;

    @Override
    public HireNum selectHireNumById(Long id) {
        //return hireNumMapper.selectHireNumById(id);
        return hirenumRepo.findById(id).get();
    }

    @Override
    public List<HireNum> selectHireNumList(HireNum hireNum) {
        //return hireNumMapper.selectHireNumList(hireNum);
        Example<HireNum> example = Example.of(hireNum);
        return hirenumRepo.findAll(example);
    }

    @Override
    public int insertHireNum(HireNum hireNum) {
        //return hireNumMapper.insertHireNum(hireNum);
        hirenumRepo.save(hireNum);
        return 1;
    }

    @Override
    public int updateHireNum(HireNum hireNum) {
        //return hireNumMapper.updateHireNum(hireNum);
        hirenumRepo.save(hireNum);
        return 1;
    }

    @Override
    public int deleteHireNumByIds(Long[] ids) {
        //return hireNumMapper.deleteHireNumByIds(ids);
        hirenumRepo.deleteAllById(Arrays.asList(ids));
        return ids.length;
    }

    @Override
    public int deleteHireNumById(Long id) {
        //return hireNumMapper.deleteHireNumById(id);
        hirenumRepo.deleteById(id);
        return 1;
    }
}
