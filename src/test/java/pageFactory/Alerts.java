	package pageFactory;
	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Alerts {
		public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://ksrtc.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.findElement(By.id("submitSearch")).click();
	Alert ai = driver.switchTo().alert();
	ai.accept();
		}
	}
