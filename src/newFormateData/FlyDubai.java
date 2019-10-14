package newFormateData;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.IOException;




public class FlyDubai {

    private WebDriver d;

    
    

    @BeforeTest
    public void setup() {
        // maybe you change this for your local chromedriver
    	System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
    	d =new ChromeDriver();
     d.manage().window().maximize();
        d.get("https://www.flydubai.com/en/");
    }

    @Test
    public void Fly() throws IOException, InterruptedException {

    	d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Return trip'])[1]/following::label[1]")).click();
       d.findElement(By.id("airport-origin")).sendKeys("DXB");
       d.findElement(By.id("airport-origin")).sendKeys(Keys.TAB);
       Thread.sleep(3000);
       d.findElement(By.id("airport-destination")).sendKeys("KWI");
       Thread.sleep(3000);
      //d.findElement(By.id("airport-destination")).sendKeys(Keys.ENTER);
      // Thread.sleep(5000);
       d.findElement(By.id("departureDate")).click();
       d.findElement(By.id("departureDate")).sendKeys(Keys.ENTER);
      // d.findElement(By.id("departureDate")).sendKeys("29 Jul 19");
      // Thread.sleep(3000);
      Thread.sleep(3000);
      // d.findElement(By.xpath("//button[@id='find-flights']")).click();
       Thread.sleep(3000);
       d.findElement(By.xpath("//div[4]/div/div/div/div[6]/div")).click();
       Thread.sleep(5000);
       d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='from'])[5]/following::div[1]")).click();
       Thread.sleep(5000);
       d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Penalties apply'])[3]/following::div[4]")).click();
       Thread.sleep(3000);
       d.findElement(By.xpath("//div[2]/button")).click();
       
       d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Terms and conditions'])[1]/following::span[1]")).click();
       Thread.sleep(10000);
       Select s=new Select(d.findElement(By.name("atitleSelect0")));
       s.selectByIndex(2);
       
       d.findElement(By.id("pax1c2")).sendKeys("naga");
       
       d.findElement(By.id("pax1c4")).sendKeys("babu");
       d.findElement(By.id("pax1c5")).sendKeys("naga@gmail.com");
       d.findElement(By.id("pax1c6")).sendKeys("naga@gmail.com");
       Thread.sleep(3000);
       Select day=new Select(d.findElement(By.name("adultDOBDay0")));
       day.selectByIndex(2);
       Thread.sleep(3000);
       Select m=new Select(d.findElement(By.name("adultDOBMonth0")));
       m.selectByIndex(2);
       Thread.sleep(3000);
       Select y=new Select(d.findElement(By.name("adultDOBYear0")));
      y.selectByIndex(2);
      Thread.sleep(3000);
      Select cu=new Select(d.findElement(By.id("countryCode0")));
      cu.selectByIndex(2);
      Thread.sleep(3000);
      d.findElement(By.id("mobileNumber0")).sendKeys("28456");
      
      Select cu1=new Select(d.findElement(By.id("telcountryCode0")));
      cu1.selectByIndex(2);
      Thread.sleep(3000);
      d.findElement(By.id("telNumber0")).sendKeys("28456");
      Thread.sleep(3000);
      Select re=new Select(d.findElement(By.name("aCountryOfResidence0")));
      re.selectByIndex(2);
      Thread.sleep(3000);
      
      JavascriptExecutor jse = (JavascriptExecutor) d;
		jse.executeScript("window.scrollBy(0,500)", "");
      d.findElement(By.id("addExtra")).click();
      Thread.sleep(15000);
      
      JavascriptExecutor jse1 = (JavascriptExecutor) d;
		jse1.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(5000);
      d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No travel insurance, thanks.'])[1]/following::button[1]")).click();
      Thread.sleep(5000);
      d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Extras'])[1]/following::span[1]")).click();
      Thread.sleep(3000);
      JavascriptExecutor jse12 = (JavascriptExecutor) d;
		jse12.executeScript("window.scrollBy(0,1000)", "");
      d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card number *'])[2]/following::input[1]")).sendKeys("4242424242424242");
   
      
    		  Select mo1=new Select(d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card expiry date *'])[2]/following::select[1]")));
      mo1.selectByIndex(2);
      Thread.sleep(3000);
      Select mo2=new Select(d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card expiry date *'])[2]/following::select[2]")));
      mo2.selectByIndex(2);
      Thread.sleep(3000);
     
      d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Security code *'])[2]/following::input[1]")).sendKeys("222");
      Thread.sleep(1000);
    d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name *'])[2]/following::input[1]")).sendKeys("nagababau");
    Thread.sleep(1000);
    d.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name *'])[2]/following::input[1]")).sendKeys("cheru");
    Thread.sleep(1000);
    d.findElement(By.xpath("(//input[@name='Address1'])[2]")).sendKeys("Hyderabad");
    Thread.sleep(1000);
    d.findElement(By.xpath("(//input[@name='City'])[2]")).sendKeys("ameer");
    Thread.sleep(1000);
    
    Select mo22=new Select(d.findElement(By.xpath("(//select[@name='BillingCountry'])[2]")));
    Thread.sleep(3000);
    mo22.selectByIndex(2);
    Thread.sleep(3000);
    
    d.findElement(By.id("checkbox2")).click();
    Thread.sleep(3000);
    d.findElement(By.xpath("(//button[@id='paynowbtn'])[3]")).click();
    
    
    }

   
    @AfterTest
    public void tearDown() {
        //d.quit();
    }

    
}