package com.haust.controller;

import com.haust.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {
    // @RequestMapping：里面放的是请求的url，和用户请求的url进行匹配
    // action可以写也可以不写
    @RequestMapping("/itemList.action")
    public ModelAndView queryItemList() {
        //创建页面需要显示的商品数据
        List<Item> list = new ArrayList<Item>();
        list.add(new Item(1, "1 华为荣耀 8", 2399, new Date(), "质量好！1"));
        list.add(new Item(2, "2 华为荣耀 8", 2399, new Date(), "质量好！2"));
        list.add(new Item(3, "3 华为荣耀 8", 2399, new Date(), "质量好！3"));
        list.add(new Item(4, "4 华为荣耀 8", 2399, new Date(), "质量好！4"));
        list.add(new Item(5, "5 华为荣耀 8", 2399, new Date(), "质量好！5"));
        list.add(new Item(6, "6 华为荣耀 8", 2399, new Date(), "质量好！6"));
        //创建ModelAndView，用来存放数据和视图
        ModelAndView modelAndView = new ModelAndView();
        //设置数据到模型中
        modelAndView.addObject("itemList", list);
        //设置视图jsp，需要设置视图的物理地址
        modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
        return modelAndView;
    }
    //TODO webapp/WEB-INF/jsp里缺少itemList.jsp页面
}
