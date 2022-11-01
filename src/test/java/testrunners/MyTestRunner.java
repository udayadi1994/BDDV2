package testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appfeatures"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				glue = {"stepdefinations","appHooks"},
				monochrome = true
		)

public class MyTestRunner {

}
