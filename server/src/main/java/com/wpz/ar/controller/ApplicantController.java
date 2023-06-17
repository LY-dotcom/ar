package com.wpz.ar.controller;

import com.github.pagehelper.PageInfo;
import com.wpz.ar.domain.Applicant;
import com.wpz.ar.service.ApplicantService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 18:44
 */
@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping("/login")
    public R login(HttpSession session, @RequestBody Applicant applicant) {
        Applicant result = applicantService.login(applicant);
        if (result == null) {
            return R.fail("登录失败，用户名或者密码不正确");
        } else if (result.getUserStatus() == -1) {
            return R.fail("登录失败，账号已被禁用");
        } else {
            session.setAttribute("applicant", applicant);
            return R.ok(result);
        }
    }




    @PostMapping("/register")
    public R register(@RequestBody Applicant applicant) {
        applicantService.register(applicant);
        return R.ok(null);
    }

    @PostMapping("/getApplicant")
    public R getApplicant(@RequestBody Applicant applicant) {
        Applicant res = applicantService.getApplicant(applicant);
        return R.ok(res);
    }

    @PostMapping("/update")
    public void update(@RequestBody Applicant applicant) {
        applicantService.update(applicant);

    }

    @PostMapping("/getApplicants")
    public R getApplicants(@RequestBody Applicant applicant) {
        PageInfo<Applicant> res = applicantService.getApplicants(applicant);
        return R.ok(res);
    }

    @PostMapping("/isExist")
    public R isExist(@RequestBody Applicant applicant) {
        Boolean r = applicantService.isExist(applicant);
        return R.ok(r);
    }

    @PostMapping("/logout")
    public R logout(HttpSession session) {
        session.removeAttribute("applicant");
        return R.ok(null);
    }








}
