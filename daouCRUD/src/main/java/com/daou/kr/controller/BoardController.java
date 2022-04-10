package com.daou.kr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.daou.kr.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/board")
	public String boardInit(@RequestParam("username")String username,Model model) {
		
		model.addAttribute("username",username);
		model.addAttribute("boarditems",boardService.getBoardItems());
		return "content/board";
	}
}
