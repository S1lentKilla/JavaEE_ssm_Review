package com.haust.dao.impl;

import com.haust.dao.ProductDao;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
    public void save(){
        System.out.println("保存商品...");
    }
    public void update(){
        System.out.println("修改商品...");
    }
    public void delete(){
        System.out.println("删除商品...");
    }
    public void find() {
        System.out.println("查询商品...");
    }
}
