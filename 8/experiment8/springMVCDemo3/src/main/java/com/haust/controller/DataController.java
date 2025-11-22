package com.haust.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haust.pojo.Product;
import com.haust.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DataController {
    @RequestMapping("/showDataByJSON")
    public void showDataByJSON(HttpServletResponse httpServletResponse) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            User user = new User();
            user.setUsername("zhangsan");
            user.setPassword("123456");
            String json = objectMapper.writeValueAsString(user);
            httpServletResponse.getWriter().print(json);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setUsername("zhangsan");
        return user;
    }
    @RequestMapping("/addProducts")
    @ResponseBody
    public List<Product> addProducts() {
        List<Product> products = new ArrayList<Product>();
        Product product1 = new Product();
        product1.setProId("p001");
        product1.setProName("红牛");
        Product product2 = new Product();
        product2.setProId("p002");
        product2.setProName("三文鱼");
        products.add(product1);
        products.add(product2);
        return products;
    }
}
