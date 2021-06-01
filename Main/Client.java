package Main;

import Menu.MenuContext;

public class Client {

	public static void Programm() {
		System.out.println(MenuContext.root.Text);
		
		while(true)
		{
			for(int i = 0; i < MenuContext.menu.getItems().size(); i++) {
				System.out.println( (i + 1) + "." + MenuContext.menu.getItems().get(i).Text);
			}
		
			MenuContext.menu.executeUserComand();
		}
	}
}
