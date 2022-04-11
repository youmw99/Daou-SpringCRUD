package com.daou.kr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daou.kr.dto.BoardDto;
import com.daou.kr.mapper.TblBoardMapper;

@Service
public class BoardDetailService {

	@Autowired
	TblBoardMapper tblBoardMapper;
	
	public BoardDto getBoardItem(String boardid) {
		return tblBoardMapper.getBoardItem(boardid);
	}

	public void delete(BoardDto boardDto) {
		tblBoardMapper.delete(boardDto.getBoardid());
	}

	public void update(BoardDto boardDto) {
		tblBoardMapper.update(boardDto);
	}
}
