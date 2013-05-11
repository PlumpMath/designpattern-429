package decorator.condiment;

import decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator{

	/**
	 * 飲み物。
	 */
	Beverage beverage;

	/**
	 * コンストラクタ。
	 */
	public Mocha(Beverage aBeverage) {
		this.beverage = aBeverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "、モカ";
	}
	
	@Override
	public double cost(){ 
		return .20 + beverage.cost();
	}
	
	
}
