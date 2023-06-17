package com.wpz.ar.controller;

import com.wpz.ar.domain.ResumeDetail;
import com.wpz.ar.service.ResumeDetailService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/4/3 19:54
 */
@RestController
@RequestMapping("/api/resumeDetail")
public class ResumeDetailController {
    @Autowired
    private ResumeDetailService resumeDetailService;

    @PostMapping("/addResumeDetail")
    public R addResumeDetail(@RequestBody ResumeDetail resumeDetail) {
        resumeDetailService.add(resumeDetail);
        return R.ok(null);
    }

    @PostMapping("/getResumeDetail")
    public R getResumeDetail(@RequestBody ResumeDetail resumeDetail) {
        ResumeDetail r = resumeDetailService.getResumeDetail(resumeDetail);
        return R.ok(r);
    }
}
