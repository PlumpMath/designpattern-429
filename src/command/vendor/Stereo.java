package command.vendor;

/**
 * ステレオ。
 * 
 * @author TakumiEra
 *
 */
public class Stereo extends BaseVendor{
	
	/**
	 * コンストラクタ。
	 */
	public Stereo(String aInstallationSite) {
		this.installationSite = aInstallationSite;
	}
	
	/**
	 * 電源を入れる。
	 */
	public void on() {
		System.out.println(this.installationSite + " ステレオの電源が付いています");
	}
	
	/**
	 * 電源を切る。
	 */
	public void off() {
		System.out.println(this.installationSite + " ステレオの電源が切れています");
	}
	
	/**
	 * ボリュームを上げる。
	 */
	public void volumUp() {
		System.out.println(this.installationSite + " ステレオのボリュームが11に設定されています");
	}
	
	/**
	 * CD入力モードに設定する。
	 */
	public void setCD() {
		System.out.println(this.installationSite + " ステレオがCD入力に設定されています");
	}

}
