package orangelogin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	WebDriver driver = null;
	By txt_Username = By.name("username");
	By txt_password = By.name("password");
	By btn_login = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(id="name")
	WebElement sr_Username;
	public void enterusername(String username) 
	{
		driver.findElement(txt_Username).sendKeys(username);
		System.out.println("User is on  loginpage");
		
	}
	public void enterpassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void Clickonloginbtn()
	{
		driver.findElement(btn_login).click();
		
	}
}
