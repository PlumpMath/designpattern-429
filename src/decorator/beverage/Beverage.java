package decorator.beverage;

/**
 * 飲み物を表す抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class Beverage {

	/**
	 * 商品の説明。
	 */
	String description;
	
	/**
	 * 商品の説明テキストを取得します。
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 商品の値段を算出します。
	 * 
	 * @return
	 */
	public abstract double cost();
	
}
