package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.FamilyMapper;
import com.mingslife.model.Family;
import com.mingslife.service.IFamilyService;
import com.mingslife.web.util.SQLUtil;

@Service
public class FamilyService implements IFamilyService {
	@Autowired
	private FamilyMapper familyMapper;

	@Override
	public void save(Family family) {
		familyMapper.insert(family);
	}

	@Override
	public void update(Family family) {
		familyMapper.updateByPrimaryKeySelective(family);
	}

	@Override
	public void delete(Family family) {
		familyMapper.deleteByPrimaryKey(family.getId());
	}

	@Override
	public void delete(Integer id) {
		familyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Family find(Integer id) {
		return familyMapper.selectByPrimaryKey(id);
	}

	@Override
	public Family find(Integer id, String[] parameters) {
		return familyMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Family> load() {
		return familyMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Family> load(String[] parameters) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Family> load(String condition, Object[] values) {
		return familyMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Family> load(String[] parameters, String condition, Object[] values) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Family> load(int curPage, int limit) {
		return familyMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String[] parameters, int curPage, int limit) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String condition, Object[] values, int curPage, int limit) {
		return familyMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String condition, Object[] values, String order, String sort) {
		return familyMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Family> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Family> load(String order, String sort, int curPage, int limit) {
		return familyMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return familyMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Family> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return familyMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return familyMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return familyMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return familyMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return familyMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return familyMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return familyMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return familyMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return familyMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return familyMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return familyMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public Family findByIdAndToken(Integer id, String token) {
		return familyMapper.findByIdAndToken(id, token);
	}
}
