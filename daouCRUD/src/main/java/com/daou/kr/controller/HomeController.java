package com.daou.kr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.daou.kr.dto.LoginDto;
import com.daou.kr.service.LoginService;

@Controller
public class HomeController {

	@Autowired
	HttpServletResponse httpServletResponse;

	@Autowired
	private LoginService loginService;

	@GetMapping("/home")
	public ModelAndView goHome(HttpServletRequest request) {
		// templates 폴더 아래 html 경로 입력(확장자 생략)
		ModelAndView mav = new ModelAndView("content/home");

		mav.addObject("logindto", new LoginDto());

		return mav;
	}

	@PostMapping("/login")
	public String login(LoginDto loginDto) throws IOException {
		return "redirect:board";
	}
}