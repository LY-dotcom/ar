package com.wpz.ar.mapper;

import com.wpz.ar.domain.ApplyRecord;
import com.wpz.ar.domain.ApplyRecordDto;
import com.wpz.ar.domain.ApplyRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ApplyRecordMapper {
    int countByExample(ApplyRecordExample example);

    int deleteByExample(ApplyRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyRecord record);

    int insertSelective(ApplyRecord record);

    List<ApplyRecord> selectByExample(ApplyRecordExample example);

    ApplyRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplyRecord record, @Param("example") ApplyRecordExample example);

    int updateByExample(@Param("record") ApplyRecord record, @Param("example") ApplyRecordExample example);

    int updateByPrimaryKeySelective(ApplyRecord record);

    int updateByPrimaryKey(ApplyRecord record);

    List<ApplyRecord> getApplyRecords(ApplyRecordDto applyRecordDto);
}