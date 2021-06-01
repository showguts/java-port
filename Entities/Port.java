package Entities;

import java.util.ArrayList;


public class Port {
	private ArrayList<Ship> Ships = new ArrayList<Ship>();
	private long Water = 0;
	private int People = 0;

	public int getPeople() {
		return People;
	}

	public void setPeople(int people) {
		People = people;
	}

	public ArrayList<Ship> getShips() {
		return Ships;
	}

	public void setShips(ArrayList<Ship> ships) {
		Ships = ships;
	}

	public long getWater() {
		return Water;
	}
	

	public void setWater(long water) {
		Water = water;
	}
	
	public boolean isPortFull() {
		
		if(Ships.size() == 10) {
			return true;
		}
		return false;
	}

	public boolean isPortEmpty() {
		if(Ships.size() == 0) {
			return true;
		}
		
		return false;
	}
	
}
