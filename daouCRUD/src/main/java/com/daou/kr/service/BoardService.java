package com.daou.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daou.kr.dto.BoardDto;
import com.daou.kr.dto.BoardInsertDto;
import com.daou.kr.mapper.TblBoardMapper;

@Service
public class BoardService {
	
	@Autowired
	TblBoardMapper tblBoardMapper;

	public List<BoardDto> getBoardItems() {
		return tblBoardMapper.getBoardItems();
	}

	public void insert(BoardInsertDto boardInsertDto) {
		tblBoardMapper.insert(boardInsertDto);
	}
}
