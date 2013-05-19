package factory.store;

import factory.factory.NYPizzaIngredientFactory;
import factory.factory.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.PepperoniPizza;
import factory.pizza.Pizza;
import factory.pizza.PizzaType;
import factory.pizza.VeggiesPizza;

/**
 * ニューヨークのピザ屋。
 * 
 * @author TakumiEra
 *
 */
public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(PizzaType aPizzaType) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
	
		if(aPizzaType.equals(PizzaType.CHEESE)){
			pizza = new CheesePizza(pizzaIngredientFactory);
			pizza.setName("ニューヨークスタイルのチーズピザ");
		}else if(aPizzaType.equals(PizzaType.VEGGIES)){
			pizza = new VeggiesPizza(pizzaIngredientFactory);
			pizza.setName("ニューヨークスタイルの野菜ピザ");
		}else if(aPizzaType.equals(PizzaType.CLAMS)){
			pizza = new ClamPizza(pizzaIngredientFactory);
			pizza.setName("ニューヨークスタイルのクラムピザ");
		}else if(aPizzaType.equals(PizzaType.PEPPERONI)){
			pizza = new PepperoniPizza(pizzaIngredientFactory);
			pizza.setName("ニューヨークスタイルのペパロニピザ");
		}
		return pizza;
	}

}
