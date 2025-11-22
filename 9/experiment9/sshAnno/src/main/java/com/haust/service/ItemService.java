package com.haust.service;

import com.haust.pojo.Item;

import java.util.List;

public interface ItemService {
    /**
     * 查询商品列表
     *
     * @return
     */
    List<Item> queryItemList();
}
