package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.NotFoundException;
import com.example.demo.dto.User;
import com.example.demo.service.LoginService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/admin")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
//	@GetMapping("/login")
//	public String login() {
//		//int i = 9/0;
//		String blog = null;
//		if(blog == null) {
//			throw new NotFoundException();
//		}
//		System.out.println("----------login-----------");
//		return "index";
//	}
	
	@GetMapping
	public String login() {
		return "../index";
	}
	
//	/**
//	 * 查询问题列表
//	 * 
//	 * @return
//	 * @since 2019年9月15日
//	 */
//	@RequestMapping(value = "/findUserList/{pageNo}/{pageSize}", method = RequestMethod.POST)
//	public Map<String, Object> findInnerQuestion(@PathVariable("pageNo") Integer pageNo,
//			@PathVariable("pageSize") Integer pageSize, @RequestBody Map<String, String> data, HttpSession session) {
//		User user = (User) session.getAttribute("user");
//		Map<String, Object> result = new HashMap<>();
//		Page<User> page = PageHelper.startPage(pageNo, pageSize);
//		loginService.findUserList(data, user);
//		result.put("total", page.getTotal());
//		result.put("pageNo", page.getPageNum());
//		result.put("pages", page.getPages());
//		result.put("pageSize", page.getPageSize());
//		result.put("rows", page.getResult());
//		return result;
//	}
}
