package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Card;

public interface ICardService {
	void save(Card card);
	void update(Card card);
	void delete(Card card);
	void delete(Integer id);
	Card find(Integer id);
	Card find(Integer id, String[] parameters);
	List<Card> load();
	List<Card> load(String[] parameters);
	List<Card> load(String condition, Object[] values);
	List<Card> load(String[] parameters, String condition, Object[] values);
	List<Card> load(int curPage, int limit);
	List<Card> load(String[] parameters, int curPage, int limit);
	List<Card> load(String condition, Object[] values, int curPage, int limit);
	List<Card> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Card> load(String condition, Object[] values, String order, String sort);
	List<Card> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Card> load(String order, String sort, int curPage, int limit);
	List<Card> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Card> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Card> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
	long count();
	long count(String condition, Object[] values);
	long count(String[] parameters, boolean isDistinct);
	long count(String[] parameters, String condition, Object[] values, boolean isDistinct);
	double sum(String parameter);
	double sum(String parameter, String condition, Object[] values);
	double sum(String parameter, String order, String sort, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct);

	List<Card> loadByFamilyId(Integer familyId);
	Card findByFamilyIdAndId(Integer familyId, Integer id);
	Card findByFamilyIdAndCardNumber(Integer familyId, String cardNumber);
}
