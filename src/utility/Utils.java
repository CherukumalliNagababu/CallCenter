package utility;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import jxl.Sheet;
import jxl.Workbook;


public class Utils {
	public static WebDriver driver = null;
	protected static String CurrencyCodeText = null;

	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception {

		String sBrowserName;
		try {
			sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
			if (sBrowserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver", "D:\\jarfiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				driver.get(Constant.URL);
				//Log.info("Web application launched successfully");

				driver.manage().window().maximize();
				// driver.manage().window().setSize(new Dimension(1366, 768));
				//Log.info("Application Window Maximize");
			}
			if (sBrowserName.equals("GC")) {

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
				driver = new ChromeDriver(options);

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				driver.get(Constant.URL);
				//Log.info("Web application launched successfully");

				// driver.manage().window().maximize();
				//Log.info("Application Window Maximize");
			}

			if (sBrowserName.equals("IE")) {

				System.setProperty("webdriver.ie.driver", "D:\\jarfiles\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				driver.get(Constant.URL);
				//Log.info("Web application launched successfully");

				// driver.manage().window().setSize(new Dimension(1366, 768));
				driver.manage().window().maximize();
				//Log.info("Application Window Maximize");
			}
		} catch (Exception e) {
			//Log.error("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
		}
		return driver;

	}

	public static WebDriver HOpenBrowser(int iTestCaseRow) throws Exception {

		String sBrowserName;
		try {
			sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.HCol_Browser);
			if (sBrowserName.equals("FF")) {
				System.setProperty("webdriver.gecko.driver", "D:\\jarfiles\\geckodriver.exe");
				driver = new FirefoxDriver();
				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				driver.get(Constant.URL);
				//Log.info("Web application launched successfully");

				driver.manage().window().maximize();
				// driver.manage().window().setSize(new Dimension(1366, 768));
				//Log.info("Application Window Maximize");
			}
			if (sBrowserName.equals("GC")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");

				System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
				driver = new ChromeDriver(options);

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				driver.get(Constant.URL);
				//Log.info("Web application launched successfully");

				driver.manage().window().maximize();
				//Log.info("Application Window Maximize");
			}

			if (sBrowserName.equals("IE")) {

				System.setProperty("webdriver.ie.driver", "D:\\jarfiles\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				driver.get(Constant.URL);
				//Log.info("Web application launched successfully");

				// driver.manage().window().setSize(new Dimension(1366, 768));
				driver.manage().window().maximize();
				//Log.info("Application Window Maximize");
			}
		} catch (Exception e) {
			//Log.error("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
		}
		return driver;

	}

	public static WebDriver GOpenBrowser(int iTestCaseRow, String url) throws Exception {

		String sBrowserName;

		try {
			sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);
			System.out.println("Browser name" + sBrowserName);
			if (sBrowserName.equals("FF")) {

				System.setProperty("webdriver.gecko.driver", "D:\\jarfiles\\geckodriver.exe");
				driver = new FirefoxDriver();

				
				
				/*
				 * DesiredCapabilities capability =
				 * DesiredCapabilities.firefox(); driver = new
				 * RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				 * capability);
				 */

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 30 seconds");
				driver.manage().deleteAllCookies();
				// driver.get(Constant.URL);
				driver.get(url);
				//Log.info("Web application launched successfully");

				// driver.manage().window().maximize();
				// driver.manage().window().setSize(new Dimension(1366, 768));
				//Log.info("Application Window Maximize");
			}
			if (sBrowserName.equals("GC")) {

				System.out.println("Chrome");

				System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
				 driver =new ChromeDriver();

				/*
				 * DesiredCapabilities capability =
				 * DesiredCapabilities.chrome();
				 * capability.setBrowserName("chrome");
				 * capability.setPlatform(Platform.ANY); driver = new
				 * RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				 * capability);
				 */

				/////////////////////////////////////
				/*
				 * DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
				 * ChromeOptions options = new ChromeOptions(); 
				 * options.addArguments("test-type");
				 * 
				 * 
				 * capabilities.setCapability("chrome.binary",
				 * "<Path to binary>");
				 * capabilities.setCapability(ChromeOptions.CAPABILITY,
				 * options); driver = new ChromeDriver();
				 */
				////////////////////////////////

				/*DesiredCapabilities capability = DesiredCapabilities.chrome();
				driver = new RemoteWebDriver(new URL("http://192.168.1.52:4444/wd/hub"), capability);*/

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				// driver.get(Constant.URL);
				driver.get(url);
				//Log.info("Web application launched successfully");

				driver.manage().window().maximize();
				//Log.info("Application Window Maximize");

			}

			if (sBrowserName.equals("IE")) {

				System.setProperty("webdriver.ie.driver", "D:\\jarfiles\\IEDriverServer.exe");
				// driver =new InternetExplorerDriver();
				DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

				//Log.info("New driver instantiated");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				//Log.info("Implicit wait applied on the driver for 10 seconds");
				driver.manage().deleteAllCookies();
				// driver.get(Constant.URL);
				driver.get(url);
				//Log.info("Web application launched successfully");

				// driver.manage().window().setSize(new Dimension(1366, 768));
				driver.manage().window().maximize();
				////Log.info("Application Window Maximize");
			}
		} catch (Exception e) {
			////Log.error("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
		}
		return driver;

	}

	public static WebDriver setup(String browserName) {
		if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\jarfiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			////Log.info("New driver instantiated");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			////Log.info("Implicit wait applied on the driver for 10 seconds");

			driver.get(Constant.URL);
			////Log.info("Web application launched successfully");

			driver.manage().deleteAllCookies();
			driver.manage().window().setSize(new Dimension(1366, 768));
			// driver.manage().window().maximize();
			////Log.info("Application Window Maximize");
		}
		if (browserName.equals("GC")) {

			System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
			driver = new ChromeDriver();

			////Log.info("New driver instantiated");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Log.info("Implicit wait applied on the driver for 10 seconds");
			driver.get(Constant.URL);
			//Log.info("Web application launched successfully");

			driver.manage().window().maximize();
			//Log.info("Application Window Maximize");
		}
		return driver;

	}

	

	

	public static void scroll() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	public static void longscrollDown() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
	}

	public static void longscrollUp() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-1250)", "");
	}

	public static void scrollUp() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
	}

	public static String getTestCaseName(String sTestCase) throws Exception {
		String value = sTestCase;
		try {
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");
			value = value.substring(posi + 1);
			return value;
		} catch (Exception e) {
			//Log.error("Class Utils | Method getTestCaseName | Exception desc : " + e.getMessage());
			throw (e);
		}
	}

	public static void mouseHoverAction(WebElement mainElement, String subElement) {

		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		if (subElement.equals("Accessories")) {
			action.moveToElement(driver.findElement(By.linkText("Accessories")));
			//Log.info("Accessories link is found under Product Category");
		}
		if (subElement.equals("iMacs")) {
			action.moveToElement(driver.findElement(By.linkText("iMacs")));
			//Log.info("iMacs link is found under Product Category");
		}
		if (subElement.equals("iPads")) {
			action.moveToElement(driver.findElement(By.linkText("iPads")));
			//Log.info("iPads link is found under Product Category");
		}
		if (subElement.equals("iPhones")) {
			action.moveToElement(driver.findElement(By.linkText("iPhones")));
			//Log.info("iPhones link is found under Product Category");
		}
		action.click();
		action.perform();
		//Log.info("Click action is performed on the selected Product Type");
	}

	public static void waitForElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void ElementisVisiabl(WebElement element1) {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element1));
	}

	public static void isElementLoaded(WebElement elementToBeLoaded) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));

	}

	public static boolean retryingFindClick(WebElement element) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				element.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	public static void PopularDeals() throws InterruptedException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1100)", "");
		List<WebElement> toplinks = driver.findElements(By.xpath("//div[@class='col-sm-3  col-xs-12 myDealsBlock']/a"));

		System.out.println("No of links:" + toplinks.size());
		String link[] = new String[toplinks.size()];
		System.out.println("Link names are:");
		System.out.println("**************************");
		int i = 0;
		for (WebElement e : toplinks) {
			link[i] = e.getText();
			System.out.println(link[i]);
			i++;
		}
		System.out.println("**************************");
		for (String l : link) {
			Thread.sleep(2000);
			driver.findElement(By.linkText(l)).click();
			Thread.sleep(2000);
			if (driver.getTitle().equals("Error 404")) {
				System.out.println("Link:" + "" + l + " " + "Not working");
			} else {
				System.out.println("Link:" + "" + l + " " + "Working fine");
				driver.navigate().back();
				Thread.sleep(2000);
			}
		}

	}

	public static String timestamp() {
		return new SimpleDateFormat("d-M-yyyy hh:mm a").format(new Date());
	}
	
	public static String CurrentDate() {
		return new SimpleDateFormat("d-M-yyyy").format(new Date());
	}
	public static String Yesterdaytimestamp() {
	 Calendar cal = Calendar.getInstance();
	 cal.add(Calendar.DATE, -1);
	  return new SimpleDateFormat("d-M-yyyy").format(cal.getTime());
	  /* System.out.println("Today's date is "+dateFormat.format(cal.getTime()));*/

	   //cal.add(Calendar.DATE, -1);
	   //System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime())); 
	}
	public static String YesterdayName() {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, -1);
		  return new SimpleDateFormat("EEEE").format(cal.getTime());
		 
		}
	public static String TodayName() {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, 0);
		  return new SimpleDateFormat("EEEE").format(cal.getTime());
		 
		}
	public static String DaybeforeYesterdaytimestamp() {
		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DATE, -2);
		  return new SimpleDateFormat("d-M-yyyy").format(cal.getTime());
		  /* System.out.println("Today's date is "+dateFormat.format(cal.getTime()));*/

		   //cal.add(Calendar.DATE, -1);
		   //System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime())); 
		}
	public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(Constant.Path_ScreenShot + sTestCaseName + timestamp() + ".jpg");
			// FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot +
			// sTestCaseName +".jpg"));
			FileUtils.copyFile(scrFile, dest);
		} catch (Exception e) {
			//Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "
					//+ e.getMessage());
			throw new Exception();
		}
	}

	// ******************************** AirLines ************************************************//

	public static void SelectAirline() throws InterruptedException {

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,1000)", "");

		WebElement show = driver.findElement(By.linkText("Show more"));

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Show more"));

		if (element.equals(element)) {
			action.doubleClick(element).perform();
			Thread.sleep(3000);
			System.out.println("if click");
		}

		// *[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr/td[2]
		// this is left side Airlines Lists
		List<WebElement> we = driver
				.findElements(By.xpath("//*[@id='InnerDiv']/div[2]/div[2]/div/div[3]/table/tbody/tr/td[2]"));
		//Log.info("AirLines values are store in the list");
		System.out.println(we.size());

		for (WebElement e : we)

		{

			System.out.println(e.getText());

			String element1 = e.getText();
			// String sValue = e.getAttribute("value");

			if (element1.equals("flynas")) {

				Actions action1 = new Actions(driver);
				// Double click
				action1.doubleClick(e).perform();

				Thread.sleep(4000);
				System.out.println(e.getText() + ":AirLine Available");
				break;
			}

			else {
				System.out.println("Did not match Airlines");
			}
		}
	}

	public static void SelectTopAirline() throws InterruptedException {

		List<WebElement> we = driver.findElements(By.xpath("//div[@class='es-carousel myESCarBlock']/ul/li/a/span[1]"));
		//Log.info("AirLines values are store in the list");
		System.out.println(we.size());

		//Log.info("AirLines values are displayed");
		System.out.println("***** Suggestions are ****** ");

		System.out.println("No of links:" + we.size());

		for (WebElement e : we)

		{

			System.out.println(e.getText());

			String element1 = e.getText();

			if (element1.equalsIgnoreCase("Oman Air")) {
				e.click();
				Thread.sleep(4000);
				System.out.println(e + ":AirLine Available");
				//Log.info(e + ":clickable");
				break;
			}

			else {
				System.out.println("Did not match Airlines");
			}

		}

	}

	

	public static void HChangeCurrencyCode(int iTestCaseRow) throws Exception {

		String CurrencyCode = ExcelUtils.getCellData(iTestCaseRow, Constant.HCol_CurrencyCode);

		Utils.isElementLoaded(driver.findElement(By.id("CurrencySymbol")));
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.id("CurrencySymbol"))).build().perform();
		//Log.info("Mouse over Action is perform in CurrencySymbol");
		Thread.sleep(3000);
		List<WebElement> we = driver.findElements(By.xpath("//ul[@id='currencydropdownmenu']/li/ul/li/a/span"));
		//Log.info("Currency Code values are store in the list");
		System.out.println(we.size());

		for (WebElement e : we)

		{

			System.out.println(e.getText());

			String element1 = e.getText();

			if (element1.equalsIgnoreCase(CurrencyCode)) {
				Utils.waitForElement(e);
				e.click();
				//Log.info("Click action is perform on the Currency Code ");
				Thread.sleep(4000);

				break;
			}

		}
		Thread.sleep(2000);
		Utils.isElementLoaded(driver.findElement(By.id("CurrencySymbol")));
		String str = driver.findElement(By.id("CurrencySymbol")).getText();
		CurrencyCodeText = str.trim();
		System.out.println("CurrencyCodeText::" + CurrencyCodeText);

	}

	public static void GetChangeCurrencyCode_Home_page(int iTestCaseRow) throws Exception {

		Utils.isElementLoaded(driver.findElement(By.id("CurrencySymbol")));
		String CurrencyCodeText = driver.findElement(By.id("CurrencySymbol")).getText();
		System.out.println("CurrencyCodeText::" + CurrencyCodeText);
	}

	public static void ChangeDominName() throws Exception {

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span/img"))).build().perform();
		
		Thread.sleep(3000);
		List<WebElement> we = driver.findElements(By.xpath("//ul[@id='DomainNameFlag']/li/a"));
		
		System.out.println(we.size());

		for (WebElement e : we)

		{

			System.out.println(e.getText());

			String element1 = e.getText();

			if (element1.equalsIgnoreCase("EGYPT")) {

				String pcode = driver.getWindowHandle();
				System.out.println("Parent window code is: " + pcode);
				e.click();
				
				for (String ccode : driver.getWindowHandles()) {
					System.out.println("Child window code is: " + ccode);
					driver.switchTo().window(ccode);
				}

				Thread.sleep(4000);

				break;
			}

		}

	}

	

	public void selectOptionsFromDropdownList(WebElement dropdownObjectElement, String dropdownOption) {
		Select dropdownList = new Select(dropdownObjectElement);
		dropdownList.selectByVisibleText(dropdownOption);
		Reporter.log("The selected Dropdown Option is " + dropdownOption, true);
	}

	public List<WebElement> getDropdownOptionList(WebElement dropdownObjectElement) {
		Select dropdownList = new Select(dropdownObjectElement);
		List<WebElement> dropdownOptions = dropdownList.getOptions();
		Reporter.log("Number of Options Available in " + dropdownList + "List = " + dropdownOptions.size());

		/*
		 * for(WebElement dropdownOption : dropdownOptions){ String dropdownName
		 * = dropdownOption.getText(); Reporter.log(dropdownName); }
		 */
		return (dropdownOptions);
	}

	

	public static void DoubleClick(WebElement e) throws Exception {

		Actions action1 = new Actions(driver);
		// Double click
		action1.doubleClick(e).perform();
	}
	
public static void Emailsend(WebElement e) throws Exception {
		
		
		// Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("D:\\myProject\\test-output\\emailable-report.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("document of testng");
		  attachment.setName("OutPut");
       System.out.println(1);
		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.googlemail.com");
		  email.setSmtpPort(465);
		  
			System.out.println("1");
			email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
			email.setSSLOnConnect(true);
			email.setFrom("naga123.ch@gmail.com");
			email.setSubject("TestMail");
			System.out.println("2");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("naga199.ch@gmail.com");
		  email.setSubject("The picture");
		  email.setMsg("Here is the picture you wanted");
		  System.out.println(2);
		  // add the attachment
		  email.attach(attachment);
		  System.out.println(3);
		  // send the email
		  email.send();
		  System.out.println("END");
	
	}




}