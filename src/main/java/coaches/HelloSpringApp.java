package coaches;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ianmacclancy on 6/10/19.
 */
public class HelloSpringApp {

	//====================================================================================
	// Fields 
	//====================================================================================

	//====================================================================================
	// Constructors 
	//====================================================================================

	//====================================================================================
	// Getters and Setters
	//====================================================================================

	//====================================================================================
	// Class Methods 
	//====================================================================================

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		//call new fortune service methods
		System.out.println(theCoach.getDailyFortune());

		//close the context
		context.close();
	}
}
