package com.kkp.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OutBalanceById {
	private int balance;	  // 예치금
	private String account;   // 계좌번호
	
	public OutBalanceById() {}
	
	public OutBalanceById(int balance, String account) {
		super();
		this.balance = balance;
		this.account = account;
	}
	
}
