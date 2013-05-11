package strategy;

import org.junit.Test;

import strategy.character.Knight;
import strategy.character.Queen;
import strategy.character.Character;

public class StrategyPatternTest {

	@Test
	public void test(){
		
		Character queen = new Queen();
		queen.fight();
		
		Character knight = new Knight();
		knight.fight();
	}

}
