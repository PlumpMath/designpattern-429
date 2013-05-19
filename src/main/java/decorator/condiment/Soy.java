package decorator.condiment;

import decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{

	/**
	 * 飲み物。
	 */
	Beverage beverage;

	/**
	 * コンストラクタ。
	 */
	public Soy(Beverage aBeverage) {
		this.beverage = aBeverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "、豆乳";
	}
	
	@Override
	public double cost(){ 
		return .15 + beverage.cost();
	}
	
	
}
