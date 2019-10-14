package careemCabsModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import AppModules.Login;
import pageobjects.Loginpage;

public class Cabs_Yesterday_Booking_Status {

	 static int EG_UP_Coming;
	 static int EG_Driver_assigned ;
	 static int EG_Driver_Coming; 
	 static int EG_Driver_Here;
	 static int EG_Trip_Started ;
	 static int EG_Trip_Ended ;
	 static int EG_Canceled;
	
	
	public static void AllStatus_cabs_EG(int iTestCaseRow,WebDriver driver) throws Exception {
		
		driver.get("http://callcenter.rehlat.com.eg/");
    	Thread.sleep(1000);
    	Login.LoginCallCenter(iTestCaseRow);
    	Thread.sleep(1000);
    	
    	/*WebElement checkbox = driver.findElement(By.id("DisablePagination"));
		if (!checkbox.isSelected())
			checkbox.click();
		else
		{
			System.out.println("Alerdy Check Box is selected");
		}*/
    	driver.findElement(By.linkText("Careem cab")).click();
    	Thread.sleep(2000);
		Loginpage.Cab_FromDate().click();
		Thread.sleep(1000);
		
		String CurrentUrl=driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
    	System.out.println("Current Url"+urldomain[1]);
    	String[] urldomain1 = urldomain[1].split("\\/");
    	System.out.println("Domain Name::"+urldomain1[0]);
    	
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
    	 Calendar cal = Calendar.getInstance();
	  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
	  	 
	  	   cal.add(Calendar.DATE, -1);
	  	   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));  
	  	  String st=dateFormat.format(cal.getTime());
	  	   String[] spliteddate = st.split("-");
	  	   System.out.println("Split the Date::"+spliteddate[0]);
    	
    	
		Loginpage.Select_dateFrom(spliteddate[0]);
		Thread.sleep(1000);
		Loginpage.Cab_ToDate().click();
		Thread.sleep(1000);
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateTo(spliteddate[0]);
		Thread.sleep(1000);
		
		
		//******************* UPCOMING*********************************************
    	Select transaction1=new Select(Loginpage.Cabs_BookingSatus());
    	transaction1.selectByVisibleText("UPCOMING");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
		
		
		/*long timeoutInSeconds = 85;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div/div[2]"))));
		String comTrancount=Loginpage.CabResults_text().getText();
		System.out.println(comTrancount);
		String comtranstr = comTrancount.trim();
    	String[] comtransplited = comtranstr.split("\\:");
    	System.out.println("No of Results Count"+comtransplited[1]);*/
    	
    	Thread.sleep(1000);
    	String tran="UPCOMING";
        String Up_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+Up_No_results);
    	
    	/*if("Careem Cab Search Results : 0".equals(comTrancount))
    	{
    	
    	}*/
        
        if("No Results Found".equals(Up_No_results))
    	{
        	EG_UP_Coming=0;
    	}
    	else
    	{
    		List<WebElement> UP=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
   		 
  		    System.out.println("Total Number of UPCOMING:" + UP.size());
  		    
  		     String EG_Up =String.format("%1s",UP.size());
	    	
	    	
	    	EG_UP_Coming =Integer.parseInt(EG_Up);
  		
    	}
    	      
    	//******************* DRIVER_ASSIGNED*********************************************
    	Select dri_a=new Select(Loginpage.Cabs_BookingSatus());
    	dri_a.selectByVisibleText("DRIVER_ASSIGNED");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
		
		/*String driver_ass_count=Loginpage.CabResults_text().getText();
		System.out.println(driver_ass_count);
		String egdriver_ass_count = driver_ass_count.trim();
    	String[] comconpendingplited = egdriver_ass_count.split("\\:");
    	System.out.println("No of Results Count"+comconpendingplited[1]);*/
    	
    	Thread.sleep(1000);
    	String conformation_pending="Confirmation Pending";
    	String D_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+Up_No_results);
    	/*if("Careem Cab Search Results : 0".equals(driver_ass_count))
    	{
    	
    	}*/
    	if("No Results Found".equals(D_No_results))
    	{
    		EG_Driver_assigned=0;
    	}
    	else
    	{
    	
    		List<WebElement> Driver_Ass=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
    		 
    		  System.out.println("Total Number of DRIVER_ASSIGNED:" + Driver_Ass.size());
    		 
    		  String EG_DRiver_s =String.format("%1s",Driver_Ass.size());
  	    	
    		  EG_Driver_assigned =Integer.parseInt(EG_DRiver_s);
    	}
    	
    	
//DRIVER_COMING
    	
    	Select Dri_c=new Select(Loginpage.Cabs_BookingSatus());
    	Dri_c.selectByVisibleText("DRIVER_COMING");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
    	
		/*String D_C_count=Loginpage.CabResults_text().getText();
		System.out.println(D_C_count);
	 	String Rstr = D_C_count.trim();
    	String[] Rsplited = Rstr.split("\\:");
    	System.out.println("No of Results Count"+Rsplited[1]);*/
    	Thread.sleep(1000);
    	String Repricing="Repricing";
    	String D_c_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+D_c_No_results);
    	/*if("Careem Cab Search Results : 0".equals(D_C_count))
    	{
    		
    	}*/
    	if("No Results Found".equals(D_c_No_results))
    	{
    		EG_Driver_Coming=0;
    	}
    	else
    	{
    	
    		List<WebElement> Driver_Coming=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
    		  System.out.println("Total Number of Driver_Coming:" + Driver_Coming.size());
    		  String EG_DRiver_Co =String.format("%1s",Driver_Coming.size());
    	    	
    		  EG_Driver_Coming =Integer.parseInt(EG_DRiver_Co);
    	}
		
    	Thread.sleep(2000);
    	
	
    	
    	
    	
    
    	//***********************DRIVER_HERE**********************************
		Select D_R=new Select(Loginpage.Cabs_BookingSatus());
		D_R.selectByVisibleText("DRIVER_HERE");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
		
		/*String D_R_count=Loginpage.CabResults_text().getText();
		System.out.println(D_R_count);
	   	String str = D_R_count.trim();
    	String[] splited = str.split("\\:");
    	System.out.println("No of Results Count"+splited[1]);*/
    	Thread.sleep(1000);
    	String soldout="SoldOuts";
    	
    	String D_H_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+D_H_No_results);
    	
    	/*if("Careem Cab Search Results : 0".equals(D_R_count))
    	{
    		
    	}*/
    	if("No Results Found".equals(D_H_No_results))
    	{
    		EG_Driver_Here=0;
    	}
    	else
    	{
    	
    		List<WebElement> Driver_Here=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
    		
    		  System.out.println("Total Number of Driver_Here:" + Driver_Here.size());
    		  String EG_DRiver_H =String.format("%1s",Driver_Here.size());
  	    	
    		  EG_Driver_Here =Integer.parseInt(EG_DRiver_H);
    	
    	}
		
    	Thread.sleep(2000);
    	
	
	
	
    	//***********************TRIP_STARTED**********************************
		Select T_S=new Select(Loginpage.Cabs_BookingSatus());
		T_S.selectByVisibleText("TRIP_STARTED");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
		
	/*	String T_S_count=Loginpage.CabResults_text().getText();
		System.out.println(T_S_count);
	   	String strCancelled = T_S_count.trim();
    	String[] Cancelledsplited = strCancelled.split("\\:");
    	System.out.println("No of Results Count"+Cancelledsplited[1]);*/
    	Thread.sleep(1000);
    	String Cancelled1="TRIP_STARTED";
    	
    	String T_s_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+T_s_No_results);
    	
    	/*if("Careem Cab Search Results : 0".equals(T_S_count))
    	{
    		
    	}*/
    	if("No Results Found".equals(T_s_No_results))
    	{
    		EG_Trip_Started=0;
    	}
    	else
    	{
    	
    		List<WebElement> Trip_Started=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
    	  System.out.println("Total Number of Trip_Started:" + Trip_Started.size());
    	  String EG_Trip_s =String.format("%1s",Trip_Started.size());
	    	
    	  EG_Trip_Started =Integer.parseInt(EG_Trip_s); 
    	}
		
    	Thread.sleep(2000);
    	
    	

    	//*********************TRIP_ENDED*****************************
    	Select T_E=new Select(Loginpage.Cabs_BookingSatus());
    	T_E.selectByVisibleText("TRIP_ENDED");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
		
		/*String T_E_Count=Loginpage.CabResults_text().getText();
		System.out.println(T_E_Count);
	   	String comtranstrhold = T_E_Count.trim();
    	String[] comtranholdsplited = comtranstrhold.split("\\:");
    	System.out.println("No of Results Count"+comtranholdsplited[1]);*/
    	Thread.sleep(1000);
    	
    	String tranHold="TRIP_ENDED";
    	String T_E_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+T_E_No_results);
    	/*if("Careem Cab Search Results : 0".equals(T_E_Count))
    	{
    	
    	}*/
    	if("No Results Found".equals(T_E_No_results))
    	{
    		EG_Trip_Ended=0;
    	}
    	else
    	{
    	
    		List<WebElement> Trip_Ended=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
    		 
    		  System.out.println("Total Number of Trip_Ended:" + Trip_Ended.size());
    		  String EG_Trip_E =String.format("%1s",Trip_Ended.size());
  	    	
    		  EG_Trip_Ended =Integer.parseInt(EG_Trip_E); 
    		  
    		 
      
    	}
    	
    	//*********************CANCELED*****************************
    	Select C_N=new Select(Loginpage.Cabs_BookingSatus());
    	C_N.selectByVisibleText("CANCELED");
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(3000);
		
		/*String C_N_Count=Loginpage.CabResults_text().getText();
		System.out.println(C_N_Count);
	  	String eg_C_N = C_N_Count.trim();
    	String[] egcanclesplited = eg_C_N.split("\\:");
    	System.out.println("No of Results Count"+egcanclesplited[1]);*/
    	Thread.sleep(1000);
    	
    	String CN="CANCELED";
    	String C_No_results=driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div")).getText();
        System.out.println("Up_No_results:"+C_No_results);
    	/*if("Careem Cab Search Results : 0".equals(C_N_Count))
    	{
    	
    	}*/
    	if("No Results Found".equals(C_No_results))
    	{
    		EG_Canceled=0;
    	}
    	else
    	{
    	
    		List<WebElement> Canceled=driver.findElements(By.xpath("//div[@id='careemCab1']/div/div/div/div[2]/table/tbody/tr/td[1]"));
    		 
    		  System.out.println("Total Number of CANCELED:" + Canceled.size());
    		  
    		  String EG_Can =String.format("%1s",Canceled.size());
    	    	
    		  EG_Canceled =Integer.parseInt(EG_Can); 
    		 
      
    	}
    	
    	
    	
    	
    	Loginpage.ClickOnUsername().click();
    	Thread.sleep(1000);
    	Loginpage.Log_Out().click();
    	Thread.sleep(2000);
    	
    	System.out.println("************************************************************************************");

    	

}

}
