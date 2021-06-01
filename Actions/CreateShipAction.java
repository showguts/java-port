package Actions;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import Constructor.Context;
import Entities.Container;
import Entities.CargoShip;
import Entities.Ship;
import Entities.PassengerShip;
import Menu.Action;
import Entities.Deck;

public class CreateShipAction implements Action {

	@Override
	public void doAction() {
		
		
		int shipType = (int)(Math.random()*2);
		Ship ship;
		System.out.println(shipType);
		if(shipType == 0) {
			ship = new CargoShip();
			ship.setDeck(generateDecks(shipType));
			System.out.println("Cargo ship");
		}
		else {
			ship = new PassengerShip();
			ship.setDeck(generateDecks(shipType));
			System.out.println("Passegner Ship");
		}
		
		if(!Context.port.isPortFull()) {
			
			ArrayList<Ship> ships = Context.port.getShips();
			ships.add(ship);
		
			Context.port.setShips(ships);
			if(ship.getClass().getName() == PassengerShip.class.getName()) {
				Context.port.setPeople(Context.port.getPeople() + getPeopleFromShip(ship));
			}
			else Context.port.setWater(Context.port.getWater() + getWaterFromShip(ship));
			
			System.out.println("Ship has been added");
		}
		else {
			
			List<Ship> waitingShips = Context.getWaitingShips();
			waitingShips.add(ship);
			
			Context.setWaitingShips(waitingShips);
			
			System.out.println("Ship has been added to queue");
		}
		
	}
	
	public int getPeopleFromShip(Ship ship) {
		
		int people;
		people = ship.getDeck()[0].getPeople() + ship.getDeck()[1].getPeople();
		
		//Context.port.setPeople(Context.port.getPeople() + people);
		return people;
	}
	
	public int getWaterFromShip(Ship ship) {
		int water = 0;
		for(Deck decks : ship.getDeck()) {
			for(Container cont : decks.getContainer()) {
				//Context.port.setWater(Context.port.getWater() + cont.getWater());
				water += cont.getWater();
			}
		}
		return water;
	}
	
	public Deck[] generateDecks(int type) {
		
		Deck[] decks = new Deck[2];
		
		decks[0] = new Deck();
		decks[1] = new Deck();
		
		if(type == 0) {
		
		
		decks[0].setContainer(generateContainers());
		decks[1].setContainer(generateContainers());
	
		return decks;
		}
		
		decks[0].setPeoples(generatePassangers());
		decks[1].setPeoples(generatePassangers());
		
		return decks;
	}
	
	public int generatePassangers() {
		
		int passangers = (int)(Math.random()*501);
		
		return passangers;
	}
	
	public Container[] generateContainers() {
		
		int amountOfContainers = (int)(Math.random()*3);

		Container[] container = new Container[amountOfContainers];
		
		if(amountOfContainers == 1)
		{
			container[0] = new Container();
			container[0] = generateContainer();
		}
		
		else if(amountOfContainers == 2)
		{
			for(int i = 0; i < amountOfContainers; i++)
			{
				container[i] = new Container();
				container[i].setBig(false);
			}
		}
		
		return container;
	}
	
	public Container generateContainer() {
		
		Container container = new Container();
		
		Random random = new Random();
		container.setBig(random.nextBoolean());
		if(container.isBig())container.setWater(1000);
		else container.setWater(450);
		
		return container;
	}
	
}
