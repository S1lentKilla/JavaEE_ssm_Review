package com.haust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController{

	// 显示登录页面
	@GetMapping("/login")
	public String showLoginPage() {
		return "login"; // 会自动解析为 /WEB-INF/jsp/login.jsp
	}

	// 处理登录请求
	@PostMapping("/login")
	public String handleLogin(@RequestParam("username") String username,
							  @RequestParam("password") String password,
							  Model model) {

		// 简单的用户名密码验证（实际项目中应该从数据库验证）
		if ("admin".equals(username) && "123456".equals(password)) {
			// 登录成功，重定向到欢迎页面
			return "redirect:/welcome";
		} else {
			// 登录失败，返回登录页面并显示错误信息
			model.addAttribute("error", "用户名或密码错误");
			return "login";
		}
	}

	// 显示欢迎页面
	@GetMapping("/welcome")
	public String showWelcomePage(Model model) {
		// 可以在这里添加用户信息到model中
		model.addAttribute("message", "登录成功，欢迎回来！");
		return "welcome"; // 会自动解析为 /WEB-INF/jsp/welcome.jsp
	}

	// 显示错误页面（可选，也可以通过Spring的异常处理机制实现）
	@GetMapping("/error")
	public String showErrorPage() {
		return "error"; // 会自动解析为 /WEB-INF/jsp/error.jsp
	}
}
