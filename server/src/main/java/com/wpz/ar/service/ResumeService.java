package com.wpz.ar.service;

import com.wpz.ar.domain.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> getResumes(Integer applicantId);


    void add(Resume resume);

    void delete(Integer resumeId);

    Resume getResume(Resume resume);
}
