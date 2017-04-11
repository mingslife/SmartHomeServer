package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Alert;

public class AlertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Alert toModel() {
		Alert model = new Alert();
		model.setMessage(message);
		return model;
	}
}
