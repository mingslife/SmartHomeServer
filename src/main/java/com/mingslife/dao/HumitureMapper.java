package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Humiture;

public interface HumitureMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Humiture record);
	int insertSelective(Humiture record);
	Humiture selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Humiture record);
	int updateByPrimaryKey(Humiture record);
	List<Humiture> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Humiture find(@Param("id") Integer id, @Param("parameters") String parameters);

	List<Humiture> loadByFamilyId(@Param("familyId") Integer familyId);
	Humiture findByFamilyIdAndId(@Param("familyId") Integer familyId, @Param("id") Integer id);
	Humiture findLastestByFamilyId(@Param("familyId") Integer familyId);
}
