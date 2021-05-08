package com.hdsx.framework.module.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hdsx.framework.module.demo.bean.Emp;
import com.hdsx.framework.module.demo.mapper.EmpMapper;
@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpMapper mapper;
	@Override
	public List<Emp> selectList() {
		// TODO Auto-generated method stub
		return mapper.selectList();
	}
	@Override
	public boolean insert(Emp emp) {
		// TODO Auto-generated method stub
		return mapper.insert(emp)>0;
	}

}
