package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Window;

public class WindowDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Byte status;

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Window toModel() {
		Window model = new Window();
		model.setStatus(status);
		return model;
	}
}
