package com.haust.service.impl;

import com.haust.mapper.ItemMapper;
import com.haust.pojo.Item;
import com.haust.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Item> queryItemList() {
        // 从数据库查询商品数据
        List<Item> list = this.itemMapper.selectByExample();

        return list;
    }
}
