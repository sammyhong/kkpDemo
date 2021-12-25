package com.kkp.demo.service;

import java.util.List;

import com.kkp.demo.dto.Account;
import com.kkp.demo.dto.AccountContent;
import com.kkp.demo.dto.InBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByAgeGroup;
import com.kkp.demo.dto.OutBalanceById;
import com.kkp.demo.dto.OutBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByYear;
import com.kkp.demo.dto.OutUser;

public interface AccountContentService {
	
	// 모든 유저 조회
	List<OutUser> selectAllUsers();
	
	// 모든 계좌 조회
	List<Account> selectAllAccounts();
	
	// 계좌 등록
	void insertAccount(Account account);
	
	// 계좌 내역 등록
	void insertAccountContent(AccountContent accountContent);
	
	// 모든 계좌 내역 조회
	List<AccountContent> selectAllAccountContents();
	
	// 아이디로 계좌 내역 조회
	List<OutBalanceById> selectBalanceById(String id);
	
	// 연령대별 예치금 조회
	List<OutBalanceByAgeGroup> selectBalanceByAgeGroup();
	
	// 해당년도 예치금 조회
	OutBalanceByYear selectBalanceByYear(String year);
	
	// 기간별 예치금 조회
	List<OutBalanceByPeriod> selectBalanceByPeriod(InBalanceByPeriod period);

	
}
