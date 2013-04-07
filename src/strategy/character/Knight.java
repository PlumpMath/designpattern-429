package strategy.character;

import strategy.behavior.SwordBehavior;

public class Knight extends Character {
	
	/**
	 * コンストラクタ。
	 */
	public Knight(){
		this.weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		System.out.println("騎士の攻撃！");
		this.weaponBehavior.useWeapon();
	}
	
	
}
