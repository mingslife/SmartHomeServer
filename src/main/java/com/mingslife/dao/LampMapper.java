package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Lamp;

public interface LampMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Lamp record);
	int insertSelective(Lamp record);
	Lamp selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Lamp record);
	int updateByPrimaryKey(Lamp record);
	List<Lamp> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Lamp find(@Param("id") Integer id, @Param("parameters") String parameters);

	List<Lamp> loadByFamilyId(@Param("familyId") Integer familyId);
	Lamp findByFamilyIdAndId(@Param("familyId") Integer familyId, @Param("id") Integer id);
}
