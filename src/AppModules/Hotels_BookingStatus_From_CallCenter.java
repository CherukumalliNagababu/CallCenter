package AppModules;

import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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


public class Hotels_BookingStatus_From_CallCenter {
	
		
		static String COMDomainNames;
		static String COMSoldOuts;
		static String COMTrancationSuccess;
		static String COMTransactionHold;
		static String COMCancelled;
		

		static String SADomainNames;
		static String SASoldOuts;
		static String SATrancationSuccess;
		static String SATransactionHold;
		static String SACancelled;
		
		static String AEDomainNames;
		static String AESoldOuts;
		static String AETrancationSuccess;
		static String AETransactionHold;
		static String AECancelled;
		
		static String EGDomainNames;
		static String EGSoldOuts;
		static String EGTrancationSuccess;
		static String EGTransactionHold;
		static String EGCancelled;
		
		
		// COM
		
		static int Com_TS_Wego;
		static int Com_TS_b2c;
		static int Com_TS_MobIos;
		static int Com_TS_MobAnd;
		static int Com_TS_skyscan ;
		static int  Com_TS_Dhrehlat;
		static int Com_TS_Aviasa;
		static int Com_TS_Kayak;
		static int Com_TS_Dohop;
		static int Com_TS_Farecompare;
		static int Com_TS_Shoogloo;
		static int Com_TS_Trivago;
		static int Com_TS_Google;
		
		static int Com_SD_Wego ;
		static int Com_SD_b2c;
		static int Com_SD_MobIos; 
		static int Com_SD_MobAnd ;
		static int Com_SD_skyscan ;
		static int  Com_SD_Dhrehlat ;
		static int Com_SD_Aviasa;
		static int Com_SD_Kayak;
		static int Com_SD_Dohop;
		static int Com_SD_Farecompare;
		static int Com_SD_Shoogloo;
		static int Com_SD_Trivago;
		static int Com_SD_Google;
		
		static int Com_CN_Wego ;
		static int Com_CN_b2c;
		static int Com_CN_MobIos; 
		static int Com_CN_MobAnd ;
		static int Com_CN_skyscan ;
		static int  Com_CN_Dhrehlat ;
		static int Com_CN_Aviasa;
		static int Com_CN_Kayak;
		static int Com_CN_Dohop;
		static int Com_CN_Farecompare;
		static int Com_CN_Shoogloo;
		static int Com_CN_Trivago;
		static int Com_CN_Google;
		
		static int Com_TH_Wego; 
		static int Com_TH_b2c ;
		static int Com_TH_MobIos; 
		static int Com_TH_MobAnd ;
		static int Com_TH_skyscan ;
		static int  Com_TH_Dhrehlat ;
		static int Com_TH_Aviasa;
		static int Com_TH_Kayak;
		static int Com_TH_Dohop;
		static int Com_TH_Farecompare;
		static int Com_TH_Shoogloo;
		static int Com_TH_Trivago;
		static int Com_TH_Google;
		
		// SA
		
			static int SA_TS_Wego;
			static int SA_TS_b2c ;
			static int SA_TS_MobIos; 
			static int SA_TS_MobAnd;
			static int SA_TS_skyscan ;
			static int  SA_TS_Dhrehlat ;
			static int SA_TS_Aviasa;
			static int SA_TS_Kayak;
			static int SA_TS_Dohop;
			static int SA_TS_Farecompare;
			static int SA_TS_Shoogloo;
			static int SA_TS_Trivago;
			static int SA_TS_Google;
			
			static int SA_SD_Wego ;
			static int SA_SD_b2c;
			static int SA_SD_MobIos; 
			static int SA_SD_MobAnd ;
			static int SA_SD_skyscan ;
			static int  SA_SD_Dhrehlat ;
			static int SA_SD_Aviasa;
			static int SA_SD_Kayak;
			static int SA_SD_Dohop;
			static int SA_SD_Farecompare;
			static int SA_SD_Shoogloo;
			static int SA_SD_Trivago;
			static int SA_SD_Google;
			
			static int SA_CN_Wego ;
			static int SA_CN_b2c;
			static int SA_CN_MobIos; 
			static int SA_CN_MobAnd ;
			static int SA_CN_skyscan ;
			static int  SA_CN_Dhrehlat ;
			static int SA_CN_Aviasa;
			static int SA_CN_Kayak;
			static int SA_CN_Dohop;
			static int SA_CN_Farecompare;
			static int SA_CN_Shoogloo;
			static int SA_CN_Trivago;
			static int SA_CN_Google;
			
			static int SA_TH_Wego; 
			static int SA_TH_b2c ;
			static int SA_TH_MobIos; 
			static int SA_TH_MobAnd ;
			static int SA_TH_skyscan ;
			static int SA_TH_Dhrehlat ;
			static int SA_TH_Aviasa;
			static int SA_TH_Kayak;
			static int SA_TH_Dohop;
			static int SA_TH_Farecompare;
			static int SA_TH_Shoogloo;
			static int SA_TH_Trivago;
			static int SA_TH_Google;
			
			
			// AE
			
			static int AE_TS_Wego;
			static int AE_TS_b2c ;
			static int AE_TS_MobIos; 
			static int AE_TS_MobAnd;
			static int AE_TS_skyscan ;
			static int AE_TS_Dhrehlat ;
			static int AE_TS_Aviasa;
			static int AE_TS_Kayak;
			static int AE_TS_Dohop;
			static int AE_TS_Farecompare;
			static int AE_TS_Shoogloo;
			static int AE_TS_Trivago;
			static int AE_TS_Google;
			
			static int AE_SD_Wego ;
			static int AE_SD_b2c;
			static int AE_SD_MobIos; 
			static int AE_SD_MobAnd ;
			static int AE_SD_skyscan ;
			static int AE_SD_Dhrehlat ;
			static int AE_SD_Aviasa;
			static int AE_SD_Kayak;
			static int AE_SD_Dohop;
			static int AE_SD_Farecompare;
			static int AE_SD_Shoogloo;
			static int AE_SD_Trivago;
			static int AE_SD_Google;
			
			static int AE_CN_Wego ;
			static int AE_CN_b2c;
			static int AE_CN_MobIos; 
			static int AE_CN_MobAnd ;
			static int AE_CN_skyscan ;
			static int AE_CN_Dhrehlat ;
			static int AE_CN_Aviasa;
			static int AE_CN_Kayak;
			static int AE_CN_Dohop;
			static int AE_CN_Farecompare;
			static int AE_CN_Shoogloo;
			static int AE_CN_Trivago;
			static int AE_CN_Google;
			
			static int AE_TH_Wego; 
			static int AE_TH_b2c ;
			static int AE_TH_MobIos; 
			static int AE_TH_MobAnd ;
			static int AE_TH_skyscan ;
			static int AE_TH_Dhrehlat ;
			static int AE_TH_Aviasa;
			static int AE_TH_Kayak;
			static int AE_TH_Dohop;
			static int AE_TH_Farecompare;
			static int AE_TH_Shoogloo;
			static int AE_TH_Trivago;
			static int AE_TH_Google;
			
			// EG
			
				static int EG_TS_Wego;
				static int EG_TS_b2c ;
				static int EG_TS_MobIos; 
				static int EG_TS_MobAnd;
				static int EG_TS_skyscan ;
				static int EG_TS_Dhrehlat ;
				static int EG_TS_Aviasa;
				static int EG_TS_Kayak;
				static int EG_TS_Dohop;
				static int EG_TS_Farecompare;
				static int EG_TS_Shoogloo;
				static int EG_TS_Trivago;
				static int EG_TS_Google;
				
				static int EG_SD_Wego ;
				static int EG_SD_b2c;
				static int EG_SD_MobIos; 
				static int EG_SD_MobAnd ;
				static int EG_SD_skyscan ;
				static int EG_SD_Dhrehlat ;
				static int EG_SD_Aviasa;
				static int EG_SD_Kayak;
				static int EG_SD_Dohop;
				static int EG_SD_Farecompare;
				static int EG_SD_Shoogloo;
				static int EG_SD_Trivago;
				static int EG_SD_Google;
				
				static int EG_CN_Wego ;
				static int EG_CN_b2c;
				static int EG_CN_MobIos; 
				static int EG_CN_MobAnd ;
				static int EG_CN_skyscan ;
				static int EG_CN_Dhrehlat ;
				static int EG_CN_Aviasa;
				static int EG_CN_Kayak;
				static int EG_CN_Dohop;
				static int EG_CN_Farecompare;
				static int EG_CN_Shoogloo;
				static int EG_CN_Trivago;
				static int EG_CN_Google;
				
				static int EG_TH_Wego; 
				static int EG_TH_b2c ;
				static int EG_TH_MobIos; 
				static int EG_TH_MobAnd ;
				static int EG_TH_skyscan ;
				static int EG_TH_Dhrehlat ;
				static int EG_TH_Aviasa;
				static int EG_TH_Kayak;
				static int EG_TH_Dohop;
				static int EG_TH_Farecompare;
				static int EG_TH_Shoogloo;
				static int EG_TH_Trivago;
				static int EG_TH_Google;
			
		 //
					
					static int Com_TS_Transaction_Total;
					static int Com_TS_Other_TrancationSuccessfull;
					static int Com_SD_SoldOut_Total;
					static int Com_SD_Other_SoldOutstotal;
					static int Com_CN_CancelledTotal;
					static int Com_CN_Other_CancelledTotal;
					static int Com_TH_Transactionhold_total;
					static int Com_Other_TH_Transactionhold_total;
					
					static int SA_TS_Transaction_Total;
					static int SA_TS_Other_TrancationSuccessfull;
					static int SA_SD_SoldOut_Total;
					static int SA_SD_Other_SoldOutstotal;
					static int SA_CN_CancelledTotal;
					static int SA_CN_Other_CancelledTotal;
					static int SA_TH_Transactionhold_total ;
					static int SA_TH_Other_TransactionholdTotal;
					
					static int AE_TS_Transaction_Total;
					static int AE_TS_Other_TrancationSuccessfull;
					static int AE_SD_SoldOut_Total;
					static int AE_SD_Other_SoldOutstotal;
					static int AE_CN_CancelledTotal;
					static int AE_CN_Other_CancelledTotal;
					static int AE_TH_Transactionhold_total;
					static int AE_TH_Other_TransactionholdTotal;
					
					static int EG_TS_Transaction_Total;
					static int EG_TS_Other_TrancationSuccessfull;
					static int EG_SD_SoldOut_Total;
					static int EG_SD_Other_SoldOutstotal;
					static int EG_CN_CancelledTotal ;
					static int EG_CN_Other_CancelledTotal;
					static int EG_TH_Transactionhold_total;
					static int EG_TH_Other_TransactionHoldTotal;
					
					
				
		
		public static void AllStatus_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
			
			COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			
			//Loginpage.COM_link().click();
			driver.get("http://callcenter.rehlat.com/");
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
	    
	    	Loginpage.Hotel_link().click();
	    	Thread.sleep(2000);
			
			Loginpage.Hotel_FromDate().click();
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
			Loginpage.Hotel_ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(3000);
			
			
			//******************* Confirmed & Transaction Successfull*********************************************
	    	Select transaction1=new Select(Loginpage.Hotel_BookingSatus());
	    	transaction1.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
	    	String comtranstr = comTrancount.trim();
	    	String[] comtransplited = comtranstr.split("\\:");
	    	System.out.println("No of Results Count"+comtransplited[1]);
	    	Thread.sleep(1000);
	    	String tran="Transaction Successful";
	    	
	    	if("Hotel Search Results : 0".equals(comTrancount))
	    	{
	    		COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	    		
	    		  Com_TS_Wego =0;
	 	          Com_TS_b2c =0;
	 	         Com_TS_MobIos =0;
	 	         Com_TS_MobAnd =0;
	 	         Com_TS_skyscan =0;
	 	         
	 	        Com_TS_Dhrehlat =0;
		         Com_TS_Aviasa =0;
		         Com_TS_Kayak =0;
		         
		         Com_TS_Dohop =0;
		         Com_TS_Farecompare =0;
		         Com_TS_Shoogloo =0;
		         Com_TS_Trivago=0;
		         Com_TS_Google=0;
	 	         
		         int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobAnd+Com_TS_MobIos+Com_TS_Google +Com_TS_skyscan+Com_TS_Trivago
		 		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
		 				  
		 		        Com_TS_Transaction_Total = TotalValue; 
		 				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
		 				
		 				int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
		 		 	    	
		 				 Com_TS_Other_TrancationSuccessfull = Other; 
		 					System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO-HOTEL": 
	    	            	if(element.equals("WEGO-HOTEL")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	 Com_TS_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	   	    		    	 Com_TS_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  Com_TS_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    		    	  Com_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 Com_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	    		    	 Com_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 Com_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            
	    	            case "TRIVAGO": 
	    	            	 if(element.equals("TRIVAGO"))
	    		    	       {        
	    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

	    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
	    		    	
	    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
			    		    
	    		    	 Com_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_TS_Trivago =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break; 
	    	            
	    	            case "GOOGLE-HOTEL": 
	    	            	 if(element.equals("GOOGLE-HOTEL"))
	    		    	       {        
	    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

	    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
	    		    	
	    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
			    		    
	    		    	 Com_TS_Google =Integer.parseInt(Com_TS_google1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_TS_Google =Integer.parseInt(Com_TS_google1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            
	    	            case "SKYSCN-HOTEL": 
	    	            	 if(element.equals("SKYSCN-HOTEL"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 Com_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 Com_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	Com_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			Com_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	Com_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Com_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	Com_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Com_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 Com_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		Com_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 Com_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 Com_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 Com_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 Com_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
	    	
	    	              
	    	
	    	
	    	
	    	      
	      //Total count
	    	    // Com_TS_Wego =String.format("%1s",SWEGO.size());
		       // Com_TS_b2c =String.format("%1s",SB2C.size());
		        // Com_TS_MobIos =String.format("%1s",SMOBIOS.size());
		       //  Com_TS_MobAnd =String.format("%1s",SMOBAPP.size());
		        // Com_TS_skyscan =String.format("%1s",SSKYSCN.size());
		         //Com_TS_Dhrehlat =String.format("%1s",DHREHLAT.size());
		        /* Com_TS_Aviasa =String.format("%1s",AVIASALES.size());
		         Com_TS_Kayak =String.format("%1s",KAYAK.size());
		         
		         Com_TS_Dohop =String.format("%1s",DOHOP.size());
		         Com_TS_Farecompare =String.format("%1s",FARECOMPARE.size());
		         Com_TS_Shoogloo =String.format("%1s",SHOOGLOO.size());*/
		         
		         System.out.println("Com_TS_Wego:"+Com_TS_Wego);
		         System.out.println("Com_TS_b2c:"+Com_TS_b2c);
		         System.out.println("Com_TS_MobIos:"+Com_TS_MobIos);
		         System.out.println("Com_TS_skyscan:"+Com_TS_skyscan);
		         System.out.println("Com_TS_Dhrehlat:"+Com_TS_Dhrehlat);
		         System.out.println("Com_TS_Aviasa:"+Com_TS_Aviasa);
		         System.out.println("Com_TS_Kayak:"+Com_TS_Kayak);
		         System.out.println("Com_TS_Dohop:"+Com_TS_Dohop);
		         System.out.println("Com_TS_Farecompare:"+Com_TS_Farecompare);
		         System.out.println("Com_TS_Shoogloo:"+Com_TS_Shoogloo);
		         System.out.println("Com_TS_MobAnd:"+Com_TS_MobAnd);
		         System.out.println("Com_TS_Trivago:"+Com_TS_Trivago);
		         System.out.println("Com_TS_Google:"+Com_TS_Google);
		        
		        
		        int TotalValue = Com_TS_Wego + Com_TS_b2c+ Com_TS_MobAnd+Com_TS_MobIos+Com_TS_Google +Com_TS_skyscan+Com_TS_Trivago
		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
				  
		        Com_TS_Transaction_Total = TotalValue; 
				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
				
				 int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
		 	    	
				 Com_TS_Other_TrancationSuccessfull =Other; 
					System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}
	    	        
	    
	    	//***********************PENDING-PAYMENT**********************************
			Select s=new Select(Loginpage.Hotel_BookingSatus());
			s.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
	    	String str = count.trim();
	    	String[] splited = str.split("\\:");
	    	System.out.println("No of Results Count"+splited[1]);
	    	Thread.sleep(1000);
	    	String soldout="SoldOuts";
	    	
	    	
	    	
	    	if("Hotel Search Results : 0".equals(count))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMSoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
	    		
	    		 Com_SD_Wego =0;
		         Com_SD_b2c =0;
		         Com_SD_MobIos =0;
		         Com_SD_MobAnd =0;
		         Com_SD_skyscan =0;
		         
		         Com_SD_Dhrehlat =0;
		         Com_SD_Aviasa =0;
		         Com_SD_Kayak =0;
		         
		         Com_SD_Dohop =0;
		         Com_SD_Farecompare =0;
		         Com_SD_Shoogloo =0;
		         Com_SD_Trivago=0;
		         Com_SD_Google=0;
	    		 
		         
		         int TotalValue = Com_SD_Wego+ Com_SD_b2c+Com_SD_MobAnd+Com_SD_MobIos+Com_SD_Trivago + Com_SD_Google+Com_SD_skyscan
			        +Com_SD_Dhrehlat+ Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
			       
			        
			        
			        Com_SD_SoldOut_Total = TotalValue; 
					System.out.println("SoldOuts total:::----"+Com_SD_SoldOut_Total);
					
					
					int Other =Com_SD_Dhrehlat +Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
			 	    	
					 Com_SD_Other_SoldOutstotal = Other; 
						System.out.println(" Others domains SoldOuts total:::----"+Com_SD_Other_SoldOutstotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of soldOuts:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 Com_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 Com_SD_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_SD_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
		    	       
		    	        int TotalValue = Com_SD_Wego+ Com_SD_b2c+Com_SD_MobAnd+Com_SD_MobIos+Com_SD_Google + Com_SD_Trivago+Com_SD_skyscan
		    			        +Com_SD_Dhrehlat+ Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
		    			       
		    			        
		    			        
		    			        Com_SD_SoldOut_Total = TotalValue; 
		    					System.out.println("SoldOuts total:::----"+Com_SD_SoldOut_Total);
		    					
		    					
		    					int Other =Com_SD_Dhrehlat +Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
		    			 	    	
		    					 Com_SD_Other_SoldOutstotal = Other; 
		    						System.out.println(" Others domains SoldOuts total:::----"+Com_SD_Other_SoldOutstotal);
	    	
	    	
				
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	
		
		
		
	    	//***********************Cancelled**********************************
			Select Cancelled=new Select(Loginpage.Hotel_BookingSatus());
			Cancelled.selectByIndex(2);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String Cancelledcount=Loginpage.FlightResults_text().getText();
			System.out.println(Cancelledcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String strCancelled = Cancelledcount.trim();
	    	String[] Cancelledsplited = strCancelled.split("\\:");
	    	System.out.println("No of Results Count"+Cancelledsplited[1]);
	    	Thread.sleep(1000);
	    	String Cancelled1="Cancelled";
	    	
	    	
	    	
	    	if("Hotel Search Results : 0".equals(Cancelledcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMCancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
	    		
	    		 Com_CN_Wego =0;
		         Com_CN_b2c =0;
		         Com_CN_MobIos =0;
		         Com_CN_MobAnd =0;
		         Com_CN_skyscan =0;
		         
		         Com_CN_Dhrehlat =0;
		         Com_CN_Aviasa =0;
		         Com_CN_Kayak =0;
		         
		         Com_CN_Dohop =0;
		         Com_CN_Farecompare =0;
		         Com_CN_Shoogloo =0;
		         Com_CN_Google=0;
		         Com_CN_Trivago=0;
		         
		         
		         int TotalValue = Com_CN_Wego +Com_CN_b2c +Com_CN_MobAnd+Com_CN_MobIos+Com_CN_Google +Com_CN_Trivago+ Com_CN_skyscan
 		        +Com_CN_Dhrehlat +Com_CN_Aviasa +Com_CN_Kayak +Com_CN_Dohop+Com_CN_Farecompare+Com_CN_Shoogloo;
 				 Com_CN_CancelledTotal = TotalValue; 
 				System.out.println("Cancelled total:::----"+Com_CN_CancelledTotal);
 				
 				int Other =Com_CN_Dhrehlat + Com_CN_Aviasa +Com_CN_Kayak + Com_CN_Dohop+ Com_CN_Farecompare+ Com_CN_Shoogloo;
     	    	
				 Com_CN_Other_CancelledTotal = Other; 
 				System.out.println("Cancelled total:::----"+Com_CN_Other_CancelledTotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Cancelled:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_CN_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_CN_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_CN_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_CN_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 Com_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break; 
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 Com_CN_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_CN_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
		    	       
		        
		    	        int TotalValue = Com_CN_Wego +Com_CN_b2c+Com_CN_MobAnd +Com_CN_MobIos+Com_CN_Google +Com_CN_Trivago+ Com_CN_skyscan
		  		        +Com_CN_Dhrehlat +Com_CN_Aviasa +Com_CN_Kayak +Com_CN_Dohop+Com_CN_Farecompare+Com_CN_Shoogloo;
		  				 Com_CN_CancelledTotal =  TotalValue; 
		  				System.out.println("Cancelled total:::----"+Com_CN_CancelledTotal);
		  				
		  				int Other =Com_CN_Dhrehlat + Com_CN_Aviasa +Com_CN_Kayak + Com_CN_Dohop+ Com_CN_Farecompare+ Com_CN_Shoogloo;
		      	    	
		 				 Com_CN_Other_CancelledTotal =  Other; 
		  				System.out.println("Cancelled total:::----"+Com_CN_Other_CancelledTotal);
	      
	    	}
			
	    	Thread.sleep(2000);
	    	
	    	

	   	//*********************PENDING-VOUCHER*****************************
	    	Select transactionHold=new Select(Loginpage.Hotel_BookingSatus());
	    	transactionHold.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String comTranHold=Loginpage.FlightResults_text().getText();
			System.out.println(comTranHold);
			
			
	    	String comtranstrhold = comTranHold.trim();
	    	String[] comtranholdsplited = comtranstrhold.split("\\:");
	    	System.out.println("No of Results Count"+comtranholdsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	String tranHold="Transaction Hold";
	    	if("Hotel Search Results : 0".equals(comTranHold))
	    	{
	    	
	    		COMTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
	    		System.out.println("TransactionHold total:::----0");
	    		
	    		 Com_TH_Wego =0;
  		       Com_TH_b2c =0;
  		         Com_TH_MobIos =0;
  		         Com_TH_MobAnd =0;
  		         Com_TH_skyscan =0;
  		         
  		       Com_TH_Dhrehlat =0;
		         Com_TH_Aviasa =0;
		         Com_TH_Kayak =0;
		         
		         Com_TH_Dohop =0;
		         Com_TH_Farecompare =0;
		         Com_TH_Shoogloo =0;
		         Com_TH_Google=0;
		         Com_TH_Trivago=0;
		         
		         int TotalValue =Com_TH_Wego + Com_TH_b2c+Com_TH_MobAnd+Com_TH_MobIos +Com_TH_Google + Com_TH_Trivago+ Com_TH_skyscan
		        +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo ;
				 Com_TH_Transactionhold_total =  TotalValue; 
				 
				 int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo;
	        Com_Other_TH_Transactionhold_total =  otherTotal; 
			System.out.println("TransactionHold total:::----"+Com_Other_TH_Transactionhold_total);
				 
				 
				System.out.println("TransactionHold total:::----"+Com_TH_Transactionhold_total);
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
	    		 
	    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
	    		  
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_TH_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_TH_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_TH_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_TH_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 Com_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break; 
		    	            
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 Com_TH_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_TH_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
		    	       
		    	   
	    	
	    	
	        
		    	        
	        
	   
		    	        int TotalValue =Com_TH_Wego + Com_TH_b2c+Com_TH_MobAnd+Com_TH_MobIos +Com_TH_Google + Com_TH_Trivago+ Com_TH_skyscan
		 		        +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo ;
		 				 Com_TH_Transactionhold_total =  TotalValue; 
		 				 
		 				int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo;
		 	        Com_Other_TH_Transactionhold_total =  otherTotal; 
		 			System.out.println("TransactionHold total:::----"+Com_Other_TH_Transactionhold_total);
		 				 
		 				 
		 				System.out.println("TransactionHold total:::----"+Com_TH_Transactionhold_total);
	        
	      
	      
	    	}
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	System.out.println("************************************************************************************");

	
	
}

		public static void AllStatus_TS_SD_CN_TH_SA(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.SA_link().click();
			 driver.get("http://sacallcenter.rehlat.com/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			Loginpage.Hotel_link().click();
	    	Thread.sleep(2000);
			
			Loginpage.Hotel_FromDate().click();
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
			Loginpage.Hotel_ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Confirmed & Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.Hotel_BookingSatus());
			transaction1.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Hotel Search Results : 0".equals(comTrancount))
			{
				SATrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
				System.out.println("TrancationSuccess total:::----0");
				
				 SA_TS_Wego =0;
			        SA_TS_b2c =0;
			         SA_TS_MobIos =0;
			         SA_TS_MobAnd =0;
			         SA_TS_skyscan =0;
			         
			         SA_TS_Dhrehlat =0;
				     SA_TS_Aviasa =0;
				     SA_TS_Kayak =0;
			         
				     SA_TS_Dohop =0;
				     SA_TS_Farecompare =0;
				     SA_TS_Shoogloo =0;
				     SA_TS_Google=0;
			         SA_TS_Trivago=0;
			         
				     int TotalValue = SA_TS_Wego + SA_TS_b2c+SA_TS_MobAnd+SA_TS_MobIos +SA_TS_Google + SA_TS_Trivago+ SA_TS_skyscan
				        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
						 SA_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
					
						int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
			 	    	
					 SA_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
				 
				  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
				  
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	SA_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		SA_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  SA_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   SA_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 SA_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 SA_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 SA_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 SA_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 SA_TS_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 SA_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	SA_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			SA_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	SA_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	SA_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 SA_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		SA_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 SA_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 SA_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 SA_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
		    	       
			
		    	        
		    
		    
		    	        int TotalValue = SA_TS_Wego + SA_TS_b2c+SA_TS_MobAnd+SA_TS_MobIos +SA_TS_Google + SA_TS_Trivago+ SA_TS_skyscan
				        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
						 SA_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
					
						int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
			 	    	
					 SA_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
		      
		  
		  
			}
			
			//***********************PENDING-PAYMENT**********************************
			Select s=new Select(Loginpage.Hotel_BookingSatus());
			s.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
			String str = count.trim();
			String[] splited = str.split("\\:");
			System.out.println("No of Results Count"+splited[1]);
			Thread.sleep(1000);
			String soldout="SoldOuts";
			
			
			
			if("Hotel Search Results : 0".equals(count))
			{
				//ExcelUtils.lable(2, 2,"No Results are Found");
				
				
				SASoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
				
				SA_SD_Wego =0;
				SA_SD_b2c =0;
				SA_SD_MobIos =0;
				SA_SD_MobAnd =0;
				SA_SD_skyscan =0;
				SA_SD_Dhrehlat =0;
				SA_SD_Aviasa =0;
				SA_SD_Kayak =0;
			    
				SA_SD_Dohop =0;
				SA_SD_Farecompare =0;
				SA_SD_Shoogloo =0;
				SA_SD_Google=0;
		        SA_SD_Trivago=0;
				
				int TotalValue =SA_SD_Wego +SA_SD_b2c+SA_SD_MobAnd+SA_SD_MobIos+SA_SD_Google+ SA_SD_Trivago+ SA_SD_skyscan
				        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
						 
				        SA_SD_SoldOut_Total =  TotalValue; 
						System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
						
						int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
					    	
						 SA_SD_Other_SoldOutstotal =  Other; 
							System.out.println(" Others domains SoldOuts total:::----"+SA_SD_Other_SoldOutstotal);
				 
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
				  
				 
				  
				  System.out.println("Total Number of soldOuts:" + WE1.size());
				  Thread.sleep(2000);
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 SA_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		SA_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  SA_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   SA_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 SA_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 SA_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 SA_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 SA_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 SA_SD_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 SA_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	SA_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			SA_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	SA_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	SA_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 SA_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		SA_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 SA_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 SA_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 SA_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
		    	       
		
		        
		    	        int TotalValue =SA_SD_Wego +SA_SD_b2c+SA_SD_MobAnd+SA_SD_MobIos+SA_SD_Google+ SA_SD_Trivago+ SA_SD_skyscan
		        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
				 
		        SA_SD_SoldOut_Total =  TotalValue; 
				System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
				
				int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
			    	
				 SA_SD_Other_SoldOutstotal =  Other; 
					System.out.println(" Others domains SoldOuts total:::----"+SA_SD_Other_SoldOutstotal);
			
			
			
				
		  
			
				
		  
		    
		  
			}
			
			Thread.sleep(2000);
			
			//***********************Cancelled**********************************
					Select Cancelled=new Select(Loginpage.Hotel_BookingSatus());
					Cancelled.selectByIndex(2);
					Thread.sleep(1000);
					Loginpage.Hotel_Search_button().click();
					Thread.sleep(1000);
					
					String Cancelledcount=Loginpage.FlightResults_text().getText();
					System.out.println(Cancelledcount);
					//ExcelUtils.lable(0, 0,count);
					
			    	String strCancelled = Cancelledcount.trim();
			    	String[] Cancelledsplited = strCancelled.split("\\:");
			    	System.out.println("No of Results Count"+Cancelledsplited[1]);
			    	Thread.sleep(1000);
			    	String Cancelled1="Cancelled";
			    	
			    	
			    	
			    	if("Hotel Search Results : 0".equals(Cancelledcount))
			    	{
			    		//ExcelUtils.lable(2, 2,"No Results are Found");
			    		
			    		
			    		SACancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
			    		
			    		SA_CN_Wego =0;
			    		SA_CN_b2c =0;
			    		SA_CN_MobIos =0;
			    		SA_CN_MobAnd =0;
			    		SA_CN_skyscan =0;
			    		
			    		SA_CN_Dhrehlat =0;
				    	SA_CN_Aviasa =0;
				    	SA_CN_Kayak =0;
				         
				    	SA_CN_Dohop =0;
				    	SA_CN_Farecompare =0;
				    	SA_CN_Shoogloo =0;
				    	SA_CN_Google=0;
					    SA_CN_Trivago=0;
					        
				    	int TotalValue = SA_CN_Wego + SA_CN_b2c+SA_CN_MobAnd+SA_CN_MobIos +SA_CN_Google + SA_CN_Trivago+SA_CN_skyscan
					        +SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
							 SA_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+SA_CN_CancelledTotal);
			    	
							int Other = SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
							
							SA_CN_Other_CancelledTotal =  Other; 
			 				System.out.println("Cancelled total:::----"+SA_CN_Other_CancelledTotal);
			    		 
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
			    		  
			    		 
			    		  
			    		  System.out.println("Total Number of Cancelled:" + WE1.size());
			    		  Thread.sleep(2000);
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO-HOTEL": 
				    	            	if(element.equals("WEGO-HOTEL")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	SA_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		SA_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  SA_CN_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   SA_CN_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 SA_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 SA_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 SA_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "TRIVAGO": 
				    	            	 if(element.equals("TRIVAGO"))
				    		    	       {        
				    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
				    		    	
				    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
						    		    
				    		    	 SA_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
					    	            	}
				    		    	     
				    		    	       
				    	            break; 
				    	            
				    	            case "GOOGLE-HOTEL": 
				    	            	 if(element.equals("GOOGLE-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
				    		    	
				    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
						    		    
				    		    	 SA_CN_Google =Integer.parseInt(Com_TS_google1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_Google =Integer.parseInt(Com_TS_google1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "SKYSCN-HOTEL": 
				    	            	 if(element.equals("SKYSCN-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 SA_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	SA_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			SA_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	SA_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	SA_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 SA_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		SA_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 SA_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 SA_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 SA_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	       
				    	       
				        
				    	        int TotalValue = SA_CN_Wego + SA_CN_b2c+SA_CN_MobAnd+SA_CN_MobIos  +SA_CN_Google + SA_CN_Trivago+SA_CN_skyscan
								        +SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
										 SA_CN_CancelledTotal =  TotalValue; 
										System.out.println("Cancelled total:::----"+SA_CN_CancelledTotal);
						    	
										int Other = SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
										
										SA_CN_Other_CancelledTotal =  Other; 
						 				System.out.println("Cancelled total:::----"+SA_CN_Other_CancelledTotal);
			      
			    	}
					
			    	Thread.sleep(2000);
			
			    	//*********************PENDING-VOUCHER*****************************
			    	Select transactionHold=new Select(Loginpage.Hotel_BookingSatus());
			    	transactionHold.selectByIndex(4);
					Thread.sleep(1000);
					Loginpage.Hotel_Search_button().click();
					Thread.sleep(1000);
					
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Hotel Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		SATransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		SA_TH_Wego =0;
			    		SA_TH_b2c =0;
			    		SA_TH_MobIos =0;
			    		SA_TH_MobAnd =0;
			    		SA_TH_skyscan =0;
			    		
			    		SA_TH_Dhrehlat =0;
				    	SA_TH_Aviasa =0;
				    	SA_TH_Kayak =0;
				         
				    	SA_TH_Dohop =0;
				    	SA_TH_Farecompare =0;
				    	SA_TH_Shoogloo =0;
				    	 SA_TH_Google=0;
						  SA_TH_Trivago=0;
					        
				    	int TotalValue = SA_TH_Wego + SA_TH_b2c+SA_TH_MobAnd +SA_TH_MobIos+SA_TH_Google + SA_TH_Trivago+ SA_TH_skyscan 
					        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
							 SA_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
							
							int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
								
								SA_TH_Other_TransactionholdTotal =  Other; 
				 				System.out.println("TransactionHold total:::----"+SA_TH_Other_TransactionholdTotal);
				        
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO-HOTEL": 
				    	            	if(element.equals("WEGO-HOTEL")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	SA_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		SA_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  SA_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   SA_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	           case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 SA_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 SA_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 SA_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "TRIVAGO": 
				    	            	 if(element.equals("TRIVAGO"))
				    		    	       {        
				    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
				    		    	
				    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
						    		    
				    		    	 SA_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            
				    	            case "GOOGLE-HOTEL": 
				    	            	 if(element.equals("GOOGLE-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
				    		    	
				    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
						    		    
				    		    	 SA_TH_Google =Integer.parseInt(Com_TS_google1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_Google =Integer.parseInt(Com_TS_google1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "SKYSCN-HOTEL": 
				    	            	 if(element.equals("SKYSCN-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 SA_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	SA_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			SA_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	SA_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	SA_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 SA_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		SA_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 SA_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 SA_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 SA_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
			    	
			        
				    	       
			        
				    	        int TotalValue = SA_TH_Wego + SA_TH_b2c+SA_TH_MobAnd +SA_TH_MobIos +SA_TH_Google + SA_TH_Trivago+ SA_TH_skyscan 
						        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
								 SA_TH_Transactionhold_total =  TotalValue; 
								System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
								
								int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
									
									SA_TH_Other_TransactionholdTotal =  Other; 
					 				System.out.println("TransactionHold total:::----"+SA_TH_Other_TransactionholdTotal);
			    	}
			    	
			    	Loginpage.ClickOnUsername().click();
			    	Thread.sleep(1000);
			    	Loginpage.Log_Out().click();
			    	Thread.sleep(2000);
			    	
			    	System.out.println("************************************************************************************");

			
			
		}

		public static void AllStatus_TS_SD_CN_TH_AE(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.AE_link().click();
			driver.get("http://callcenter.rehlat.ae/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			Loginpage.Hotel_link().click();
	    	Thread.sleep(2000);
			
			Loginpage.Hotel_FromDate().click();
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
			Loginpage.Hotel_ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.Hotel_BookingSatus());
			transaction1.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Hotel Search Results : 0".equals(comTrancount))
			{
				AETrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
				System.out.println("TrancationSuccess total:::----0");
				
				AE_TS_Wego =0;
				AE_TS_b2c =0;
				AE_TS_MobIos =0;
				AE_TS_MobAnd =0;
				AE_TS_skyscan =0;
				
				AE_TS_Dhrehlat =0;
				 AE_TS_Aviasa =0;
				 AE_TS_Kayak =0;
			     
				 AE_TS_Dohop =0;
				 AE_TS_Farecompare =0;
				 AE_TS_Shoogloo =0;
				 AE_TS_Google=0;
				 AE_TS_Trivago=0;
			        
				 int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobAnd+AE_TS_MobIos+AE_TS_Google + AE_TS_Trivago+AE_TS_skyscan
			        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
					 AE_TS_Transaction_Total =  TotalValue; 
					System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
					
					int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
			    	
					 AE_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
			    
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
				 
				  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
				  
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	AE_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		AE_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  AE_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   AE_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 AE_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 AE_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 AE_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 AE_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break; 
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 AE_TS_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 AE_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	AE_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			AE_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	AE_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	AE_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 AE_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		AE_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 AE_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 AE_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 AE_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
			
		    	        
		    
		    
		    	        int TotalValue = AE_TS_Wego+ AE_TS_b2c+AE_TS_MobAnd+AE_TS_MobIos +AE_TS_Google + AE_TS_Trivago+AE_TS_skyscan
				        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
						 AE_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
						
						int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
				    	
						 AE_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
				    
		  
			}
			
			//***********************PENDING-PAYMENT**********************************
			Select s=new Select(Loginpage.Hotel_BookingSatus());
			s.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
			String str = count.trim();
			String[] splited = str.split("\\:");
			System.out.println("No of Results Count"+splited[1]);
			Thread.sleep(1000);
			String soldout="SoldOuts";
			
			
			
			if("Hotel Search Results : 0".equals(count))
			{
				//ExcelUtils.lable(2, 2,"No Results are Found");
				
				
				AESoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
				
				AE_SD_Wego =0;
				AE_SD_b2c =0;
				AE_SD_MobIos =0;
				AE_SD_MobAnd =0;
				AE_SD_skyscan =0;
				AE_SD_Dhrehlat =0;
				AE_SD_Aviasa =0;
				AE_SD_Kayak =0;
			    
				AE_SD_Dohop =0;
				AE_SD_Farecompare =0;
				AE_SD_Shoogloo =0;
				AE_SD_Google=0;
				 AE_SD_Trivago=0;
			        
				int TotalValue = AE_SD_Wego + AE_SD_b2c+AE_SD_MobAnd +AE_SD_MobIos+AE_SD_Google+ AE_SD_Trivago+ AE_SD_skyscan
			        +AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
					 AE_SD_SoldOut_Total =  TotalValue; 
					 
					System.out.println("SoldOuts total:::----"+AE_SD_SoldOut_Total);
					
					int Other =AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
			    	
					 AE_SD_Other_SoldOutstotal =  Other; 
						System.out.println(" Others domains SoldOuts total:::----"+AE_SD_Other_SoldOutstotal);
				 
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
				  
				 
				  
				  System.out.println("Total Number of soldOuts:" + WE1.size());
				  Thread.sleep(2000);
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	AE_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		AE_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  AE_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   AE_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 AE_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 AE_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 AE_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 AE_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break; 
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 AE_SD_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 AE_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	AE_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			AE_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	AE_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	AE_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 AE_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		AE_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 AE_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 AE_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 AE_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
		    	       
			
		    	        int TotalValue = AE_SD_Wego + AE_SD_b2c+AE_SD_MobAnd +AE_SD_MobIos +AE_SD_Google+ AE_SD_Trivago+ AE_SD_skyscan
				        +AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
						 AE_SD_SoldOut_Total =  TotalValue; 
						 
						System.out.println("SoldOuts total:::----"+AE_SD_SoldOut_Total);
						
						int Other =AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
				    	
						 AE_SD_Other_SoldOutstotal =  Other; 
							System.out.println(" Others domains SoldOuts total:::----"+AE_SD_Other_SoldOutstotal);
			}
			
			Thread.sleep(2000);
			
			//***********************Cancelled**********************************
					Select Cancelled=new Select(Loginpage.Hotel_BookingSatus());
					Cancelled.selectByIndex(2);
					Thread.sleep(1000);
					Loginpage.Hotel_Search_button().click();
					Thread.sleep(1000);
					
					String Cancelledcount=Loginpage.FlightResults_text().getText();
					System.out.println(Cancelledcount);
					//ExcelUtils.lable(0, 0,count);
					
			    	String strCancelled = Cancelledcount.trim();
			    	String[] Cancelledsplited = strCancelled.split("\\:");
			    	System.out.println("No of Results Count"+Cancelledsplited[1]);
			    	Thread.sleep(1000);
			    	String Cancelled1="Cancelled";
			    	
			    	
			    	
			    	if("Hotel Search Results : 0".equals(Cancelledcount))
			    	{
			    		//ExcelUtils.lable(2, 2,"No Results are Found");
			    		
			    		
			    		AECancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
			    		
			    		AE_CN_Wego =0;
			    		AE_CN_b2c =0;
			    		AE_CN_MobIos =0;
			    		AE_CN_MobAnd =0;
			    		AE_CN_skyscan =0;
			    		AE_CN_Dhrehlat =0;
				    	AE_CN_Aviasa =0;
				    	AE_CN_Kayak =0;
				         
				    	AE_CN_Dohop =0;
				    	AE_CN_Farecompare =0;
				    	AE_CN_Shoogloo =0;
				    	 AE_CN_Google=0;
						 AE_CN_Trivago=0;
					        
				    	int TotalValue = AE_CN_Wego + AE_CN_b2c+AE_CN_MobAnd+AE_CN_MobIos + AE_CN_Google  +  AE_CN_Trivago+  AE_CN_skyscan  
					        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
							 AE_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+AE_CN_CancelledTotal);
							
							int Other = AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
							
							AE_CN_Other_CancelledTotal =  Other; 
			 				System.out.println("Cancelled total:::----"+AE_CN_Other_CancelledTotal);
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
			    		  
			    		 
			    		  
			    		  System.out.println("Total Number of Cancelled:" + WE1.size());
			    		  Thread.sleep(2000);
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO-HOTEL": 
				    	            	if(element.equals("WEGO-HOTEL")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	AE_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		AE_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  AE_CN_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   AE_CN_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 AE_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 AE_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 AE_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "TRIVAGO": 
				    	            	 if(element.equals("TRIVAGO"))
				    		    	       {        
				    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
				    		    	
				    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
						    		    
				    		    	 AE_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "GOOGLE-HOTEL": 
				    	            	 if(element.equals("GOOGLE-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
				    		    	
				    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
						    		    
				    		    	 AE_CN_Google =Integer.parseInt(Com_TS_google1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_Google =Integer.parseInt(Com_TS_google1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "SKYSCN-HOTEL": 
				    	            	 if(element.equals("SKYSCN-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 AE_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	AE_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			AE_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	AE_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	AE_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 AE_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		AE_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 AE_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 AE_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 AE_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
			    	
				    	       
				    	        int TotalValue = AE_CN_Wego + AE_CN_b2c+AE_CN_MobAnd+AE_CN_MobIos + AE_CN_Google  +  AE_CN_Trivago+  AE_CN_skyscan  
						        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
								 AE_CN_CancelledTotal =  TotalValue; 
								System.out.println("Cancelled total:::----"+AE_CN_CancelledTotal);
								
								int Other = AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
								
								AE_CN_Other_CancelledTotal =  Other; 
				 				System.out.println("Cancelled total:::----"+AE_CN_Other_CancelledTotal);
			    	}
					
			    	Thread.sleep(2000);
			
			  //*********************PENDING-VOUCHER*****************************
			    	Select transactionHold=new Select(Loginpage.Hotel_BookingSatus());
			    	transactionHold.selectByIndex(4);
					Thread.sleep(1000);
					Loginpage.Hotel_Search_button().click();
					Thread.sleep(1000);
					
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Hotel Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		AETransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		AE_TH_Wego =0;
			    		AE_TH_b2c =0;
			    		AE_TH_MobIos =0;
			    		AE_TH_MobAnd =0;
			    		AE_TH_skyscan =0;
			    		
			    		AE_TH_Dhrehlat =0;
				    	AE_TH_Aviasa =0;
				    	AE_TH_Kayak =0;
				         
				    	AE_TH_Dohop =0;
				    	AE_TH_Farecompare =0;
				    	AE_TH_Shoogloo =0;
				    	 AE_TH_Google=0;
						 AE_TH_Trivago=0;
					        
				    	int TotalValue =  AE_TH_Wego  +  AE_TH_b2c+AE_TH_MobAnd +AE_TH_MobIos + AE_TH_Google  +  AE_TH_Trivago +  AE_TH_skyscan  
					        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
							 AE_TH_Transactionhold_total =  TotalValue; 
						
							System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
							
							int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
								
								AE_TH_Other_TransactionholdTotal =  Other; 
				 				System.out.println("TransactionHold total:::----"+AE_TH_Other_TransactionholdTotal);
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO-HOTEL": 
				    	            	if(element.equals("WEGO-HOTEL")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	AE_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		AE_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  AE_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   AE_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 AE_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 AE_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 AE_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "TRIVAGO": 
				    	            	 if(element.equals("TRIVAGO"))
				    		    	       {        
				    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
				    		    	
				    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
						    		    
				    		    	 AE_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "GOOGLE-HOTEL": 
				    	            	 if(element.equals("GOOGLE-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
				    		    	
				    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
						    		    
				    		    	 AE_TH_Google =Integer.parseInt(Com_TS_google1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_Google =Integer.parseInt(Com_TS_google1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "SKYSCN-HOTEL": 
				    	            	 if(element.equals("SKYSCN-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 AE_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	AE_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			AE_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	AE_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	AE_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 AE_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		AE_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 AE_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 AE_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 AE_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
			    	
			        
			    	
			        
				    	       
			        
				    	        int TotalValue =  AE_TH_Wego  +  AE_TH_b2c+AE_TH_MobAnd +AE_TH_MobIos  + AE_TH_Google  +  AE_TH_Trivago +  AE_TH_skyscan  
						        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
								 AE_TH_Transactionhold_total =  TotalValue; 
							
								System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
								
								int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
									
									AE_TH_Other_TransactionholdTotal =  Other; 
					 				System.out.println("TransactionHold total:::----"+AE_TH_Other_TransactionholdTotal);
			      
			      
			    	}
			    	
			    	Loginpage.ClickOnUsername().click();
			    	Thread.sleep(1000);
			    	Loginpage.Log_Out().click();
			    	Thread.sleep(2000);
			    	
			    	System.out.println("************************************************************************************");

			
			
		}

		public static void AllStatus_TS_SD_CN_TH_EG(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.EG_link().click();
			driver.get("http://callcenter.rehlat.com.eg/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			Loginpage.Hotel_link().click();
	    	Thread.sleep(2000);
			
			Loginpage.Hotel_FromDate().click();
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
			Loginpage.Hotel_ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[2]);
			Thread.sleep(1000);
			
			
			//******************* Confirmed & Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.Hotel_BookingSatus());
			transaction1.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Hotel Search Results : 0".equals(comTrancount))
			{
				EGTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
				System.out.println("TrancationSuccess total:::----0");
				
				EG_TS_Wego =0;
				EG_TS_b2c =0;
				EG_TS_MobIos =0;
				EG_TS_MobAnd =0;
				EG_TS_skyscan =0;
				EG_TS_Dhrehlat =0;
				EG_TS_Aviasa =0;
				EG_TS_Kayak =0;
			     
				EG_TS_Dohop =0;
				EG_TS_Farecompare =0;
				EG_TS_Shoogloo =0;
				 EG_TS_Google=0;
				 EG_TS_Trivago=0;
			        
				int TotalValue = EG_TS_Wego +EG_TS_b2c+EG_TS_MobAnd +EG_TS_MobIos+ EG_TS_Google  +  EG_TS_Trivago +  EG_TS_skyscan 
			        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
					 EG_TS_Transaction_Total =  TotalValue; 
					System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
					
					int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
			    	
					 EG_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+EG_TS_Other_TrancationSuccessfull);
			   
		    
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
				 
				  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
				  
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	EG_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		EG_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  EG_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   EG_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 EG_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 EG_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 EG_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 EG_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;
		    	            
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 EG_TS_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 EG_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	EG_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			EG_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	EG_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	EG_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 EG_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		EG_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 EG_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 EG_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 EG_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
		    	        
		    
		    
		    
		    	        int TotalValue = EG_TS_Wego +EG_TS_b2c +EG_TS_MobAnd +EG_TS_MobIos+ EG_TS_Google  +  EG_TS_Trivago +  EG_TS_skyscan 
				        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
						 EG_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
						
						int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
				    	
						 EG_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+EG_TS_Other_TrancationSuccessfull);
				   
			    
		  
			}
			
			//***********************PENDING-PAYMENT**********************************
			Select s=new Select(Loginpage.Hotel_BookingSatus());
			s.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Hotel_Search_button().click();
			Thread.sleep(1000);
			
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
			String str = count.trim();
			String[] splited = str.split("\\:");
			System.out.println("No of Results Count"+splited[1]);
			Thread.sleep(1000);
			String soldout="SoldOuts";
			
			
			
			if("Hotel Search Results : 0".equals(count))
			{
				//ExcelUtils.lable(2, 2,"No Results are Found");
				
				
				EGSoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
				
				EG_SD_Wego =0;
				EG_SD_b2c =0;
				EG_SD_MobIos =0;
				EG_SD_MobAnd =0;
				EG_SD_skyscan =0;
				 
				EG_SD_Dhrehlat =0;
				EG_SD_Aviasa =0;
				EG_SD_Kayak =0;
			    
				EG_SD_Dohop =0;
				EG_SD_Farecompare =0;
				EG_SD_Shoogloo =0;
				EG_SD_Google=0;
				EG_SD_Trivago=0;
			        
				int TotalValue =  EG_SD_Wego  +  EG_SD_b2c+EG_SD_MobAnd+EG_SD_MobIos  + EG_SD_Google  +  EG_SD_Trivago +  EG_SD_skyscan 
			        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
					 EG_SD_SoldOut_Total =  TotalValue; 
					System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
					
					int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
			    	
					 EG_SD_Other_SoldOutstotal =  Other; 
						System.out.println(" Others domains SoldOuts total:::----"+EG_SD_Other_SoldOutstotal);
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
				  
				 
				  
				  System.out.println("Total Number of soldOuts:" + WE1.size());
				  Thread.sleep(2000);
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO-HOTEL": 
		    	            	if(element.equals("WEGO-HOTEL")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	EG_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		EG_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  EG_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   EG_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 EG_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 EG_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 EG_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "TRIVAGO": 
		    	            	 if(element.equals("TRIVAGO"))
		    		    	       {        
		    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
		    		    	
		    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
				    		    
		    		    	 EG_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_Trivago =Integer.parseInt(Com_TS_trivago1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "GOOGLE-HOTEL": 
		    	            	 if(element.equals("GOOGLE-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

		    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
		    		    	
		    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
				    		    
		    		    	 EG_SD_Google =Integer.parseInt(Com_TS_google1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_Google =Integer.parseInt(Com_TS_google1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "SKYSCN-HOTEL": 
		    	            	 if(element.equals("SKYSCN-HOTEL"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 EG_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	EG_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			EG_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	EG_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	EG_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 EG_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		EG_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 EG_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 EG_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 EG_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	        
			
		    	        int TotalValue =  EG_SD_Wego  +  EG_SD_b2c +EG_SD_MobAnd+EG_SD_MobIos + EG_SD_Google  +  EG_SD_Trivago +  EG_SD_skyscan 
			        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
					 EG_SD_SoldOut_Total =  TotalValue; 
					System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
					
					int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
			    	
					 EG_SD_Other_SoldOutstotal =  Other; 
						System.out.println(" Others domains SoldOuts total:::----"+EG_SD_Other_SoldOutstotal);
		  
			}
			
			Thread.sleep(2000);
			
			//***********************Cancelled**********************************
					Select Cancelled=new Select(Loginpage.Hotel_BookingSatus());
					Cancelled.selectByIndex(2);
					Thread.sleep(1000);
					Loginpage.Hotel_Search_button().click();
					Thread.sleep(1000);
					
					String Cancelledcount=Loginpage.FlightResults_text().getText();
					System.out.println(Cancelledcount);
					//ExcelUtils.lable(0, 0,count);
					
			    	String strCancelled = Cancelledcount.trim();
			    	String[] Cancelledsplited = strCancelled.split("\\:");
			    	System.out.println("No of Results Count"+Cancelledsplited[1]);
			    	Thread.sleep(1000);
			    	String Cancelled1="Cancelled";
			    	
			    	
			    	
			    	if("Hotel Search Results : 0".equals(Cancelledcount))
			    	{
			    		//ExcelUtils.lable(2, 2,"No Results are Found");
			    		
			    		
			    		EGCancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
			    		
			    		EG_CN_Wego =0;
			    		EG_CN_b2c =0;
			    		EG_CN_MobIos =0;
			    		EG_CN_MobAnd =0;
			    		EG_CN_skyscan =0;
			    		
			    		EG_CN_Dhrehlat =0;
				    	EG_CN_Aviasa =0;
				    	EG_CN_Kayak =0;
				         
				    	EG_CN_Dohop =0;
				    	EG_CN_Farecompare =0;
				    	EG_CN_Shoogloo =0;
				    	EG_CN_Google=0;
						EG_CN_Trivago=0;
					        
				    	int TotalValue =  EG_CN_Wego  +  EG_CN_b2c+EG_CN_MobAnd +EG_CN_MobIos + EG_CN_Google  +  EG_CN_Trivago +  EG_CN_skyscan 
					        + EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
							 EG_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+EG_CN_CancelledTotal);
							
							int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
							
							EG_CN_Other_CancelledTotal =  Other; 
			 				System.out.println(" Other Cancelled total:::----"+EG_CN_Other_CancelledTotal);
			    	
			    		 
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
			    		  
			    		 
			    		  
			    		  System.out.println("Total Number of Cancelled:" + WE1.size());
			    		  Thread.sleep(2000);
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO-HOTEL": 
				    	            	if(element.equals("WEGO-HOTEL")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	EG_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		EG_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  EG_CN_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   EG_CN_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 EG_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 EG_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 EG_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "TRIVAGO": 
				    	            	 if(element.equals("TRIVAGO"))
				    		    	       {        
				    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
				    		    	
				    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
						    		    
				    		    	 EG_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_Trivago =Integer.parseInt(Com_TS_trivago1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;
				    	            case "GOOGLE-HOTEL": 
				    	            	 if(element.equals("GOOGLE-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
				    		    	
				    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
						    		    
				    		    	 EG_CN_Google =Integer.parseInt(Com_TS_google1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_Google =Integer.parseInt(Com_TS_google1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "SKYSCN-HOTEL": 
				    	            	 if(element.equals("SKYSCN-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 EG_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	EG_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			EG_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	EG_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	EG_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 EG_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		EG_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 EG_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 EG_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 EG_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	       
			    	
				    	        int TotalValue =  EG_CN_Wego  +  EG_CN_b2c+EG_CN_MobAnd +EG_CN_MobIos  + EG_CN_Google  +  EG_CN_Trivago +  EG_CN_skyscan 
						        + EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
								 EG_CN_CancelledTotal =  TotalValue; 
								System.out.println("Cancelled total:::----"+EG_CN_CancelledTotal);
								
								int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
								
								EG_CN_Other_CancelledTotal =  Other; 
				 				System.out.println(" Other Cancelled total:::----"+EG_CN_Other_CancelledTotal);
			        
			      
			    	}
					
			    	Thread.sleep(2000);
			
			    	//*********************PENDING-VOUCHER*****************************
			    	Select transactionHold=new Select(Loginpage.Hotel_BookingSatus());
			    	transactionHold.selectByIndex(4);
					Thread.sleep(1000);
					Loginpage.Hotel_Search_button().click();
					Thread.sleep(1000);
					
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Hotel Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		EGTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		EG_TH_Wego =0;
			    		EG_TH_b2c =0;
			    		EG_TH_MobIos =0;
			    		EG_TH_MobAnd =0;
			    		EG_TH_skyscan =0;
			    		EG_TH_Dhrehlat =0;
				    	EG_TH_Aviasa =0;
				    	EG_TH_Kayak =0;
				         
				    	EG_TH_Dohop =0;
				    	EG_TH_Farecompare =0;
				    	EG_TH_Shoogloo =0;
				    	 EG_TH_Google=0;
					    EG_TH_Trivago=0;
					        
				    	int TotalValue =  EG_TH_Wego  +  EG_TH_b2c+EG_TH_MobAnd +EG_TH_MobIos + EG_TH_Google  +  EG_TH_Trivago +  EG_TH_skyscan 
					        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
							 EG_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
							
							int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
							
							EG_TH_Other_TransactionHoldTotal =  Other; 
			 				System.out.println(" Other TransactionHold total:::----"+EG_TH_Other_TransactionHoldTotal);
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO-HOTEL": 
				    	            	if(element.equals("WEGO-HOTEL")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='WEGO-HOTEL']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	EG_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		EG_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  EG_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   EG_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 EG_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 EG_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 EG_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "TRIVAGO": 
				    	            	 if(element.equals("TRIVAGO"))
				    		    	       {        
				    		    	List<WebElement> TRIVAGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='TRIVAGO']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + TRIVAGO.size());
				    		    	
				    		    	 String Com_TS_trivago1 =String.format("%1s",TRIVAGO.size());   		    	
						    		    
				    		    	 EG_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_trivago1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_Trivago =Integer.parseInt(Com_TS_trivago1);
					    	            	}
				    		    	     
				    		    	       
				    	            break; 
				    	            case "GOOGLE-HOTEL": 
				    	            	 if(element.equals("GOOGLE-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> Google=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='GOOGLE-HOTEL']"));

				    		    	System.out.println("No of TRIVAGO Trancation Successfull:" + Google.size());
				    		    	
				    		    	 String Com_TS_google1 =String.format("%1s",Google.size());   		    	
						    		    
				    		    	 EG_TH_Google =Integer.parseInt(Com_TS_google1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_google1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_Google =Integer.parseInt(Com_TS_google1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "SKYSCN-HOTEL": 
				    	            	 if(element.equals("SKYSCN-HOTEL"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SKYSCN-HOTEL']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 EG_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	EG_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			EG_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	EG_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	EG_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 EG_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		EG_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 EG_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 EG_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[8][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 EG_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
			    	
			        
			    	
				    	       
			        
			        
			    	int TotalValue =  EG_TH_Wego  +  EG_TH_b2c +EG_TH_MobAnd +EG_TH_MobIos + EG_TH_Google  +  EG_TH_Trivago +  EG_TH_skyscan 
					        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
							 
			    	EG_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
							
							int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
							
							EG_TH_Other_TransactionHoldTotal =  Other; 
			 				System.out.println(" Other TransactionHold total:::----"+EG_TH_Other_TransactionHoldTotal);
			      
			    	}
			    	
			    	Loginpage.ClickOnUsername().click();
			    	Thread.sleep(1000);
			    	Loginpage.Log_Out().click();
			    	Thread.sleep(2000);
			    	
			System.out.println("************************************************************************************");

			
			
		}
		
		
	      
	    	
	
		
		 static ArrayList<String> removeDuplicates(ArrayList<String> list) {

		        // Store unique items in result.
		        ArrayList<String> result = new ArrayList<>();

		        // Record encountered Strings in HashSet.
		        HashSet<String> set = new HashSet<>();

		        // Loop over argument list.
		        for (String item : list) {

		            // If String is not in set, add it to the list and the set.
		            if (!set.contains(item)) {
		                result.add(item);
		                set.add(item);
		            }
		        }
		        return result;
		    }

}
