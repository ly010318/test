package com.liuyuan.entity;

public class BlankCard {

	private String cardId;
	private String cardName;
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public BlankCard(String cardId, String cardName) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
	}
	public BlankCard() {
		super();
	}
	@Override
	public String toString() {
		return "BlankCard [cardId=" + cardId + ", cardName=" + cardName + "]";
	}
	
}
