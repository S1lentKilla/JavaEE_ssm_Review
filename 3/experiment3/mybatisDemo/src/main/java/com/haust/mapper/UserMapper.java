package com.haust.mapper;

import com.haust.pojo.User;
import com.haust.vo.QueryVo;

import java.util.List;

public interface UserMapper {
    /**
     * 根据条件查询用户
     * @param user
     * @return
     */
    List<User> queryUserByWhere(User user);
    List<User> queryUserByWhere1(User user);
    List<User> queryUserByWhere2(User user);
    List<User> queryUserByIds(QueryVo queryVo);
}
