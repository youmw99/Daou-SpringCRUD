package com.daou.kr.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
	String usercd;
	String username;
	Boolean isstilluser;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsercd() {
		return usercd;
	}

	public void setUsercd(String usercd) {
		this.usercd = usercd;
	}
	
}
