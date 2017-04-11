package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Lamp;

public class LampDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Byte status;

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Lamp toModel() {
		Lamp model = new Lamp();
		model.setStatus(status);
		return model;
	}
}
