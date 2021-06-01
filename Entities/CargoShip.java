package Entities;

public class CargoShip extends Ship {
	
	private String ShipType = "Cargo";
	
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
