package command.vendor;

/**
 * 部屋の照明。
 * 
 * @author TakumiEra
 *
 */
public class Light extends BaseVendor{
	
	/**
	 * コンストラクタ。
	 */
	public Light(String aInstallationSite) {
		this.installationSite = aInstallationSite;
	}
	
	/**
	 * 電源を入れる。
	 */
	public void on() {
		System.out.println(this.installationSite + " 照明がついています");
	}
	
	/**
	 * 電源を切る。
	 */
	public void off() {
		System.out.println(this.installationSite + " 照明が消えています");
	}

}
