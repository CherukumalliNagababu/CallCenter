package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.Flights_BookingStatus_From_CallCenter;
import AppModules.Login;
import AppModules.NormalFormate;
import pageobjects.BaseClass;
import pageobjects.Loginpage;
import utility.Constant;
import utility.Utils;

public class Flights_Daily_Report {
	static WebDriver driver;
	private int iTestCaseRow;
	

	@BeforeMethod
	public void test() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver(options);
//B2BAgent
		// Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.manage().deleteAllCookies();
		driver.get(Constant.URL);
		new BaseClass(driver);
	}

	@Test
	public void Flight_Daily_Booking_Status_Reports() throws Exception {
		Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_AE(iTestCaseRow, driver);
		Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
		Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_SA(iTestCaseRow, driver);
		Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_EG(iTestCaseRow, driver);
		NormalFormate.TestFormate(iTestCaseRow, driver);
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}

}
