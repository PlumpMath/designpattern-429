package iterator;

import java.util.Iterator;

import iterator.menu.Menu;
import iterator.menu.MenuItem;

/**
 * ウェイトレス。
 * 
 * @author TakumiEra
 *
 */
public class Waitress {
	
	/**
	 * パンケーキハウスのメニュー情報。
	 */
	private Menu pancakeHouseMenu;
	
	/**
	 * ダイナーのメニュー情報。
	 */
	private Menu dinerMenu;
	
	/**
	 * カフェのメニュー情報。
	 */
	private Menu cafeMenu;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aPancakeHouseMenu
	 * @param aDinerMenu
	 */
	public Waitress(Menu aPancakeHouseMenu,Menu aDinerMenu,Menu aCafeMenu) {
		this.pancakeHouseMenu = aPancakeHouseMenu;
		this.dinerMenu = aDinerMenu;
		this.cafeMenu = aCafeMenu;
	}
	
	/**
	 * メニュー情報を表示する。
	 */
	public void printMenu(){
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("メニュー\n----\n朝食");
		printMenu(pancakeIterator);
		
		System.out.println("\n昼食");
		printMenu(dinerIterator);
		
		System.out.println("\n夕食");
		printMenu(cafeIterator);
		
	}
	
	/**
	 * メニュー情報を表示する。
	 * 
	 * @param aIterator
	 */
	private void printMenu(Iterator<MenuItem> aIterator){
		while (aIterator.hasNext()) {
			MenuItem menuItem = aIterator.next();
			System.out.print(menuItem.getName() + "、");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
