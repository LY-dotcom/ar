package com.wpz.ar.domain;

import lombok.Data;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/3 13:39
 */
@Data
public class ApplyRecordDto {

    private Integer stationId;

    private Integer pageNum;

    private Integer pageSize;

    private Integer applicantId;

    private Integer companyId;

    private Integer status;

    private String applyDate;
    // 求职者名字
    private String username;
    // 岗位名称
    private String title;

    private String education;
}
