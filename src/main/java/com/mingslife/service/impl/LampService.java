package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.LampMapper;
import com.mingslife.model.Lamp;
import com.mingslife.service.ILampService;
import com.mingslife.web.util.SQLUtil;

@Service
public class LampService implements ILampService {
	@Autowired
	private LampMapper lampMapper;

	@Override
	public void save(Lamp lamp) {
		lampMapper.insert(lamp);
	}

	@Override
	public void update(Lamp lamp) {
		lampMapper.updateByPrimaryKeySelective(lamp);
	}

	@Override
	public void delete(Lamp lamp) {
		lampMapper.deleteByPrimaryKey(lamp.getId());
	}

	@Override
	public void delete(Integer id) {
		lampMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Lamp find(Integer id) {
		return lampMapper.selectByPrimaryKey(id);
	}

	@Override
	public Lamp find(Integer id, String[] parameters) {
		return lampMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Lamp> load() {
		return lampMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Lamp> load(String[] parameters) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Lamp> load(String condition, Object[] values) {
		return lampMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Lamp> load(String[] parameters, String condition, Object[] values) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Lamp> load(int curPage, int limit) {
		return lampMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String[] parameters, int curPage, int limit) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String condition, Object[] values, int curPage, int limit) {
		return lampMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String condition, Object[] values, String order, String sort) {
		return lampMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Lamp> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Lamp> load(String order, String sort, int curPage, int limit) {
		return lampMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return lampMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Lamp> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return lampMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return lampMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return lampMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return lampMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return lampMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return lampMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return lampMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return lampMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return lampMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return lampMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return lampMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public List<Lamp> loadByFamilyId(Integer familyId) {
		return lampMapper.loadByFamilyId(familyId);
	}

	@Override
	public Lamp findByFamilyIdAndId(Integer familyId, Integer id) {
		return lampMapper.findByFamilyIdAndId(familyId, id);
	}
}
