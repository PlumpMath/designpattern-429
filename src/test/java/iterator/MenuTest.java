package iterator;

import iterator.menu.CafeMenu;
import iterator.menu.DinerMenu;
import iterator.menu.PancakeHouseMenu;

import org.junit.Test;

public class MenuTest {

	@Test
	public void test() throws Exception {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu,cafeMenu);
		
		waitress.printMenu();
	}
	
}
