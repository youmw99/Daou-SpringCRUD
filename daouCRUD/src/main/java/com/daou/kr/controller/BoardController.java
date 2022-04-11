package com.daou.kr.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.daou.kr.dto.BoardInsertDto;
import com.daou.kr.dto.FetchResultDto;
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
	
	@PostMapping("/board/insert")
	public ResponseEntity<FetchResultDto> boardInsert(@RequestBody BoardInsertDto boardInsertDto) {
		boardService.insert(boardInsertDto);
		URI uri = URI.create("/board/");
        return ResponseEntity.created(uri).build();
	}
}
