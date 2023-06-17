package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Location;
import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationDto;
import com.wpz.ar.domain.StationType;
import com.wpz.ar.service.StationService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 21:57
 */
@RestController
@RequestMapping("/api/station")
public class StationController {

    @Autowired
    private StationService stationService;





    /**
     * 查询所有岗位
     * @return
     */
    @PostMapping("/getStations")
    public R getStations(@RequestBody StationDto stationDto) {
        PageInfo<Station> pageInfo = stationService.getStations(stationDto);
        return R.ok(pageInfo);
    }

    @PostMapping("/add")
    public R add(@RequestBody Station station) {
        stationService.add(station);
        return R.ok(null);
    }

    @PostMapping("/update")
    public R update(@RequestBody Station station) {
        stationService.update(station);
        return R.ok(null);
    }

    @PostMapping("/getStation")
    public R getStation(@RequestBody Station station) {
        Station result = stationService.getStation(station);
        return R.ok(result);
    }

    @PostMapping("/count")
    public R count(@RequestBody Station station) {
        int cnt = stationService.count(station);
        return R.ok(cnt);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Station station) {
        stationService.delete(station);
    }


}
