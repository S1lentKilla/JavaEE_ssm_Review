package com.haust.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
// 等 同 于 <context:component-scan base-package="com.haust.controller"/>
@ComponentScan("com.haust.controller")
//等同于<mvc:annotation-driven/>，还不完全相同
@EnableWebMvc
public class SpringMVCConfig {
}