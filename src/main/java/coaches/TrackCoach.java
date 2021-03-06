package coaches;

import services.FortuneService;

/**
 * Created by ianmacclancy on 6/10/19.
 */
public class TrackCoach implements Coach {

	//====================================================================================
	// Fields 
	//====================================================================================
	private FortuneService fortuneService;

	//====================================================================================
	// Constructors 
	//====================================================================================

	public TrackCoach() {
	}

	//define constructor for dependancy injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	//====================================================================================
	// Class Methods 
	//====================================================================================
	@Override
	public String getDailyWorkout() {
		return "Run around the circle a bunch";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get a fortune
		return "just do it! " + fortuneService.getFortune();
	}

	//====================================================================================
	// Getters and Setters 
	//====================================================================================
}
