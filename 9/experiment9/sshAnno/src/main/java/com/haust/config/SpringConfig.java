package com.haust.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MybatisConfig.class, JdbcConfig.class})
/*
等同于<context:component-scan base-package="com.haust.service">
*/
@ComponentScan(value = "com.haust.service")
/*
将 MyBatisConfig 类和 JdbcConfig 类交给 Spring 管理
*/
public class SpringConfig {
}
