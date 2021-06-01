package Entities;

public abstract class Ship {

	private String ShipType;
	
	public String getShipType() {
		return ShipType;
	}

	private Deck[] Deck = new Deck[2];

	public Deck[] getDeck() {
		return Deck;
	}

	public void setDeck(Deck[] deck) {
		Deck = deck;
	}
	
	
}
