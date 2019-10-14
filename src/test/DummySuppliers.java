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
import AppModules.Flights_Supplier_BookingReport;
import AppModules.Flights_Supplier_Mail;
import AppModules.Login;
import AppModules.NormalFormate;
import AppModules.Supplier_Flight_dummy;
import AppModules.Supplier_Html_Dummy;
import pageobjects.BaseClass;
import pageobjects.Loginpage;
import utility.Constant;
import utility.Utils;

public class DummySuppliers {
	static WebDriver driver;
	private int iTestCaseRow;
	

	@BeforeMethod
	public void test() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver(options);

		// Log.info("New driver instantiated");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Log.info("Implicit wait applied on the driver for 10 seconds");
		driver.manage().deleteAllCookies();
		driver.get(Constant.URL);
		new BaseClass(driver);
	}

	@Test
	public void Flight_Daily_Booking_Status_Reports() throws Exception {
		Supplier_Flight_dummy.AllStatus_TS_SD_CN_TH_AE(iTestCaseRow, driver);
		Supplier_Flight_dummy.AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
		Supplier_Flight_dummy.AllStatus_TS_SD_CN_TH_SA(iTestCaseRow, driver);
		Supplier_Flight_dummy.AllStatus_TS_SD_CN_TH_EG(iTestCaseRow, driver);
		Supplier_Html_Dummy.TestFormate(iTestCaseRow, driver);
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}

}
