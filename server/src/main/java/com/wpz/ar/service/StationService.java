package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Location;
import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationDto;
import com.wpz.ar.domain.StationType;

import java.util.List;

public interface StationService {

    PageInfo<Station> getStations(StationDto stationDto);

    void add(Station station);

    Station getStation(Station station);

    void update(Station station);

    int count(Station station);

    void delete(Station station);
}
