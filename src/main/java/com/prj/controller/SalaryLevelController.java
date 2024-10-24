package com.prj.controller;

import java.util.List;

import com.prj.common.core.controller.BaseController;
import com.prj.common.core.domain.AjaxResult;
import com.prj.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prj.domain.SalaryLevel;
import com.prj.service.ISalaryLevelService;

@RestController
@RequestMapping("/salary_level")
public class SalaryLevelController extends BaseController
{
    @Autowired
    private ISalaryLevelService salaryLevelService;

    /**
     * 查询薪资标准管理列表
     */
    @GetMapping("/list")
    public TableDataInfo list(SalaryLevel salaryLevel)
    {
        startPage();
        List<SalaryLevel> list = salaryLevelService.selectSalaryLevelList(salaryLevel);
        return getDataByPage(list);
    }


    /**
     * 获取薪资标准管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(salaryLevelService.selectSalaryLevelById(id));
    }

    /**
     * 新增薪资标准管理
     */
    @PostMapping
    public AjaxResult add(@RequestBody SalaryLevel salaryLevel)
    {
        return toAjax(salaryLevelService.insertSalaryLevel(salaryLevel));
    }

    /**
     * 修改薪资标准管理
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SalaryLevel salaryLevel)
    {
        return toAjax(salaryLevelService.updateSalaryLevel(salaryLevel));
    }

    /**
     * 删除薪资标准管理
     */
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(salaryLevelService.deleteSalaryLevelByIds(ids));
    }
}
