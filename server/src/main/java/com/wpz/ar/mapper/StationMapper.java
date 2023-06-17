package com.wpz.ar.mapper;

import com.wpz.ar.domain.Station;
import com.wpz.ar.domain.StationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface StationMapper {
    int countByExample(StationExample example);

    int deleteByExample(StationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExampleWithBLOBs(StationExample example);

    List<Station> selectByExample(StationExample example);

    Station selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExampleWithBLOBs(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKeyWithBLOBs(Station record);

    int updateByPrimaryKey(Station record);
}