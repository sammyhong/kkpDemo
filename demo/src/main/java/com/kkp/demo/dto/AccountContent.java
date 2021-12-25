package com.kkp.demo.dto;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class AccountContent {

	private String account;   // 계좌번호
	private String inOutYn;   // 입출금여부
	private int deposit; 	  // 입금액
	private Date depositDate; // 입금일
	
	public AccountContent() {}

	public AccountContent(String account, String inOutYn, int deposit, Date depositDate) {
		super();
		this.account = account;
		this.inOutYn = inOutYn;
		this.deposit = deposit;
		this.depositDate = depositDate;
	}
	
}
