package facade;

/**
 * アンプ。
 * 
 * @author TakumiEra
 *
 */
public class Amplifier {
	
	/**
	 * 電源を入れる。
	 */
	public void on() {
        System.out.println("アンプをスイッチオン");
	}
	
	/**
	 * アンプをDVDプレイヤに接続する。
	 */
	public void setDvd() {
        System.out.println("アンプを最高級DVDプレイヤに接続");
	}
	
	/**
	 * サラウンドモードをONにする。
	 */
	public void setSurroundSound() {
        System.out.println("アンプのサラウンド音声をスイッチオン(5スピーカ、1サブウーファ)");
	}
	
	/**
	 * ボリュームを調節する。
	 * 
	 * @param aVolume
	 */
	public void setVolume(int aVolume) {
        System.out.println("アンプの音量を" + aVolume + "に設定");
	}
	
	/**
	 * 電源を切る。
	 */
	public void off() {
        System.out.println("アンプをスイッチオフ");
	}
}
