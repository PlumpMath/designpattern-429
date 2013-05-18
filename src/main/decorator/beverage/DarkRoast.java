package decorator.beverage;

public class DarkRoast extends Beverage{
	
	/**
	 * コンストラクタ。
	 */
	public DarkRoast() {
		description = "ダークロースト";
	}
	
	@Override
    public double cost() {
		return .99;
	}

}
