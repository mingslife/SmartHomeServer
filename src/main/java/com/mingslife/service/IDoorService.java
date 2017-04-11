package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Door;

public interface IDoorService {
	void save(Door door);
	void update(Door door);
	void delete(Door door);
	void delete(Integer id);
	Door find(Integer id);
	Door find(Integer id, String[] parameters);
	List<Door> load();
	List<Door> load(String[] parameters);
	List<Door> load(String condition, Object[] values);
	List<Door> load(String[] parameters, String condition, Object[] values);
	List<Door> load(int curPage, int limit);
	List<Door> load(String[] parameters, int curPage, int limit);
	List<Door> load(String condition, Object[] values, int curPage, int limit);
	List<Door> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Door> load(String condition, Object[] values, String order, String sort);
	List<Door> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Door> load(String order, String sort, int curPage, int limit);
	List<Door> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Door> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Door> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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

	List<Door> loadByFamilyId(Integer familyId);
	Door findByFamilyIdAndId(Integer familyId, Integer id);
}
