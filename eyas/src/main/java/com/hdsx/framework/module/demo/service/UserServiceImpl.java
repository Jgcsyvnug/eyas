package com.hdsx.framework.module.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hdsx.framework.module.demo.bean.User;
import com.hdsx.framework.module.demo.mapper.UserMapper;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper mapper;
	@Override
	public List<User> selectList() {
		// TODO Auto-generated method stub
		return mapper.selectList();
	}

}
