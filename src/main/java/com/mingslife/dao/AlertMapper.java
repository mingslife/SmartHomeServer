package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Alert;

public interface AlertMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Alert record);
	int insertSelective(Alert record);
	Alert selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Alert record);
	int updateByPrimaryKey(Alert record);
	List<Alert> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Alert find(@Param("id") Integer id, @Param("parameters") String parameters);

	List<Alert> loadByFamilyId(@Param("familyId") Integer familyId);
	Alert findByFamilyIdAndId(@Param("familyId") Integer familyId, @Param("id") Integer id);
	Alert findLastestByFamilyId(@Param("familyId") Integer familyId);
}
