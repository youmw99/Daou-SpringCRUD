package com.daou.kr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daou.kr.dto.BoardDto;

@Mapper
public interface TblBoardMapper {
	List<BoardDto> getBoardItems();
}
