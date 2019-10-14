package AppModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import java.util.List;




import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;


import pageobjects.Loginpage;

public class NoBookings_All {
	
		
	static String COMDomainNames;
	
	static String COMRepricing;
	
	static String COMTrancationSuccess;
	
	

	static String SADomainNames;
	
	static String SARepricing;
	
	static String SATrancationSuccess;
	
	
	static String AEDomainNames;
	
	static String AERepricing;
	
	static String AETrancationSuccess;

	
	
	
	
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
	
	static int Com_CP_Wego;
	static int Com_CP_b2c;
	static int Com_CP_MobIos;
	static int Com_CP_MobAnd;
	static int Com_CP_skyscan ;
	static int  Com_CP_Dhrehlat;
	static int Com_CP_Aviasa;
	static int Com_CP_Kayak;
	static int Com_CP_Dohop;
	static int Com_CP_Farecompare;
	static int Com_CP_Shoogloo;
	
	
	static int Com_RP_Wego; 
	static int Com_RP_b2c ;
	static int Com_RP_MobIos; 
	static int Com_RP_MobAnd ;
	static int Com_RP_skyscan ;
	static int  Com_RP_Dhrehlat ;
	static int Com_RP_Aviasa;
	static int Com_RP_Kayak;
	static int Com_RP_Dohop;
	static int Com_RP_Farecompare;
	static int Com_RP_Shoogloo;
	
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
		
		static int SA_CP_Wego;
		static int SA_CP_b2c ;
		static int SA_CP_MobIos; 
		static int SA_CP_MobAnd;
		static int SA_CP_skyscan ;
		static int  SA_CP_Dhrehlat ;
		static int SA_CP_Aviasa;
		static int SA_CP_Kayak;
		static int SA_CP_Dohop;
		static int SA_CP_Farecompare;
		static int SA_CP_Shoogloo;
		
		static int SA_RP_Wego ;
		static int SA_RP_b2c;
		static int SA_RP_MobIos; 
		static int SA_RP_MobAnd ;
		static int SA_RP_skyscan ;
		static int  SA_RP_Dhrehlat ;
		static int SA_RP_Aviasa;
		static int SA_RP_Kayak;
		static int SA_RP_Dohop;
		static int SA_RP_Farecompare;
		static int SA_RP_Shoogloo;
		
		
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
		
		static int AE_CP_Wego;
		static int AE_CP_b2c ;
		static int AE_CP_MobIos; 
		static int AE_CP_MobAnd;
		static int AE_CP_skyscan ;
		static int AE_CP_Dhrehlat ;
		static int AE_CP_Aviasa;
		static int AE_CP_Kayak;
		static int AE_CP_Dohop;
		static int AE_CP_Farecompare;
		static int AE_CP_Shoogloo;
		
		static int AE_RP_Wego ;
		static int AE_RP_b2c;
		static int AE_RP_MobIos; 
		static int AE_RP_MobAnd ;
		static int AE_RP_skyscan ;
		static int AE_RP_Dhrehlat ;
		static int AE_RP_Aviasa;
		static int AE_RP_Kayak;
		static int AE_RP_Dohop;
		static int AE_RP_Farecompare;
		static int AE_RP_Shoogloo;
		
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
		
		
		
	
			static int Com_TS_Transaction_Total;
			static int Com_TS_Other_TrancationSuccessfull;
				
				
			static int Com_RP_Repricing_Total;
			static int Com_RP_Other_Repricingtotal;
		
			


			static int SA_TS_Transaction_Total;
			static int SA_TS_Other_TrancationSuccessfull;
			
			static int SA_RP_Repricing_Total;
			static int SA_RP_Other_Repricingtotal;
			

			static int AE_TS_Transaction_Total;
			static int AE_TS_Other_TrancationSuccessfull;
			
			static int AE_RP_Repricing_Total;
			static int AE_RP_Other_Repricingtotal;
			

		
public static void AllStatus_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
			
			COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			
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
			
			
			//******************* Transaction Successfull*********************************************
	    	Select transaction1=new Select(Loginpage.BookingSatus());
	    	transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
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
	 	         
		         int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobIos +Com_TS_skyscan+Com_TS_MobAnd
		 		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
		 				  
		 		        Com_TS_Transaction_Total = TotalValue; 
		 				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
		 				
		 				int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
		 		 	    	
		 				 Com_TS_Other_TrancationSuccessfull = Other; 
		 					System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
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
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

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
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

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
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

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
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

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
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

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
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

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
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

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
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

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
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

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
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

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
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

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
		        
		        int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobIos +Com_TS_skyscan+Com_TS_MobAnd
		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
				  
		        Com_TS_Transaction_Total = TotalValue; 
				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
				
				 int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
		 	    	
				 Com_TS_Other_TrancationSuccessfull =Other; 
					System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}
	    	      
	    
	    	
	    	
	//Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
	    	
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMRepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		 Com_RP_Wego =0;
		         Com_RP_b2c =0;
		         Com_RP_MobIos =0;
		         Com_RP_MobAnd =0;
		         Com_RP_skyscan =0;
		         
		         Com_RP_Dhrehlat =0;
		         Com_RP_Aviasa =0;
		         Com_RP_Kayak =0;
		         
		         Com_RP_Dohop =0;
		         Com_RP_Farecompare =0;
		         Com_RP_Shoogloo =0;
	    		 
		         
		         int TotalValue = Com_RP_Wego+ Com_RP_b2c+Com_RP_MobIos + Com_RP_MobAnd+Com_RP_skyscan
			        +Com_RP_Dhrehlat+ Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
			       
			        
			        
			        Com_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+Com_RP_Repricing_Total);
					
					
					int Other =Com_RP_Dhrehlat +Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
			 	    	
					 Com_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+Com_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
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
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = Com_RP_Wego+ Com_RP_b2c+Com_RP_MobIos + Com_RP_MobAnd+Com_RP_skyscan
		    			        +Com_RP_Dhrehlat+ Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
		    			       
		    			        
		    			        
		    			        Com_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+Com_RP_Repricing_Total);
		    					
		    					
		    					int Other =Com_RP_Dhrehlat +Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
		    			 	    	
		    					 Com_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+Com_RP_Other_Repricingtotal);
	    	
				
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
		
	    	
	    	
	    	
	    
	    	

	    	
	
}

public static void AllStatus_TS_SD_CN_TH_SA(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
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
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Flight Search Results : 0".equals(comTrancount))
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
			         
				     int TotalValue = SA_TS_Wego + SA_TS_b2c +SA_TS_MobIos + SA_TS_MobAnd+ SA_TS_skyscan
				        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
						 SA_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
					
						int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
			 	    	
					 SA_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				 
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
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

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
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

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
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

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
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

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
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

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
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

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
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

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
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

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
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

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
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

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
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

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
		    	  
		    	       
			
		    
		    
		    
		    	        int TotalValue = SA_TS_Wego + SA_TS_b2c +SA_TS_MobIos + SA_TS_MobAnd+ SA_TS_skyscan
				        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
						 SA_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
					
						int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
			 	    	
					 SA_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
		      
		  
		  
			}
			
			
			
			
  //Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
	    	
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		SARepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		SA_RP_Wego =0;
	    		SA_RP_b2c =0;
	    		SA_RP_MobIos =0;
	    		SA_RP_MobAnd =0;
	    		SA_RP_skyscan =0;
		         
	    		SA_RP_Dhrehlat =0;
	    		SA_RP_Aviasa =0;
	    		SA_RP_Kayak =0;
		         
	    		SA_RP_Dohop =0;
	    		SA_RP_Farecompare =0;
	    		SA_RP_Shoogloo =0;
	    		 
		         
		         int TotalValue = SA_RP_Wego+ SA_RP_b2c+SA_RP_MobIos + SA_RP_MobAnd+SA_RP_skyscan
			        +SA_RP_Dhrehlat+ SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
			       
			        
			        
		         SA_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+SA_RP_Repricing_Total);
					
					
					int Other =SA_RP_Dhrehlat +SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
			 	    	
					SA_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+SA_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
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
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Repricing:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 SA_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		SA_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Repricing:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  SA_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   SA_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 SA_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 SA_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 SA_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 SA_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	SA_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			SA_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	SA_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Repricing:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	SA_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Repricing:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 SA_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		SA_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 SA_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 SA_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 SA_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = SA_RP_Wego+ SA_RP_b2c+SA_RP_MobIos + SA_RP_MobAnd+SA_RP_skyscan
		    			        +SA_RP_Dhrehlat+ SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
		    			       
		    			        
		    			        
		    		         SA_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+SA_RP_Repricing_Total);
		    					
		    					
		    					int Other =SA_RP_Dhrehlat +SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
		    			 	    	
		    					SA_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+SA_RP_Other_Repricingtotal);
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
			
			
		}

public static void AllStatus_TS_SD_CN_TH_AE(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
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
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Flight Search Results : 0".equals(comTrancount))
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
			        
				 int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobIos + AE_TS_MobAnd+AE_TS_skyscan
			        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
					 AE_TS_Transaction_Total =  TotalValue; 
					System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
					
					int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
			    	
					 AE_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
			    
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				 
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
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

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
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

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
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

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
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

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
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

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
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

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
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

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
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

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
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

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
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

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
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

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
		    	  
			
			
		    
		    
		    
		    	        int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobIos + AE_TS_MobAnd+AE_TS_skyscan
				        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
						 AE_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
						
						int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
				    	
						 AE_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
				    
		  
			}
			
			
 //Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
	    	
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		AERepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		AE_RP_Wego =0;
	    		AE_RP_b2c =0;
	    		AE_RP_MobIos =0;
	    		AE_RP_MobAnd =0;
	    		AE_RP_skyscan =0;
		         
	    		AE_RP_Dhrehlat =0;
	    		AE_RP_Aviasa =0;
	    		AE_RP_Kayak =0;
		         
	    		AE_RP_Dohop =0;
	    		AE_RP_Farecompare =0;
	    		AE_RP_Shoogloo =0;
	    		 
		         
		         int TotalValue = AE_RP_Wego+ AE_RP_b2c+AE_RP_MobIos + AE_RP_MobAnd+AE_RP_skyscan
			        +AE_RP_Dhrehlat+ AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
			       
			        
			        
		         AE_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+AE_RP_Repricing_Total);
					
					
					int Other =AE_RP_Dhrehlat +AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
			 	    	
					AE_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+AE_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
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
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Repricing:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 AE_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		AE_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Repricing:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  AE_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   AE_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 AE_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 AE_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 AE_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 AE_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	AE_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			AE_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	AE_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Repricing:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	AE_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Repricing:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 AE_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		AE_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 AE_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 AE_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 AE_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = AE_RP_Wego+ AE_RP_b2c+AE_RP_MobIos + AE_RP_MobAnd+AE_RP_skyscan
		    			        +AE_RP_Dhrehlat+ AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
		    			       
		    			        
		    			        
		    		         AE_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+AE_RP_Repricing_Total);
		    					
		    					
		    					int Other =AE_RP_Dhrehlat +AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
		    			 	    	
		    					AE_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+AE_RP_Other_Repricingtotal);
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
			
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
			
			
			
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
