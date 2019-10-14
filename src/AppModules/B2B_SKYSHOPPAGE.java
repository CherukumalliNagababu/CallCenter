package AppModules;

import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import pageobjects.Loginpage;

public class B2B_SKYSHOPPAGE {
	
	static int Com_CP_conformation_pending_Total;
	static int AE_CP_conformation_pending_Total;
	static int SA_CP_conformation_pending_Total;
	static int EG_CP_conformation_pending_Total;
	
	static List<String> Com_CP_Bookingid;
	static List<String> SA_CP_Bookingid;
	static List<String> AE_CP_Bookingid;
	static List<String> EG_CP_Bookingid;
	

		
public static void ConfirmationPendingWithClient_COM(int iTestCaseRow,WebDriver driver) throws Exception {
			
		
			//Loginpage.COM_link().click();
			driver.get("http://callcenter.rehlat.com/");
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
	    	
	    	WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
	    	
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
	    	System.out.println("Current Url"+urldomain[1]);
	    	String[] urldomain1 = urldomain[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomain1[0]);
	    	
	    	   Calendar cal = Calendar.getInstance();
		  	   DateFormat dateFormat2 = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	   cal.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+dateFormat2.format(cal.getTime()));  
		  	  String st2=dateFormat2.format(cal.getTime());
		  	   String[] Comspliteddate = st2.split("-");
		  	   System.out.println("Yesterday COM Split the Date::"+Comspliteddate[0]);
		  	   
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			String st=dateFormat.format(date);
			String[] spliteddate = st.split("-");
	    	System.out.println("Split the Date::"+spliteddate[2]);
	    	
	    	
			Loginpage.Select_dateFrom(Comspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='active day']")).click();
			//Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Confirmation Pending*********************************************
	    	Select conpen=new Select(Loginpage.BookingSatus());
	    	conpen.selectByVisibleText("Confirmation Pending, do not rebook");
			Thread.sleep(1000);
			
			Select b2bsky=new Select(Loginpage.Client());
			b2bsky.selectByVisibleText("B2B_SKYSHOP");
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			String comConFpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(comConFpendingcount);
			
			
	    	String comtranstr = comConFpendingcount.trim();
	    	String[] comtransplited = comtranstr.split("\\:");
	    	System.out.println("No of Results Count"+comtransplited[1]);
	    	Thread.sleep(1000);
	    	
	    	
	    	if("Flight Search Results : 0".equals(comConFpendingcount))
	    	{
	    		
	    		System.out.println("Confirmation Pending:::----0");
	    		
	    		Com_CP_conformation_pending_Total=0;
	    		List< String > values = new ArrayList<>();
			     values.add("0");
				 Com_CP_Bookingid=values;
				
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));
	    		 
	    		  System.out.println("Confirmation Pending :" + WE1.size());
	    		  Com_CP_conformation_pending_Total=WE1.size();
	    		  
	    		//Get booking id's
	  			
	  			List<WebElement> bookingId = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));

	  			  List< String > values = new ArrayList<>();

	  			  for (WebElement e : bookingId)
	  			    values.add(e.getText());
  				  Com_CP_Bookingid=values;
	  			System.out.println("COM Total Number of booking id's:" + values);
	    		
	    	}
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	      
}
public static void ConfirmationPendingWithClient_SA(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.SA_link().click();
	 driver.get("http://sacallcenter.rehlat.com/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
			System.out.println("Current Url"+urldomain[1]);
			String[] urldomain1 = urldomain[1].split("\\/");
			System.out.println("Domain Name::"+urldomain1[0]);
			
			Calendar calSA = Calendar.getInstance();
		  	   DateFormat SAdateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	 calSA.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+SAdateFormat.format(calSA.getTime()));  
		  	  String SAst=SAdateFormat.format(calSA.getTime());
		  	   String[] SAspliteddate = SAst.split("-");
		  	   System.out.println("Yesterday SA Split the Date::"+SAspliteddate[0]);
		  	   
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			String st=dateFormat.format(date);
			String[] spliteddate = st.split("-");
			System.out.println("Split the Date::"+spliteddate[2]);
			
			
			Loginpage.Select_dateFrom(SAspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='active day']")).click();
			//Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Confirmation Pending*********************************************
	    	Select conpen=new Select(Loginpage.BookingSatus());
	    	conpen.selectByVisibleText("Confirmation Pending, do not rebook");
			Thread.sleep(1000);
			
			Select b2bsky=new Select(Loginpage.Client());
			b2bsky.selectByVisibleText("B2B_SKYSHOP");
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			String saConFpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(saConFpendingcount);
			
			
			String comtranstr = saConFpendingcount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			
			
			if("Flight Search Results : 0".equals(saConFpendingcount))
			{
				System.out.println("Confirmation Pending:::----0");
				SA_CP_conformation_pending_Total=0;
				List< String > values = new ArrayList<>();
			     values.add("0");
				 SA_CP_Bookingid=values;
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));
				 
				  System.out.println("Confirmation Pending:" + WE1.size());
				  SA_CP_conformation_pending_Total=WE1.size();
				//Get booking id's
		  			
		  			List<WebElement> bookingId = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));

		  			  List< String > values = new ArrayList<>();

		  			  for (WebElement e : bookingId)
		  			    values.add(e.getText());
	  				  SA_CP_Bookingid=values;
		  			System.out.println("SA Total Number of booking id's:" + values);
				
			}
			Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
			}
public static void ConfirmationPendingWithClient_AE(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.AE_link().click();
	//driver.get("http://callcenter.rehlat.ae/");
	driver.get("http://aecallcenter.rehlat.ae/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
			System.out.println("Current Url"+urldomain[1]);
			String[] urldomain1 = urldomain[1].split("\\/");
			System.out.println("Domain Name::"+urldomain1[0]);
			
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			   Calendar calAE = Calendar.getInstance();
		  	   DateFormat AEdateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	 calAE.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+AEdateFormat.format(calAE.getTime()));  
		  	  String AEst=AEdateFormat.format(calAE.getTime());
		  	   String[] AEspliteddate = AEst.split("-");
		  	   System.out.println("Split the Date::"+AEspliteddate[0]);
			
		  	   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
				Date date = new Date();
				System.out.println(dateFormat.format(date));
				String st=dateFormat.format(date);
				String[] spliteddate = st.split("-");
		    	System.out.println("AE Split the Date::"+spliteddate[2]);
			
			Loginpage.Select_dateFrom(AEspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='active day']")).click();
			//Loginpage.Select_activateDate(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Confirmation Pending*********************************************
	    	Select conpen=new Select(Loginpage.BookingSatus());
	    	//conpen.selectByIndex(3);
	    	conpen.selectByVisibleText("Confirmation Pending, do not rebook");
			Thread.sleep(1000);
			
			Select b2bsky=new Select(Loginpage.Client());
			//b2bsky.selectByVisibleText("B2B_SKYSHOP");
			b2bsky.selectByVisibleText("B2B_SkyShopper");
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			String aeConFpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(aeConFpendingcount);
			
			
			String comtranstr = aeConFpendingcount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			
			
			if("Flight Search Results : 0".equals(aeConFpendingcount))
			{
				System.out.println("Confirmation Pending:::----0");
				AE_CP_conformation_pending_Total=0;
				List< String > values = new ArrayList<>();
			     values.add("0");
				 AE_CP_Bookingid=values;
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));
				 
				  System.out.println("Confirmation Pending:" + WE1.size());
				  AE_CP_conformation_pending_Total=WE1.size();
				//Get booking id's
		  			
				  List<WebElement> bookingId = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));

		  			  List< String > values = new ArrayList<>();

		  			  for (WebElement e : bookingId)
		  			   values.add(e.getText());
		  				
		  			  
	  				  AE_CP_Bookingid=values;
		  			System.out.println("AE Total Number of booking id's:" + values);
				  
			}  
			Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
				
		}

public static void ConfirmationPendingWithClient_EG(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.EG_link().click();
	driver.get("http://callcenter.rehlat.com.eg/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
			System.out.println("Current Url"+urldomain[1]);
			String[] urldomain1 = urldomain[1].split("\\/");
			System.out.println("Domain Name::"+urldomain1[0]);
			
			  Calendar calEG = Calendar.getInstance();
		  	   DateFormat EGdateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	 calEG.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+EGdateFormat.format(calEG.getTime()));  
		  	  String EGst=EGdateFormat.format(calEG.getTime());
		  	   String[] EGspliteddate = EGst.split("-");
		  	   System.out.println("Yesterday EG Split the Date::"+EGspliteddate[0]);

			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			String st=dateFormat.format(date);
			String[] spliteddate = st.split("-");
			System.out.println("Split the Date::"+spliteddate[2]);
			
			
			Loginpage.Select_dateFrom(EGspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//td[@class='active day']")).click();
			//Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Confirmation Pending*********************************************
	    	Select conpen=new Select(Loginpage.BookingSatus());
	    	conpen.selectByVisibleText("Confirmation Pending, do not rebook");
			Thread.sleep(1000);
			
			Select b2bsky=new Select(Loginpage.Client());
			b2bsky.selectByVisibleText("B2B_SKYSHOP");
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			String egConFpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(egConFpendingcount);
			
			
			String comtranstr = egConFpendingcount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			
			
			if("Flight Search Results : 0".equals(egConFpendingcount))
			{
				System.out.println("Confirmation Pending:::----0");
				 EG_CP_conformation_pending_Total=0;
				 List< String > values = new ArrayList<>();
			     values.add("0");
				 EG_CP_Bookingid=values;
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));
				 
				  System.out.println("Confirmation Pending:" + WE1.size());
				  EG_CP_conformation_pending_Total=WE1.size();
				//Get booking id's
		  			
		  			List<WebElement> bookingId = driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[1]"));

		  			  List< String > values = new ArrayList<>();

		  			  for (WebElement e : bookingId)
		  			    values.add(e.getText());
	  				  EG_CP_Bookingid=values;
		  			System.out.println("EG Total Number of booking id's:" + values);
				  
				  
			}
			Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
		}
		
		
	      
}
