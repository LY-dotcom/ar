package com.wpz.ar.controller;

import com.wpz.ar.domain.Resume;
import com.wpz.ar.service.ResumeService;
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
 * 2023/3/2 12:37
 */
@RestController
@RequestMapping("/api/resume")
public class ResumeController {
    @Autowired
    private ResumeService resumeService;

    @PostMapping("/getResumes")
    public R getResumes(Integer applicantId) {
        List<Resume> list = resumeService.getResumes(applicantId);
        return R.ok(list);
    }

    @PostMapping("/add")
    public R add(@RequestBody Resume resume) {
        resumeService.add(resume);
        return R.ok(null);
    }

    @PostMapping("/delete")
    public R delete(Integer resumeId) {
        resumeService.delete(resumeId);
        return R.ok(null);
    }
}
