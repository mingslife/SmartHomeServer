package com.mingslife.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingslife.dao.CardMapper;
import com.mingslife.model.Card;
import com.mingslife.service.ICardService;
import com.mingslife.web.util.SQLUtil;

@Service
public class CardService implements ICardService {
	@Autowired
	private CardMapper cardMapper;

	@Override
	public void save(Card card) {
		cardMapper.insert(card);
	}

	@Override
	public void update(Card card) {
		cardMapper.updateByPrimaryKeySelective(card);
	}

	@Override
	public void delete(Card card) {
		cardMapper.deleteByPrimaryKey(card.getId());
	}

	@Override
	public void delete(Integer id) {
		cardMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Card find(Integer id) {
		return cardMapper.selectByPrimaryKey(id);
	}

	@Override
	public Card find(Integer id, String[] parameters) {
		return cardMapper.find(id, SQLUtil.formatParameters(parameters));
	}

	@Override
	public List<Card> load() {
		return cardMapper.select(null, null, null, null, -1, -1);
	}

	@Override
	public List<Card> load(String[] parameters) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}

	@Override
	public List<Card> load(String condition, Object[] values) {
		return cardMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Card> load(String[] parameters, String condition, Object[] values) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}

	@Override
	public List<Card> load(int curPage, int limit) {
		return cardMapper.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String[] parameters, int curPage, int limit) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String condition, Object[] values, int curPage, int limit) {
		return cardMapper.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String condition, Object[] values, String order, String sort) {
		return cardMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Card> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}

	@Override
	public List<Card> load(String order, String sort, int curPage, int limit) {
		return cardMapper.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return cardMapper.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public List<Card> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return cardMapper.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}

	@Override
	public long count() {
		return cardMapper.count(null, null, false);
	}

	@Override
	public long count(String condition, Object[] values) {
		return cardMapper.count(null, SQLUtil.fillCondition(condition, values), false);
	}

	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return cardMapper.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}

	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return cardMapper.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}

	@Override
	public double sum(String parameter) {
		return cardMapper.sum(parameter, null, null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return cardMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}

	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return cardMapper.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return cardMapper.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return cardMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}

	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return cardMapper.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}

	@Override
	public List<Card> loadByFamilyId(Integer familyId) {
		return cardMapper.loadByFamilyId(familyId);
	}

	@Override
	public Card findByFamilyIdAndId(Integer familyId, Integer id) {
		return cardMapper.findByFamilyIdAndId(familyId, id);
	}

	@Override
	public Card findByFamilyIdAndCardNumber(Integer familyId, String cardNumber) {
		return cardMapper.findByFamilyIdAndCardNumber(familyId, cardNumber);
	}
}
