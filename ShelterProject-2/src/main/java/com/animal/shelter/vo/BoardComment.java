package com.animal.shelter.vo;

import lombok.Data;

@Data
public class BoardComment {
	
	private Integer c_idx;
	private String content;
	private int userID;
	private String createdate;
	private int good;
	private int bad;
	private int b_idx;
	

}
