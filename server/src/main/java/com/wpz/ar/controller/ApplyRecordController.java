package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.ApplyRecord;
import com.wpz.ar.domain.ApplyRecordDto;
import com.wpz.ar.domain.ApplyRecordExample;
import com.wpz.ar.service.ApplyRecordService;
import com.wpz.ar.util.ARConstant;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/3 10:47
 */
@RestController
@RequestMapping("/api/applyRecord")
public class ApplyRecordController {
    @Autowired
    private ApplyRecordService applyRecordService;

    @PostMapping("/add")
    public R add(@RequestBody ApplyRecord applyRecord) {
        applyRecordService.add(applyRecord);
        return R.ok(null);
    }

    @PostMapping("/getApplyRecords")
    public R getApplyRecord(@RequestBody ApplyRecordDto applyRecordDto) {
        PageInfo<ApplyRecord> pageInfo = applyRecordService.getApplyRecords(applyRecordDto);
        return R.ok(pageInfo);
    }

    @PostMapping("/update")
    public R update(@RequestBody ApplyRecord applyRecord) {
        applyRecordService.update(applyRecord);
        return R.ok(null);
    }
}
