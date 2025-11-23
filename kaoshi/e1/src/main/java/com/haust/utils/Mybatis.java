package com.haust.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mybatis {
    private static SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
            InputStream is = Resources.getResourceAsStream("Mybatis-config.xml");
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
