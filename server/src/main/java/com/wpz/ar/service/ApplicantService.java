package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Applicant;
import org.springframework.stereotype.Service;

public interface ApplicantService {

    Applicant login(Applicant applicant);

    void register(Applicant applicant);

    Applicant getApplicant(Applicant applicant);

    void update(Applicant applicant);

    PageInfo<Applicant> getApplicants(Applicant applicant);

    Boolean isExist(Applicant applicant);

}
