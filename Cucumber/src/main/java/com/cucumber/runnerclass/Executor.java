
package com.cucumber.runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
					glue = "classpath:com/cucumber/stepdefinitions")
public class Executor {

}
