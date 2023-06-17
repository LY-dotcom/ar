package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.*;
import com.wpz.ar.mapper.ApplicantMapper;
import com.wpz.ar.mapper.ApplyRecordMapper;
import com.wpz.ar.mapper.ResumeMapper;
import com.wpz.ar.service.ApplicantService;
import com.wpz.ar.service.ApplyRecordService;
import com.wpz.ar.service.ResumeService;
import com.wpz.ar.service.StationService;
import com.wpz.ar.util.ARConstant;
import org.apache.log4j.helpers.DateTimeDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/3 10:46
 */
@Service
public class ApplyRecordServiceImpl implements ApplyRecordService {
    @Autowired
    private ApplyRecordMapper applyRecordMapper;


    @Autowired
    private StationService stationService;


    @Autowired
    private ResumeService resumeService;

    @Override
    public void add(ApplyRecord applyRecord) {
        applyRecord.setApplyDate(applyRecord.getApplyDate().substring(0, 10));
        applyRecordMapper.insert(applyRecord);

    }

    @Override
    public PageInfo<ApplyRecord> getApplyRecords(ApplyRecordDto applyRecordDto) {
        PageHelper.startPage(applyRecordDto.getPageNum(), applyRecordDto.getPageSize());
        PageHelper.clearPage();
        List<ApplyRecord> list = applyRecordMapper.getApplyRecords(applyRecordDto);
        for (ApplyRecord applyRecord : list) {
            Resume resume = new Resume();
            resume.setId(applyRecord.getResumeId());
            applyRecord.setResume(resumeService.getResume(resume));

            Station station = new Station();
            station.setId(applyRecord.getStationId());
            applyRecord.setStation(stationService.getStation(station));
        }
        PageInfo<ApplyRecord> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void update(ApplyRecord applyRecord) {
        applyRecordMapper.updateByPrimaryKeySelective(applyRecord);
    }

    @Override
    public void delete(Integer stationId) {
        ApplyRecordExample example = new ApplyRecordExample();
        ApplyRecordExample.Criteria criteria = example.createCriteria();
        criteria.andStationIdEqualTo(stationId);
        applyRecordMapper.deleteByExample(example);
    }


}
