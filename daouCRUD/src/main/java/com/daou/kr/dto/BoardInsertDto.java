package com.daou.kr.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardInsertDto {
	public String getUsercd() {
		return usercd;
	}
	public void setUsercd(String usercd) {
		this.usercd = usercd;
	}
	public String getBoard_content_txt() {
		return board_content_txt;
	}
	public void setBoard_content_txt(String board_content_txt) {
		this.board_content_txt = board_content_txt;
	}
	String usercd;
	String board_content_txt;
}
