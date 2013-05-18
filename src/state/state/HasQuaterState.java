package state.state;

import state.GumballMachine;

/**
 * コインが投入済みである状態を表す。
 * 
 * @author TakumiEra
 *
 */
public class HasQuaterState implements State{

	/**
	 * ガムボールマシンのインスタンス。
	 */
	GumballMachine gumballMachine;

	/**
	 * コンストラクタ。
	 * 
	 * @param aGumballMachine
	 */
	public HasQuaterState(GumballMachine aGumballMachine) {
		this.gumballMachine = aGumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("もう一度25セントを投入することはできません。");
	}

	@Override
	public void ejectQuater() {
		System.out.println("25セントを返却しました。");
		this.gumballMachine.setState(this.gumballMachine.getNoQuaterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("クランクを回しました...");
		this.gumballMachine.setState(this.gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("販売するガムボールはありません。");
	}

}
