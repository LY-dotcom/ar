package com.wpz.ar.service.impl;

import com.wpz.ar.domain.Applicant;
import com.wpz.ar.domain.Resume;
import com.wpz.ar.domain.ResumeExample;
import com.wpz.ar.mapper.ResumeMapper;
import com.wpz.ar.service.ApplicantService;
import com.wpz.ar.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/3/2 12:22
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;
    @Override
    public List<Resume> getResumes(Integer applicantId) {
        ResumeExample example = new ResumeExample();
        example.createCriteria().andApplicantIdEqualTo(applicantId);
        List<Resume> list = resumeMapper.selectByExample(example);
        return list;
    }

    @Override
    public void add(Resume resume) {
        resumeMapper.insert(resume);
    }

    @Override
    public void delete(Integer resumeId) {
        resumeMapper.deleteByPrimaryKey(resumeId);
    }

    @Autowired
    private ApplicantService applicantService;

    @Override
    public Resume getResume(Resume resume) {
        Resume res = resumeMapper.selectByPrimaryKey(resume.getId());
        Applicant applicant = new Applicant();
        applicant.setId(res.getApplicantId());
        res.setApplicant(applicantService.getApplicant(applicant));
        return res;
    }
}
