package Constructor;

import Entities.Port;
import Entities.Ship;
import java.util.ArrayList;

import Menu.MenuInitializer;
import Main.Client;

public class MainInitializer {

	public static void init() {
		initContext();
		initMenu();
		Client.Programm();
	}
	
	private static void initContext() {
		Context.port = new Port();
		Context.waitingShips = new ArrayList<>();
		generatePort();
		generateWaitingShips();
	}
	
	private static void initMenu() {
		MenuInitializer initMenu = new MenuInitializer();
		
	}
	
	private static void generatePort() {
		Port port = new Port();
		port.setWater(0);
		port.setShips(new ArrayList<>());
		Context.port = port;
	}
	
	private static void generateWaitingShips() {
		Context.setWaitingShips(new ArrayList<>());
		ArrayList<Ship> waitingShips = new ArrayList<>();
	}
}
