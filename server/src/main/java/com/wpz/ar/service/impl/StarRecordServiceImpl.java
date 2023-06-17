package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.StarRecord;
import com.wpz.ar.domain.StarRecordExample;
import com.wpz.ar.domain.Station;
import com.wpz.ar.mapper.StarRecordMapper;
import com.wpz.ar.service.StarRecordService;
import com.wpz.ar.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/4/4 18:19
 */
@Service
public class StarRecordServiceImpl implements StarRecordService {
    @Autowired
    private StarRecordMapper starRecordMapper;

    public void add(StarRecord starRecord) {
        starRecordMapper.insert(starRecord);
    }

    public void delete(StarRecord starRecord) {
        StarRecordExample example = new StarRecordExample();
        StarRecordExample.Criteria criteria = example.createCriteria();
        if (starRecord.getApplicantId() != null)
            criteria.andApplicantIdEqualTo(starRecord.getApplicantId());
        if (starRecord.getStationId() != null) {
            criteria.andStationIdEqualTo(starRecord.getStationId());
        }
        starRecordMapper.deleteByExample(example);
    }

    public StarRecord getStarRecord(StarRecord starRecord) {
        StarRecordExample example = new StarRecordExample();
        StarRecordExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantIdEqualTo(starRecord.getApplicantId())
                .andStationIdEqualTo(starRecord.getStationId());
        List<StarRecord> list = starRecordMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
    @Autowired
    private StationService stationService;

    public PageInfo<StarRecord> getStarRecords(StarRecord starRecord) {
        StarRecordExample example = new StarRecordExample();
        StarRecordExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantIdEqualTo(starRecord.getApplicantId());
        PageHelper.startPage(starRecord.getPageNum(), starRecord.getPageSize());
        List<StarRecord> list = starRecordMapper.selectByExample(example);
        for (StarRecord record : list) {
            Station station = new Station();
            station.setId(record.getStationId());
            record.setStation(stationService.getStation(station));
        }
        return new PageInfo<>(list);
    }

}
