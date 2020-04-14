package services;

/**
 * Created by ianmacclancy on 7/15/19.
 */
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today is your lucky day";
	}

}
