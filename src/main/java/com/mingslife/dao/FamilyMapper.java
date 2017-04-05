package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Family;

public interface FamilyMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Family record);
	int insertSelective(Family record);
	Family selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Family record);
	int updateByPrimaryKey(Family record);
	List<Family> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Family find(@Param("id") Integer id, @Param("parameters") String parameters);

	Family findByIdAndToken(@Param("id") Integer id, @Param("token") String token);
}
