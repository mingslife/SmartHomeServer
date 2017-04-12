package com.mingslife.service;

import java.util.List;

import com.mingslife.model.Alert;

public interface IAlertService {
	void save(Alert alert);
	void update(Alert alert);
	void delete(Alert alert);
	void delete(Integer id);
	Alert find(Integer id);
	Alert find(Integer id, String[] parameters);
	List<Alert> load();
	List<Alert> load(String[] parameters);
	List<Alert> load(String condition, Object[] values);
	List<Alert> load(String[] parameters, String condition, Object[] values);
	List<Alert> load(int curPage, int limit);
	List<Alert> load(String[] parameters, int curPage, int limit);
	List<Alert> load(String condition, Object[] values, int curPage, int limit);
	List<Alert> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Alert> load(String condition, Object[] values, String order, String sort);
	List<Alert> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Alert> load(String order, String sort, int curPage, int limit);
	List<Alert> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Alert> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Alert> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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

	List<Alert> loadByFamilyId(Integer familyId);
	Alert findByFamilyIdAndId(Integer familyId, Integer id);
	Alert findLastestByFamilyId(Integer familyId);
}
