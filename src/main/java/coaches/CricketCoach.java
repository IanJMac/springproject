package coaches;

import services.FortuneService;

/**
 * Created by ianmacclancy on 7/15/19.
 */
public class CricketCoach implements Coach {

	//====================================================================================
	// Fields 
	//====================================================================================
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	//====================================================================================
	// Constructors 
	//====================================================================================

	public CricketCoach() {
	}

	//====================================================================================
	// Class Methods 
	//====================================================================================
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAdress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	//====================================================================================
	// Getters and Setters 
	//====================================================================================
}
