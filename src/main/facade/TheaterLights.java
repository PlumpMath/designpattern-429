package facade;

/**
 * ホームシアターの照明。
 * 
 * @author TakumiEra
 *
 */
public class TheaterLights {

	/**
	 * 照明をいい感じに暗くする。
	 * 
	 * @param i
	 */
	public void dim(int i) {
		System.out.println("シアタの天井照明を"+ i + "%まで暗くします");
	}

	/**
	 * 照明を付ける。
	 */
	public void on() {
		System.out.println("シアタの天井照明をスイッチオン");
	}

	
	
}
