package state.state;

import state.GumballMachine;

/**
 * 商品が売り切れている状態を表す。
 * 
 * @author TakumiEra
 *
 */
public class SoldOutState implements State {

	/**
	 * ガムボールマシンのインスタンス。
	 */
	GumballMachine gumballMachine;

	/**
	 * コンストラクタ。
	 * 
	 * @param aGumballMachine
	 */
	public SoldOutState(GumballMachine aGumballMachine) {
		this.gumballMachine = aGumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("ガムボールは売り切れです。");
	}

	@Override
	public void ejectQuater() {
		System.out.println("ガムボールは売り切れです。");
	}

	@Override
	public void turnCrank() {
		System.out.println("ガムボールは売り切れです。");
	}

	@Override
	public void dispense() {
		System.out.println("ガムボールは売り切れです。");
	}

}
