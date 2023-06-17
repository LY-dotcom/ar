package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Location;
import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationDto;
import com.wpz.ar.domain.StationType;
import com.wpz.ar.service.StationService;
import com.wpz.ar.service.StationTypeService;
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
@RequestMapping("/api/stationType")
public class StationTypeController {

    @Autowired
    private StationTypeService stationTypeService;

    /**
     * 查询所有岗位类型
     * @return
     */
    @GetMapping("/getStationTypes")
    public R getStationTypes() {
        List<StationType> list = stationTypeService.getStationTypes();
        return R.ok(list);
    }



}
