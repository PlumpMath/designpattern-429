package factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import factory.pizza.Pizza;
import factory.pizza.PizzaType;
import factory.store.ChicagoPizzaStore;
import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class PizzaDriveTest {

	@Test
	public void test() throws Exception {
		// イーサンの注文
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza pizza = nyPizzaStore.createPizza(PizzaType.CHEESE);
		assertEquals("ニューヨークスタイルのチーズピザ", pizza.getName());
		
		// ジョエルの注文
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza pizza2 = chicagoPizzaStore.createPizza(PizzaType.CHEESE);
		assertEquals("シカゴスタイルのチーズピザ", pizza2.getName());
	}
	
}
