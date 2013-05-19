package command.vendor;

/**
 * 天井の扇風機。
 * 
 * @author TakumiEra
 *
 */
public class CeilingFan extends BaseVendor{
	
	/**
	 * コンストラクタ。
	 */
	public CeilingFan(String aInstallationSite) {
		this.installationSite = aInstallationSite;
	}
	
	/**
	 * 電源を入れる。
	 */
	public void on() {
		System.out.println(this.installationSite + " 天井の扇風機が動いています");
	}
	
	/**
	 * 電源を切る。
	 */
	public void off() {
		System.out.println(this.installationSite + " 天井の扇風機が止まっています");
	}

}
