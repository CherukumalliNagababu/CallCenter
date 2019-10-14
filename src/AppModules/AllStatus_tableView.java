package AppModules;

import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

public class AllStatus_tableView {
	
	
	
	static String COMDomainNames;
	static String COMSoldOuts;
	static String COMTrancationSuccess;
	static String COMTransactionHold;
	static String COMPartiallyTicketed;
	static String COMConfirmationPendingdonotrebook;
	static String COMCancellationRequest;
	
	static String SADomainNames;
	static String SASoldOuts;
	static String SATrancationSuccess;
	static String SATransactionHold;
	static String SAPartiallyTicketed;
	static String SAConfirmationPendingdonotrebook;
	static String SACancellationRequest;
	
	static String AEDomainNames;
	static String AESoldOuts;
	static String AETrancationSuccess;
	static String AETransactionHold;
	static String AEPartiallyTicketed;
	static String AEConfirmationPendingdonotrebook;
	static String AECancellationRequest;
	
	
	static String EGDomainNames;
	static String EGSoldOuts;
	static String EGTrancationSuccess;
	static String EGTransactionHold;
	static String EGPartiallyTicketed;
	static String EGConfirmationPendingdonotrebook;
	static String EGCancellationRequest;
	
		public static void Soldouts_com(int iTestCaseRow,WebDriver driver) throws Exception {
			
			COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			
			Loginpage.COM_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
	    	System.out.println("Current Url"+urldomain[1]);
	    	String[] urldomain1 = urldomain[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomain1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			String st=dateFormat.format(date);
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
			//***********************Sold Outs**********************************
			Select s=new Select(Loginpage.BookingSatus());
			s.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
	    	String str = count.trim();
	    	String[] splited = str.split("\\:");
	    	System.out.println("No of Results Count"+splited[1]);
	    	Thread.sleep(1000);
	    	String soldout="SoldOuts";
	    	
	    	
	    	
	    	if("Flight Search Results : 0".equals(count))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMSoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
	    		 
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of soldOuts:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));



	    	System.out.println("No of WEGO bookings:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));



	    	System.out.println("No of B2C bookings:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));



	    	System.out.println("No of MOBIOS bookings:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));



	    	System.out.println("No of MOBAPP bookings:" + SMOBAPP.size());



	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));



	    	System.out.println("No of SKYSCN bookings:" + SSKYSCN.size());
	    	
	    	//Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double SoldOuttotal = new Double(TotalValue); 
				System.out.println("SoldOuts total:::----"+SoldOuttotal);
	    	
	    	
				
	      
	    	
				COMSoldOuts=String.format("%30s %30s %20s %20d %20d %25s %25s ",soldout,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),SoldOuttotal);
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	//Transaction Successful for COM
	    	//******************* Transaction Successfull*********************************************
	    	Select transaction1=new Select(Loginpage.BookingSatus());
	    	transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
	    	String comtranstr = comTrancount.trim();
	    	String[] comtransplited = comtranstr.split("\\:");
	    	System.out.println("No of Results Count"+comtransplited[1]);
	    	Thread.sleep(1000);
	    	String tran="Transaction Successful";
	    	
	    	if("Flight Search Results : 0".equals(comTrancount))
	    	{
	    		COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Successfull:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transaction = new Double(TotalValue); 
				System.out.println("Trancation Successfull total:::----"+Transaction);
	        
	        
	       
				COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transaction);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Transaction Hold*****************************
	    	Select transactionHold=new Select(Loginpage.BookingSatus());
	    	transactionHold.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String comTranHold=Loginpage.FlightResults_text().getText();
			System.out.println(comTranHold);
			
			
	    	String comtranstrhold = comTranHold.trim();
	    	String[] comtranholdsplited = comtranstrhold.split("\\:");
	    	System.out.println("No of Results Count"+comtranholdsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	String tranHold="Transaction Hold";
	    	if("Flight Search Results : 0".equals(comTranHold))
	    	{
	    	
	    		COMTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
	    		System.out.println("TransactionHold total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Hold:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Hold:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Hold:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Hold:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Hold:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transactionhold = new Double(TotalValue); 
				System.out.println("TransactionHold total:::----"+Transactionhold);
	        
	        
	       
				COMTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transactionhold);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Partially Ticketed*****************************
	    	
	    	Select partiallyticket=new Select(Loginpage.BookingSatus());
	    	partiallyticket.selectByIndex(2);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Compartiallyticket=Loginpage.FlightResults_text().getText();
			System.out.println(Compartiallyticket);
			
			
	    	String comCompartiallyticket = Compartiallyticket.trim();
	    	String[] Compartiallyticketsplited = comCompartiallyticket.split("\\:");
	    	System.out.println("No of Results Count"+Compartiallyticketsplited[1]);
	    	Thread.sleep(1000);
	    	String Partiallyticket1="Partially Ticketed";
	    	
	    	if("Flight Search Results : 0".equals(Compartiallyticket))
	    	{
	    	
	    		COMPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",Partiallyticket1,0,0,0,0,0,0);
	    		System.out.println("PartiallyTicketed total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of partiallyticket:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO partiallyticket:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C partiallyticket:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS partiallyticket:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP partiallyticket:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN partiallyticket:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double partiallytickettotal = new Double(TotalValue); 
				System.out.println("PartiallyTicketed total:::----"+partiallytickettotal);
	        
	        
	       
				COMPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",Partiallyticket1,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),partiallytickettotal);
	        
	      
	      
	    	}
	    	
	    //*********************Confirmation Pending, do not rebook*****************************
	    	

	    	
	    	Select conformationPen=new Select(Loginpage.BookingSatus());
	    	conformationPen.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Confirmationpentext=Loginpage.FlightResults_text().getText();
			System.out.println(Confirmationpentext);
			
			
	    	String comConfirmationpentext = Confirmationpentext.trim();
	    	String[] ComcomConfirmationpentextsplited = comConfirmationpentext.split("\\:");
	    	System.out.println("No of Results Count"+ComcomConfirmationpentextsplited[1]);
	    	Thread.sleep(1000);
	    	String ConfirmationPending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(Confirmationpentext))
	    	{
	    	
	    		COMConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConfirmationPending,0,0,0,0,0,0);
	    		System.out.println("ConfirmationPendingdonotrebook total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of ConfirmationPending:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO ConfirmationPending:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C ConfirmationPending:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS ConfirmationPending:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP ConfirmationPending:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN ConfirmationPending:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double conformationpendingtotal = new Double(TotalValue); 
				System.out.println("ConfirmationPendingdonotrebook total:::----"+conformationpendingtotal);
	        
	        
	       
				COMConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConfirmationPending,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),conformationpendingtotal);
	        
	      
	      
	    	}
	    	
	    	
//*********************Cancellation Requested*****************************
	    	

	    	
	    	Select Cancelrequest=new Select(Loginpage.BookingSatus());
	    	Cancelrequest.selectByIndex(5);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Cancelrequesttext=Loginpage.FlightResults_text().getText();
			System.out.println(Cancelrequesttext);
			
			
	    	String comCancelrequesttext = Cancelrequesttext.trim();
	    	String[] comCancelrequesttextsplited = comCancelrequesttext.split("\\:");
	    	System.out.println("No of Results Count"+comCancelrequesttextsplited[1]);
	    	Thread.sleep(1000);
	    	String CancellationRequested="Cancellation Requested";
	    	
	    	if("Flight Search Results : 0".equals(Cancelrequesttext))
	    	{
	    	
	    		COMCancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",CancellationRequested,0,0,0,0,0,0);
	    		System.out.println("CancellationRequested total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of CancellationRequested:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO CancellationRequested:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C CancellationRequested:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS CancellationRequested:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP CancellationRequested:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN CancellationRequested:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double CancellationRequestedTotal = new Double(TotalValue); 
				System.out.println("CancellationRequested total:::----"+CancellationRequestedTotal);
	        
	        
	       
				COMCancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",CancellationRequested,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),CancellationRequestedTotal);
	        
	      
	      
	    	}
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	
	    	
		}
	    	
		public static void Soldouts_Sa(int iTestCaseRow,WebDriver driver) throws Exception {	
	 
	    	Loginpage.SA_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
			
	    	SADomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "SA", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String SACurrentUrl=driver.getCurrentUrl();
			String[] SAurldomain = SACurrentUrl.split("\\//");
	    	System.out.println("Current Url"+SAurldomain[1]);
	    	String[] SAurldomain1 = SAurldomain[1].split("\\/");
	    	System.out.println("Domain Name::"+SAurldomain1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat SAdateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date sadate = new Date();
			System.out.println(SAdateFormat.format(sadate));
			String Sast=SAdateFormat.format(sadate);
			String[] spliteSadate= Sast.split("-");
	    	System.out.println("Split the Date::"+spliteSadate[2]);
	    	
	    	
			Loginpage.Select_dateFrom(spliteSadate[2]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteSadate[2]);
			Thread.sleep(1000);
			//***********************Sold Outs**********************************
			Select sa=new Select(Loginpage.BookingSatus());
			sa.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String sacount=Loginpage.FlightResults_text().getText();
			System.out.println(sacount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Sastr = sacount.trim();
	    	String[] Sasplited = Sastr.split("\\:");
	    	System.out.println("No of Results Count"+Sasplited[1]);
	    	Thread.sleep(1000);
	    	String SAsoldout="SoldOuts";
	    	
	    	
	    	
	    	if("Flight Search Results : 0".equals(sacount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		SASoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",SAsoldout,0,0,0,0,0,0);
	    		 
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of soldOuts:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));



	    	System.out.println("No of WEGO bookings:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));



	    	System.out.println("No of B2C bookings:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));



	    	System.out.println("No of MOBIOS bookings:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));



	    	System.out.println("No of MOBAPP bookings:" + SMOBAPP.size());



	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));



	    	System.out.println("No of SKYSCN bookings:" + SSKYSCN.size());
	    	
	    	//Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double SoldOuttotal = new Double(TotalValue); 
				System.out.println("SoldOuts total:::----"+SoldOuttotal);
	    	
	    	
				
	      
	    	
				SASoldOuts=String.format("%30s %30s %20s %20d %20d %25s %25s ",SAsoldout,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),SoldOuttotal);
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	//Transaction Successful for COM
	    	//******************* Transaction Successfull*********************************************
	    	Select Satransaction1=new Select(Loginpage.BookingSatus());
	    	Satransaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String saTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(saTrancount);
			
			
	    	String Satranstr = saTrancount.trim();
	    	String[] Satransplited = Satranstr.split("\\:");
	    	System.out.println("No of Results Count"+Satransplited[1]);
	    	Thread.sleep(1000);
	    	String Satran="Transaction Successful";
	    	
	    	if("Flight Search Results : 0".equals(saTrancount))
	    	{
	    		SATrancationSuccess= String.format("%30s %21s %20s %20d %20d %25s %25s ",Satran,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Successfull:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transaction = new Double(TotalValue); 
				System.out.println("Trancation Successfull total:::----"+Transaction);
	        
	        
	       
				SATrancationSuccess= String.format("%30s %21s %20s %20d %20d %25s %25s ",Satran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transaction);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Transaction Hold*****************************
	    	Select SAtransactionHold=new Select(Loginpage.BookingSatus());
	    	SAtransactionHold.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SATranHold=Loginpage.FlightResults_text().getText();
			System.out.println(SATranHold);
			
			
	    	String SAtranstrhold = SATranHold.trim();
	    	String[] Satranholdsplited = SAtranstrhold.split("\\:");
	    	System.out.println("No of Results Count"+Satranholdsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	String SAtranHold="Transaction Hold";
	    	if("Flight Search Results : 0".equals(SATranHold))
	    	{
	    	
	    		SATransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",SAtranHold,0,0,0,0,0,0);
	    		System.out.println("TransactionHold total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Hold:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Hold:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Hold:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Hold:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Hold:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transactionhold = new Double(TotalValue); 
				System.out.println("TransactionHold total:::----"+Transactionhold);
	        
	        
	       
				SATransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",SAtranHold,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transactionhold);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Partially Ticketed*****************************
	    	
	    	Select SApartiallyticket=new Select(Loginpage.BookingSatus());
	    	SApartiallyticket.selectByIndex(2);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Sapartiallyticket=Loginpage.FlightResults_text().getText();
			System.out.println(Sapartiallyticket);
			
			
	    	String SACompartiallyticket = Sapartiallyticket.trim();
	    	String[] Sapartiallyticketsplited = SACompartiallyticket.split("\\:");
	    	System.out.println("No of Results Count"+Sapartiallyticketsplited[1]);
	    	Thread.sleep(1000);
	    	String SAPartiallyticket1="Partially Ticketed";
	    	
	    	if("Flight Search Results : 0".equals(Sapartiallyticket))
	    	{
	    	
	    		SAPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",SAPartiallyticket1,0,0,0,0,0,0);
	    		System.out.println("PartiallyTicketed total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of partiallyticket:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO partiallyticket:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C partiallyticket:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS partiallyticket:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP partiallyticket:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN partiallyticket:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double partiallytickettotal = new Double(TotalValue); 
				System.out.println("PartiallyTicketed total:::----"+partiallytickettotal);
	        
	        
	       
				SAPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",SAPartiallyticket1,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),partiallytickettotal);
	        
	      
	      
	    	}
	    	
	    	//*********************Confirmation Pending, do not rebook*****************************
	    	

	    	
	    	Select SaconformationPen=new Select(Loginpage.BookingSatus());
	    	SaconformationPen.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SaConfirmationpentext=Loginpage.FlightResults_text().getText();
			System.out.println(SaConfirmationpentext);
			
			
	    	String SAConfirmationpentext = SaConfirmationpentext.trim();
	    	String[] SAConfirmationpentextsplited = SAConfirmationpentext.split("\\:");
	    	System.out.println("No of Results Count"+SAConfirmationpentextsplited[1]);
	    	Thread.sleep(1000);
	    	String SaConfirmationPending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(SaConfirmationpentext))
	    	{
	    	
	    		SAConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",SaConfirmationPending,0,0,0,0,0,0);
	    		System.out.println("ConfirmationPendingdonotrebook total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of ConfirmationPending:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO ConfirmationPending:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C ConfirmationPending:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS ConfirmationPending:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP ConfirmationPending:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN ConfirmationPending:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double conformationpendingtotal = new Double(TotalValue); 
				System.out.println("ConfirmationPendingdonotrebook total:::----"+conformationpendingtotal);
	        
	        
	       
				SAConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",SaConfirmationPending,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),conformationpendingtotal);
	        
	      
	      
	    	}
	    	
	    	
//*********************Cancellation Requested*****************************
	    	

	    	
	    	Select SACancelrequest=new Select(Loginpage.BookingSatus());
	    	SACancelrequest.selectByIndex(5);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SACancelrequesttext=Loginpage.FlightResults_text().getText();
			System.out.println(SACancelrequesttext);
			
			
	    	String SaCancelrequesttext = SACancelrequesttext.trim();
	    	String[] SaCancelrequesttextsplited = SaCancelrequesttext.split("\\:");
	    	System.out.println("No of Results Count"+SaCancelrequesttextsplited[1]);
	    	Thread.sleep(1000);
	    	String SACancellationRequested="Cancellation Requested";
	    	
	    	if("Flight Search Results : 0".equals(SACancelrequesttext))
	    	{
	    	
	    		SACancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",SACancellationRequested,0,0,0,0,0,0);
	    		System.out.println("CancellationRequested total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of CancellationRequested:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO CancellationRequested:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C CancellationRequested:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS CancellationRequested:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP CancellationRequested:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN CancellationRequested:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double CancellationRequestedTotal = new Double(TotalValue); 
				System.out.println("CancellationRequested total:::----"+CancellationRequestedTotal);
	        
	        
	       
				SACancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",SACancellationRequested,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),CancellationRequestedTotal);
	        
	      
	      
	    	}
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	   
		}

		
		
		public static void Soldouts_AE(int iTestCaseRow,WebDriver driver) throws Exception {	
			 
	    	Loginpage.AE_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
			
	    	AEDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "AE", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String SACurrentUrl=driver.getCurrentUrl();
			String[] SAurldomain = SACurrentUrl.split("\\//");
	    	System.out.println("Current Url"+SAurldomain[1]);
	    	String[] SAurldomain1 = SAurldomain[1].split("\\/");
	    	System.out.println("Domain Name::"+SAurldomain1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat SAdateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date sadate = new Date();
			System.out.println(SAdateFormat.format(sadate));
			String Sast=SAdateFormat.format(sadate);
			String[] spliteSadate= Sast.split("-");
	    	System.out.println("Split the Date::"+spliteSadate[2]);
	    	
	    	
			Loginpage.Select_dateFrom(spliteSadate[2]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteSadate[2]);
			Thread.sleep(1000);
			//***********************Sold Outs**********************************
			Select sa=new Select(Loginpage.BookingSatus());
			sa.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String sacount=Loginpage.FlightResults_text().getText();
			System.out.println(sacount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Sastr = sacount.trim();
	    	String[] Sasplited = Sastr.split("\\:");
	    	System.out.println("No of Results Count"+Sasplited[1]);
	    	Thread.sleep(1000);
	    	String SAsoldout="SoldOuts";
	    	
	    	
	    	
	    	if("Flight Search Results : 0".equals(sacount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		AESoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",SAsoldout,0,0,0,0,0,0);
	    		 
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of soldOuts:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));



	    	System.out.println("No of WEGO bookings:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));



	    	System.out.println("No of B2C bookings:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));



	    	System.out.println("No of MOBIOS bookings:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));



	    	System.out.println("No of MOBAPP bookings:" + SMOBAPP.size());



	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));



	    	System.out.println("No of SKYSCN bookings:" + SSKYSCN.size());
	    	
	    	//Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double SoldOuttotal = new Double(TotalValue); 
				System.out.println("SoldOuts total:::----"+SoldOuttotal);
	    	
	    	
				
	      
	    	
				AESoldOuts=String.format("%30s %30s %20s %20d %20d %25s %25s ",SAsoldout,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),SoldOuttotal);
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	//Transaction Successful for COM
	    	//******************* Transaction Successfull*********************************************
	    	Select Satransaction1=new Select(Loginpage.BookingSatus());
	    	Satransaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String saTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(saTrancount);
			
			
	    	String Satranstr = saTrancount.trim();
	    	String[] Satransplited = Satranstr.split("\\:");
	    	System.out.println("No of Results Count"+Satransplited[1]);
	    	Thread.sleep(1000);
	    	String Satran="Transaction Successful";
	    	
	    	if("Flight Search Results : 0".equals(saTrancount))
	    	{
	    		AETrancationSuccess= String.format("%30s %21s %20s %20d %20d %25s %25s ",Satran,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Successfull:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transaction = new Double(TotalValue); 
				System.out.println("Trancation Successfull total:::----"+Transaction);
	        
	        
	       
				AETrancationSuccess= String.format("%30s %21s %20s %20d %20d %25s %25s ",Satran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transaction);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Transaction Hold*****************************
	    	Select SAtransactionHold=new Select(Loginpage.BookingSatus());
	    	SAtransactionHold.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SATranHold=Loginpage.FlightResults_text().getText();
			System.out.println(SATranHold);
			
			
	    	String SAtranstrhold = SATranHold.trim();
	    	String[] Satranholdsplited = SAtranstrhold.split("\\:");
	    	System.out.println("No of Results Count"+Satranholdsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	String SAtranHold="Transaction Hold";
	    	if("Flight Search Results : 0".equals(SATranHold))
	    	{
	    	
	    		AETransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",SAtranHold,0,0,0,0,0,0);
	    		System.out.println("TransactionHold total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Hold:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Hold:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Hold:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Hold:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Hold:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transactionhold = new Double(TotalValue); 
				System.out.println("TransactionHold total:::----"+Transactionhold);
	        
	        
	       
				AETransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",SAtranHold,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transactionhold);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Partially Ticketed*****************************
	    	
	    	Select SApartiallyticket=new Select(Loginpage.BookingSatus());
	    	SApartiallyticket.selectByIndex(2);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Sapartiallyticket=Loginpage.FlightResults_text().getText();
			System.out.println(Sapartiallyticket);
			
			
	    	String SACompartiallyticket = Sapartiallyticket.trim();
	    	String[] Sapartiallyticketsplited = SACompartiallyticket.split("\\:");
	    	System.out.println("No of Results Count"+Sapartiallyticketsplited[1]);
	    	Thread.sleep(1000);
	    	String SAPartiallyticket1="Partially Ticketed";
	    	
	    	if("Flight Search Results : 0".equals(Sapartiallyticket))
	    	{
	    	
	    		AEPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",SAPartiallyticket1,0,0,0,0,0,0);
	    		System.out.println("PartiallyTicketed total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of partiallyticket:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO partiallyticket:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C partiallyticket:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS partiallyticket:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP partiallyticket:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN partiallyticket:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double partiallytickettotal = new Double(TotalValue); 
				System.out.println("PartiallyTicketed total:::----"+partiallytickettotal);
	        
	        
	       
				AEPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",SAPartiallyticket1,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),partiallytickettotal);
	        
	      
	      
	    	}
	    	
	    	//*********************Confirmation Pending, do not rebook*****************************
	    	

	    	
	    	Select SaconformationPen=new Select(Loginpage.BookingSatus());
	    	SaconformationPen.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SaConfirmationpentext=Loginpage.FlightResults_text().getText();
			System.out.println(SaConfirmationpentext);
			
			
	    	String SAConfirmationpentext = SaConfirmationpentext.trim();
	    	String[] SAConfirmationpentextsplited = SAConfirmationpentext.split("\\:");
	    	System.out.println("No of Results Count"+SAConfirmationpentextsplited[1]);
	    	Thread.sleep(1000);
	    	String SaConfirmationPending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(SaConfirmationpentext))
	    	{
	    	
	    		AEConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",SaConfirmationPending,0,0,0,0,0,0);
	    		System.out.println("ConfirmationPendingdonotrebook total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of ConfirmationPending:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO ConfirmationPending:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C ConfirmationPending:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS ConfirmationPending:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP ConfirmationPending:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN ConfirmationPending:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double conformationpendingtotal = new Double(TotalValue); 
				System.out.println("ConfirmationPendingdonotrebook total:::----"+conformationpendingtotal);
	        
	        
	       
				AEConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",SaConfirmationPending,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),conformationpendingtotal);
	        
	      
	      
	    	}
	    	
	    	
//*********************Cancellation Requested*****************************
	    	

	    	
	    	Select SACancelrequest=new Select(Loginpage.BookingSatus());
	    	SACancelrequest.selectByIndex(5);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SACancelrequesttext=Loginpage.FlightResults_text().getText();
			System.out.println(SACancelrequesttext);
			
			
	    	String SaCancelrequesttext = SACancelrequesttext.trim();
	    	String[] SaCancelrequesttextsplited = SaCancelrequesttext.split("\\:");
	    	System.out.println("No of Results Count"+SaCancelrequesttextsplited[1]);
	    	Thread.sleep(1000);
	    	String SACancellationRequested="Cancellation Requested";
	    	
	    	if("Flight Search Results : 0".equals(SACancelrequesttext))
	    	{
	    	
	    		AECancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",SACancellationRequested,0,0,0,0,0,0);
	    		System.out.println("CancellationRequested total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of CancellationRequested:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO CancellationRequested:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C CancellationRequested:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS CancellationRequested:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP CancellationRequested:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN CancellationRequested:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double CancellationRequestedTotal = new Double(TotalValue); 
				System.out.println("CancellationRequested total:::----"+CancellationRequestedTotal);
	        
	        
	       
				AECancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",SACancellationRequested,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),CancellationRequestedTotal);
	        
	      
	      
	    	}
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	   
		}
		
		
		
		
public static void Soldouts_Eg(int iTestCaseRow,WebDriver driver) throws Exception {
			
			EGDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "EG", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			
			Loginpage.EG_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
	    	System.out.println("Current Url"+urldomain[1]);
	    	String[] urldomain1 = urldomain[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomain1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			String st=dateFormat.format(date);
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
			//***********************Sold Outs**********************************
			Select s=new Select(Loginpage.BookingSatus());
			s.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
	    	String str = count.trim();
	    	String[] splited = str.split("\\:");
	    	System.out.println("No of Results Count"+splited[1]);
	    	Thread.sleep(1000);
	    	String soldout="SoldOuts";
	    	
	    	
	    	
	    	if("Flight Search Results : 0".equals(count))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		EGSoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
	    		 
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of soldOuts:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));



	    	System.out.println("No of WEGO bookings:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));



	    	System.out.println("No of B2C bookings:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));



	    	System.out.println("No of MOBIOS bookings:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));



	    	System.out.println("No of MOBAPP bookings:" + SMOBAPP.size());



	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));



	    	System.out.println("No of SKYSCN bookings:" + SSKYSCN.size());
	    	
	    	//Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double SoldOuttotal = new Double(TotalValue); 
				System.out.println("SoldOuts total:::----"+SoldOuttotal);
	    	
	    	
				
	      
	    	
				EGSoldOuts=String.format("%30s %30s %20s %20d %20d %25s %25s ",soldout,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),SoldOuttotal);
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	//Transaction Successful for COM
	    	//******************* Transaction Successfull*********************************************
	    	Select transaction1=new Select(Loginpage.BookingSatus());
	    	transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
	    	String comtranstr = comTrancount.trim();
	    	String[] comtransplited = comtranstr.split("\\:");
	    	System.out.println("No of Results Count"+comtransplited[1]);
	    	Thread.sleep(1000);
	    	String tran="Transaction Successful";
	    	
	    	if("Flight Search Results : 0".equals(comTrancount))
	    	{
	    		EGTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Successfull:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transaction = new Double(TotalValue); 
				System.out.println("Trancation Successfull total:::----"+Transaction);
	        
	        
	       
				EGTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transaction);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Transaction Hold*****************************
	    	Select transactionHold=new Select(Loginpage.BookingSatus());
	    	transactionHold.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String comTranHold=Loginpage.FlightResults_text().getText();
			System.out.println(comTranHold);
			
			
	    	String comtranstrhold = comTranHold.trim();
	    	String[] comtranholdsplited = comtranstrhold.split("\\:");
	    	System.out.println("No of Results Count"+comtranholdsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	String tranHold="Transaction Hold";
	    	if("Flight Search Results : 0".equals(comTranHold))
	    	{
	    	
	    		EGTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
	    		System.out.println("TransactionHold total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO Trancation Hold:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C Trancation Hold:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS Trancation Hold:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP Trancation Hold:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN Trancation Hold:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double Transactionhold = new Double(TotalValue); 
				System.out.println("TransactionHold total:::----"+Transactionhold);
	        
	        
	       
				EGTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Transactionhold);
	        
	      
	      
	    	}
	    	
	    	
	    	//*********************Partially Ticketed*****************************
	    	
	    	Select partiallyticket=new Select(Loginpage.BookingSatus());
	    	partiallyticket.selectByIndex(2);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Compartiallyticket=Loginpage.FlightResults_text().getText();
			System.out.println(Compartiallyticket);
			
			
	    	String comCompartiallyticket = Compartiallyticket.trim();
	    	String[] Compartiallyticketsplited = comCompartiallyticket.split("\\:");
	    	System.out.println("No of Results Count"+Compartiallyticketsplited[1]);
	    	Thread.sleep(1000);
	    	String Partiallyticket1="Partially Ticketed";
	    	
	    	if("Flight Search Results : 0".equals(Compartiallyticket))
	    	{
	    	
	    		EGPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",Partiallyticket1,0,0,0,0,0,0);
	    		System.out.println("PartiallyTicketed total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of partiallyticket:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO partiallyticket:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C partiallyticket:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS partiallyticket:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP partiallyticket:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN partiallyticket:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double partiallytickettotal = new Double(TotalValue); 
				System.out.println("PartiallyTicketed total:::----"+partiallytickettotal);
	        
	        
	       
				EGPartiallyTicketed= String.format("%30s %28s %20s %20d %20d %25s %25s ",Partiallyticket1,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),partiallytickettotal);
	        
	      
	      
	    	}
	    	
	    //*********************Confirmation Pending, do not rebook*****************************
	    	

	    	
	    	Select conformationPen=new Select(Loginpage.BookingSatus());
	    	conformationPen.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Confirmationpentext=Loginpage.FlightResults_text().getText();
			System.out.println(Confirmationpentext);
			
			
	    	String comConfirmationpentext = Confirmationpentext.trim();
	    	String[] ComcomConfirmationpentextsplited = comConfirmationpentext.split("\\:");
	    	System.out.println("No of Results Count"+ComcomConfirmationpentextsplited[1]);
	    	Thread.sleep(1000);
	    	String ConfirmationPending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(Confirmationpentext))
	    	{
	    	
	    		EGConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConfirmationPending,0,0,0,0,0,0);
	    		System.out.println("ConfirmationPendingdonotrebook total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of ConfirmationPending:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO ConfirmationPending:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C ConfirmationPending:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS ConfirmationPending:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP ConfirmationPending:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN ConfirmationPending:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double conformationpendingtotal = new Double(TotalValue); 
				System.out.println("ConfirmationPendingdonotrebook total:::----"+conformationpendingtotal);
	        
	        
	       
				EGConfirmationPendingdonotrebook= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConfirmationPending,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),conformationpendingtotal);
	        
	      
	      
	    	}
	    	
	    	
//*********************Cancellation Requested*****************************
	    	

	    	
	    	Select Cancelrequest=new Select(Loginpage.BookingSatus());
	    	Cancelrequest.selectByIndex(5);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Cancelrequesttext=Loginpage.FlightResults_text().getText();
			System.out.println(Cancelrequesttext);
			
			
	    	String comCancelrequesttext = Cancelrequesttext.trim();
	    	String[] comCancelrequesttextsplited = comCancelrequesttext.split("\\:");
	    	System.out.println("No of Results Count"+comCancelrequesttextsplited[1]);
	    	Thread.sleep(1000);
	    	String CancellationRequested="Cancellation Requested";
	    	
	    	if("Flight Search Results : 0".equals(Cancelrequesttext))
	    	{
	    	
	    		EGCancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",CancellationRequested,0,0,0,0,0,0);
	    		System.out.println("CancellationRequested total:::----0");
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
	    		 
	    		  System.out.println("Total Number of CancellationRequested:" + WE1.size());
	    		  
	    		  
	    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

	    	System.out.println("No of WEGO CancellationRequested:" + SWEGO.size());


	    	List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

	    	System.out.println("No of B2C CancellationRequested:" + SB2C.size());


	    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

	    	System.out.println("No of MOBIOS CancellationRequested:" + SMOBIOS.size());

	    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

	    	System.out.println("No of MOBAPP CancellationRequested:" + SMOBAPP.size());

	    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

	    	System.out.println("No of SKYSCN CancellationRequested:" + SSKYSCN.size());
	    	
	        
	        
	        
	      //Total count
	    	 String SWego =String.format("%10s",SWEGO.size());
		        String Sb2c =String.format("%10s",SB2C.size());
		        String SMobIos =String.format("%10s",SMOBIOS.size());
		        String SMobAnd =String.format("%10s",SMOBAPP.size());
		        String Sskyscan =String.format("%10s",SSKYSCN.size());
		        
		        Double TotalValue = Double.parseDouble(SWego) + Double.parseDouble(Sb2c) +Double.parseDouble(SMobIos) + Double.parseDouble(SMobAnd)+ Double.parseDouble(Sskyscan) ;
				Double CancellationRequestedTotal = new Double(TotalValue); 
				System.out.println("CancellationRequested total:::----"+CancellationRequestedTotal);
	        
	        
	       
				EGCancellationRequest= String.format("%30s %22s %20s %20d %20d %25s %25s ",CancellationRequested,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),CancellationRequestedTotal);
	        
	      
	      
	    	}
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	
	    	
		}

		

}
