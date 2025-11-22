package com.haust.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/*
等同于
<context:property-placeholder location="classpath*:jdbc.properties"/>
*/
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
    /*
    使用注入的形式，读取 properties 文件中的属性值，
    等同于<property name="*******" value="${jdbc.driver}"/>
    */
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;
    /*定义 dataSource 的 bean， 等同于
    <bean id="dataSource"
   class="com.alibaba.druid.pool.DruidDataSource">
    */
    @Bean("dataSource")
    public DataSource getDataSource() {
        //创建对象
//        DruidDataSource ds = new DruidDataSource();
        DriverManagerDataSource ds = new DriverManagerDataSource();
 /*
 等同于 set 属性注入 <property name="driverClassName"
value="driver"/>
 */
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}