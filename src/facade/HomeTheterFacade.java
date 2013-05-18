package facade;

/**
 * ホームシアタのファサードクラス。
 * <pre>
 * ホームシアタの起動に必要な各種インタフェースとのやりとりをカプセル化して提供します。
 * </pre>
 * 
 * @author TakumiEra
 *
 */
public class HomeTheterFacade {

	/**
	 * アンプ。
	 */
	Amplifier amp;
	
	/**
	 * DVDプレイヤ。
	 */
	DvdPlayer dvd;
	
	/**
	 * プロジェクタ。
	 */
	Projector projector;
	
	/**
	 * 照明。
	 */
	TheaterLights lights;
	
	/**
	 * スクリーン。
	 */
	Screen screen;
	
	/**
	 * ポップコーンメーカ。
	 */
	PopcornPopper popper;
	
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aAmp
	 * @param aDvd
	 * @param aProjector
	 * @param aLights
	 * @param aScreen
	 * @param aPopper
	 */
	public HomeTheterFacade(Amplifier aAmp,DvdPlayer aDvd,Projector aProjector,TheaterLights aLights,Screen aScreen,PopcornPopper aPopper) {
		this.amp = aAmp; 
		this.dvd = aDvd;
		this.projector = aProjector;
		this.lights = aLights;
		this.screen = aScreen;
		this.popper = aPopper;
	}
	
	/**
	 * ホームシアターで映画鑑賞を開始します。
	 */
	public void watchMovie(String aMovie) {
		System.out.println("映画を観る準備をします...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd();
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(aMovie);
	}
	
	/**
	 * ホームシアターでの映画鑑賞を終了します。
	 */
	public void endMovie() {
		System.out.println("ムービシアタを停止します...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
	
}
