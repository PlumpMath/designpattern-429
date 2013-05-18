package iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * パンケーキハウスで提供している料理のメニュー。
 * 
 * @author TakumiEra
 *
 */
public class PancakeHouseMenu implements Menu{

	/**
	 * メニュー情報。
	 */
	ArrayList<MenuItem> menuItems;
	
	/**
	 * コンストラクタ。
	 */
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
        addItem("K&Bのパンケーキ朝食", "スクランブルエッグとトーストが付いたパンケーキ", true, 2.99);
        addItem("通常のパンケーキ朝食", "卵焼きとソーセージが付いたパンケーキ", false, 2.99);
        addItem("ブルーベリーパンケーキ", "新鮮なブルーベリーで作ったパンケーキ", true, 3.49);
        addItem("ワッフル", "ブルーベリーか苺の好きな方を乗せたワッフル", true, 3.59);
	}

	/**
	 * メニューを追加する。
	 * 
	 * @param aName
	 * @param aDescription
	 * @param aVegitarian
	 * @param aPrice
	 */
	public void addItem(String aName, String aDescription, boolean aVegitarian, double aPrice) {
		MenuItem menuItem = new MenuItem(aName, aDescription, aVegitarian, aPrice);
		this.menuItems.add(menuItem);
	}

	/**
	 * メニュー情報を取得する。
	 * 
	 * @return
	 */
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	/**
	 * イテレータを作成する。
	 * 
	 * @return
	 */
	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
	
}
