package com.animal.shelter.vo;

import lombok.Data;

@Data
public class Board {
	
	private Integer b_idx;
	private String title;
	private String content;
	private String createdate;
	private int userID;
	private int hit;
	private int good;
	private int bad;
	

}
