package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/test/java/features/sanityTest.feature", 
glue = "src/test/java/stepdefinition/SanityTestS.java",
tags = "@Edureka")
public class TestRunner {
}

