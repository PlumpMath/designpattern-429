package decorator.condiment;

import decorator.beverage.Beverage;

public class Whip extends CondimentDecorator{

	/**
	 * 飲み物。
	 */
	Beverage beverage;

	/**
	 * コンストラクタ。
	 */
	public Whip(Beverage aBeverage) {
		this.beverage = aBeverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "、ホイップ";
	}
	
	@Override
	public double cost(){ 
		return .10 + beverage.cost();
	}
	
	
}
