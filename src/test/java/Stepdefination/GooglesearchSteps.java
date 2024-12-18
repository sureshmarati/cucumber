//package Stepdefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class GooglesearchSteps
//{
//	WebDriver driver;
//	@Given("User opens the Chrome browser")
//	public void user_opens_the_chrome_browser() 
//	{
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	}
//
//	@Given("User is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.navigate().to("https://www.google.com");
//	}
//
//	@When("user enters data in serach")
//	public void user_enters_data_in_serach() throws Exception
//	{
//		driver.findElement(By.name("q")).sendKeys("Murugan lord weapon");
//		Thread.sleep(3000);
//	}
//
//	@When("user clicks on enter")
//	public void user_clicks_on_enter() 
//	{
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("Search results displayed")
//	public void search_results_displayed()
//	{
//		driver.getPageSource().contains("Hindu God of War");
//	}
//
//
//
//}
