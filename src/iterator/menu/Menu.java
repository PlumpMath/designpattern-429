package iterator.menu;

import java.util.Iterator;

/**
 * メニュー情報を取得するためのインタフェース。
 * 
 * @author TakumiEra
 *
 */
public interface Menu {

	Iterator<MenuItem> createIterator();
	
}
