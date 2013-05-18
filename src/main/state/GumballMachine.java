package state;

import state.state.HasQuaterState;
import state.state.NoQuaterState;
import state.state.SoldOutState;
import state.state.SoldState;
import state.state.State;

/**
 * ガムボールマシン。
 * 
 * @author TakumiEra
 *
 */
public class GumballMachine {
	
	State soldState;
	State soldOutState;
	State noQuaterState;
	State hasQuaterState;
	
	/**
	 * 状態。
	 */
	State state = soldOutState;
	
	/**
	 * ガムボールの個数。
	 */
	int count = 0;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aNumberGumballs
	 */
	public GumballMachine(int aNumberGumballs) {
		this.soldState = new SoldState(this);
		this.soldOutState = new SoldOutState(this);
		this.noQuaterState = new NoQuaterState(this);
		this.hasQuaterState = new HasQuaterState(this);
		this.count = aNumberGumballs;
		if(aNumberGumballs > 0){
			this.state = noQuaterState;
		}
	}
	
	/**
	 * 25セントを投入する。
	 */
	public void insertQuater() {
		this.state.insertQuater();
	}

	/**
	 * 25セントを返却する。
	 */
	public void ejectQuater() {
		this.state.ejectQuater();
	}

	/**
	 * クランクを回す。
	 */
	public void turnCrank() {
		this.state.turnCrank();
		this.state.dispense();
	}

	/**
	 * ボールを出す。
	 */
	public void releaseBall(){
		System.out.println("ガムボールがスロットから転がり出てきます...");
		if(this.count != 0){
			count = count - 1;
		}
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuaterState() {
		return noQuaterState;
	}

	public void setNoQuaterState(State noQuaterState) {
		this.noQuaterState = noQuaterState;
	}

	public State getHasQuaterState() {
		return hasQuaterState;
	}

	public void setHasQuaterState(State hasQuaterState) {
		this.hasQuaterState = hasQuaterState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
