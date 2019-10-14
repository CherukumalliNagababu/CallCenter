package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.B2B_SKYSHOPPAGE;
import AppModules.B2B_SKYSHOP_HTMLREPORT;

import pageobjects.BaseClass;

import utility.Constant;
import utility.Retry;

public class Mouth {
	static WebDriver driver;
	private int iTestCaseRow;

	@BeforeMethod
	public void test() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.mouthshut.com/");
		new BaseClass(driver);
	}

	@Test
	public void ConfirmationPendingAlert_Reports() throws Exception {
		driver.findElement(By.xpath("//div[@id='sign-in']/span")).click();
		driver.findElement(By.linkText("Sign in with Google")).click();
		
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("nagababu.cherukumalli");
		Thread.sleep(2000);
		System.out.println("Enter User Name");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		System.out.println("Click On Next Button");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("naga@qtselenium");
		//Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("naga@qtselenium143");
		System.out.println("Enter PWD");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		System.out.println("Click On login Button");
		//driver.navigate().refresh();
		Thread.sleep(6000);
		
		driver.get("https://www.mouthshut.com/review/writereview_readall.aspx?cid=925667284");
		
		driver.findElement(By.id("imgWARPopUp")).click();
		driver.findElement(By.id("txtTitle")).sendKeys("Worst Customer Service");
		driver.findElement(By.xpath("//textarea")).sendKeys("i can earn $10,000 permonth with Easy Commissions");
	}

	@AfterMethod
	public void stop() {
		//driver.quit();
	}

}
