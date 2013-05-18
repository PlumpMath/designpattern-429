package composite.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import composite.iterator.CompositeIterator;

/**
 * メニュー情報(ノード要素)。
 * 
 * @author TakumiEra
 *
 */
public class MenuNode extends MenuComponent {
	
	/**
	 * メニュー情報のリスト。
	 */
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	
	/**
	 * 名前。
	 */
	private String name;
	
	/**
	 * 説明。
	 */
	private String description;
	

	/**
	 * コンストラクタ。
	 * 
	 * @param aName
	 * @param aDescription
	 */
	public MenuNode(String aName, String aDescription) {
		this.name = aName;
		this.description = aDescription;
	}
	
	@Override
	public void add(MenuComponent aMenuComponent) {
		this.menuComponents.add(aMenuComponent);
	}
	
	@Override
	public void remove(MenuComponent aMenuComponent) {
		this.menuComponents.remove(aMenuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return this.menuComponents.get(i);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println("、" + getDescription());
		System.out.println("--------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
	
	@Override
	public Iterator<MenuComponent> createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
}
