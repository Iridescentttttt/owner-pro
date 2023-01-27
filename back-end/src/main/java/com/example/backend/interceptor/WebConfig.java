package com.example.backend.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author HDH
 * @version 1.0
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    // addPathPattern 添加拦截规则 /** 拦截所有包括静态资源
    // excludePathPattern 排除拦截规则 放开静态资源的拦截
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login")
                .excludePathPatterns("/css/**\",\"/fonts/**\",\"/images/**\",\"/js/**");

        //WebMvcConfigurer.super.addInterceptors(registry);
    }
}
