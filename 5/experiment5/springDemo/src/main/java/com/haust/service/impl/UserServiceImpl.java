package com.haust.service.impl;

import com.haust.dao.UserDao;
import com.haust.dao.impl.UserDaoImpl;
import com.haust.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        userDao.say();
        System.out.println("UserService say hello world!");
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
