package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.*;
import com.wpz.ar.mapper.*;
import com.wpz.ar.service.ApplyRecordService;
import com.wpz.ar.service.CompanyService;
import com.wpz.ar.service.StarRecordService;
import com.wpz.ar.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 21:58
 */
@Service
public class StationServiceImpl implements StationService {


    @Autowired
    private StationMapper stationMapper;
    @Autowired
    private LocationMapper locationMapper;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private StationTypeMapper stationTypeMapper;



    @Override
    public PageInfo<Station> getStations(StationDto stationDto) {
        StationExample stationExample = new StationExample();
        StationExample.Criteria criteria = stationExample.createCriteria();
        if (stationDto.getStatus() != null) {
            criteria.andStatusEqualTo(stationDto.getStatus());
        }
        if (stationDto.getCompanyId() != null) {
            criteria.andCompanyIdEqualTo(stationDto.getCompanyId());
        }
        if (!StringUtils.isEmpty(stationDto.getTitle())) {
            criteria.andTitleLike("%" + stationDto.getTitle() + "%");
        }
        if (stationDto.getStationTypeId() != null) {
            criteria.andStationTypeIdEqualTo(stationDto.getStationTypeId());
        }

        if (stationDto.getLocationId() != null) {
            criteria.andLocationIdEqualTo(stationDto.getLocationId());
        }
        // 薪资
        Integer maxSalary = stationDto.getMaxSalary();
        Integer minSalary = stationDto.getMinSalary();
        if (maxSalary != null && minSalary != null) {
            criteria.andMinSalaryLessThanOrEqualTo(maxSalary).andMaxSalaryGreaterThanOrEqualTo(minSalary);
        } else if (maxSalary != null) {
            criteria.andMinSalaryLessThanOrEqualTo(maxSalary).andMaxSalaryGreaterThanOrEqualTo(maxSalary);
        } else if (minSalary != null) {
            criteria.andMinSalaryLessThanOrEqualTo(minSalary).andMaxSalaryGreaterThanOrEqualTo(minSalary);
        }

        if (!StringUtils.isEmpty(stationDto.getType())) {
            criteria.andTypeEqualTo(stationDto.getType());
        }
        if (!StringUtils.isEmpty(stationDto.getEducation())) {
            criteria.andEducationEqualTo(stationDto.getEducation());
        }
        PageHelper.startPage(stationDto.getPageNum(), stationDto.getPageSize());
        List<Station> list = stationMapper.selectByExampleWithBLOBs(stationExample);
        for (Station station : list) {
            station.setLocation(locationMapper.selectByPrimaryKey(station.getLocationId()));
            Company company = new Company();
            company.setId(station.getCompanyId());
            station.setCompany(companyService.getCompany(company));
            station.setStationType(stationTypeMapper.selectByPrimaryKey(station.getStationTypeId()));
        }
        PageInfo<Station> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void add(Station station) {
        station.setAddDate(station.getAddDate().substring(0, 10));
        stationMapper.insertSelective(station);
    }
    @Override
    public Station getStation(Station station) {
        Station result = stationMapper.selectByPrimaryKey(station.getId());
        result.setLocation(locationMapper.selectByPrimaryKey(result.getLocationId()));
        Company company = new Company();
        company.setId(result.getCompanyId());
        result.setCompany(companyService.getCompany(company));
        result.setStationType(stationTypeMapper.selectByPrimaryKey(result.getStationTypeId()));
        return result;
    }

    @Override
    public void update(Station  station) {
        stationMapper.updateByPrimaryKeySelective(station);
    }

    @Override
    public int count(Station station) {
        StationExample stationExample = new StationExample();
        StationExample.Criteria criteria = stationExample.createCriteria();
        if (station.getStatus() != null) {
            criteria.andStatusEqualTo(station.getStatus());
        }
        int i = stationMapper.countByExample(stationExample);
        return i;
    }
    @Autowired
    private StarRecordMapper starRecordMapper;
    @Autowired
    private ApplyRecordMapper applyRecordMapper;
    @Override
    public void delete(Station station) {
        // 收藏记录删除
        StarRecordExample example = new StarRecordExample();
        StarRecordExample.Criteria criteria = example.createCriteria();
        criteria.andStationIdEqualTo(station.getId());
        starRecordMapper.deleteByExample(example);
        // 投递记录删除
        ApplyRecordExample example1 = new ApplyRecordExample();
        ApplyRecordExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andStationIdEqualTo(station.getId());
        applyRecordMapper.deleteByExample(example1);
        // 删除职位
        stationMapper.deleteByPrimaryKey(station.getId());
    }
}
