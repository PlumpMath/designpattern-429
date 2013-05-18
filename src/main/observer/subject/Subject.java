package observer.subject;

import observer.observer.Observer;

/**
 * サブジェクトインタフェース。
 * 
 * @author TakumiEra
 *
 */
public interface Subject {
	
	/**
	 * 
	 * @param aObserver
	 */
	public void registObserver(Observer aObserver);
	
	/**
	 * 
	 * @param aObserver
	 */
	public void removeObserver(Observer aObserver);
	
	/**
	 * 
	 */
	public void notifyObservers();
	
}
