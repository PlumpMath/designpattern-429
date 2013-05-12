package singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() throws Exception {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		assertFalse(chocolateBoiler.isBoiled());
		assertTrue(chocolateBoiler.isEmpty());
		
		chocolateBoiler.fill();
		assertFalse(chocolateBoiler.isBoiled());
		assertFalse(chocolateBoiler.isEmpty());
		
		chocolateBoiler.boil();
		assertTrue(chocolateBoiler.isBoiled());
		assertFalse(chocolateBoiler.isEmpty());
		
		chocolateBoiler.drain();
		assertTrue(chocolateBoiler.isBoiled());
		assertTrue(chocolateBoiler.isEmpty());
		
	}
}
