package factory.pizza;

import factory.factory.PizzaIngredientFactory;

/**
 * クラムピザ。
 * 
 * @author TakumiEra
 *
 */
public class ClamPizza extends Pizza{

	/**
	 * ピザの食材を提供するファクトリ。
	 */
	PizzaIngredientFactory pizzaIngredientFactory;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aPizzaIngredientFactory
	 */
	public ClamPizza(PizzaIngredientFactory aPizzaIngredientFactory) {
		this.pizzaIngredientFactory = aPizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println(name + "を下処理");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		clam = pizzaIngredientFactory.createClams();
	}

}
