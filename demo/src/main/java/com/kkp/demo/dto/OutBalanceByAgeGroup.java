package com.kkp.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutBalanceByAgeGroup {
	private int balance;	  // 예치금
	private String ageGroup;  // 연령대 
	
	public OutBalanceByAgeGroup() {}
	
	public OutBalanceByAgeGroup(int balance, String ageGroup) {
		super();
		this.balance = balance;
		this.ageGroup = ageGroup;
	}
}
