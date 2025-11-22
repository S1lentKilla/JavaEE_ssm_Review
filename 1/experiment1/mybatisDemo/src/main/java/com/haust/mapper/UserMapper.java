package com.haust.mapper;

import com.haust.pojo.User;

import java.util.List;

public interface UserMapper {
    User queryUserById(int id);
    List<User> queryUserByUsername1(String username);
    List<User> queryUserByUsername2(String username);
    List<User> queryUserByUsername3(String username);
    int saveUser1(User user);
    int saveUser2(User user);
    int updateUserById(User user);
    int deleteUserById(int id);
}
