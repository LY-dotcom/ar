package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Location;
import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationDto;
import com.wpz.ar.domain.StationType;

import java.util.List;

public interface StationTypeService {
    List<StationType> getStationTypes();

}
