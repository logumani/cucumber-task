package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\login.feature"},glue= {"org.runner"},
monochrome=true,plugin= {"pretty","html:"})
public class Testrunner {

	
	
}
