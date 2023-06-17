package com.wpz.ar.service.impl;

import com.wpz.ar.domain.ResumeDetail;
import com.wpz.ar.domain.ResumeDetailExample;
import com.wpz.ar.domain.StationType;
import com.wpz.ar.mapper.LocationMapper;
import com.wpz.ar.mapper.ResumeDetailMapper;
import com.wpz.ar.mapper.ResumeMapper;
import com.wpz.ar.mapper.StationTypeMapper;
import com.wpz.ar.service.ResumeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/4/3 19:54
 */
@Service
public class ResumeDetailServiceImpl implements ResumeDetailService {
    @Autowired
    private ResumeDetailMapper resumeDetailMapper;
    @Override
    public void add(ResumeDetail resumeDetail) {
        // 根据applicant_id查询，若有，则更新，没有则添加
        ResumeDetailExample example = new ResumeDetailExample();
        ResumeDetailExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantIdEqualTo(resumeDetail.getApplicantId());
        List<ResumeDetail> resumeDetails = resumeDetailMapper.selectByExample(example);
        if (resumeDetails.size() > 0) {
            resumeDetailMapper.updateByPrimaryKeySelective(resumeDetail);
        } else {
            resumeDetailMapper.insert(resumeDetail);
        }
    }

    @Autowired
    private StationTypeMapper stationTypeMapper;

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public ResumeDetail getResumeDetail(ResumeDetail resumeDetail) {
        ResumeDetailExample example = new ResumeDetailExample();
        ResumeDetailExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantIdEqualTo(resumeDetail.getApplicantId());
        List<ResumeDetail> list = resumeDetailMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        ResumeDetail res = list.get(0);
        res.setStationType(stationTypeMapper.selectByPrimaryKey(res.getStationTypeId()));
        res.setLocation(locationMapper.selectByPrimaryKey(res.getLocationId()));
        return res;
    }
}
