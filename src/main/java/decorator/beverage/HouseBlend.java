package decorator.beverage;

public class HouseBlend extends Beverage{
	
	/**
	 * コンストラクタ。
	 */
	public HouseBlend() {
		description = "ハウスブレンド";
	}
	
	@Override
    public double cost() {
		return .89;
	}

}
