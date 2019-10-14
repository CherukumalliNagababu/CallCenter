package AppModules;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rehlat_Exten {
	
public static void Clear_Com(WebDriver driver) throws IOException, InterruptedException{
	 System.out.println("------------COM---------------");
	driver.get("https://www.cleartrip.com/");
	Set<String> set1 = driver.getWindowHandles();
	Iterator<String> win1 = set1.iterator();
	String parent = win1.next();
	String child = win1.next();
	driver.switchTo().window(child);
	driver.close();
	driver.switchTo().window(parent);
	Thread.sleep(5000);
	driver.findElement(By.id("FromTag")).sendKeys("MCT");
	Thread.sleep(5000);
	driver.findElement(By.id("FromTag")).sendKeys(Keys.TAB);
	driver.findElement(By.id("ToTag")).sendKeys("DXB");
	Thread.sleep(5000);
	driver.findElement(By.id("ToTag")).sendKeys(Keys.TAB);
	
	driver.findElement(By.id("DepartDate")).click();
	
	driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
	driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='price']"))));
	String s=driver.findElement(By.xpath("//span[@id='price']")).getText();
	System.out.println(s);
	String[] value=s.split(" ");
	System.out.println(value[0]);
	System.out.println(value[1]);
	double d1=Double.parseDouble(value[1]);  
	 String ClientSideValue =String.format("%.2f",d1);
	driver.findElement(By.xpath("//button[@id='bookNowButton']")).click();
	Thread.sleep(5000);
	String currentWindow = driver.getWindowHandle();
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String windowHandle : windowHandles) {
		if (!windowHandle.equalsIgnoreCase(currentWindow)) {
			driver.switchTo().window(windowHandle);
		}
	}
	Thread.sleep(30000);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='col-md-12 summHD7']/span[2]"))));
	String bookValue=driver.findElement(By.xpath("//div[@class='col-md-12 summHD7']/span[2]")).getText();
	System.out.println(bookValue);
	String[] getValue=bookValue.split(" ");
	System.out.println(getValue[0]);
	System.out.println(getValue[1]);
	double d2=Double.parseDouble(getValue[1]);  
	String OurSideValue =String.format("%.2f",d2);
	System.out.println(ClientSideValue +"  "+OurSideValue);
	boolean status = false;
	if (ClientSideValue.equals(OurSideValue)) {
		System.out.println("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE MATCHING");
		status = true;
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(scrFile, new File("D://jarfiles//Rehlat Extension//ScreenShot//image_"+timestamp()+".png"));
		
	} else {
		System.out.println("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE NOT MATCHING");

		//Assert.assertTrue("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE NOT MATCHING",status);
				//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("D://jarfiles//Rehlat Extension//ScreenShot//image_"+timestamp()+".png"));
        //status = false;
	}
	
	}
	
	
public static void Clear_AE(WebDriver driver) throws IOException, InterruptedException{
	   
	  System.out.println("------------AE---------------");
	   driver.get("https://www.cleartrip.ae/");
		/*Set<String> set1 = driver.getWindowHandles();
		Iterator<String> win1 = set1.iterator();
		String parent = win1.next();
		String child = win1.next();
		driver.switchTo().window(child);
		driver.close();*/
		//driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.id("FromTag")).sendKeys("MCT");
		Thread.sleep(5000);
		driver.findElement(By.id("FromTag")).sendKeys(Keys.TAB);
		driver.findElement(By.id("ToTag")).sendKeys("DXB");
		Thread.sleep(5000);
		driver.findElement(By.id("ToTag")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("DepartDate")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='price']"))));
		String s=driver.findElement(By.xpath("//span[@id='price']")).getText();
		System.out.println(s);
		String[] value=s.split(" ");
		System.out.println(value[0]);
		System.out.println(value[1]);
		double d1=Double.parseDouble(value[1]);  
		 String ClientSideValue =String.format("%.2f",d1);
		driver.findElement(By.xpath("//button[@id='bookNowButton']")).click();
		Thread.sleep(5000);
		String currentWindow = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equalsIgnoreCase(currentWindow)) {
				driver.switchTo().window(windowHandle);
			}
		}
		Thread.sleep(30000);
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='col-md-12 summHD7']/span[2]"))));
		String bookValue=driver.findElement(By.xpath("//div[@class='col-md-12 summHD7']/span[2]")).getText();
		System.out.println(bookValue);
		String[] getValue=bookValue.split(" ");
		System.out.println(getValue[0]);
		System.out.println(getValue[1]);
		double d2=Double.parseDouble(getValue[1]);  
		String OurSideValue =String.format("%.2f",d2);
		System.out.println(ClientSideValue +"  "+OurSideValue);
		boolean status = false;
		if (ClientSideValue.equals(OurSideValue)) {
			System.out.println("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE MATCHING");
			status = true;
			//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //FileUtils.copyFile(scrFile, new File("D://jarfiles//Rehlat Extension//ScreenShot//image_"+timestamp()+".png"));
			
		} else {
			System.out.println("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE NOT MATCHING");

			//Assert.assertTrue("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE NOT MATCHING",status);
			
			//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       // FileUtils.copyFile(scrFile, new File("D://jarfiles//Rehlat Extension//ScreenShot//image_"+timestamp()+".png"));
	        //status = false;
		}
		
		}
		
public static void Clear_SA(WebDriver driver) throws IOException, InterruptedException{
	  System.out.println("------------SA---------------");
	driver.get("https://www.cleartrip.sa/");
	/*Set<String> set1 = driver.getWindowHandles();
	Iterator<String> win1 = set1.iterator();
	String parent = win1.next();
	String child = win1.next();
	driver.switchTo().window(child);
	driver.close();*/
	//driver.switchTo().window(parent);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@value='English']")).click();
	driver.findElement(By.id("FromTag")).sendKeys("MCT");
	Thread.sleep(5000);
	driver.findElement(By.id("FromTag")).sendKeys(Keys.TAB);
	driver.findElement(By.id("ToTag")).sendKeys("DXB");
	Thread.sleep(5000);
	driver.findElement(By.id("ToTag")).sendKeys(Keys.TAB);
	Thread.sleep(2000);
	driver.findElement(By.id("DepartDate")).click();
	
	driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
	driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='price']"))));
	String s=driver.findElement(By.xpath("//span[@id='price']")).getText();
	System.out.println(s);
	String[] value=s.split(" ");
	System.out.println(value[0]);
	System.out.println(value[1]);
	double d1=Double.parseDouble(value[1]);  
	 String ClientSideValue =String.format("%.2f",d1);
	driver.findElement(By.xpath("//button[@id='bookNowButton']")).click();
	Thread.sleep(5000);
	String currentWindow = driver.getWindowHandle();
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String windowHandle : windowHandles) {
		if (!windowHandle.equalsIgnoreCase(currentWindow)) {
			driver.switchTo().window(windowHandle);
		}
	}
	Thread.sleep(30000);
	WebDriverWait wait1 = new WebDriverWait(driver, 100);
	wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='col-md-12 summHD7']/span[2]"))));
	String bookValue=driver.findElement(By.xpath("//div[@class='col-md-12 summHD7']/span[2]")).getText();
	System.out.println(bookValue);
	String[] getValue=bookValue.split(" ");
	System.out.println(getValue[0]);
	System.out.println(getValue[1]);
	double d2=Double.parseDouble(getValue[1]);  
	String OurSideValue =String.format("%.2f",d2);
	System.out.println(ClientSideValue +"  "+OurSideValue);
	boolean status = false;
	if (ClientSideValue.equals(OurSideValue)) {
		System.out.println("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE MATCHING");
		status = true;
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("D://jarfiles//Rehlat Extension//ScreenShot//image_"+timestamp()+".png"));
		
	} else {
		System.out.println("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE NOT MATCHING");

		//Assert.assertTrue("FLIGHTS:CLIENT SIDE VALUE AND OUR SIDE VALUE BOTH ARE NOT MATCHING",status);
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(scrFile, new File("D://jarfiles//Rehlat Extension//ScreenShot//image_"+timestamp()+".png"));
        //status = false;
	}
	System.out.println("----------------------------------------------------------");
	}
	
			
	public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
}
