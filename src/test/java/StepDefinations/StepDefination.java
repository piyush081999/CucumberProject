package StepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
 public WebDriver driver;
	
 @Given("^Intialize the Webdriver$")
 public void intialize_the_webdriver() throws Throwable {
    
	 driver = new ChromeDriver();
 }

 @When("^user navigates to  \"([^\"]*)\"$")
 public void user_navigates_to_something(String strArg1) throws Throwable {
   driver.get(strArg1);
 }

 @Then("^user should be able to login successfully$")
 public void user_should_be_able_to_login_successfully() throws Throwable {
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("username");
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
     driver.findElement(By.xpath("//input[@id='Login']")).click();
    
    
 }

 @And("^enter (.+) and (.+) and click on login button$")
 public void enter_and_and_click_on_login_button(String username, String password) throws Throwable {
      
 }

	    
}
