package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Family;

public class FamilyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Family toModel() {
		Family model = new Family();
		model.setToken(token);
		return model;
	}
}
