package composite.menu;

import java.util.Iterator;

import composite.iterator.NullIterator;

/**
 * メニュー情報(リーフ要素)。
 * 
 * @author TakumiEra
 *
 */
public class MenuLeaf extends MenuComponent {

	/**
	 * 名前。
	 */
	private String name;
	
	/**
	 * 説明。
	 */
	private String description;
	
	/**
	 * 採食かどうかを表すフラグ。
	 */
	private boolean vegetarian;
	
	/**
	 * 価格。
	 */
	private double price;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aName
	 * @param aDescription
	 * @param aVegitarian
	 * @param aPrice
	 */
	public MenuLeaf(String aName, String aDescription, boolean aVegitarian, double aPrice) {
		this.name = aName;
		this.description = aDescription;
		this.vegetarian = aVegitarian;
		this.price = aPrice;
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
	public double getPrice() {
		return price;
	}
	
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	@Override
	public void print() {
		System.out.print(" " + getName());
		if(isVegetarian()){
			System.out.print("(v)");
		}
		System.out.println("、" + getPrice());
		System.out.println(" -- " + getDescription());
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
	
}
