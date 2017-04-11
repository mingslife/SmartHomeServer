package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Door;

public class DoorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Byte status;

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Door toModel() {
		Door model = new Door();
		model.setStatus(status);
		return model;
	}
}
