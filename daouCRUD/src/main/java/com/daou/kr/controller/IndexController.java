package com.daou.kr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@GetMapping("/home")
	@ResponseBody
	public String goHome(HttpServletRequest request) {
		return "Hello String Boot";
	}
}