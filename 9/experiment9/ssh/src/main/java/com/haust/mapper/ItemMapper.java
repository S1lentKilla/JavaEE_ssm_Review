package com.haust.mapper;

import com.haust.pojo.Item;

import java.util.List;

public interface ItemMapper {
    List<Item> selectByExample();
}
