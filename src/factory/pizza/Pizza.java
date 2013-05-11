package factory.pizza;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.sauce.Sauce;
import factory.ingredient.veggies.Veggies;

/**
 * ピザを表す抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class Pizza {

	/**
	 * ピザの名称。
	 */
	protected String name;
	
	/**
	 * ピザ生地。
	 */
	protected Dough dough;
	
	/**
	 * ピザソース。
	 */
	protected Sauce sauce;	
	
	/**
	 * 野菜。
	 */
	protected Veggies veggies[];
	
	/**
	 * チーズ。
	 */
	protected Cheese cheese;
	
	/**
	 * ペパロニ。
	 */
	protected Pepperoni pepperoni;
	
	/**
	 * クラム。
	 */
	protected Clams clam;

	/**
	 * 下ごしらえ。
	 */
	public abstract void prepare();
	
	/**
	 * ピザを焼く。
	 */
	public void bake(){
		System.out.println("350度で25分焼く");
	}
	
	/**
	 * ピザをカットする。
	 */
	public void cut(){
		System.out.println("ピザを扇形に切り分ける");
	}
	
	/**
	 * ピザを箱詰めする。
	 */
	public void box(){
		System.out.println("PizzaStoreの正式な箱にピザを入れる");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
