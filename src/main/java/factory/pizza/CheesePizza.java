package factory.pizza;

import factory.factory.PizzaIngredientFactory;

/**
 * チーズピザ。
 * 
 * @author TakumiEra
 *
 */
public class CheesePizza extends Pizza{

	/**
	 * ピザの食材を提供するファクトリ。
	 */
	PizzaIngredientFactory pizzaIngredientFactory;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aPizzaIngredientFactory
	 */
	public CheesePizza(PizzaIngredientFactory aPizzaIngredientFactory) {
		this.pizzaIngredientFactory = aPizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println(name + "を下処理");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
	}

}
