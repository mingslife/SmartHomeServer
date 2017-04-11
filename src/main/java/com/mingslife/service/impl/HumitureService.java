package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.HumitureMapper;
import com.mingslife.model.Humiture;
import com.mingslife.service.IHumitureService;
import com.mingslife.web.util.SQLUtil;

@Service
public class HumitureService implements IHumitureService {
	@Autowired
	private HumitureMapper humitureMapper;

	@Override
	public void save(Humiture humiture) {
		humitureMapper.insert(humiture);
	}

	@Override
	public void update(Humiture humiture) {
		humitureMapper.updateByPrimaryKeySelective(humiture);
	}

	@Override
	public void delete(Humiture humiture) {
		humitureMapper.deleteByPrimaryKey(humiture.getId());
	}

	@Override
	public void delete(Integer id) {
		humitureMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Humiture find(Integer id) {
		return humitureMapper.selectByPrimaryKey(id);
	}

	@Override
	public Humiture find(Integer id, String[] parameters) {
		return humitureMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Humiture> load() {
		return humitureMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Humiture> load(String[] parameters) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Humiture> load(String condition, Object[] values) {
		return humitureMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Humiture> load(String[] parameters, String condition, Object[] values) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Humiture> load(int curPage, int limit) {
		return humitureMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String[] parameters, int curPage, int limit) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String condition, Object[] values, int curPage, int limit) {
		return humitureMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String condition, Object[] values, String order, String sort) {
		return humitureMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Humiture> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Humiture> load(String order, String sort, int curPage, int limit) {
		return humitureMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return humitureMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Humiture> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return humitureMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return humitureMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return humitureMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return humitureMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return humitureMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return humitureMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return humitureMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return humitureMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return humitureMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return humitureMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return humitureMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public List<Humiture> loadByFamilyId(Integer familyId) {
		return humitureMapper.loadByFamilyId(familyId);
	}

	@Override
	public Humiture findByFamilyIdAndId(Integer familyId, Integer id) {
		return humitureMapper.findByFamilyIdAndId(familyId, id);
	}

	@Override
	public Humiture findLastestByFamilyId(Integer familyId) {
		return humitureMapper.findLastestByFamilyId(familyId);
	}
}
