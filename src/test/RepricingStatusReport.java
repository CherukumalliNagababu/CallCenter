package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.RepricingHtml;
import AppModules.RepricingReports;
import AppModules.Repricing_TH_CP_HTML_Reports;
import AppModules.Repricing_TH_CP_Reports;
import jxl.write.WriteException;
import pageobjects.BaseClass;
import utility.Constant;



public class RepricingStatusReport {
	static WebDriver driver;
	private int iTestCaseRow;
	@BeforeMethod
	public void test()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver(options);

		//Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.manage().deleteAllCookies();
		driver.get(Constant.URL);
		new BaseClass(driver);
	}
	
	@Test
	public void Repricing_Status_Report() throws Exception
	{
		RepricingReports.Repricing_com(iTestCaseRow, driver);
		RepricingReports.Repricing_SA(iTestCaseRow, driver);
		RepricingReports.Repricing_AE(iTestCaseRow, driver);
		RepricingReports.Repricing_EG(iTestCaseRow, driver);
		RepricingHtml.TestFormate(iTestCaseRow, driver);
	}
	@AfterMethod
	public void afterMethod() throws WriteException, IOException {
		
		driver.quit();
	}
}
