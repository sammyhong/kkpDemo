package com.kkp.demo.dto;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InBalanceByPeriod {
	private Date startDt; 	  // 시작일자
	private Date endDt; 	  // 종료일자
	
	public InBalanceByPeriod() {}
	
	public InBalanceByPeriod(Date startDt, Date endDt) {
		super();
		this.startDt = startDt;
		this.endDt = endDt;
	}
}
