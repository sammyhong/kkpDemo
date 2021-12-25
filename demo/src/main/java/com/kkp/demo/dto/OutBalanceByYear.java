package com.kkp.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutBalanceByYear {
	private int balance;	  // 예치금
	private String year;	  // 년도
	
	public OutBalanceByYear() {}
	
	public OutBalanceByYear(int balance, String year) {
		super();
		this.balance = balance;
		this.year = year;
	}
	
}
