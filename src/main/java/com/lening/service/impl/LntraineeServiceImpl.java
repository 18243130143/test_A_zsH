package com.lening.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lening.entity.LncoachBean;
import com.lening.entity.LntraineeBean;
import com.lening.entity.SubjectBean;
import com.lening.mapper.LncoachMapper;
import com.lening.mapper.LntraineeMapper;
import com.lening.mapper.SubjectMapper;
import com.lening.service.LntraineeService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LntraineeServiceImpl implements LntraineeService {

    @Resource
    private LntraineeMapper lntraineeMapper;
    @Resource
    private LncoachMapper lncoachMapper;
    @Resource
    private SubjectMapper subjectMapper;

    @Override
    public PageInfo<LntraineeBean> findAllConnAndPage(LntraineeBean searchEntity, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Example example = new Example(LntraineeBean.class);
        Example.Criteria criteria = example.createCriteria();

        if(searchEntity!=null){
            if(!StringUtils.isEmpty(searchEntity.getNname())){
                criteria.andLike("nname", "%"+searchEntity.getNname()+"%");
            }
        }

        List<LntraineeBean> list = lntraineeMapper.selectByExample(example);

        for(LntraineeBean LntraineeBean:list){
            if(LntraineeBean.getTisid()!=null){
                SubjectBean subjectBean = subjectMapper.selectByPrimaryKey(LntraineeBean.getTisid());
                LntraineeBean.setSubjectBean(subjectBean);
            }
            if(LntraineeBean.getTicid()!=null){
                LncoachBean lncoachBean = lncoachMapper.selectByPrimaryKey(LntraineeBean.getTicid());
                LntraineeBean.setLncoachBean(lncoachBean);
            }
        }

        PageInfo<LntraineeBean> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


}
