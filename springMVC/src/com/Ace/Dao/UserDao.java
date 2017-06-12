package com.Ace.Dao;

@MyBatisRepository
public interface UserDao {

	public boolean login(String userName, String pwd);
}
