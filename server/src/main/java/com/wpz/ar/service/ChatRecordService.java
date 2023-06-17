package com.wpz.ar.service;

import com.wpz.ar.domain.ChatRecord;

import java.util.List;

public interface ChatRecordService {
    List<ChatRecord> getApplicantChatRecords(ChatRecord chatRecord);

    List<ChatRecord> getCompanyChatRecords(ChatRecord chatRecord);

    List<ChatRecord> getChatRecords(ChatRecord chatRecord);

    void add(ChatRecord chatRecord);

    ChatRecord getChatRecord(ChatRecord chatRecord);
}
