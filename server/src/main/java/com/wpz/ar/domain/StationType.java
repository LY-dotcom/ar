package com.wpz.ar.domain;

import lombok.Data;

import java.util.List;

@Data
public class StationType {
    private Integer value;

    private String label;

    private Integer pid;

    private List<StationType> children;


}