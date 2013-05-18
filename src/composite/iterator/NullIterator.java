package composite.iterator;

import java.util.Iterator;

import composite.menu.MenuComponent;

/**
 * Nullを返すイテレータ。
 * 
 * @author TakumiEra
 *
 */
public class NullIterator implements Iterator<MenuComponent>{

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
