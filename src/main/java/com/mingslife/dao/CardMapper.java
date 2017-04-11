package com.mingslife.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mingslife.model.Card;

public interface CardMapper {
	int deleteByPrimaryKey(Integer id);
	int insert(Card record);
	int insertSelective(Card record);
	Card selectByPrimaryKey(Integer id);
	int updateByPrimaryKeySelective(Card record);
	int updateByPrimaryKey(Card record);
	List<Card> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);
	Card find(@Param("id") Integer id, @Param("parameters") String parameters);

	List<Card> loadByFamilyId(@Param("familyId") Integer familyId);
	Card findByFamilyIdAndId(@Param("familyId") Integer familyId, @Param("id") Integer id);
	Card findByFamilyIdAndCardNumber(@Param("familyId") Integer familyId, @Param("cardNumber") String cardNumber);
}
