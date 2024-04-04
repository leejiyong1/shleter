package com.animal.shelter.vo;

import lombok.Data;

@Data
public class S_Mail {
	
	private int ma_idx;
	private String content;
	private String title;
	private String recipient;
	private String createdate;
	private String sender;

}
