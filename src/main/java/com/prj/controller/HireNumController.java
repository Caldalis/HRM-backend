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
import com.prj.domain.HireNum;
import com.prj.service.IHireNumService;

@RestController
@RequestMapping("/hirenum")
public class HireNumController extends BaseController
{
    @Autowired
    private IHireNumService hireNumService;

    /**
     * 查询招人名额列表
     */
    @GetMapping("/list")
    public TableDataInfo list(HireNum hireNum)
    {
        startPage();
        List<HireNum> list = hireNumService.selectHireNumList(hireNum);
        return getDataByPage(list);
    }

    /**
     * 获取招人名额详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(hireNumService.selectHireNumById(id));
    }

    /**
     * 新增招人名额
     */
    @PostMapping
    public AjaxResult add(@RequestBody HireNum hireNum)
    {
        return toAjax(hireNumService.insertHireNum(hireNum));
    }

    /**
     * 修改招人名额
     */
    @PutMapping
    public AjaxResult edit(@RequestBody HireNum hireNum)
    {
        return toAjax(hireNumService.updateHireNum(hireNum));
    }

    /**
     * 删除招人名额
     */
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hireNumService.deleteHireNumByIds(ids));
    }
}
