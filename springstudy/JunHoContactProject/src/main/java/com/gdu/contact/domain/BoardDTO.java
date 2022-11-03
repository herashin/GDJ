package com.gdu.contact.domain;

import lombok.Data;

@Data
public class BoardDTO {
	
	private int board_no;
	private String name,tel, addr,email,note;
	
	public BoardDTO() {}
	
}
