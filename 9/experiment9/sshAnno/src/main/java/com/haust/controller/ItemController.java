package com.haust.controller;

import com.haust.pojo.Item;
import com.haust.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    /**
     * 显示商品列表
     *
     * @return
     */
    @RequestMapping("/itemList.action")
    public ModelAndView queryItemList() {
        // 获取商品数据
        List<Item> list = this.itemService.queryItemList();

        ModelAndView modelAndView = new ModelAndView();
        // 把商品数据放到模型中
        modelAndView.addObject("itemList", list);
        // 设置逻辑视图
        modelAndView.setViewName("itemList.jsp");
        return modelAndView;
    }
}
