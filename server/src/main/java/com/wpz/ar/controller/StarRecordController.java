package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.StarRecord;
import com.wpz.ar.service.StarRecordService;
import com.wpz.ar.service.StationService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/4/4 18:29
 */
@RestController
@RequestMapping("/api/starRecord")
public class StarRecordController {

    @Autowired
    private StarRecordService starRecordService;

    @PostMapping("/add")
    public void add(@RequestBody StarRecord starRecord) {
        starRecordService.add(starRecord);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody StarRecord starRecord) {
        starRecordService.delete(starRecord);
    }

    @PostMapping("/getStarRecord")
    public R getStarRecord(@RequestBody StarRecord starRecord) {
        StarRecord r = starRecordService.getStarRecord(starRecord);
        return R.ok(r);
    }

    @PostMapping("/getStarRecords")
    public R getStarRecords(@RequestBody StarRecord starRecord) {
        PageInfo<StarRecord> pageInfo = starRecordService.getStarRecords(starRecord);
        return R.ok(pageInfo);
    }
}
