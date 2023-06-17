package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Applicant;
import com.wpz.ar.domain.Company;
import com.wpz.ar.domain.CompanyDto;
import com.wpz.ar.service.CompanyService;
import com.wpz.ar.util.R;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/27 09:35
 */
@RestController
@RequestMapping("/api/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;


    @PostMapping("/register")
    public R register(@RequestBody Company company) {
        Company result = companyService.register(company);
        return R.ok(result);
    }

    @PostMapping("/login")
    public R login(HttpSession session,  @RequestBody Company company) {
        Company result = companyService.login(company);
        if (result == null) {
            return R.fail("用户名或者密码错误");
        } else if (result.getUserStatus() == -1) {
            return R.fail("该账号已被禁用");
        }else {
            session.setAttribute("company", company);
            return R.ok(result);
        }
    }

    @PostMapping("/getCompanys")
    public R getCompanys(@RequestBody CompanyDto companyDto) {
        PageInfo<Company> pageInfo = companyService.getCompanys(companyDto);
        return R.ok(pageInfo);
    }

    @PostMapping("/getCompany")
    public R getCompanys(@RequestBody Company company) {
        Company result = companyService.getCompany(company);
        return R.ok(result);
    }

    @PostMapping("/update")
    public R update(@RequestBody Company company) {
        companyService.update(company);
        return R.ok(null);
    }

    @PostMapping("/count")
    public R count(@RequestBody Company company) {
        int cnt = companyService.count(company);
        return R.ok(cnt);
    }

    @PostMapping("/logout")
    public R logout(HttpSession session) {
        session.removeAttribute("company");
        return R.ok(null);
    }

    @PostMapping("/isExist")
    public R isExist(@RequestBody Company company) {
        Boolean r = companyService.isExist(company);
        return R.ok(r);
    }

}
