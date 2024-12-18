package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PageFLogin;

public class LoginPagefactory 
{
	WebDriver driver;
	PageFLogin login;
@Given("chrome browser is open")
public void chrome_browser_is_open() 
{
	driver=new ChromeDriver();
	
	System.out.println("Insise Step - user enters Login panel");
}
@And("User is now on driver page")
public void user_is_now_on_driver_page() 
{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
}


@When("^User enters (.*) and (.*) $")
public void user_enters_username_and_password (String username, String password)
{
	login.Enterusername(username);
	login.EnterPassword(password);
	System.out.println("Insise Step -user enters Username and Password");
}

@And("User clicks on login button")
public void user_clicks_on_login_button() 
{
	login.Clicklogin();
	System.out.println("Insise Step - user clicks on login");
}

@Then("User is taken  to home page")
public void user_is_taken_to_home_page() 
{

	driver.getPageSource().concat("dashboard");
	System.out.println("Insise Step - user enters home page");
}
}


