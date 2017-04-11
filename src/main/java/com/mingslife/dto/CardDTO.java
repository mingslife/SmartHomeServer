package com.mingslife.dto;

import java.io.Serializable;

import com.mingslife.model.Card;

public class CardDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String cardNumber;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Card toModel() {
		Card model = new Card();
		model.setCardNumber(cardNumber);
		return model;
	}
}
