package Entities;

public class PassengerShip extends Ship {

	private String ShipType = "Passanger";
	
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
