package command.vendor;

/**
 * ガレージのドア。
 * 
 * @author TakumiEra
 *
 */
public class GarageDoor extends BaseVendor{
	
	/**
	 * コンストラクタ。
	 */
	public GarageDoor(String aInstallationSite) {
		this.installationSite = aInstallationSite;
	}
	
	/**
	 * シャッターを開く。
	 */
	public void up() {
		System.out.println(this.installationSite + " ガレージのドアが開いています");
	}
	
	/**
	 * シャッターを閉じる。
	 */
	public void down() {
		System.out.println(this.installationSite + " ガレージのドアは閉まっています");
	}

}
