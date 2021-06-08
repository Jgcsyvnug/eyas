package com.hdsx.framework.dao;

import java.util.List;
import java.util.Map;

/**
 * dao基本操作
 * @author xiongxt
 * @2015年3月15日
 * @param <T>
 */
public interface Dao<T> {
	/**
	 * 插入数据
	 * @param t
	 * @return
	 */
	int insert(T t);
	/**
	 * 批量插入数据
	 * @param ts
	 * @return
	 */
	int insertBatch(List<T> ts);
	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	int delete(String id);
	/**
	 * 批量删除数据
	 * @param ids
	 * @return
	 */
	int deleteBatch(List<String> ids);
	/**
	 * 修改数据
	 * @param t
	 * @return
	 */
	int update(T t);
	/**
	 * 批量修改数据
	 * @param param： 修改条件和数据
	 * {"ids":["12343","234234"],"sbzt":"1","shzt":"1"}
	 * @return
	 */
	int updateBatch(Map<String,String> param);
	
	/**
	 * 单一查询
	 * @param id：唯一标识
	 * @return
	 */
	T selectOne(String id);
	
	/**
	 * 唯一查询
	 * @param unique：唯一属性值
	 * @return
	 */
	T selectUnique(String unique);
	
	/**
	 * 条件查询
	 * @param param
	 * @return
	 */
	List<T> selectPage(Map<String,Object> param);
	
	/**
	 * 条件统计
	 * @param param
	 * @return
	 */
	int count(Map<String,Object> param);
	
}
