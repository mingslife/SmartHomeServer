package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Alert;

public class AlertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Alert toModel() {
		Alert model = new Alert();
		model.setId(id);
		return model;
	}
}
