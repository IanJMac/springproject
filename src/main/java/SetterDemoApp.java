import coaches.Coach;
import coaches.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ianmacclancy on 7/15/19.
 */
public class SetterDemoApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retreive bean
		CricketCoach cricketCoach = context.getBean("myCricketCoach", coaches.CricketCoach.class);

		//call methods on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());

		//close the context

	}
}
