package Actions;

import Constructor.Context;
import Menu.Action;

public class ShowQueueAction implements Action {

	@Override
	public void doAction() {
		System.out.println("There are " + Context.getWaitingShips().size() + " in queue");
	}
}
