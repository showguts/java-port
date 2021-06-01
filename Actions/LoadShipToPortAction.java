package Actions;

import java.util.ArrayList;

import Constructor.Context;
import Menu.Action;
import Entities.Container;
import Entities.Deck;
import Entities.Ship;

public class LoadShipToPortAction implements Action {

	@Override
	public void doAction() {
		
		ArrayList<Ship> ships = Context.port.getShips();
		
		if(Context.port.isPortEmpty()) {
			System.out.println("Port is empty");
		}
		else if(!Context.port.isPortFull())
		{
			ships.add(Context.getWaitingShips().remove(0));
			
			Context.port.setShips(ships);
			getWaterFromShip(Context.port.getShips().indexOf(Context.port.getShips().size()));
			System.out.println("Ship has been loaded");
		}
		else System.out.println("Port is already full");
	}
	
	public void getWaterFromShip(int index) {
		Ship ship = Context.port.getShips().get(index);
		
		for(Deck decks : ship.getDeck()) {
			for(Container cont : decks.getContainer()) {
				Context.port.setWater(Context.port.getWater() + cont.getWater());
			}
		}
	}
	
}
