package com.kkp.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
	private String id;
	private String account;
	
	public Account() {
	}

	public Account(String id, String account) {
		super();
		this.id = id;
		this.account = account;
	}
	
	
}
