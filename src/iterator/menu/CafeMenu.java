package iterator.menu;

import java.util.Hashtable;
import java.util.Iterator;


public class CafeMenu implements Menu{

	/**
	 * メニュー情報。
	 */
	Hashtable<String, MenuItem> menuItems = new Hashtable<String, MenuItem>();
	
	/**
	 * コンストラクタ。
	 */
	public CafeMenu() {
		addItem("野菜バーガーとフライドポテト", "全粒小麦パンにレタスとトマトをはさんだ野菜バーガーとフライドポテト", true, 3.99);
		addItem("本日のスープ", "サラダが付いた本日のスープ", false, 3.69);
		addItem("ブリトー", "インゲン豆、サルサ、グアカモーレ入りの大きなブリトー", true, 4.29);
	}
	
	/**
	 * メニューを追加する。
	 * 
	 * @param aName
	 * @param aDescription
	 * @param aVegitarian
	 * @param aPrice
	 */
	private void addItem(String aName, String aDescription, boolean aVegitarian, double aPrice) {
		MenuItem menuItem = new MenuItem(aName, aDescription, aVegitarian, aPrice);
		this.menuItems.put(menuItem.getName(), menuItem);
	}

	/**
	 * メニュー情報を取得する。
	 * 
	 * @return
	 */
	public Hashtable<String, MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return this.menuItems.values().iterator();
	}

}
