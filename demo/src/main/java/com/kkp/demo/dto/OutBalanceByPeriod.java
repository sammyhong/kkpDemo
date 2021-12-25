package com.kkp.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutBalanceByPeriod {
	private int balance;	  // 예치금
	private String id;		  // 아이디
	private String name;	  // 이름
	
	public OutBalanceByPeriod() {}
	
	public OutBalanceByPeriod(int balance, String id, String name) {
		super();
		this.balance = balance;
		this.id = id;
		this.name = name;
	}
}
