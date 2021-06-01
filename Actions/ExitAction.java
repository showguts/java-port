package Actions;

import Menu.Action;

public class ExitAction implements Action {

	@Override
	public void doAction() {
		System.exit(0);
	}
}
