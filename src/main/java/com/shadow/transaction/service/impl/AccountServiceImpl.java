package com.shadow.transaction.service.impl;

import com.shadow.transaction.entity.Account;
import com.shadow.transaction.mapper.AccountMapper;
import com.shadow.transaction.mapper.AccountMapperImpl;
import com.shadow.transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shadow
 * @create 2020-08-19
 * @description
 */
public class AccountServiceImpl implements AccountService {


	private AccountMapper accountMapper;

	public AccountServiceImpl(AccountMapperImpl accountMapper) {
		this.accountMapper = accountMapper;
	}

	@Override
	public int save(Account account) {
		int res = accountMapper.save(account);
		res = 1/0;
		return res;
	}
}
