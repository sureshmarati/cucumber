package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import orangelogin.com.Login;

public class Hrmlogin {
	
	WebDriver driver;
	
	@Given("chrome browser is open")
	public void chrome_browser_is_open() 
	{
				driver = new FirefoxDriver();
	}

	@And("User is now on driver page")
	public void user_is_now_on_driver_page()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@When("User enters username and password")
	public void user_enters_username_and_password( String username, String password ) 
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("User is taken  to home page")
	public void user_is_taken_to_home_page()
	{
		driver.getPageSource().contains("Dashboard");
	}
	@When("User enters firstname Suresh and lastname Marati and EmployeeID <EmployeeID>")
	public void user_enters_firstname_suresh_and_lastname_marati_and_employee_id_employee_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
