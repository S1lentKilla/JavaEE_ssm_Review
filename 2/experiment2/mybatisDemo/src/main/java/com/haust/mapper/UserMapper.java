package com.haust.mapper;

import com.haust.pojo.User;
import com.haust.vo.QueryVo;

import java.util.List;

public interface UserMapper {
    List<User> findUserByQueryVo(QueryVo vo);
    Integer findUserCount();
    List<User> findUserListResultMap(QueryVo vo);
    int insertUser(User user);
}
