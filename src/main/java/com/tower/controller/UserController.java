package com.tower.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tower.domain.User;
import com.tower.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/list")
	public List<User> getUsers(){
		return userService.getUsers();
	}
}
