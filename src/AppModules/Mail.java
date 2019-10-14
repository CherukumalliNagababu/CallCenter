package AppModules;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utility.Utils;

public class Mail extends AllStatus_tableView  {
	
	public static void testmail(int iTestCaseRow) throws EmailException
	{
	String line="----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
	String gap="\n"+"\n"+"\n"+"\n"+"\n";
	System.out.println(""+COMDomainNames+"\n"+line+"\n"+COMSoldOuts+"\n"+line+"\n"+COMTrancationSuccess+"\n"+line+"\n"+COMTransactionHold+"\n"+line+"\n"+COMPartiallyTicketed+"\n"+line+"\n"+COMConfirmationPendingdonotrebook+"\n"+line+"\n"+COMCancellationRequest
			 +gap+ ""+line+"\n"+SADomainNames+"\n"+line+"\n"+SASoldOuts+"\n"+line+"\n"+SATrancationSuccess+"\n"+line+"\n"+SATransactionHold+"\n"+line+"\n"+SAPartiallyTicketed+"\n"+line+"\n"+SAConfirmationPendingdonotrebook+"\n"+line+"\n"+SACancellationRequest
			 +gap+ ""+line+"\n"+AEDomainNames+"\n"+line+"\n"+AESoldOuts+"\n"+line+"\n"+AETrancationSuccess+"\n"+line+"\n"+AETransactionHold+"\n"+line+"\n"+AEPartiallyTicketed+"\n"+line+"\n"+AEConfirmationPendingdonotrebook+"\n"+line+"\n"+AECancellationRequest
			 +gap+ ""+line+"\n"+EGDomainNames+"\n"+line+"\n"+EGSoldOuts+"\n"+line+"\n"+EGTrancationSuccess+"\n"+line+"\n"+EGTransactionHold+"\n"+line+"\n"+EGPartiallyTicketed+"\n"+line+"\n"+EGConfirmationPendingdonotrebook+"\n"+line+"\n"+EGCancellationRequest);
	
	System.out.println("Started");
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	
	email.setSubject(Utils.timestamp()+" - Automated Reports of All Bookings Status from CallCenter ");
	System.out.println("2");
	

	
email.setMsg(line+"\n"+COMDomainNames+"\n"+line+"\n"+COMSoldOuts+"\n"+line+"\n"+COMTrancationSuccess+"\n"+line+"\n"+COMTransactionHold+"\n"+line+"\n"+COMPartiallyTicketed+"\n"+line+"\n"+COMConfirmationPendingdonotrebook+"\n"+line+"\n"+COMCancellationRequest
		 +gap+line+"\n"+SADomainNames+"\n"+line+"\n"+SASoldOuts+"\n"+line+"\n"+SATrancationSuccess+"\n"+line+"\n"+SATransactionHold+"\n"+line+"\n"+SAPartiallyTicketed+"\n"+line+"\n"+SAConfirmationPendingdonotrebook+"\n"+line+"\n"+SACancellationRequest
		 +gap+line+"\n"+AEDomainNames+"\n"+line+"\n"+AESoldOuts+"\n"+line+"\n"+AETrancationSuccess+"\n"+line+"\n"+AETransactionHold+"\n"+line+"\n"+AEPartiallyTicketed+"\n"+line+"\n"+AEConfirmationPendingdonotrebook+"\n"+line+"\n"+AECancellationRequest
		 +gap+line+"\n"+EGDomainNames+"\n"+line+"\n"+EGSoldOuts+"\n"+line+"\n"+EGTrancationSuccess+"\n"+line+"\n"+EGTransactionHold+"\n"+line+"\n"+EGPartiallyTicketed+"\n"+line+"\n"+EGConfirmationPendingdonotrebook+"\n"+line+"\n"+EGCancellationRequest);
	
	email.addTo("Sreenivas.bodige@rehlat.com");
	email.addTo("tariqraza@rehlat.com");
	email.addTo("rajendra.purohit@rehlat.com ");
	email.addTo("brteam@rehlat.com");
    //email.addTo("naga.ch199@gmail.com");
	
	System.out.println("3");
	email.send();
	System.out.println("END");
	
	}
	
	
	
	
	
	
	public static void Attachahtmltestmail(int iTestCaseRow) throws EmailException, InterruptedException, IOException
	{
		
		
		
	
		System.setProperty("webdriver.chrome.driver","D:\\jarfiles\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			d.get("file:///D:/SeleniumProject/CallCenter/AllStatus_Table.html");
			
			// Take screenshot and store as a file format
			File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			
			 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("D:\\SeleniumProject\\WebScreen\\TableView.png"));
			
			 
			
			
			
			
			 EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath("D:\\SeleniumProject\\WebScreen\\TableView.png");
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
				email.setSubject(Utils.timestamp()+" - Automated Reports of All Bookings Status from CallCenter ");
				System.out.println("2");
				
				email.addTo("Sreenivas.bodige@rehlat.com");
				email.addTo("tariqraza@rehlat.com");
				email.addTo("rajendra.purohit@rehlat.com ");
				email.addTo("brteam@rehlat.com");
				//email.addTo("naga.ch199@gmail.com");
			    
			    email.setMsg("Here  is  the  Transaction Successful, Soldouts , Cancelled , Transaction Hold   Bookings from CallCenter");
			    System.out.println(2);
			  // add the attachment
			    email.attach(attachment);
			    System.out.println(3);
			  // send the email
			    email.send();
			    System.out.println("END");
			
				Thread.sleep(2000);
	
		
		d.quit();
			
		

	  
	}
}
