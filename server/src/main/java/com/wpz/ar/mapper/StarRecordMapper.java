package com.wpz.ar.mapper;

import com.wpz.ar.domain.StarRecord;
import com.wpz.ar.domain.StarRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface StarRecordMapper {
    int countByExample(StarRecordExample example);

    int deleteByExample(StarRecordExample example);

    int insert(StarRecord record);

    int insertSelective(StarRecord record);

    List<StarRecord> selectByExample(StarRecordExample example);

    int updateByExampleSelective(@Param("record") StarRecord record, @Param("example") StarRecordExample example);

    int updateByExample(@Param("record") StarRecord record, @Param("example") StarRecordExample example);
}