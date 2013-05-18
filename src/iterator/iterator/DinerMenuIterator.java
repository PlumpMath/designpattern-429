package iterator.iterator;

import iterator.menu.DinerMenu;
import iterator.menu.MenuItem;
import java.util.Iterator;

/**
 * {@link DinerMenu}のイテレータクラス。
 * 
 * @author TakumiEra
 *
 */
public class DinerMenuIterator implements Iterator<MenuItem>{

	/**
	 * メニューのリスト。
	 */
	MenuItem[] menuItems;
	
	/**
	 * ポインタ。
	 */
	int position = 0;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aItems
	 */
	public DinerMenuIterator(MenuItem[] aItems) {
		this.menuItems = aItems;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= menuItems.length || menuItems[position] == null){
			return  false;
		} else{
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
