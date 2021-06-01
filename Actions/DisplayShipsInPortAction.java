package Actions;

import Constructor.Context;
import Menu.Action;

public class DisplayShipsInPortAction implements Action {

	@Override
	public void doAction() {
		System.out.println("There are " + Context.port.getShips().size() + " ships in the port");
	}
}
