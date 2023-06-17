package com.wpz.ar.domain;

import lombok.Data;

@Data
public class ApplyRecord {
    private Station station;
    private Resume resume;
    private Integer id;

    private Integer resumeId;

    private Integer stationId;

    private Integer status;

    private String applyDate;

    private String meetingDatetime;

    private String meetingNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getMeetingDatetime() {
        return meetingDatetime;
    }

    public void setMeetingDatetime(String meetingDatetime) {
        this.meetingDatetime = meetingDatetime == null ? null : meetingDatetime.trim();
    }

    public String getMeetingNum() {
        return meetingNum;
    }

    public void setMeetingNum(String meetingNum) {
        this.meetingNum = meetingNum == null ? null : meetingNum.trim();
    }
}