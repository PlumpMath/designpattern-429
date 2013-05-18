package observer.observer;

/**
 * オブザーバインタフェース。
 * <pre>
 * 最新の気象情報に関する通知を受けたいクラスは、このインタフェースを実装すること。
 * </pre>
 * 
 * @author TakumiEra
 *
 */
public interface Observer {
	
	/**
	 * 
	 * @param aTemp
	 * @param aHumidity
	 * @param aPressure
	 */
	public void update(float aTemp,float aHumidity,float aPressure);
	
}
