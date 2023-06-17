package com.wpz.ar.domain;

import lombok.Data;

@Data
public class StarRecord {

    private Integer pageNum;
    private Integer pageSize;
    private Integer applicantId;
    private Station station;

    private Integer stationId;

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }
}