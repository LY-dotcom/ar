package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.StarRecord;
import com.wpz.ar.util.R;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/4/4 18:18
 */
public interface StarRecordService {
     void add(@RequestBody StarRecord starRecord);

    void delete(@RequestBody StarRecord starRecord);

    StarRecord getStarRecord(StarRecord starRecord);

    PageInfo<StarRecord> getStarRecords(StarRecord starRecord);


}
