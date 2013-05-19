package decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;

public class StarbuzzCoffeeTest {

	@Test
	public void test(){
		// コーヒーを給仕
		Beverage espresso = new Espresso();
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		
		// 検証
		assertEquals(1.99, espresso.cost(),0);
		assertEquals(1.49, darkRoast.cost(),0);
		assertEquals(1.34, houseBlend.cost(),0);
	}
	
}
