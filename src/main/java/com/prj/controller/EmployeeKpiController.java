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
import com.prj.domain.EmployeeKpi;
import com.prj.service.IEmployeeKpiService;


@RestController
@RequestMapping("/employee_kpi")
public class EmployeeKpiController extends BaseController
{
    @Autowired
    private IEmployeeKpiService employeeKpiService;

    /**
     * 查询员工评价管理列表
     */
    @GetMapping("/list")
    public TableDataInfo list(EmployeeKpi employeeKpi)
    {
        startPage();
        List<EmployeeKpi> list = employeeKpiService.selectEmployeeKpiList(employeeKpi);
        return getDataByPage(list);
    }

    /**
     * 获取员工评价管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(employeeKpiService.selectEmployeeKpiById(id));
    }

    /**
     * 新增员工评价管理
     */
    @PostMapping
    public AjaxResult add(@RequestBody EmployeeKpi employeeKpi)
    {
        return toAjax(employeeKpiService.insertEmployeeKpi(employeeKpi));
    }

    /**
     * 修改员工评价管理
     */
    @PutMapping
    public AjaxResult edit(@RequestBody EmployeeKpi employeeKpi)
    {
        return toAjax(employeeKpiService.updateEmployeeKpi(employeeKpi));
    }

    /**
     * 删除员工评价管理
     */
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(employeeKpiService.deleteEmployeeKpiByIds(ids));
    }
}
