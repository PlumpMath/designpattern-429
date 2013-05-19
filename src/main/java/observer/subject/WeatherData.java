package observer.subject;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

/**
 * 気象観測所オブジェクト。
 * 
 * @author TakumiEra
 *
 */
public class WeatherData implements Subject{

	/**
	 * オブザーバのリスト。
	 */
	private List<Observer> observers;
	
	/**
	 * 気温。
	 */
	private float temperature;
	
	/**
	 * 湿度。
	 */
	private float humidity;
	
	/**
	 * 気圧。
	 */
	private float pressure;

	/**
	 * コンストラクタ。
	 */
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registObserver(Observer aObserver) {
		observers.add(aObserver);
	}

	@Override
	public void removeObserver(Observer aObserver) {
		int i = observers.indexOf(aObserver);
		if(i >= 0){
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer :observers){
			observer.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * 最新の気象情報をオブザーバに通知する。
	 * <pre>
	 * このメソッドは、気象観測所の情報が更新されるたびに呼び出されます。
	 * </pre>
	 */
    public void mesurementsChanged(){
	    notifyObservers();
    }
    
    /**
     * 測定結果をセットする。
     * 
     * @param aTemp 気温
     * @param aHumidity 湿度
     * @param aPressure 気圧
     */
    public void setMesurements(float aTemp,float aHumidity,float aPressure){
    	this.temperature = aTemp;
    	this.humidity = aHumidity;
    	this.pressure = aPressure;
    	mesurementsChanged();
    }
	
}
