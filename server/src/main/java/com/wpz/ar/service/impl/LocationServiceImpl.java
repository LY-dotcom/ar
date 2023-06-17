package com.wpz.ar.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.*;
import com.wpz.ar.mapper.LocationMapper;
import com.wpz.ar.mapper.StationMapper;
import com.wpz.ar.mapper.StationTypeMapper;
import com.wpz.ar.service.LocationService;
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
public class LocationServiceImpl implements LocationService {


    @Autowired
    private LocationMapper locationMapper;




    @Override
    public List<Location> getLocations() {
        List<Location> list = locationMapper.selectByExample(null);
        Map<Integer, Location> map = new HashMap<>();
        for (Location location : list) {
            map.put(location.getValue(), location);
        }
        for (Location location : map.values()) {
            Location parent = map.get(location.getPid());
            if (parent != null) {
                if (parent.getChildren() == null)
                    parent.setChildren(new ArrayList<>());
                parent.getChildren().add(location);
            }
        }
        List<Location> result = new ArrayList<>();
        for (Location location : list) {
            if (location.getPid() == null) {
                result.add(location);
            }
        }
        return result;
    }


}
