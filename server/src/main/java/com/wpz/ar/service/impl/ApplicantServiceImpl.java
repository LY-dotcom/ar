package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Applicant;
import com.wpz.ar.domain.ApplicantExample;
import com.wpz.ar.mapper.ApplicantMapper;
import com.wpz.ar.service.ApplicantService;
import com.wpz.ar.util.ARUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 18:46
 */
@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantMapper applicantMapper;

    @Override
    public Applicant login(Applicant applicant) {
        applicant.setPassword(ARUtil.getMD5(applicant.getPassword()));
        ApplicantExample applicantExample = new ApplicantExample();
        applicantExample.createCriteria().andUsernameEqualTo(applicant.getUsername())
                .andPasswordEqualTo(applicant.getPassword());
        List<Applicant> list = applicantMapper.selectByExample(applicantExample);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public void register(Applicant applicant) {
        applicant.setPassword(ARUtil.getMD5(applicant.getPassword()));
        applicantMapper.insert(applicant);
    }

    @Override
    public Applicant getApplicant(Applicant applicant) {
        return applicantMapper.selectByPrimaryKey(applicant.getId());
    }

    @Override
    public void update(Applicant applicant) {
        applicant.setPassword(ARUtil.getMD5(applicant.getPassword()));
        applicantMapper.updateByPrimaryKeySelective(applicant);
    }

    @Override
    public PageInfo<Applicant> getApplicants(Applicant applicant) {
        ApplicantExample example = new ApplicantExample();
        ApplicantExample.Criteria criteria = example.createCriteria();
        if (applicant.getUserStatus() != null)
             criteria.andUserStatusEqualTo(applicant.getUserStatus());
        if (!StringUtils.isEmpty(applicant.getUsername())) {
            criteria.andUsernameLike("%" + applicant.getUsername() + "%");
        }
        PageHelper.startPage(applicant.getPageNum(), applicant.getPageSize());
        List<Applicant> list = applicantMapper.selectByExample(example);

        return new PageInfo<>(list);
    }

    @Override
    public Boolean isExist(Applicant applicant) {
        ApplicantExample applicantExample = new ApplicantExample();
        ApplicantExample.Criteria criteria = applicantExample.createCriteria();
        criteria.andUsernameEqualTo(applicant.getUsername());
        List<Applicant> list = applicantMapper.selectByExample(applicantExample);
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }



}
