/**
 * Copyright (c) 2019, 中国电信甘肃万维公司 All rights reserved.
 * 万维公司 专有/保密源代码,未经许可禁止任何人通过任何渠道使用、修改源代码.
 */
package com.example.demo.intercept;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 系统名称
 * 工程名称 examonline
 * 创建时间 2019/5/20 17:00
 *
 * @author caoj
 * @since 1.8
 */
@Component
public class MyIntercept implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws IOException {
        Student stu = (Student) request.getSession().getAttribute("studentSession");
        if(null!=stu){
            System.out.println(stu);
            return true;
        }else{
            request.setAttribute("errorMessage", "请重新登录！");
            String script = "alert('对不起，由于您长时间没有操作，请重新登录！'); \n window.location.href='" + request.getContextPath() + "/';";
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("<script language=\"javascript\">");
            response.getWriter().write("\n" + script + "\n");
            response.getWriter().write("</script>");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }
}
