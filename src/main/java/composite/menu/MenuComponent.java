package composite.menu;

import java.util.Iterator;

/**
 * メニューを表す抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class MenuComponent {
	
	/**
	 * メニュー情報を追加する。
	 * 
	 * @param aMenuComponent
	 */
	public void add(MenuComponent aMenuComponent) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * メニュー情報を削除する。
	 * 
	 * @param aMenuComponent
	 */
	public void remove(MenuComponent aMenuComponent) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 子要素を取得する。
	 * 
	 * @param i
	 * @return
	 */
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 名称を取得する。
	 * 
	 * @return
	 */
	public String getName() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 説明を取得する。
	 * 
	 * @return
	 */
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 価格を表示する。
	 * 
	 * @return
	 */
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 採食メニューかどうかを取得する。
	 * 
	 * @return
	 */
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * メニュー情報を出力する。
	 */
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * イテレータを生成します。
	 * 
	 * @return
	 */
	public abstract Iterator<MenuComponent> createIterator();
	
}
