package com.mingslife.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mingslife.web.annotation.CreateDate;
import com.mingslife.web.annotation.UpdateDate;

public class Card implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cardNumber;
	private Integer familyId;
	@JsonIgnore
	@CreateDate
	private Date createDate;
	@JsonIgnore
	@UpdateDate
	private Date updateDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getFamilyId() {
		return familyId;
	}

	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
