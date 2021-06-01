package Menu;

import java.util.List;
import java.util.Scanner;

public class Menu {
	
	public List<MenuItem> items;
	
	public List<MenuItem> getItems() {
		return items;
	}
	
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
	
	public void executeUserComand() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		MenuItem item = items.get(num - 1);
		item.action.doAction();
	}
}
