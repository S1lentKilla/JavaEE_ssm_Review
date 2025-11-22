package com.haust.dao.impl;

import com.haust.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("保存订单...");
    }

    @Override
    public void update() {
        System.out.println("修改订单...");
    }

    @Override
    public void delete() {
        System.out.println("删除订单...");
    }

    @Override
    public int find(int id) {
        System.out.println("查询订单..."+id);
        return id;
    }
}
