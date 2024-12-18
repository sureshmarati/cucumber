package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFLogin 
{
		WebDriver driver;
	@FindBy(name="username")
	WebElement txt_Username;
	
	@FindBy(name="password")
	WebElement txt_password;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement btn_login;
	
	public PageFLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, PageFLogin.class );
	}
	
	public void Enterusername(String username) 
	{
		txt_Username.sendKeys(username);
	}
	public void EnterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void Clicklogin()
	{
		btn_login.click();
	}
}
