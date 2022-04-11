package com.daou.kr.controller;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.daou.kr.dto.BoardDto;
import com.daou.kr.dto.FetchResultDto;
import com.daou.kr.service.BoardDetailService;

@Controller
public class BoardDetailController {

	@Autowired
	BoardDetailService boardDetailService;
	
	@GetMapping("/boarddetail/{id}")
	public String boardInit(@PathVariable("id")String boardid,Model model,HttpServletRequest request) {
		model.addAttribute("boarditem",boardDetailService.getBoardItem(boardid));
		HttpSession session = request.getSession(); // 세션을 생성
		session.setAttribute("boardid", boardid);
		return "content/boarddetail";
	}
	
	@PostMapping("/board/update")
	public ResponseEntity<HttpStatus> boardUpdate(@RequestBody BoardDto boardDto) {
		boardDetailService.update(boardDto);
        return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@PostMapping("/board/delete")
	public ResponseEntity<FetchResultDto> boardDelete(@RequestBody BoardDto boardDto) {
		boardDetailService.delete(boardDto);
		URI uri = URI.create("/board/");
        return ResponseEntity.created(uri).build();
	}
}
