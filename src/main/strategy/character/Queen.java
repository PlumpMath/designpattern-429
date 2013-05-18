package strategy.character;

import strategy.behavior.KnifeBehavior;

public class Queen extends Character {
	
	/**
	 * コンストラクタ。
	 */
	public Queen(){
		this.weaponBehavior = new KnifeBehavior();
	}

	@Override
	public void fight() {
	    System.out.println("女王の攻撃！");
	    this.weaponBehavior.useWeapon();
	}
}
