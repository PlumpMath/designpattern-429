package iterator.menu;

/**
 * メニュー情報を表すモデルクラス。
 * 
 * @author TakumiEra
 *
 */
public class MenuItem {

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
	public MenuItem(String aName, String aDescription, boolean aVegitarian, double aPrice) {
		this.name = aName;
		this.description = aDescription;
		this.vegetarian = aVegitarian;
		this.price = aPrice;
	}

	/**
	 * 名称を取得する。
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 説明を取得する。
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 採食メニューかどうかを取得する。
	 * 
	 * @return
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * 価格を表示する。
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
}
