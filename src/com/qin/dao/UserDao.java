package com.qin.dao;

import java.util.List;

import com.qin.pojo.User;

public interface UserDao {
	public User findUserById(Integer id);
	public List<User> findUserByUserName(String userName);


}
