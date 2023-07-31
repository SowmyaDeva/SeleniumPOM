package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;

public class TC_001 extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename="TC_001";
	}
	
	@Test(dataProvider="setData")
	public void verifyWithValidUserCredentials() {
		
		new LoginPage(driver).enterUsername("Admin").enterPassword("admin123").clickLogin();
	}

}
