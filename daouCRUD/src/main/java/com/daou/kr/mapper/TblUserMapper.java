package com.daou.kr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daou.kr.dto.LoginDto;

@Mapper
public interface TblUserMapper {
	List<LoginDto> selectAllUser();
}
