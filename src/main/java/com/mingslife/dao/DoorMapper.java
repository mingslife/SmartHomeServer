package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Door;

public interface DoorMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Door record);
	int insertSelective(Door record);
	Door selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Door record);
	int updateByPrimaryKey(Door record);
	List<Door> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Door find(@Param("id") Integer id, @Param("parameters") String parameters);

	List<Door> loadByFamilyId(@Param("familyId") Integer familyId);
	Door findByFamilyIdAndId(@Param("familyId") Integer familyId, @Param("id") Integer id);
}
