package factory.factory;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.cheese.ReggianoCheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.clams.FreshClams;
import factory.ingredient.dough.Dough;
import factory.ingredient.dough.ThinCrustDough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.pepperoni.SlicedPepperoni;
import factory.ingredient.sauce.MarinaraSauce;
import factory.ingredient.sauce.Sauce;
import factory.ingredient.veggies.Garlic;
import factory.ingredient.veggies.Mushroom;
import factory.ingredient.veggies.Onion;
import factory.ingredient.veggies.Redpepper;
import factory.ingredient.veggies.Veggies;


/**
 * ニューヨークのピザ屋で使用する一連の食材を提供するファクトリクラス。
 * 
 * @author TakumiEra
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] Veggies = { new Garlic(),new Onion(),new Mushroom(),new Redpepper()}; 
		return Veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}
