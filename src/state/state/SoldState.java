package state.state;

import state.GumballMachine;

/**
 * 商品が販売中の状態を表す。
 * 
 * @author TakumiEra
 *
 */
public class SoldState implements State{

	/**
	 * ガムボールマシンのインスタンス。
	 */
	GumballMachine gumballMachine;

	/**
	 * コンストラクタ。
	 * 
	 * @param aGumballMachine
	 */
	public SoldState(GumballMachine aGumballMachine) {
		this.gumballMachine = aGumballMachine;
	}
	
	@Override
	public void insertQuater() {
		System.out.println("お待ちください。すでにガムボールを出しています。");
	}

	@Override
	public void ejectQuater() {
		System.out.println("お待ちください。すでにクランクを回しています。");
	}

	@Override
	public void turnCrank() {
		System.out.println("二度回してもガムボールをもう1つ手に入れることはできません！");
	}

	@Override
	public void dispense() {
		this.gumballMachine.releaseBall();
		if(this.gumballMachine.getCount() > 0){
			this.gumballMachine.setState(this.gumballMachine.getNoQuaterState());
		} else {
			System.out.println("おっと、ガムボールがなくなりました！");
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
	}

}
