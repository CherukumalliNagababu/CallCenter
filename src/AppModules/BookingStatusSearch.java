package AppModules;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Loginpage;
import utility.Constant;
import utility.ExcelUtils;
import utility.Utils;

public class BookingStatusSearch {
	public static void TransactionHold(int iTestCaseRow,WebDriver driver) throws Exception {

		
		Loginpage.FromDate().click();
		Thread.sleep(1000);
		
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateFrom(Constant.FromDate);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateTo(Constant.ToDate);
		Thread.sleep(1000);
		
		Select s=new Select(Loginpage.BookingSatus());
		s.selectByIndex(1);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		String count=Loginpage.FlightResults_text().getText();
		System.out.println(count);
		ExcelUtils.lable(0, 0,count);
		
    	String str = count.trim();
    	String[] splited = str.split("\\:");
    	System.out.println("No of Results Count"+splited[1]);
    	Thread.sleep(1000);
    	if("Flight Search Results : 0".equals(count))
    	{
    		ExcelUtils.lable(2, 2,"No Results are Found");
    	}
    	else
    	{
    	
    	//it's export the Header Values
    	ExcelUtils.lable(1, 0,"Booking Id");
    	ExcelUtils.lable(2, 0,"Trip Type");
    	ExcelUtils.lable(3, 0,"Pax Name");
    	ExcelUtils.lable(4, 0,"Status");
    	ExcelUtils.lable(5, 0,"Payment Status");
    	ExcelUtils.lable(6, 0,"Supplier ");
    	ExcelUtils.lable(7, 0,"PNR");
    	ExcelUtils.lable(8, 0,"Booking Date");
    	ExcelUtils.lable(9, 0,"Amount");
    	ExcelUtils.lable(10,0,"Client");
    	
    	
		List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
		System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		List<WebElement> td_collection1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td"));
		System.out.println("NUMBER OF Columns IN THIS TABLE = "+td_collection1.size()/tr_collection.size());
		
		int row_num,col_num;
        row_num=1;
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
            System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
            col_num=1;
            for(WebElement tdElement : td_collection)
            {
            	
            	ExcelUtils.lable(col_num, row_num, tdElement.getText());
            	
                System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
                col_num++;
                
                
            }
            row_num++;
        }
        
    	
    	

		
	}
		
	}
	
public static void SoldOut(int iTestCaseRow,WebDriver driver,String SiteName) throws Exception {

		
		Loginpage.FromDate().click();
		Thread.sleep(1000);
		System.out.println("saitname:"+SiteName);
		String CurrentUrl=driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
    	System.out.println("Current Url"+urldomain[1]);
    	String[] urldomain1 = urldomain[1].split("\\/");
    	System.out.println("Domain Name::"+urldomain1[0]);
    	
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
    	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		String st=dateFormat.format(date);
		String[] spliteddate = st.split("-");
    	System.out.println("Split the Date::"+spliteddate[0]);
    	
    	
		Loginpage.Select_dateFrom(spliteddate[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateTo(spliteddate[0]);
		Thread.sleep(1000);
		
		Select s=new Select(Loginpage.BookingSatus());
		s.selectByIndex(11);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		String count=Loginpage.FlightResults_text().getText();
		System.out.println(count);
		ExcelUtils.lable(0, 0,count);
		
    	String str = count.trim();
    	String[] splited = str.split("\\:");
    	System.out.println("No of Results Count"+splited[1]);
    	Thread.sleep(1000);
    	if("Flight Search Results : 0".equals(count))
    	{
    		ExcelUtils.lable(2, 2,"No Results are Found");
    		
    		
    		 
            System.out.println("Started");
    		Email email = new SimpleEmail();
    		email.setHostName("smtp.googlemail.com");
    		email.setSmtpPort(465);
    		System.out.println("1");
    		email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
    		email.setSSLOnConnect(true);
    		email.setFrom("naga123.ch@gmail.com");
    		//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
    		email.setSubject(Utils.timestamp()+" - SoldOuts - Automation Report For "+urldomain1[0]+" Domain");
    		System.out.println("2");
    		
    		email.setMsg("Number of SoldOuts for "+urldomain1[0]+" Domain :"+splited[1]);
    		/*email.addTo("Sreenivas.bodige@rehlat.com ");
    		email.addTo("tariqraza@rehlat.com");*/
    		
    		email.addTo("naga.ch199@gmail.com");
    		System.out.println("3");
    		email.send();
    		System.out.println("END");
    	}
    	else
    	{
    	
    	//it's export the Header Values
    	ExcelUtils.lable(1, 0,"Booking Id");
    	ExcelUtils.lable(2, 0,"Trip Type");
    	ExcelUtils.lable(3, 0,"Pax Name");
    	ExcelUtils.lable(4, 0,"Status");
    	ExcelUtils.lable(5, 0,"Payment Status");
    	ExcelUtils.lable(6, 0,"Supplier ");
    	ExcelUtils.lable(7, 0,"PNR");
    	ExcelUtils.lable(8, 0,"Booking Date");
    	ExcelUtils.lable(9, 0,"Amount");
    	ExcelUtils.lable(10,0,"Client");
    	//ExcelUtils.lable(12,0,"Log Information");
    	
    	
		List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
		System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		List<WebElement> td_collection1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td"));
		System.out.println("NUMBER OF Columns IN THIS TABLE = "+td_collection1.size()/tr_collection.size());
		
		int row_num,col_num;
        row_num=1;
        for(WebElement trElement : tr_collection)
        {
            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
            System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
            col_num=1;
            for(WebElement tdElement : td_collection)
            {
            	
            	ExcelUtils.lable(col_num, row_num, tdElement.getText());
            	
                System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
                col_num++;
                
                
                
            }
            row_num++;
        }
        
        
        
        System.out.println("Started");
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		System.out.println("1");
		email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
		email.setSSLOnConnect(true);
		email.setFrom("naga123.ch@gmail.com");
		//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
		email.setSubject(Utils.timestamp()+" - SoldOuts - Automation Report For "+urldomain1[0]+" Domain");
		System.out.println("2");
		
		email.setMsg("Number of SoldOuts for "+urldomain1[0]+" Domain :"+splited[1]);
		/*email.addTo("Sreenivas.bodige@rehlat.com");
		email.addTo("tariqraza@rehlat.com");*/
		email.addTo("naga.ch199@gmail.com");
		System.out.println("3");
		email.send();
		System.out.println("END");
    	
        //****************************************************************************
       /* List<WebElement> BookingDetails = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td/a"));

		System.out.println("No of links:" + BookingDetails.size());
		
		int st=BookingDetails.size();
		int row_num1;
        row_num1=1;
        for(int i=1;i<=st;i++)
        {
        	String pcode = driver.getWindowHandle();
			System.out.println("Parent window code is: " + pcode);
        	driver.findElement(By.xpath("(//a[contains(text(),'Booking Details')])["+i+"]")).click();
        	
        	for (String ccode : driver.getWindowHandles()) 
        	{
				System.out.println("Child window code is: " + ccode);
				driver.switchTo().window(ccode);
			}
        	
        	Thread.sleep(2000);	
           String loginformation1=Loginpage.LogInformation_text1().getText();
           String loginformation2=Loginpage.LogInformation_text2().getText();
			Thread.sleep(2000);
			ExcelUtils.lable(12, row_num1, loginformation1+","+loginformation2);
			System.out.println(i);
			
				driver.close();
				driver.switchTo().window(pcode);
				Thread.sleep(1000);
			
				 row_num1++;
        }
       */
        
    	
		
	}
		
	}


public static void YesterdaySoldOuts(int iTestCaseRow,WebDriver driver) throws Exception {

	
	Loginpage.FromDate().click();
	Thread.sleep(1000);
	
	String CurrentUrl=driver.getCurrentUrl();
	String[] urldomain = CurrentUrl.split("\\//");
	System.out.println("Current Url"+urldomain[1]);
	String[] urldomain1 = urldomain[1].split("\\/");
	System.out.println("Domain Name::"+urldomain1[0]);
	
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	   Calendar cal = Calendar.getInstance();
	   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 
	   cal.add(Calendar.DATE, -1);
	   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));  
	  String st=dateFormat.format(cal.getTime());
	   String[] spliteddate = st.split("-");
	 System.out.println("Split the Date::"+spliteddate[2]);
	
	
	Loginpage.Select_dateFrom(spliteddate[2]);
	Thread.sleep(1000);
	Loginpage.ToDate().click();
	Thread.sleep(1000);
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	Loginpage.Select_dateTo(spliteddate[2]);
	Thread.sleep(1000);
	
	Select s=new Select(Loginpage.BookingSatus());
	s.selectByIndex(11);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	String count=Loginpage.FlightResults_text().getText();
	System.out.println(count);
	ExcelUtils.lable(0, 0,count);
	
	String str = count.trim();
	String[] splited = str.split("\\:");
	System.out.println("No of Results Count"+splited[1]);
	Thread.sleep(1000);
	if("Flight Search Results : 0".equals(count))
	{
		ExcelUtils.lable(2, 2,"No Results are Found");
		
		
		 
        System.out.println("Started");
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		System.out.println("1");
		email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
		email.setSSLOnConnect(true);
		email.setFrom("naga123.ch@gmail.com");
		//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
		email.setSubject("Yesterday :("+Utils.Yesterdaytimestamp()+") - SoldOuts  - Automation Report For "+urldomain1[0]+" Domain");
		System.out.println("2");
		
		email.setMsg("Number of SoldOuts for "+urldomain1[0]+" Domain :"+splited[1]);
		/*email.addTo("Sreenivas.bodige@rehlat.com ");
		email.addTo("tariqraza@rehlat.com");*/
		email.addTo("naga.ch199@gmail.com");
		System.out.println("3");
		email.send();
		System.out.println("END");
	}
	else
	{
	
	//it's export the Header Values
	ExcelUtils.lable(1, 0,"Booking Id");
	ExcelUtils.lable(2, 0,"Trip Type");
	ExcelUtils.lable(3, 0,"Pax Name");
	ExcelUtils.lable(4, 0,"Status");
	ExcelUtils.lable(5, 0,"Payment Status");
	ExcelUtils.lable(6, 0,"Supplier ");
	ExcelUtils.lable(7, 0,"PNR");
	ExcelUtils.lable(8, 0,"Booking Date");
	ExcelUtils.lable(9, 0,"Amount");
	ExcelUtils.lable(10,0,"Client");
	//ExcelUtils.lable(12,0,"Log Information");
	
	
	List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
	System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
	List<WebElement> td_collection1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td"));
	System.out.println("NUMBER OF Columns IN THIS TABLE = "+td_collection1.size()/tr_collection.size());
	
	int row_num,col_num;
    row_num=1;
    for(WebElement trElement : tr_collection)
    {
        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
        System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
        col_num=1;
        for(WebElement tdElement : td_collection)
        {
        	
        	ExcelUtils.lable(col_num, row_num, tdElement.getText());
        	
            System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
            col_num++;
            
            
            
        }
        row_num++;
    }
    
    
    
    System.out.println("Started");
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
	email.setSubject("Yesterday :("+Utils.Yesterdaytimestamp()+") - SoldOuts - Automation Report For "+urldomain1[0]+" Domain");
	System.out.println("2");
	
	email.setMsg("Number of SoldOuts for "+urldomain1[0]+" Domain :"+splited[1]);
	/*email.addTo("Sreenivas.bodige@rehlat.com");
	email.addTo("tariqraza@rehlat.com");*/
	email.addTo("naga.ch199@gmail.com");
	
	System.out.println("3");
	email.send();
	System.out.println("END");
	
    //****************************************************************************
   /* List<WebElement> BookingDetails = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td/a"));

	System.out.println("No of links:" + BookingDetails.size());
	
	int st=BookingDetails.size();
	int row_num1;
    row_num1=1;
    for(int i=1;i<=st;i++)
    {
    	String pcode = driver.getWindowHandle();
		System.out.println("Parent window code is: " + pcode);
    	driver.findElement(By.xpath("(//a[contains(text(),'Booking Details')])["+i+"]")).click();
    	
    	for (String ccode : driver.getWindowHandles()) 
    	{
			System.out.println("Child window code is: " + ccode);
			driver.switchTo().window(ccode);
		}
    	
    	Thread.sleep(2000);	
       String loginformation1=Loginpage.LogInformation_text1().getText();
       String loginformation2=Loginpage.LogInformation_text2().getText();
		Thread.sleep(2000);
		ExcelUtils.lable(12, row_num1, loginformation1+","+loginformation2);
		System.out.println(i);
		
			driver.close();
			driver.switchTo().window(pcode);
			Thread.sleep(1000);
		
			 row_num1++;
    }
   */
    
	
	
}
	
}
	
	
public static void TransactionSuccessful(int iTestCaseRow,WebDriver driver) throws Exception {

	
	Loginpage.FromDate().click();
	Thread.sleep(1000);
	String CurrentUrl=driver.getCurrentUrl();
	String[] urldomain = CurrentUrl.split("\\//");
	System.out.println("Current Url"+urldomain[1]);
	String[] urldomain1 = urldomain[1].split("\\/");
	System.out.println("Domain Name::"+urldomain1[0]);
	
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");
	Date date = new Date();
	System.out.println(dateFormat.format(date));
	String st=dateFormat.format(date);
	String[] spliteddate = st.split("-");
	System.out.println("Split the Date::"+spliteddate[0]);
	
	
	Loginpage.Select_dateFrom(spliteddate[0]);
	Thread.sleep(1000);
	Loginpage.ToDate().click();
	Thread.sleep(1000);
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	Loginpage.Select_dateTo(spliteddate[0]);
	Thread.sleep(1000);
	
	Select s=new Select(Loginpage.BookingSatus());
	s.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000); 
	
	String count=Loginpage.FlightResults_text().getText();
	System.out.println(count);
	ExcelUtils.lable(0, 0,count);
	
	String str = count.trim();
	String[] splited = str.split("\\:");
	System.out.println("No of Results Count"+splited[1]);
	Thread.sleep(1000);
	if("Flight Search Results : 0".equals(count))
	{
		ExcelUtils.lable(2, 2,"No Results are Found");
		
		
		 
        System.out.println("Started");
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		System.out.println("1");
		email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
		email.setSSLOnConnect(true);
		email.setFrom("naga123.ch@gmail.com");
		//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
		email.setSubject(Utils.timestamp()+" - Transaction Successful - Automation Report For "+urldomain1[0]+" Domain");
		System.out.println("2");
		
		email.setMsg("Number of Transaction Successful for "+urldomain1[0]+" Domain :"+splited[1]);
		/*email.addTo("Sreenivas.bodige@rehlat.com ");
		email.addTo("tariqraza@rehlat.com");*/
		email.addTo("naga.ch199@gmail.com");
		System.out.println("3");
		email.send();
		System.out.println("END");
	}
	else
	{
	
	//it's export the Header Values
	ExcelUtils.lable(1, 0,"Booking Id");
	ExcelUtils.lable(2, 0,"Trip Type");
	ExcelUtils.lable(3, 0,"Pax Name");
	ExcelUtils.lable(4, 0,"Status");
	ExcelUtils.lable(5, 0,"Payment Status");
	ExcelUtils.lable(6, 0,"Supplier ");
	ExcelUtils.lable(7, 0,"PNR");
	ExcelUtils.lable(8, 0,"Booking Date");
	ExcelUtils.lable(9, 0,"Amount");
	ExcelUtils.lable(10,0,"Client");
	//ExcelUtils.lable(12,0,"Log Information");
	
	
	List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
	System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
	List<WebElement> td_collection1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td"));
	System.out.println("NUMBER OF Columns IN THIS TABLE = "+td_collection1.size()/tr_collection.size());
	
	int row_num,col_num;
    row_num=1;
    for(WebElement trElement : tr_collection)
    {
        List<WebElement> td_collection=trElement.findElements(By.xpath("td"));
        System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());
        col_num=1;
        for(WebElement tdElement : td_collection)
        {
        	
        	ExcelUtils.lable(col_num, row_num, tdElement.getText());
        	
            System.out.println("row # "+row_num+", col # "+col_num  + ", text=" +tdElement.getText());
            col_num++;
            
            
            
        }
        row_num++;
    }
    
    
    
    System.out.println("Started");
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
	email.setSubject(Utils.timestamp()+" - Transaction Successful - Automation Report For "+urldomain1[0]+" Domain");
	System.out.println("2");
	
	email.setMsg("Number of Transaction Successful for "+urldomain1[0]+" Domain :"+splited[1]);
	/*email.addTo("Sreenivas.bodige@rehlat.com");
	email.addTo("tariqraza@rehlat.com");*/
	email.addTo("naga.ch199@gmail.com");
	System.out.println("3");
	email.send();
	System.out.println("END");
	
    //****************************************************************************
   /* List<WebElement> BookingDetails = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td/a"));

	System.out.println("No of links:" + BookingDetails.size());
	
	int st=BookingDetails.size();
	int row_num1;
    row_num1=1;
    for(int i=1;i<=st;i++)
    {
    	String pcode = driver.getWindowHandle();
		System.out.println("Parent window code is: " + pcode);
    	driver.findElement(By.xpath("(//a[contains(text(),'Booking Details')])["+i+"]")).click();
    	
    	for (String ccode : driver.getWindowHandles()) 
    	{
			System.out.println("Child window code is: " + ccode);
			driver.switchTo().window(ccode);
		}
    	
    	Thread.sleep(2000);	
       String loginformation1=Loginpage.LogInformation_text1().getText();
       String loginformation2=Loginpage.LogInformation_text2().getText();
		Thread.sleep(2000);
		ExcelUtils.lable(12, row_num1, loginformation1+","+loginformation2);
		System.out.println(i);
		
			driver.close();
			driver.switchTo().window(pcode);
			Thread.sleep(1000);
		
			 row_num1++;
    }
   */
    
	
	
}
	
}

	
}
