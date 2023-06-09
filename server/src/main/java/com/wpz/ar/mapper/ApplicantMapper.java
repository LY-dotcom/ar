package com.wpz.ar.mapper;

import com.wpz.ar.domain.Applicant;
import com.wpz.ar.domain.ApplicantExample;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ApplicantMapper {
    int countByExample(ApplicantExample example);

    int deleteByExample(ApplicantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Applicant record);

    int insertSelective(Applicant record);

    List<Applicant> selectByExample(ApplicantExample example);

    Applicant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Applicant record, @Param("example") ApplicantExample example);

    int updateByExample(@Param("record") Applicant record, @Param("example") ApplicantExample example);

    int updateByPrimaryKeySelective(Applicant record);

    int updateByPrimaryKey(Applicant record);
}