package com.tower.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tower.domain.User;
//@Mapper
public interface UserDao {
	public List<User> getUsers();
}
