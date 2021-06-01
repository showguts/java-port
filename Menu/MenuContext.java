package Menu;

public class MenuContext {

	public static Menu menu;
	public static MenuItem item;
	public static MenuItem root;
	
	public Menu getMenu() {
		return menu;
	}
	
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public MenuItem getItem() {
		return item;
	}
	
	public void setItem(MenuItem item) {
		this.item = item;
	}
}
