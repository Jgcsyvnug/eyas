package com.hdsx.framework.module.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hdsx.framework.json.JsonUtils;
import com.hdsx.framework.module.demo.bean.User;
import com.hdsx.framework.module.demo.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Autowired
	private UserService userService;
	@ResponseBody
	@RequestMapping(value="queryUsers.do",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public void queryUsers(HttpServletRequest request,HttpServletResponse response){
		try 
		{
			List<User> users=userService.selectList();
			JsonUtils.write(users, response.getWriter());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
