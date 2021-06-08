package com.hdsx.framework.module.demo.service;


import java.util.List;

import com.hdsx.framework.module.demo.bean.Emp;


public interface EmpService {
	
	List<Emp> selectList();
	
	boolean insert(Emp emp);
}
