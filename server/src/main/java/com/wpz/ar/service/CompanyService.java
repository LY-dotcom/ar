package com.wpz.ar.service;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Company;
import com.wpz.ar.domain.CompanyDto;

public interface CompanyService {
    Company register(Company company);

    Company login(Company company);

    PageInfo<Company> getCompanys(CompanyDto companyDto);

    void update(Company company);

    Company getCompany(Company company);

    int count(Company company);

    Boolean isExist(Company company);
}
