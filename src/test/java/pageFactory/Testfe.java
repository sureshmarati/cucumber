package pageFactory;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testfe
{
	WebDriver driver;

	By txt_username = By.name("email");
	By txt_password = By.name("pass");
	By btn_lohgin = By.name("login");
	
	public void Testfe(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void Enterusername(String email)
	{
		driver.findElement(txt_username).sendKeys(email);
	}
	public void Enterpassword(String password) 
	{
		driver.findElement(txt_password).sendKeys(password);
		
	}
	public void login()
	{
		driver.findElement(btn_lohgin).click();
		
	}
	}
