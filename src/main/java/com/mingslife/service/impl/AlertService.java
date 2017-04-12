package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.AlertMapper;
import com.mingslife.model.Alert;
import com.mingslife.service.IAlertService;
import com.mingslife.web.util.SQLUtil;

@Service
public class AlertService implements IAlertService {
	@Autowired
	private AlertMapper alertMapper;

	@Override
	public void save(Alert alert) {
		alertMapper.insert(alert);
	}

	@Override
	public void update(Alert alert) {
		alertMapper.updateByPrimaryKeySelective(alert);
	}

	@Override
	public void delete(Alert alert) {
		alertMapper.deleteByPrimaryKey(alert.getId());
	}

	@Override
	public void delete(Integer id) {
		alertMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Alert find(Integer id) {
		return alertMapper.selectByPrimaryKey(id);
	}

	@Override
	public Alert find(Integer id, String[] parameters) {
		return alertMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Alert> load() {
		return alertMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Alert> load(String[] parameters) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Alert> load(String condition, Object[] values) {
		return alertMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Alert> load(String[] parameters, String condition, Object[] values) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Alert> load(int curPage, int limit) {
		return alertMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String[] parameters, int curPage, int limit) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String condition, Object[] values, int curPage, int limit) {
		return alertMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String condition, Object[] values, String order, String sort) {
		return alertMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Alert> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Alert> load(String order, String sort, int curPage, int limit) {
		return alertMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return alertMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Alert> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return alertMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return alertMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return alertMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return alertMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return alertMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return alertMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return alertMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return alertMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return alertMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return alertMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return alertMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public List<Alert> loadByFamilyId(Integer familyId) {
		return alertMapper.loadByFamilyId(familyId);
	}

	@Override
	public Alert findByFamilyIdAndId(Integer familyId, Integer id) {
		return alertMapper.findByFamilyIdAndId(familyId, id);
	}

	@Override
	public Alert findLastestByFamilyId(Integer familyId) {
		return alertMapper.findLastestByFamilyId(familyId);
	}
}
