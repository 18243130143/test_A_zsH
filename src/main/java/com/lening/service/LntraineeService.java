package com.lening.service;

import com.github.pagehelper.PageInfo;
import com.lening.entity.LncoachBean;
import com.lening.entity.LntraineeBean;

public interface LntraineeService {
    PageInfo<LntraineeBean> findAllConnAndPage(LntraineeBean searchEntity, Integer pageNum, Integer pageSize);
}
