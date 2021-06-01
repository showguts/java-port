package Actions;

import Menu.Action;
import Constructor.Context;

public class DisplayPortInfoAction implements Action {

	@Override
	public void doAction() {
		System.out.println("Port consists " + Context.port.getWater() + " water " + "and " + Context.port.getPeople() + " people");
	}
}
