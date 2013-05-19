package factory.store;

import factory.pizza.Pizza;
import factory.pizza.PizzaType;

/**
 * ピザ屋を表す抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class PizzaStore {

	/**
	 * ピザを作る。
	 * 
	 * @param aPizzaType
	 * @return
	 */
	public abstract Pizza createPizza(PizzaType aPizzaType);
	
}
