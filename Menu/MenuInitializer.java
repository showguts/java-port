package Menu;

import java.util.ArrayList;
import Actions.DisplayPortInfoAction;
import Actions.DisplayShipsInPortAction;
import Actions.DeleteShipFromPortAction;
import Actions.CreateShipAction;
import Actions.LoadShipToPortAction;
import Actions.ShowQueueAction;
import Actions.ExitAction;

public class MenuInitializer {

	public Menu menu;
	
	public MenuItem root;
	
	public MenuInitializer() {
		menu = new Menu();
		initMenu();
		initRootMenuItem();
		initMenuContext();
	}
	
	private void initMenuContext() {
		MenuContext.menu = new Menu();
		MenuContext.item = new MenuItem();
		MenuContext.menu = this.menu;
		MenuContext.root = this.root;
	}
	
	
	
	private void initRootMenuItem() {
		root = new MenuItem();
		root.Text = "Choose one of the punct of the menu:";
		root.items = new ArrayList<>();
		
		MenuItem displayPortInfo = new MenuItem();
		displayPortInfo.Text = "Water in the port";
		displayPortInfo.action = new DisplayPortInfoAction();
		
		MenuItem displayShipsInPort = new MenuItem();
		displayShipsInPort.Text = "Ships in the port";
		displayShipsInPort.action = new DisplayShipsInPortAction();
		
		MenuItem deleteShipFromPort = new MenuItem();
		deleteShipFromPort.Text = "Delete ship from port";
		deleteShipFromPort.action = new DeleteShipFromPortAction();
		
		MenuItem createShip = new MenuItem();
		createShip.Text = "Create ship";
		createShip.action = new CreateShipAction();
		
		MenuItem showQueue = new MenuItem();
		showQueue.Text = "Show queue";
		showQueue.action = new ShowQueueAction();
		
		MenuItem loadShipToPort = new MenuItem();
		loadShipToPort.Text = "Load ship to port";
		loadShipToPort.action = new LoadShipToPortAction();
		
		MenuItem exit = new MenuItem();
		exit.Text = "Exit";
		exit.action = new ExitAction();
		
		menu.items.add(displayPortInfo);
		menu.items.add(displayShipsInPort);
		menu.items.add(deleteShipFromPort);
		menu.items.add(createShip);
		menu.items.add(showQueue);
		menu.items.add(loadShipToPort);
		menu.items.add(exit);
	}
	
	public void initMenu() {
		
		menu.items = new ArrayList<>();
	}
}
