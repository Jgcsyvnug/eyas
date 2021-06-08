package com.hdsx.framework.module.demo.mapper;

import java.util.List;

import com.hdsx.framework.dao.Mapper;
import com.hdsx.framework.module.demo.bean.Emp;

@Mapper
public interface EmpMapper {
	
	List<Emp> selectList();
	
	int insert(Emp emp);
}
