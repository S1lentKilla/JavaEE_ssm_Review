package com.haust.converter;

import com.haust.pojo.User;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter<String, User> {
    @Override
    public User convert(String s) {
        String[] s1=s.split(",");
        User user=new User();
        user.setUsername(s1[0]);
        user.setPassword(s1[1]);
        return user;
    }
}
