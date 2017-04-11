package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Lamp;

public interface ILampService {
	void save(Lamp lamp);
	void update(Lamp lamp);
	void delete(Lamp lamp);
	void delete(Integer id);
	Lamp find(Integer id);
	Lamp find(Integer id, String[] parameters);
	List<Lamp> load();
	List<Lamp> load(String[] parameters);
	List<Lamp> load(String condition, Object[] values);
	List<Lamp> load(String[] parameters, String condition, Object[] values);
	List<Lamp> load(int curPage, int limit);
	List<Lamp> load(String[] parameters, int curPage, int limit);
	List<Lamp> load(String condition, Object[] values, int curPage, int limit);
	List<Lamp> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Lamp> load(String condition, Object[] values, String order, String sort);
	List<Lamp> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Lamp> load(String order, String sort, int curPage, int limit);
	List<Lamp> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Lamp> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Lamp> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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

	List<Lamp> loadByFamilyId(Integer familyId);
	Lamp findByFamilyIdAndId(Integer familyId, Integer id);
}
