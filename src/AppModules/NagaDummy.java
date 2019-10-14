package AppModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Loginpage;


public class NagaDummy {
	
	static int Com_TS_Transaction_Total;
	static int Com_TS_Other_TrancationSuccessfull;
	static int Com_CP_conformation_pending_Total;
	static int Com_CP_Other_conformation_pending;
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
	static int intcre;

	public static void AllStatus_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
		
		//COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
		
		Loginpage.EG_link().click();
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
    	 Calendar cal = Calendar.getInstance();
	  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
	  	 
	  	   cal.add(Calendar.DATE, -1);
	  	   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));  
	  	  String st=dateFormat.format(cal.getTime());
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
    		//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
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
    	
    		/*List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
    		 
    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());*/
    		
    		
    		
    		  List<WebElement> links=driver.findElements(By.xpath("//ul[@class='pagination pull-right']/li/a")); 
    		  System.out.println("Links:"+links.size());
    		  System.out.println("No of links:" + links.size());
    			String link[] = new String[links.size()];
    			System.out.println("Link names are:");
    			System.out.println("**************************");
    			int i = 0;
    			for (WebElement e : links) {
    				link[i] = e.getText();
    				System.out.println(link[i]);
    				i++;
    			}
    			System.out.println("**************************");
    			for (String l : link) {
    				Thread.sleep(2000);
    				
    				if("«".equals(l) || "»".equals(l))
    				{
    					driver.findElement(By.linkText(l)).click();
    					System.out.println("Not click");
    				}
    				else if(!"»".equals(l))
    				{
    					
    				
    				
    			  
    				
    				
    				driver.findElement(By.linkText(l)).click();
    			  
    			 List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10]"));
    			
    	    		  intcre=WE1.size();
    	    		  System.out.println(intcre);
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
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='WEGO']"));

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
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='B2C']"));

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
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBIOS']"));

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
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='MOBAPP']"));

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
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SKYSCN']"));

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
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='DHREHLAT']"));

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
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='AVIASALES']"));

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
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='KAYAK']"));

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
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='DOHOP']"));

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
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='FARECOMPARE']"));

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
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[10][text()='SHOOGLOO']"));

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
    	        }
    				}
    			
    	   
    		  
    	              
    			
    	
    	
    	      
      
	        
	        int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobIos +Com_TS_skyscan+Com_TS_MobAnd
	        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
			  
	        Com_TS_Transaction_Total = TotalValue; 
			 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
			
			 int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
	 	    	
			 Com_TS_Other_TrancationSuccessfull =Other; 
				System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
        
        
       
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    			
    	}
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
