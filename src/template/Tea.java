package template;

/**
 * 紅茶を提供するためのクラス。
 * 
 * @author TakumiEra
 *
 */
public class Tea extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("紅茶を浸します。");
	}

	@Override
	protected void addCondiments() {
		System.out.println("レモンを追加します。");
	}

}
