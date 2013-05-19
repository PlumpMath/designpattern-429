package factory.pizza;

import factory.factory.PizzaIngredientFactory;

/**
 * ペパロニピザ。
 * 
 * @author TakumiEra
 *
 */
public class PepperoniPizza extends Pizza{

	/**
	 * ピザの食材を提供するファクトリ。
	 */
	PizzaIngredientFactory pizzaIngredientFactory;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aPizzaIngredientFactory
	 */
	public PepperoniPizza(PizzaIngredientFactory aPizzaIngredientFactory) {
		this.pizzaIngredientFactory = aPizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println(name + "を下処理");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		pepperoni = pizzaIngredientFactory.createPepperoni();
	}

}
