package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Humiture;

public interface IHumitureService {
	void save(Humiture humiture);
	void update(Humiture humiture);
	void delete(Humiture humiture);
	void delete(Integer id);
	Humiture find(Integer id);
	Humiture find(Integer id, String[] parameters);
	List<Humiture> load();
	List<Humiture> load(String[] parameters);
	List<Humiture> load(String condition, Object[] values);
	List<Humiture> load(String[] parameters, String condition, Object[] values);
	List<Humiture> load(int curPage, int limit);
	List<Humiture> load(String[] parameters, int curPage, int limit);
	List<Humiture> load(String condition, Object[] values, int curPage, int limit);
	List<Humiture> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Humiture> load(String condition, Object[] values, String order, String sort);
	List<Humiture> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Humiture> load(String order, String sort, int curPage, int limit);
	List<Humiture> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Humiture> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Humiture> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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

	List<Humiture> loadByFamilyId(Integer familyId);
	Humiture findByFamilyIdAndId(Integer familyId, Integer id);
	Humiture findLastestByFamilyId(Integer familyId);
}
