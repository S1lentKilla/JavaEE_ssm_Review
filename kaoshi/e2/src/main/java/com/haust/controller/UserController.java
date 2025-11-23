package com.haust.controller;

import com.haust.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @PostMapping("/welcome")
    public void welcome(User u, HttpSession session) {
        session.setAttribute("username", u.getUsername());
        session.setAttribute("password", u.getPassword());
    }
}
