package Actions;

import java.util.ArrayList;

import Menu.Action;
import Constructor.Context;

import Entities.Ship;

public class DeleteShipFromPortAction implements Action {

	@Override
	public void doAction() {
		
		if(!Context.port.isPortEmpty())
		{
			
			ArrayList<Ship> ships = Context.port.getShips();
			//ships.remove(0);
			Ship ship = ships.remove(0);
			if(ship.getClass().getName() == "PassangerShip") {
				int people;
				
				if(Context.port.getPeople() >= 1000) {
					people = (int)Math.random()*1001;
				}
				else {
					people = (int)Math.random()*(Context.port.getPeople() + 1);
				}
				
				Context.port.setPeople(Context.port.getPeople() - people);
			}
			Context.port.setShips(ships);
			
			System.out.println("Ship has been deleted");
		}
		else {
			System.out.println("There are no ship in the port");
		}
	}
}
