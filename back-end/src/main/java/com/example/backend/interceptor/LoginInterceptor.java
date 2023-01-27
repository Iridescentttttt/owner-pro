package com.example.backend.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author HDH
 * @version 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    //登录拦截，判断是否存在，如果并不存在，返回登陆页面
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        if(request.getSession().getAttribute("user")==null){
            response.sendRedirect("/admin");
            return false;
        }
        //存在，放行
        return true;
    }
}
