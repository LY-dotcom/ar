package com.wpz.ar.mapper;

import com.wpz.ar.domain.ChatRecord;
import com.wpz.ar.domain.ChatRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ChatRecordMapper {
    int countByExample(ChatRecordExample example);

    int deleteByExample(ChatRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChatRecord record);

    int insertSelective(ChatRecord record);

    List<ChatRecord> selectByExample(ChatRecordExample example);

    ChatRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByExample(@Param("record") ChatRecord record, @Param("example") ChatRecordExample example);

    int updateByPrimaryKeySelective(ChatRecord record);

    int updateByPrimaryKey(ChatRecord record);

    List<ChatRecord> getApplicantChatRecord(ChatRecord chatRecord);

    List<ChatRecord> getCompanyChatRecord(ChatRecord chatRecord);

    List<ChatRecord> getCharRecordsOrderByDateTime(ChatRecord chatRecord);
}