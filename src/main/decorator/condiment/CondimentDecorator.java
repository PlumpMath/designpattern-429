package decorator.condiment;

import decorator.beverage.Beverage;

/**
 * トッピング用のデコレータ抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class CondimentDecorator extends Beverage{

	/**
	 * 商品の説明テキストを取得します。
	 * 
	 * @return
	 */
	public abstract String getDescription();
}
