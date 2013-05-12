package facade;

/**
 * DVDプレイヤ。
 * 
 * @author TakumiEra
 *
 */
public class DvdPlayer {
	
	/**
	 * 映画のタイトル。
	 */
	String movie;
	
	/**
	 * 電源を入れる。
	 */
	public void on() {
		System.out.println("DVDプレイヤをスイッチオン");
	}

	/**
	 * ディスクを再生する。
	 * 
	 * @param aMovie
	 */
	public void play(String aMovie) {
		this.movie = aMovie;
		System.out.println("DVDプレーヤは「" + this.movie + "」を再生");
	}
	
	/**
	 * 再生を停止する。
	 */
	public void stop() {
	    System.out.println("DVDプレーヤは「" + this.movie + "」を停止");
	}

	/**
	 * ディスクを取り出す。
	 */
	public void eject() {
		System.out.println("DVDプレーヤから取り出し");
	}
	
	/**
	 * 電源を切る。
	 */
	public void off() {
	    System.out.println("DVDプレーヤをスイッチオフ");
	}

}
