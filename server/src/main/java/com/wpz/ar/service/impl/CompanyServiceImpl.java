package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Company;
import com.wpz.ar.domain.CompanyDto;
import com.wpz.ar.domain.CompanyExample;
import com.wpz.ar.domain.StationExample;
import com.wpz.ar.mapper.CompanyMapper;
import com.wpz.ar.mapper.LocationMapper;
import com.wpz.ar.mapper.StationMapper;
import com.wpz.ar.service.CompanyService;
import com.wpz.ar.util.ARUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/27 09:34
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public Company register(Company company) {
        company.setStatus(0);
        company.setBuildDate(company.getBuildDate().substring(0, 10));
        company.setPassword(ARUtil.getMD5(company.getPassword()));
        companyMapper.insert(company);
        return company;
    }

    @Override
    public Company login(Company company) {
        company.setPassword(ARUtil.getMD5(company.getPassword()));
        CompanyExample example = new CompanyExample();
        example.createCriteria().andUsernameEqualTo(company.getUsername())
                        .andPasswordEqualTo(company.getPassword());
        List<Company> list = companyMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        Company result = list.get(0);
        result.setLocation(locationMapper.selectByPrimaryKey(result.getLocationId()));
        return result;
    }

    @Override
    public PageInfo<Company> getCompanys(CompanyDto companyDto) {
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(companyDto.getTitle())) {
            criteria.andTitleLike("%" + companyDto.getTitle() + "%");
        }
        if (!StringUtils.isEmpty(companyDto.getUsername())) {
            criteria.andUsernameLike("%" + companyDto.getUsername() + "%");
        }
        if (!StringUtils.isEmpty(companyDto.getTitle())) {
            criteria.andTitleLike("%" + companyDto.getTitle() + "%");
        }
        if (companyDto.getStatus() != null) {
            criteria.andStatusEqualTo(companyDto.getStatus());
        }

        if (companyDto.getLocationId() != null) {
            criteria.andLocationIdEqualTo(companyDto.getLocationId());
        }

        if (companyDto.getLocationId() != null) {
            criteria.andLocationIdEqualTo(companyDto.getLocationId());
        }

        if (companyDto.getUserStatus() != null) {
            criteria.andUserStatusEqualTo(companyDto.getUserStatus());
        }

        PageHelper.startPage(companyDto.getPageNum(), companyDto.getPageSize());
        List<Company> list = companyMapper.selectByExample(example);
        for (Company company : list) {
            company.setLocation(locationMapper.selectByPrimaryKey(company.getLocationId()));
            StationExample stationExample = new StationExample();
            StationExample.Criteria stationCriteria = stationExample.createCriteria();
            stationCriteria.andCompanyIdEqualTo(company.getId());
            company.setStationCount(stationMapper.countByExample(stationExample));
        }
        PageInfo<Company> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void update(Company company) {
        if (company.getBuildDate() != null)
            company.setBuildDate(company.getBuildDate().substring(0, 10));
        companyMapper.updateByPrimaryKeySelective(company);
    }

    @Autowired
    private StationMapper stationMapper;
    @Override
    public Company getCompany(Company company) {
        Company result = companyMapper.selectByPrimaryKey(company.getId());
        result.setLocation(locationMapper.selectByPrimaryKey(result.getLocationId()));
        StationExample example = new StationExample();
        StationExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(result.getId());
        result.setStationCount(stationMapper.countByExample(example));
        return result;
    }

    @Override
    public int count(Company company) {
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        if (company.getStatus() != null) {
            criteria.andStatusEqualTo(company.getStatus());
        }
        int i = companyMapper.countByExample(example);
        return i;
    }

    @Override
    public Boolean isExist(Company company) {
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(company.getUsername());
        List<Company> list = companyMapper.selectByExample(example);
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
