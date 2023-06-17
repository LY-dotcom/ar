package com.wpz.ar.interceptor;

import com.alibaba.fastjson.JSON;
import com.wpz.ar.util.R;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.nio.charset.StandardCharsets;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 18:49
 */
public class ManagerLoginInterceptor implements HandlerInterceptor {
    /***
     * 在请求处理之前进行调用(Controller方法调用之前)
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("manager --- 执行了登录拦截器的preHandle方法");
        try {
            HttpSession session = request.getSession();
            Object applicant = session.getAttribute("manager");
            if (applicant != null) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回未登录的消息
        ServletOutputStream outputStream = response.getOutputStream();
        // 设置返回401 和响应编码
        response.setStatus(401);
        response.setContentType("Application/json;charset=utf-8");
        // 构造返回响应体
        Object loginFail = JSON.toJSON(R.fail("login fail"));
        outputStream.write(loginFail.toString().getBytes(StandardCharsets.UTF_8));
        return false;
    }

}
