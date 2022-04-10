package com.daou.kr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daou.kr.dto.LoginDto;
import com.daou.kr.mapper.TblUserMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoginService {
	
	@Autowired
	TblUserMapper tblUserMapper;
	
	public boolean checkUser(LoginDto loginDto) {
		return tblUserMapper.userVerify(loginDto);
	}
	
	public String getUserName(LoginDto loginDto) {
		return tblUserMapper.getUserName(loginDto);
	}
}
