package CucumberOptions;

import org.junit.runner.RunWith; 

import io.cucumber.junit.CucumberOptions; 
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features="src/test/java/FeatureFiles",
  glue="StepDefinations",
 // dryRun =true,
  monochrome =true,
  tags = "@smoke"
       )

public class TestRunner {

}
