package factory.store;

import factory.factory.ChicagoPizzaIngredientFactory;
import factory.factory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.PepperoniPizza;
import factory.pizza.Pizza;
import factory.pizza.PizzaType;
import factory.pizza.VeggiesPizza;

/**
 * シカゴのピザ屋。
 * 
 * @author TakumiEra
 *
 */
public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(PizzaType aPizzaType) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
	
		if(aPizzaType.equals(PizzaType.CHEESE)){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("シカゴスタイルのチーズピザ");
		}else if(aPizzaType.equals(PizzaType.VEGGIES)){
			pizza = new VeggiesPizza(pizzaIngredientFactory);
			pizza.setName("シカゴスタイルの野菜ピザ");
		}else if(aPizzaType.equals(PizzaType.CLAMS)){
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("シカゴスタイルのクラムピザ");
		}else if(aPizzaType.equals(PizzaType.PEPPERONI)){
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("シカゴスタイルのペパロニピザ");
		}
		return pizza;
	}

}
