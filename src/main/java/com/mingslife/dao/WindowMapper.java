package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Window;

public interface WindowMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Window record);
	int insertSelective(Window record);
	Window selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Window record);
	int updateByPrimaryKey(Window record);
	List<Window> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Window find(@Param("id") Integer id, @Param("parameters") String parameters);

	List<Window> loadByFamilyId(@Param("familyId") Integer familyId);
	Window findByFamilyIdAndId(@Param("familyId") Integer familyId, @Param("id") Integer id);
}
