package template;

/**
 * カフェインを含む飲みものを提供するための抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class CaffeineBeverage {

	/**
	 * レシピに従って飲み物を準備します。
	 */
	final public void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	/**
	 * お湯を沸かす。
	 */
	private void boilWater(){
		System.out.println("お湯を沸かします。");
	}
	
	/**
	 * 飲み物を淹れる。
	 */
	abstract protected void brew();
	
	/**
	 * カップに飲み物を注ぐ。
	 */
	private void pourInCup() {
		System.out.println("カップに注ぎます。");
	}
	
	/**
	 * 飲み物にトッピングを加える。
	 */
	abstract protected void addCondiments();
	
}
