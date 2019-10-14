package test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import AppModules.Rehlat_Exten;
import AppModules.Supplier_Flight_dummy;
import AppModules.Supplier_Html_Dummy;

import pageobjects.BaseClass;
import pageobjects.Loginpage;
import utility.Constant;
import utility.Utils;

public class RehlatExtensionCase {
	static WebDriver driver;
	

	@BeforeMethod
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addExtensions(new File("D:\\jarfiles\\Rehlat Extension\\Rehlat-Extension_v6.6.crx"));
		driver = new ChromeDriver(options);
         driver.get("https://www.cleartrip.com/");
         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         new BaseClass(driver);
		
	}
	
	@Test
	public void testExtension() throws Exception {
		
		Rehlat_Exten.Clear_Com(driver);
		Rehlat_Exten.Clear_AE(driver);
		Rehlat_Exten.Clear_SA(driver);
		
	}

	@AfterMethod
	public void stop() {
		driver.quit();
	}
	
	
	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}
