package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.WindowMapper;
import com.mingslife.model.Window;
import com.mingslife.service.IWindowService;
import com.mingslife.web.util.SQLUtil;

@Service
public class WindowService implements IWindowService {
	@Autowired
	private WindowMapper windowMapper;

	@Override
	public void save(Window window) {
		windowMapper.insert(window);
	}

	@Override
	public void update(Window window) {
		windowMapper.updateByPrimaryKeySelective(window);
	}

	@Override
	public void delete(Window window) {
		windowMapper.deleteByPrimaryKey(window.getId());
	}

	@Override
	public void delete(Integer id) {
		windowMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Window find(Integer id) {
		return windowMapper.selectByPrimaryKey(id);
	}

	@Override
	public Window find(Integer id, String[] parameters) {
		return windowMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Window> load() {
		return windowMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Window> load(String[] parameters) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Window> load(String condition, Object[] values) {
		return windowMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Window> load(String[] parameters, String condition, Object[] values) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Window> load(int curPage, int limit) {
		return windowMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String[] parameters, int curPage, int limit) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String condition, Object[] values, int curPage, int limit) {
		return windowMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String condition, Object[] values, String order, String sort) {
		return windowMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Window> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Window> load(String order, String sort, int curPage, int limit) {
		return windowMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return windowMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Window> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return windowMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return windowMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return windowMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return windowMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return windowMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return windowMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return windowMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return windowMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return windowMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return windowMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return windowMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public List<Window> loadByFamilyId(Integer familyId) {
		return windowMapper.loadByFamilyId(familyId);
	}

	@Override
	public Window findByFamilyIdAndId(Integer familyId, Integer id) {
		return windowMapper.findByFamilyIdAndId(familyId, id);
	}
}
