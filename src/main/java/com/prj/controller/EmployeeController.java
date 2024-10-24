package com.prj.controller;

import java.util.List;

import com.prj.common.core.controller.BaseController;
import com.prj.common.core.domain.AjaxResult;
import com.prj.common.core.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prj.domain.Employee;
import com.prj.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseController {
    @Autowired
    private IEmployeeService employeeService;

    /**
     * 查询员工信息管理列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Employee employee) {
        startPage();
        List<Employee> list = employeeService.selectEmployeeList(employee);
        return getDataByPage(list);
    }

    /**
     * 获取员工信息管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(employeeService.selectEmployeeById(id));
    }

    /**
     * 新增员工信息管理
     */
    @PostMapping
    public AjaxResult add(@RequestBody Employee employee) {
        return toAjax(employeeService.insertEmployee(employee));
    }

    /**
     * 修改员工信息管理
     */
    @PutMapping
    @Transactional(timeout = 20, readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public AjaxResult edit(@RequestBody Employee employee) {
        //其它针对数据库的操作
        return toAjax(employeeService.updateEmployee(employee));
    }

    /**
     * 删除员工信息管理
     */
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(employeeService.deleteEmployeeByIds(ids));
    }
}
