package com.tower.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tower.dao.UserDao;
import com.tower.domain.User;
import com.tower.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

}
