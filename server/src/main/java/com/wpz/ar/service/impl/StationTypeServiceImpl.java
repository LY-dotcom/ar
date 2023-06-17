package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.*;
import com.wpz.ar.mapper.LocationMapper;
import com.wpz.ar.mapper.StationMapper;
import com.wpz.ar.mapper.StationTypeMapper;
import com.wpz.ar.service.StationService;
import com.wpz.ar.service.StationTypeService;
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
public class StationTypeServiceImpl implements StationTypeService {
    @Autowired
    private StationTypeMapper stationTypeMapper;


    @Override
    public List<StationType> getStationTypes() {
        List<StationType> list = stationTypeMapper.selectByExample(null);
        Map<Integer, StationType> map = new HashMap<>();
        for (StationType stationType : list) {
            map.put(stationType.getValue(), stationType);
        }
        for (StationType stationType : map.values()) {
            StationType parent = map.get(stationType.getPid());
            if (parent != null) {
                if (parent.getChildren() == null)
                    parent.setChildren(new ArrayList<>());
                parent.getChildren().add(stationType);
            }
        }
        List<StationType> result = new ArrayList<>();
        for (StationType stationType : list) {
            if (stationType.getPid() == null) {
                result.add(stationType);
            }
        }
        return result;
    }


}
