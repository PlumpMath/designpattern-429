package state.state;

/**
 * 状態をあらわすインタフェース。
 * 
 * @author TakumiEra
 *
 */
public interface State {
	
	/**
	 * 25セントを投入する。
	 */
	void insertQuater();
	
	/**
	 * 25セントを返却する。
	 */
	void ejectQuater();
	
	/**
	 * クランクを回す。
	 */
	void turnCrank();
	
	/**
	 * 商品を販売する。
	 */
	void dispense();
}
