package factory.factory;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.sauce.Sauce;
import factory.ingredient.veggies.Veggies;


/**
 * ピザに使用する一連の食材を作成するファクトリクラス。
 * 
 * @author TakumiEra
 *
 */
public interface PizzaIngredientFactory {

	/**
	 * ピザ生地を作成する。
	 * 
	 * @return
	 */
	public Dough createDough();
	
	/**
	 * ピザソースを作成する。
	 * 
	 * @return
	 */
	public Sauce createSauce();
	
	/**
	 * チーズを作成する。
	 * 
	 * @return
	 */
	public Cheese createCheese();
	
	/**
	 * 野菜を作成する。
	 * 
	 * @return
	 */
	public Veggies[] createVeggies();
	
	/**
	 * ペパロニを作成する。
	 * 
	 * @return
	 */
	public Pepperoni createPepperoni();
	
	/**
	 * クラムを作成する。
	 * 
	 * @return
	 */
	public Clams createClams();
	
}
