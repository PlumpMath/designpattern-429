package strategy.behavior;

public class KnifeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {
		System.out.println("ナイフで切りつけた！");
	}

}
