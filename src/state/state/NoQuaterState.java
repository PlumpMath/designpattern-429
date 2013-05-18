package state.state;

import state.GumballMachine;

/**
 * コインが投入されていない状態を表す。
 * 
 * @author TakumiEra
 *
 */
public class NoQuaterState implements State{
	
	/**
	 * ガムボールマシンのインスタンス。
	 */
	GumballMachine gumballMachine;

	/**
	 * コンストラクタ。
	 * 
	 * @param aGumballMachine
	 */
	public NoQuaterState(GumballMachine aGumballMachine) {
		this.gumballMachine = aGumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("25セントを投入しました。");
		this.gumballMachine.setState(this.gumballMachine.getHasQuaterState());
	}

	@Override
	public void ejectQuater() {
		System.out.println("25セントを投入していません。");
	}

	@Override
	public void turnCrank() {
		System.out.println("クランクを回しましたが、25セントを投入していません。");
	}

	@Override
	public void dispense() {
		System.out.println("まず支払をする必要があります。");
	}

}
