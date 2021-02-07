package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.User;
import com.example.demo.mapper.SystemMapper;

@Service
public class LoginService {
	@Autowired
	private SystemMapper systemMapper;
	
	public List<User> findUserList(Map<String, String> data, User user) {
		List<User> list = systemMapper.findUserList(data);
		return list;
	}

}
