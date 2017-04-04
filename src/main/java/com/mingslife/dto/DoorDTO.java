package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Door;

public class DoorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Door toModel() {
		Door model = new Door();
		model.setId(id);
		return model;
	}
}
