package com.wpz.ar.service.impl;

import com.wpz.ar.domain.ChatRecord;
import com.wpz.ar.domain.ChatRecordExample;
import com.wpz.ar.domain.Company;
import com.wpz.ar.mapper.ApplicantMapper;
import com.wpz.ar.mapper.ChatRecordMapper;
import com.wpz.ar.mapper.CompanyMapper;
import com.wpz.ar.service.ChatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/8 14:24
 */
@Service
public class ChatRecordServiceImpl implements ChatRecordService {
    @Autowired
    private ChatRecordMapper chatRecordMapper;

    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public List<ChatRecord> getApplicantChatRecords(ChatRecord chatRecord) {
        List<ChatRecord> list = chatRecordMapper.getApplicantChatRecord(chatRecord);
        for (ChatRecord record : list) {
            record.setCompany(companyMapper.selectByPrimaryKey(record.getCompanyId()));
            ChatRecordExample example = new ChatRecordExample();
            ChatRecordExample.Criteria criteria = example.createCriteria();
            criteria.andApplicantIdEqualTo(record.getApplicantId())
                            .andCompanyIdEqualTo(record.getCompanyId())
                                    .andMineEqualTo(record.getCompanyId())
                                            .andIsReadEqualTo(0);
            int readNum = chatRecordMapper.countByExample(example);
            record.setReadNum(readNum);
        }
        return list;
    }

    @Override
    public List<ChatRecord> getCompanyChatRecords(ChatRecord chatRecord) {
        List<ChatRecord> list = chatRecordMapper.getCompanyChatRecord(chatRecord);
        for (ChatRecord record : list) {
            record.setApplicant(applicantMapper.selectByPrimaryKey(record.getApplicantId()));
            ChatRecordExample example = new ChatRecordExample();
            ChatRecordExample.Criteria criteria = example.createCriteria();
            criteria.andApplicantIdEqualTo(record.getApplicantId())
                    .andCompanyIdEqualTo(record.getCompanyId())
                    .andMineEqualTo(record.getApplicantId())
                    .andIsReadEqualTo(0);
            int readNum = chatRecordMapper.countByExample(example);
            record.setReadNum(readNum);
        }
        return list;
    }

    @Override
    public List<ChatRecord> getChatRecords(ChatRecord chatRecord) {
        //此求职者和此企业用户的聊天记录置为已读
        ChatRecordExample example = new ChatRecordExample();
        ChatRecordExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantIdEqualTo(chatRecord.getApplicantId())
                        .andCompanyIdEqualTo(chatRecord.getCompanyId())
                .andMineEqualTo(chatRecord.getMine());
        ChatRecord update = new ChatRecord();
        update.setIsRead(1);
        chatRecordMapper.updateByExampleSelective(update, example);


        List<ChatRecord> list = chatRecordMapper.getCharRecordsOrderByDateTime(chatRecord);
        for (ChatRecord record : list) {
            record.setApplicant(applicantMapper.selectByPrimaryKey(record.getApplicantId()));
            record.setCompany(companyMapper.selectByPrimaryKey(record.getCompanyId()));
        }
        return list;
    }

    @Override
    public void add(ChatRecord chatRecord) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = null;
        try {
            parse = sdf.parse(chatRecord.getDatetime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        chatRecord.setDatetime(sdf.format(parse));
        chatRecordMapper.insert(chatRecord);
    }

    @Override
    public ChatRecord getChatRecord(ChatRecord chatRecord) {
        ChatRecordExample example = new ChatRecordExample();
        ChatRecordExample.Criteria criteria = example.createCriteria();
        criteria.andApplicantIdEqualTo(chatRecord.getApplicantId())
                .andCompanyIdEqualTo(chatRecord.getCompanyId());
        List<ChatRecord> list = chatRecordMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Autowired
    private ApplicantMapper applicantMapper;
}
