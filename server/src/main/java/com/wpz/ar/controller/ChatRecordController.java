package com.wpz.ar.controller;

import com.wpz.ar.domain.ChatRecord;
import com.wpz.ar.service.ChatRecordService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/8 14:25
 */
@RestController
@RequestMapping("/api/chatRecord")
public class ChatRecordController {

    @Autowired
    private ChatRecordService chatRecordService;

    // 获取求职者的所有聊过天的企业用户
    @PostMapping("/getApplicantChatRecords")
    public R getApplicantChatRecords(@RequestBody  ChatRecord chatRecord) {
        List<ChatRecord> list = chatRecordService.getApplicantChatRecords(chatRecord);
        return R.ok(list);
    }
    // 获取企业用户的所有聊过天的求职者
    @PostMapping("/getCompanyChatRecords")
    public R getCompanyChatRecords(@RequestBody ChatRecord chatRecord) {
        List<ChatRecord> list = chatRecordService.getCompanyChatRecords(chatRecord);
        return R.ok(list);
    }
    // 获取聊天记录
    @PostMapping("/getChatRecords")
    public R getChatRecords(@RequestBody ChatRecord chatRecord) {
        List<ChatRecord> list = chatRecordService.getChatRecords(chatRecord);
        return R.ok(list);
    }

    @PostMapping("/add")
    public R add(@RequestBody ChatRecord chatRecord) {
        chatRecordService.add(chatRecord);
        return R.ok(null);
    }

    @PostMapping("/getChatRecord")
    public R getChatRecord(@RequestBody ChatRecord chatRecord) {
        ChatRecord res = chatRecordService.getChatRecord(chatRecord);
        return R.ok(res);
    }

}
