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
import com.prj.domain.Dept;
import com.prj.service.IDeptService;

@RestController
@RequestMapping("/dept_info")
public class DeptController extends BaseController {
    @Autowired
    private IDeptService deptService;

    /**
     * 查询部门信息管理列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Dept dept) {
        startPage();
        List<Dept> list = deptService.selectDeptList(dept);
        return getDataByPage(list);
    }

    /**
     * 获取部门信息管理详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(deptService.selectDeptById(id));
    }

    /**
     * 新增部门信息管理
     */
    @PostMapping
    public AjaxResult add(@RequestBody Dept dept) {
        return toAjax(deptService.insertDept(dept));
    }

    /**
     * 修改部门信息管理
     */
    @PutMapping
    public AjaxResult edit(@RequestBody Dept dept) {
        return toAjax(deptService.updateDept(dept));
    }

    /**
     * 删除部门信息管理
     */
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(deptService.deleteDeptByIds(ids));
    }
}
