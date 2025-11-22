package com.haust.controller;

import com.haust.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping("/main")
    public String toMainPage() {
        return "main";
    }
    @RequestMapping("/tologin")
    public String toLoginPage() {
        return "login";
    }
    @RequestMapping("/orderinfo")
    public String orderinfo() {
        return "orderinfo";
    }
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        String username = user.getUsername();
        String password = user.getPassword();
        if(username!=null&&username.equals("admin") && password!=null&&password.equals("123456")) {
            session.setAttribute("USER_SESSION", user);
            return "redirect:/main";
        }
        model.addAttribute("msg","用户名或密码错误，请重新登录！");
        return "login";
    }
    // 跳转到系统首页，跳转到登录页面，跳转到订单信息页面，用户登录省略
    @RequestMapping("/logout")
    public String logout(HttpSession session) {// 用户退出
        session.invalidate(); // 清除Session
        return "redirect:/tologin"; // 退出登录后重定向到登录页面
    }

}
