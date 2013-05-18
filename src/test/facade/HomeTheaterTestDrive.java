package facade;

import org.junit.Test;

public class HomeTheaterTestDrive {

	@Test
	public void playTrushMovie() throws Exception {
		HomeTheterFacade homeTheterFacade = new HomeTheterFacade(new Amplifier(), new DvdPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
		
		homeTheterFacade.watchMovie("リンカーンVSゾンビ");
		homeTheterFacade.endMovie();
	}
	
}
