package composite;

import java.util.Iterator;

import composite.menu.MenuComponent;
import composite.menu.MenuLeaf;

/**
 * ウェイトレス。
 * 
 * @author TakumiEra
 *
 */
public class Waitress {
	
	/**
	 * メニュー情報。
	 */
	MenuComponent allMenus;
	
	/**
	 * コンストラクタ。
	 */
	public Waitress(MenuComponent aMenuComponent) {
		this.allMenus = aMenuComponent;
	}
	
	/**
	 * メニュー情報をすべて出力する。
	 */
	public void printAllMenu() {
		allMenus.print();
	}
	
	/**
	 * 特定のノードに属するメニュー情報を出力する。
	 * 
	 * @param aIterator
	 */
	public void printMenu(Iterator<MenuComponent> aIterator) {
		System.out.println("\n特定ノードのメニュー\n----");
		while (aIterator.hasNext()) {
			MenuComponent menuComponent = aIterator.next();
			if(menuComponent.isVegetarian()){
				menuComponent.print();
			}
		}
	}
	
	/**
	 * 菜食フラグがTRUEのメニュー情報のみを出力する。
	 */
	public void printVegetarianMenu(){
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\n菜食メニュー\n----");
		while (iterator.hasNext()) {
		    MenuComponent menuComponent = iterator.next();
		    if(menuComponent instanceof MenuLeaf && menuComponent.isVegetarian()){
			    menuComponent.print();
		    }
		}
	}
}
