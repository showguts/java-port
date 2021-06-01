package Constructor;

import java.util.List;

import Entities.Port;
import Entities.Ship;

public class Context {

	public static Port port;
	public static List<Ship> waitingShips;
	
	public Port getPort() {
		return port;
	}
	
	public void setPort(Port port) {
		this.port = port;
	}
	
	public static List<Ship> getWaitingShips() {
		return waitingShips;
	}
	
	public static void setWaitingShips(List<Ship> waitingShips) {
		Context.waitingShips = waitingShips;
	}
}
