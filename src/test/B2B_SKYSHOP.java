package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.B2B_SKYSHOPPAGE;
import AppModules.B2B_SKYSHOP_HTMLREPORT;

import pageobjects.BaseClass;

import utility.Constant;
import utility.Retry;

public class B2B_SKYSHOP {
	static WebDriver driver;
	private int iTestCaseRow;

	@BeforeMethod
	public void test() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(Constant.URL);
		new BaseClass(driver);
	}

	@Test(retryAnalyzer=Retry.class)
	public void ConfirmationPendingAlert_Reports() throws Exception {
		B2B_SKYSHOPPAGE.ConfirmationPendingWithClient_AE(iTestCaseRow, driver);
		//B2B_SKYSHOPPAGE.ConfirmationPendingWithClient_COM(iTestCaseRow, driver);
		//B2B_SKYSHOPPAGE.ConfirmationPendingWithClient_SA(iTestCaseRow, driver);
		//B2B_SKYSHOPPAGE.ConfirmationPendingWithClient_EG(iTestCaseRow, driver);
		B2B_SKYSHOP_HTMLREPORT.GenerateMail(iTestCaseRow, driver);
		B2B_SKYSHOP_HTMLREPORT.getValues();
		
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}

}
