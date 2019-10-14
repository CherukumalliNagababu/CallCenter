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

public class Supplier_Flight_dummy {
	//COM Suppliers
		static int Com_TS_Supplier_Transaction_Total;
		static int Com_TS_G_3R1;
		static int Com_TS_G_570E;
		static int Com_TS_G_5N61;
		static int Com_TS_G_7FK5;
		static int Com_TS_G_7JY2 ;
		static int  Com_TS_G_7X7W;
		static int Com_TS_G_802N;
		static int Com_TS_G_802R;
		static int Com_TS_G_8SQ7;
		static int Com_TS_JAZEERA;
		static int Com_TS_KIWI;
		static int Com_TS_M_u;
		static int Com_TS_My_Fly;
		static int Com_TS_NESMA;
		static int Com_TS_PEGASUS;
		static int Com_TS_S_9JFH ;
		static int  Com_TS_S_ID2I;
		static int Com_TS_S_L8YI;
		static int Com_TS_S_L9AI;
		static int Com_TS_S_L9CI;
		static int Com_TS_S_T13I;
		static int Com_TS_S_T20I;
		static int Com_TS_SALAM;
		static int Com_TS_S_Jet;
		static int Com_TS_U_3R1G;
		static int Com_TS_U_570E;
		static int Com_TS_U_5N61 ;
		static int  Com_TS_U_6E;
		static int Com_TS_U_7FK5;
		static int Com_TS_U_7JY2;
		static int Com_TS_U_802N;
		static int Com_TS_U_802R;
		static int Com_TS_U_8SQ7;
		static int Com_TS_WATANIYA;
		static int Com_TS_A_AR;
		static int Com_TS_A_AR_E;
		static int Com_TS_A_AR_M;
		static int Com_TS_A_I_E;
		static int  Com_TS_FlyDubai;
		static int Com_TS_Flynas;
		
		//AE Suppliers
				static int AE_TS_Supplier_Transaction_Total;
				static int AE_TS_G_3R1;
				static int AE_TS_G_570E;
				static int AE_TS_G_5N61;
				static int AE_TS_G_7FK5;
				static int AE_TS_G_7JY2 ;
				static int  AE_TS_G_7X7W;
				static int AE_TS_G_802N;
				static int AE_TS_G_802R;
				static int AE_TS_G_8SQ7;
				static int AE_TS_JAZEERA;
				static int AE_TS_KIWI;
				static int AE_TS_M_u;
				static int AE_TS_My_Fly;
				static int AE_TS_NESMA;
				static int AE_TS_PEGASUS;
				static int AE_TS_S_9JFH ;
				static int  AE_TS_S_ID2I;
				static int AE_TS_S_L8YI;
				static int AE_TS_S_L9AI;
				static int AE_TS_S_L9CI;
				static int AE_TS_S_T13I;
				static int AE_TS_S_T20I;
				static int AE_TS_SALAM;
				static int AE_TS_S_Jet;
				static int AE_TS_U_3R1G;
				static int AE_TS_U_570E;
				static int AE_TS_U_5N61 ;
				static int  AE_TS_U_6E;
				static int AE_TS_U_7FK5;
				static int AE_TS_U_7JY2;
				static int AE_TS_U_802N;
				static int AE_TS_U_802R;
				static int AE_TS_U_8SQ7;
				static int AE_TS_WATANIYA;
				static int AE_TS_A_AR;
				static int AE_TS_A_AR_E;
				static int AE_TS_A_AR_M;
				static int AE_TS_A_I_E;
				static int  AE_TS_FlyDubai;
				static int AE_TS_Flynas;
				//SA Suppliers
				static int SA_TS_Supplier_Transaction_Total;
				static int SA_TS_G_3R1;
				static int SA_TS_G_570E;
				static int SA_TS_G_5N61;
				static int SA_TS_G_7FK5;
				static int SA_TS_G_7JY2 ;
				static int  SA_TS_G_7X7W;
				static int SA_TS_G_802N;
				static int SA_TS_G_802R;
				static int SA_TS_G_8SQ7;
				static int SA_TS_JAZEERA;
				static int SA_TS_KIWI;
				static int SA_TS_M_u;
				static int SA_TS_My_Fly;
				static int SA_TS_NESMA;
				static int SA_TS_PEGASUS;
				static int SA_TS_S_9JFH ;
				static int  SA_TS_S_ID2I;
				static int SA_TS_S_L8YI;
				static int SA_TS_S_L9AI;
				static int SA_TS_S_L9CI;
				static int SA_TS_S_T13I;
				static int SA_TS_S_T20I;
				static int SA_TS_SALAM;
				static int SA_TS_S_Jet;
				static int SA_TS_U_3R1G;
				static int SA_TS_U_570E;
				static int SA_TS_U_5N61 ;
				static int  SA_TS_U_6E;
				static int SA_TS_U_7FK5;
				static int SA_TS_U_7JY2;
				static int SA_TS_U_802N;
				static int SA_TS_U_802R;
				static int SA_TS_U_8SQ7;
				static int SA_TS_WATANIYA;
				static int SA_TS_A_AR;
				static int SA_TS_A_AR_E;
				static int SA_TS_A_AR_M;
				static int SA_TS_A_I_E;
				static int  SA_TS_FlyDubai;
				static int SA_TS_Flynas;
				
				
				//EG Suppliers
				static int EG_TS_Supplier_Transaction_Total;
				static int EG_TS_G_3R1;
				static int EG_TS_G_570E;
				static int EG_TS_G_5N61;
				static int EG_TS_G_7FK5;
				static int EG_TS_G_7JY2 ;
				static int  EG_TS_G_7X7W;
				static int EG_TS_G_802N;
				static int EG_TS_G_802R;
				static int EG_TS_G_8SQ7;
				static int EG_TS_JAZEERA;
				static int EG_TS_KIWI;
				static int EG_TS_M_u;
				static int EG_TS_My_Fly;
				static int EG_TS_NESMA;
				static int EG_TS_PEGASUS;
				static int EG_TS_S_9JFH ;
				static int  EG_TS_S_ID2I;
				static int EG_TS_S_L8YI;
				static int EG_TS_S_L9AI;
				static int EG_TS_S_L9CI;
				static int EG_TS_S_T13I;
				static int EG_TS_S_T20I;
				static int EG_TS_SALAM;
				static int EG_TS_S_Jet;
				static int EG_TS_U_3R1G;
				static int EG_TS_U_570E;
				static int EG_TS_U_5N61 ;
				static int  EG_TS_U_6E;
				static int EG_TS_U_7FK5;
				static int EG_TS_U_7JY2;
				static int EG_TS_U_802N;
				static int EG_TS_U_802R;
				static int EG_TS_U_8SQ7;
				static int EG_TS_WATANIYA;
				static int EG_TS_A_AR;
				static int EG_TS_A_AR_E;
				static int EG_TS_A_AR_M;
				static int EG_TS_A_I_E;
				static int  EG_TS_FlyDubai;
				static int EG_TS_Flynas;
				
	
	public static void AllStatus_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		
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
		
		
		//*******************Supplier  Transaction Successfull*********************************************
    	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
    	Supplier_transaction1.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		
		long timeoutInSeconds = 85;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
		String com_S_Trancount=Loginpage.FlightResults_text().getText();
		System.out.println(com_S_Trancount);
		
		
    	String com_s_transtr = com_S_Trancount.trim();
    	String[] com_s_transplited = com_s_transtr.split("\\:");
    	System.out.println("No of Results Count"+com_s_transplited[1]);
    	Thread.sleep(1000);
    	String tran1="Transaction Successful";
    	
    	if("Flight Search Results : 0".equals(com_S_Trancount))
    	{
    		
    		System.out.println("Supplier TrancationSuccess total:::----0");
    		
    		Com_TS_G_3R1=0;
    		Com_TS_G_570E=0;
    		Com_TS_G_5N61=0;
    		Com_TS_G_7FK5=0;
    		Com_TS_G_7JY2=0;
    		Com_TS_G_7X7W=0;
    		Com_TS_G_802N=0;
    		Com_TS_G_802R=0;
    		Com_TS_G_8SQ7=0;
    		Com_TS_JAZEERA=0;
    		Com_TS_KIWI=0;
    		Com_TS_M_u=0;
    		Com_TS_My_Fly=0;
    		Com_TS_NESMA=0;
    		Com_TS_PEGASUS=0;
    		Com_TS_S_9JFH=0;
    		Com_TS_S_ID2I=0;
    		Com_TS_S_L8YI=0;
    		Com_TS_S_L9AI=0;
    		Com_TS_S_L9CI=0;
    		Com_TS_S_T13I=0;
    		Com_TS_S_T20I=0;
    		Com_TS_SALAM=0;
    		Com_TS_S_Jet=0;
    		Com_TS_U_3R1G=0;
    		Com_TS_U_570E=0;
    		Com_TS_U_5N61=0;
    		Com_TS_U_6E=0;
    		Com_TS_U_7FK5=0;
    		Com_TS_U_7JY2=0;
    		Com_TS_U_802N=0;
    		Com_TS_U_802R=0;
    		Com_TS_U_8SQ7=0;
    		Com_TS_WATANIYA=0;
    		Com_TS_A_AR=0;
    		Com_TS_A_AR_E=0;
    		Com_TS_A_AR_M=0;
    		Com_TS_A_I_E=0;
    		Com_TS_FlyDubai=0;
    		Com_TS_Flynas=0;
 	         
    		
    		
	         int TotalValue =0;
	 		        Com_TS_Supplier_Transaction_Total = TotalValue; 
	 				 System.out.println("Supplier Trancation Successfull total:::----"+Com_TS_Supplier_Transaction_Total);
	 				
	 				
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
    		 
    		  System.out.println("Total Number of Supplier:" + TS.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : TS)
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
    	            case "Galileo-3R1G": 
    	            	if(element.equals("Galileo-3R1G")) 
    		    	       {
    		    	        
    		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

    		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
    		    	String Com_TS_G_3R11 =String.format("%1s",G_3R1.size());
    		    	
    		    	
    		    	 Com_TS_G_3R1 =Integer.parseInt(Com_TS_G_3R11);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_G_3R11 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Com_TS_G_3R1 =Integer.parseInt(Com_TS_G_3R11);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "Galileo-570E": 
    	            	   
    		    	       if(element.equals("Galileo-570E"))
    		    	       {
    		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

    		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
    		    	  String Com_TS_G_570E1 =String.format("%1s",G_570E.size());
    		    	  
	    		    	
	    		    	
    		    	  Com_TS_G_570E =Integer.parseInt(Com_TS_G_570E1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_G_570E1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Com_TS_G_570E =Integer.parseInt(Com_TS_G_570E1);
	    	            	}
    		    	      
    	            break;  
    	            case "Galileo-5N61": 
    	            	 if(element.equals("Galileo-5N61"))
    		    	       {   
    		    	       
    		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

    		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
    		    	
    		    	
    		    	 String Com_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
    		    	 Com_TS_G_5N61 =Integer.parseInt(Com_TS_G_5N611);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_G_5N611 =String.format("%1s",0);   		    	
    			    		    
    	            		 Com_TS_G_5N61 =Integer.parseInt(Com_TS_G_5N611);
	    	            	}
    	            break; 
    	            case "Galileo-7FK5": 
    	            	 if(element.equals("Galileo-7FK5"))
    		    	       {   
    		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

    		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
    		    	 
    		    	 String Com_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
    		    	 Com_TS_G_7FK5 =Integer.parseInt(Com_TS_G_7FK51);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_G_7FK51 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_G_7FK5 =Integer.parseInt(Com_TS_G_7FK51);
	    	            	}
    		    	      
    	            break; 
    	            case "Galileo-7JY2": 
    	            	 if(element.equals("Galileo-7JY2"))
    		    	       {        
    		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

    		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
    		    	
    		    	 String Com_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
    		    	 Com_TS_G_7JY2 =Integer.parseInt(Com_TS_G_7JY21);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_G_7JY21 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_G_7JY2 =Integer.parseInt(Com_TS_G_7JY21);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "Galileo-7X7W": 
    	            	  if(element.equals("Galileo-7X7W"))
    		    	       {   
    		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

    		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
    		    	
    		    	
    		    	String Com_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
    		    	Com_TS_G_7X7W =Integer.parseInt(Com_TS_G_7X7W1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_G_7X7W1 =String.format("%1s",0);   		    	
    			    		    
    	            			Com_TS_G_7X7W =Integer.parseInt(Com_TS_G_7X7W1);
	    	            	}
    	            break; 
    	            case "Galileo-802N": 
    	            	  if(element.equals("Galileo-802N"))
    		    	       {        
    		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

    		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
    		    	
    		    	
    		    	String Com_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
    		    	Com_TS_G_802N =Integer.parseInt(Com_TS_G_802N1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_G_802N1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Com_TS_G_802N =Integer.parseInt(Com_TS_G_802N1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "Galileo-802R": 
    	            	  if(element.equals("Galileo-802R"))
    		    	       {   
    		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

    		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
    		    	
    		    	String Com_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
    		    	Com_TS_G_802R =Integer.parseInt(Com_TS_G_802R1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_G_802R1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Com_TS_G_802R =Integer.parseInt(Com_TS_G_802R1);
	    	            	}
    		    	       
    	            break; 
    	            case "Galileo-8SQ7": 
    	            	if(element.equals("Galileo-8SQ7"))
    		    	       {  
    		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

    		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
    		    	 
    		    	 String Com_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
    		    	 Com_TS_G_8SQ7 =Integer.parseInt(Com_TS_G_8SQ71);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
    	            		Com_TS_G_8SQ7 =Integer.parseInt(Com_TS_G_8SQ71);
    	            	}
    		    	     
    	            break;
    	            case "JAZEERA": 
    	            	
    	            	  if(element.equals("JAZEERA"))
    		    	       {  
    		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

    		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
    		    	 
    		    	 String Com_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
    		    	 Com_TS_JAZEERA =Integer.parseInt(Com_TS_JAZEERA1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_JAZEERA1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Com_TS_JAZEERA =Integer.parseInt(Com_TS_JAZEERA1);
	    	            	}
    		    	      
    	            break; 
    	            case "KIWI": 
    	            	 if(element.equals("KIWI"))
    		    	       {     
    		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

    		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
    		    	
    		    	 
    		    	 String Com_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
    		    	 Com_TS_KIWI =Integer.parseInt(Com_TS_KIWI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_KIWI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_KIWI =Integer.parseInt(Com_TS_KIWI1);
	    	            	}
    	            break;
    	            case "Manual": 
    	            	 if(element.equals("Manual"))
    		    	       {     
    		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

    		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
    		    	
    		    	 
    		    	 String Com_TS_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
    		    	 Com_TS_M_u =Integer.parseInt(Com_TS_M_u1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_M_u1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_M_u =Integer.parseInt(Com_TS_M_u1);
	    	            	}
    	            break;
    	            case "MystiFly": 
    	            	 if(element.equals("MystiFly"))
    		    	       {     
    		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

    		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
    		    	
    		    	 
    		    	 String Com_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
    		    	 Com_TS_My_Fly =Integer.parseInt(Com_TS_My_Fly1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_My_Fly1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_My_Fly =Integer.parseInt(Com_TS_My_Fly1);
	    	            	}
    	            break;
    	            case "NESMA": 
    	            	 if(element.equals("NESMA"))
    		    	       {     
    		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

    		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
    		    	
    		    	 
    		    	 String Com_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
    		    	 Com_TS_NESMA =Integer.parseInt(Com_TS_NESMA1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_NESMA1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_NESMA =Integer.parseInt(Com_TS_NESMA1);
	    	            	}
    	            break;
    	            case "PEGASUS": 
    	            	 if(element.equals("PEGASUS"))
    		    	       {     
    		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

    		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
    		    	
    		    	 
    		    	 String Com_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
    		    	 Com_TS_PEGASUS =Integer.parseInt(Com_TS_PEGASUS1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_PEGASUS1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_PEGASUS =Integer.parseInt(Com_TS_PEGASUS1);
	    	            	}
    	            break;
    	            case "SABRE-9JFH": 
    	            	 if(element.equals("SABRE-9JFH"))
    		    	       {     
    		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

    		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
    		    	
    		    	 
    		    	 String Com_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
    		    	 Com_TS_S_9JFH =Integer.parseInt(Com_TS_S_9JFH1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_9JFH1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_9JFH =Integer.parseInt(Com_TS_S_9JFH1);
	    	            	}
    	            break;
    	            case "SABRE-ID2I": 
    	            	 if(element.equals("SABRE-ID2I"))
    		    	       {     
    		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

    		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
    		    	
    		    	 
    		    	 String Com_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
    		    	 Com_TS_S_ID2I =Integer.parseInt(Com_TS_S_ID2I1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_ID2I1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_ID2I =Integer.parseInt(Com_TS_S_ID2I1);
	    	            	}
    	            break;
    	            case "SABRE-L8YI": 
    	            	 if(element.equals("SABRE-L8YI"))
    		    	       {     
    		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

    		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
    		    	
    		    	 
    		    	 String Com_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
    		    	 Com_TS_S_L8YI =Integer.parseInt(Com_TS_S_L8YI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_L8YI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_L8YI =Integer.parseInt(Com_TS_S_L8YI1);
	    	            	}
    	            break;
    	            case "SABRE-L9AI": 
    	            	 if(element.equals("SABRE-L9AI"))
    		    	       {     
    		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

    		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
    		    	
    		    	 
    		    	 String Com_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
    		    	 Com_TS_S_L9AI =Integer.parseInt(Com_TS_S_L9AI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_L9AI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_L9AI =Integer.parseInt(Com_TS_S_L9AI1);
	    	            	}
    	            break;
    	            case "SABRE-L9CI": 
    	            	 if(element.equals("SABRE-L9CI"))
    		    	       {     
    		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

    		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
    		    	
    		    	 
    		    	 String Com_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
    		    	 Com_TS_S_L9CI =Integer.parseInt(Com_TS_S_L9CI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_L9CI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_L9CI =Integer.parseInt(Com_TS_S_L9CI1);
	    	            	}
    	            break;
    	            case "SABRE-T13I": 
    	            	 if(element.equals("SABRE-T13I"))
    		    	       {     
    		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

    		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
    		    	
    		    	 
    		    	 String Com_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
    		    	 Com_TS_S_T13I =Integer.parseInt(Com_TS_S_T13I1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_T13I1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_T13I =Integer.parseInt(Com_TS_S_T13I1);
	    	            	}
    	            break;
    	            case "SABRE-T20I": 
    	            	 if(element.equals("SABRE-T20I"))
    		    	       {     
    		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

    		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
    		    	
    		    	 
    		    	 String Com_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
    		    	 Com_TS_S_T20I =Integer.parseInt(Com_TS_S_T20I1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_T20I1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_T20I =Integer.parseInt(Com_TS_S_T20I1);
	    	            	}
    	            break;
    	            case "SALAM": 
    	            	 if(element.equals("SALAM"))
    		    	       {     
    		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

    		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
    		    	
    		    	 
    		    	 String Com_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
    		    	 Com_TS_SALAM =Integer.parseInt(Com_TS_SALAM1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_SALAM1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_SALAM =Integer.parseInt(Com_TS_SALAM1);
	    	            	}
    	            break;
    	            case "SpiceJet": 
    	            	 if(element.equals("SpiceJet"))
    		    	       {     
    		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

    		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
    		    	
    		    	 
    		    	 String Com_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
    		    	 Com_TS_S_Jet =Integer.parseInt(Com_TS_S_Jet1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_S_Jet1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_S_Jet =Integer.parseInt(Com_TS_S_Jet1);
	    	            	}
    	            break;
    	            case "UAPI-3R1G": 
    	            	 if(element.equals("UAPI-3R1G"))
    		    	       {     
    		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

    		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
    		    	
    		    	 
    		    	 String Com_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
    		    	 Com_TS_U_3R1G =Integer.parseInt(Com_TS_U_3R1G1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_3R1G1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_3R1G =Integer.parseInt(Com_TS_U_3R1G1);
	    	            	}
    	            break;
    	            case "UAPI-570E": 
    	            	 if(element.equals("UAPI-570E"))
    		    	       {     
    		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

    		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
    		    	
    		    	 
    		    	 String Com_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
    		    	 Com_TS_U_570E =Integer.parseInt(Com_TS_U_570E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_570E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_570E =Integer.parseInt(Com_TS_U_570E1);
	    	            	}
    	            break;
    	            case "UAPI-5N61": 
    	            	 if(element.equals("UAPI-5N61"))
    		    	       {     
    		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

    		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
    		    	
    		    	 
    		    	 String Com_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
    		    	 Com_TS_U_5N61 =Integer.parseInt(Com_TS_U_5N611);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_5N611 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_5N61 =Integer.parseInt(Com_TS_U_5N611);
	    	            	}
    	            break;
    	            case "UAPI-6E": 
    	            	 if(element.equals("UAPI-6E"))
    		    	       {     
    		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

    		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
    		    	
    		    	 
    		    	 String Com_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
    		    	 Com_TS_U_6E =Integer.parseInt(Com_TS_U_6E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_6E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_6E =Integer.parseInt(Com_TS_U_6E1);
	    	            	}
    	            break;
    	            case "UAPI-7FK5": 
    	            	 if(element.equals("UAPI-7FK5"))
    		    	       {     
    		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

    		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
    		    	
    		    	 
    		    	 String Com_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
    		    	 Com_TS_U_7FK5 =Integer.parseInt(Com_TS_U_7FK51);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_7FK51 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_7FK5 =Integer.parseInt(Com_TS_U_7FK51);
	    	            	}
    	            break;
    	            case "UAPI-7JY2": 
    	            	 if(element.equals("UAPI-7JY2"))
    		    	       {     
    		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

    		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
    		    	
    		    	 
    		    	 String Com_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
    		    	 Com_TS_U_7JY2 =Integer.parseInt(Com_TS_U_7JY21);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_7JY21 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_7JY2 =Integer.parseInt(Com_TS_U_7JY21);
	    	            	}
    	            break;
    	            case "UAPI-802N": 
    	            	 if(element.equals("UAPI-802N"))
    		    	       {     
    		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

    		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
    		    	
    		    	 
    		    	 String Com_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
    		    	 Com_TS_U_802N =Integer.parseInt(Com_TS_U_802N1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_802N1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_802N =Integer.parseInt(Com_TS_U_802N1);
	    	            	}
    	            break;
    	            case "UAPI-802R": 
    	            	 if(element.equals("UAPI-802R"))
    		    	       {     
    		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

    		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
    		    	
    		    	 
    		    	 String Com_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
    		    	 Com_TS_U_802R =Integer.parseInt(Com_TS_U_802R1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_802R1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_802R =Integer.parseInt(Com_TS_U_802R1);
	    	            	}
    	            break;
    	            case "UAPI-8SQ7": 
    	            	 if(element.equals("UAPI-8SQ7"))
    		    	       {     
    		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

    		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
    		    	
    		    	 
    		    	 String Com_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
    		    	 Com_TS_U_8SQ7 =Integer.parseInt(Com_TS_U_8SQ71);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_U_8SQ71 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_U_8SQ7 =Integer.parseInt(Com_TS_U_8SQ71);
	    	            	}
    	            break;
    	            case "WATANIYA": 
    	            	 if(element.equals("WATANIYA"))
    		    	       {     
    		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

    		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
    		    	
    		    	 
    		    	 String Com_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
    		    	 Com_TS_WATANIYA =Integer.parseInt(Com_TS_WATANIYA1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_WATANIYA1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_WATANIYA =Integer.parseInt(Com_TS_WATANIYA1);
	    	            	}
    	            break;
    	            case "Air Arabia": 
    	            	 if(element.equals("Air Arabia"))
    		    	       {     
    		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

    		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
    		    	
    		    	 
    		    	 String Com_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
    		    	 Com_TS_A_AR =Integer.parseInt(Com_TS_A_AR1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_A_AR1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_A_AR =Integer.parseInt(Com_TS_A_AR1);
	    	            	}
    	            break;
    	            case "Air Arabia Egypt": 
    	            	 if(element.equals("Air Arabia Egypt"))
    		    	       {     
    		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

    		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
    		    	
    		    	 
    		    	 String Com_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
    		    	 Com_TS_A_AR_E =Integer.parseInt(Com_TS_A_AR_E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_A_AR_E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_A_AR_E =Integer.parseInt(Com_TS_A_AR_E1);
	    	            	}
    	            break;
    	            case "Air Arabia Moroc": 
    	            	 if(element.equals("Air Arabia Moroc"))
    		    	       {     
    		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

    		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
    		    	
    		    	 
    		    	 String Com_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
    		    	 Com_TS_A_AR_M =Integer.parseInt(Com_TS_A_AR_M1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_A_AR_M1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_A_AR_M =Integer.parseInt(Com_TS_A_AR_M1);
	    	            	}
    	            break;
    	            case "AirIndiaExpress": 
    	            	 if(element.equals("AirIndiaExpress"))
    		    	       {     
    		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

    		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
    		    	
    		    	 
    		    	 String Com_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
    		    	 Com_TS_A_I_E =Integer.parseInt(Com_TS_A_I_E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_A_I_E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_A_I_E =Integer.parseInt(Com_TS_A_I_E1);
	    	            	}
    	            break;
    	            case "FlyDubai": 
    	            	 if(element.equals("FlyDubai"))
    		    	       {     
    		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

    		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
    		    	
    		    	 
    		    	 String Com_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
    		    	 Com_TS_FlyDubai =Integer.parseInt(Com_TS_FlyDubai1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_FlyDubai1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_FlyDubai =Integer.parseInt(Com_TS_FlyDubai1);
	    	            	}
    	            break;
    	            case "Flynas": 
    	            	 if(element.equals("Flynas"))
    		    	       {     
    		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

    		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
    		    	
    		    	 
    		    	 String Com_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
    		    	 Com_TS_Flynas =Integer.parseInt(Com_TS_Flynas1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Flynas1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Com_TS_Flynas =Integer.parseInt(Com_TS_Flynas1);
	    	            	}
    	            break;
    	            
    	            
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	  
	        
	        int TotalValue = Com_TS_G_3R1+Com_TS_G_570E+Com_TS_G_5N61+Com_TS_G_7FK5+Com_TS_G_7JY2+Com_TS_G_7X7W+Com_TS_G_802N+Com_TS_G_802R
	        		+Com_TS_G_8SQ7+Com_TS_JAZEERA+Com_TS_KIWI+Com_TS_M_u+Com_TS_My_Fly+Com_TS_NESMA+Com_TS_PEGASUS+Com_TS_S_9JFH+Com_TS_S_ID2I
	        		+Com_TS_S_L8YI+Com_TS_S_L9AI+Com_TS_S_L9CI+Com_TS_S_T13I+Com_TS_S_T20I+Com_TS_SALAM+Com_TS_S_Jet+Com_TS_U_3R1G+Com_TS_U_570E
	        		+Com_TS_U_5N61+Com_TS_U_6E+Com_TS_U_7FK5+Com_TS_U_7JY2+Com_TS_U_802N+Com_TS_U_802R+Com_TS_U_8SQ7+Com_TS_WATANIYA+Com_TS_A_AR
	        		+Com_TS_A_AR_E+Com_TS_A_AR_M+Com_TS_A_I_E+Com_TS_FlyDubai+Com_TS_Flynas;
			  
	        Com_TS_Supplier_Transaction_Total = TotalValue; 
			 System.out.println("Supplier Trancation Successfull total:::----"+Com_TS_Supplier_Transaction_Total);
			
			
        
       
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	}
    	      
    	
	    	  
    	
    	
    	
    	Loginpage.ClickOnUsername().click();
    	Thread.sleep(1000);
    	Loginpage.Log_Out().click();
    	Thread.sleep(2000);
    	
    	

}

	public static void AllStatus_TS_SD_CN_TH_AE(int iTestCaseRow,WebDriver driver) throws Exception {
		
		{
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
			
			
			//*******************Supplier  Transaction Successfull*********************************************
	    	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
	    	Supplier_transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			long timeoutInSeconds = 85;
			WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
			String com_S_Trancount=Loginpage.FlightResults_text().getText();
			System.out.println(com_S_Trancount);
			
			
	    	String com_s_transtr = com_S_Trancount.trim();
	    	String[] com_s_transplited = com_s_transtr.split("\\:");
	    	System.out.println("No of Results Count"+com_s_transplited[1]);
	    	Thread.sleep(1000);
	    	String tran1="Transaction Successful";
	    	
	    	if("Flight Search Results : 0".equals(com_S_Trancount))
	    	{
	    		
	    		System.out.println("Supplier TrancationSuccess total:::----0");
	    		
	    		AE_TS_G_3R1=0;
	    		AE_TS_G_570E=0;
	    		AE_TS_G_5N61=0;
	    		AE_TS_G_7FK5=0;
	    		AE_TS_G_7JY2=0;
	    		AE_TS_G_7X7W=0;
	    		AE_TS_G_802N=0;
	    		AE_TS_G_802R=0;
	    		AE_TS_G_8SQ7=0;
	    		AE_TS_JAZEERA=0;
	    		AE_TS_KIWI=0;
	    		AE_TS_M_u=0;
	    		AE_TS_My_Fly=0;
	    		AE_TS_NESMA=0;
	    		AE_TS_PEGASUS=0;
	    		AE_TS_S_9JFH=0;
	    		AE_TS_S_ID2I=0;
	    		AE_TS_S_L8YI=0;
	    		AE_TS_S_L9AI=0;
	    		AE_TS_S_L9CI=0;
	    		AE_TS_S_T13I=0;
	    		AE_TS_S_T20I=0;
	    		AE_TS_SALAM=0;
	    		AE_TS_S_Jet=0;
	    		AE_TS_U_3R1G=0;
	    		AE_TS_U_570E=0;
	    		AE_TS_U_5N61=0;
	    		AE_TS_U_6E=0;
	    		AE_TS_U_7FK5=0;
	    		AE_TS_U_7JY2=0;
	    		AE_TS_U_802N=0;
	    		AE_TS_U_802R=0;
	    		AE_TS_U_8SQ7=0;
	    		AE_TS_WATANIYA=0;
	    		AE_TS_A_AR=0;
	    		AE_TS_A_AR_E=0;
	    		AE_TS_A_AR_M=0;
	    		AE_TS_A_I_E=0;
	    		AE_TS_FlyDubai=0;
	    		AE_TS_Flynas=0;
	 	         
	    		
	    		
		         int TotalValue =0;
		 		        AE_TS_Supplier_Transaction_Total = TotalValue; 
		 				 System.out.println("Supplier Trancation Successfull total:::----"+AE_TS_Supplier_Transaction_Total);
		 				
		 				
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
	    		 
	    		  System.out.println("Total Number of Supplier:" + TS.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : TS)
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
	    	            case "Galileo-3R1G": 
	    	            	if(element.equals("Galileo-3R1G")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

	    		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
	    		    	String AE_TS_G_3R11 =String.format("%1s",G_3R1.size());
	    		    	
	    		    	
	    		    	 AE_TS_G_3R1 =Integer.parseInt(AE_TS_G_3R11);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String AE_TS_G_3R11 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	    	            		AE_TS_G_3R1 =Integer.parseInt(AE_TS_G_3R11);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "Galileo-570E": 
	    	            	   
	    		    	       if(element.equals("Galileo-570E"))
	    		    	       {
	    		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

	    		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
	    		    	  String AE_TS_G_570E1 =String.format("%1s",G_570E.size());
	    		    	  
		    		    	
		    		    	
	    		    	  AE_TS_G_570E =Integer.parseInt(AE_TS_G_570E1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String AE_TS_G_570E1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    	    	   AE_TS_G_570E =Integer.parseInt(AE_TS_G_570E1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "Galileo-5N61": 
	    	            	 if(element.equals("Galileo-5N61"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

	    		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
	    		    	
	    		    	
	    		    	 String AE_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
		    		    
	    		    	 AE_TS_G_5N61 =Integer.parseInt(AE_TS_G_5N611);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_G_5N611 =String.format("%1s",0);   		    	
	    			    		    
	    	            		 AE_TS_G_5N61 =Integer.parseInt(AE_TS_G_5N611);
		    	            	}
	    	            break; 
	    	            case "Galileo-7FK5": 
	    	            	 if(element.equals("Galileo-7FK5"))
	    		    	       {   
	    		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

	    		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
	    		    	 
	    		    	 String AE_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
			    		    
	    		    	 AE_TS_G_7FK5 =Integer.parseInt(AE_TS_G_7FK51);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_G_7FK51 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_G_7FK5 =Integer.parseInt(AE_TS_G_7FK51);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "Galileo-7JY2": 
	    	            	 if(element.equals("Galileo-7JY2"))
	    		    	       {        
	    		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

	    		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
	    		    	
	    		    	 String AE_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
			    		    
	    		    	 AE_TS_G_7JY2 =Integer.parseInt(AE_TS_G_7JY21);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_G_7JY21 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_G_7JY2 =Integer.parseInt(AE_TS_G_7JY21);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "Galileo-7X7W": 
	    	            	  if(element.equals("Galileo-7X7W"))
	    		    	       {   
	    		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

	    		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
	    		    	
	    		    	
	    		    	String AE_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
		    		    
	    		    	AE_TS_G_7X7W =Integer.parseInt(AE_TS_G_7X7W1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String AE_TS_G_7X7W1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			AE_TS_G_7X7W =Integer.parseInt(AE_TS_G_7X7W1);
		    	            	}
	    	            break; 
	    	            case "Galileo-802N": 
	    	            	  if(element.equals("Galileo-802N"))
	    		    	       {        
	    		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

	    		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
	    		    	
	    		    	
	    		    	String AE_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
		    		    
	    		    	AE_TS_G_802N =Integer.parseInt(AE_TS_G_802N1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String AE_TS_G_802N1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  AE_TS_G_802N =Integer.parseInt(AE_TS_G_802N1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "Galileo-802R": 
	    	            	  if(element.equals("Galileo-802R"))
	    		    	       {   
	    		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

	    		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
	    		    	
	    		    	String AE_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
		    		    
	    		    	AE_TS_G_802R =Integer.parseInt(AE_TS_G_802R1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String AE_TS_G_802R1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  AE_TS_G_802R =Integer.parseInt(AE_TS_G_802R1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "Galileo-8SQ7": 
	    	            	if(element.equals("Galileo-8SQ7"))
	    		    	       {  
	    		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

	    		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
	    		    	 
	    		    	 String AE_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
			    		    
	    		    	 AE_TS_G_8SQ7 =Integer.parseInt(AE_TS_G_8SQ71);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String AE_TS_G_8SQ71 =String.format("%1s",0);   		    	
				    		    
	    	            		AE_TS_G_8SQ7 =Integer.parseInt(AE_TS_G_8SQ71);
	    	            	}
	    		    	     
	    	            break;
	    	            case "JAZEERA": 
	    	            	
	    	            	  if(element.equals("JAZEERA"))
	    		    	       {  
	    		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

	    		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
	    		    	 
	    		    	 String AE_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
			    		    
	    		    	 AE_TS_JAZEERA =Integer.parseInt(AE_TS_JAZEERA1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String AE_TS_JAZEERA1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 AE_TS_JAZEERA =Integer.parseInt(AE_TS_JAZEERA1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "KIWI": 
	    	            	 if(element.equals("KIWI"))
	    		    	       {     
	    		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

	    		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
			    		    
	    		    	 AE_TS_KIWI =Integer.parseInt(AE_TS_KIWI1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_KIWI1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_KIWI =Integer.parseInt(AE_TS_KIWI1);
		    	            	}
	    	            break;
	    	            case "Manual": 
	    	            	 if(element.equals("Manual"))
	    		    	       {     
	    		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

	    		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_M_u1 =String.format("%1s",M_u.size());   		    	
			    		    
	    		    	 AE_TS_M_u =Integer.parseInt(AE_TS_M_u1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_M_u1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_M_u =Integer.parseInt(AE_TS_M_u1);
		    	            	}
	    	            break;
	    	            case "MystiFly": 
	    	            	 if(element.equals("MystiFly"))
	    		    	       {     
	    		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

	    		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
			    		    
	    		    	 AE_TS_My_Fly =Integer.parseInt(AE_TS_My_Fly1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_My_Fly1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_My_Fly =Integer.parseInt(AE_TS_My_Fly1);
		    	            	}
	    	            break;
	    	            case "NESMA": 
	    	            	 if(element.equals("NESMA"))
	    		    	       {     
	    		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

	    		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
			    		    
	    		    	 AE_TS_NESMA =Integer.parseInt(AE_TS_NESMA1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_NESMA1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_NESMA =Integer.parseInt(AE_TS_NESMA1);
		    	            	}
	    	            break;
	    	            case "PEGASUS": 
	    	            	 if(element.equals("PEGASUS"))
	    		    	       {     
	    		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

	    		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
			    		    
	    		    	 AE_TS_PEGASUS =Integer.parseInt(AE_TS_PEGASUS1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_PEGASUS1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_PEGASUS =Integer.parseInt(AE_TS_PEGASUS1);
		    	            	}
	    	            break;
	    	            case "SABRE-9JFH": 
	    	            	 if(element.equals("SABRE-9JFH"))
	    		    	       {     
	    		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

	    		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
			    		    
	    		    	 AE_TS_S_9JFH =Integer.parseInt(AE_TS_S_9JFH1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_9JFH1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_9JFH =Integer.parseInt(AE_TS_S_9JFH1);
		    	            	}
	    	            break;
	    	            case "SABRE-ID2I": 
	    	            	 if(element.equals("SABRE-ID2I"))
	    		    	       {     
	    		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

	    		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
			    		    
	    		    	 AE_TS_S_ID2I =Integer.parseInt(AE_TS_S_ID2I1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_ID2I1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_ID2I =Integer.parseInt(AE_TS_S_ID2I1);
		    	            	}
	    	            break;
	    	            case "SABRE-L8YI": 
	    	            	 if(element.equals("SABRE-L8YI"))
	    		    	       {     
	    		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

	    		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
			    		    
	    		    	 AE_TS_S_L8YI =Integer.parseInt(AE_TS_S_L8YI1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_L8YI1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_L8YI =Integer.parseInt(AE_TS_S_L8YI1);
		    	            	}
	    	            break;
	    	            case "SABRE-L9AI": 
	    	            	 if(element.equals("SABRE-L9AI"))
	    		    	       {     
	    		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

	    		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
			    		    
	    		    	 AE_TS_S_L9AI =Integer.parseInt(AE_TS_S_L9AI1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_L9AI1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_L9AI =Integer.parseInt(AE_TS_S_L9AI1);
		    	            	}
	    	            break;
	    	            case "SABRE-L9CI": 
	    	            	 if(element.equals("SABRE-L9CI"))
	    		    	       {     
	    		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

	    		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
			    		    
	    		    	 AE_TS_S_L9CI =Integer.parseInt(AE_TS_S_L9CI1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_L9CI1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_L9CI =Integer.parseInt(AE_TS_S_L9CI1);
		    	            	}
	    	            break;
	    	            case "SABRE-T13I": 
	    	            	 if(element.equals("SABRE-T13I"))
	    		    	       {     
	    		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

	    		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
			    		    
	    		    	 AE_TS_S_T13I =Integer.parseInt(AE_TS_S_T13I1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_T13I1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_T13I =Integer.parseInt(AE_TS_S_T13I1);
		    	            	}
	    	            break;
	    	            case "SABRE-T20I": 
	    	            	 if(element.equals("SABRE-T20I"))
	    		    	       {     
	    		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

	    		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
			    		    
	    		    	 AE_TS_S_T20I =Integer.parseInt(AE_TS_S_T20I1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_T20I1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_T20I =Integer.parseInt(AE_TS_S_T20I1);
		    	            	}
	    	            break;
	    	            case "SALAM": 
	    	            	 if(element.equals("SALAM"))
	    		    	       {     
	    		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

	    		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
			    		    
	    		    	 AE_TS_SALAM =Integer.parseInt(AE_TS_SALAM1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_SALAM1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_SALAM =Integer.parseInt(AE_TS_SALAM1);
		    	            	}
	    	            break;
	    	            case "SpiceJet": 
	    	            	 if(element.equals("SpiceJet"))
	    		    	       {     
	    		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

	    		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
			    		    
	    		    	 AE_TS_S_Jet =Integer.parseInt(AE_TS_S_Jet1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_S_Jet1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_S_Jet =Integer.parseInt(AE_TS_S_Jet1);
		    	            	}
	    	            break;
	    	            case "UAPI-3R1G": 
	    	            	 if(element.equals("UAPI-3R1G"))
	    		    	       {     
	    		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

	    		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
			    		    
	    		    	 AE_TS_U_3R1G =Integer.parseInt(AE_TS_U_3R1G1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_3R1G1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_3R1G =Integer.parseInt(AE_TS_U_3R1G1);
		    	            	}
	    	            break;
	    	            case "UAPI-570E": 
	    	            	 if(element.equals("UAPI-570E"))
	    		    	       {     
	    		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

	    		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
			    		    
	    		    	 AE_TS_U_570E =Integer.parseInt(AE_TS_U_570E1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_570E1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_570E =Integer.parseInt(AE_TS_U_570E1);
		    	            	}
	    	            break;
	    	            case "UAPI-5N61": 
	    	            	 if(element.equals("UAPI-5N61"))
	    		    	       {     
	    		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

	    		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
			    		    
	    		    	 AE_TS_U_5N61 =Integer.parseInt(AE_TS_U_5N611);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_5N611 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_5N61 =Integer.parseInt(AE_TS_U_5N611);
		    	            	}
	    	            break;
	    	            case "UAPI-6E": 
	    	            	 if(element.equals("UAPI-6E"))
	    		    	       {     
	    		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

	    		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
			    		    
	    		    	 AE_TS_U_6E =Integer.parseInt(AE_TS_U_6E1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_6E1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_6E =Integer.parseInt(AE_TS_U_6E1);
		    	            	}
	    	            break;
	    	            case "UAPI-7FK5": 
	    	            	 if(element.equals("UAPI-7FK5"))
	    		    	       {     
	    		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

	    		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
			    		    
	    		    	 AE_TS_U_7FK5 =Integer.parseInt(AE_TS_U_7FK51);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_7FK51 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_7FK5 =Integer.parseInt(AE_TS_U_7FK51);
		    	            	}
	    	            break;
	    	            case "UAPI-7JY2": 
	    	            	 if(element.equals("UAPI-7JY2"))
	    		    	       {     
	    		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

	    		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
			    		    
	    		    	 AE_TS_U_7JY2 =Integer.parseInt(AE_TS_U_7JY21);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_7JY21 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_7JY2 =Integer.parseInt(AE_TS_U_7JY21);
		    	            	}
	    	            break;
	    	            case "UAPI-802N": 
	    	            	 if(element.equals("UAPI-802N"))
	    		    	       {     
	    		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

	    		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
			    		    
	    		    	 AE_TS_U_802N =Integer.parseInt(AE_TS_U_802N1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_802N1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_802N =Integer.parseInt(AE_TS_U_802N1);
		    	            	}
	    	            break;
	    	            case "UAPI-802R": 
	    	            	 if(element.equals("UAPI-802R"))
	    		    	       {     
	    		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

	    		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
			    		    
	    		    	 AE_TS_U_802R =Integer.parseInt(AE_TS_U_802R1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_802R1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_802R =Integer.parseInt(AE_TS_U_802R1);
		    	            	}
	    	            break;
	    	            case "UAPI-8SQ7": 
	    	            	 if(element.equals("UAPI-8SQ7"))
	    		    	       {     
	    		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

	    		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
			    		    
	    		    	 AE_TS_U_8SQ7 =Integer.parseInt(AE_TS_U_8SQ71);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_U_8SQ71 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_U_8SQ7 =Integer.parseInt(AE_TS_U_8SQ71);
		    	            	}
	    	            break;
	    	            case "WATANIYA": 
	    	            	 if(element.equals("WATANIYA"))
	    		    	       {     
	    		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

	    		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
			    		    
	    		    	 AE_TS_WATANIYA =Integer.parseInt(AE_TS_WATANIYA1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_WATANIYA1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_WATANIYA =Integer.parseInt(AE_TS_WATANIYA1);
		    	            	}
	    	            break;
	    	            case "Air Arabia": 
	    	            	 if(element.equals("Air Arabia"))
	    		    	       {     
	    		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

	    		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
			    		    
	    		    	 AE_TS_A_AR =Integer.parseInt(AE_TS_A_AR1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_A_AR1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_A_AR =Integer.parseInt(AE_TS_A_AR1);
		    	            	}
	    	            break;
	    	            case "Air Arabia Egypt": 
	    	            	 if(element.equals("Air Arabia Egypt"))
	    		    	       {     
	    		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

	    		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
			    		    
	    		    	 AE_TS_A_AR_E =Integer.parseInt(AE_TS_A_AR_E1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_A_AR_E1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_A_AR_E =Integer.parseInt(AE_TS_A_AR_E1);
		    	            	}
	    	            break;
	    	            case "Air Arabia Moroc": 
	    	            	 if(element.equals("Air Arabia Moroc"))
	    		    	       {     
	    		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

	    		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
			    		    
	    		    	 AE_TS_A_AR_M =Integer.parseInt(AE_TS_A_AR_M1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_A_AR_M1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_A_AR_M =Integer.parseInt(AE_TS_A_AR_M1);
		    	            	}
	    	            break;
	    	            case "AirIndiaExpress": 
	    	            	 if(element.equals("AirIndiaExpress"))
	    		    	       {     
	    		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

	    		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
			    		    
	    		    	 AE_TS_A_I_E =Integer.parseInt(AE_TS_A_I_E1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_A_I_E1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_A_I_E =Integer.parseInt(AE_TS_A_I_E1);
		    	            	}
	    	            break;
	    	            case "FlyDubai": 
	    	            	 if(element.equals("FlyDubai"))
	    		    	       {     
	    		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

	    		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
			    		    
	    		    	 AE_TS_FlyDubai =Integer.parseInt(AE_TS_FlyDubai1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_FlyDubai1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_FlyDubai =Integer.parseInt(AE_TS_FlyDubai1);
		    	            	}
	    	            break;
	    	            case "Flynas": 
	    	            	 if(element.equals("Flynas"))
	    		    	       {     
	    		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

	    		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
	    		    	
	    		    	 
	    		    	 String AE_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
			    		    
	    		    	 AE_TS_Flynas =Integer.parseInt(AE_TS_Flynas1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String AE_TS_Flynas1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_TS_Flynas =Integer.parseInt(AE_TS_Flynas1);
		    	            	}
	    	            break;
	    	            
	    	            
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
		        
		        int TotalValue = AE_TS_G_3R1+AE_TS_G_570E+AE_TS_G_5N61+AE_TS_G_7FK5+AE_TS_G_7JY2+AE_TS_G_7X7W+AE_TS_G_802N+AE_TS_G_802R
		        		+AE_TS_G_8SQ7+AE_TS_JAZEERA+AE_TS_KIWI+AE_TS_M_u+AE_TS_My_Fly+AE_TS_NESMA+AE_TS_PEGASUS+AE_TS_S_9JFH+AE_TS_S_ID2I
		        		+AE_TS_S_L8YI+AE_TS_S_L9AI+AE_TS_S_L9CI+AE_TS_S_T13I+AE_TS_S_T20I+AE_TS_SALAM+AE_TS_S_Jet+AE_TS_U_3R1G+AE_TS_U_570E
		        		+AE_TS_U_5N61+AE_TS_U_6E+AE_TS_U_7FK5+AE_TS_U_7JY2+AE_TS_U_802N+AE_TS_U_802R+AE_TS_U_8SQ7+AE_TS_WATANIYA+AE_TS_A_AR
		        		+AE_TS_A_AR_E+AE_TS_A_AR_M+AE_TS_A_I_E+AE_TS_FlyDubai+AE_TS_Flynas;
				  
		        AE_TS_Supplier_Transaction_Total = TotalValue; 
				 System.out.println("Supplier Trancation Successfull total:::----"+AE_TS_Supplier_Transaction_Total);
				
				
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}
	    	      
	    	
		    	  
	    	
	    	
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
		}
	    		
		}
public static void AllStatus_TS_SD_CN_TH_SA(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		
		//Loginpage.COM_link().click();
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
		
		
		//*******************Supplier  Transaction Successfull*********************************************
    	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
    	Supplier_transaction1.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		
		long timeoutInSeconds = 85;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
		String com_S_Trancount=Loginpage.FlightResults_text().getText();
		System.out.println(com_S_Trancount);
		
		
    	String com_s_transtr = com_S_Trancount.trim();
    	String[] com_s_transplited = com_s_transtr.split("\\:");
    	System.out.println("No of Results Count"+com_s_transplited[1]);
    	Thread.sleep(1000);
    	String tran1="Transaction Successful";
    	
    	if("Flight Search Results : 0".equals(com_S_Trancount))
    	{
    		
    		System.out.println("Supplier TrancationSuccess total:::----0");
    		
    		SA_TS_G_3R1=0;
    		SA_TS_G_570E=0;
    		SA_TS_G_5N61=0;
    		SA_TS_G_7FK5=0;
    		SA_TS_G_7JY2=0;
    		SA_TS_G_7X7W=0;
    		SA_TS_G_802N=0;
    		SA_TS_G_802R=0;
    		SA_TS_G_8SQ7=0;
    		SA_TS_JAZEERA=0;
    		SA_TS_KIWI=0;
    		SA_TS_M_u=0;
    		SA_TS_My_Fly=0;
    		SA_TS_NESMA=0;
    		SA_TS_PEGASUS=0;
    		SA_TS_S_9JFH=0;
    		SA_TS_S_ID2I=0;
    		SA_TS_S_L8YI=0;
    		SA_TS_S_L9AI=0;
    		SA_TS_S_L9CI=0;
    		SA_TS_S_T13I=0;
    		SA_TS_S_T20I=0;
    		SA_TS_SALAM=0;
    		SA_TS_S_Jet=0;
    		SA_TS_U_3R1G=0;
    		SA_TS_U_570E=0;
    		SA_TS_U_5N61=0;
    		SA_TS_U_6E=0;
    		SA_TS_U_7FK5=0;
    		SA_TS_U_7JY2=0;
    		SA_TS_U_802N=0;
    		SA_TS_U_802R=0;
    		SA_TS_U_8SQ7=0;
    		SA_TS_WATANIYA=0;
    		SA_TS_A_AR=0;
    		SA_TS_A_AR_E=0;
    		SA_TS_A_AR_M=0;
    		SA_TS_A_I_E=0;
    		SA_TS_FlyDubai=0;
    		SA_TS_Flynas=0;
 	         
    		
    		
	         int TotalValue =0;
	 		        SA_TS_Supplier_Transaction_Total = TotalValue; 
	 				 System.out.println("Supplier Trancation Successfull total:::----"+SA_TS_Supplier_Transaction_Total);
	 				
	 				
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
    		 
    		  System.out.println("Total Number of Supplier:" + TS.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : TS)
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
    	            case "Galileo-3R1G": 
    	            	if(element.equals("Galileo-3R1G")) 
    		    	       {
    		    	        
    		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

    		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
    		    	String SA_TS_G_3R11 =String.format("%1s",G_3R1.size());
    		    	
    		    	
    		    	 SA_TS_G_3R1 =Integer.parseInt(SA_TS_G_3R11);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String SA_TS_G_3R11 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		SA_TS_G_3R1 =Integer.parseInt(SA_TS_G_3R11);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "Galileo-570E": 
    	            	   
    		    	       if(element.equals("Galileo-570E"))
    		    	       {
    		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

    		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
    		    	  String SA_TS_G_570E1 =String.format("%1s",G_570E.size());
    		    	  
	    		    	
	    		    	
    		    	  SA_TS_G_570E =Integer.parseInt(SA_TS_G_570E1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String SA_TS_G_570E1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   SA_TS_G_570E =Integer.parseInt(SA_TS_G_570E1);
	    	            	}
    		    	      
    	            break;  
    	            case "Galileo-5N61": 
    	            	 if(element.equals("Galileo-5N61"))
    		    	       {   
    		    	       
    		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

    		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
    		    	
    		    	
    		    	 String SA_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
    		    	 SA_TS_G_5N61 =Integer.parseInt(SA_TS_G_5N611);
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_G_5N611 =String.format("%1s",0);   		    	
    			    		    
    	            		 SA_TS_G_5N61 =Integer.parseInt(SA_TS_G_5N611);
	    	            	}
    	            break; 
    	            case "Galileo-7FK5": 
    	            	 if(element.equals("Galileo-7FK5"))
    		    	       {   
    		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

    		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
    		    	 
    		    	 String SA_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
    		    	 SA_TS_G_7FK5 =Integer.parseInt(SA_TS_G_7FK51);
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_G_7FK51 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_G_7FK5 =Integer.parseInt(SA_TS_G_7FK51);
	    	            	}
    		    	      
    	            break; 
    	            case "Galileo-7JY2": 
    	            	 if(element.equals("Galileo-7JY2"))
    		    	       {        
    		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

    		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
    		    	
    		    	 String SA_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
    		    	 SA_TS_G_7JY2 =Integer.parseInt(SA_TS_G_7JY21);
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_G_7JY21 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_G_7JY2 =Integer.parseInt(SA_TS_G_7JY21);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "Galileo-7X7W": 
    	            	  if(element.equals("Galileo-7X7W"))
    		    	       {   
    		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

    		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
    		    	
    		    	
    		    	String SA_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
    		    	SA_TS_G_7X7W =Integer.parseInt(SA_TS_G_7X7W1);
    		    	       }
    	            	  else
	    	            	{
    	            			String SA_TS_G_7X7W1 =String.format("%1s",0);   		    	
    			    		    
    	            			SA_TS_G_7X7W =Integer.parseInt(SA_TS_G_7X7W1);
	    	            	}
    	            break; 
    	            case "Galileo-802N": 
    	            	  if(element.equals("Galileo-802N"))
    		    	       {        
    		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

    		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
    		    	
    		    	
    		    	String SA_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
    		    	SA_TS_G_802N =Integer.parseInt(SA_TS_G_802N1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String SA_TS_G_802N1 =String.format("%1s",0);   		    	
    			    		    
    	            		  SA_TS_G_802N =Integer.parseInt(SA_TS_G_802N1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "Galileo-802R": 
    	            	  if(element.equals("Galileo-802R"))
    		    	       {   
    		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

    		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
    		    	
    		    	String SA_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
    		    	SA_TS_G_802R =Integer.parseInt(SA_TS_G_802R1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String SA_TS_G_802R1 =String.format("%1s",0);   		    	
    			    		    
    	            		  SA_TS_G_802R =Integer.parseInt(SA_TS_G_802R1);
	    	            	}
    		    	       
    	            break; 
    	            case "Galileo-8SQ7": 
    	            	if(element.equals("Galileo-8SQ7"))
    		    	       {  
    		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

    		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
    		    	 
    		    	 String SA_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
    		    	 SA_TS_G_8SQ7 =Integer.parseInt(SA_TS_G_8SQ71);
    		    	       }
    	            	else
    	            	{
    	            		String SA_TS_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
    	            		SA_TS_G_8SQ7 =Integer.parseInt(SA_TS_G_8SQ71);
    	            	}
    		    	     
    	            break;
    	            case "JAZEERA": 
    	            	
    	            	  if(element.equals("JAZEERA"))
    		    	       {  
    		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

    		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
    		    	 
    		    	 String SA_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
    		    	 SA_TS_JAZEERA =Integer.parseInt(SA_TS_JAZEERA1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String SA_TS_JAZEERA1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 SA_TS_JAZEERA =Integer.parseInt(SA_TS_JAZEERA1);
	    	            	}
    		    	      
    	            break; 
    	            case "KIWI": 
    	            	 if(element.equals("KIWI"))
    		    	       {     
    		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

    		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
    		    	
    		    	 
    		    	 String SA_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
    		    	 SA_TS_KIWI =Integer.parseInt(SA_TS_KIWI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_KIWI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_KIWI =Integer.parseInt(SA_TS_KIWI1);
	    	            	}
    	            break;
    	            case "Manual": 
    	            	 if(element.equals("Manual"))
    		    	       {     
    		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

    		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
    		    	
    		    	 
    		    	 String SA_TS_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
    		    	 SA_TS_M_u =Integer.parseInt(SA_TS_M_u1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_M_u1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_M_u =Integer.parseInt(SA_TS_M_u1);
	    	            	}
    	            break;
    	            case "MystiFly": 
    	            	 if(element.equals("MystiFly"))
    		    	       {     
    		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

    		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
    		    	
    		    	 
    		    	 String SA_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
    		    	 SA_TS_My_Fly =Integer.parseInt(SA_TS_My_Fly1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_My_Fly1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_My_Fly =Integer.parseInt(SA_TS_My_Fly1);
	    	            	}
    	            break;
    	            case "NESMA": 
    	            	 if(element.equals("NESMA"))
    		    	       {     
    		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

    		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
    		    	
    		    	 
    		    	 String SA_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
    		    	 SA_TS_NESMA =Integer.parseInt(SA_TS_NESMA1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_NESMA1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_NESMA =Integer.parseInt(SA_TS_NESMA1);
	    	            	}
    	            break;
    	            case "PEGASUS": 
    	            	 if(element.equals("PEGASUS"))
    		    	       {     
    		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

    		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
    		    	
    		    	 
    		    	 String SA_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
    		    	 SA_TS_PEGASUS =Integer.parseInt(SA_TS_PEGASUS1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_PEGASUS1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_PEGASUS =Integer.parseInt(SA_TS_PEGASUS1);
	    	            	}
    	            break;
    	            case "SABRE-9JFH": 
    	            	 if(element.equals("SABRE-9JFH"))
    		    	       {     
    		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

    		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
    		    	
    		    	 
    		    	 String SA_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
    		    	 SA_TS_S_9JFH =Integer.parseInt(SA_TS_S_9JFH1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_9JFH1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_9JFH =Integer.parseInt(SA_TS_S_9JFH1);
	    	            	}
    	            break;
    	            case "SABRE-ID2I": 
    	            	 if(element.equals("SABRE-ID2I"))
    		    	       {     
    		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

    		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
    		    	
    		    	 
    		    	 String SA_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
    		    	 SA_TS_S_ID2I =Integer.parseInt(SA_TS_S_ID2I1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_ID2I1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_ID2I =Integer.parseInt(SA_TS_S_ID2I1);
	    	            	}
    	            break;
    	            case "SABRE-L8YI": 
    	            	 if(element.equals("SABRE-L8YI"))
    		    	       {     
    		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

    		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
    		    	
    		    	 
    		    	 String SA_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
    		    	 SA_TS_S_L8YI =Integer.parseInt(SA_TS_S_L8YI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_L8YI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_L8YI =Integer.parseInt(SA_TS_S_L8YI1);
	    	            	}
    	            break;
    	            case "SABRE-L9AI": 
    	            	 if(element.equals("SABRE-L9AI"))
    		    	       {     
    		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

    		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
    		    	
    		    	 
    		    	 String SA_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
    		    	 SA_TS_S_L9AI =Integer.parseInt(SA_TS_S_L9AI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_L9AI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_L9AI =Integer.parseInt(SA_TS_S_L9AI1);
	    	            	}
    	            break;
    	            case "SABRE-L9CI": 
    	            	 if(element.equals("SABRE-L9CI"))
    		    	       {     
    		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

    		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
    		    	
    		    	 
    		    	 String SA_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
    		    	 SA_TS_S_L9CI =Integer.parseInt(SA_TS_S_L9CI1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_L9CI1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_L9CI =Integer.parseInt(SA_TS_S_L9CI1);
	    	            	}
    	            break;
    	            case "SABRE-T13I": 
    	            	 if(element.equals("SABRE-T13I"))
    		    	       {     
    		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

    		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
    		    	
    		    	 
    		    	 String SA_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
    		    	 SA_TS_S_T13I =Integer.parseInt(SA_TS_S_T13I1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_T13I1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_T13I =Integer.parseInt(SA_TS_S_T13I1);
	    	            	}
    	            break;
    	            case "SABRE-T20I": 
    	            	 if(element.equals("SABRE-T20I"))
    		    	       {     
    		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

    		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
    		    	
    		    	 
    		    	 String SA_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
    		    	 SA_TS_S_T20I =Integer.parseInt(SA_TS_S_T20I1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_T20I1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_T20I =Integer.parseInt(SA_TS_S_T20I1);
	    	            	}
    	            break;
    	            case "SALAM": 
    	            	 if(element.equals("SALAM"))
    		    	       {     
    		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

    		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
    		    	
    		    	 
    		    	 String SA_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
    		    	 SA_TS_SALAM =Integer.parseInt(SA_TS_SALAM1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_SALAM1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_SALAM =Integer.parseInt(SA_TS_SALAM1);
	    	            	}
    	            break;
    	            case "SpiceJet": 
    	            	 if(element.equals("SpiceJet"))
    		    	       {     
    		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

    		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
    		    	
    		    	 
    		    	 String SA_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
    		    	 SA_TS_S_Jet =Integer.parseInt(SA_TS_S_Jet1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_S_Jet1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_S_Jet =Integer.parseInt(SA_TS_S_Jet1);
	    	            	}
    	            break;
    	            case "UAPI-3R1G": 
    	            	 if(element.equals("UAPI-3R1G"))
    		    	       {     
    		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

    		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
    		    	
    		    	 
    		    	 String SA_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
    		    	 SA_TS_U_3R1G =Integer.parseInt(SA_TS_U_3R1G1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_3R1G1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_3R1G =Integer.parseInt(SA_TS_U_3R1G1);
	    	            	}
    	            break;
    	            case "UAPI-570E": 
    	            	 if(element.equals("UAPI-570E"))
    		    	       {     
    		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

    		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
    		    	
    		    	 
    		    	 String SA_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
    		    	 SA_TS_U_570E =Integer.parseInt(SA_TS_U_570E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_570E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_570E =Integer.parseInt(SA_TS_U_570E1);
	    	            	}
    	            break;
    	            case "UAPI-5N61": 
    	            	 if(element.equals("UAPI-5N61"))
    		    	       {     
    		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

    		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
    		    	
    		    	 
    		    	 String SA_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
    		    	 SA_TS_U_5N61 =Integer.parseInt(SA_TS_U_5N611);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_5N611 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_5N61 =Integer.parseInt(SA_TS_U_5N611);
	    	            	}
    	            break;
    	            case "UAPI-6E": 
    	            	 if(element.equals("UAPI-6E"))
    		    	       {     
    		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

    		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
    		    	
    		    	 
    		    	 String SA_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
    		    	 SA_TS_U_6E =Integer.parseInt(SA_TS_U_6E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_6E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_6E =Integer.parseInt(SA_TS_U_6E1);
	    	            	}
    	            break;
    	            case "UAPI-7FK5": 
    	            	 if(element.equals("UAPI-7FK5"))
    		    	       {     
    		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

    		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
    		    	
    		    	 
    		    	 String SA_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
    		    	 SA_TS_U_7FK5 =Integer.parseInt(SA_TS_U_7FK51);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_7FK51 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_7FK5 =Integer.parseInt(SA_TS_U_7FK51);
	    	            	}
    	            break;
    	            case "UAPI-7JY2": 
    	            	 if(element.equals("UAPI-7JY2"))
    		    	       {     
    		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

    		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
    		    	
    		    	 
    		    	 String SA_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
    		    	 SA_TS_U_7JY2 =Integer.parseInt(SA_TS_U_7JY21);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_7JY21 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_7JY2 =Integer.parseInt(SA_TS_U_7JY21);
	    	            	}
    	            break;
    	            case "UAPI-802N": 
    	            	 if(element.equals("UAPI-802N"))
    		    	       {     
    		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

    		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
    		    	
    		    	 
    		    	 String SA_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
    		    	 SA_TS_U_802N =Integer.parseInt(SA_TS_U_802N1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_802N1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_802N =Integer.parseInt(SA_TS_U_802N1);
	    	            	}
    	            break;
    	            case "UAPI-802R": 
    	            	 if(element.equals("UAPI-802R"))
    		    	       {     
    		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

    		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
    		    	
    		    	 
    		    	 String SA_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
    		    	 SA_TS_U_802R =Integer.parseInt(SA_TS_U_802R1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_802R1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_802R =Integer.parseInt(SA_TS_U_802R1);
	    	            	}
    	            break;
    	            case "UAPI-8SQ7": 
    	            	 if(element.equals("UAPI-8SQ7"))
    		    	       {     
    		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

    		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
    		    	
    		    	 
    		    	 String SA_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
    		    	 SA_TS_U_8SQ7 =Integer.parseInt(SA_TS_U_8SQ71);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_U_8SQ71 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_U_8SQ7 =Integer.parseInt(SA_TS_U_8SQ71);
	    	            	}
    	            break;
    	            case "WATANIYA": 
    	            	 if(element.equals("WATANIYA"))
    		    	       {     
    		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

    		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
    		    	
    		    	 
    		    	 String SA_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
    		    	 SA_TS_WATANIYA =Integer.parseInt(SA_TS_WATANIYA1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_WATANIYA1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_WATANIYA =Integer.parseInt(SA_TS_WATANIYA1);
	    	            	}
    	            break;
    	            case "Air Arabia": 
    	            	 if(element.equals("Air Arabia"))
    		    	       {     
    		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

    		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
    		    	
    		    	 
    		    	 String SA_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
    		    	 SA_TS_A_AR =Integer.parseInt(SA_TS_A_AR1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_A_AR1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_A_AR =Integer.parseInt(SA_TS_A_AR1);
	    	            	}
    	            break;
    	            case "Air Arabia Egypt": 
    	            	 if(element.equals("Air Arabia Egypt"))
    		    	       {     
    		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

    		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
    		    	
    		    	 
    		    	 String SA_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
    		    	 SA_TS_A_AR_E =Integer.parseInt(SA_TS_A_AR_E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_A_AR_E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_A_AR_E =Integer.parseInt(SA_TS_A_AR_E1);
	    	            	}
    	            break;
    	            case "Air Arabia Moroc": 
    	            	 if(element.equals("Air Arabia Moroc"))
    		    	       {     
    		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

    		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
    		    	
    		    	 
    		    	 String SA_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
    		    	 SA_TS_A_AR_M =Integer.parseInt(SA_TS_A_AR_M1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_A_AR_M1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_A_AR_M =Integer.parseInt(SA_TS_A_AR_M1);
	    	            	}
    	            break;
    	            case "AirIndiaExpress": 
    	            	 if(element.equals("AirIndiaExpress"))
    		    	       {     
    		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

    		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
    		    	
    		    	 
    		    	 String SA_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
    		    	 SA_TS_A_I_E =Integer.parseInt(SA_TS_A_I_E1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_A_I_E1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_A_I_E =Integer.parseInt(SA_TS_A_I_E1);
	    	            	}
    	            break;
    	            case "FlyDubai": 
    	            	 if(element.equals("FlyDubai"))
    		    	       {     
    		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

    		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
    		    	
    		    	 
    		    	 String SA_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
    		    	 SA_TS_FlyDubai =Integer.parseInt(SA_TS_FlyDubai1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_FlyDubai1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_FlyDubai =Integer.parseInt(SA_TS_FlyDubai1);
	    	            	}
    	            break;
    	            case "Flynas": 
    	            	 if(element.equals("Flynas"))
    		    	       {     
    		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

    		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
    		    	
    		    	 
    		    	 String SA_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
    		    	 SA_TS_Flynas =Integer.parseInt(SA_TS_Flynas1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String SA_TS_Flynas1 =String.format("%1s",0);   		    	
 			    		    
    	            		 SA_TS_Flynas =Integer.parseInt(SA_TS_Flynas1);
	    	            	}
    	            break;
    	            
    	            
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	  
	        
	        int TotalValue = SA_TS_G_3R1+SA_TS_G_570E+SA_TS_G_5N61+SA_TS_G_7FK5+SA_TS_G_7JY2+SA_TS_G_7X7W+SA_TS_G_802N+SA_TS_G_802R
	        		+SA_TS_G_8SQ7+SA_TS_JAZEERA+SA_TS_KIWI+SA_TS_M_u+SA_TS_My_Fly+SA_TS_NESMA+SA_TS_PEGASUS+SA_TS_S_9JFH+SA_TS_S_ID2I
	        		+SA_TS_S_L8YI+SA_TS_S_L9AI+SA_TS_S_L9CI+SA_TS_S_T13I+SA_TS_S_T20I+SA_TS_SALAM+SA_TS_S_Jet+SA_TS_U_3R1G+SA_TS_U_570E
	        		+SA_TS_U_5N61+SA_TS_U_6E+SA_TS_U_7FK5+SA_TS_U_7JY2+SA_TS_U_802N+SA_TS_U_802R+SA_TS_U_8SQ7+SA_TS_WATANIYA+SA_TS_A_AR
	        		+SA_TS_A_AR_E+SA_TS_A_AR_M+SA_TS_A_I_E+SA_TS_FlyDubai+SA_TS_Flynas;
			  
	        SA_TS_Supplier_Transaction_Total = TotalValue; 
			 System.out.println("Supplier Trancation Successfull total:::----"+SA_TS_Supplier_Transaction_Total);
			
			
        
       
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	}
    	      
    	
	    	  
    	
    	
    	
    	Loginpage.ClickOnUsername().click();
    	Thread.sleep(1000);
    	Loginpage.Log_Out().click();
    	Thread.sleep(2000);
    	
    	

}
public static void AllStatus_TS_SD_CN_TH_EG(int iTestCaseRow,WebDriver driver) throws Exception {
	
	
	
	//Loginpage.COM_link().click();
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
	
	
	//*******************Supplier  Transaction Successfull*********************************************
	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
	Supplier_transaction1.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	
	long timeoutInSeconds = 85;
	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
	String com_S_Trancount=Loginpage.FlightResults_text().getText();
	System.out.println(com_S_Trancount);
	
	
	String com_s_transtr = com_S_Trancount.trim();
	String[] com_s_transplited = com_s_transtr.split("\\:");
	System.out.println("No of Results Count"+com_s_transplited[1]);
	Thread.sleep(1000);
	String tran1="Transaction Successful";
	
	if("Flight Search Results : 0".equals(com_S_Trancount))
	{
		
		System.out.println("Supplier TrancationSuccess total:::----0");
		
		EG_TS_G_3R1=0;
		EG_TS_G_570E=0;
		EG_TS_G_5N61=0;
		EG_TS_G_7FK5=0;
		EG_TS_G_7JY2=0;
		EG_TS_G_7X7W=0;
		EG_TS_G_802N=0;
		EG_TS_G_802R=0;
		EG_TS_G_8SQ7=0;
		EG_TS_JAZEERA=0;
		EG_TS_KIWI=0;
		EG_TS_M_u=0;
		EG_TS_My_Fly=0;
		EG_TS_NESMA=0;
		EG_TS_PEGASUS=0;
		EG_TS_S_9JFH=0;
		EG_TS_S_ID2I=0;
		EG_TS_S_L8YI=0;
		EG_TS_S_L9AI=0;
		EG_TS_S_L9CI=0;
		EG_TS_S_T13I=0;
		EG_TS_S_T20I=0;
		EG_TS_SALAM=0;
		EG_TS_S_Jet=0;
		EG_TS_U_3R1G=0;
		EG_TS_U_570E=0;
		EG_TS_U_5N61=0;
		EG_TS_U_6E=0;
		EG_TS_U_7FK5=0;
		EG_TS_U_7JY2=0;
		EG_TS_U_802N=0;
		EG_TS_U_802R=0;
		EG_TS_U_8SQ7=0;
		EG_TS_WATANIYA=0;
		EG_TS_A_AR=0;
		EG_TS_A_AR_E=0;
		EG_TS_A_AR_M=0;
		EG_TS_A_I_E=0;
		EG_TS_FlyDubai=0;
		EG_TS_Flynas=0;
	         
		
		
         int TotalValue =0;
 		        EG_TS_Supplier_Transaction_Total = TotalValue; 
 				 System.out.println("Supplier Trancation Successfull total:::----"+EG_TS_Supplier_Transaction_Total);
 				
 				
 	        
        
      
	}
	else
	{
	
		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
		 
		  System.out.println("Total Number of Supplier:" + TS.size());
		
		ArrayList<String>list=new ArrayList<>();
		
		 for (WebElement element1 : TS)
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
	            case "Galileo-3R1G": 
	            	if(element.equals("Galileo-3R1G")) 
		    	       {
		    	        
		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
		    	String EG_TS_G_3R11 =String.format("%1s",G_3R1.size());
		    	
		    	
		    	 EG_TS_G_3R1 =Integer.parseInt(EG_TS_G_3R11);
		    	
		    	       }
	            	else
	            	{
	            		String EG_TS_G_3R11 =String.format("%1s",0);
	    		    	
	    		    	
	            		EG_TS_G_3R1 =Integer.parseInt(EG_TS_G_3R11);
	            	}
		    	      
	            break; 
	            
	            case "Galileo-570E": 
	            	   
		    	       if(element.equals("Galileo-570E"))
		    	       {
		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
		    	  String EG_TS_G_570E1 =String.format("%1s",G_570E.size());
		    	  
    		    	
    		    	
		    	  EG_TS_G_570E =Integer.parseInt(EG_TS_G_570E1);
		    	       }
		    	       else
    	            	{
		    	    	   String EG_TS_G_570E1 =String.format("%1s",0);
		    		    	  
		    		    	
		    		    	
		    	    	   EG_TS_G_570E =Integer.parseInt(EG_TS_G_570E1);
    	            	}
		    	      
	            break;  
	            case "Galileo-5N61": 
	            	 if(element.equals("Galileo-5N61"))
		    	       {   
		    	       
		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
		    	
		    	
		    	 String EG_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
    		    
		    	 EG_TS_G_5N61 =Integer.parseInt(EG_TS_G_5N611);
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_G_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_G_5N61 =Integer.parseInt(EG_TS_G_5N611);
    	            	}
	            break; 
	            case "Galileo-7FK5": 
	            	 if(element.equals("Galileo-7FK5"))
		    	       {   
		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
		    	 
		    	 String EG_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
	    		    
		    	 EG_TS_G_7FK5 =Integer.parseInt(EG_TS_G_7FK51);
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_G_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_G_7FK5 =Integer.parseInt(EG_TS_G_7FK51);
    	            	}
		    	      
	            break; 
	            case "Galileo-7JY2": 
	            	 if(element.equals("Galileo-7JY2"))
		    	       {        
		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
		    	
		    	 String EG_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
	    		    
		    	 EG_TS_G_7JY2 =Integer.parseInt(EG_TS_G_7JY21);
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_G_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_G_7JY2 =Integer.parseInt(EG_TS_G_7JY21);
    	            	}
		    	     
		    	       
	            break;  
	            case "Galileo-7X7W": 
	            	  if(element.equals("Galileo-7X7W"))
		    	       {   
		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
		    	
		    	
		    	String EG_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
    		    
		    	EG_TS_G_7X7W =Integer.parseInt(EG_TS_G_7X7W1);
		    	       }
	            	  else
    	            	{
	            			String EG_TS_G_7X7W1 =String.format("%1s",0);   		    	
			    		    
	            			EG_TS_G_7X7W =Integer.parseInt(EG_TS_G_7X7W1);
    	            	}
	            break; 
	            case "Galileo-802N": 
	            	  if(element.equals("Galileo-802N"))
		    	       {        
		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
		    	
		    	
		    	String EG_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
    		    
		    	EG_TS_G_802N =Integer.parseInt(EG_TS_G_802N1);
		    	
		    	       }
	            	  else
    	            	{
	            		  String EG_TS_G_802N1 =String.format("%1s",0);   		    	
			    		    
	            		  EG_TS_G_802N =Integer.parseInt(EG_TS_G_802N1);
    	            	}
		    	      
		    	     
	            break;
	            case "Galileo-802R": 
	            	  if(element.equals("Galileo-802R"))
		    	       {   
		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
		    	
		    	String EG_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
    		    
		    	EG_TS_G_802R =Integer.parseInt(EG_TS_G_802R1);
		    	       }
		    	       
	            	  else
    	            	{
	            		  String EG_TS_G_802R1 =String.format("%1s",0);   		    	
			    		    
	            		  EG_TS_G_802R =Integer.parseInt(EG_TS_G_802R1);
    	            	}
		    	       
	            break; 
	            case "Galileo-8SQ7": 
	            	if(element.equals("Galileo-8SQ7"))
		    	       {  
		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
		    	 
		    	 String EG_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
	    		    
		    	 EG_TS_G_8SQ7 =Integer.parseInt(EG_TS_G_8SQ71);
		    	       }
	            	else
	            	{
	            		String EG_TS_G_8SQ71 =String.format("%1s",0);   		    	
		    		    
	            		EG_TS_G_8SQ7 =Integer.parseInt(EG_TS_G_8SQ71);
	            	}
		    	     
	            break;
	            case "JAZEERA": 
	            	
	            	  if(element.equals("JAZEERA"))
		    	       {  
		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
		    	 
		    	 String EG_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
	    		    
		    	 EG_TS_JAZEERA =Integer.parseInt(EG_TS_JAZEERA1);
		    	       }
	            	  else
    	            	{
	            		  
		    		    	 String EG_TS_JAZEERA1 =String.format("%1s",0);   		    	
				    		    
		    		    	 EG_TS_JAZEERA =Integer.parseInt(EG_TS_JAZEERA1);
    	            	}
		    	      
	            break; 
	            case "KIWI": 
	            	 if(element.equals("KIWI"))
		    	       {     
		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
		    	
		    	 
		    	 String EG_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
	    		    
		    	 EG_TS_KIWI =Integer.parseInt(EG_TS_KIWI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_KIWI1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_KIWI =Integer.parseInt(EG_TS_KIWI1);
    	            	}
	            break;
	            case "Manual": 
	            	 if(element.equals("Manual"))
		    	       {     
		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
		    	
		    	 
		    	 String EG_TS_M_u1 =String.format("%1s",M_u.size());   		    	
	    		    
		    	 EG_TS_M_u =Integer.parseInt(EG_TS_M_u1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_M_u1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_M_u =Integer.parseInt(EG_TS_M_u1);
    	            	}
	            break;
	            case "MystiFly": 
	            	 if(element.equals("MystiFly"))
		    	       {     
		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
		    	
		    	 
		    	 String EG_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
	    		    
		    	 EG_TS_My_Fly =Integer.parseInt(EG_TS_My_Fly1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_My_Fly1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_My_Fly =Integer.parseInt(EG_TS_My_Fly1);
    	            	}
	            break;
	            case "NESMA": 
	            	 if(element.equals("NESMA"))
		    	       {     
		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
		    	
		    	 
		    	 String EG_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
	    		    
		    	 EG_TS_NESMA =Integer.parseInt(EG_TS_NESMA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_NESMA1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_NESMA =Integer.parseInt(EG_TS_NESMA1);
    	            	}
	            break;
	            case "PEGASUS": 
	            	 if(element.equals("PEGASUS"))
		    	       {     
		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
		    	
		    	 
		    	 String EG_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
	    		    
		    	 EG_TS_PEGASUS =Integer.parseInt(EG_TS_PEGASUS1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_PEGASUS1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_PEGASUS =Integer.parseInt(EG_TS_PEGASUS1);
    	            	}
	            break;
	            case "SABRE-9JFH": 
	            	 if(element.equals("SABRE-9JFH"))
		    	       {     
		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
		    	
		    	 
		    	 String EG_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
	    		    
		    	 EG_TS_S_9JFH =Integer.parseInt(EG_TS_S_9JFH1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_9JFH1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_9JFH =Integer.parseInt(EG_TS_S_9JFH1);
    	            	}
	            break;
	            case "SABRE-ID2I": 
	            	 if(element.equals("SABRE-ID2I"))
		    	       {     
		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
		    	
		    	 
		    	 String EG_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
	    		    
		    	 EG_TS_S_ID2I =Integer.parseInt(EG_TS_S_ID2I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_ID2I1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_ID2I =Integer.parseInt(EG_TS_S_ID2I1);
    	            	}
	            break;
	            case "SABRE-L8YI": 
	            	 if(element.equals("SABRE-L8YI"))
		    	       {     
		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
		    	
		    	 
		    	 String EG_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
	    		    
		    	 EG_TS_S_L8YI =Integer.parseInt(EG_TS_S_L8YI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_L8YI1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_L8YI =Integer.parseInt(EG_TS_S_L8YI1);
    	            	}
	            break;
	            case "SABRE-L9AI": 
	            	 if(element.equals("SABRE-L9AI"))
		    	       {     
		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
		    	
		    	 
		    	 String EG_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
	    		    
		    	 EG_TS_S_L9AI =Integer.parseInt(EG_TS_S_L9AI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_L9AI1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_L9AI =Integer.parseInt(EG_TS_S_L9AI1);
    	            	}
	            break;
	            case "SABRE-L9CI": 
	            	 if(element.equals("SABRE-L9CI"))
		    	       {     
		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
		    	
		    	 
		    	 String EG_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
	    		    
		    	 EG_TS_S_L9CI =Integer.parseInt(EG_TS_S_L9CI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_L9CI1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_L9CI =Integer.parseInt(EG_TS_S_L9CI1);
    	            	}
	            break;
	            case "SABRE-T13I": 
	            	 if(element.equals("SABRE-T13I"))
		    	       {     
		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
		    	
		    	 
		    	 String EG_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
	    		    
		    	 EG_TS_S_T13I =Integer.parseInt(EG_TS_S_T13I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_T13I1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_T13I =Integer.parseInt(EG_TS_S_T13I1);
    	            	}
	            break;
	            case "SABRE-T20I": 
	            	 if(element.equals("SABRE-T20I"))
		    	       {     
		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
		    	
		    	 
		    	 String EG_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
	    		    
		    	 EG_TS_S_T20I =Integer.parseInt(EG_TS_S_T20I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_T20I1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_T20I =Integer.parseInt(EG_TS_S_T20I1);
    	            	}
	            break;
	            case "SALAM": 
	            	 if(element.equals("SALAM"))
		    	       {     
		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
		    	
		    	 
		    	 String EG_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
	    		    
		    	 EG_TS_SALAM =Integer.parseInt(EG_TS_SALAM1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_SALAM1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_SALAM =Integer.parseInt(EG_TS_SALAM1);
    	            	}
	            break;
	            case "SpiceJet": 
	            	 if(element.equals("SpiceJet"))
		    	       {     
		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
		    	
		    	 
		    	 String EG_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
	    		    
		    	 EG_TS_S_Jet =Integer.parseInt(EG_TS_S_Jet1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_S_Jet1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_S_Jet =Integer.parseInt(EG_TS_S_Jet1);
    	            	}
	            break;
	            case "UAPI-3R1G": 
	            	 if(element.equals("UAPI-3R1G"))
		    	       {     
		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
		    	
		    	 
		    	 String EG_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
	    		    
		    	 EG_TS_U_3R1G =Integer.parseInt(EG_TS_U_3R1G1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_3R1G1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_3R1G =Integer.parseInt(EG_TS_U_3R1G1);
    	            	}
	            break;
	            case "UAPI-570E": 
	            	 if(element.equals("UAPI-570E"))
		    	       {     
		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
		    	
		    	 
		    	 String EG_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
	    		    
		    	 EG_TS_U_570E =Integer.parseInt(EG_TS_U_570E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_570E1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_570E =Integer.parseInt(EG_TS_U_570E1);
    	            	}
	            break;
	            case "UAPI-5N61": 
	            	 if(element.equals("UAPI-5N61"))
		    	       {     
		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
		    	
		    	 
		    	 String EG_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
	    		    
		    	 EG_TS_U_5N61 =Integer.parseInt(EG_TS_U_5N611);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_5N61 =Integer.parseInt(EG_TS_U_5N611);
    	            	}
	            break;
	            case "UAPI-6E": 
	            	 if(element.equals("UAPI-6E"))
		    	       {     
		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
		    	
		    	 
		    	 String EG_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
	    		    
		    	 EG_TS_U_6E =Integer.parseInt(EG_TS_U_6E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_6E1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_6E =Integer.parseInt(EG_TS_U_6E1);
    	            	}
	            break;
	            case "UAPI-7FK5": 
	            	 if(element.equals("UAPI-7FK5"))
		    	       {     
		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
		    	
		    	 
		    	 String EG_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
	    		    
		    	 EG_TS_U_7FK5 =Integer.parseInt(EG_TS_U_7FK51);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_7FK5 =Integer.parseInt(EG_TS_U_7FK51);
    	            	}
	            break;
	            case "UAPI-7JY2": 
	            	 if(element.equals("UAPI-7JY2"))
		    	       {     
		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
		    	
		    	 
		    	 String EG_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
	    		    
		    	 EG_TS_U_7JY2 =Integer.parseInt(EG_TS_U_7JY21);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_7JY2 =Integer.parseInt(EG_TS_U_7JY21);
    	            	}
	            break;
	            case "UAPI-802N": 
	            	 if(element.equals("UAPI-802N"))
		    	       {     
		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
		    	
		    	 
		    	 String EG_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
	    		    
		    	 EG_TS_U_802N =Integer.parseInt(EG_TS_U_802N1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_802N1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_802N =Integer.parseInt(EG_TS_U_802N1);
    	            	}
	            break;
	            case "UAPI-802R": 
	            	 if(element.equals("UAPI-802R"))
		    	       {     
		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
		    	
		    	 
		    	 String EG_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
	    		    
		    	 EG_TS_U_802R =Integer.parseInt(EG_TS_U_802R1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_802R1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_802R =Integer.parseInt(EG_TS_U_802R1);
    	            	}
	            break;
	            case "UAPI-8SQ7": 
	            	 if(element.equals("UAPI-8SQ7"))
		    	       {     
		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
		    	
		    	 
		    	 String EG_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
	    		    
		    	 EG_TS_U_8SQ7 =Integer.parseInt(EG_TS_U_8SQ71);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_U_8SQ71 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_U_8SQ7 =Integer.parseInt(EG_TS_U_8SQ71);
    	            	}
	            break;
	            case "WATANIYA": 
	            	 if(element.equals("WATANIYA"))
		    	       {     
		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
		    	
		    	 
		    	 String EG_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
	    		    
		    	 EG_TS_WATANIYA =Integer.parseInt(EG_TS_WATANIYA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_WATANIYA1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_WATANIYA =Integer.parseInt(EG_TS_WATANIYA1);
    	            	}
	            break;
	            case "Air Arabia": 
	            	 if(element.equals("Air Arabia"))
		    	       {     
		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
		    	
		    	 
		    	 String EG_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
	    		    
		    	 EG_TS_A_AR =Integer.parseInt(EG_TS_A_AR1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_A_AR1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_A_AR =Integer.parseInt(EG_TS_A_AR1);
    	            	}
	            break;
	            case "Air Arabia Egypt": 
	            	 if(element.equals("Air Arabia Egypt"))
		    	       {     
		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
		    	
		    	 
		    	 String EG_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
	    		    
		    	 EG_TS_A_AR_E =Integer.parseInt(EG_TS_A_AR_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_A_AR_E1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_A_AR_E =Integer.parseInt(EG_TS_A_AR_E1);
    	            	}
	            break;
	            case "Air Arabia Moroc": 
	            	 if(element.equals("Air Arabia Moroc"))
		    	       {     
		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
		    	
		    	 
		    	 String EG_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
	    		    
		    	 EG_TS_A_AR_M =Integer.parseInt(EG_TS_A_AR_M1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_A_AR_M1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_A_AR_M =Integer.parseInt(EG_TS_A_AR_M1);
    	            	}
	            break;
	            case "AirIndiaExpress": 
	            	 if(element.equals("AirIndiaExpress"))
		    	       {     
		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
		    	
		    	 
		    	 String EG_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
	    		    
		    	 EG_TS_A_I_E =Integer.parseInt(EG_TS_A_I_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_A_I_E1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_A_I_E =Integer.parseInt(EG_TS_A_I_E1);
    	            	}
	            break;
	            case "FlyDubai": 
	            	 if(element.equals("FlyDubai"))
		    	       {     
		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
		    	
		    	 
		    	 String EG_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
	    		    
		    	 EG_TS_FlyDubai =Integer.parseInt(EG_TS_FlyDubai1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_FlyDubai1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_FlyDubai =Integer.parseInt(EG_TS_FlyDubai1);
    	            	}
	            break;
	            case "Flynas": 
	            	 if(element.equals("Flynas"))
		    	       {     
		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
		    	
		    	 
		    	 String EG_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
	    		    
		    	 EG_TS_Flynas =Integer.parseInt(EG_TS_Flynas1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String EG_TS_Flynas1 =String.format("%1s",0);   		    	
			    		    
	            		 EG_TS_Flynas =Integer.parseInt(EG_TS_Flynas1);
    	            	}
	            break;
	            
	            
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  
        
        int TotalValue = EG_TS_G_3R1+EG_TS_G_570E+EG_TS_G_5N61+EG_TS_G_7FK5+EG_TS_G_7JY2+EG_TS_G_7X7W+EG_TS_G_802N+EG_TS_G_802R
        		+EG_TS_G_8SQ7+EG_TS_JAZEERA+EG_TS_KIWI+EG_TS_M_u+EG_TS_My_Fly+EG_TS_NESMA+EG_TS_PEGASUS+EG_TS_S_9JFH+EG_TS_S_ID2I
        		+EG_TS_S_L8YI+EG_TS_S_L9AI+EG_TS_S_L9CI+EG_TS_S_T13I+EG_TS_S_T20I+EG_TS_SALAM+EG_TS_S_Jet+EG_TS_U_3R1G+EG_TS_U_570E
        		+EG_TS_U_5N61+EG_TS_U_6E+EG_TS_U_7FK5+EG_TS_U_7JY2+EG_TS_U_802N+EG_TS_U_802R+EG_TS_U_8SQ7+EG_TS_WATANIYA+EG_TS_A_AR
        		+EG_TS_A_AR_E+EG_TS_A_AR_M+EG_TS_A_I_E+EG_TS_FlyDubai+EG_TS_Flynas;
		  
        EG_TS_Supplier_Transaction_Total = TotalValue; 
		 System.out.println("Supplier Trancation Successfull total:::----"+EG_TS_Supplier_Transaction_Total);
		
		
    
   
		//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	}
	      
	
    	  
	
	
	
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
