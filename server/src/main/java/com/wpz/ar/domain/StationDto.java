package com.wpz.ar.domain;

import lombok.Data;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/17 00:16
 */
@Data
public class StationDto {

    private Integer pageNum;

    private Integer pageSize;

    private Integer stationTypeId;

    private Integer locationId;

    private String education;

    private Integer minSalary;

    private Integer maxSalary;

    private String type;

    private Integer status;

    private String title;

    private Integer companyId;
}
