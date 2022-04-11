package com.daou.kr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daou.kr.dto.BoardDto;
import com.daou.kr.dto.BoardInsertDto;

@Mapper
public interface TblBoardMapper {
	List<BoardDto> getBoardItems();
	BoardDto getBoardItem(String boardid);
	void insert(BoardInsertDto boardInsertDto);
	void delete(String boardid);
	void update(BoardDto boardDto);
}
