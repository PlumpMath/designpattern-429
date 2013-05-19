package decorator.condiment;

import decorator.beverage.Beverage;

public class Milk extends CondimentDecorator{

	/**
	 * 飲み物。
	 */
	Beverage beverage;

	/**
	 * コンストラクタ。
	 */
	public Milk(Beverage aBeverage) {
		this.beverage = aBeverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "、スチームミルク";
	}
	
	@Override
	public double cost(){ 
		return .10 + beverage.cost();
	}
	
	
}
