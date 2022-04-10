package com.daou.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daou.kr.dto.LoginDto;
import com.daou.kr.mapper.TblUserMapper;

@Service
public class LoginService {
	
	@Autowired
	TblUserMapper tblUserMapper;
	
	public boolean checkUser() {
		List<LoginDto> list = tblUserMapper.selectAllUser();
		return false;
	}

}
