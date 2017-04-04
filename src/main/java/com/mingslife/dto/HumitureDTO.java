package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Humiture;

public class HumitureDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Humiture toModel() {
		Humiture model = new Humiture();
		model.setId(id);
		return model;
	}
}
