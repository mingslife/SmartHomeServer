package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Window;

public interface IWindowService {
	void save(Window window);
	void update(Window window);
	void delete(Window window);
	void delete(Integer id);
	Window find(Integer id);
	Window find(Integer id, String[] parameters);
	List<Window> load();
	List<Window> load(String[] parameters);
	List<Window> load(String condition, Object[] values);
	List<Window> load(String[] parameters, String condition, Object[] values);
	List<Window> load(int curPage, int limit);
	List<Window> load(String[] parameters, int curPage, int limit);
	List<Window> load(String condition, Object[] values, int curPage, int limit);
	List<Window> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Window> load(String condition, Object[] values, String order, String sort);
	List<Window> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Window> load(String order, String sort, int curPage, int limit);
	List<Window> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Window> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Window> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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

	List<Window> loadByFamilyId(Integer familyId);
	Window findByFamilyIdAndId(Integer familyId, Integer id);
}
