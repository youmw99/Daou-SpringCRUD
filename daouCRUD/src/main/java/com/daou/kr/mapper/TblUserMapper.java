package com.daou.kr.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.daou.kr.dto.LoginDto;

@Mapper
public interface TblUserMapper {
	boolean userVerify(LoginDto loginDto);

	String getUserName(LoginDto loginDto);
}
