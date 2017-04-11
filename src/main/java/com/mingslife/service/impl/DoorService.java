package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.DoorMapper;
import com.mingslife.model.Door;
import com.mingslife.service.IDoorService;
import com.mingslife.web.util.SQLUtil;

@Service
public class DoorService implements IDoorService {
	@Autowired
	private DoorMapper doorMapper;

	@Override
	public void save(Door door) {
		doorMapper.insert(door);
	}

	@Override
	public void update(Door door) {
		doorMapper.updateByPrimaryKeySelective(door);
	}

	@Override
	public void delete(Door door) {
		doorMapper.deleteByPrimaryKey(door.getId());
	}

	@Override
	public void delete(Integer id) {
		doorMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Door find(Integer id) {
		return doorMapper.selectByPrimaryKey(id);
	}

	@Override
	public Door find(Integer id, String[] parameters) {
		return doorMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Door> load() {
		return doorMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Door> load(String[] parameters) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Door> load(String condition, Object[] values) {
		return doorMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Door> load(String[] parameters, String condition, Object[] values) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Door> load(int curPage, int limit) {
		return doorMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String[] parameters, int curPage, int limit) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String condition, Object[] values, int curPage, int limit) {
		return doorMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String condition, Object[] values, String order, String sort) {
		return doorMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Door> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Door> load(String order, String sort, int curPage, int limit) {
		return doorMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return doorMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Door> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return doorMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return doorMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return doorMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return doorMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return doorMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return doorMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return doorMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return doorMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return doorMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return doorMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return doorMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public List<Door> loadByFamilyId(Integer familyId) {
		return doorMapper.loadByFamilyId(familyId);
	}

	@Override
	public Door findByFamilyIdAndId(Integer familyId, Integer id) {
		return doorMapper.findByFamilyIdAndId(familyId, id);
	}
}
