package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Card;

public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Card toModel() {
		Card model = new Card();
		model.setId(id);
		return model;
	}
}
