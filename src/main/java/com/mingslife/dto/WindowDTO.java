package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Window;

public class WindowDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Window toModel() {
		Window model = new Window();
		model.setId(id);
		return model;
	}
}
