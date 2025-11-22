package com.haust.dao.impl;

import com.haust.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
    }

    @Override
    public void say() {
        System.out.println("userDao say hello world!");
    }
}
