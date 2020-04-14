package coaches;

import services.FortuneService;

/**
 * Created by ianmacclancy on 6/10/19.
 */
public class BaseballCoach implements Coach {

	//====================================================================================
	// Fields 
	//====================================================================================
	private FortuneService fortuneService;

	//====================================================================================
	// Constructors 
	//====================================================================================
	//define constructor for dependancy injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	//====================================================================================
	// Class Methods 
	//====================================================================================
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in the batting cage";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	//====================================================================================
	// Getters and Setters 
	//====================================================================================
}
