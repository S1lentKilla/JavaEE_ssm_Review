package com.haust.mapper;

import com.haust.pojo.Item;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface ItemMapper1 {
    @Select("select * from springmvc.item")
    List<Item> selectByExample();
}
