package factory.pizza;

import factory.factory.PizzaIngredientFactory;

/**
 * 野菜ピザ。
 * 
 * @author TakumiEra
 *
 */
public class VeggiesPizza extends Pizza{

	/**
	 * ピザの食材を提供するファクトリ。
	 */
	PizzaIngredientFactory pizzaIngredientFactory;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aPizzaIngredientFactory
	 */
	public VeggiesPizza(PizzaIngredientFactory aPizzaIngredientFactory) {
		this.pizzaIngredientFactory = aPizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println(name + "を下処理");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		veggies = pizzaIngredientFactory.createVeggies();
	}

}
