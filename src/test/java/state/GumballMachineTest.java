package state;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import state.state.HasQuaterState;
import state.state.NoQuaterState;
import state.state.SoldOutState;

public class GumballMachineTest {

	GumballMachine gumballMachine;
	
	/**
	 * ガムボールマシンにボールを1個入れ、動作検証します。
	 * 
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		// 初期状態
		this.gumballMachine = new GumballMachine(1);
		assertEquals(this.gumballMachine.getCount(), 1);
		assertEquals(this.gumballMachine.getState().getClass(), NoQuaterState.class);
		
		// コインを投入
		this.gumballMachine.insertQuater();
		assertEquals(this.gumballMachine.getState().getClass(), HasQuaterState.class);
			
		// クランクを回す
		this.gumballMachine.turnCrank();
		assertEquals(this.gumballMachine.getCount(), 0);
		assertEquals(this.gumballMachine.getState().getClass(), SoldOutState.class);
	}
	
	/**
	 * ガムボールマシンにボールを2個入れ、動作検証します。
	 * 
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		// 初期状態
		this.gumballMachine = new GumballMachine(2);
		assertEquals(this.gumballMachine.getCount(), 2);
		assertEquals(this.gumballMachine.getState().getClass(), NoQuaterState.class);
		
		// コインを投入
		this.gumballMachine.insertQuater();
			
		// クランクを回す
		this.gumballMachine.turnCrank();
		assertEquals(this.gumballMachine.getCount(), 1);
		assertEquals(this.gumballMachine.getState().getClass(), NoQuaterState.class);
	}
		
}
