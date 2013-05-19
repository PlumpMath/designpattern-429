package decorator.beverage;

public class Espresso extends Beverage{
	
	/**
	 * コンストラクタ。
	 */
	public Espresso() {
		description = "エスプレッソ";
	}
	
	@Override
    public double cost() {
		return 1.99;
	}

}
