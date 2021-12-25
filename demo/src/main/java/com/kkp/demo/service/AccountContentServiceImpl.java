package com.kkp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kkp.demo.dao.AccountContentMapper;
import com.kkp.demo.dto.Account;
import com.kkp.demo.dto.AccountContent;
import com.kkp.demo.dto.InBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByAgeGroup;
import com.kkp.demo.dto.OutBalanceById;
import com.kkp.demo.dto.OutBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByYear;
import com.kkp.demo.dto.OutUser;

@Repository
@Service
public class AccountContentServiceImpl implements AccountContentService {
	
	@Autowired
	private AccountContentMapper accountContentMapper;

	// 유저 조회
	@Override
	public List<OutUser> selectAllUsers() {
		return accountContentMapper.selectAllUsers();
	}
	
	// 계좌 등록
	@Override
	public void insertAccount(Account account) {
		accountContentMapper.insertAccount(account);
	}
	
	// 모든 계좌 조회
	@Override
	public List<Account> selectAllAccounts() {
		return accountContentMapper.selectAllAccounts();
	}

	// 계좌 내역 추가 - 입출금
	@Override
	public void insertAccountContent(AccountContent accountContent) {
		accountContentMapper.insertAccountContent(accountContent);
	}

	// 계좌 목록 조회
	@Override
	public List<AccountContent> selectAllAccountContents() {
		return accountContentMapper.selectAllAccountContents();
	}
	
	// 계좌 내역 id로 조회
	@Override
	public List<OutBalanceById> selectBalanceById(String id) {
		return accountContentMapper.selectBalanceById(id);
	}
	
	// 연령대별 예치금 조회
	@Override
	public List<OutBalanceByAgeGroup> selectBalanceByAgeGroup() {
		return accountContentMapper.selectBalanceByAgeGroup();
	}
	
	// 년도별 예치금 조회
	@Override
	public OutBalanceByYear selectBalanceByYear(String year) {
		return accountContentMapper.selectBalanceByYear(year);
	}
	
	// 기간별 예치금 조회
	@Override
	public List<OutBalanceByPeriod> selectBalanceByPeriod(InBalanceByPeriod period) {
		return accountContentMapper.selectBalanceByPeriod(period);
	}
	

	
}
