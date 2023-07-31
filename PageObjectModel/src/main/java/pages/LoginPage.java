package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;		
	}
	
	public LoginPage enterUsername(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		return new HomePage(driver);
	}
}
