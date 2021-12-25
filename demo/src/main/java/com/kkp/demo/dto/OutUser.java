package com.kkp.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutUser {
	private String id;
	private String name;
	private int age;
	private String regiDt;
	
	public OutUser() {
	}
	
	public OutUser(String id) {
		super();
		this.id = id;
	}

	public OutUser(String id, String name, int age, String regiDt) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.regiDt = regiDt;
	}

	
	
	
}
