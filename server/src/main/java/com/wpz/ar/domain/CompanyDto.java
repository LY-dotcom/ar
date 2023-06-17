package com.wpz.ar.domain;

import lombok.Data;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/27 18:30
 */
@Data
public class CompanyDto {
private Integer locationId;
    private Integer pageNum;
    private Integer pageSize;
    private String title;
    private Integer status;
    private Integer userStatus;
    private String username;
}
