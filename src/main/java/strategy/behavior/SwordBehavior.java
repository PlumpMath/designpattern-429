package strategy.behavior;

import strategy.behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("剣を振り下ろした！");
	}

}
