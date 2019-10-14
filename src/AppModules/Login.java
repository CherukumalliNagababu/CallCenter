package AppModules;

import org.openqa.selenium.WebDriver;

import pageobjects.Loginpage;

public class Login {
	public static void LoginCallCenter(int iTestCaseRow) throws Exception {

	Loginpage.Email().sendKeys("Sreenivas.bodige@rehlat.com");
	Loginpage.Password().sendKeys("Rehlat@HYD@2022");
	Loginpage.Login_button().click();
	Thread.sleep(4000);
	}
}
