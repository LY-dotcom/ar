package com.wpz.ar.domain;

import lombok.Data;

import java.util.List;
@Data
public class Location {
    private Integer value;

    private String label;

    private Integer pid;

    private List<Location> children;
}