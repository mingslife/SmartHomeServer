package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Family;

public interface IFamilyService {
	void save(Family family);
	void update(Family family);
	void delete(Family family);
	void delete(Integer id);
	Family find(Integer id);
	Family find(Integer id, String[] parameters);
	List<Family> load();
	List<Family> load(String[] parameters);
	List<Family> load(String condition, Object[] values);
	List<Family> load(String[] parameters, String condition, Object[] values);
	List<Family> load(int curPage, int limit);
	List<Family> load(String[] parameters, int curPage, int limit);
	List<Family> load(String condition, Object[] values, int curPage, int limit);
	List<Family> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Family> load(String condition, Object[] values, String order, String sort);
	List<Family> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Family> load(String order, String sort, int curPage, int limit);
	List<Family> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Family> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Family> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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

	Family findByIdAndToken(Integer id, String token);
}
