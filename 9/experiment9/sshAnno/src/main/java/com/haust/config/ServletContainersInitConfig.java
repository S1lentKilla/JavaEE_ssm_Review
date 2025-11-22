package com.haust.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainersInitConfig extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    /*
   加载 Spring 配置类中的信息，
   初始化 Spring 容器
   */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    /*
   加载 Spring MVC 配置类中的信息，
   初始化 Spring MVC 容器
    */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }
    //配置 DispatcherServlet 的映射路径
    protected String[] getServletMappings() {
        return new String[]{"*.action"};
    }
}