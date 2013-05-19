package iterator.menu;

import iterator.iterator.DinerMenuIterator;

import java.util.Iterator;

/**
 * ダイナーで提供している料理のメニュー。
 * 
 * @author TakumiEra
 *
 */
public class DinerMenu implements Menu{

	/**
	 * 追加できるメニューの最大数。
	 */
	static final int MAX_ITEM = 6;
	
	/**
	 * カウンタ。
	 */
	int numberOfItems = 0;
	
	/**
	 * メニュー情報。
	 */
	MenuItem[] menuItems;
	
	/**
	 * コンストラクタ。
	 */
	public DinerMenu() {
		this.menuItems = new MenuItem[MAX_ITEM];
		
		addItem("ベジタリアンBLT", "レタス、トマト、(偽)ベーコンをはさんだ全粒小麦パンサンドイッチ", true, 2.99);
		addItem("BLT", "レタス、トマト、ベーコンをはさんだ全粒小麦パンサンドイッチ", false, 2.99);
		addItem("本日のスープ", "ポテトサラダを添えた本日のスープ", false, 3.29);
		addItem("ホットドッグ", "ザワークラウト、レリッシュ、玉ねぎ、チーズをはさんだホットドック", false, 3.05);
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
		if(this.numberOfItems >= MAX_ITEM){
			System.out.println("メニューにこれ以上項目を追加できません。");
		} else {
			this.menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	/**
	 * メニュー情報を取得する。
	 * 
	 * @return
	 */
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	/**
	 * イテレータを作成する。
	 * 
	 * @return
	 */
	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
