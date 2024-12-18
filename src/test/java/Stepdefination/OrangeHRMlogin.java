//package Stepdefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.*;
//
//public class OrangeHRMlogin 
//{
//	WebDriver driver=null;
//	@Given("open the firefoxdriver")
//	public void open_the_firefoxdriver() 
//	{
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	}
//
//	@And("verify the user is on search page")
//	public void verify_the_user_is_on_search_page() 
//	{
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("User enters the username and password")
//	public void user_enters_the_username_and_password() throws Throwable 
//	{
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		Thread.sleep(3000);
//
//	}
//
//	@And("user clicks on login button")
//	public void user_clicks_on_login_button() 
//	{
//		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
//	}
//
//	@Then("User navigate to home page")
//	public void user_navigate_to_home_page()
//	{
//		driver.getPageSource().contains("Time at Work");
//	}
//
//	@Then("User clicks on PIM")
//	public void user_clicks_on_pim()
//	{
//		driver.findElement(By.linkText("PIM")).click();
//	}
//
//	@Then("User clicks on Addemployee")
//	public void user_clicks_on_addemployee() 
//	{
//		driver.findElement(By.linkText("Add Employee")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("User enters Addemployee tab")
//	public void user_enters_addemployee_tab() 
//	{
//		driver.getPageSource().contains("Employee Information");
//	}
//
//	@When("user enters (.*)  and (.*)  and EmployeeID")
//	public void user_enters_firstname_and_lastname_and_employee_id( String firstname, 
//			String lastname, String EmployeeID) throws InterruptedException
//	{
//		driver.findElement(By.name("firstName")).sendKeys(firstname);
//		driver.findElement(By.name("lastName")).sendKeys(lastname);
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(EmployeeID);
//		Thread.sleep(3000);
//	}
//
//	@When("User clicks on save button")
//	public void user_clicks_on_save_button() 
//	{
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).submit();
//	}
//}
