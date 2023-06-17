package com.wpz.ar.mapper;

import com.wpz.ar.domain.StationType;
import com.wpz.ar.domain.StationTypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface StationTypeMapper {
    int countByExample(StationTypeExample example);

    int deleteByExample(StationTypeExample example);

    int deleteByPrimaryKey(Integer value);

    int insert(StationType record);

    int insertSelective(StationType record);

    List<StationType> selectByExample(StationTypeExample example);

    StationType selectByPrimaryKey(Integer value);

    int updateByExampleSelective(@Param("record") StationType record, @Param("example") StationTypeExample example);

    int updateByExample(@Param("record") StationType record, @Param("example") StationTypeExample example);

    int updateByPrimaryKeySelective(StationType record);

    int updateByPrimaryKey(StationType record);
}