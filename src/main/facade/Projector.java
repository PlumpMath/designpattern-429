package facade;

/**
 * プロジェクタ。
 * 
 * @author TakumiEra
 *
 */
public class Projector {
	
	/**
	 * 電源を入れる。
	 */
	public void on() {
		System.out.println("プロジェクタをスイッチオン");
	}

	/**
	 * ワイドスクリーンに切り替える。
	 */
	public void wideScreenMode() {
		System.out.println("プロジェクタはワイドスクリーンモード(縦横比16×9)です");		
	}
	
	/**
	 * 電源を切る。
	 */
	public void off() {
		System.out.println("プロジェクタをスイッチオフ");
	}


}
