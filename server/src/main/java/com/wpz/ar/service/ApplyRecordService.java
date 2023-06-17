package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.ApplyRecord;
import com.wpz.ar.domain.ApplyRecordDto;
import com.wpz.ar.util.ARConstant;

public interface ApplyRecordService {
    void add(ApplyRecord applyRecord);

    PageInfo<ApplyRecord> getApplyRecords(ApplyRecordDto applyRecordDto);


    void update(ApplyRecord applyRecord);

    void delete(Integer stationId);
}
