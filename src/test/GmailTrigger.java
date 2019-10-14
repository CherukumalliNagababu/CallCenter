package test;

import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;

import org.apache.commons.mail.SimpleEmail;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class GmailTrigger {
	WebDriver driver;
	// COM
	String NumberOfUsers = "30";
		int Total_Response_Time_COM;
		double avg_Response_Time_COM;
		int Total_Response_Time_COM_MS;
		double avg_Response_Time_COM_MS;
	@BeforeMethod
	public void beforeMethod() throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.get("https://mail.google.com/mail/");
		Thread.sleep(3000);

	}
	

	@Test
	public void gmailLogin() throws Exception {

		// GmailSteps.Login();

		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("nagababu.cherukumalli@rehlat.com");
		Thread.sleep(2000);
		System.out.println("Enter User Name");
		driver.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		System.out.println("Click On Next Button");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("naga@qtselenium");
		Thread.sleep(2000);
		System.out.println("Enter PWD");
		
		driver.findElement(By.xpath("//div[@id='passwordNext']/content/span")).click();
		Thread.sleep(10000);
		System.out.println("Click On login Button");
		driver.navigate().refresh();
		Thread.sleep(6000);
		driver.findElement(By.name("q")).sendKeys("BRB sales and email List report");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("#gbqfb")).click();
		Thread.sleep(6000);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd ");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String st = dateFormat.format(date);
		String[] spliteddate = st.split("-");
		System.out.println("Split the Year::" + spliteddate[0]);
		System.out.println("Split the month::" + spliteddate[1]);
		System.out.println("Split the Date::" + spliteddate[2]);
        System.out.println("BRB sales and email List report - " + spliteddate[2] + "" + "" + spliteddate[1] + " " + spliteddate[0]);
		if (driver.findElement(By.xpath("//td[6]/div/div/div[2]/span[1]")).getText()
				.equals("BRB sales and email List report - " + spliteddate[2] + "" + "" + spliteddate[1] + " " + spliteddate[0])) {
			driver.findElement(By.xpath("//td[6]/div/div/div[2]/span[1]")).click();
			System.out.println("BRB mail received today!!!");
		} else {
			// HtmlEmail email = new HtmlEmail();
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			System.out.println("1");
			email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
			email.setSSLOnConnect(true);
			email.setFrom("naga123.ch@gmail.com");
			// email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report
			// For "+urldomain1[0]+" Domain");
			email.setSubject("HIGH PRIORITY : BRB mail not received today!!!");
			email.setMsg("Dear Rajendra," + "\n" + "" + "\n" + " We haven't received BRB sales mail for today." + "\n"
					+ " Request you to check and do needful on the same." + "\n" + "" + "\n" + "Thanks and Regards,"
					+ "\n" + "QA Team");

			System.out.println("2");
			email.addTo("rajendra.purohit@rehlat.com ");
			email.addCc("qateam@rehlat.com ");
			email.addCc("devteam@rehlat.com");
			//email.addTo("naga.ch199@gmail.com");
			System.out.println("3");
			email.send();
			System.out.println("END");

			System.out.println("naga");

		}

		
		/*
		 * List<WebElement> we=driver.findElements(By.
		 * xpath("//table[@class='F cf zt']/tbody/tr/td[6]//div/span[1]"));
		 * System.out.println(we.size());
		 * 
		 * 
		 * driver.findElement(By.xpath("//td[6]/div/div/div[2]/span"));
		 * 
		 * DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd "); Date
		 * date = new Date(); System.out.println(dateFormat.format(date));
		 * String st=dateFormat.format(date); String[] spliteddate =
		 * st.split("-"); System.out.println("Split the Date::"+spliteddate[2]);
		 * System.out.println("BRB sales and email List report - "+spliteddate[2
		 * ]+""+"Jul 2018"); for(WebElement e:we) { String test=e.getText();
		 * 
		 * if(test.equals("BRB sales and email List report - "+spliteddate[2]+
		 * ""+"Jul 2018")) { System.out.println(test); e.click();
		 * Thread.sleep(6000); break;
		 * 
		 * } else
		 * if("BRB sales and email List report - "+spliteddate[2]+""+"Jul 2018"
		 * != null) { //StringBuilder htmlStringBuilder=new StringBuilder(); //
		 * HtmlEmail email = new HtmlEmail();
		 * 
		 * Email email = new SimpleEmail();
		 * email.setHostName("smtp.googlemail.com"); email.setSmtpPort(465);
		 * System.out.println("1"); email.setAuthenticator(new
		 * DefaultAuthenticator("nagababu.cherukumalli@rehlat.com",
		 * "naga@qtselenium")); email.setSSLOnConnect(true);
		 * email.setFrom("naga123.ch@gmail.com");
		 * //email.setSubject(Utils.Yesterdaytimestamp()
		 * +" - Automation Report For "+urldomain1[0]+" Domain");
		 * email.setSubject("HIGH PRIORITY : BRB mail not received today!!!");
		 * email.setMsg("Dear Rajendra,"+"\n"+""+
		 * "\n"+" We haven't received BRB sales mail for today."
		 * +"\n"+" Request you to check and do needful on the same."+"\n"+""+
		 * "\n"+"Thanks and Regards,"+"\n"+"QA Team");
		 * 
		 * 
		 * System.out.println("2"); email.addTo("naga.ch199@gmail.com");
		 * 
		 * 
		 * System.out.println("3"); email.send(); System.out.println("END");
		 * break; } }
		 */

	}

	@AfterMethod
	public void afterMethod() throws IOException {

		driver.close();

	}

}
