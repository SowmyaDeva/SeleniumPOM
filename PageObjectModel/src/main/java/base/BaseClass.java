package base;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadFromExcel;

public class BaseClass {

	public ChromeDriver driver;
	public String filename;

	
	@BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterClass
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider(name="getData")
	public String[][] setData() throws IOException {
		return ReadFromExcel.readData(filename);
	}
}
