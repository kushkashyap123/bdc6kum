package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\tagnew.feature",glue= {"cucumber1"},plugin= {"html:target/cucumber.html"},
tags= {"@RegressionTest"})

public class testrunner {
	

}
