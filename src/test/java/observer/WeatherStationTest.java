package observer;

import org.junit.Test;

import observer.observer.CurrentConditionsDisplay;
import observer.subject.WeatherData;

public class WeatherStationTest {

	/**
	 * 
	 */
	@Test
	public void test(){
		WeatherData weatherData = new WeatherData();
		
		new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMesurements(27, 65, 30.4f);
	}

}
