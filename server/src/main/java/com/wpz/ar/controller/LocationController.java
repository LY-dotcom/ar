package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Location;
import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationDto;
import com.wpz.ar.domain.StationType;
import com.wpz.ar.service.LocationService;
import com.wpz.ar.service.StationService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 21:57
 */
@RestController
@RequestMapping("/api/location")
public class LocationController {

    @Autowired
    private LocationService locationService;


    /**
     * 查询所有地区
     * @return
     */
    @GetMapping("/getLocations")
    public R getLocations() {
        List<Location> list = locationService.getLocations();
        return R.ok(list);
    }


}
