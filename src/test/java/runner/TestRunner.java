package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features= {"C:\\Automation\\Shopwitheg\\src\\test\\resources\\features"},
		glue= {"stepdefinitions"},
		plugin= {"pretty","html/target/generated_source "},
		monochrome=true,

			tags="@login2"	


			)







public class TestRunner {

}
