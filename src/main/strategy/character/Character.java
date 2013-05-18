package strategy.character;

import strategy.behavior.WeaponBehavior;

/**
 * キャラクタを表す抽象クラス。
 * 
 * @author TakumiEra
 *
 */
public abstract class Character {
	
	/**
	 * 攻撃方法を定義した振る舞いインタフェース。
	 */
	WeaponBehavior weaponBehavior;
	
	/**
	 * 対象のキャラクタを攻撃させます。
	 */
	abstract public void fight();

	/**
	 * @param weaponBehavior
	 */
	protected void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
}
