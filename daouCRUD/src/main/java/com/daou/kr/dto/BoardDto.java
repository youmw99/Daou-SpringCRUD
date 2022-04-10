package com.daou.kr.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
	Integer boardinc;
	String boardid;
	String usercd;
	String board_content_txt;
	String board_content_img;
	Integer board_content_price;
	public Integer getBoardinc() {
		return boardinc;
	}
	public void setBoardinc(Integer boardinc) {
		this.boardinc = boardinc;
	}
	public String getBoardid() {
		return boardid;
	}
	public void setBoardid(String boardid) {
		this.boardid = boardid;
	}
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
	public String getBoard_content_img() {
		return board_content_img;
	}
	public void setBoard_content_img(String board_content_img) {
		this.board_content_img = board_content_img;
	}
	public Integer getBoard_content_price() {
		return board_content_price;
	}
	public void setBoard_content_price(Integer board_content_price) {
		this.board_content_price = board_content_price;
	}
}
