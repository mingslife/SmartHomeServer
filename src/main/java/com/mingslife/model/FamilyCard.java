package com.mingslife.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mingslife.web.annotation.CreateDate;
import com.mingslife.web.annotation.UpdateDate;

public class FamilyCard implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer familyId;
	private Integer cardId;
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

	public Integer getFamilyId() {
		return familyId;
	}

	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
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
