
package com.lening.controller;

import com.github.pagehelper.PageInfo;
import com.lening.entity.LntraineeBean;
import com.lening.service.LntraineeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/lntrainee")
public class LntraineeController {

    @Resource
    private LntraineeService lntraineeService;

    @RequestMapping("/findAllConnAndPage")
    public PageInfo<LntraineeBean> findAllConnAndPage(@RequestBody LntraineeBean searchEntity,
                                              @RequestParam(defaultValue = "1") Integer pageNum,
                                              @RequestParam(defaultValue = "3") Integer pageSize){
        return lntraineeService.findAllConnAndPage(searchEntity,pageNum,pageSize);
    }

}
