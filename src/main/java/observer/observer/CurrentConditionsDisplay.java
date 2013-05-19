package observer.observer;

import observer.subject.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

	/**
	 * 気温。
	 */
	private float temperature;
	
	/**
	 * 湿度。
	 */
	private float humidity;

	/**
	 * 気象情報サブジェクト。
	 */
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	/**
	 * コンストラクタ。
	 * 
	 * @param aWeatherData
	 */
	public CurrentConditionsDisplay(Subject aWeatherData) {
		this.weatherData = aWeatherData;
		aWeatherData.registObserver(this);
	}
	
	@Override
	public void display() {
	    System.out.println("現在の気象状況：温度" + temperature + "度　湿度" + humidity + "%");	
	}

	@Override
	public void update(float aTemp, float aHumidity, float aPressure) {
		this.temperature = aTemp;
		this.humidity = aHumidity;
		display();
	}

}
