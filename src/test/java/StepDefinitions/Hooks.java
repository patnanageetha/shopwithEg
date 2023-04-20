package StepDefinitions;

import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	DriverFactory driverfactory=new DriverFactory();
	
	
	@Before
	public void beforeMethod()
	{
		driverfactory.init();
	}
@After
public void afterMethod()
{
DriverFactory.driver.close();
}

}
