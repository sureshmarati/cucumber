package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.Testfe;

public class Testfeature 
{
	WebDriver driver;
	Testfe  tl;
	@Given("Chrome browser should be open")
	public void chrome_browser_should_be_open() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@And("User is on Search page")
	public void user_is_on_search_page() 
	{
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(29, TimeUnit.SECONDS);
	}

	@When("^User enters \"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_enters_credentials(String email, String password) 
	{
		tl.Enterusername(email);
		tl.Enterpassword(password);
	}

	@Then("User is taken to home page")
	public void user_is_taken_to_home_page() 
	{
		driver.getPageSource().contains("dashboard");
	}

}
