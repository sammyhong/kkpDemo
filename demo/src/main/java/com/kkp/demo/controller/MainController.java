package com.kkp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkp.demo.dto.Account;
import com.kkp.demo.dto.AccountContent;
import com.kkp.demo.dto.InBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByAgeGroup;
import com.kkp.demo.dto.OutBalanceById;
import com.kkp.demo.dto.OutBalanceByPeriod;
import com.kkp.demo.dto.OutBalanceByYear;
import com.kkp.demo.dto.OutUser;
import com.kkp.demo.service.AccountContentService;

import io.swagger.annotations.ApiOperation;

@RequestMapping(path="/api")
@RestController
public class MainController {
	
	@Autowired
	private AccountContentService accountContentService;
	
	@ApiOperation(value = "사용자 목록 조회")
	@GetMapping("/users")
	public List<OutUser> getUserList() throws Exception {
		return accountContentService.selectAllUsers();
	}
	
	@ApiOperation(value = "계좌 등록")
	@PostMapping("/regi-account")
	public void insertAccount(@RequestBody Account account) {
		accountContentService.insertAccount(account);
	}
	
	@ApiOperation(value = "계좌 목록 조회")
	@GetMapping("/accounts")
	public List<Account> getAccountList() throws Exception {
		return accountContentService.selectAllAccounts();
	}
	
	@ApiOperation(value = "계좌 내역 등록 - 입출금")
	@PostMapping("/regi-account-content")
	public void insertAccountContent(@RequestBody AccountContent accountContent) {
		accountContentService.insertAccountContent(accountContent);
	}

	@ApiOperation(value = "계좌 내역 조회 - 입출금 내역")
	@GetMapping("/account-contents")
	public List<AccountContent> getAccountContentList() {
		return accountContentService.selectAllAccountContents();
	}

	@ApiOperation(value = "아이디로 예치금 조회")
	@PostMapping("/balance-by-id")
	public List<OutBalanceById> getBalanceById(String id) {
		return accountContentService.selectBalanceById(id);
	}
	
	@ApiOperation(value = "연령대별 예치금 조회")
	@GetMapping("/balance-by-age-group")
	public List<OutBalanceByAgeGroup> getBalanceByAgeGroup() {
		return accountContentService.selectBalanceByAgeGroup();
	}
	
	@ApiOperation(value = "해당 년도의 예치금 내역 조회")
	@PostMapping("/balance-by-year")
	public OutBalanceByYear getBalanceByYear(String year) {
		return accountContentService.selectBalanceByYear(year);
	}
	
	@ApiOperation(value = "기간별 예치금 내역 조회")
	@PostMapping("/balance-by-period")
	public List<OutBalanceByPeriod> getBalanceByPeriod(@RequestBody InBalanceByPeriod period) {
		return accountContentService.selectBalanceByPeriod(period);
	}
	
}
