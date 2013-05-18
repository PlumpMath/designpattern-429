package template;

/**
 * コーヒーを提供するためのクラス。
 * 
 * @author TakumiEra
 *
 */
public class Coffee extends CaffeineBeverage {

	@Override
	protected void brew() {
		System.out.println("フィルタでコーヒーをドリップします。");
	}

	@Override
	protected void addCondiments() {
		System.out.println("砂糖とミルクを追加します。");
	}

}
