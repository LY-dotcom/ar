package com.wpz.ar.mapper;

import com.wpz.ar.domain.ResumeDetail;
import com.wpz.ar.domain.ResumeDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ResumeDetailMapper {
    int countByExample(ResumeDetailExample example);

    int deleteByExample(ResumeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeDetail record);

    int insertSelective(ResumeDetail record);

    List<ResumeDetail> selectByExample(ResumeDetailExample example);

    ResumeDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResumeDetail record, @Param("example") ResumeDetailExample example);

    int updateByExample(@Param("record") ResumeDetail record, @Param("example") ResumeDetailExample example);

    int updateByPrimaryKeySelective(ResumeDetail record);

    int updateByPrimaryKey(ResumeDetail record);
}