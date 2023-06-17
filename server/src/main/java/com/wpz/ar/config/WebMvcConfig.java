package com.wpz.ar.config;

import com.wpz.ar.interceptor.ApplicantLoginInterceptor;
import com.wpz.ar.interceptor.CompanyLoginInterceptor;
import com.wpz.ar.util.ARConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangpengze
 * @version 1.0
 * 2023/2/16 18:51
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

/*
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册求职者登录拦截器
        InterceptorRegistration registration = registry.addInterceptor(new ApplicantLoginInterceptor());
        registration.addPathPatterns("/api/applicant/**"); //所有路径都被拦截
        registration.excludePathPatterns(    //添加不拦截路径
                "/api/applicant/login",                   //登录路径
                "/api/applicant/register",                   //注册
                "/api/applicant/isExist",
                "/api/applicant/logout"

        );

        //注册求职者登录拦截器
        InterceptorRegistration companyRegistration = registry.addInterceptor(new CompanyLoginInterceptor());
        companyRegistration.addPathPatterns("/api/company/**"); //所有路径都被拦截
        companyRegistration.excludePathPatterns(    //添加不拦截路径
                "/api/company/login",                   //登录路径
                "/api/company/register",                   //注册
                "/api/company/isExist",
                "/api/company/logout"

        );

        //注册求职者登录拦截器
        InterceptorRegistration managerRegistration = registry.addInterceptor(new CompanyLoginInterceptor());
        managerRegistration.addPathPatterns("/api/manager/**"); //所有路径都被拦截
        managerRegistration.excludePathPatterns(    //添加不拦截路径
                "/api/manager/login",                    //登录路径
                "/api/manager/logout"

        );
    }
*/

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/api/static/**").addResourceLocations("file:" + ARConstant.DIR_PATH);
    }
}
