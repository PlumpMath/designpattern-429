package strategy;

import strategy.character.Knight;
import strategy.character.Queen;
import strategy.character.Character;

public class StrategyPatternTest {
	
	/**
	 * キャラクタの振る舞いをテストします。
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		Character queen = new Queen();
		queen.fight();
		
		Character knight = new Knight();
		knight.fight();
	}

}
