package com.shadow.transaction.mapper;

import com.shadow.transaction.entity.Account;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author shadow
 * @create 2020-08-19
 * @description
 */
public class AccountMapperImpl implements AccountMapper {

	private JdbcTemplate jdbcTemplate;

	public AccountMapperImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Account account) {
		String sql = "INSERT INTO account(`name`) VALUES(?)";
		return jdbcTemplate.update(sql,new Object[]{account.getName()},new int[]{1});
	}
}
