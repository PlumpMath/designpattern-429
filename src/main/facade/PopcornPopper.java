package facade;

/**
 * ポップコーンメーカ。
 * 
 * @author TakumiEra
 *
 */
public class PopcornPopper {

	/**
	 * 電源を入れる。
	 */
	public void on() {
		System.out.println("ポップコーン製造機をスイッチオン");
	}

	/**
	 * ポップコーンを作る。
	 */
	public void pop() {
		System.out.println("ポップコーン製造機がポップコーンを作っています！");
	}

	/**
	 * 電源を切る。
	 */
	public void off() {
		System.out.println("ポップコーン製造機をスイッチオフ");
	}

}
