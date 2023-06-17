package com.wpz.ar.controller;

import com.wpz.ar.domain.Manager;
import com.wpz.ar.service.ManagerService;
import com.wpz.ar.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/27 17:23
 */
@RestController
@RequestMapping("/api/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/login")
    public R login(HttpSession session,  @RequestBody Manager manager) {
        Manager result = managerService.login(manager);
        if (result == null) {
            return R.fail("用户名或密码错误");
        }
        session.setAttribute("manager", manager);
        return R.ok(result);
    }

    @PostMapping("/getManager")
    public R getManager(@RequestBody Manager manager) {
        Manager res = managerService.getManager(manager);
        return R.ok(res);
    }

    @PostMapping("/logout")
    public R logout(HttpSession session) {
        session.removeAttribute("manager");
        return R.ok(null);
    }


}
