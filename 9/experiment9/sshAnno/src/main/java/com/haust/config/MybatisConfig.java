package com.haust.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    /*
    定义 MyBatis 的核心连接工厂 bean，
    等同于<bean class="org.mybatis.spring.SqlSessionFactoryBean">
    参数使用自动装配的形式加载 dataSource，
    为 set 注入提供数据源，dataSource 来源于 JdbcConfig 中的配置
    */
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(
            @Autowired DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        //等同于<property name="dataSource" ref="dataSource"/>
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
    /*
    定义 MyBatis 的映射扫描，
    等同于 <bean
   class="org.mybatis.spring.mapper.MapperScannerConfigurer">
    */
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        //等同于<property name="basePackage" value="com.haust.mapper"/>
        msc.setBasePackage("com.haust.mapper");
        return msc;
    }
}
