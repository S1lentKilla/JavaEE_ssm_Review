package com.haust.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class UserController {
    @RequestMapping("/getBirthday")
    public void getBirthday(Date birthday) {
        System.out.println("birthday=" + birthday);
    }
    @RequestMapping("/getBirthday2")
    public void getBirthday2(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println("birthday=" + birthday);
    }
}
