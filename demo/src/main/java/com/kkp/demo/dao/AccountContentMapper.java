package com.kkp.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kkp.demo.dto.Account;
import com.kkp.demo.dto.AccountContent;
import com.kkp.demo.dto.InBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByAgeGroup;
import com.kkp.demo.dto.OutBalanceById;
import com.kkp.demo.dto.OutBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByYear;
import com.kkp.demo.dto.OutUser;

@Mapper
public interface AccountContentMapper {
	// 계좌 내역 등록 - 입출금
	void insertAccountContent(AccountContent accountAccount);
	
	// 모든 계좌 내역 조회
	List<AccountContent> selectAllAccountContents();
	
	// 아이디로 예치금 조회
	List<OutBalanceById> selectBalanceById(String id);
	
	// 연령대별로 예치금 조회
	List<OutBalanceByAgeGroup> selectBalanceByAgeGroup();
	
	// 년도별로 예치금 조회
	OutBalanceByYear selectBalanceByYear(String year);
	
	// 기간으로 예치금 조회
	List<OutBalanceByPeriod> selectBalanceByPeriod(InBalanceByPeriod period);
	
	// 모든 계좌 조회
	List<Account> selectAllAccounts();
	
	// 계좌 등록
	void insertAccount(Account account);
	
	// 모든 유저 조회
	List<OutUser> selectAllUsers();
	
}
