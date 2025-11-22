package com.haust.mapper;

import com.haust.pojo.Order2;
import com.haust.pojo.OrderUser;
import com.haust.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 一对一关联，查询订单同时包含用户信息
     * @return
     */
    List<OrderUser> queryOrderUser();

    /**
     * 一对一关联，查询订单，订单内部包含用户属性
     * @return
     */
    List<Order2> queryOrderUserResultMap();

    /**
     * 一对多关联，查询用户，用户内部包含该用户的订单
     * @return
     */
    List<User> queryUserOrder();
}
