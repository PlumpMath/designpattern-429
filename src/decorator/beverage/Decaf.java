package decorator.beverage;

public class Decaf extends Beverage{
	
	/**
	 * コンストラクタ。
	 */
	public Decaf() {
		description = "カフェイン抜き";
	}
	
	@Override
    public double cost() {
		return 1.05;
	}

}
