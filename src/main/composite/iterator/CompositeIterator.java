package composite.iterator;

import java.util.Iterator;
import java.util.Stack;

import composite.menu.MenuComponent;
import composite.menu.MenuNode;

/**
 * Compositeなイテレータ。
 * <pre>
 * 特定の条件に合致するメニュー情報の取得を可能にする。
 * </pre>
 * 
 * @author TakumiEra
 *
 */
public class CompositeIterator implements Iterator<MenuComponent> {
	
	/**
	 * メニュー情報を積むためのスタック。
	 */
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	/**
	 * コンストラクタ。
	 * 
	 * @param aIterator
	 */
	public CompositeIterator(Iterator<MenuComponent> aIterator) {
		this.stack.push(aIterator);
	}
	
	@Override
	public boolean hasNext() {
		if(this.stack.empty()){
			return false;
		} else {
			Iterator<MenuComponent> iterator = this.stack.peek();
			if(!iterator.hasNext()){
				stack.pop();
				// 再帰は友達
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if(hasNext()){
			Iterator<MenuComponent> iterator = this.stack.peek();
			MenuComponent menuComponent = iterator.next();
			if(menuComponent instanceof MenuNode){
				this.stack.push(menuComponent.createIterator());
			}
			return menuComponent;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
