package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Family;

public class FamilyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Family toModel() {
		Family model = new Family();
		model.setId(id);
		return model;
	}
}
