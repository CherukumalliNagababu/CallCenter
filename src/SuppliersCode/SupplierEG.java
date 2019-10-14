package SuppliersCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.Loginpage;

public class SupplierEG extends SupplierSA {
	
	protected static int EG_UniqueCount_TS;
	protected static int EG_UniqueCount_CP;
	protected static int EG_UniqueCount_RP;
	protected static int EG_UniqueCount_SD;
	protected static int EG_UniqueCount_CN;
	protected static int EG_UniqueCount_TH;
	
	//EG Suppliers
		public static int EG_TS_Supplier_Transaction_Total;
		protected static int EG_TS_G_3K6;
		protected static int EG_TS_G_3R1;
		protected static int EG_TS_G_570E;
		protected static int EG_TS_G_5N61;
		protected static int EG_TS_G_7FK5;
		protected static int EG_TS_G_7JY2 ;
		protected static int  EG_TS_G_7X7W;
		protected static int EG_TS_G_802N;
		protected static int EG_TS_G_802R;
		protected static int EG_TS_G_8SQ7;
		protected static int EG_TS_JAZEERA;
		protected static int EG_TS_KIWI;
		protected static int EG_TS_M_u;
		protected static int EG_TS_My_Fly;
		protected static int EG_TS_NESMA;
		protected static int EG_TS_PEGASUS;
		protected static int EG_TS_S_9JFH ;
		protected static int  EG_TS_S_ID2I;
		protected static int EG_TS_S_L8YI;
		protected static int EG_TS_S_L9AI;
		protected static int EG_TS_S_L9CI;
		protected static int EG_TS_S_T13I;
		protected static int EG_TS_S_T20I;
		protected static int EG_TS_SALAM;
		protected static int EG_TS_S_Jet;
		protected static int EG_TS_U_3R1G;
		protected static int EG_TS_U_570E;
		protected static int EG_TS_U_5N61 ;
		protected static int  EG_TS_U_6E;
		protected static int EG_TS_U_7FK5;
		protected static int EG_TS_U_7JY2;
		protected static int EG_TS_U_802N;
		protected static int EG_TS_U_802R;
		protected static int EG_TS_U_8SQ7;
		protected static int EG_TS_WATANIYA;
		protected static int EG_TS_A_AR;
		protected static int EG_TS_A_AR_E;
		protected static int EG_TS_A_AR_M;
		protected static int EG_TS_A_I_E;
		protected static int  EG_TS_FlyDubai;
		protected static int EG_TS_Flynas;
		protected static int EG_TS_Flyadeal;
		protected static int EG_TS_GAL7Q;
		protected static int EG_TS_S_1LNJ;
		
		//ConFirmationPending
		
		public static int EG_CP_Supplier_ConfirmationPending_Total;
		protected static int EG_CP_G_3K6;
		protected static int EG_CP_G_3R1;
		protected static int EG_CP_G_570E;
		protected static int EG_CP_G_5N61;
		protected static int EG_CP_G_7FK5;
		protected static int EG_CP_G_7JY2 ;
		protected static int  EG_CP_G_7X7W;
		protected static int EG_CP_G_802N;
		protected static int EG_CP_G_802R;
		protected static int EG_CP_G_8SQ7;
		protected static int EG_CP_JAZEERA;
		protected static int EG_CP_KIWI;
		protected static int EG_CP_M_u;
		protected static int EG_CP_My_Fly;
		protected static int EG_CP_NESMA;
		protected static int EG_CP_PEGASUS;
		protected static int EG_CP_S_9JFH ;
		protected static int  EG_CP_S_ID2I;
		protected static int EG_CP_S_L8YI;
		protected static int EG_CP_S_L9AI;
		protected static int EG_CP_S_L9CI;
		protected static int EG_CP_S_T13I;
		protected static int EG_CP_S_T20I;
		protected static int EG_CP_SALAM;
		protected static int EG_CP_S_Jet;
		protected static int EG_CP_U_3R1G;
		protected static int EG_CP_U_570E;
		protected static int EG_CP_U_5N61 ;
		protected static int  EG_CP_U_6E;
		protected static int EG_CP_U_7FK5;
		protected static int EG_CP_U_7JY2;
		protected static int EG_CP_U_802N;
		protected static int EG_CP_U_802R;
		protected static int EG_CP_U_8SQ7;
		protected static int EG_CP_WATANIYA;
		protected static int EG_CP_A_AR;
		protected static int EG_CP_A_AR_E;
		protected static int EG_CP_A_AR_M;
		protected static int EG_CP_A_I_E;
		protected static int  EG_CP_FlyDubai;
		protected static int EG_CP_Flynas;
		protected static int EG_CP_Flyadeal;
		protected static int EG_CP_GAL7Q;
		protected static int EG_CP_S_1LNJ;
	   //Repricing
		
		protected static int EG_RP_Supplier_Repricing_Total;
		protected static int EG_RP_G_3K6;
		protected static int EG_RP_G_3R1;
		protected static int EG_RP_G_570E;
		protected static int EG_RP_G_5N61;
		protected static int EG_RP_G_7FK5;
		protected static int EG_RP_G_7JY2 ;
		protected static int  EG_RP_G_7X7W;
		protected static int EG_RP_G_802N;
		protected static int EG_RP_G_802R;
		protected static int EG_RP_G_8SQ7;
		protected static int EG_RP_JAZEERA;
		protected static int EG_RP_KIWI;
		protected static int EG_RP_M_u;
		protected static int EG_RP_My_Fly;
		protected static int EG_RP_NESMA;
		protected static int EG_RP_PEGASUS;
		protected static int EG_RP_S_9JFH ;
		protected static int  EG_RP_S_ID2I;
		protected static int EG_RP_S_L8YI;
		protected static int EG_RP_S_L9AI;
		protected static int EG_RP_S_L9CI;
		protected static int EG_RP_S_T13I;
		protected static int EG_RP_S_T20I;
		protected static int EG_RP_SALAM;
		protected static int EG_RP_S_Jet;
		protected static int EG_RP_U_3R1G;
		protected static int EG_RP_U_570E;
		protected static int EG_RP_U_5N61 ;
		protected static int  EG_RP_U_6E;
		protected static int EG_RP_U_7FK5;
		protected static int EG_RP_U_7JY2;
		protected static int EG_RP_U_802N;
		protected static int EG_RP_U_802R;
		protected static int EG_RP_U_8SQ7;
		protected static int EG_RP_WATANIYA;
		protected static int EG_RP_A_AR;
		protected static int EG_RP_A_AR_E;
		protected static int EG_RP_A_AR_M;
		protected static int EG_RP_A_I_E;
		protected static int  EG_RP_FlyDubai;
		protected static int EG_RP_Flynas;
		protected static int EG_RP_Flyadeal;
		protected static int EG_RP_GAL7Q;
		protected static int EG_RP_S_1LNJ;
		
	     //SoldOut
		
		protected static int EG_SD_Supplier_Soldout_Total;
		protected static int EG_SD_G_3K6;
		protected static int EG_SD_G_3R1;
		protected static int EG_SD_G_570E;
		protected static int EG_SD_G_5N61;
		protected static int EG_SD_G_7FK5;
		protected static int EG_SD_G_7JY2 ;
		protected static int  EG_SD_G_7X7W;
		protected static int EG_SD_G_802N;
		protected static int EG_SD_G_802R;
		protected static int EG_SD_G_8SQ7;
		protected static int EG_SD_JAZEERA;
		protected static int EG_SD_KIWI;
		protected static int EG_SD_M_u;
		protected static int EG_SD_My_Fly;
		protected static int EG_SD_NESMA;
		protected static int EG_SD_PEGASUS;
		protected static int EG_SD_S_9JFH ;
		protected static int  EG_SD_S_ID2I;
		protected static int EG_SD_S_L8YI;
		protected static int EG_SD_S_L9AI;
		protected static int EG_SD_S_L9CI;
		protected static int EG_SD_S_T13I;
		protected static int EG_SD_S_T20I;
		protected static int EG_SD_SALAM;
		protected static int EG_SD_S_Jet;
		protected static int EG_SD_U_3R1G;
		protected static int EG_SD_U_570E;
		protected static int EG_SD_U_5N61 ;
		protected static int  EG_SD_U_6E;
		protected static int EG_SD_U_7FK5;
		protected static int EG_SD_U_7JY2;
		protected static int EG_SD_U_802N;
		protected static int EG_SD_U_802R;
		protected static int EG_SD_U_8SQ7;
		protected static int EG_SD_WATANIYA;
		protected static int EG_SD_A_AR;
		protected static int EG_SD_A_AR_E;
		protected static int EG_SD_A_AR_M;
		protected static int EG_SD_A_I_E;
		protected static int  EG_SD_FlyDubai;
		protected static int EG_SD_Flynas;
		protected static int EG_SD_Flyadeal;
		protected static int EG_SD_GAL7Q;
		protected static int EG_SD_S_1LNJ;
		
		
		 //Cancelled
		
		protected static int EG_CN_Supplier_Cancelled_Total;
		protected static int EG_CN_G_3K6;
			protected static int EG_CN_G_3R1;
			protected static int EG_CN_G_570E;
			protected static int EG_CN_G_5N61;
			protected static int EG_CN_G_7FK5;
			protected static int EG_CN_G_7JY2 ;
			protected static int  EG_CN_G_7X7W;
			protected static int EG_CN_G_802N;
			protected static int EG_CN_G_802R;
			protected static int EG_CN_G_8SQ7;
			protected static int EG_CN_JAZEERA;
			protected static int EG_CN_KIWI;
			protected static int EG_CN_M_u;
			protected static int EG_CN_My_Fly;
			protected static int EG_CN_NESMA;
			protected static int EG_CN_PEGASUS;
			protected static int EG_CN_S_9JFH ;
			protected static int  EG_CN_S_ID2I;
			protected static int EG_CN_S_L8YI;
			protected static int EG_CN_S_L9AI;
			protected static int EG_CN_S_L9CI;
			protected static int EG_CN_S_T13I;
			protected static int EG_CN_S_T20I;
			protected static int EG_CN_SALAM;
			protected static int EG_CN_S_Jet;
			protected static int EG_CN_U_3R1G;
			protected static int EG_CN_U_570E;
			protected static int EG_CN_U_5N61 ;
			protected static int  EG_CN_U_6E;
			protected static int EG_CN_U_7FK5;
			protected static int EG_CN_U_7JY2;
			protected static int EG_CN_U_802N;
			protected static int EG_CN_U_802R;
			protected static int EG_CN_U_8SQ7;
			protected static int EG_CN_WATANIYA;
			protected static int EG_CN_A_AR;
			protected static int EG_CN_A_AR_E;
			protected static int EG_CN_A_AR_M;
			protected static int EG_CN_A_I_E;
			protected static int  EG_CN_FlyDubai;
			protected static int EG_CN_Flynas;
			protected static int EG_CN_Flyadeal;
			protected static int EG_CN_GAL7Q;
			protected static int EG_CN_S_1LNJ;
			
			
			//Transaction Hold
			
			protected static int EG_TH_Supplier_Transaction_Hold_Total;
			protected static int EG_TH_G_3K6;
				protected static int EG_TH_G_3R1;
				protected static int EG_TH_G_570E;
				protected static int EG_TH_G_5N61;
				protected static int EG_TH_G_7FK5;
				protected static int EG_TH_G_7JY2 ;
				protected static int  EG_TH_G_7X7W;
				protected static int EG_TH_G_802N;
				protected static int EG_TH_G_802R;
				protected static int EG_TH_G_8SQ7;
				protected static int EG_TH_JAZEERA;
				protected static int EG_TH_KIWI;
				protected static int EG_TH_M_u;
				protected static int EG_TH_My_Fly;
				protected static int EG_TH_NESMA;
				protected static int EG_TH_PEGASUS;
				protected static int EG_TH_S_9JFH ;
				protected static int  EG_TH_S_ID2I;
				protected static int EG_TH_S_L8YI;
				protected static int EG_TH_S_L9AI;
				protected static int EG_TH_S_L9CI;
				protected static int EG_TH_S_T13I;
				protected static int EG_TH_S_T20I;
				protected static int EG_TH_SALAM;
				protected static int EG_TH_S_Jet;
				protected static int EG_TH_U_3R1G;
				protected static int EG_TH_U_570E;
				protected static int EG_TH_U_5N61 ;
				protected static int  EG_TH_U_6E;
				protected static int EG_TH_U_7FK5;
				protected static int EG_TH_U_7JY2;
				protected static int EG_TH_U_802N;
				protected static int EG_TH_U_802R;
				protected static int EG_TH_U_8SQ7;
				protected static int EG_TH_WATANIYA;
				protected static int EG_TH_A_AR;
				protected static int EG_TH_A_AR_E;
				protected static int EG_TH_A_AR_M;
				protected static int EG_TH_A_I_E;
				protected static int  EG_TH_FlyDubai;
				protected static int EG_TH_Flynas;
				protected static int EG_TH_Flyadeal;
				protected static int EG_TH_GAL7Q;
				protected static int EG_TH_S_1LNJ;
				
				protected static ArrayList  Suppliers_TS_EG=new ArrayList();
				protected static ArrayList  Suppliers_CP_EG=new ArrayList();
				protected static ArrayList  Suppliers_RP_EG=new ArrayList();
				protected static ArrayList  Suppliers_SD_EG=new ArrayList();
				protected static ArrayList  Suppliers_CN_EG=new ArrayList();
				protected static ArrayList  Suppliers_TH_EG=new ArrayList();
				
				public static void Supplier()
				{
					 ArrayList<String>values=new ArrayList<>();
					 values.addAll(Suppliers_TS_EG);
					 System.out.println( "values of TS:"+values);
					 values.addAll(Suppliers_CP_EG);
					 System.out.println( "values of CP:"+values);
					 values.addAll(Suppliers_RP_EG);
					 System.out.println( "values of RP:"+values);
					 values.addAll(Suppliers_SD_EG);
					 System.out.println( "values of SD:"+values);
					 values.addAll(Suppliers_CN_EG);
					 System.out.println( "values of CN:"+values);
					 values.addAll(Suppliers_TH_EG);
					 System.out.println( "values of TH:"+values);
					
					 
					 System.out.println("Total values of Suppliers:"+values);
					ArrayList<String> uniqueSupplier = removeDuplicates(values);
					System.out.println("After Remove Suppliers Names:"+uniqueSupplier);
					  System.out.println("Suppliers value of range:"+uniqueSupplier.size());
					 
				}
				
	
	public static void Suppliers_EG(int iTestCaseRow,WebDriver driver) throws Exception
	{
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
					 Suppliers_TS_EG.add(element1.getText());
				  }
				  ArrayList<String> unique = removeDuplicates(list);
				  System.out.println("unique:"+unique.size());
				  EG_UniqueCount_TS=unique.size();
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
				
				
		    
		   
				}
			
			
			//*******************Supplier  ConfirmationPending*********************************************
					Select Supplier_conP=new Select(Loginpage.BookingSatus());
					Supplier_conP.selectByVisibleText("Confirmation Pending, do not rebook");
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					
					long timeoutInSecondsconp = 85;
					WebDriverWait waitconp = new WebDriverWait(driver, timeoutInSecondsconp);
					waitconp.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					String EG_Conp_count=Loginpage.FlightResults_text().getText();
					System.out.println(EG_Conp_count);
					
					
					String Eg_Conp = EG_Conp_count.trim();
					String[] Eg_conpsplited = Eg_Conp.split("\\:");
					System.out.println("No of Results Count"+Eg_conpsplited[1]);
					Thread.sleep(1000);
					
					
					if("Flight Search Results : 0".equals(EG_Conp_count))
					{
						
						System.out.println("Supplier Confirmation Pending total:::----0");
						
						EG_CP_G_3R1=0;
						EG_CP_G_570E=0;
						EG_CP_G_5N61=0;
						EG_CP_G_7FK5=0;
						EG_CP_G_7JY2=0;
						EG_CP_G_7X7W=0;
						EG_CP_G_802N=0;
						EG_CP_G_802R=0;
						EG_CP_G_8SQ7=0;
						EG_CP_JAZEERA=0;
						EG_CP_KIWI=0;
						EG_CP_M_u=0;
						EG_CP_My_Fly=0;
						EG_CP_NESMA=0;
						EG_CP_PEGASUS=0;
						EG_CP_S_9JFH=0;
						EG_CP_S_ID2I=0;
						EG_CP_S_L8YI=0;
						EG_CP_S_L9AI=0;
						EG_CP_S_L9CI=0;
						EG_CP_S_T13I=0;
						EG_CP_S_T20I=0;
						EG_CP_SALAM=0;
						EG_CP_S_Jet=0;
						EG_CP_U_3R1G=0;
						EG_CP_U_570E=0;
						EG_CP_U_5N61=0;
						EG_CP_U_6E=0;
						EG_CP_U_7FK5=0;
						EG_CP_U_7JY2=0;
						EG_CP_U_802N=0;
						EG_CP_U_802R=0;
						EG_CP_U_8SQ7=0;
						EG_CP_WATANIYA=0;
						EG_CP_A_AR=0;
						EG_CP_A_AR_E=0;
						EG_CP_A_AR_M=0;
						EG_CP_A_I_E=0;
						EG_CP_FlyDubai=0;
						EG_CP_Flynas=0;
					         
						
						
				         int TotalValue =0;
				         EG_CP_Supplier_ConfirmationPending_Total = TotalValue; 
				 				 System.out.println("Supplier Trancation Successfull total:::----"+EG_CP_Supplier_ConfirmationPending_Total);
				 				
				 				
				 	        
				        
				      
					}
					else
					{
					
						List<WebElement> CP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
						 
						  System.out.println("Total Number of Supplier:" + CP.size());
						
						ArrayList<String>list=new ArrayList<>();
						
						 for (WebElement element1 : CP)
						  {
							 list.add(element1.getText());
							 Suppliers_CP_EG.add(element1.getText());
						  }
						  ArrayList<String> unique = removeDuplicates(list);
						  System.out.println("unique:"+unique.size());
						  EG_UniqueCount_CP=unique.size();
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

						    	System.out.println("No of G_3R1 Confirmation Pending:" + G_3R1.size());
						    	String EG_CP_G_3R11 =String.format("%1s",G_3R1.size());
						    	
						    	
						    	 EG_CP_G_3R1 =Integer.parseInt(EG_CP_G_3R11);
						    	
						    	       }
					            	else
					            	{
					            		String EG_CP_G_3R11 =String.format("%1s",0);
					    		    	
					    		    	
					            		EG_CP_G_3R1 =Integer.parseInt(EG_CP_G_3R11);
					            	}
						    	      
					            break; 
					            
					            case "Galileo-570E": 
					            	   
						    	       if(element.equals("Galileo-570E"))
						    	       {
						    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

						    	  System.out.println("No of Galileo-570E Confirmation Pending:" + G_570E.size());
						    	  String EG_CP_G_570E1 =String.format("%1s",G_570E.size());
						    	  
				    		    	
				    		    	
						    	  EG_CP_G_570E =Integer.parseInt(EG_CP_G_570E1);
						    	       }
						    	       else
				    	            	{
						    	    	   String EG_CP_G_570E1 =String.format("%1s",0);
						    		    	  
						    		    	
						    		    	
						    	    	   EG_CP_G_570E =Integer.parseInt(EG_CP_G_570E1);
				    	            	}
						    	      
					            break;  
					            case "Galileo-5N61": 
					            	 if(element.equals("Galileo-5N61"))
						    	       {   
						    	       
						    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

						    	System.out.println("No of Galileo-5N61 Confirmation Pending:" + G_5N61.size());
						    	
						    	
						    	 String EG_CP_G_5N611 =String.format("%1s",G_5N61.size());   		    	
				    		    
						    	 EG_CP_G_5N61 =Integer.parseInt(EG_CP_G_5N611);
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_G_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_G_5N61 =Integer.parseInt(EG_CP_G_5N611);
				    	            	}
					            break; 
					            case "Galileo-7FK5": 
					            	 if(element.equals("Galileo-7FK5"))
						    	       {   
						    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

						    	System.out.println("No of Galileo-7FK5 Confirmation Pending:" + G_7FK5.size());
						    	 
						    	 String EG_CP_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
					    		    
						    	 EG_CP_G_7FK5 =Integer.parseInt(EG_CP_G_7FK51);
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_G_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_G_7FK5 =Integer.parseInt(EG_CP_G_7FK51);
				    	            	}
						    	      
					            break; 
					            case "Galileo-7JY2": 
					            	 if(element.equals("Galileo-7JY2"))
						    	       {        
						    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

						    	System.out.println("No of Galileo-7JY2 Confirmation Pending:" + G_7JY2.size());
						    	
						    	 String EG_CP_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
					    		    
						    	 EG_CP_G_7JY2 =Integer.parseInt(EG_CP_G_7JY21);
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_G_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_G_7JY2 =Integer.parseInt(EG_CP_G_7JY21);
				    	            	}
						    	     
						    	       
					            break;  
					            case "Galileo-7X7W": 
					            	  if(element.equals("Galileo-7X7W"))
						    	       {   
						    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

						    	System.out.println("No of Galileo-7X7W Confirmation Pending:" + G_7X7W.size());
						    	
						    	
						    	String EG_CP_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
				    		    
						    	EG_CP_G_7X7W =Integer.parseInt(EG_CP_G_7X7W1);
						    	       }
					            	  else
				    	            	{
					            			String EG_CP_G_7X7W1 =String.format("%1s",0);   		    	
							    		    
					            			EG_CP_G_7X7W =Integer.parseInt(EG_CP_G_7X7W1);
				    	            	}
					            break; 
					            case "Galileo-802N": 
					            	  if(element.equals("Galileo-802N"))
						    	       {        
						    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

						    	System.out.println("No of Galileo-802N Confirmation Pending:" + G_802N.size());
						    	
						    	
						    	String EG_CP_G_802N1 =String.format("%1s",G_802N.size());   		    	
				    		    
						    	EG_CP_G_802N =Integer.parseInt(EG_CP_G_802N1);
						    	
						    	       }
					            	  else
				    	            	{
					            		  String EG_CP_G_802N1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_CP_G_802N =Integer.parseInt(EG_CP_G_802N1);
				    	            	}
						    	      
						    	     
					            break;
					            case "Galileo-802R": 
					            	  if(element.equals("Galileo-802R"))
						    	       {   
						    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

						    	System.out.println("No of Galileo-802R Confirmation Pending:" + G_802R.size());
						    	
						    	String EG_CP_G_802R1 =String.format("%1s",G_802R.size());   		    	
				    		    
						    	EG_CP_G_802R =Integer.parseInt(EG_CP_G_802R1);
						    	       }
						    	       
					            	  else
				    	            	{
					            		  String EG_CP_G_802R1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_CP_G_802R =Integer.parseInt(EG_CP_G_802R1);
				    	            	}
						    	       
					            break; 
					            case "Galileo-8SQ7": 
					            	if(element.equals("Galileo-8SQ7"))
						    	       {  
						    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

						    	System.out.println("No of Galileo-8SQ7 Confirmation Pending:" + G_8SQ7.size());
						    	 
						    	 String EG_CP_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
					    		    
						    	 EG_CP_G_8SQ7 =Integer.parseInt(EG_CP_G_8SQ71);
						    	       }
					            	else
					            	{
					            		String EG_CP_G_8SQ71 =String.format("%1s",0);   		    	
						    		    
					            		EG_CP_G_8SQ7 =Integer.parseInt(EG_CP_G_8SQ71);
					            	}
						    	     
					            break;
					            case "JAZEERA": 
					            	
					            	  if(element.equals("JAZEERA"))
						    	       {  
						    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

						     	System.out.println("No of JAZEERA Confirmation Pending:" + JAZEERA.size());
						    	 
						    	 String EG_CP_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
					    		    
						    	 EG_CP_JAZEERA =Integer.parseInt(EG_CP_JAZEERA1);
						    	       }
					            	  else
				    	            	{
					            		  
						    		    	 String EG_CP_JAZEERA1 =String.format("%1s",0);   		    	
								    		    
						    		    	 EG_CP_JAZEERA =Integer.parseInt(EG_CP_JAZEERA1);
				    	            	}
						    	      
					            break; 
					            case "KIWI": 
					            	 if(element.equals("KIWI"))
						    	       {     
						    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

						    	System.out.println("No of KIWI Confirmation Pending:" + KIWI.size());
						    	
						    	 
						    	 String EG_CP_KIWI1 =String.format("%1s",KIWI.size());   		    	
					    		    
						    	 EG_CP_KIWI =Integer.parseInt(EG_CP_KIWI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_KIWI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_KIWI =Integer.parseInt(EG_CP_KIWI1);
				    	            	}
					            break;
					            case "Manual": 
					            	 if(element.equals("Manual"))
						    	       {     
						    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

						    	System.out.println("No of Manual Confirmation Pending:" + M_u.size());
						    	
						    	 
						    	 String EG_CP_M_u1 =String.format("%1s",M_u.size());   		    	
					    		    
						    	 EG_CP_M_u =Integer.parseInt(EG_CP_M_u1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_M_u1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_M_u =Integer.parseInt(EG_CP_M_u1);
				    	            	}
					            break;
					            case "MystiFly": 
					            	 if(element.equals("MystiFly"))
						    	       {     
						    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

						    	System.out.println("No of MystiFly Confirmation Pending:" + My_Fly.size());
						    	
						    	 
						    	 String EG_CP_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
					    		    
						    	 EG_CP_My_Fly =Integer.parseInt(EG_CP_My_Fly1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_My_Fly1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_My_Fly =Integer.parseInt(EG_CP_My_Fly1);
				    	            	}
					            break;
					            case "NESMA": 
					            	 if(element.equals("NESMA"))
						    	       {     
						    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

						    	System.out.println("No of NESMA Confirmation Pending:" + NESMA.size());
						    	
						    	 
						    	 String EG_CP_NESMA1 =String.format("%1s",NESMA.size());   		    	
					    		    
						    	 EG_CP_NESMA =Integer.parseInt(EG_CP_NESMA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_NESMA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_NESMA =Integer.parseInt(EG_CP_NESMA1);
				    	            	}
					            break;
					            case "PEGASUS": 
					            	 if(element.equals("PEGASUS"))
						    	       {     
						    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

						    	System.out.println("No of PEGASUS Confirmation Pending:" + PEGASUS.size());
						    	
						    	 
						    	 String EG_CP_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
					    		    
						    	 EG_CP_PEGASUS =Integer.parseInt(EG_CP_PEGASUS1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_PEGASUS1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_PEGASUS =Integer.parseInt(EG_CP_PEGASUS1);
				    	            	}
					            break;
					            case "SABRE-9JFH": 
					            	 if(element.equals("SABRE-9JFH"))
						    	       {     
						    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

						    	System.out.println("No of SABRE-9JFH Confirmation Pending:" + S_9JFH.size());
						    	
						    	 
						    	 String EG_CP_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
					    		    
						    	 EG_CP_S_9JFH =Integer.parseInt(EG_CP_S_9JFH1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_9JFH1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_9JFH =Integer.parseInt(EG_CP_S_9JFH1);
				    	            	}
					            break;
					            case "SABRE-ID2I": 
					            	 if(element.equals("SABRE-ID2I"))
						    	       {     
						    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

						    	System.out.println("No of SABRE-ID2I Confirmation Pending:" + S_ID2I.size());
						    	
						    	 
						    	 String EG_CP_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
					    		    
						    	 EG_CP_S_ID2I =Integer.parseInt(EG_CP_S_ID2I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_ID2I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_ID2I =Integer.parseInt(EG_CP_S_ID2I1);
				    	            	}
					            break;
					            case "SABRE-L8YI": 
					            	 if(element.equals("SABRE-L8YI"))
						    	       {     
						    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

						    	System.out.println("No of SABRE-L8YI Confirmation Pending:" + S_L8YI.size());
						    	
						    	 
						    	 String EG_CP_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
					    		    
						    	 EG_CP_S_L8YI =Integer.parseInt(EG_CP_S_L8YI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_L8YI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_L8YI =Integer.parseInt(EG_CP_S_L8YI1);
				    	            	}
					            break;
					            case "SABRE-L9AI": 
					            	 if(element.equals("SABRE-L9AI"))
						    	       {     
						    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

						    	System.out.println("No of SABRE-L9AI Confirmation Pending:" + S_L9AI.size());
						    	
						    	 
						    	 String EG_CP_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
					    		    
						    	 EG_CP_S_L9AI =Integer.parseInt(EG_CP_S_L9AI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_L9AI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_L9AI =Integer.parseInt(EG_CP_S_L9AI1);
				    	            	}
					            break;
					            case "SABRE-L9CI": 
					            	 if(element.equals("SABRE-L9CI"))
						    	       {     
						    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

						    	System.out.println("No of SABRE-L9CI Confirmation Pending:" + S_L9CI.size());
						    	
						    	 
						    	 String EG_CP_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
					    		    
						    	 EG_CP_S_L9CI =Integer.parseInt(EG_CP_S_L9CI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_L9CI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_L9CI =Integer.parseInt(EG_CP_S_L9CI1);
				    	            	}
					            break;
					            case "SABRE-T13I": 
					            	 if(element.equals("SABRE-T13I"))
						    	       {     
						    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

						    	System.out.println("No of SABRE-T13I Confirmation Pending:" + S_T13I.size());
						    	
						    	 
						    	 String EG_CP_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
					    		    
						    	 EG_CP_S_T13I =Integer.parseInt(EG_CP_S_T13I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_T13I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_T13I =Integer.parseInt(EG_CP_S_T13I1);
				    	            	}
					            break;
					            case "SABRE-T20I": 
					            	 if(element.equals("SABRE-T20I"))
						    	       {     
						    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

						    	System.out.println("No of SABRE-T20I Confirmation Pending:" + S_T20I.size());
						    	
						    	 
						    	 String EG_CP_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
					    		    
						    	 EG_CP_S_T20I =Integer.parseInt(EG_CP_S_T20I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_T20I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_T20I =Integer.parseInt(EG_CP_S_T20I1);
				    	            	}
					            break;
					            case "SALAM": 
					            	 if(element.equals("SALAM"))
						    	       {     
						    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

						    	System.out.println("No of SALAM Confirmation Pending:" + SALAM.size());
						    	
						    	 
						    	 String EG_CP_SALAM1 =String.format("%1s",SALAM.size());   		    	
					    		    
						    	 EG_CP_SALAM =Integer.parseInt(EG_CP_SALAM1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_SALAM1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_SALAM =Integer.parseInt(EG_CP_SALAM1);
				    	            	}
					            break;
					            case "SpiceJet": 
					            	 if(element.equals("SpiceJet"))
						    	       {     
						    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

						    	System.out.println("No of SpiceJet Confirmation Pending:" + S_Jet.size());
						    	
						    	 
						    	 String EG_CP_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
					    		    
						    	 EG_CP_S_Jet =Integer.parseInt(EG_CP_S_Jet1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_S_Jet1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_S_Jet =Integer.parseInt(EG_CP_S_Jet1);
				    	            	}
					            break;
					            case "UAPI-3R1G": 
					            	 if(element.equals("UAPI-3R1G"))
						    	       {     
						    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

						    	System.out.println("No of UAPI-3R1G Confirmation Pending:" + U_3R1G.size());
						    	
						    	 
						    	 String EG_CP_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
					    		    
						    	 EG_CP_U_3R1G =Integer.parseInt(EG_CP_U_3R1G1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_3R1G1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_3R1G =Integer.parseInt(EG_CP_U_3R1G1);
				    	            	}
					            break;
					            case "UAPI-570E": 
					            	 if(element.equals("UAPI-570E"))
						    	       {     
						    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

						    	System.out.println("No of UAPI-570E Confirmation Pending:" + U_570E.size());
						    	
						    	 
						    	 String EG_CP_U_570E1 =String.format("%1s",U_570E.size());   		    	
					    		    
						    	 EG_CP_U_570E =Integer.parseInt(EG_CP_U_570E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_570E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_570E =Integer.parseInt(EG_CP_U_570E1);
				    	            	}
					            break;
					            case "UAPI-5N61": 
					            	 if(element.equals("UAPI-5N61"))
						    	       {     
						    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

						    	System.out.println("No of UAPI-5N61 Confirmation Pending:" + U_5N61.size());
						    	
						    	 
						    	 String EG_CP_U_5N611 =String.format("%1s",U_5N61.size());   		    	
					    		    
						    	 EG_CP_U_5N61 =Integer.parseInt(EG_CP_U_5N611);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_5N61 =Integer.parseInt(EG_CP_U_5N611);
				    	            	}
					            break;
					            case "UAPI-6E": 
					            	 if(element.equals("UAPI-6E"))
						    	       {     
						    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

						    	System.out.println("No of UAPI-6E Confirmation Pending:" + U_6E.size());
						    	
						    	 
						    	 String EG_CP_U_6E1 =String.format("%1s",U_6E.size());   		    	
					    		    
						    	 EG_CP_U_6E =Integer.parseInt(EG_CP_U_6E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_6E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_6E =Integer.parseInt(EG_CP_U_6E1);
				    	            	}
					            break;
					            case "UAPI-7FK5": 
					            	 if(element.equals("UAPI-7FK5"))
						    	       {     
						    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

						    	System.out.println("No of UAPI-7FK5 Confirmation Pending:" + U_7FK5.size());
						    	
						    	 
						    	 String EG_CP_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
					    		    
						    	 EG_CP_U_7FK5 =Integer.parseInt(EG_CP_U_7FK51);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_7FK5 =Integer.parseInt(EG_CP_U_7FK51);
				    	            	}
					            break;
					            case "UAPI-7JY2": 
					            	 if(element.equals("UAPI-7JY2"))
						    	       {     
						    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

						    	System.out.println("No of UAPI-7JY2 Confirmation Pending:" + U_7JY2.size());
						    	
						    	 
						    	 String EG_CP_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
					    		    
						    	 EG_CP_U_7JY2 =Integer.parseInt(EG_CP_U_7JY21);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_7JY2 =Integer.parseInt(EG_CP_U_7JY21);
				    	            	}
					            break;
					            case "UAPI-802N": 
					            	 if(element.equals("UAPI-802N"))
						    	       {     
						    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

						    	System.out.println("No of UAPI-802N Confirmation Pending:" + U_802N.size());
						    	
						    	 
						    	 String EG_CP_U_802N1 =String.format("%1s",U_802N.size());   		    	
					    		    
						    	 EG_CP_U_802N =Integer.parseInt(EG_CP_U_802N1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_802N1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_802N =Integer.parseInt(EG_CP_U_802N1);
				    	            	}
					            break;
					            case "UAPI-802R": 
					            	 if(element.equals("UAPI-802R"))
						    	       {     
						    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

						    	System.out.println("No of UAPI-802R Confirmation Pending:" + U_802R.size());
						    	
						    	 
						    	 String EG_CP_U_802R1 =String.format("%1s",U_802R.size());   		    	
					    		    
						    	 EG_CP_U_802R =Integer.parseInt(EG_CP_U_802R1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_802R1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_802R =Integer.parseInt(EG_CP_U_802R1);
				    	            	}
					            break;
					            case "UAPI-8SQ7": 
					            	 if(element.equals("UAPI-8SQ7"))
						    	       {     
						    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

						    	System.out.println("No of UAPI-8SQ7 Confirmation Pending:" + U_8SQ7.size());
						    	
						    	 
						    	 String EG_CP_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
					    		    
						    	 EG_CP_U_8SQ7 =Integer.parseInt(EG_CP_U_8SQ71);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_U_8SQ71 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_U_8SQ7 =Integer.parseInt(EG_CP_U_8SQ71);
				    	            	}
					            break;
					            case "WATANIYA": 
					            	 if(element.equals("WATANIYA"))
						    	       {     
						    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

						    	System.out.println("No of WATANIYA Confirmation Pending:" + WATANIYA.size());
						    	
						    	 
						    	 String EG_CP_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
					    		    
						    	 EG_CP_WATANIYA =Integer.parseInt(EG_CP_WATANIYA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_WATANIYA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_WATANIYA =Integer.parseInt(EG_CP_WATANIYA1);
				    	            	}
					            break;
					            case "Air Arabia": 
					            	 if(element.equals("Air Arabia"))
						    	       {     
						    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

						    	System.out.println("No of Air Arabia Confirmation Pending:" + A_AR.size());
						    	
						    	 
						    	 String EG_CP_A_AR1 =String.format("%1s",A_AR.size());   		    	
					    		    
						    	 EG_CP_A_AR =Integer.parseInt(EG_CP_A_AR1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_A_AR1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_A_AR =Integer.parseInt(EG_CP_A_AR1);
				    	            	}
					            break;
					            case "Air Arabia Egypt": 
					            	 if(element.equals("Air Arabia Egypt"))
						    	       {     
						    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

						    	System.out.println("No of Air Arabia Egypt Confirmation Pending:" + A_AR_E.size());
						    	
						    	 
						    	 String EG_CP_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
					    		    
						    	 EG_CP_A_AR_E =Integer.parseInt(EG_CP_A_AR_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_A_AR_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_A_AR_E =Integer.parseInt(EG_CP_A_AR_E1);
				    	            	}
					            break;
					            case "Air Arabia Moroc": 
					            	 if(element.equals("Air Arabia Moroc"))
						    	       {     
						    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

						    	System.out.println("No of Air Arabia Moroc Confirmation Pending:" + A_AR_M.size());
						    	
						    	 
						    	 String EG_CP_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
					    		    
						    	 EG_CP_A_AR_M =Integer.parseInt(EG_CP_A_AR_M1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_A_AR_M1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_A_AR_M =Integer.parseInt(EG_CP_A_AR_M1);
				    	            	}
					            break;
					            case "AirIndiaExpress": 
					            	 if(element.equals("AirIndiaExpress"))
						    	       {     
						    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

						    	System.out.println("No of AirIndiaExpress Confirmation Pending:" + A_I_E.size());
						    	
						    	 
						    	 String EG_CP_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
					    		    
						    	 EG_CP_A_I_E =Integer.parseInt(EG_CP_A_I_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_A_I_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_A_I_E =Integer.parseInt(EG_CP_A_I_E1);
				    	            	}
					            break;
					            case "FlyDubai": 
					            	 if(element.equals("FlyDubai"))
						    	       {     
						    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

						    	System.out.println("No of FlyDubai Confirmation Pending:" + FlyDubai.size());
						    	
						    	 
						    	 String EG_CP_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
					    		    
						    	 EG_CP_FlyDubai =Integer.parseInt(EG_CP_FlyDubai1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_FlyDubai1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_FlyDubai =Integer.parseInt(EG_CP_FlyDubai1);
				    	            	}
					            break;
					            case "Flynas": 
					            	 if(element.equals("Flynas"))
						    	       {     
						    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

						    	System.out.println("No of Flynas Confirmation Pending:" + Flynas.size());
						    	
						    	 
						    	 String EG_CP_Flynas1 =String.format("%1s",Flynas.size());   		    	
					    		    
						    	 EG_CP_Flynas =Integer.parseInt(EG_CP_Flynas1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CP_Flynas1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CP_Flynas =Integer.parseInt(EG_CP_Flynas1);
				    	            	}
					            break;
					            
					            
					            default:System.out.println("Not in 10, 20 or 30");  
					         
					            }
					           }
					        }
					  
				        
				        int TotalValue = EG_CP_G_3R1+EG_CP_G_570E+EG_CP_G_5N61+EG_CP_G_7FK5+EG_CP_G_7JY2+EG_CP_G_7X7W+EG_CP_G_802N+EG_CP_G_802R
				        		+EG_CP_G_8SQ7+EG_CP_JAZEERA+EG_CP_KIWI+EG_CP_M_u+EG_CP_My_Fly+EG_CP_NESMA+EG_CP_PEGASUS+EG_CP_S_9JFH+EG_CP_S_ID2I
				        		+EG_CP_S_L8YI+EG_CP_S_L9AI+EG_CP_S_L9CI+EG_CP_S_T13I+EG_CP_S_T20I+EG_CP_SALAM+EG_CP_S_Jet+EG_CP_U_3R1G+EG_CP_U_570E
				        		+EG_CP_U_5N61+EG_CP_U_6E+EG_CP_U_7FK5+EG_CP_U_7JY2+EG_CP_U_802N+EG_CP_U_802R+EG_CP_U_8SQ7+EG_CP_WATANIYA+EG_CP_A_AR
				        		+EG_CP_A_AR_E+EG_CP_A_AR_M+EG_CP_A_I_E+EG_CP_FlyDubai+EG_CP_Flynas;
						  
				        EG_CP_Supplier_ConfirmationPending_Total = TotalValue; 
						 System.out.println("Supplier Confirmation Pending total:::----"+EG_CP_Supplier_ConfirmationPending_Total);
						
						
				    
				   
						}
					
					
					//*******************Supplier  Repricing*********************************************
					Select Supplier_Reprice=new Select(Loginpage.BookingSatus());
					Supplier_Reprice.selectByVisibleText("Repricing");
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					
					long timeoutInSecondsrep = 85;
					WebDriverWait waitrep = new WebDriverWait(driver, timeoutInSecondsrep);
					waitrep.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					String EG_Rep_count=Loginpage.FlightResults_text().getText();
					System.out.println(EG_Rep_count);
					
					
					String Eg_rep = EG_Rep_count.trim();
					String[] Eg_repsplited = Eg_rep.split("\\:");
					System.out.println("No of Results Count"+Eg_repsplited[1]);
					Thread.sleep(1000);
					
					
					if("Flight Search Results : 0".equals(EG_Rep_count))
					{
						
						System.out.println("Supplier Repricing total:::----0");
						
						EG_RP_G_3R1=0;
						EG_RP_G_570E=0;
						EG_RP_G_5N61=0;
						EG_RP_G_7FK5=0;
						EG_RP_G_7JY2=0;
						EG_RP_G_7X7W=0;
						EG_RP_G_802N=0;
						EG_RP_G_802R=0;
						EG_RP_G_8SQ7=0;
						EG_RP_JAZEERA=0;
						EG_RP_KIWI=0;
						EG_RP_M_u=0;
						EG_RP_My_Fly=0;
						EG_RP_NESMA=0;
						EG_RP_PEGASUS=0;
						EG_RP_S_9JFH=0;
						EG_RP_S_ID2I=0;
						EG_RP_S_L8YI=0;
						EG_RP_S_L9AI=0;
						EG_RP_S_L9CI=0;
						EG_RP_S_T13I=0;
						EG_RP_S_T20I=0;
						EG_RP_SALAM=0;
						EG_RP_S_Jet=0;
						EG_RP_U_3R1G=0;
						EG_RP_U_570E=0;
						EG_RP_U_5N61=0;
						EG_RP_U_6E=0;
						EG_RP_U_7FK5=0;
						EG_RP_U_7JY2=0;
						EG_RP_U_802N=0;
						EG_RP_U_802R=0;
						EG_RP_U_8SQ7=0;
						EG_RP_WATANIYA=0;
						EG_RP_A_AR=0;
						EG_RP_A_AR_E=0;
						EG_RP_A_AR_M=0;
						EG_RP_A_I_E=0;
						EG_RP_FlyDubai=0;
						EG_RP_Flynas=0;
					         
						
						
				         int TotalValue =0;
				         EG_RP_Supplier_Repricing_Total = TotalValue; 
				 				 System.out.println("Supplier Repricing total:::----"+EG_RP_Supplier_Repricing_Total);
				 				
				 				
				 	        
				        
				      
					}
					else
					{
					
						List<WebElement> RP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
						 
						  System.out.println("Total Number of Supplier:" + RP.size());
						
						ArrayList<String>list=new ArrayList<>();
						
						 for (WebElement element1 : RP)
						  {
							 list.add(element1.getText());
							 Suppliers_RP_EG.add(element1.getText());
						  }
						  ArrayList<String> unique = removeDuplicates(list);
						  System.out.println("unique:"+unique.size());
						  EG_UniqueCount_RP=unique.size();
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

						    	System.out.println("No of G_3R1 Repricing:" + G_3R1.size());
						    	String EG_RP_G_3R11 =String.format("%1s",G_3R1.size());
						    	
						    	
						    	 EG_RP_G_3R1 =Integer.parseInt(EG_RP_G_3R11);
						    	
						    	       }
					            	else
					            	{
					            		String EG_RP_G_3R11 =String.format("%1s",0);
					    		    	
					    		    	
					            		EG_RP_G_3R1 =Integer.parseInt(EG_RP_G_3R11);
					            	}
						    	      
					            break; 
					            
					            case "Galileo-570E": 
					            	   
						    	       if(element.equals("Galileo-570E"))
						    	       {
						    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

						    	  System.out.println("No of Galileo-570E Repricing:" + G_570E.size());
						    	  String EG_RP_G_570E1 =String.format("%1s",G_570E.size());
						    	  
				    		    	
				    		    	
						    	  EG_RP_G_570E =Integer.parseInt(EG_RP_G_570E1);
						    	       }
						    	       else
				    	            	{
						    	    	   String EG_RP_G_570E1 =String.format("%1s",0);
						    		    	  
						    		    	
						    		    	
						    	    	   EG_RP_G_570E =Integer.parseInt(EG_RP_G_570E1);
				    	            	}
						    	      
					            break;  
					            case "Galileo-5N61": 
					            	 if(element.equals("Galileo-5N61"))
						    	       {   
						    	       
						    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

						    	System.out.println("No of Galileo-5N61 Repricing:" + G_5N61.size());
						    	
						    	
						    	 String EG_RP_G_5N611 =String.format("%1s",G_5N61.size());   		    	
				    		    
						    	 EG_RP_G_5N61 =Integer.parseInt(EG_RP_G_5N611);
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_G_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_G_5N61 =Integer.parseInt(EG_RP_G_5N611);
				    	            	}
					            break; 
					            case "Galileo-7FK5": 
					            	 if(element.equals("Galileo-7FK5"))
						    	       {   
						    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

						    	System.out.println("No of Galileo-7FK5 Repricing:" + G_7FK5.size());
						    	 
						    	 String EG_RP_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
					    		    
						    	 EG_RP_G_7FK5 =Integer.parseInt(EG_RP_G_7FK51);
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_G_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_G_7FK5 =Integer.parseInt(EG_RP_G_7FK51);
				    	            	}
						    	      
					            break; 
					            case "Galileo-7JY2": 
					            	 if(element.equals("Galileo-7JY2"))
						    	       {        
						    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

						    	System.out.println("No of Galileo-7JY2 Repricing:" + G_7JY2.size());
						    	
						    	 String EG_RP_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
					    		    
						    	 EG_RP_G_7JY2 =Integer.parseInt(EG_RP_G_7JY21);
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_G_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_G_7JY2 =Integer.parseInt(EG_RP_G_7JY21);
				    	            	}
						    	     
						    	       
					            break;  
					            case "Galileo-7X7W": 
					            	  if(element.equals("Galileo-7X7W"))
						    	       {   
						    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

						    	System.out.println("No of Galileo-7X7W Repricing:" + G_7X7W.size());
						    	
						    	
						    	String EG_RP_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
				    		    
						    	EG_RP_G_7X7W =Integer.parseInt(EG_RP_G_7X7W1);
						    	       }
					            	  else
				    	            	{
					            			String EG_RP_G_7X7W1 =String.format("%1s",0);   		    	
							    		    
					            			EG_RP_G_7X7W =Integer.parseInt(EG_RP_G_7X7W1);
				    	            	}
					            break; 
					            case "Galileo-802N": 
					            	  if(element.equals("Galileo-802N"))
						    	       {        
						    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

						    	System.out.println("No of Galileo-802N Repricing:" + G_802N.size());
						    	
						    	
						    	String EG_RP_G_802N1 =String.format("%1s",G_802N.size());   		    	
				    		    
						    	EG_RP_G_802N =Integer.parseInt(EG_RP_G_802N1);
						    	
						    	       }
					            	  else
				    	            	{
					            		  String EG_RP_G_802N1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_RP_G_802N =Integer.parseInt(EG_RP_G_802N1);
				    	            	}
						    	      
						    	     
					            break;
					            case "Galileo-802R": 
					            	  if(element.equals("Galileo-802R"))
						    	       {   
						    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

						    	System.out.println("No of Galileo-802R Repricing:" + G_802R.size());
						    	
						    	String EG_RP_G_802R1 =String.format("%1s",G_802R.size());   		    	
				    		    
						    	EG_RP_G_802R =Integer.parseInt(EG_RP_G_802R1);
						    	       }
						    	       
					            	  else
				    	            	{
					            		  String EG_RP_G_802R1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_RP_G_802R =Integer.parseInt(EG_RP_G_802R1);
				    	            	}
						    	       
					            break; 
					            case "Galileo-8SQ7": 
					            	if(element.equals("Galileo-8SQ7"))
						    	       {  
						    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

						    	System.out.println("No of Galileo-8SQ7 Repricing:" + G_8SQ7.size());
						    	 
						    	 String EG_RP_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
					    		    
						    	 EG_RP_G_8SQ7 =Integer.parseInt(EG_RP_G_8SQ71);
						    	       }
					            	else
					            	{
					            		String EG_RP_G_8SQ71 =String.format("%1s",0);   		    	
						    		    
					            		EG_RP_G_8SQ7 =Integer.parseInt(EG_RP_G_8SQ71);
					            	}
						    	     
					            break;
					            case "JAZEERA": 
					            	
					            	  if(element.equals("JAZEERA"))
						    	       {  
						    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

						     	System.out.println("No of JAZEERA Repricing:" + JAZEERA.size());
						    	 
						    	 String EG_RP_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
					    		    
						    	 EG_RP_JAZEERA =Integer.parseInt(EG_RP_JAZEERA1);
						    	       }
					            	  else
				    	            	{
					            		  
						    		    	 String EG_RP_JAZEERA1 =String.format("%1s",0);   		    	
								    		    
						    		    	 EG_RP_JAZEERA =Integer.parseInt(EG_RP_JAZEERA1);
				    	            	}
						    	      
					            break; 
					            case "KIWI": 
					            	 if(element.equals("KIWI"))
						    	       {     
						    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

						    	System.out.println("No of KIWI Repricing:" + KIWI.size());
						    	
						    	 
						    	 String EG_RP_KIWI1 =String.format("%1s",KIWI.size());   		    	
					    		    
						    	 EG_RP_KIWI =Integer.parseInt(EG_RP_KIWI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_KIWI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_KIWI =Integer.parseInt(EG_RP_KIWI1);
				    	            	}
					            break;
					            case "Manual": 
					            	 if(element.equals("Manual"))
						    	       {     
						    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

						    	System.out.println("No of Manual Repricing:" + M_u.size());
						    	
						    	 
						    	 String EG_RP_M_u1 =String.format("%1s",M_u.size());   		    	
					    		    
						    	 EG_RP_M_u =Integer.parseInt(EG_RP_M_u1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_M_u1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_M_u =Integer.parseInt(EG_RP_M_u1);
				    	            	}
					            break;
					            case "MystiFly": 
					            	 if(element.equals("MystiFly"))
						    	       {     
						    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

						    	System.out.println("No of MystiFly Repricing:" + My_Fly.size());
						    	
						    	 
						    	 String EG_RP_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
					    		    
						    	 EG_RP_My_Fly =Integer.parseInt(EG_RP_My_Fly1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_My_Fly1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_My_Fly =Integer.parseInt(EG_RP_My_Fly1);
				    	            	}
					            break;
					            case "NESMA": 
					            	 if(element.equals("NESMA"))
						    	       {     
						    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

						    	System.out.println("No of NESMA Repricing:" + NESMA.size());
						    	
						    	 
						    	 String EG_RP_NESMA1 =String.format("%1s",NESMA.size());   		    	
					    		    
						    	 EG_RP_NESMA =Integer.parseInt(EG_RP_NESMA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_NESMA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_NESMA =Integer.parseInt(EG_RP_NESMA1);
				    	            	}
					            break;
					            case "PEGASUS": 
					            	 if(element.equals("PEGASUS"))
						    	       {     
						    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

						    	System.out.println("No of PEGASUS Repricing:" + PEGASUS.size());
						    	
						    	 
						    	 String EG_RP_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
					    		    
						    	 EG_RP_PEGASUS =Integer.parseInt(EG_RP_PEGASUS1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_PEGASUS1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_PEGASUS =Integer.parseInt(EG_RP_PEGASUS1);
				    	            	}
					            break;
					            case "SABRE-9JFH": 
					            	 if(element.equals("SABRE-9JFH"))
						    	       {     
						    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

						    	System.out.println("No of SABRE-9JFH Repricing:" + S_9JFH.size());
						    	
						    	 
						    	 String EG_RP_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
					    		    
						    	 EG_RP_S_9JFH =Integer.parseInt(EG_RP_S_9JFH1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_9JFH1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_9JFH =Integer.parseInt(EG_RP_S_9JFH1);
				    	            	}
					            break;
					            case "SABRE-ID2I": 
					            	 if(element.equals("SABRE-ID2I"))
						    	       {     
						    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

						    	System.out.println("No of SABRE-ID2I Repricing:" + S_ID2I.size());
						    	
						    	 
						    	 String EG_RP_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
					    		    
						    	 EG_RP_S_ID2I =Integer.parseInt(EG_RP_S_ID2I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_ID2I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_ID2I =Integer.parseInt(EG_RP_S_ID2I1);
				    	            	}
					            break;
					            case "SABRE-L8YI": 
					            	 if(element.equals("SABRE-L8YI"))
						    	       {     
						    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

						    	System.out.println("No of SABRE-L8YI Repricing:" + S_L8YI.size());
						    	
						    	 
						    	 String EG_RP_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
					    		    
						    	 EG_RP_S_L8YI =Integer.parseInt(EG_RP_S_L8YI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_L8YI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_L8YI =Integer.parseInt(EG_RP_S_L8YI1);
				    	            	}
					            break;
					            case "SABRE-L9AI": 
					            	 if(element.equals("SABRE-L9AI"))
						    	       {     
						    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

						    	System.out.println("No of SABRE-L9AI Repricing:" + S_L9AI.size());
						    	
						    	 
						    	 String EG_RP_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
					    		    
						    	 EG_RP_S_L9AI =Integer.parseInt(EG_RP_S_L9AI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_L9AI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_L9AI =Integer.parseInt(EG_RP_S_L9AI1);
				    	            	}
					            break;
					            case "SABRE-L9CI": 
					            	 if(element.equals("SABRE-L9CI"))
						    	       {     
						    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

						    	System.out.println("No of SABRE-L9CI Repricing:" + S_L9CI.size());
						    	
						    	 
						    	 String EG_RP_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
					    		    
						    	 EG_RP_S_L9CI =Integer.parseInt(EG_RP_S_L9CI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_L9CI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_L9CI =Integer.parseInt(EG_RP_S_L9CI1);
				    	            	}
					            break;
					            case "SABRE-T13I": 
					            	 if(element.equals("SABRE-T13I"))
						    	       {     
						    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

						    	System.out.println("No of SABRE-T13I Repricing:" + S_T13I.size());
						    	
						    	 
						    	 String EG_RP_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
					    		    
						    	 EG_RP_S_T13I =Integer.parseInt(EG_RP_S_T13I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_T13I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_T13I =Integer.parseInt(EG_RP_S_T13I1);
				    	            	}
					            break;
					            case "SABRE-T20I": 
					            	 if(element.equals("SABRE-T20I"))
						    	       {     
						    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

						    	System.out.println("No of SABRE-T20I Repricing:" + S_T20I.size());
						    	
						    	 
						    	 String EG_RP_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
					    		    
						    	 EG_RP_S_T20I =Integer.parseInt(EG_RP_S_T20I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_T20I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_T20I =Integer.parseInt(EG_RP_S_T20I1);
				    	            	}
					            break;
					            case "SALAM": 
					            	 if(element.equals("SALAM"))
						    	       {     
						    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

						    	System.out.println("No of SALAM Repricing:" + SALAM.size());
						    	
						    	 
						    	 String EG_RP_SALAM1 =String.format("%1s",SALAM.size());   		    	
					    		    
						    	 EG_RP_SALAM =Integer.parseInt(EG_RP_SALAM1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_SALAM1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_SALAM =Integer.parseInt(EG_RP_SALAM1);
				    	            	}
					            break;
					            case "SpiceJet": 
					            	 if(element.equals("SpiceJet"))
						    	       {     
						    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

						    	System.out.println("No of SpiceJet Repricing:" + S_Jet.size());
						    	
						    	 
						    	 String EG_RP_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
					    		    
						    	 EG_RP_S_Jet =Integer.parseInt(EG_RP_S_Jet1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_S_Jet1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_S_Jet =Integer.parseInt(EG_RP_S_Jet1);
				    	            	}
					            break;
					            case "UAPI-3R1G": 
					            	 if(element.equals("UAPI-3R1G"))
						    	       {     
						    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

						    	System.out.println("No of UAPI-3R1G Repricing:" + U_3R1G.size());
						    	
						    	 
						    	 String EG_RP_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
					    		    
						    	 EG_RP_U_3R1G =Integer.parseInt(EG_RP_U_3R1G1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_3R1G1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_3R1G =Integer.parseInt(EG_RP_U_3R1G1);
				    	            	}
					            break;
					            case "UAPI-570E": 
					            	 if(element.equals("UAPI-570E"))
						    	       {     
						    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

						    	System.out.println("No of UAPI-570E Repricing:" + U_570E.size());
						    	
						    	 
						    	 String EG_RP_U_570E1 =String.format("%1s",U_570E.size());   		    	
					    		    
						    	 EG_RP_U_570E =Integer.parseInt(EG_RP_U_570E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_570E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_570E =Integer.parseInt(EG_RP_U_570E1);
				    	            	}
					            break;
					            case "UAPI-5N61": 
					            	 if(element.equals("UAPI-5N61"))
						    	       {     
						    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

						    	System.out.println("No of UAPI-5N61 Repricing:" + U_5N61.size());
						    	
						    	 
						    	 String EG_RP_U_5N611 =String.format("%1s",U_5N61.size());   		    	
					    		    
						    	 EG_RP_U_5N61 =Integer.parseInt(EG_RP_U_5N611);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_5N61 =Integer.parseInt(EG_RP_U_5N611);
				    	            	}
					            break;
					            case "UAPI-6E": 
					            	 if(element.equals("UAPI-6E"))
						    	       {     
						    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

						    	System.out.println("No of UAPI-6E Repricing:" + U_6E.size());
						    	
						    	 
						    	 String EG_RP_U_6E1 =String.format("%1s",U_6E.size());   		    	
					    		    
						    	 EG_RP_U_6E =Integer.parseInt(EG_RP_U_6E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_6E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_6E =Integer.parseInt(EG_RP_U_6E1);
				    	            	}
					            break;
					            case "UAPI-7FK5": 
					            	 if(element.equals("UAPI-7FK5"))
						    	       {     
						    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

						    	System.out.println("No of UAPI-7FK5 Repricing:" + U_7FK5.size());
						    	
						    	 
						    	 String EG_RP_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
					    		    
						    	 EG_RP_U_7FK5 =Integer.parseInt(EG_RP_U_7FK51);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_7FK5 =Integer.parseInt(EG_RP_U_7FK51);
				    	            	}
					            break;
					            case "UAPI-7JY2": 
					            	 if(element.equals("UAPI-7JY2"))
						    	       {     
						    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

						    	System.out.println("No of UAPI-7JY2 Repricing:" + U_7JY2.size());
						    	
						    	 
						    	 String EG_RP_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
					    		    
						    	 EG_RP_U_7JY2 =Integer.parseInt(EG_RP_U_7JY21);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_7JY2 =Integer.parseInt(EG_RP_U_7JY21);
				    	            	}
					            break;
					            case "UAPI-802N": 
					            	 if(element.equals("UAPI-802N"))
						    	       {     
						    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

						    	System.out.println("No of UAPI-802N Repricing:" + U_802N.size());
						    	
						    	 
						    	 String EG_RP_U_802N1 =String.format("%1s",U_802N.size());   		    	
					    		    
						    	 EG_RP_U_802N =Integer.parseInt(EG_RP_U_802N1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_802N1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_802N =Integer.parseInt(EG_RP_U_802N1);
				    	            	}
					            break;
					            case "UAPI-802R": 
					            	 if(element.equals("UAPI-802R"))
						    	       {     
						    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

						    	System.out.println("No of UAPI-802R Repricing:" + U_802R.size());
						    	
						    	 
						    	 String EG_RP_U_802R1 =String.format("%1s",U_802R.size());   		    	
					    		    
						    	 EG_RP_U_802R =Integer.parseInt(EG_RP_U_802R1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_802R1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_802R =Integer.parseInt(EG_RP_U_802R1);
				    	            	}
					            break;
					            case "UAPI-8SQ7": 
					            	 if(element.equals("UAPI-8SQ7"))
						    	       {     
						    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

						    	System.out.println("No of UAPI-8SQ7 Repricing:" + U_8SQ7.size());
						    	
						    	 
						    	 String EG_RP_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
					    		    
						    	 EG_RP_U_8SQ7 =Integer.parseInt(EG_RP_U_8SQ71);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_U_8SQ71 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_U_8SQ7 =Integer.parseInt(EG_RP_U_8SQ71);
				    	            	}
					            break;
					            case "WATANIYA": 
					            	 if(element.equals("WATANIYA"))
						    	       {     
						    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

						    	System.out.println("No of WATANIYA Repricing:" + WATANIYA.size());
						    	
						    	 
						    	 String EG_RP_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
					    		    
						    	 EG_RP_WATANIYA =Integer.parseInt(EG_RP_WATANIYA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_WATANIYA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_WATANIYA =Integer.parseInt(EG_RP_WATANIYA1);
				    	            	}
					            break;
					            case "Air Arabia": 
					            	 if(element.equals("Air Arabia"))
						    	       {     
						    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

						    	System.out.println("No of Air Arabia Repricing:" + A_AR.size());
						    	
						    	 
						    	 String EG_RP_A_AR1 =String.format("%1s",A_AR.size());   		    	
					    		    
						    	 EG_RP_A_AR =Integer.parseInt(EG_RP_A_AR1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_A_AR1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_A_AR =Integer.parseInt(EG_RP_A_AR1);
				    	            	}
					            break;
					            case "Air Arabia Egypt": 
					            	 if(element.equals("Air Arabia Egypt"))
						    	       {     
						    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

						    	System.out.println("No of Air Arabia Egypt Repricing:" + A_AR_E.size());
						    	
						    	 
						    	 String EG_RP_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
					    		    
						    	 EG_RP_A_AR_E =Integer.parseInt(EG_RP_A_AR_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_A_AR_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_A_AR_E =Integer.parseInt(EG_RP_A_AR_E1);
				    	            	}
					            break;
					            case "Air Arabia Moroc": 
					            	 if(element.equals("Air Arabia Moroc"))
						    	       {     
						    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

						    	System.out.println("No of Air Arabia Moroc Repricing:" + A_AR_M.size());
						    	
						    	 
						    	 String EG_RP_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
					    		    
						    	 EG_RP_A_AR_M =Integer.parseInt(EG_RP_A_AR_M1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_A_AR_M1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_A_AR_M =Integer.parseInt(EG_RP_A_AR_M1);
				    	            	}
					            break;
					            case "AirIndiaExpress": 
					            	 if(element.equals("AirIndiaExpress"))
						    	       {     
						    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

						    	System.out.println("No of AirIndiaExpress Repricing:" + A_I_E.size());
						    	
						    	 
						    	 String EG_RP_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
					    		    
						    	 EG_RP_A_I_E =Integer.parseInt(EG_RP_A_I_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_A_I_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_A_I_E =Integer.parseInt(EG_RP_A_I_E1);
				    	            	}
					            break;
					            case "FlyDubai": 
					            	 if(element.equals("FlyDubai"))
						    	       {     
						    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

						    	System.out.println("No of FlyDubai Repricing:" + FlyDubai.size());
						    	
						    	 
						    	 String EG_RP_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
					    		    
						    	 EG_RP_FlyDubai =Integer.parseInt(EG_RP_FlyDubai1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_FlyDubai1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_FlyDubai =Integer.parseInt(EG_RP_FlyDubai1);
				    	            	}
					            break;
					            case "Flynas": 
					            	 if(element.equals("Flynas"))
						    	       {     
						    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

						    	System.out.println("No of Flynas Repricing:" + Flynas.size());
						    	
						    	 
						    	 String EG_RP_Flynas1 =String.format("%1s",Flynas.size());   		    	
					    		    
						    	 EG_RP_Flynas =Integer.parseInt(EG_RP_Flynas1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_RP_Flynas1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_RP_Flynas =Integer.parseInt(EG_RP_Flynas1);
				    	            	}
					            break;
					            
					            
					            default:System.out.println("Not in 10, 20 or 30");  
					         
					            }
					           }
					        }
					  
				        
				        int TotalValue = EG_RP_G_3R1+EG_RP_G_570E+EG_RP_G_5N61+EG_RP_G_7FK5+EG_RP_G_7JY2+EG_RP_G_7X7W+EG_RP_G_802N+EG_RP_G_802R
				        		+EG_RP_G_8SQ7+EG_RP_JAZEERA+EG_RP_KIWI+EG_RP_M_u+EG_RP_My_Fly+EG_RP_NESMA+EG_RP_PEGASUS+EG_RP_S_9JFH+EG_RP_S_ID2I
				        		+EG_RP_S_L8YI+EG_RP_S_L9AI+EG_RP_S_L9CI+EG_RP_S_T13I+EG_RP_S_T20I+EG_RP_SALAM+EG_RP_S_Jet+EG_RP_U_3R1G+EG_RP_U_570E
				        		+EG_RP_U_5N61+EG_RP_U_6E+EG_RP_U_7FK5+EG_RP_U_7JY2+EG_RP_U_802N+EG_RP_U_802R+EG_RP_U_8SQ7+EG_RP_WATANIYA+EG_RP_A_AR
				        		+EG_RP_A_AR_E+EG_RP_A_AR_M+EG_RP_A_I_E+EG_RP_FlyDubai+EG_RP_Flynas;
						  
				        EG_RP_Supplier_Repricing_Total = TotalValue; 
						 System.out.println("Supplier Repricing total:::----"+EG_RP_Supplier_Repricing_Total);
						
						
				    
				   
						}
					
					//*******************Supplier  SoldOut*********************************************
					Select Supplier_Soldout=new Select(Loginpage.BookingSatus());
					Supplier_Soldout.selectByVisibleText("Soldout");
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					
					long timeoutInSecondsold = 85;
					WebDriverWait waitsold = new WebDriverWait(driver, timeoutInSecondsold);
					waitsold.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					String EG_Sold_count=Loginpage.FlightResults_text().getText();
					System.out.println(EG_Sold_count);
					
					
					String Eg_sold = EG_Sold_count.trim();
					String[] Eg_soldsplited = Eg_sold.split("\\:");
					System.out.println("No of Results Count"+Eg_soldsplited[1]);
					Thread.sleep(1000);
					
					
					if("Flight Search Results : 0".equals(EG_Sold_count))
					{
						
						System.out.println("Supplier SOLD OUT total:::----0");
						
						EG_SD_G_3R1=0;
						EG_SD_G_570E=0;
						EG_SD_G_5N61=0;
						EG_SD_G_7FK5=0;
						EG_SD_G_7JY2=0;
						EG_SD_G_7X7W=0;
						EG_SD_G_802N=0;
						EG_SD_G_802R=0;
						EG_SD_G_8SQ7=0;
						EG_SD_JAZEERA=0;
						EG_SD_KIWI=0;
						EG_SD_M_u=0;
						EG_SD_My_Fly=0;
						EG_SD_NESMA=0;
						EG_SD_PEGASUS=0;
						EG_SD_S_9JFH=0;
						EG_SD_S_ID2I=0;
						EG_SD_S_L8YI=0;
						EG_SD_S_L9AI=0;
						EG_SD_S_L9CI=0;
						EG_SD_S_T13I=0;
						EG_SD_S_T20I=0;
						EG_SD_SALAM=0;
						EG_SD_S_Jet=0;
						EG_SD_U_3R1G=0;
						EG_SD_U_570E=0;
						EG_SD_U_5N61=0;
						EG_SD_U_6E=0;
						EG_SD_U_7FK5=0;
						EG_SD_U_7JY2=0;
						EG_SD_U_802N=0;
						EG_SD_U_802R=0;
						EG_SD_U_8SQ7=0;
						EG_SD_WATANIYA=0;
						EG_SD_A_AR=0;
						EG_SD_A_AR_E=0;
						EG_SD_A_AR_M=0;
						EG_SD_A_I_E=0;
						EG_SD_FlyDubai=0;
						EG_SD_Flynas=0;
					         
						
						
				         int TotalValue =0;
				         EG_SD_Supplier_Soldout_Total = TotalValue; 
				 				 System.out.println("Supplier SOLD OUT total:::----"+EG_SD_Supplier_Soldout_Total);
				 				
				 				
				 	        
				        
				      
					}
					else
					{
					
						List<WebElement> SD=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
						 
						  System.out.println("Total Number of Supplier:" + SD.size());
						
						ArrayList<String>list=new ArrayList<>();
						
						 for (WebElement element1 : SD)
						  {
							 list.add(element1.getText());
							 Suppliers_SD_EG.add(element1.getText());
						  }
						  ArrayList<String> unique = removeDuplicates(list);
						  System.out.println("unique:"+unique.size());
						  EG_UniqueCount_SD=unique.size();
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

						    	System.out.println("No of G_3R1 SOLD OUT:" + G_3R1.size());
						    	String EG_SD_G_3R11 =String.format("%1s",G_3R1.size());
						    	
						    	
						    	 EG_SD_G_3R1 =Integer.parseInt(EG_SD_G_3R11);
						    	
						    	       }
					            	else
					            	{
					            		String EG_SD_G_3R11 =String.format("%1s",0);
					    		    	
					    		    	
					            		EG_SD_G_3R1 =Integer.parseInt(EG_SD_G_3R11);
					            	}
						    	      
					            break; 
					            
					            case "Galileo-570E": 
					            	   
						    	       if(element.equals("Galileo-570E"))
						    	       {
						    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

						    	  System.out.println("No of Galileo-570E SOLD OUT:" + G_570E.size());
						    	  String EG_SD_G_570E1 =String.format("%1s",G_570E.size());
						    	  
				    		    	
				    		    	
						    	  EG_SD_G_570E =Integer.parseInt(EG_SD_G_570E1);
						    	       }
						    	       else
				    	            	{
						    	    	   String EG_SD_G_570E1 =String.format("%1s",0);
						    		    	  
						    		    	
						    		    	
						    	    	   EG_SD_G_570E =Integer.parseInt(EG_SD_G_570E1);
				    	            	}
						    	      
					            break;  
					            case "Galileo-5N61": 
					            	 if(element.equals("Galileo-5N61"))
						    	       {   
						    	       
						    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

						    	System.out.println("No of Galileo-5N61 SOLD OUT:" + G_5N61.size());
						    	
						    	
						    	 String EG_SD_G_5N611 =String.format("%1s",G_5N61.size());   		    	
				    		    
						    	 EG_SD_G_5N61 =Integer.parseInt(EG_SD_G_5N611);
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_G_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_G_5N61 =Integer.parseInt(EG_SD_G_5N611);
				    	            	}
					            break; 
					            case "Galileo-7FK5": 
					            	 if(element.equals("Galileo-7FK5"))
						    	       {   
						    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

						    	System.out.println("No of Galileo-7FK5 SOLD OUT:" + G_7FK5.size());
						    	 
						    	 String EG_SD_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
					    		    
						    	 EG_SD_G_7FK5 =Integer.parseInt(EG_SD_G_7FK51);
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_G_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_G_7FK5 =Integer.parseInt(EG_SD_G_7FK51);
				    	            	}
						    	      
					            break; 
					            case "Galileo-7JY2": 
					            	 if(element.equals("Galileo-7JY2"))
						    	       {        
						    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

						    	System.out.println("No of Galileo-7JY2 SOLD OUT:" + G_7JY2.size());
						    	
						    	 String EG_SD_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
					    		    
						    	 EG_SD_G_7JY2 =Integer.parseInt(EG_SD_G_7JY21);
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_G_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_G_7JY2 =Integer.parseInt(EG_SD_G_7JY21);
				    	            	}
						    	     
						    	       
					            break;  
					            case "Galileo-7X7W": 
					            	  if(element.equals("Galileo-7X7W"))
						    	       {   
						    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

						    	System.out.println("No of Galileo-7X7W SOLD OUT:" + G_7X7W.size());
						    	
						    	
						    	String EG_SD_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
				    		    
						    	EG_SD_G_7X7W =Integer.parseInt(EG_SD_G_7X7W1);
						    	       }
					            	  else
				    	            	{
					            			String EG_SD_G_7X7W1 =String.format("%1s",0);   		    	
							    		    
					            			EG_SD_G_7X7W =Integer.parseInt(EG_SD_G_7X7W1);
				    	            	}
					            break; 
					            case "Galileo-802N": 
					            	  if(element.equals("Galileo-802N"))
						    	       {        
						    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

						    	System.out.println("No of Galileo-802N SOLD OUT:" + G_802N.size());
						    	
						    	
						    	String EG_SD_G_802N1 =String.format("%1s",G_802N.size());   		    	
				    		    
						    	EG_SD_G_802N =Integer.parseInt(EG_SD_G_802N1);
						    	
						    	       }
					            	  else
				    	            	{
					            		  String EG_SD_G_802N1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_SD_G_802N =Integer.parseInt(EG_SD_G_802N1);
				    	            	}
						    	      
						    	     
					            break;
					            case "Galileo-802R": 
					            	  if(element.equals("Galileo-802R"))
						    	       {   
						    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

						    	System.out.println("No of Galileo-802R SOLD OUT:" + G_802R.size());
						    	
						    	String EG_SD_G_802R1 =String.format("%1s",G_802R.size());   		    	
				    		    
						    	EG_SD_G_802R =Integer.parseInt(EG_SD_G_802R1);
						    	       }
						    	       
					            	  else
				    	            	{
					            		  String EG_SD_G_802R1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_SD_G_802R =Integer.parseInt(EG_SD_G_802R1);
				    	            	}
						    	       
					            break; 
					            case "Galileo-8SQ7": 
					            	if(element.equals("Galileo-8SQ7"))
						    	       {  
						    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

						    	System.out.println("No of Galileo-8SQ7 SOLD OUT:" + G_8SQ7.size());
						    	 
						    	 String EG_SD_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
					    		    
						    	 EG_SD_G_8SQ7 =Integer.parseInt(EG_SD_G_8SQ71);
						    	       }
					            	else
					            	{
					            		String EG_SD_G_8SQ71 =String.format("%1s",0);   		    	
						    		    
					            		EG_SD_G_8SQ7 =Integer.parseInt(EG_SD_G_8SQ71);
					            	}
						    	     
					            break;
					            case "JAZEERA": 
					            	
					            	  if(element.equals("JAZEERA"))
						    	       {  
						    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

						     	System.out.println("No of JAZEERA SOLD OUT:" + JAZEERA.size());
						    	 
						    	 String EG_SD_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
					    		    
						    	 EG_SD_JAZEERA =Integer.parseInt(EG_SD_JAZEERA1);
						    	       }
					            	  else
				    	            	{
					            		  
						    		    	 String EG_SD_JAZEERA1 =String.format("%1s",0);   		    	
								    		    
						    		    	 EG_SD_JAZEERA =Integer.parseInt(EG_SD_JAZEERA1);
				    	            	}
						    	      
					            break; 
					            case "KIWI": 
					            	 if(element.equals("KIWI"))
						    	       {     
						    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

						    	System.out.println("No of KIWI SOLD OUT:" + KIWI.size());
						    	
						    	 
						    	 String EG_SD_KIWI1 =String.format("%1s",KIWI.size());   		    	
					    		    
						    	 EG_SD_KIWI =Integer.parseInt(EG_SD_KIWI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_KIWI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_KIWI =Integer.parseInt(EG_SD_KIWI1);
				    	            	}
					            break;
					            case "Manual": 
					            	 if(element.equals("Manual"))
						    	       {     
						    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

						    	System.out.println("No of Manual SOLD OUT:" + M_u.size());
						    	
						    	 
						    	 String EG_SD_M_u1 =String.format("%1s",M_u.size());   		    	
					    		    
						    	 EG_SD_M_u =Integer.parseInt(EG_SD_M_u1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_M_u1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_M_u =Integer.parseInt(EG_SD_M_u1);
				    	            	}
					            break;
					            case "MystiFly": 
					            	 if(element.equals("MystiFly"))
						    	       {     
						    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

						    	System.out.println("No of MystiFly SOLD OUT:" + My_Fly.size());
						    	
						    	 
						    	 String EG_SD_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
					    		    
						    	 EG_SD_My_Fly =Integer.parseInt(EG_SD_My_Fly1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_My_Fly1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_My_Fly =Integer.parseInt(EG_SD_My_Fly1);
				    	            	}
					            break;
					            case "NESMA": 
					            	 if(element.equals("NESMA"))
						    	       {     
						    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

						    	System.out.println("No of NESMA SOLD OUT:" + NESMA.size());
						    	
						    	 
						    	 String EG_SD_NESMA1 =String.format("%1s",NESMA.size());   		    	
					    		    
						    	 EG_SD_NESMA =Integer.parseInt(EG_SD_NESMA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_NESMA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_NESMA =Integer.parseInt(EG_SD_NESMA1);
				    	            	}
					            break;
					            case "PEGASUS": 
					            	 if(element.equals("PEGASUS"))
						    	       {     
						    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

						    	System.out.println("No of PEGASUS SOLD OUT:" + PEGASUS.size());
						    	
						    	 
						    	 String EG_SD_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
					    		    
						    	 EG_SD_PEGASUS =Integer.parseInt(EG_SD_PEGASUS1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_PEGASUS1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_PEGASUS =Integer.parseInt(EG_SD_PEGASUS1);
				    	            	}
					            break;
					            case "SABRE-9JFH": 
					            	 if(element.equals("SABRE-9JFH"))
						    	       {     
						    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

						    	System.out.println("No of SABRE-9JFH SOLD OUT:" + S_9JFH.size());
						    	
						    	 
						    	 String EG_SD_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
					    		    
						    	 EG_SD_S_9JFH =Integer.parseInt(EG_SD_S_9JFH1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_9JFH1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_9JFH =Integer.parseInt(EG_SD_S_9JFH1);
				    	            	}
					            break;
					            case "SABRE-ID2I": 
					            	 if(element.equals("SABRE-ID2I"))
						    	       {     
						    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

						    	System.out.println("No of SABRE-ID2I SOLD OUT:" + S_ID2I.size());
						    	
						    	 
						    	 String EG_SD_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
					    		    
						    	 EG_SD_S_ID2I =Integer.parseInt(EG_SD_S_ID2I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_ID2I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_ID2I =Integer.parseInt(EG_SD_S_ID2I1);
				    	            	}
					            break;
					            case "SABRE-L8YI": 
					            	 if(element.equals("SABRE-L8YI"))
						    	       {     
						    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

						    	System.out.println("No of SABRE-L8YI SOLD OUT:" + S_L8YI.size());
						    	
						    	 
						    	 String EG_SD_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
					    		    
						    	 EG_SD_S_L8YI =Integer.parseInt(EG_SD_S_L8YI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_L8YI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_L8YI =Integer.parseInt(EG_SD_S_L8YI1);
				    	            	}
					            break;
					            case "SABRE-L9AI": 
					            	 if(element.equals("SABRE-L9AI"))
						    	       {     
						    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

						    	System.out.println("No of SABRE-L9AI SOLD OUT:" + S_L9AI.size());
						    	
						    	 
						    	 String EG_SD_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
					    		    
						    	 EG_SD_S_L9AI =Integer.parseInt(EG_SD_S_L9AI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_L9AI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_L9AI =Integer.parseInt(EG_SD_S_L9AI1);
				    	            	}
					            break;
					            case "SABRE-L9CI": 
					            	 if(element.equals("SABRE-L9CI"))
						    	       {     
						    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

						    	System.out.println("No of SABRE-L9CI SOLD OUT:" + S_L9CI.size());
						    	
						    	 
						    	 String EG_SD_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
					    		    
						    	 EG_SD_S_L9CI =Integer.parseInt(EG_SD_S_L9CI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_L9CI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_L9CI =Integer.parseInt(EG_SD_S_L9CI1);
				    	            	}
					            break;
					            case "SABRE-T13I": 
					            	 if(element.equals("SABRE-T13I"))
						    	       {     
						    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

						    	System.out.println("No of SABRE-T13I SOLD OUT:" + S_T13I.size());
						    	
						    	 
						    	 String EG_SD_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
					    		    
						    	 EG_SD_S_T13I =Integer.parseInt(EG_SD_S_T13I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_T13I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_T13I =Integer.parseInt(EG_SD_S_T13I1);
				    	            	}
					            break;
					            case "SABRE-T20I": 
					            	 if(element.equals("SABRE-T20I"))
						    	       {     
						    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

						    	System.out.println("No of SABRE-T20I SOLD OUT:" + S_T20I.size());
						    	
						    	 
						    	 String EG_SD_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
					    		    
						    	 EG_SD_S_T20I =Integer.parseInt(EG_SD_S_T20I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_T20I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_T20I =Integer.parseInt(EG_SD_S_T20I1);
				    	            	}
					            break;
					            case "SALAM": 
					            	 if(element.equals("SALAM"))
						    	       {     
						    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

						    	System.out.println("No of SALAM SOLD OUT:" + SALAM.size());
						    	
						    	 
						    	 String EG_SD_SALAM1 =String.format("%1s",SALAM.size());   		    	
					    		    
						    	 EG_SD_SALAM =Integer.parseInt(EG_SD_SALAM1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_SALAM1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_SALAM =Integer.parseInt(EG_SD_SALAM1);
				    	            	}
					            break;
					            case "SpiceJet": 
					            	 if(element.equals("SpiceJet"))
						    	       {     
						    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

						    	System.out.println("No of SpiceJet SOLD OUT:" + S_Jet.size());
						    	
						    	 
						    	 String EG_SD_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
					    		    
						    	 EG_SD_S_Jet =Integer.parseInt(EG_SD_S_Jet1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_S_Jet1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_S_Jet =Integer.parseInt(EG_SD_S_Jet1);
				    	            	}
					            break;
					            case "UAPI-3R1G": 
					            	 if(element.equals("UAPI-3R1G"))
						    	       {     
						    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

						    	System.out.println("No of UAPI-3R1G SOLD OUT:" + U_3R1G.size());
						    	
						    	 
						    	 String EG_SD_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
					    		    
						    	 EG_SD_U_3R1G =Integer.parseInt(EG_SD_U_3R1G1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_3R1G1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_3R1G =Integer.parseInt(EG_SD_U_3R1G1);
				    	            	}
					            break;
					            case "UAPI-570E": 
					            	 if(element.equals("UAPI-570E"))
						    	       {     
						    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

						    	System.out.println("No of UAPI-570E SOLD OUT:" + U_570E.size());
						    	
						    	 
						    	 String EG_SD_U_570E1 =String.format("%1s",U_570E.size());   		    	
					    		    
						    	 EG_SD_U_570E =Integer.parseInt(EG_SD_U_570E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_570E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_570E =Integer.parseInt(EG_SD_U_570E1);
				    	            	}
					            break;
					            case "UAPI-5N61": 
					            	 if(element.equals("UAPI-5N61"))
						    	       {     
						    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

						    	System.out.println("No of UAPI-5N61 SOLD OUT:" + U_5N61.size());
						    	
						    	 
						    	 String EG_SD_U_5N611 =String.format("%1s",U_5N61.size());   		    	
					    		    
						    	 EG_SD_U_5N61 =Integer.parseInt(EG_SD_U_5N611);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_5N61 =Integer.parseInt(EG_SD_U_5N611);
				    	            	}
					            break;
					            case "UAPI-6E": 
					            	 if(element.equals("UAPI-6E"))
						    	       {     
						    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

						    	System.out.println("No of UAPI-6E SOLD OUT:" + U_6E.size());
						    	
						    	 
						    	 String EG_SD_U_6E1 =String.format("%1s",U_6E.size());   		    	
					    		    
						    	 EG_SD_U_6E =Integer.parseInt(EG_SD_U_6E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_6E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_6E =Integer.parseInt(EG_SD_U_6E1);
				    	            	}
					            break;
					            case "UAPI-7FK5": 
					            	 if(element.equals("UAPI-7FK5"))
						    	       {     
						    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

						    	System.out.println("No of UAPI-7FK5 SOLD OUT:" + U_7FK5.size());
						    	
						    	 
						    	 String EG_SD_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
					    		    
						    	 EG_SD_U_7FK5 =Integer.parseInt(EG_SD_U_7FK51);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_7FK5 =Integer.parseInt(EG_SD_U_7FK51);
				    	            	}
					            break;
					            case "UAPI-7JY2": 
					            	 if(element.equals("UAPI-7JY2"))
						    	       {     
						    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

						    	System.out.println("No of UAPI-7JY2 SOLD OUT:" + U_7JY2.size());
						    	
						    	 
						    	 String EG_SD_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
					    		    
						    	 EG_SD_U_7JY2 =Integer.parseInt(EG_SD_U_7JY21);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_7JY2 =Integer.parseInt(EG_SD_U_7JY21);
				    	            	}
					            break;
					            case "UAPI-802N": 
					            	 if(element.equals("UAPI-802N"))
						    	       {     
						    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

						    	System.out.println("No of UAPI-802N SOLD OUT:" + U_802N.size());
						    	
						    	 
						    	 String EG_SD_U_802N1 =String.format("%1s",U_802N.size());   		    	
					    		    
						    	 EG_SD_U_802N =Integer.parseInt(EG_SD_U_802N1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_802N1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_802N =Integer.parseInt(EG_SD_U_802N1);
				    	            	}
					            break;
					            case "UAPI-802R": 
					            	 if(element.equals("UAPI-802R"))
						    	       {     
						    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

						    	System.out.println("No of UAPI-802R SOLD OUT:" + U_802R.size());
						    	
						    	 
						    	 String EG_SD_U_802R1 =String.format("%1s",U_802R.size());   		    	
					    		    
						    	 EG_SD_U_802R =Integer.parseInt(EG_SD_U_802R1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_802R1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_802R =Integer.parseInt(EG_SD_U_802R1);
				    	            	}
					            break;
					            case "UAPI-8SQ7": 
					            	 if(element.equals("UAPI-8SQ7"))
						    	       {     
						    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

						    	System.out.println("No of UAPI-8SQ7 SOLD OUT:" + U_8SQ7.size());
						    	
						    	 
						    	 String EG_SD_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
					    		    
						    	 EG_SD_U_8SQ7 =Integer.parseInt(EG_SD_U_8SQ71);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_U_8SQ71 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_U_8SQ7 =Integer.parseInt(EG_SD_U_8SQ71);
				    	            	}
					            break;
					            case "WATANIYA": 
					            	 if(element.equals("WATANIYA"))
						    	       {     
						    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

						    	System.out.println("No of WATANIYA SOLD OUT:" + WATANIYA.size());
						    	
						    	 
						    	 String EG_SD_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
					    		    
						    	 EG_SD_WATANIYA =Integer.parseInt(EG_SD_WATANIYA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_WATANIYA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_WATANIYA =Integer.parseInt(EG_SD_WATANIYA1);
				    	            	}
					            break;
					            case "Air Arabia": 
					            	 if(element.equals("Air Arabia"))
						    	       {     
						    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

						    	System.out.println("No of Air Arabia SOLD OUT:" + A_AR.size());
						    	
						    	 
						    	 String EG_SD_A_AR1 =String.format("%1s",A_AR.size());   		    	
					    		    
						    	 EG_SD_A_AR =Integer.parseInt(EG_SD_A_AR1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_A_AR1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_A_AR =Integer.parseInt(EG_SD_A_AR1);
				    	            	}
					            break;
					            case "Air Arabia Egypt": 
					            	 if(element.equals("Air Arabia Egypt"))
						    	       {     
						    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

						    	System.out.println("No of Air Arabia Egypt SOLD OUT:" + A_AR_E.size());
						    	
						    	 
						    	 String EG_SD_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
					    		    
						    	 EG_SD_A_AR_E =Integer.parseInt(EG_SD_A_AR_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_A_AR_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_A_AR_E =Integer.parseInt(EG_SD_A_AR_E1);
				    	            	}
					            break;
					            case "Air Arabia Moroc": 
					            	 if(element.equals("Air Arabia Moroc"))
						    	       {     
						    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

						    	System.out.println("No of Air Arabia Moroc SOLD OUT:" + A_AR_M.size());
						    	
						    	 
						    	 String EG_SD_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
					    		    
						    	 EG_SD_A_AR_M =Integer.parseInt(EG_SD_A_AR_M1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_A_AR_M1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_A_AR_M =Integer.parseInt(EG_SD_A_AR_M1);
				    	            	}
					            break;
					            case "AirIndiaExpress": 
					            	 if(element.equals("AirIndiaExpress"))
						    	       {     
						    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

						    	System.out.println("No of AirIndiaExpress SOLD OUT:" + A_I_E.size());
						    	
						    	 
						    	 String EG_SD_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
					    		    
						    	 EG_SD_A_I_E =Integer.parseInt(EG_SD_A_I_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_A_I_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_A_I_E =Integer.parseInt(EG_SD_A_I_E1);
				    	            	}
					            break;
					            case "FlyDubai": 
					            	 if(element.equals("FlyDubai"))
						    	       {     
						    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

						    	System.out.println("No of FlyDubai SOLD OUT:" + FlyDubai.size());
						    	
						    	 
						    	 String EG_SD_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
					    		    
						    	 EG_SD_FlyDubai =Integer.parseInt(EG_SD_FlyDubai1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_FlyDubai1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_FlyDubai =Integer.parseInt(EG_SD_FlyDubai1);
				    	            	}
					            break;
					            case "Flynas": 
					            	 if(element.equals("Flynas"))
						    	       {     
						    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

						    	System.out.println("No of Flynas SOLD OUT:" + Flynas.size());
						    	
						    	 
						    	 String EG_SD_Flynas1 =String.format("%1s",Flynas.size());   		    	
					    		    
						    	 EG_SD_Flynas =Integer.parseInt(EG_SD_Flynas1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_SD_Flynas1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_SD_Flynas =Integer.parseInt(EG_SD_Flynas1);
				    	            	}
					            break;
					            
					            
					            default:System.out.println("Not in 10, 20 or 30");  
					         
					            }
					           }
					        }
					  
				        
				        int TotalValue = EG_SD_G_3R1+EG_SD_G_570E+EG_SD_G_5N61+EG_SD_G_7FK5+EG_SD_G_7JY2+EG_SD_G_7X7W+EG_SD_G_802N+EG_SD_G_802R
				        		+EG_SD_G_8SQ7+EG_SD_JAZEERA+EG_SD_KIWI+EG_SD_M_u+EG_SD_My_Fly+EG_SD_NESMA+EG_SD_PEGASUS+EG_SD_S_9JFH+EG_SD_S_ID2I
				        		+EG_SD_S_L8YI+EG_SD_S_L9AI+EG_SD_S_L9CI+EG_SD_S_T13I+EG_SD_S_T20I+EG_SD_SALAM+EG_SD_S_Jet+EG_SD_U_3R1G+EG_SD_U_570E
				        		+EG_SD_U_5N61+EG_SD_U_6E+EG_SD_U_7FK5+EG_SD_U_7JY2+EG_SD_U_802N+EG_SD_U_802R+EG_SD_U_8SQ7+EG_SD_WATANIYA+EG_SD_A_AR
				        		+EG_SD_A_AR_E+EG_SD_A_AR_M+EG_SD_A_I_E+EG_SD_FlyDubai+EG_SD_Flynas;
						  
				        EG_SD_Supplier_Soldout_Total = TotalValue; 
						 System.out.println("Supplier SOLD OUT total:::----"+EG_SD_Supplier_Soldout_Total);
						
						
				    
				   
						}
					
					
					//*******************Supplier  CANCELLED*********************************************
					Select Supplier_can=new Select(Loginpage.BookingSatus());
					Supplier_can.selectByVisibleText("Cancelled");
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					
					long timeoutInSecondCan = 85;
					WebDriverWait waitCan = new WebDriverWait(driver, timeoutInSecondCan);
					waitCan.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					String EG_Can_count=Loginpage.FlightResults_text().getText();
					System.out.println(EG_Can_count);
					
					
					String Eg_Can = EG_Can_count.trim();
					String[] Eg_Cansplited = Eg_Can.split("\\:");
					System.out.println("No of Results Count"+Eg_Cansplited[1]);
					Thread.sleep(1000);
					
					
					if("Flight Search Results : 0".equals(EG_Can_count))
					{
						
						System.out.println("Supplier Cancelled total:::----0");
						
						EG_CN_G_3R1=0;
						EG_CN_G_570E=0;
						EG_CN_G_5N61=0;
						EG_CN_G_7FK5=0;
						EG_CN_G_7JY2=0;
						EG_CN_G_7X7W=0;
						EG_CN_G_802N=0;
						EG_CN_G_802R=0;
						EG_CN_G_8SQ7=0;
						EG_CN_JAZEERA=0;
						EG_CN_KIWI=0;
						EG_CN_M_u=0;
						EG_CN_My_Fly=0;
						EG_CN_NESMA=0;
						EG_CN_PEGASUS=0;
						EG_CN_S_9JFH=0;
						EG_CN_S_ID2I=0;
						EG_CN_S_L8YI=0;
						EG_CN_S_L9AI=0;
						EG_CN_S_L9CI=0;
						EG_CN_S_T13I=0;
						EG_CN_S_T20I=0;
						EG_CN_SALAM=0;
						EG_CN_S_Jet=0;
						EG_CN_U_3R1G=0;
						EG_CN_U_570E=0;
						EG_CN_U_5N61=0;
						EG_CN_U_6E=0;
						EG_CN_U_7FK5=0;
						EG_CN_U_7JY2=0;
						EG_CN_U_802N=0;
						EG_CN_U_802R=0;
						EG_CN_U_8SQ7=0;
						EG_CN_WATANIYA=0;
						EG_CN_A_AR=0;
						EG_CN_A_AR_E=0;
						EG_CN_A_AR_M=0;
						EG_CN_A_I_E=0;
						EG_CN_FlyDubai=0;
						EG_CN_Flynas=0;
					         
						
						
				         int TotalValue =0;
				         EG_CN_Supplier_Cancelled_Total = TotalValue; 
				 				 System.out.println("Supplier Cancelled total:::----"+EG_CN_Supplier_Cancelled_Total);
				 				
				 				
				 	        
				        
				      
					}
					else
					{
					
						List<WebElement> CN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
						 
						  System.out.println("Total Number of Supplier:" + CN.size());
						
						ArrayList<String>list=new ArrayList<>();
						
						 for (WebElement element1 : CN)
						  {
							 list.add(element1.getText());
							 Suppliers_CN_EG.add(element1.getText());
						  }
						  ArrayList<String> unique = removeDuplicates(list);
						  System.out.println("unique:"+unique.size());
						  EG_UniqueCount_CN=unique.size();
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

						    	System.out.println("No of G_3R1 Cancelled:" + G_3R1.size());
						    	String EG_CN_G_3R11 =String.format("%1s",G_3R1.size());
						    	
						    	
						    	 EG_CN_G_3R1 =Integer.parseInt(EG_CN_G_3R11);
						    	
						    	       }
					            	else
					            	{
					            		String EG_CN_G_3R11 =String.format("%1s",0);
					    		    	
					    		    	
					            		EG_CN_G_3R1 =Integer.parseInt(EG_CN_G_3R11);
					            	}
						    	      
					            break; 
					            
					            case "Galileo-570E": 
					            	   
						    	       if(element.equals("Galileo-570E"))
						    	       {
						    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

						    	  System.out.println("No of Galileo-570E Cancelled:" + G_570E.size());
						    	  String EG_CN_G_570E1 =String.format("%1s",G_570E.size());
						    	  
				    		    	
				    		    	
						    	  EG_CN_G_570E =Integer.parseInt(EG_CN_G_570E1);
						    	       }
						    	       else
				    	            	{
						    	    	   String EG_CN_G_570E1 =String.format("%1s",0);
						    		    	  
						    		    	
						    		    	
						    	    	   EG_CN_G_570E =Integer.parseInt(EG_CN_G_570E1);
				    	            	}
						    	      
					            break;  
					            case "Galileo-5N61": 
					            	 if(element.equals("Galileo-5N61"))
						    	       {   
						    	       
						    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

						    	System.out.println("No of Galileo-5N61 Cancelled:" + G_5N61.size());
						    	
						    	
						    	 String EG_CN_G_5N611 =String.format("%1s",G_5N61.size());   		    	
				    		    
						    	 EG_CN_G_5N61 =Integer.parseInt(EG_CN_G_5N611);
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_G_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_G_5N61 =Integer.parseInt(EG_CN_G_5N611);
				    	            	}
					            break; 
					            case "Galileo-7FK5": 
					            	 if(element.equals("Galileo-7FK5"))
						    	       {   
						    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

						    	System.out.println("No of Galileo-7FK5 Cancelled:" + G_7FK5.size());
						    	 
						    	 String EG_CN_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
					    		    
						    	 EG_CN_G_7FK5 =Integer.parseInt(EG_CN_G_7FK51);
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_G_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_G_7FK5 =Integer.parseInt(EG_CN_G_7FK51);
				    	            	}
						    	      
					            break; 
					            case "Galileo-7JY2": 
					            	 if(element.equals("Galileo-7JY2"))
						    	       {        
						    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

						    	System.out.println("No of Galileo-7JY2 Cancelled:" + G_7JY2.size());
						    	
						    	 String EG_CN_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
					    		    
						    	 EG_CN_G_7JY2 =Integer.parseInt(EG_CN_G_7JY21);
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_G_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_G_7JY2 =Integer.parseInt(EG_CN_G_7JY21);
				    	            	}
						    	     
						    	       
					            break;  
					            case "Galileo-7X7W": 
					            	  if(element.equals("Galileo-7X7W"))
						    	       {   
						    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

						    	System.out.println("No of Galileo-7X7W Cancelled:" + G_7X7W.size());
						    	
						    	
						    	String EG_CN_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
				    		    
						    	EG_CN_G_7X7W =Integer.parseInt(EG_CN_G_7X7W1);
						    	       }
					            	  else
				    	            	{
					            			String EG_CN_G_7X7W1 =String.format("%1s",0);   		    	
							    		    
					            			EG_CN_G_7X7W =Integer.parseInt(EG_CN_G_7X7W1);
				    	            	}
					            break; 
					            case "Galileo-802N": 
					            	  if(element.equals("Galileo-802N"))
						    	       {        
						    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

						    	System.out.println("No of Galileo-802N Cancelled:" + G_802N.size());
						    	
						    	
						    	String EG_CN_G_802N1 =String.format("%1s",G_802N.size());   		    	
				    		    
						    	EG_CN_G_802N =Integer.parseInt(EG_CN_G_802N1);
						    	
						    	       }
					            	  else
				    	            	{
					            		  String EG_CN_G_802N1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_CN_G_802N =Integer.parseInt(EG_CN_G_802N1);
				    	            	}
						    	      
						    	     
					            break;
					            case "Galileo-802R": 
					            	  if(element.equals("Galileo-802R"))
						    	       {   
						    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

						    	System.out.println("No of Galileo-802R Cancelled:" + G_802R.size());
						    	
						    	String EG_CN_G_802R1 =String.format("%1s",G_802R.size());   		    	
				    		    
						    	EG_CN_G_802R =Integer.parseInt(EG_CN_G_802R1);
						    	       }
						    	       
					            	  else
				    	            	{
					            		  String EG_CN_G_802R1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_CN_G_802R =Integer.parseInt(EG_CN_G_802R1);
				    	            	}
						    	       
					            break; 
					            case "Galileo-8SQ7": 
					            	if(element.equals("Galileo-8SQ7"))
						    	       {  
						    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

						    	System.out.println("No of Galileo-8SQ7 Cancelled:" + G_8SQ7.size());
						    	 
						    	 String EG_CN_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
					    		    
						    	 EG_CN_G_8SQ7 =Integer.parseInt(EG_CN_G_8SQ71);
						    	       }
					            	else
					            	{
					            		String EG_CN_G_8SQ71 =String.format("%1s",0);   		    	
						    		    
					            		EG_CN_G_8SQ7 =Integer.parseInt(EG_CN_G_8SQ71);
					            	}
						    	     
					            break;
					            case "JAZEERA": 
					            	
					            	  if(element.equals("JAZEERA"))
						    	       {  
						    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

						     	System.out.println("No of JAZEERA Cancelled:" + JAZEERA.size());
						    	 
						    	 String EG_CN_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
					    		    
						    	 EG_CN_JAZEERA =Integer.parseInt(EG_CN_JAZEERA1);
						    	       }
					            	  else
				    	            	{
					            		  
						    		    	 String EG_CN_JAZEERA1 =String.format("%1s",0);   		    	
								    		    
						    		    	 EG_CN_JAZEERA =Integer.parseInt(EG_CN_JAZEERA1);
				    	            	}
						    	      
					            break; 
					            case "KIWI": 
					            	 if(element.equals("KIWI"))
						    	       {     
						    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

						    	System.out.println("No of KIWI Cancelled:" + KIWI.size());
						    	
						    	 
						    	 String EG_CN_KIWI1 =String.format("%1s",KIWI.size());   		    	
					    		    
						    	 EG_CN_KIWI =Integer.parseInt(EG_CN_KIWI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_KIWI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_KIWI =Integer.parseInt(EG_CN_KIWI1);
				    	            	}
					            break;
					            case "Manual": 
					            	 if(element.equals("Manual"))
						    	       {     
						    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

						    	System.out.println("No of Manual Cancelled:" + M_u.size());
						    	
						    	 
						    	 String EG_CN_M_u1 =String.format("%1s",M_u.size());   		    	
					    		    
						    	 EG_CN_M_u =Integer.parseInt(EG_CN_M_u1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_M_u1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_M_u =Integer.parseInt(EG_CN_M_u1);
				    	            	}
					            break;
					            case "MystiFly": 
					            	 if(element.equals("MystiFly"))
						    	       {     
						    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

						    	System.out.println("No of MystiFly Cancelled:" + My_Fly.size());
						    	
						    	 
						    	 String EG_CN_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
					    		    
						    	 EG_CN_My_Fly =Integer.parseInt(EG_CN_My_Fly1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_My_Fly1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_My_Fly =Integer.parseInt(EG_CN_My_Fly1);
				    	            	}
					            break;
					            case "NESMA": 
					            	 if(element.equals("NESMA"))
						    	       {     
						    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

						    	System.out.println("No of NESMA Cancelled:" + NESMA.size());
						    	
						    	 
						    	 String EG_CN_NESMA1 =String.format("%1s",NESMA.size());   		    	
					    		    
						    	 EG_CN_NESMA =Integer.parseInt(EG_CN_NESMA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_NESMA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_NESMA =Integer.parseInt(EG_CN_NESMA1);
				    	            	}
					            break;
					            case "PEGASUS": 
					            	 if(element.equals("PEGASUS"))
						    	       {     
						    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

						    	System.out.println("No of PEGASUS Cancelled:" + PEGASUS.size());
						    	
						    	 
						    	 String EG_CN_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
					    		    
						    	 EG_CN_PEGASUS =Integer.parseInt(EG_CN_PEGASUS1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_PEGASUS1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_PEGASUS =Integer.parseInt(EG_CN_PEGASUS1);
				    	            	}
					            break;
					            case "SABRE-9JFH": 
					            	 if(element.equals("SABRE-9JFH"))
						    	       {     
						    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

						    	System.out.println("No of SABRE-9JFH Cancelled:" + S_9JFH.size());
						    	
						    	 
						    	 String EG_CN_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
					    		    
						    	 EG_CN_S_9JFH =Integer.parseInt(EG_CN_S_9JFH1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_9JFH1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_9JFH =Integer.parseInt(EG_CN_S_9JFH1);
				    	            	}
					            break;
					            case "SABRE-ID2I": 
					            	 if(element.equals("SABRE-ID2I"))
						    	       {     
						    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

						    	System.out.println("No of SABRE-ID2I Cancelled:" + S_ID2I.size());
						    	
						    	 
						    	 String EG_CN_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
					    		    
						    	 EG_CN_S_ID2I =Integer.parseInt(EG_CN_S_ID2I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_ID2I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_ID2I =Integer.parseInt(EG_CN_S_ID2I1);
				    	            	}
					            break;
					            case "SABRE-L8YI": 
					            	 if(element.equals("SABRE-L8YI"))
						    	       {     
						    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

						    	System.out.println("No of SABRE-L8YI Cancelled:" + S_L8YI.size());
						    	
						    	 
						    	 String EG_CN_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
					    		    
						    	 EG_CN_S_L8YI =Integer.parseInt(EG_CN_S_L8YI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_L8YI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_L8YI =Integer.parseInt(EG_CN_S_L8YI1);
				    	            	}
					            break;
					            case "SABRE-L9AI": 
					            	 if(element.equals("SABRE-L9AI"))
						    	       {     
						    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

						    	System.out.println("No of SABRE-L9AI Cancelled:" + S_L9AI.size());
						    	
						    	 
						    	 String EG_CN_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
					    		    
						    	 EG_CN_S_L9AI =Integer.parseInt(EG_CN_S_L9AI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_L9AI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_L9AI =Integer.parseInt(EG_CN_S_L9AI1);
				    	            	}
					            break;
					            case "SABRE-L9CI": 
					            	 if(element.equals("SABRE-L9CI"))
						    	       {     
						    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

						    	System.out.println("No of SABRE-L9CI Cancelled:" + S_L9CI.size());
						    	
						    	 
						    	 String EG_CN_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
					    		    
						    	 EG_CN_S_L9CI =Integer.parseInt(EG_CN_S_L9CI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_L9CI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_L9CI =Integer.parseInt(EG_CN_S_L9CI1);
				    	            	}
					            break;
					            case "SABRE-T13I": 
					            	 if(element.equals("SABRE-T13I"))
						    	       {     
						    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

						    	System.out.println("No of SABRE-T13I Cancelled:" + S_T13I.size());
						    	
						    	 
						    	 String EG_CN_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
					    		    
						    	 EG_CN_S_T13I =Integer.parseInt(EG_CN_S_T13I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_T13I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_T13I =Integer.parseInt(EG_CN_S_T13I1);
				    	            	}
					            break;
					            case "SABRE-T20I": 
					            	 if(element.equals("SABRE-T20I"))
						    	       {     
						    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

						    	System.out.println("No of SABRE-T20I Cancelled:" + S_T20I.size());
						    	
						    	 
						    	 String EG_CN_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
					    		    
						    	 EG_CN_S_T20I =Integer.parseInt(EG_CN_S_T20I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_T20I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_T20I =Integer.parseInt(EG_CN_S_T20I1);
				    	            	}
					            break;
					            case "SALAM": 
					            	 if(element.equals("SALAM"))
						    	       {     
						    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

						    	System.out.println("No of SALAM Cancelled:" + SALAM.size());
						    	
						    	 
						    	 String EG_CN_SALAM1 =String.format("%1s",SALAM.size());   		    	
					    		    
						    	 EG_CN_SALAM =Integer.parseInt(EG_CN_SALAM1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_SALAM1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_SALAM =Integer.parseInt(EG_CN_SALAM1);
				    	            	}
					            break;
					            case "SpiceJet": 
					            	 if(element.equals("SpiceJet"))
						    	       {     
						    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

						    	System.out.println("No of SpiceJet Cancelled:" + S_Jet.size());
						    	
						    	 
						    	 String EG_CN_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
					    		    
						    	 EG_CN_S_Jet =Integer.parseInt(EG_CN_S_Jet1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_S_Jet1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_S_Jet =Integer.parseInt(EG_CN_S_Jet1);
				    	            	}
					            break;
					            case "UAPI-3R1G": 
					            	 if(element.equals("UAPI-3R1G"))
						    	       {     
						    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

						    	System.out.println("No of UAPI-3R1G Cancelled:" + U_3R1G.size());
						    	
						    	 
						    	 String EG_CN_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
					    		    
						    	 EG_CN_U_3R1G =Integer.parseInt(EG_CN_U_3R1G1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_3R1G1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_3R1G =Integer.parseInt(EG_CN_U_3R1G1);
				    	            	}
					            break;
					            case "UAPI-570E": 
					            	 if(element.equals("UAPI-570E"))
						    	       {     
						    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

						    	System.out.println("No of UAPI-570E Cancelled:" + U_570E.size());
						    	
						    	 
						    	 String EG_CN_U_570E1 =String.format("%1s",U_570E.size());   		    	
					    		    
						    	 EG_CN_U_570E =Integer.parseInt(EG_CN_U_570E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_570E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_570E =Integer.parseInt(EG_CN_U_570E1);
				    	            	}
					            break;
					            case "UAPI-5N61": 
					            	 if(element.equals("UAPI-5N61"))
						    	       {     
						    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

						    	System.out.println("No of UAPI-5N61 Cancelled:" + U_5N61.size());
						    	
						    	 
						    	 String EG_CN_U_5N611 =String.format("%1s",U_5N61.size());   		    	
					    		    
						    	 EG_CN_U_5N61 =Integer.parseInt(EG_CN_U_5N611);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_5N61 =Integer.parseInt(EG_CN_U_5N611);
				    	            	}
					            break;
					            case "UAPI-6E": 
					            	 if(element.equals("UAPI-6E"))
						    	       {     
						    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

						    	System.out.println("No of UAPI-6E Cancelled:" + U_6E.size());
						    	
						    	 
						    	 String EG_CN_U_6E1 =String.format("%1s",U_6E.size());   		    	
					    		    
						    	 EG_CN_U_6E =Integer.parseInt(EG_CN_U_6E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_6E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_6E =Integer.parseInt(EG_CN_U_6E1);
				    	            	}
					            break;
					            case "UAPI-7FK5": 
					            	 if(element.equals("UAPI-7FK5"))
						    	       {     
						    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

						    	System.out.println("No of UAPI-7FK5 Cancelled:" + U_7FK5.size());
						    	
						    	 
						    	 String EG_CN_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
					    		    
						    	 EG_CN_U_7FK5 =Integer.parseInt(EG_CN_U_7FK51);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_7FK5 =Integer.parseInt(EG_CN_U_7FK51);
				    	            	}
					            break;
					            case "UAPI-7JY2": 
					            	 if(element.equals("UAPI-7JY2"))
						    	       {     
						    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

						    	System.out.println("No of UAPI-7JY2 Cancelled:" + U_7JY2.size());
						    	
						    	 
						    	 String EG_CN_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
					    		    
						    	 EG_CN_U_7JY2 =Integer.parseInt(EG_CN_U_7JY21);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_7JY2 =Integer.parseInt(EG_CN_U_7JY21);
				    	            	}
					            break;
					            case "UAPI-802N": 
					            	 if(element.equals("UAPI-802N"))
						    	       {     
						    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

						    	System.out.println("No of UAPI-802N Cancelled:" + U_802N.size());
						    	
						    	 
						    	 String EG_CN_U_802N1 =String.format("%1s",U_802N.size());   		    	
					    		    
						    	 EG_CN_U_802N =Integer.parseInt(EG_CN_U_802N1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_802N1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_802N =Integer.parseInt(EG_CN_U_802N1);
				    	            	}
					            break;
					            case "UAPI-802R": 
					            	 if(element.equals("UAPI-802R"))
						    	       {     
						    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

						    	System.out.println("No of UAPI-802R Cancelled:" + U_802R.size());
						    	
						    	 
						    	 String EG_CN_U_802R1 =String.format("%1s",U_802R.size());   		    	
					    		    
						    	 EG_CN_U_802R =Integer.parseInt(EG_CN_U_802R1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_802R1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_802R =Integer.parseInt(EG_CN_U_802R1);
				    	            	}
					            break;
					            case "UAPI-8SQ7": 
					            	 if(element.equals("UAPI-8SQ7"))
						    	       {     
						    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

						    	System.out.println("No of UAPI-8SQ7 Cancelled:" + U_8SQ7.size());
						    	
						    	 
						    	 String EG_CN_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
					    		    
						    	 EG_CN_U_8SQ7 =Integer.parseInt(EG_CN_U_8SQ71);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_U_8SQ71 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_U_8SQ7 =Integer.parseInt(EG_CN_U_8SQ71);
				    	            	}
					            break;
					            case "WATANIYA": 
					            	 if(element.equals("WATANIYA"))
						    	       {     
						    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

						    	System.out.println("No of WATANIYA Cancelled:" + WATANIYA.size());
						    	
						    	 
						    	 String EG_CN_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
					    		    
						    	 EG_CN_WATANIYA =Integer.parseInt(EG_CN_WATANIYA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_WATANIYA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_WATANIYA =Integer.parseInt(EG_CN_WATANIYA1);
				    	            	}
					            break;
					            case "Air Arabia": 
					            	 if(element.equals("Air Arabia"))
						    	       {     
						    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

						    	System.out.println("No of Air Arabia Cancelled:" + A_AR.size());
						    	
						    	 
						    	 String EG_CN_A_AR1 =String.format("%1s",A_AR.size());   		    	
					    		    
						    	 EG_CN_A_AR =Integer.parseInt(EG_CN_A_AR1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_A_AR1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_A_AR =Integer.parseInt(EG_CN_A_AR1);
				    	            	}
					            break;
					            case "Air Arabia Egypt": 
					            	 if(element.equals("Air Arabia Egypt"))
						    	       {     
						    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

						    	System.out.println("No of Air Arabia Egypt Cancelled:" + A_AR_E.size());
						    	
						    	 
						    	 String EG_CN_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
					    		    
						    	 EG_CN_A_AR_E =Integer.parseInt(EG_CN_A_AR_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_A_AR_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_A_AR_E =Integer.parseInt(EG_CN_A_AR_E1);
				    	            	}
					            break;
					            case "Air Arabia Moroc": 
					            	 if(element.equals("Air Arabia Moroc"))
						    	       {     
						    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

						    	System.out.println("No of Air Arabia Moroc Cancelled:" + A_AR_M.size());
						    	
						    	 
						    	 String EG_CN_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
					    		    
						    	 EG_CN_A_AR_M =Integer.parseInt(EG_CN_A_AR_M1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_A_AR_M1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_A_AR_M =Integer.parseInt(EG_CN_A_AR_M1);
				    	            	}
					            break;
					            case "AirIndiaExpress": 
					            	 if(element.equals("AirIndiaExpress"))
						    	       {     
						    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

						    	System.out.println("No of AirIndiaExpress Cancelled:" + A_I_E.size());
						    	
						    	 
						    	 String EG_CN_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
					    		    
						    	 EG_CN_A_I_E =Integer.parseInt(EG_CN_A_I_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_A_I_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_A_I_E =Integer.parseInt(EG_CN_A_I_E1);
				    	            	}
					            break;
					            case "FlyDubai": 
					            	 if(element.equals("FlyDubai"))
						    	       {     
						    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

						    	System.out.println("No of FlyDubai Cancelled:" + FlyDubai.size());
						    	
						    	 
						    	 String EG_CN_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
					    		    
						    	 EG_CN_FlyDubai =Integer.parseInt(EG_CN_FlyDubai1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_FlyDubai1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_FlyDubai =Integer.parseInt(EG_CN_FlyDubai1);
				    	            	}
					            break;
					            case "Flynas": 
					            	 if(element.equals("Flynas"))
						    	       {     
						    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

						    	System.out.println("No of Flynas Cancelled:" + Flynas.size());
						    	
						    	 
						    	 String EG_CN_Flynas1 =String.format("%1s",Flynas.size());   		    	
					    		    
						    	 EG_CN_Flynas =Integer.parseInt(EG_CN_Flynas1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_CN_Flynas1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_CN_Flynas =Integer.parseInt(EG_CN_Flynas1);
				    	            	}
					            break;
					            
					            
					            default:System.out.println("Not in 10, 20 or 30");  
					         
					            }
					           }
					        }
					  
				        
				        int TotalValue = EG_CN_G_3R1+EG_CN_G_570E+EG_CN_G_5N61+EG_CN_G_7FK5+EG_CN_G_7JY2+EG_CN_G_7X7W+EG_CN_G_802N+EG_CN_G_802R
				        		+EG_CN_G_8SQ7+EG_CN_JAZEERA+EG_CN_KIWI+EG_CN_M_u+EG_CN_My_Fly+EG_CN_NESMA+EG_CN_PEGASUS+EG_CN_S_9JFH+EG_CN_S_ID2I
				        		+EG_CN_S_L8YI+EG_CN_S_L9AI+EG_CN_S_L9CI+EG_CN_S_T13I+EG_CN_S_T20I+EG_CN_SALAM+EG_CN_S_Jet+EG_CN_U_3R1G+EG_CN_U_570E
				        		+EG_CN_U_5N61+EG_CN_U_6E+EG_CN_U_7FK5+EG_CN_U_7JY2+EG_CN_U_802N+EG_CN_U_802R+EG_CN_U_8SQ7+EG_CN_WATANIYA+EG_CN_A_AR
				        		+EG_CN_A_AR_E+EG_CN_A_AR_M+EG_CN_A_I_E+EG_CN_FlyDubai+EG_CN_Flynas;
						  
				        EG_CN_Supplier_Cancelled_Total = TotalValue; 
						 System.out.println("Supplier Cancelled total:::----"+EG_CN_Supplier_Cancelled_Total);
						
						
				    
				   
						}
					
					//*******************Supplier  Transaction Hold*********************************************
					Select Supplier_TH=new Select(Loginpage.BookingSatus());
					Supplier_TH.selectByVisibleText("Transaction Hold");
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					
					long timeoutInSecondth = 85;
					WebDriverWait waitth = new WebDriverWait(driver, timeoutInSecondth);
					waitth.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					String EG_TH_count=Loginpage.FlightResults_text().getText();
					System.out.println(EG_TH_count);
					
					
					String Eg_TH = EG_TH_count.trim();
					String[] Eg_THsplited = Eg_TH.split("\\:");
					System.out.println("No of Results Count"+Eg_THsplited[1]);
					Thread.sleep(1000);
					
					
					if("Flight Search Results : 0".equals(EG_TH_count))
					{
						
						System.out.println("Supplier Transaction Hold total:::----0");
						
						EG_TH_G_3R1=0;
						EG_TH_G_570E=0;
						EG_TH_G_5N61=0;
						EG_TH_G_7FK5=0;
						EG_TH_G_7JY2=0;
						EG_TH_G_7X7W=0;
						EG_TH_G_802N=0;
						EG_TH_G_802R=0;
						EG_TH_G_8SQ7=0;
						EG_TH_JAZEERA=0;
						EG_TH_KIWI=0;
						EG_TH_M_u=0;
						EG_TH_My_Fly=0;
						EG_TH_NESMA=0;
						EG_TH_PEGASUS=0;
						EG_TH_S_9JFH=0;
						EG_TH_S_ID2I=0;
						EG_TH_S_L8YI=0;
						EG_TH_S_L9AI=0;
						EG_TH_S_L9CI=0;
						EG_TH_S_T13I=0;
						EG_TH_S_T20I=0;
						EG_TH_SALAM=0;
						EG_TH_S_Jet=0;
						EG_TH_U_3R1G=0;
						EG_TH_U_570E=0;
						EG_TH_U_5N61=0;
						EG_TH_U_6E=0;
						EG_TH_U_7FK5=0;
						EG_TH_U_7JY2=0;
						EG_TH_U_802N=0;
						EG_TH_U_802R=0;
						EG_TH_U_8SQ7=0;
						EG_TH_WATANIYA=0;
						EG_TH_A_AR=0;
						EG_TH_A_AR_E=0;
						EG_TH_A_AR_M=0;
						EG_TH_A_I_E=0;
						EG_TH_FlyDubai=0;
						EG_TH_Flynas=0;
					         
						
						
				         int TotalValue =0;
				         EG_TH_Supplier_Transaction_Hold_Total = TotalValue; 
				 				 System.out.println("Supplier Transaction Hold total:::----"+EG_TH_Supplier_Transaction_Hold_Total);
				 				
				 				
				 	        
				        
				      
					}
					else
					{
					
						List<WebElement> TH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
						 
						  System.out.println("Total Number of Supplier:" + TH.size());
						
						ArrayList<String>list=new ArrayList<>();
						
						 for (WebElement element1 : TH)
						  {
							 list.add(element1.getText());
							 Suppliers_TH_EG.add(element1.getText());
						  }
						  ArrayList<String> unique = removeDuplicates(list);
						  System.out.println("unique:"+unique.size());
						  EG_UniqueCount_TH=unique.size();
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

						    	System.out.println("No of G_3R1 Transaction Hold:" + G_3R1.size());
						    	String EG_TH_G_3R11 =String.format("%1s",G_3R1.size());
						    	
						    	
						    	 EG_TH_G_3R1 =Integer.parseInt(EG_TH_G_3R11);
						    	
						    	       }
					            	else
					            	{
					            		String EG_TH_G_3R11 =String.format("%1s",0);
					    		    	
					    		    	
					            		EG_TH_G_3R1 =Integer.parseInt(EG_TH_G_3R11);
					            	}
						    	      
					            break; 
					            
					            case "Galileo-570E": 
					            	   
						    	       if(element.equals("Galileo-570E"))
						    	       {
						    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

						    	  System.out.println("No of Galileo-570E Transaction Hold:" + G_570E.size());
						    	  String EG_TH_G_570E1 =String.format("%1s",G_570E.size());
						    	  
				    		    	
				    		    	
						    	  EG_TH_G_570E =Integer.parseInt(EG_TH_G_570E1);
						    	       }
						    	       else
				    	            	{
						    	    	   String EG_TH_G_570E1 =String.format("%1s",0);
						    		    	  
						    		    	
						    		    	
						    	    	   EG_TH_G_570E =Integer.parseInt(EG_TH_G_570E1);
				    	            	}
						    	      
					            break;  
					            case "Galileo-5N61": 
					            	 if(element.equals("Galileo-5N61"))
						    	       {   
						    	       
						    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

						    	System.out.println("No of Galileo-5N61 Transaction Hold:" + G_5N61.size());
						    	
						    	
						    	 String EG_TH_G_5N611 =String.format("%1s",G_5N61.size());   		    	
				    		    
						    	 EG_TH_G_5N61 =Integer.parseInt(EG_TH_G_5N611);
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_G_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_G_5N61 =Integer.parseInt(EG_TH_G_5N611);
				    	            	}
					            break; 
					            case "Galileo-7FK5": 
					            	 if(element.equals("Galileo-7FK5"))
						    	       {   
						    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

						    	System.out.println("No of Galileo-7FK5 Transaction Hold:" + G_7FK5.size());
						    	 
						    	 String EG_TH_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
					    		    
						    	 EG_TH_G_7FK5 =Integer.parseInt(EG_TH_G_7FK51);
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_G_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_G_7FK5 =Integer.parseInt(EG_TH_G_7FK51);
				    	            	}
						    	      
					            break; 
					            case "Galileo-7JY2": 
					            	 if(element.equals("Galileo-7JY2"))
						    	       {        
						    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

						    	System.out.println("No of Galileo-7JY2 Transaction Hold:" + G_7JY2.size());
						    	
						    	 String EG_TH_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
					    		    
						    	 EG_TH_G_7JY2 =Integer.parseInt(EG_TH_G_7JY21);
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_G_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_G_7JY2 =Integer.parseInt(EG_TH_G_7JY21);
				    	            	}
						    	     
						    	       
					            break;  
					            case "Galileo-7X7W": 
					            	  if(element.equals("Galileo-7X7W"))
						    	       {   
						    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

						    	System.out.println("No of Galileo-7X7W Transaction Hold:" + G_7X7W.size());
						    	
						    	
						    	String EG_TH_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
				    		    
						    	EG_TH_G_7X7W =Integer.parseInt(EG_TH_G_7X7W1);
						    	       }
					            	  else
				    	            	{
					            			String EG_TH_G_7X7W1 =String.format("%1s",0);   		    	
							    		    
					            			EG_TH_G_7X7W =Integer.parseInt(EG_TH_G_7X7W1);
				    	            	}
					            break; 
					            case "Galileo-802N": 
					            	  if(element.equals("Galileo-802N"))
						    	       {        
						    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

						    	System.out.println("No of Galileo-802N Transaction Hold:" + G_802N.size());
						    	
						    	
						    	String EG_TH_G_802N1 =String.format("%1s",G_802N.size());   		    	
				    		    
						    	EG_TH_G_802N =Integer.parseInt(EG_TH_G_802N1);
						    	
						    	       }
					            	  else
				    	            	{
					            		  String EG_TH_G_802N1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_TH_G_802N =Integer.parseInt(EG_TH_G_802N1);
				    	            	}
						    	      
						    	     
					            break;
					            case "Galileo-802R": 
					            	  if(element.equals("Galileo-802R"))
						    	       {   
						    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

						    	System.out.println("No of Galileo-802R Transaction Hold:" + G_802R.size());
						    	
						    	String EG_TH_G_802R1 =String.format("%1s",G_802R.size());   		    	
				    		    
						    	EG_TH_G_802R =Integer.parseInt(EG_TH_G_802R1);
						    	       }
						    	       
					            	  else
				    	            	{
					            		  String EG_TH_G_802R1 =String.format("%1s",0);   		    	
							    		    
					            		  EG_TH_G_802R =Integer.parseInt(EG_TH_G_802R1);
				    	            	}
						    	       
					            break; 
					            case "Galileo-8SQ7": 
					            	if(element.equals("Galileo-8SQ7"))
						    	       {  
						    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

						    	System.out.println("No of Galileo-8SQ7 Transaction Hold:" + G_8SQ7.size());
						    	 
						    	 String EG_TH_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
					    		    
						    	 EG_TH_G_8SQ7 =Integer.parseInt(EG_TH_G_8SQ71);
						    	       }
					            	else
					            	{
					            		String EG_TH_G_8SQ71 =String.format("%1s",0);   		    	
						    		    
					            		EG_TH_G_8SQ7 =Integer.parseInt(EG_TH_G_8SQ71);
					            	}
						    	     
					            break;
					            case "JAZEERA": 
					            	
					            	  if(element.equals("JAZEERA"))
						    	       {  
						    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

						     	System.out.println("No of JAZEERA Transaction Hold:" + JAZEERA.size());
						    	 
						    	 String EG_TH_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
					    		    
						    	 EG_TH_JAZEERA =Integer.parseInt(EG_TH_JAZEERA1);
						    	       }
					            	  else
				    	            	{
					            		  
						    		    	 String EG_TH_JAZEERA1 =String.format("%1s",0);   		    	
								    		    
						    		    	 EG_TH_JAZEERA =Integer.parseInt(EG_TH_JAZEERA1);
				    	            	}
						    	      
					            break; 
					            case "KIWI": 
					            	 if(element.equals("KIWI"))
						    	       {     
						    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

						    	System.out.println("No of KIWI Transaction Hold:" + KIWI.size());
						    	
						    	 
						    	 String EG_TH_KIWI1 =String.format("%1s",KIWI.size());   		    	
					    		    
						    	 EG_TH_KIWI =Integer.parseInt(EG_TH_KIWI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_KIWI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_KIWI =Integer.parseInt(EG_TH_KIWI1);
				    	            	}
					            break;
					            case "Manual": 
					            	 if(element.equals("Manual"))
						    	       {     
						    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

						    	System.out.println("No of Manual Transaction Hold:" + M_u.size());
						    	
						    	 
						    	 String EG_TH_M_u1 =String.format("%1s",M_u.size());   		    	
					    		    
						    	 EG_TH_M_u =Integer.parseInt(EG_TH_M_u1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_M_u1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_M_u =Integer.parseInt(EG_TH_M_u1);
				    	            	}
					            break;
					            case "MystiFly": 
					            	 if(element.equals("MystiFly"))
						    	       {     
						    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

						    	System.out.println("No of MystiFly Transaction Hold:" + My_Fly.size());
						    	
						    	 
						    	 String EG_TH_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
					    		    
						    	 EG_TH_My_Fly =Integer.parseInt(EG_TH_My_Fly1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_My_Fly1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_My_Fly =Integer.parseInt(EG_TH_My_Fly1);
				    	            	}
					            break;
					            case "NESMA": 
					            	 if(element.equals("NESMA"))
						    	       {     
						    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

						    	System.out.println("No of NESMA Transaction Hold:" + NESMA.size());
						    	
						    	 
						    	 String EG_TH_NESMA1 =String.format("%1s",NESMA.size());   		    	
					    		    
						    	 EG_TH_NESMA =Integer.parseInt(EG_TH_NESMA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_NESMA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_NESMA =Integer.parseInt(EG_TH_NESMA1);
				    	            	}
					            break;
					            case "PEGASUS": 
					            	 if(element.equals("PEGASUS"))
						    	       {     
						    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

						    	System.out.println("No of PEGASUS Transaction Hold:" + PEGASUS.size());
						    	
						    	 
						    	 String EG_TH_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
					    		    
						    	 EG_TH_PEGASUS =Integer.parseInt(EG_TH_PEGASUS1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_PEGASUS1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_PEGASUS =Integer.parseInt(EG_TH_PEGASUS1);
				    	            	}
					            break;
					            case "SABRE-9JFH": 
					            	 if(element.equals("SABRE-9JFH"))
						    	       {     
						    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

						    	System.out.println("No of SABRE-9JFH Transaction Hold:" + S_9JFH.size());
						    	
						    	 
						    	 String EG_TH_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
					    		    
						    	 EG_TH_S_9JFH =Integer.parseInt(EG_TH_S_9JFH1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_9JFH1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_9JFH =Integer.parseInt(EG_TH_S_9JFH1);
				    	            	}
					            break;
					            case "SABRE-ID2I": 
					            	 if(element.equals("SABRE-ID2I"))
						    	       {     
						    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

						    	System.out.println("No of SABRE-ID2I Transaction Hold:" + S_ID2I.size());
						    	
						    	 
						    	 String EG_TH_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
					    		    
						    	 EG_TH_S_ID2I =Integer.parseInt(EG_TH_S_ID2I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_ID2I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_ID2I =Integer.parseInt(EG_TH_S_ID2I1);
				    	            	}
					            break;
					            case "SABRE-L8YI": 
					            	 if(element.equals("SABRE-L8YI"))
						    	       {     
						    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

						    	System.out.println("No of SABRE-L8YI Transaction Hold:" + S_L8YI.size());
						    	
						    	 
						    	 String EG_TH_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
					    		    
						    	 EG_TH_S_L8YI =Integer.parseInt(EG_TH_S_L8YI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_L8YI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_L8YI =Integer.parseInt(EG_TH_S_L8YI1);
				    	            	}
					            break;
					            case "SABRE-L9AI": 
					            	 if(element.equals("SABRE-L9AI"))
						    	       {     
						    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

						    	System.out.println("No of SABRE-L9AI Transaction Hold:" + S_L9AI.size());
						    	
						    	 
						    	 String EG_TH_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
					    		    
						    	 EG_TH_S_L9AI =Integer.parseInt(EG_TH_S_L9AI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_L9AI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_L9AI =Integer.parseInt(EG_TH_S_L9AI1);
				    	            	}
					            break;
					            case "SABRE-L9CI": 
					            	 if(element.equals("SABRE-L9CI"))
						    	       {     
						    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

						    	System.out.println("No of SABRE-L9CI Transaction Hold:" + S_L9CI.size());
						    	
						    	 
						    	 String EG_TH_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
					    		    
						    	 EG_TH_S_L9CI =Integer.parseInt(EG_TH_S_L9CI1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_L9CI1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_L9CI =Integer.parseInt(EG_TH_S_L9CI1);
				    	            	}
					            break;
					            case "SABRE-T13I": 
					            	 if(element.equals("SABRE-T13I"))
						    	       {     
						    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

						    	System.out.println("No of SABRE-T13I Transaction Hold:" + S_T13I.size());
						    	
						    	 
						    	 String EG_TH_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
					    		    
						    	 EG_TH_S_T13I =Integer.parseInt(EG_TH_S_T13I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_T13I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_T13I =Integer.parseInt(EG_TH_S_T13I1);
				    	            	}
					            break;
					            case "SABRE-T20I": 
					            	 if(element.equals("SABRE-T20I"))
						    	       {     
						    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

						    	System.out.println("No of SABRE-T20I Transaction Hold:" + S_T20I.size());
						    	
						    	 
						    	 String EG_TH_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
					    		    
						    	 EG_TH_S_T20I =Integer.parseInt(EG_TH_S_T20I1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_T20I1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_T20I =Integer.parseInt(EG_TH_S_T20I1);
				    	            	}
					            break;
					            case "SALAM": 
					            	 if(element.equals("SALAM"))
						    	       {     
						    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

						    	System.out.println("No of SALAM Transaction Hold:" + SALAM.size());
						    	
						    	 
						    	 String EG_TH_SALAM1 =String.format("%1s",SALAM.size());   		    	
					    		    
						    	 EG_TH_SALAM =Integer.parseInt(EG_TH_SALAM1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_SALAM1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_SALAM =Integer.parseInt(EG_TH_SALAM1);
				    	            	}
					            break;
					            case "SpiceJet": 
					            	 if(element.equals("SpiceJet"))
						    	       {     
						    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

						    	System.out.println("No of SpiceJet Transaction Hold:" + S_Jet.size());
						    	
						    	 
						    	 String EG_TH_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
					    		    
						    	 EG_TH_S_Jet =Integer.parseInt(EG_TH_S_Jet1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_S_Jet1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_S_Jet =Integer.parseInt(EG_TH_S_Jet1);
				    	            	}
					            break;
					            case "UAPI-3R1G": 
					            	 if(element.equals("UAPI-3R1G"))
						    	       {     
						    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

						    	System.out.println("No of UAPI-3R1G Transaction Hold:" + U_3R1G.size());
						    	
						    	 
						    	 String EG_TH_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
					    		    
						    	 EG_TH_U_3R1G =Integer.parseInt(EG_TH_U_3R1G1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_3R1G1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_3R1G =Integer.parseInt(EG_TH_U_3R1G1);
				    	            	}
					            break;
					            case "UAPI-570E": 
					            	 if(element.equals("UAPI-570E"))
						    	       {     
						    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

						    	System.out.println("No of UAPI-570E Transaction Hold:" + U_570E.size());
						    	
						    	 
						    	 String EG_TH_U_570E1 =String.format("%1s",U_570E.size());   		    	
					    		    
						    	 EG_TH_U_570E =Integer.parseInt(EG_TH_U_570E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_570E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_570E =Integer.parseInt(EG_TH_U_570E1);
				    	            	}
					            break;
					            case "UAPI-5N61": 
					            	 if(element.equals("UAPI-5N61"))
						    	       {     
						    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

						    	System.out.println("No of UAPI-5N61 Transaction Hold:" + U_5N61.size());
						    	
						    	 
						    	 String EG_TH_U_5N611 =String.format("%1s",U_5N61.size());   		    	
					    		    
						    	 EG_TH_U_5N61 =Integer.parseInt(EG_TH_U_5N611);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_5N611 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_5N61 =Integer.parseInt(EG_TH_U_5N611);
				    	            	}
					            break;
					            case "UAPI-6E": 
					            	 if(element.equals("UAPI-6E"))
						    	       {     
						    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

						    	System.out.println("No of UAPI-6E Transaction Hold:" + U_6E.size());
						    	
						    	 
						    	 String EG_TH_U_6E1 =String.format("%1s",U_6E.size());   		    	
					    		    
						    	 EG_TH_U_6E =Integer.parseInt(EG_TH_U_6E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_6E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_6E =Integer.parseInt(EG_TH_U_6E1);
				    	            	}
					            break;
					            case "UAPI-7FK5": 
					            	 if(element.equals("UAPI-7FK5"))
						    	       {     
						    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

						    	System.out.println("No of UAPI-7FK5 Transaction Hold:" + U_7FK5.size());
						    	
						    	 
						    	 String EG_TH_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
					    		    
						    	 EG_TH_U_7FK5 =Integer.parseInt(EG_TH_U_7FK51);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_7FK51 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_7FK5 =Integer.parseInt(EG_TH_U_7FK51);
				    	            	}
					            break;
					            case "UAPI-7JY2": 
					            	 if(element.equals("UAPI-7JY2"))
						    	       {     
						    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

						    	System.out.println("No of UAPI-7JY2 Transaction Hold:" + U_7JY2.size());
						    	
						    	 
						    	 String EG_TH_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
					    		    
						    	 EG_TH_U_7JY2 =Integer.parseInt(EG_TH_U_7JY21);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_7JY21 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_7JY2 =Integer.parseInt(EG_TH_U_7JY21);
				    	            	}
					            break;
					            case "UAPI-802N": 
					            	 if(element.equals("UAPI-802N"))
						    	       {     
						    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

						    	System.out.println("No of UAPI-802N Transaction Hold:" + U_802N.size());
						    	
						    	 
						    	 String EG_TH_U_802N1 =String.format("%1s",U_802N.size());   		    	
					    		    
						    	 EG_TH_U_802N =Integer.parseInt(EG_TH_U_802N1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_802N1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_802N =Integer.parseInt(EG_TH_U_802N1);
				    	            	}
					            break;
					            case "UAPI-802R": 
					            	 if(element.equals("UAPI-802R"))
						    	       {     
						    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

						    	System.out.println("No of UAPI-802R Transaction Hold:" + U_802R.size());
						    	
						    	 
						    	 String EG_TH_U_802R1 =String.format("%1s",U_802R.size());   		    	
					    		    
						    	 EG_TH_U_802R =Integer.parseInt(EG_TH_U_802R1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_802R1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_802R =Integer.parseInt(EG_TH_U_802R1);
				    	            	}
					            break;
					            case "UAPI-8SQ7": 
					            	 if(element.equals("UAPI-8SQ7"))
						    	       {     
						    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

						    	System.out.println("No of UAPI-8SQ7 Transaction Hold:" + U_8SQ7.size());
						    	
						    	 
						    	 String EG_TH_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
					    		    
						    	 EG_TH_U_8SQ7 =Integer.parseInt(EG_TH_U_8SQ71);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_U_8SQ71 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_U_8SQ7 =Integer.parseInt(EG_TH_U_8SQ71);
				    	            	}
					            break;
					            case "WATANIYA": 
					            	 if(element.equals("WATANIYA"))
						    	       {     
						    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

						    	System.out.println("No of WATANIYA Transaction Hold:" + WATANIYA.size());
						    	
						    	 
						    	 String EG_TH_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
					    		    
						    	 EG_TH_WATANIYA =Integer.parseInt(EG_TH_WATANIYA1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_WATANIYA1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_WATANIYA =Integer.parseInt(EG_TH_WATANIYA1);
				    	            	}
					            break;
					            case "Air Arabia": 
					            	 if(element.equals("Air Arabia"))
						    	       {     
						    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

						    	System.out.println("No of Air Arabia Transaction Hold:" + A_AR.size());
						    	
						    	 
						    	 String EG_TH_A_AR1 =String.format("%1s",A_AR.size());   		    	
					    		    
						    	 EG_TH_A_AR =Integer.parseInt(EG_TH_A_AR1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_A_AR1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_A_AR =Integer.parseInt(EG_TH_A_AR1);
				    	            	}
					            break;
					            case "Air Arabia Egypt": 
					            	 if(element.equals("Air Arabia Egypt"))
						    	       {     
						    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

						    	System.out.println("No of Air Arabia Egypt Transaction Hold:" + A_AR_E.size());
						    	
						    	 
						    	 String EG_TH_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
					    		    
						    	 EG_TH_A_AR_E =Integer.parseInt(EG_TH_A_AR_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_A_AR_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_A_AR_E =Integer.parseInt(EG_TH_A_AR_E1);
				    	            	}
					            break;
					            case "Air Arabia Moroc": 
					            	 if(element.equals("Air Arabia Moroc"))
						    	       {     
						    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

						    	System.out.println("No of Air Arabia Moroc Transaction Hold:" + A_AR_M.size());
						    	
						    	 
						    	 String EG_TH_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
					    		    
						    	 EG_TH_A_AR_M =Integer.parseInt(EG_TH_A_AR_M1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_A_AR_M1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_A_AR_M =Integer.parseInt(EG_TH_A_AR_M1);
				    	            	}
					            break;
					            case "AirIndiaExpress": 
					            	 if(element.equals("AirIndiaExpress"))
						    	       {     
						    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

						    	System.out.println("No of AirIndiaExpress Transaction Hold:" + A_I_E.size());
						    	
						    	 
						    	 String EG_TH_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
					    		    
						    	 EG_TH_A_I_E =Integer.parseInt(EG_TH_A_I_E1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_A_I_E1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_A_I_E =Integer.parseInt(EG_TH_A_I_E1);
				    	            	}
					            break;
					            case "FlyDubai": 
					            	 if(element.equals("FlyDubai"))
						    	       {     
						    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

						    	System.out.println("No of FlyDubai Transaction Hold:" + FlyDubai.size());
						    	
						    	 
						    	 String EG_TH_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
					    		    
						    	 EG_TH_FlyDubai =Integer.parseInt(EG_TH_FlyDubai1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_FlyDubai1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_FlyDubai =Integer.parseInt(EG_TH_FlyDubai1);
				    	            	}
					            break;
					            case "Flynas": 
					            	 if(element.equals("Flynas"))
						    	       {     
						    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

						    	System.out.println("No of Flynas Transaction Hold:" + Flynas.size());
						    	
						    	 
						    	 String EG_TH_Flynas1 =String.format("%1s",Flynas.size());   		    	
					    		    
						    	 EG_TH_Flynas =Integer.parseInt(EG_TH_Flynas1);
						    	 
						    	
						    	       }
					            	 else
				    	            	{
					            		 String EG_TH_Flynas1 =String.format("%1s",0);   		    	
							    		    
					            		 EG_TH_Flynas =Integer.parseInt(EG_TH_Flynas1);
				    	            	}
					            break;
					            
					            
					            default:System.out.println("Not in 10, 20 or 30");  
					         
					            }
					           }
					        }
					  
				        
				        int TotalValue = EG_TH_G_3R1+EG_TH_G_570E+EG_TH_G_5N61+EG_TH_G_7FK5+EG_TH_G_7JY2+EG_TH_G_7X7W+EG_TH_G_802N+EG_TH_G_802R
				        		+EG_TH_G_8SQ7+EG_TH_JAZEERA+EG_TH_KIWI+EG_TH_M_u+EG_TH_My_Fly+EG_TH_NESMA+EG_TH_PEGASUS+EG_TH_S_9JFH+EG_TH_S_ID2I
				        		+EG_TH_S_L8YI+EG_TH_S_L9AI+EG_TH_S_L9CI+EG_TH_S_T13I+EG_TH_S_T20I+EG_TH_SALAM+EG_TH_S_Jet+EG_TH_U_3R1G+EG_TH_U_570E
				        		+EG_TH_U_5N61+EG_TH_U_6E+EG_TH_U_7FK5+EG_TH_U_7JY2+EG_TH_U_802N+EG_TH_U_802R+EG_TH_U_8SQ7+EG_TH_WATANIYA+EG_TH_A_AR
				        		+EG_TH_A_AR_E+EG_TH_A_AR_M+EG_TH_A_I_E+EG_TH_FlyDubai+EG_TH_Flynas;
						  
				        EG_TH_Supplier_Transaction_Hold_Total = TotalValue; 
						 System.out.println("Supplier Transaction Hold total:::----"+EG_TH_Supplier_Transaction_Hold_Total);
						
						
				    
				   
						}
					Supplier();
			      
	}

	public static void SupplierEG_TS(WebDriver driver,String EG_S_Trancount)
	{
		if("Flight Search Results : 0".equals(EG_S_Trancount))
		{
			
			System.out.println("Supplier TrancationSuccess total:::----0");
			EG_TS_G_3K6=0;
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
			EG_TS_Flyadeal=0;
			EG_TS_GAL7Q=0;
			EG_TS_S_1LNJ=0;
		         
			
			
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
				 Suppliers_TS_EG.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
			  EG_UniqueCount_TS=unique.size();
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            
		            case "Galileo-3K6": 
		            	if(element.equals("Galileo-3K6")) 
			    	       {
			    	        
			    	List<WebElement> G_3k6=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3K6 ']"));

			    	System.out.println("No of G_3K6 Trancation Successfull:" + G_3k6.size());
			    	String EG_TS_3K6 =String.format("%1s",G_3k6.size());
			    	
			    	
			    	 EG_TS_G_3K6 =Integer.parseInt(EG_TS_3K6);
			    	
			    	       }
		            	else
		            	{
		            		String EG_TS_3K6 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_TS_G_3K6 =Integer.parseInt(EG_TS_3K6);
		            	}
			    	      
		            break; 
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
		            case "FLYADEAL": 
		            	 if(element.equals("FLYADEAL"))
			    	       {     
			    	List<WebElement> Flyadeal=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FLYADEAL ']"));

			    	System.out.println("No of FLYADEAL Trancation Successfull:" + Flyadeal.size());
			    	
			    	 
			    	 String EG_TS_Flyadeal1 =String.format("%1s",Flyadeal.size());   		    	
		    		    
			    	 EG_TS_Flyadeal =Integer.parseInt(EG_TS_Flyadeal1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_Flyadeal1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_Flyadeal =Integer.parseInt(EG_TS_Flyadeal1);
	    	            	}
		            	 
		            break;
		            
		            case "GAL-7Q0W": 
		            	 if(element.equals("GAL-7Q0W"))
			    	       {     
			    	List<WebElement> GAL_7Q=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' GAL-7Q0W ']"));

			    	System.out.println("No of GAL-7Q0W Trancation Successfull:" + GAL_7Q.size());
			    	
			    	 
			    	 String EG_TS_GAL701 =String.format("%1s",GAL_7Q.size());   		    	
		    		    
			    	 EG_TS_GAL7Q =Integer.parseInt(EG_TS_GAL701);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_GAL701 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_GAL7Q =Integer.parseInt(EG_TS_GAL701);
	    	            	}
		            break;
		            case "SABRE-1LNJ": 
		            	 if(element.equals("SABRE-1LNJ"))
			    	       {     
			    	List<WebElement> S_1LNJ=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-1LNJ ']"));

			    	System.out.println("No of SABRE-1LNJ Trancation Successfull:" + S_1LNJ.size());
			    	
			    	 
			    	 String EG_TS_1LNJ =String.format("%1s",S_1LNJ.size());   		    	
		    		    
			    	 EG_TS_S_1LNJ =Integer.parseInt(EG_TS_1LNJ );
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_1LNJ  =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_1LNJ =Integer.parseInt(EG_TS_1LNJ );
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
	        		+EG_TS_A_AR_E+EG_TS_A_AR_M+EG_TS_A_I_E+EG_TS_FlyDubai+EG_TS_Flynas+EG_TS_Flyadeal+EG_TS_GAL7Q+EG_TS_G_3K6+EG_TS_S_1LNJ;
			  
	        EG_TS_Supplier_Transaction_Total = TotalValue; 
			 System.out.println("Supplier Trancation Successfull total:::----"+EG_TS_Supplier_Transaction_Total);
			
			
	    
	   
			}
		
	}
	public static  void SupplierEG_CP(WebDriver driver,String EG_Conp_count)
	{
		if("Flight Search Results : 0".equals(EG_Conp_count))
		{
			
			System.out.println("Supplier Confirmation Pending total:::----0");
			EG_CP_G_3K6=0;
			EG_CP_G_3R1=0;
			EG_CP_G_570E=0;
			EG_CP_G_5N61=0;
			EG_CP_G_7FK5=0;
			EG_CP_G_7JY2=0;
			EG_CP_G_7X7W=0;
			EG_CP_G_802N=0;
			EG_CP_G_802R=0;
			EG_CP_G_8SQ7=0;
			EG_CP_JAZEERA=0;
			EG_CP_KIWI=0;
			EG_CP_M_u=0;
			EG_CP_My_Fly=0;
			EG_CP_NESMA=0;
			EG_CP_PEGASUS=0;
			EG_CP_S_9JFH=0;
			EG_CP_S_ID2I=0;
			EG_CP_S_L8YI=0;
			EG_CP_S_L9AI=0;
			EG_CP_S_L9CI=0;
			EG_CP_S_T13I=0;
			EG_CP_S_T20I=0;
			EG_CP_SALAM=0;
			EG_CP_S_Jet=0;
			EG_CP_U_3R1G=0;
			EG_CP_U_570E=0;
			EG_CP_U_5N61=0;
			EG_CP_U_6E=0;
			EG_CP_U_7FK5=0;
			EG_CP_U_7JY2=0;
			EG_CP_U_802N=0;
			EG_CP_U_802R=0;
			EG_CP_U_8SQ7=0;
			EG_CP_WATANIYA=0;
			EG_CP_A_AR=0;
			EG_CP_A_AR_E=0;
			EG_CP_A_AR_M=0;
			EG_CP_A_I_E=0;
			EG_CP_FlyDubai=0;
			EG_CP_Flynas=0;
			EG_CP_Flyadeal=0;
			EG_CP_GAL7Q=0;   
			EG_CP_S_1LNJ=0;
			
	         int TotalValue =0;
	         EG_CP_Supplier_ConfirmationPending_Total = TotalValue; 
	 				 System.out.println("Supplier Trancation Successfull total:::----"+EG_CP_Supplier_ConfirmationPending_Total);
	 				
	 				
	 	        
	        
	      
		}
		else
		{
		
			List<WebElement> CP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
			 
			  System.out.println("Total Number of Supplier:" + CP.size());
			
			ArrayList<String>list=new ArrayList<>();
			
			 for (WebElement element1 : CP)
			  {
				 list.add(element1.getText());
				 Suppliers_CP_EG.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
			  EG_UniqueCount_CP=unique.size();
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            case "Galileo-3K6": 
		            	if(element.equals("Galileo-3K6")) 
			    	       {
			    	        
			    	List<WebElement> G_3k6=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3K6 ']"));

			    	System.out.println("No of G_3K6 Confirmation Pending:" + G_3k6.size());
			    	String EG_CP_3K6 =String.format("%1s",G_3k6.size());
			    	
			    	
			    	 EG_CP_G_3K6 =Integer.parseInt(EG_CP_3K6);
			    	
			    	       }
		            	else
		            	{
		            		String EG_CP_3K6 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_CP_G_3K6 =Integer.parseInt(EG_CP_3K6);
		            	}
			    	      
		            break; 
		            case "Galileo-3R1G": 
		            	if(element.equals("Galileo-3R1G")) 
			    	       {
			    	        
			    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

			    	System.out.println("No of G_3R1 Confirmation Pending:" + G_3R1.size());
			    	String EG_CP_G_3R11 =String.format("%1s",G_3R1.size());
			    	
			    	
			    	 EG_CP_G_3R1 =Integer.parseInt(EG_CP_G_3R11);
			    	
			    	       }
		            	else
		            	{
		            		String EG_CP_G_3R11 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_CP_G_3R1 =Integer.parseInt(EG_CP_G_3R11);
		            	}
			    	      
		            break; 
		            
		            case "Galileo-570E": 
		            	   
			    	       if(element.equals("Galileo-570E"))
			    	       {
			    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

			    	  System.out.println("No of Galileo-570E Confirmation Pending:" + G_570E.size());
			    	  String EG_CP_G_570E1 =String.format("%1s",G_570E.size());
			    	  
	    		    	
	    		    	
			    	  EG_CP_G_570E =Integer.parseInt(EG_CP_G_570E1);
			    	       }
			    	       else
	    	            	{
			    	    	   String EG_CP_G_570E1 =String.format("%1s",0);
			    		    	  
			    		    	
			    		    	
			    	    	   EG_CP_G_570E =Integer.parseInt(EG_CP_G_570E1);
	    	            	}
			    	      
		            break;  
		            case "Galileo-5N61": 
		            	 if(element.equals("Galileo-5N61"))
			    	       {   
			    	       
			    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

			    	System.out.println("No of Galileo-5N61 Confirmation Pending:" + G_5N61.size());
			    	
			    	
			    	 String EG_CP_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
			    	 EG_CP_G_5N61 =Integer.parseInt(EG_CP_G_5N611);
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_G_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_G_5N61 =Integer.parseInt(EG_CP_G_5N611);
	    	            	}
		            break; 
		            case "Galileo-7FK5": 
		            	 if(element.equals("Galileo-7FK5"))
			    	       {   
			    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

			    	System.out.println("No of Galileo-7FK5 Confirmation Pending:" + G_7FK5.size());
			    	 
			    	 String EG_CP_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
			    	 EG_CP_G_7FK5 =Integer.parseInt(EG_CP_G_7FK51);
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_G_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_G_7FK5 =Integer.parseInt(EG_CP_G_7FK51);
	    	            	}
			    	      
		            break; 
		            case "Galileo-7JY2": 
		            	 if(element.equals("Galileo-7JY2"))
			    	       {        
			    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

			    	System.out.println("No of Galileo-7JY2 Confirmation Pending:" + G_7JY2.size());
			    	
			    	 String EG_CP_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
			    	 EG_CP_G_7JY2 =Integer.parseInt(EG_CP_G_7JY21);
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_G_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_G_7JY2 =Integer.parseInt(EG_CP_G_7JY21);
	    	            	}
			    	     
			    	       
		            break;  
		            case "Galileo-7X7W": 
		            	  if(element.equals("Galileo-7X7W"))
			    	       {   
			    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

			    	System.out.println("No of Galileo-7X7W Confirmation Pending:" + G_7X7W.size());
			    	
			    	
			    	String EG_CP_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
			    	EG_CP_G_7X7W =Integer.parseInt(EG_CP_G_7X7W1);
			    	       }
		            	  else
	    	            	{
		            			String EG_CP_G_7X7W1 =String.format("%1s",0);   		    	
				    		    
		            			EG_CP_G_7X7W =Integer.parseInt(EG_CP_G_7X7W1);
	    	            	}
		            break; 
		            case "Galileo-802N": 
		            	  if(element.equals("Galileo-802N"))
			    	       {        
			    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

			    	System.out.println("No of Galileo-802N Confirmation Pending:" + G_802N.size());
			    	
			    	
			    	String EG_CP_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
			    	EG_CP_G_802N =Integer.parseInt(EG_CP_G_802N1);
			    	
			    	       }
		            	  else
	    	            	{
		            		  String EG_CP_G_802N1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_CP_G_802N =Integer.parseInt(EG_CP_G_802N1);
	    	            	}
			    	      
			    	     
		            break;
		            case "Galileo-802R": 
		            	  if(element.equals("Galileo-802R"))
			    	       {   
			    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

			    	System.out.println("No of Galileo-802R Confirmation Pending:" + G_802R.size());
			    	
			    	String EG_CP_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
			    	EG_CP_G_802R =Integer.parseInt(EG_CP_G_802R1);
			    	       }
			    	       
		            	  else
	    	            	{
		            		  String EG_CP_G_802R1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_CP_G_802R =Integer.parseInt(EG_CP_G_802R1);
	    	            	}
			    	       
		            break; 
		            case "Galileo-8SQ7": 
		            	if(element.equals("Galileo-8SQ7"))
			    	       {  
			    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

			    	System.out.println("No of Galileo-8SQ7 Confirmation Pending:" + G_8SQ7.size());
			    	 
			    	 String EG_CP_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
			    	 EG_CP_G_8SQ7 =Integer.parseInt(EG_CP_G_8SQ71);
			    	       }
		            	else
		            	{
		            		String EG_CP_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
		            		EG_CP_G_8SQ7 =Integer.parseInt(EG_CP_G_8SQ71);
		            	}
			    	     
		            break;
		            case "JAZEERA": 
		            	
		            	  if(element.equals("JAZEERA"))
			    	       {  
			    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

			     	System.out.println("No of JAZEERA Confirmation Pending:" + JAZEERA.size());
			    	 
			    	 String EG_CP_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
			    	 EG_CP_JAZEERA =Integer.parseInt(EG_CP_JAZEERA1);
			    	       }
		            	  else
	    	            	{
		            		  
			    		    	 String EG_CP_JAZEERA1 =String.format("%1s",0);   		    	
					    		    
			    		    	 EG_CP_JAZEERA =Integer.parseInt(EG_CP_JAZEERA1);
	    	            	}
			    	      
		            break; 
		            case "KIWI": 
		            	 if(element.equals("KIWI"))
			    	       {     
			    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

			    	System.out.println("No of KIWI Confirmation Pending:" + KIWI.size());
			    	
			    	 
			    	 String EG_CP_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
			    	 EG_CP_KIWI =Integer.parseInt(EG_CP_KIWI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_KIWI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_KIWI =Integer.parseInt(EG_CP_KIWI1);
	    	            	}
		            break;
		            case "Manual": 
		            	 if(element.equals("Manual"))
			    	       {     
			    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

			    	System.out.println("No of Manual Confirmation Pending:" + M_u.size());
			    	
			    	 
			    	 String EG_CP_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
			    	 EG_CP_M_u =Integer.parseInt(EG_CP_M_u1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_M_u1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_M_u =Integer.parseInt(EG_CP_M_u1);
	    	            	}
		            break;
		            case "MystiFly": 
		            	 if(element.equals("MystiFly"))
			    	       {     
			    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

			    	System.out.println("No of MystiFly Confirmation Pending:" + My_Fly.size());
			    	
			    	 
			    	 String EG_CP_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
			    	 EG_CP_My_Fly =Integer.parseInt(EG_CP_My_Fly1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_My_Fly1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_My_Fly =Integer.parseInt(EG_CP_My_Fly1);
	    	            	}
		            break;
		            case "NESMA": 
		            	 if(element.equals("NESMA"))
			    	       {     
			    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

			    	System.out.println("No of NESMA Confirmation Pending:" + NESMA.size());
			    	
			    	 
			    	 String EG_CP_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
			    	 EG_CP_NESMA =Integer.parseInt(EG_CP_NESMA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_NESMA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_NESMA =Integer.parseInt(EG_CP_NESMA1);
	    	            	}
		            break;
		            case "PEGASUS": 
		            	 if(element.equals("PEGASUS"))
			    	       {     
			    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

			    	System.out.println("No of PEGASUS Confirmation Pending:" + PEGASUS.size());
			    	
			    	 
			    	 String EG_CP_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
			    	 EG_CP_PEGASUS =Integer.parseInt(EG_CP_PEGASUS1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_PEGASUS1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_PEGASUS =Integer.parseInt(EG_CP_PEGASUS1);
	    	            	}
		            break;
		            case "SABRE-9JFH": 
		            	 if(element.equals("SABRE-9JFH"))
			    	       {     
			    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

			    	System.out.println("No of SABRE-9JFH Confirmation Pending:" + S_9JFH.size());
			    	
			    	 
			    	 String EG_CP_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
			    	 EG_CP_S_9JFH =Integer.parseInt(EG_CP_S_9JFH1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_9JFH1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_9JFH =Integer.parseInt(EG_CP_S_9JFH1);
	    	            	}
		            break;
		            case "SABRE-ID2I": 
		            	 if(element.equals("SABRE-ID2I"))
			    	       {     
			    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

			    	System.out.println("No of SABRE-ID2I Confirmation Pending:" + S_ID2I.size());
			    	
			    	 
			    	 String EG_CP_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
			    	 EG_CP_S_ID2I =Integer.parseInt(EG_CP_S_ID2I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_ID2I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_ID2I =Integer.parseInt(EG_CP_S_ID2I1);
	    	            	}
		            break;
		            case "SABRE-L8YI": 
		            	 if(element.equals("SABRE-L8YI"))
			    	       {     
			    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

			    	System.out.println("No of SABRE-L8YI Confirmation Pending:" + S_L8YI.size());
			    	
			    	 
			    	 String EG_CP_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
			    	 EG_CP_S_L8YI =Integer.parseInt(EG_CP_S_L8YI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_L8YI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_L8YI =Integer.parseInt(EG_CP_S_L8YI1);
	    	            	}
		            break;
		            case "SABRE-L9AI": 
		            	 if(element.equals("SABRE-L9AI"))
			    	       {     
			    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

			    	System.out.println("No of SABRE-L9AI Confirmation Pending:" + S_L9AI.size());
			    	
			    	 
			    	 String EG_CP_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
			    	 EG_CP_S_L9AI =Integer.parseInt(EG_CP_S_L9AI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_L9AI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_L9AI =Integer.parseInt(EG_CP_S_L9AI1);
	    	            	}
		            break;
		            case "SABRE-L9CI": 
		            	 if(element.equals("SABRE-L9CI"))
			    	       {     
			    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

			    	System.out.println("No of SABRE-L9CI Confirmation Pending:" + S_L9CI.size());
			    	
			    	 
			    	 String EG_CP_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
			    	 EG_CP_S_L9CI =Integer.parseInt(EG_CP_S_L9CI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_L9CI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_L9CI =Integer.parseInt(EG_CP_S_L9CI1);
	    	            	}
		            break;
		            case "SABRE-T13I": 
		            	 if(element.equals("SABRE-T13I"))
			    	       {     
			    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

			    	System.out.println("No of SABRE-T13I Confirmation Pending:" + S_T13I.size());
			    	
			    	 
			    	 String EG_CP_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
			    	 EG_CP_S_T13I =Integer.parseInt(EG_CP_S_T13I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_T13I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_T13I =Integer.parseInt(EG_CP_S_T13I1);
	    	            	}
		            break;
		            case "SABRE-T20I": 
		            	 if(element.equals("SABRE-T20I"))
			    	       {     
			    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

			    	System.out.println("No of SABRE-T20I Confirmation Pending:" + S_T20I.size());
			    	
			    	 
			    	 String EG_CP_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
			    	 EG_CP_S_T20I =Integer.parseInt(EG_CP_S_T20I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_T20I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_T20I =Integer.parseInt(EG_CP_S_T20I1);
	    	            	}
		            break;
		            case "SALAM": 
		            	 if(element.equals("SALAM"))
			    	       {     
			    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

			    	System.out.println("No of SALAM Confirmation Pending:" + SALAM.size());
			    	
			    	 
			    	 String EG_CP_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
			    	 EG_CP_SALAM =Integer.parseInt(EG_CP_SALAM1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_SALAM1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_SALAM =Integer.parseInt(EG_CP_SALAM1);
	    	            	}
		            break;
		            case "SpiceJet": 
		            	 if(element.equals("SpiceJet"))
			    	       {     
			    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

			    	System.out.println("No of SpiceJet Confirmation Pending:" + S_Jet.size());
			    	
			    	 
			    	 String EG_CP_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
			    	 EG_CP_S_Jet =Integer.parseInt(EG_CP_S_Jet1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_S_Jet1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_Jet =Integer.parseInt(EG_CP_S_Jet1);
	    	            	}
		            break;
		            case "UAPI-3R1G": 
		            	 if(element.equals("UAPI-3R1G"))
			    	       {     
			    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

			    	System.out.println("No of UAPI-3R1G Confirmation Pending:" + U_3R1G.size());
			    	
			    	 
			    	 String EG_CP_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
			    	 EG_CP_U_3R1G =Integer.parseInt(EG_CP_U_3R1G1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_3R1G1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_3R1G =Integer.parseInt(EG_CP_U_3R1G1);
	    	            	}
		            break;
		            case "UAPI-570E": 
		            	 if(element.equals("UAPI-570E"))
			    	       {     
			    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

			    	System.out.println("No of UAPI-570E Confirmation Pending:" + U_570E.size());
			    	
			    	 
			    	 String EG_CP_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
			    	 EG_CP_U_570E =Integer.parseInt(EG_CP_U_570E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_570E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_570E =Integer.parseInt(EG_CP_U_570E1);
	    	            	}
		            break;
		            case "UAPI-5N61": 
		            	 if(element.equals("UAPI-5N61"))
			    	       {     
			    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

			    	System.out.println("No of UAPI-5N61 Confirmation Pending:" + U_5N61.size());
			    	
			    	 
			    	 String EG_CP_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
			    	 EG_CP_U_5N61 =Integer.parseInt(EG_CP_U_5N611);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_5N61 =Integer.parseInt(EG_CP_U_5N611);
	    	            	}
		            break;
		            case "UAPI-6E": 
		            	 if(element.equals("UAPI-6E"))
			    	       {     
			    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

			    	System.out.println("No of UAPI-6E Confirmation Pending:" + U_6E.size());
			    	
			    	 
			    	 String EG_CP_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
			    	 EG_CP_U_6E =Integer.parseInt(EG_CP_U_6E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_6E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_6E =Integer.parseInt(EG_CP_U_6E1);
	    	            	}
		            break;
		            case "UAPI-7FK5": 
		            	 if(element.equals("UAPI-7FK5"))
			    	       {     
			    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

			    	System.out.println("No of UAPI-7FK5 Confirmation Pending:" + U_7FK5.size());
			    	
			    	 
			    	 String EG_CP_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
			    	 EG_CP_U_7FK5 =Integer.parseInt(EG_CP_U_7FK51);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_7FK5 =Integer.parseInt(EG_CP_U_7FK51);
	    	            	}
		            break;
		            case "UAPI-7JY2": 
		            	 if(element.equals("UAPI-7JY2"))
			    	       {     
			    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

			    	System.out.println("No of UAPI-7JY2 Confirmation Pending:" + U_7JY2.size());
			    	
			    	 
			    	 String EG_CP_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
			    	 EG_CP_U_7JY2 =Integer.parseInt(EG_CP_U_7JY21);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_7JY2 =Integer.parseInt(EG_CP_U_7JY21);
	    	            	}
		            break;
		            case "UAPI-802N": 
		            	 if(element.equals("UAPI-802N"))
			    	       {     
			    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

			    	System.out.println("No of UAPI-802N Confirmation Pending:" + U_802N.size());
			    	
			    	 
			    	 String EG_CP_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
			    	 EG_CP_U_802N =Integer.parseInt(EG_CP_U_802N1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_802N1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_802N =Integer.parseInt(EG_CP_U_802N1);
	    	            	}
		            break;
		            case "UAPI-802R": 
		            	 if(element.equals("UAPI-802R"))
			    	       {     
			    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

			    	System.out.println("No of UAPI-802R Confirmation Pending:" + U_802R.size());
			    	
			    	 
			    	 String EG_CP_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
			    	 EG_CP_U_802R =Integer.parseInt(EG_CP_U_802R1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_802R1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_802R =Integer.parseInt(EG_CP_U_802R1);
	    	            	}
		            break;
		            case "UAPI-8SQ7": 
		            	 if(element.equals("UAPI-8SQ7"))
			    	       {     
			    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

			    	System.out.println("No of UAPI-8SQ7 Confirmation Pending:" + U_8SQ7.size());
			    	
			    	 
			    	 String EG_CP_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
			    	 EG_CP_U_8SQ7 =Integer.parseInt(EG_CP_U_8SQ71);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_U_8SQ71 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_U_8SQ7 =Integer.parseInt(EG_CP_U_8SQ71);
	    	            	}
		            break;
		            case "WATANIYA": 
		            	 if(element.equals("WATANIYA"))
			    	       {     
			    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

			    	System.out.println("No of WATANIYA Confirmation Pending:" + WATANIYA.size());
			    	
			    	 
			    	 String EG_CP_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
			    	 EG_CP_WATANIYA =Integer.parseInt(EG_CP_WATANIYA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_WATANIYA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_WATANIYA =Integer.parseInt(EG_CP_WATANIYA1);
	    	            	}
		            break;
		            case "Air Arabia": 
		            	 if(element.equals("Air Arabia"))
			    	       {     
			    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

			    	System.out.println("No of Air Arabia Confirmation Pending:" + A_AR.size());
			    	
			    	 
			    	 String EG_CP_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
			    	 EG_CP_A_AR =Integer.parseInt(EG_CP_A_AR1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_A_AR1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_A_AR =Integer.parseInt(EG_CP_A_AR1);
	    	            	}
		            break;
		            case "Air Arabia Egypt": 
		            	 if(element.equals("Air Arabia Egypt"))
			    	       {     
			    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

			    	System.out.println("No of Air Arabia Egypt Confirmation Pending:" + A_AR_E.size());
			    	
			    	 
			    	 String EG_CP_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
			    	 EG_CP_A_AR_E =Integer.parseInt(EG_CP_A_AR_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_A_AR_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_A_AR_E =Integer.parseInt(EG_CP_A_AR_E1);
	    	            	}
		            break;
		            case "Air Arabia Moroc": 
		            	 if(element.equals("Air Arabia Moroc"))
			    	       {     
			    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

			    	System.out.println("No of Air Arabia Moroc Confirmation Pending:" + A_AR_M.size());
			    	
			    	 
			    	 String EG_CP_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
			    	 EG_CP_A_AR_M =Integer.parseInt(EG_CP_A_AR_M1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_A_AR_M1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_A_AR_M =Integer.parseInt(EG_CP_A_AR_M1);
	    	            	}
		            break;
		            case "AirIndiaExpress": 
		            	 if(element.equals("AirIndiaExpress"))
			    	       {     
			    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

			    	System.out.println("No of AirIndiaExpress Confirmation Pending:" + A_I_E.size());
			    	
			    	 
			    	 String EG_CP_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
			    	 EG_CP_A_I_E =Integer.parseInt(EG_CP_A_I_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_A_I_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_A_I_E =Integer.parseInt(EG_CP_A_I_E1);
	    	            	}
		            break;
		            case "FlyDubai": 
		            	 if(element.equals("FlyDubai"))
			    	       {     
			    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

			    	System.out.println("No of FlyDubai Confirmation Pending:" + FlyDubai.size());
			    	
			    	 
			    	 String EG_CP_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
			    	 EG_CP_FlyDubai =Integer.parseInt(EG_CP_FlyDubai1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_FlyDubai1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_FlyDubai =Integer.parseInt(EG_CP_FlyDubai1);
	    	            	}
		            break;
		            case "Flynas": 
		            	 if(element.equals("Flynas"))
			    	       {     
			    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

			    	System.out.println("No of Flynas Confirmation Pending:" + Flynas.size());
			    	
			    	 
			    	 String EG_CP_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
			    	 EG_CP_Flynas =Integer.parseInt(EG_CP_Flynas1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_Flynas1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_Flynas =Integer.parseInt(EG_CP_Flynas1);
	    	            	}
		            	 
		            	 break;
		            case "FLYADEAL": 
		            	 if(element.equals("FLYADEAL"))
			    	       {     
			    	List<WebElement> Flyadeal=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FLYADEAL ']"));

			    	System.out.println("No of FLYADEAL Confirmation Pending:" + Flyadeal.size());
			    	
			    	 
			    	 String EG_CP_Flyadeal1 =String.format("%1s",Flyadeal.size());   		    	
		    		    
			    	 EG_CP_Flyadeal =Integer.parseInt(EG_CP_Flyadeal1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_Flyadeal1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_Flyadeal =Integer.parseInt(EG_CP_Flyadeal1);
	    	            	}
		            	 
		            break;
		            case "GAL-7Q0W": 
		            	 if(element.equals("GAL-7Q0W"))
			    	       {     
			    	List<WebElement> GAL_7Q=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' GAL-7Q0W ']"));

			    	System.out.println("No of GAL-7Q0W Confirmation Pending:" + GAL_7Q.size());
			    	
			    	 
			    	 String EG_CP_GAL701 =String.format("%1s",GAL_7Q.size());   		    	
		    		    
			    	 EG_CP_GAL7Q =Integer.parseInt(EG_CP_GAL701);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_GAL701 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_GAL7Q =Integer.parseInt(EG_CP_GAL701);
	    	            	}
		            break;
		            case "SABRE-1LNJ": 
		            	 if(element.equals("SABRE-1LNJ"))
			    	       {     
			    	List<WebElement> S_1LNJ=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-1LNJ ']"));

			    	System.out.println("No of SABRE-1LNJ Confirmation Pending:" + S_1LNJ.size());
			    	
			    	 
			    	 String EG_CP_1LNJ =String.format("%1s",S_1LNJ.size());   		    	
		    		    
			    	 EG_CP_S_1LNJ =Integer.parseInt(EG_CP_1LNJ );
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CP_1LNJ  =String.format("%1s",0);   		    	
				    		    
		            		 EG_CP_S_1LNJ =Integer.parseInt(EG_CP_1LNJ );
	    	            	}
		            break;
		            default:System.out.println("Not in 10, 20 or 30");  
		         
		            }
		           }
		        }
		  
	        
	        int TotalValue = EG_CP_G_3R1+EG_CP_G_570E+EG_CP_G_5N61+EG_CP_G_7FK5+EG_CP_G_7JY2+EG_CP_G_7X7W+EG_CP_G_802N+EG_CP_G_802R
	        		+EG_CP_G_8SQ7+EG_CP_JAZEERA+EG_CP_KIWI+EG_CP_M_u+EG_CP_My_Fly+EG_CP_NESMA+EG_CP_PEGASUS+EG_CP_S_9JFH+EG_CP_S_ID2I
	        		+EG_CP_S_L8YI+EG_CP_S_L9AI+EG_CP_S_L9CI+EG_CP_S_T13I+EG_CP_S_T20I+EG_CP_SALAM+EG_CP_S_Jet+EG_CP_U_3R1G+EG_CP_U_570E
	        		+EG_CP_U_5N61+EG_CP_U_6E+EG_CP_U_7FK5+EG_CP_U_7JY2+EG_CP_U_802N+EG_CP_U_802R+EG_CP_U_8SQ7+EG_CP_WATANIYA+EG_CP_A_AR
	        		+EG_CP_A_AR_E+EG_CP_A_AR_M+EG_CP_A_I_E+EG_CP_FlyDubai+EG_CP_Flynas+EG_CP_Flyadeal+EG_CP_GAL7Q+EG_CP_G_3K6+EG_CP_S_1LNJ;
			  
	        EG_CP_Supplier_ConfirmationPending_Total = TotalValue; 
			 System.out.println("Supplier Confirmation Pending total:::----"+EG_CP_Supplier_ConfirmationPending_Total);
			
			
	    
	   
			}
	}
	public static void SupplierEG_RP(WebDriver driver,String EG_Rep_count)
	{
		if("Flight Search Results : 0".equals(EG_Rep_count))
		{
			
			System.out.println("Supplier Repricing total:::----0");
			EG_RP_G_3K6=0;
			EG_RP_G_3R1=0;
			EG_RP_G_570E=0;
			EG_RP_G_5N61=0;
			EG_RP_G_7FK5=0;
			EG_RP_G_7JY2=0;
			EG_RP_G_7X7W=0;
			EG_RP_G_802N=0;
			EG_RP_G_802R=0;
			EG_RP_G_8SQ7=0;
			EG_RP_JAZEERA=0;
			EG_RP_KIWI=0;
			EG_RP_M_u=0;
			EG_RP_My_Fly=0;
			EG_RP_NESMA=0;
			EG_RP_PEGASUS=0;
			EG_RP_S_9JFH=0;
			EG_RP_S_ID2I=0;
			EG_RP_S_L8YI=0;
			EG_RP_S_L9AI=0;
			EG_RP_S_L9CI=0;
			EG_RP_S_T13I=0;
			EG_RP_S_T20I=0;
			EG_RP_SALAM=0;
			EG_RP_S_Jet=0;
			EG_RP_U_3R1G=0;
			EG_RP_U_570E=0;
			EG_RP_U_5N61=0;
			EG_RP_U_6E=0;
			EG_RP_U_7FK5=0;
			EG_RP_U_7JY2=0;
			EG_RP_U_802N=0;
			EG_RP_U_802R=0;
			EG_RP_U_8SQ7=0;
			EG_RP_WATANIYA=0;
			EG_RP_A_AR=0;
			EG_RP_A_AR_E=0;
			EG_RP_A_AR_M=0;
			EG_RP_A_I_E=0;
			EG_RP_FlyDubai=0;
			EG_RP_Flynas=0;
			EG_RP_Flyadeal=0;
			EG_RP_GAL7Q=0;
			EG_RP_S_1LNJ=0;     
			
			
	         int TotalValue =0;
	         EG_RP_Supplier_Repricing_Total = TotalValue; 
	 				 System.out.println("Supplier Repricing total:::----"+EG_RP_Supplier_Repricing_Total);
	 				
	 				
	 	        
	        
	      
		}
		else
		{
		
			List<WebElement> RP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
			 
			  System.out.println("Total Number of Supplier:" + RP.size());
			
			ArrayList<String>list=new ArrayList<>();
			
			 for (WebElement element1 : RP)
			  {
				 list.add(element1.getText());
				 Suppliers_RP_EG.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
			  EG_UniqueCount_RP=unique.size();
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            
		            case "Galileo-3K6": 
		            	if(element.equals("Galileo-3K6")) 
			    	       {
			    	        
			    	List<WebElement> G_3k6=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3K6 ']"));

			    	System.out.println("No of G_3K6 Repricing:" + G_3k6.size());
			    	String EG_RP_3K6 =String.format("%1s",G_3k6.size());
			    	
			    	
			    	 EG_RP_G_3K6 =Integer.parseInt(EG_RP_3K6);
			    	
			    	       }
		            	else
		            	{
		            		String EG_RP_3K6 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_RP_G_3K6 =Integer.parseInt(EG_RP_3K6);
		            	}
			    	      
		            break; 
		            case "Galileo-3R1G": 
		            	if(element.equals("Galileo-3R1G")) 
			    	       {
			    	        
			    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

			    	System.out.println("No of G_3R1 Repricing:" + G_3R1.size());
			    	String EG_RP_G_3R11 =String.format("%1s",G_3R1.size());
			    	
			    	
			    	 EG_RP_G_3R1 =Integer.parseInt(EG_RP_G_3R11);
			    	
			    	       }
		            	else
		            	{
		            		String EG_RP_G_3R11 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_RP_G_3R1 =Integer.parseInt(EG_RP_G_3R11);
		            	}
			    	      
		            break; 
		            
		            case "Galileo-570E": 
		            	   
			    	       if(element.equals("Galileo-570E"))
			    	       {
			    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

			    	  System.out.println("No of Galileo-570E Repricing:" + G_570E.size());
			    	  String EG_RP_G_570E1 =String.format("%1s",G_570E.size());
			    	  
	    		    	
	    		    	
			    	  EG_RP_G_570E =Integer.parseInt(EG_RP_G_570E1);
			    	       }
			    	       else
	    	            	{
			    	    	   String EG_RP_G_570E1 =String.format("%1s",0);
			    		    	  
			    		    	
			    		    	
			    	    	   EG_RP_G_570E =Integer.parseInt(EG_RP_G_570E1);
	    	            	}
			    	      
		            break;  
		            case "Galileo-5N61": 
		            	 if(element.equals("Galileo-5N61"))
			    	       {   
			    	       
			    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

			    	System.out.println("No of Galileo-5N61 Repricing:" + G_5N61.size());
			    	
			    	
			    	 String EG_RP_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
			    	 EG_RP_G_5N61 =Integer.parseInt(EG_RP_G_5N611);
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_G_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_G_5N61 =Integer.parseInt(EG_RP_G_5N611);
	    	            	}
		            break; 
		            case "Galileo-7FK5": 
		            	 if(element.equals("Galileo-7FK5"))
			    	       {   
			    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

			    	System.out.println("No of Galileo-7FK5 Repricing:" + G_7FK5.size());
			    	 
			    	 String EG_RP_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
			    	 EG_RP_G_7FK5 =Integer.parseInt(EG_RP_G_7FK51);
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_G_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_G_7FK5 =Integer.parseInt(EG_RP_G_7FK51);
	    	            	}
			    	      
		            break; 
		            case "Galileo-7JY2": 
		            	 if(element.equals("Galileo-7JY2"))
			    	       {        
			    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

			    	System.out.println("No of Galileo-7JY2 Repricing:" + G_7JY2.size());
			    	
			    	 String EG_RP_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
			    	 EG_RP_G_7JY2 =Integer.parseInt(EG_RP_G_7JY21);
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_G_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_G_7JY2 =Integer.parseInt(EG_RP_G_7JY21);
	    	            	}
			    	     
			    	       
		            break;  
		            case "Galileo-7X7W": 
		            	  if(element.equals("Galileo-7X7W"))
			    	       {   
			    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

			    	System.out.println("No of Galileo-7X7W Repricing:" + G_7X7W.size());
			    	
			    	
			    	String EG_RP_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
			    	EG_RP_G_7X7W =Integer.parseInt(EG_RP_G_7X7W1);
			    	       }
		            	  else
	    	            	{
		            			String EG_RP_G_7X7W1 =String.format("%1s",0);   		    	
				    		    
		            			EG_RP_G_7X7W =Integer.parseInt(EG_RP_G_7X7W1);
	    	            	}
		            break; 
		            case "Galileo-802N": 
		            	  if(element.equals("Galileo-802N"))
			    	       {        
			    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

			    	System.out.println("No of Galileo-802N Repricing:" + G_802N.size());
			    	
			    	
			    	String EG_RP_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
			    	EG_RP_G_802N =Integer.parseInt(EG_RP_G_802N1);
			    	
			    	       }
		            	  else
	    	            	{
		            		  String EG_RP_G_802N1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_RP_G_802N =Integer.parseInt(EG_RP_G_802N1);
	    	            	}
			    	      
			    	     
		            break;
		            case "Galileo-802R": 
		            	  if(element.equals("Galileo-802R"))
			    	       {   
			    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

			    	System.out.println("No of Galileo-802R Repricing:" + G_802R.size());
			    	
			    	String EG_RP_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
			    	EG_RP_G_802R =Integer.parseInt(EG_RP_G_802R1);
			    	       }
			    	       
		            	  else
	    	            	{
		            		  String EG_RP_G_802R1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_RP_G_802R =Integer.parseInt(EG_RP_G_802R1);
	    	            	}
			    	       
		            break; 
		            case "Galileo-8SQ7": 
		            	if(element.equals("Galileo-8SQ7"))
			    	       {  
			    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

			    	System.out.println("No of Galileo-8SQ7 Repricing:" + G_8SQ7.size());
			    	 
			    	 String EG_RP_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
			    	 EG_RP_G_8SQ7 =Integer.parseInt(EG_RP_G_8SQ71);
			    	       }
		            	else
		            	{
		            		String EG_RP_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
		            		EG_RP_G_8SQ7 =Integer.parseInt(EG_RP_G_8SQ71);
		            	}
			    	     
		            break;
		            case "JAZEERA": 
		            	
		            	  if(element.equals("JAZEERA"))
			    	       {  
			    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

			     	System.out.println("No of JAZEERA Repricing:" + JAZEERA.size());
			    	 
			    	 String EG_RP_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
			    	 EG_RP_JAZEERA =Integer.parseInt(EG_RP_JAZEERA1);
			    	       }
		            	  else
	    	            	{
		            		  
			    		    	 String EG_RP_JAZEERA1 =String.format("%1s",0);   		    	
					    		    
			    		    	 EG_RP_JAZEERA =Integer.parseInt(EG_RP_JAZEERA1);
	    	            	}
			    	      
		            break; 
		            case "KIWI": 
		            	 if(element.equals("KIWI"))
			    	       {     
			    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

			    	System.out.println("No of KIWI Repricing:" + KIWI.size());
			    	
			    	 
			    	 String EG_RP_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
			    	 EG_RP_KIWI =Integer.parseInt(EG_RP_KIWI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_KIWI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_KIWI =Integer.parseInt(EG_RP_KIWI1);
	    	            	}
		            break;
		            case "Manual": 
		            	 if(element.equals("Manual"))
			    	       {     
			    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

			    	System.out.println("No of Manual Repricing:" + M_u.size());
			    	
			    	 
			    	 String EG_RP_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
			    	 EG_RP_M_u =Integer.parseInt(EG_RP_M_u1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_M_u1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_M_u =Integer.parseInt(EG_RP_M_u1);
	    	            	}
		            break;
		            case "MystiFly": 
		            	 if(element.equals("MystiFly"))
			    	       {     
			    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

			    	System.out.println("No of MystiFly Repricing:" + My_Fly.size());
			    	
			    	 
			    	 String EG_RP_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
			    	 EG_RP_My_Fly =Integer.parseInt(EG_RP_My_Fly1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_My_Fly1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_My_Fly =Integer.parseInt(EG_RP_My_Fly1);
	    	            	}
		            break;
		            case "NESMA": 
		            	 if(element.equals("NESMA"))
			    	       {     
			    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

			    	System.out.println("No of NESMA Repricing:" + NESMA.size());
			    	
			    	 
			    	 String EG_RP_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
			    	 EG_RP_NESMA =Integer.parseInt(EG_RP_NESMA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_NESMA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_NESMA =Integer.parseInt(EG_RP_NESMA1);
	    	            	}
		            break;
		            case "PEGASUS": 
		            	 if(element.equals("PEGASUS"))
			    	       {     
			    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

			    	System.out.println("No of PEGASUS Repricing:" + PEGASUS.size());
			    	
			    	 
			    	 String EG_RP_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
			    	 EG_RP_PEGASUS =Integer.parseInt(EG_RP_PEGASUS1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_PEGASUS1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_PEGASUS =Integer.parseInt(EG_RP_PEGASUS1);
	    	            	}
		            break;
		            case "SABRE-9JFH": 
		            	 if(element.equals("SABRE-9JFH"))
			    	       {     
			    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

			    	System.out.println("No of SABRE-9JFH Repricing:" + S_9JFH.size());
			    	
			    	 
			    	 String EG_RP_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
			    	 EG_RP_S_9JFH =Integer.parseInt(EG_RP_S_9JFH1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_9JFH1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_9JFH =Integer.parseInt(EG_RP_S_9JFH1);
	    	            	}
		            break;
		            case "SABRE-ID2I": 
		            	 if(element.equals("SABRE-ID2I"))
			    	       {     
			    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

			    	System.out.println("No of SABRE-ID2I Repricing:" + S_ID2I.size());
			    	
			    	 
			    	 String EG_RP_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
			    	 EG_RP_S_ID2I =Integer.parseInt(EG_RP_S_ID2I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_ID2I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_ID2I =Integer.parseInt(EG_RP_S_ID2I1);
	    	            	}
		            break;
		            case "SABRE-L8YI": 
		            	 if(element.equals("SABRE-L8YI"))
			    	       {     
			    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

			    	System.out.println("No of SABRE-L8YI Repricing:" + S_L8YI.size());
			    	
			    	 
			    	 String EG_RP_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
			    	 EG_RP_S_L8YI =Integer.parseInt(EG_RP_S_L8YI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_L8YI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_L8YI =Integer.parseInt(EG_RP_S_L8YI1);
	    	            	}
		            break;
		            case "SABRE-L9AI": 
		            	 if(element.equals("SABRE-L9AI"))
			    	       {     
			    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

			    	System.out.println("No of SABRE-L9AI Repricing:" + S_L9AI.size());
			    	
			    	 
			    	 String EG_RP_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
			    	 EG_RP_S_L9AI =Integer.parseInt(EG_RP_S_L9AI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_L9AI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_L9AI =Integer.parseInt(EG_RP_S_L9AI1);
	    	            	}
		            break;
		            case "SABRE-L9CI": 
		            	 if(element.equals("SABRE-L9CI"))
			    	       {     
			    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

			    	System.out.println("No of SABRE-L9CI Repricing:" + S_L9CI.size());
			    	
			    	 
			    	 String EG_RP_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
			    	 EG_RP_S_L9CI =Integer.parseInt(EG_RP_S_L9CI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_L9CI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_L9CI =Integer.parseInt(EG_RP_S_L9CI1);
	    	            	}
		            break;
		            case "SABRE-T13I": 
		            	 if(element.equals("SABRE-T13I"))
			    	       {     
			    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

			    	System.out.println("No of SABRE-T13I Repricing:" + S_T13I.size());
			    	
			    	 
			    	 String EG_RP_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
			    	 EG_RP_S_T13I =Integer.parseInt(EG_RP_S_T13I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_T13I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_T13I =Integer.parseInt(EG_RP_S_T13I1);
	    	            	}
		            break;
		            case "SABRE-T20I": 
		            	 if(element.equals("SABRE-T20I"))
			    	       {     
			    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

			    	System.out.println("No of SABRE-T20I Repricing:" + S_T20I.size());
			    	
			    	 
			    	 String EG_RP_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
			    	 EG_RP_S_T20I =Integer.parseInt(EG_RP_S_T20I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_T20I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_T20I =Integer.parseInt(EG_RP_S_T20I1);
	    	            	}
		            break;
		            case "SALAM": 
		            	 if(element.equals("SALAM"))
			    	       {     
			    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

			    	System.out.println("No of SALAM Repricing:" + SALAM.size());
			    	
			    	 
			    	 String EG_RP_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
			    	 EG_RP_SALAM =Integer.parseInt(EG_RP_SALAM1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_SALAM1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_SALAM =Integer.parseInt(EG_RP_SALAM1);
	    	            	}
		            break;
		            case "SpiceJet": 
		            	 if(element.equals("SpiceJet"))
			    	       {     
			    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

			    	System.out.println("No of SpiceJet Repricing:" + S_Jet.size());
			    	
			    	 
			    	 String EG_RP_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
			    	 EG_RP_S_Jet =Integer.parseInt(EG_RP_S_Jet1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_S_Jet1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_Jet =Integer.parseInt(EG_RP_S_Jet1);
	    	            	}
		            break;
		            case "UAPI-3R1G": 
		            	 if(element.equals("UAPI-3R1G"))
			    	       {     
			    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

			    	System.out.println("No of UAPI-3R1G Repricing:" + U_3R1G.size());
			    	
			    	 
			    	 String EG_RP_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
			    	 EG_RP_U_3R1G =Integer.parseInt(EG_RP_U_3R1G1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_3R1G1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_3R1G =Integer.parseInt(EG_RP_U_3R1G1);
	    	            	}
		            break;
		            case "UAPI-570E": 
		            	 if(element.equals("UAPI-570E"))
			    	       {     
			    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

			    	System.out.println("No of UAPI-570E Repricing:" + U_570E.size());
			    	
			    	 
			    	 String EG_RP_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
			    	 EG_RP_U_570E =Integer.parseInt(EG_RP_U_570E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_570E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_570E =Integer.parseInt(EG_RP_U_570E1);
	    	            	}
		            break;
		            case "UAPI-5N61": 
		            	 if(element.equals("UAPI-5N61"))
			    	       {     
			    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

			    	System.out.println("No of UAPI-5N61 Repricing:" + U_5N61.size());
			    	
			    	 
			    	 String EG_RP_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
			    	 EG_RP_U_5N61 =Integer.parseInt(EG_RP_U_5N611);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_5N61 =Integer.parseInt(EG_RP_U_5N611);
	    	            	}
		            break;
		            case "UAPI-6E": 
		            	 if(element.equals("UAPI-6E"))
			    	       {     
			    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

			    	System.out.println("No of UAPI-6E Repricing:" + U_6E.size());
			    	
			    	 
			    	 String EG_RP_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
			    	 EG_RP_U_6E =Integer.parseInt(EG_RP_U_6E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_6E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_6E =Integer.parseInt(EG_RP_U_6E1);
	    	            	}
		            break;
		            case "UAPI-7FK5": 
		            	 if(element.equals("UAPI-7FK5"))
			    	       {     
			    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

			    	System.out.println("No of UAPI-7FK5 Repricing:" + U_7FK5.size());
			    	
			    	 
			    	 String EG_RP_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
			    	 EG_RP_U_7FK5 =Integer.parseInt(EG_RP_U_7FK51);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_7FK5 =Integer.parseInt(EG_RP_U_7FK51);
	    	            	}
		            break;
		            case "UAPI-7JY2": 
		            	 if(element.equals("UAPI-7JY2"))
			    	       {     
			    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

			    	System.out.println("No of UAPI-7JY2 Repricing:" + U_7JY2.size());
			    	
			    	 
			    	 String EG_RP_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
			    	 EG_RP_U_7JY2 =Integer.parseInt(EG_RP_U_7JY21);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_7JY2 =Integer.parseInt(EG_RP_U_7JY21);
	    	            	}
		            break;
		            case "UAPI-802N": 
		            	 if(element.equals("UAPI-802N"))
			    	       {     
			    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

			    	System.out.println("No of UAPI-802N Repricing:" + U_802N.size());
			    	
			    	 
			    	 String EG_RP_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
			    	 EG_RP_U_802N =Integer.parseInt(EG_RP_U_802N1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_802N1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_802N =Integer.parseInt(EG_RP_U_802N1);
	    	            	}
		            break;
		            case "UAPI-802R": 
		            	 if(element.equals("UAPI-802R"))
			    	       {     
			    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

			    	System.out.println("No of UAPI-802R Repricing:" + U_802R.size());
			    	
			    	 
			    	 String EG_RP_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
			    	 EG_RP_U_802R =Integer.parseInt(EG_RP_U_802R1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_802R1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_802R =Integer.parseInt(EG_RP_U_802R1);
	    	            	}
		            break;
		            case "UAPI-8SQ7": 
		            	 if(element.equals("UAPI-8SQ7"))
			    	       {     
			    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

			    	System.out.println("No of UAPI-8SQ7 Repricing:" + U_8SQ7.size());
			    	
			    	 
			    	 String EG_RP_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
			    	 EG_RP_U_8SQ7 =Integer.parseInt(EG_RP_U_8SQ71);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_U_8SQ71 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_U_8SQ7 =Integer.parseInt(EG_RP_U_8SQ71);
	    	            	}
		            break;
		            case "WATANIYA": 
		            	 if(element.equals("WATANIYA"))
			    	       {     
			    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

			    	System.out.println("No of WATANIYA Repricing:" + WATANIYA.size());
			    	
			    	 
			    	 String EG_RP_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
			    	 EG_RP_WATANIYA =Integer.parseInt(EG_RP_WATANIYA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_WATANIYA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_WATANIYA =Integer.parseInt(EG_RP_WATANIYA1);
	    	            	}
		            break;
		            case "Air Arabia": 
		            	 if(element.equals("Air Arabia"))
			    	       {     
			    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

			    	System.out.println("No of Air Arabia Repricing:" + A_AR.size());
			    	
			    	 
			    	 String EG_RP_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
			    	 EG_RP_A_AR =Integer.parseInt(EG_RP_A_AR1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_A_AR1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_A_AR =Integer.parseInt(EG_RP_A_AR1);
	    	            	}
		            break;
		            case "Air Arabia Egypt": 
		            	 if(element.equals("Air Arabia Egypt"))
			    	       {     
			    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

			    	System.out.println("No of Air Arabia Egypt Repricing:" + A_AR_E.size());
			    	
			    	 
			    	 String EG_RP_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
			    	 EG_RP_A_AR_E =Integer.parseInt(EG_RP_A_AR_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_A_AR_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_A_AR_E =Integer.parseInt(EG_RP_A_AR_E1);
	    	            	}
		            break;
		            case "Air Arabia Moroc": 
		            	 if(element.equals("Air Arabia Moroc"))
			    	       {     
			    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

			    	System.out.println("No of Air Arabia Moroc Repricing:" + A_AR_M.size());
			    	
			    	 
			    	 String EG_RP_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
			    	 EG_RP_A_AR_M =Integer.parseInt(EG_RP_A_AR_M1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_A_AR_M1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_A_AR_M =Integer.parseInt(EG_RP_A_AR_M1);
	    	            	}
		            break;
		            case "AirIndiaExpress": 
		            	 if(element.equals("AirIndiaExpress"))
			    	       {     
			    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

			    	System.out.println("No of AirIndiaExpress Repricing:" + A_I_E.size());
			    	
			    	 
			    	 String EG_RP_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
			    	 EG_RP_A_I_E =Integer.parseInt(EG_RP_A_I_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_A_I_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_A_I_E =Integer.parseInt(EG_RP_A_I_E1);
	    	            	}
		            break;
		            case "FlyDubai": 
		            	 if(element.equals("FlyDubai"))
			    	       {     
			    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

			    	System.out.println("No of FlyDubai Repricing:" + FlyDubai.size());
			    	
			    	 
			    	 String EG_RP_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
			    	 EG_RP_FlyDubai =Integer.parseInt(EG_RP_FlyDubai1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_FlyDubai1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_FlyDubai =Integer.parseInt(EG_RP_FlyDubai1);
	    	            	}
		            break;
		            case "Flynas": 
		            	 if(element.equals("Flynas"))
			    	       {     
			    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

			    	System.out.println("No of Flynas Repricing:" + Flynas.size());
			    	
			    	 
			    	 String EG_RP_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
			    	 EG_RP_Flynas =Integer.parseInt(EG_RP_Flynas1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_Flynas1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_Flynas =Integer.parseInt(EG_RP_Flynas1);
	    	            	}
		            	 
		            	 break;
		            case "FLYADEAL": 
		            	 if(element.equals("FLYADEAL"))
			    	       {     
			    	List<WebElement> Flyadeal=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FLYADEAL ']"));

			    	System.out.println("No of FLYADEAL Repricing:" + Flyadeal.size());
			    	
			    	 
			    	 String EG_RP_Flyadeal1 =String.format("%1s",Flyadeal.size());   		    	
		    		    
			    	 EG_RP_Flyadeal =Integer.parseInt(EG_RP_Flyadeal1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_Flyadeal1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_Flyadeal =Integer.parseInt(EG_RP_Flyadeal1);
	    	            	}
		            	 
		            break;
		            case "GAL-7Q0W": 
		            	 if(element.equals("GAL-7Q0W"))
			    	       {     
			    	List<WebElement> GAL_7Q=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' GAL-7Q0W ']"));

			    	System.out.println("No of GAL-7Q0W Repricing:" + GAL_7Q.size());
			    	
			    	 
			    	 String EG_RP_GAL701 =String.format("%1s",GAL_7Q.size());   		    	
		    		    
			    	 EG_RP_GAL7Q =Integer.parseInt(EG_RP_GAL701);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_GAL701 =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_GAL7Q =Integer.parseInt(EG_RP_GAL701);
	    	            	}
		            break;
		            
		            case "SABRE-1LNJ": 
		            	 if(element.equals("SABRE-1LNJ"))
			    	       {     
			    	List<WebElement> S_1LNJ=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-1LNJ ']"));

			    	System.out.println("No of SABRE-1LNJ Repricing:" + S_1LNJ.size());
			    	
			    	 
			    	 String EG_RP_1LNJ =String.format("%1s",S_1LNJ.size());   		    	
		    		    
			    	 EG_RP_S_1LNJ =Integer.parseInt(EG_RP_1LNJ );
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_RP_1LNJ  =String.format("%1s",0);   		    	
				    		    
		            		 EG_RP_S_1LNJ =Integer.parseInt(EG_RP_1LNJ );
	    	            	}
		            break;
		            default:System.out.println("Not in 10, 20 or 30");  
		         
		            }
		           }
		        }
		  
	        
	        int TotalValue = EG_RP_G_3R1+EG_RP_G_570E+EG_RP_G_5N61+EG_RP_G_7FK5+EG_RP_G_7JY2+EG_RP_G_7X7W+EG_RP_G_802N+EG_RP_G_802R
	        		+EG_RP_G_8SQ7+EG_RP_JAZEERA+EG_RP_KIWI+EG_RP_M_u+EG_RP_My_Fly+EG_RP_NESMA+EG_RP_PEGASUS+EG_RP_S_9JFH+EG_RP_S_ID2I
	        		+EG_RP_S_L8YI+EG_RP_S_L9AI+EG_RP_S_L9CI+EG_RP_S_T13I+EG_RP_S_T20I+EG_RP_SALAM+EG_RP_S_Jet+EG_RP_U_3R1G+EG_RP_U_570E
	        		+EG_RP_U_5N61+EG_RP_U_6E+EG_RP_U_7FK5+EG_RP_U_7JY2+EG_RP_U_802N+EG_RP_U_802R+EG_RP_U_8SQ7+EG_RP_WATANIYA+EG_RP_A_AR
	        		+EG_RP_A_AR_E+EG_RP_A_AR_M+EG_RP_A_I_E+EG_RP_FlyDubai+EG_RP_Flynas+EG_RP_Flyadeal+EG_RP_GAL7Q+EG_RP_G_3K6+EG_RP_S_1LNJ;
			  
	        EG_RP_Supplier_Repricing_Total = TotalValue; 
			 System.out.println("Supplier Repricing total:::----"+EG_RP_Supplier_Repricing_Total);
			
			
	    
	   
			}
	}
	public static void SupplierEG_SD(WebDriver driver,String EG_Sold_count)
	{
		if("Flight Search Results : 0".equals(EG_Sold_count))
		{
			
			System.out.println("Supplier SOLD OUT total:::----0");
			EG_SD_G_3K6=0;
			EG_SD_G_3R1=0;
			EG_SD_G_570E=0;
			EG_SD_G_5N61=0;
			EG_SD_G_7FK5=0;
			EG_SD_G_7JY2=0;
			EG_SD_G_7X7W=0;
			EG_SD_G_802N=0;
			EG_SD_G_802R=0;
			EG_SD_G_8SQ7=0;
			EG_SD_JAZEERA=0;
			EG_SD_KIWI=0;
			EG_SD_M_u=0;
			EG_SD_My_Fly=0;
			EG_SD_NESMA=0;
			EG_SD_PEGASUS=0;
			EG_SD_S_9JFH=0;
			EG_SD_S_ID2I=0;
			EG_SD_S_L8YI=0;
			EG_SD_S_L9AI=0;
			EG_SD_S_L9CI=0;
			EG_SD_S_T13I=0;
			EG_SD_S_T20I=0;
			EG_SD_SALAM=0;
			EG_SD_S_Jet=0;
			EG_SD_U_3R1G=0;
			EG_SD_U_570E=0;
			EG_SD_U_5N61=0;
			EG_SD_U_6E=0;
			EG_SD_U_7FK5=0;
			EG_SD_U_7JY2=0;
			EG_SD_U_802N=0;
			EG_SD_U_802R=0;
			EG_SD_U_8SQ7=0;
			EG_SD_WATANIYA=0;
			EG_SD_A_AR=0;
			EG_SD_A_AR_E=0;
			EG_SD_A_AR_M=0;
			EG_SD_A_I_E=0;
			EG_SD_FlyDubai=0;
			EG_SD_Flynas=0;
			EG_SD_Flyadeal=0;
			EG_SD_GAL7Q=0;
			EG_SD_S_1LNJ=0;   
			
			
	         int TotalValue =0;
	         EG_SD_Supplier_Soldout_Total = TotalValue; 
	 				 System.out.println("Supplier SOLD OUT total:::----"+EG_SD_Supplier_Soldout_Total);
	 				
	 				
	 	        
	        
	      
		}
		else
		{
		
			List<WebElement> SD=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
			 
			  System.out.println("Total Number of Supplier:" + SD.size());
			
			ArrayList<String>list=new ArrayList<>();
			
			 for (WebElement element1 : SD)
			  {
				 list.add(element1.getText());
				 Suppliers_SD_EG.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
			  EG_UniqueCount_SD=unique.size();
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            case "Galileo-3K6": 
		            	if(element.equals("Galileo-3K6")) 
			    	       {
			    	        
			    	List<WebElement> G_3k6=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3K6 ']"));

			    	System.out.println("No of G_3K6 SOLD OUT:" + G_3k6.size());
			    	String EG_SD_3K6 =String.format("%1s",G_3k6.size());
			    	
			    	
			    	 EG_SD_G_3K6 =Integer.parseInt(EG_SD_3K6);
			    	
			    	       }
		            	else
		            	{
		            		String EG_SD_3K6 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_SD_G_3K6 =Integer.parseInt(EG_SD_3K6);
		            	}
			    	      
		            break; 
		            case "Galileo-3R1G": 
		            	if(element.equals("Galileo-3R1G")) 
			    	       {
			    	        
			    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

			    	System.out.println("No of G_3R1 SOLD OUT:" + G_3R1.size());
			    	String EG_SD_G_3R11 =String.format("%1s",G_3R1.size());
			    	
			    	
			    	 EG_SD_G_3R1 =Integer.parseInt(EG_SD_G_3R11);
			    	
			    	       }
		            	else
		            	{
		            		String EG_SD_G_3R11 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_SD_G_3R1 =Integer.parseInt(EG_SD_G_3R11);
		            	}
			    	      
		            break; 
		            
		            case "Galileo-570E": 
		            	   
			    	       if(element.equals("Galileo-570E"))
			    	       {
			    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

			    	  System.out.println("No of Galileo-570E SOLD OUT:" + G_570E.size());
			    	  String EG_SD_G_570E1 =String.format("%1s",G_570E.size());
			    	  
	    		    	
	    		    	
			    	  EG_SD_G_570E =Integer.parseInt(EG_SD_G_570E1);
			    	       }
			    	       else
	    	            	{
			    	    	   String EG_SD_G_570E1 =String.format("%1s",0);
			    		    	  
			    		    	
			    		    	
			    	    	   EG_SD_G_570E =Integer.parseInt(EG_SD_G_570E1);
	    	            	}
			    	      
		            break;  
		            case "Galileo-5N61": 
		            	 if(element.equals("Galileo-5N61"))
			    	       {   
			    	       
			    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

			    	System.out.println("No of Galileo-5N61 SOLD OUT:" + G_5N61.size());
			    	
			    	
			    	 String EG_SD_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
			    	 EG_SD_G_5N61 =Integer.parseInt(EG_SD_G_5N611);
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_G_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_G_5N61 =Integer.parseInt(EG_SD_G_5N611);
	    	            	}
		            break; 
		            case "Galileo-7FK5": 
		            	 if(element.equals("Galileo-7FK5"))
			    	       {   
			    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

			    	System.out.println("No of Galileo-7FK5 SOLD OUT:" + G_7FK5.size());
			    	 
			    	 String EG_SD_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
			    	 EG_SD_G_7FK5 =Integer.parseInt(EG_SD_G_7FK51);
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_G_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_G_7FK5 =Integer.parseInt(EG_SD_G_7FK51);
	    	            	}
			    	      
		            break; 
		            case "Galileo-7JY2": 
		            	 if(element.equals("Galileo-7JY2"))
			    	       {        
			    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

			    	System.out.println("No of Galileo-7JY2 SOLD OUT:" + G_7JY2.size());
			    	
			    	 String EG_SD_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
			    	 EG_SD_G_7JY2 =Integer.parseInt(EG_SD_G_7JY21);
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_G_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_G_7JY2 =Integer.parseInt(EG_SD_G_7JY21);
	    	            	}
			    	     
			    	       
		            break;  
		            case "Galileo-7X7W": 
		            	  if(element.equals("Galileo-7X7W"))
			    	       {   
			    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

			    	System.out.println("No of Galileo-7X7W SOLD OUT:" + G_7X7W.size());
			    	
			    	
			    	String EG_SD_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
			    	EG_SD_G_7X7W =Integer.parseInt(EG_SD_G_7X7W1);
			    	       }
		            	  else
	    	            	{
		            			String EG_SD_G_7X7W1 =String.format("%1s",0);   		    	
				    		    
		            			EG_SD_G_7X7W =Integer.parseInt(EG_SD_G_7X7W1);
	    	            	}
		            break; 
		            case "Galileo-802N": 
		            	  if(element.equals("Galileo-802N"))
			    	       {        
			    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

			    	System.out.println("No of Galileo-802N SOLD OUT:" + G_802N.size());
			    	
			    	
			    	String EG_SD_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
			    	EG_SD_G_802N =Integer.parseInt(EG_SD_G_802N1);
			    	
			    	       }
		            	  else
	    	            	{
		            		  String EG_SD_G_802N1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_SD_G_802N =Integer.parseInt(EG_SD_G_802N1);
	    	            	}
			    	      
			    	     
		            break;
		            case "Galileo-802R": 
		            	  if(element.equals("Galileo-802R"))
			    	       {   
			    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

			    	System.out.println("No of Galileo-802R SOLD OUT:" + G_802R.size());
			    	
			    	String EG_SD_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
			    	EG_SD_G_802R =Integer.parseInt(EG_SD_G_802R1);
			    	       }
			    	       
		            	  else
	    	            	{
		            		  String EG_SD_G_802R1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_SD_G_802R =Integer.parseInt(EG_SD_G_802R1);
	    	            	}
			    	       
		            break; 
		            case "Galileo-8SQ7": 
		            	if(element.equals("Galileo-8SQ7"))
			    	       {  
			    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

			    	System.out.println("No of Galileo-8SQ7 SOLD OUT:" + G_8SQ7.size());
			    	 
			    	 String EG_SD_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
			    	 EG_SD_G_8SQ7 =Integer.parseInt(EG_SD_G_8SQ71);
			    	       }
		            	else
		            	{
		            		String EG_SD_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
		            		EG_SD_G_8SQ7 =Integer.parseInt(EG_SD_G_8SQ71);
		            	}
			    	     
		            break;
		            case "JAZEERA": 
		            	
		            	  if(element.equals("JAZEERA"))
			    	       {  
			    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

			     	System.out.println("No of JAZEERA SOLD OUT:" + JAZEERA.size());
			    	 
			    	 String EG_SD_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
			    	 EG_SD_JAZEERA =Integer.parseInt(EG_SD_JAZEERA1);
			    	       }
		            	  else
	    	            	{
		            		  
			    		    	 String EG_SD_JAZEERA1 =String.format("%1s",0);   		    	
					    		    
			    		    	 EG_SD_JAZEERA =Integer.parseInt(EG_SD_JAZEERA1);
	    	            	}
			    	      
		            break; 
		            case "KIWI": 
		            	 if(element.equals("KIWI"))
			    	       {     
			    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

			    	System.out.println("No of KIWI SOLD OUT:" + KIWI.size());
			    	
			    	 
			    	 String EG_SD_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
			    	 EG_SD_KIWI =Integer.parseInt(EG_SD_KIWI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_KIWI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_KIWI =Integer.parseInt(EG_SD_KIWI1);
	    	            	}
		            break;
		            case "Manual": 
		            	 if(element.equals("Manual"))
			    	       {     
			    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

			    	System.out.println("No of Manual SOLD OUT:" + M_u.size());
			    	
			    	 
			    	 String EG_SD_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
			    	 EG_SD_M_u =Integer.parseInt(EG_SD_M_u1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_M_u1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_M_u =Integer.parseInt(EG_SD_M_u1);
	    	            	}
		            break;
		            case "MystiFly": 
		            	 if(element.equals("MystiFly"))
			    	       {     
			    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

			    	System.out.println("No of MystiFly SOLD OUT:" + My_Fly.size());
			    	
			    	 
			    	 String EG_SD_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
			    	 EG_SD_My_Fly =Integer.parseInt(EG_SD_My_Fly1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_My_Fly1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_My_Fly =Integer.parseInt(EG_SD_My_Fly1);
	    	            	}
		            break;
		            case "NESMA": 
		            	 if(element.equals("NESMA"))
			    	       {     
			    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

			    	System.out.println("No of NESMA SOLD OUT:" + NESMA.size());
			    	
			    	 
			    	 String EG_SD_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
			    	 EG_SD_NESMA =Integer.parseInt(EG_SD_NESMA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_NESMA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_NESMA =Integer.parseInt(EG_SD_NESMA1);
	    	            	}
		            break;
		            case "PEGASUS": 
		            	 if(element.equals("PEGASUS"))
			    	       {     
			    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

			    	System.out.println("No of PEGASUS SOLD OUT:" + PEGASUS.size());
			    	
			    	 
			    	 String EG_SD_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
			    	 EG_SD_PEGASUS =Integer.parseInt(EG_SD_PEGASUS1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_PEGASUS1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_PEGASUS =Integer.parseInt(EG_SD_PEGASUS1);
	    	            	}
		            break;
		            case "SABRE-9JFH": 
		            	 if(element.equals("SABRE-9JFH"))
			    	       {     
			    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

			    	System.out.println("No of SABRE-9JFH SOLD OUT:" + S_9JFH.size());
			    	
			    	 
			    	 String EG_SD_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
			    	 EG_SD_S_9JFH =Integer.parseInt(EG_SD_S_9JFH1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_9JFH1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_9JFH =Integer.parseInt(EG_SD_S_9JFH1);
	    	            	}
		            break;
		            case "SABRE-ID2I": 
		            	 if(element.equals("SABRE-ID2I"))
			    	       {     
			    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

			    	System.out.println("No of SABRE-ID2I SOLD OUT:" + S_ID2I.size());
			    	
			    	 
			    	 String EG_SD_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
			    	 EG_SD_S_ID2I =Integer.parseInt(EG_SD_S_ID2I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_ID2I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_ID2I =Integer.parseInt(EG_SD_S_ID2I1);
	    	            	}
		            break;
		            case "SABRE-L8YI": 
		            	 if(element.equals("SABRE-L8YI"))
			    	       {     
			    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

			    	System.out.println("No of SABRE-L8YI SOLD OUT:" + S_L8YI.size());
			    	
			    	 
			    	 String EG_SD_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
			    	 EG_SD_S_L8YI =Integer.parseInt(EG_SD_S_L8YI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_L8YI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_L8YI =Integer.parseInt(EG_SD_S_L8YI1);
	    	            	}
		            break;
		            case "SABRE-L9AI": 
		            	 if(element.equals("SABRE-L9AI"))
			    	       {     
			    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

			    	System.out.println("No of SABRE-L9AI SOLD OUT:" + S_L9AI.size());
			    	
			    	 
			    	 String EG_SD_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
			    	 EG_SD_S_L9AI =Integer.parseInt(EG_SD_S_L9AI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_L9AI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_L9AI =Integer.parseInt(EG_SD_S_L9AI1);
	    	            	}
		            break;
		            case "SABRE-L9CI": 
		            	 if(element.equals("SABRE-L9CI"))
			    	       {     
			    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

			    	System.out.println("No of SABRE-L9CI SOLD OUT:" + S_L9CI.size());
			    	
			    	 
			    	 String EG_SD_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
			    	 EG_SD_S_L9CI =Integer.parseInt(EG_SD_S_L9CI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_L9CI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_L9CI =Integer.parseInt(EG_SD_S_L9CI1);
	    	            	}
		            break;
		            case "SABRE-T13I": 
		            	 if(element.equals("SABRE-T13I"))
			    	       {     
			    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

			    	System.out.println("No of SABRE-T13I SOLD OUT:" + S_T13I.size());
			    	
			    	 
			    	 String EG_SD_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
			    	 EG_SD_S_T13I =Integer.parseInt(EG_SD_S_T13I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_T13I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_T13I =Integer.parseInt(EG_SD_S_T13I1);
	    	            	}
		            break;
		            case "SABRE-T20I": 
		            	 if(element.equals("SABRE-T20I"))
			    	       {     
			    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

			    	System.out.println("No of SABRE-T20I SOLD OUT:" + S_T20I.size());
			    	
			    	 
			    	 String EG_SD_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
			    	 EG_SD_S_T20I =Integer.parseInt(EG_SD_S_T20I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_T20I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_T20I =Integer.parseInt(EG_SD_S_T20I1);
	    	            	}
		            break;
		            case "SALAM": 
		            	 if(element.equals("SALAM"))
			    	       {     
			    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

			    	System.out.println("No of SALAM SOLD OUT:" + SALAM.size());
			    	
			    	 
			    	 String EG_SD_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
			    	 EG_SD_SALAM =Integer.parseInt(EG_SD_SALAM1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_SALAM1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_SALAM =Integer.parseInt(EG_SD_SALAM1);
	    	            	}
		            break;
		            case "SpiceJet": 
		            	 if(element.equals("SpiceJet"))
			    	       {     
			    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

			    	System.out.println("No of SpiceJet SOLD OUT:" + S_Jet.size());
			    	
			    	 
			    	 String EG_SD_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
			    	 EG_SD_S_Jet =Integer.parseInt(EG_SD_S_Jet1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_S_Jet1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_Jet =Integer.parseInt(EG_SD_S_Jet1);
	    	            	}
		            break;
		            case "UAPI-3R1G": 
		            	 if(element.equals("UAPI-3R1G"))
			    	       {     
			    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

			    	System.out.println("No of UAPI-3R1G SOLD OUT:" + U_3R1G.size());
			    	
			    	 
			    	 String EG_SD_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
			    	 EG_SD_U_3R1G =Integer.parseInt(EG_SD_U_3R1G1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_3R1G1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_3R1G =Integer.parseInt(EG_SD_U_3R1G1);
	    	            	}
		            break;
		            case "UAPI-570E": 
		            	 if(element.equals("UAPI-570E"))
			    	       {     
			    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

			    	System.out.println("No of UAPI-570E SOLD OUT:" + U_570E.size());
			    	
			    	 
			    	 String EG_SD_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
			    	 EG_SD_U_570E =Integer.parseInt(EG_SD_U_570E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_570E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_570E =Integer.parseInt(EG_SD_U_570E1);
	    	            	}
		            break;
		            case "UAPI-5N61": 
		            	 if(element.equals("UAPI-5N61"))
			    	       {     
			    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

			    	System.out.println("No of UAPI-5N61 SOLD OUT:" + U_5N61.size());
			    	
			    	 
			    	 String EG_SD_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
			    	 EG_SD_U_5N61 =Integer.parseInt(EG_SD_U_5N611);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_5N61 =Integer.parseInt(EG_SD_U_5N611);
	    	            	}
		            break;
		            case "UAPI-6E": 
		            	 if(element.equals("UAPI-6E"))
			    	       {     
			    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

			    	System.out.println("No of UAPI-6E SOLD OUT:" + U_6E.size());
			    	
			    	 
			    	 String EG_SD_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
			    	 EG_SD_U_6E =Integer.parseInt(EG_SD_U_6E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_6E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_6E =Integer.parseInt(EG_SD_U_6E1);
	    	            	}
		            break;
		            case "UAPI-7FK5": 
		            	 if(element.equals("UAPI-7FK5"))
			    	       {     
			    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

			    	System.out.println("No of UAPI-7FK5 SOLD OUT:" + U_7FK5.size());
			    	
			    	 
			    	 String EG_SD_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
			    	 EG_SD_U_7FK5 =Integer.parseInt(EG_SD_U_7FK51);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_7FK5 =Integer.parseInt(EG_SD_U_7FK51);
	    	            	}
		            break;
		            case "UAPI-7JY2": 
		            	 if(element.equals("UAPI-7JY2"))
			    	       {     
			    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

			    	System.out.println("No of UAPI-7JY2 SOLD OUT:" + U_7JY2.size());
			    	
			    	 
			    	 String EG_SD_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
			    	 EG_SD_U_7JY2 =Integer.parseInt(EG_SD_U_7JY21);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_7JY2 =Integer.parseInt(EG_SD_U_7JY21);
	    	            	}
		            break;
		            case "UAPI-802N": 
		            	 if(element.equals("UAPI-802N"))
			    	       {     
			    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

			    	System.out.println("No of UAPI-802N SOLD OUT:" + U_802N.size());
			    	
			    	 
			    	 String EG_SD_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
			    	 EG_SD_U_802N =Integer.parseInt(EG_SD_U_802N1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_802N1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_802N =Integer.parseInt(EG_SD_U_802N1);
	    	            	}
		            break;
		            case "UAPI-802R": 
		            	 if(element.equals("UAPI-802R"))
			    	       {     
			    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

			    	System.out.println("No of UAPI-802R SOLD OUT:" + U_802R.size());
			    	
			    	 
			    	 String EG_SD_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
			    	 EG_SD_U_802R =Integer.parseInt(EG_SD_U_802R1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_802R1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_802R =Integer.parseInt(EG_SD_U_802R1);
	    	            	}
		            break;
		            case "UAPI-8SQ7": 
		            	 if(element.equals("UAPI-8SQ7"))
			    	       {     
			    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

			    	System.out.println("No of UAPI-8SQ7 SOLD OUT:" + U_8SQ7.size());
			    	
			    	 
			    	 String EG_SD_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
			    	 EG_SD_U_8SQ7 =Integer.parseInt(EG_SD_U_8SQ71);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_U_8SQ71 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_U_8SQ7 =Integer.parseInt(EG_SD_U_8SQ71);
	    	            	}
		            break;
		            case "WATANIYA": 
		            	 if(element.equals("WATANIYA"))
			    	       {     
			    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

			    	System.out.println("No of WATANIYA SOLD OUT:" + WATANIYA.size());
			    	
			    	 
			    	 String EG_SD_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
			    	 EG_SD_WATANIYA =Integer.parseInt(EG_SD_WATANIYA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_WATANIYA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_WATANIYA =Integer.parseInt(EG_SD_WATANIYA1);
	    	            	}
		            break;
		            case "Air Arabia": 
		            	 if(element.equals("Air Arabia"))
			    	       {     
			    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

			    	System.out.println("No of Air Arabia SOLD OUT:" + A_AR.size());
			    	
			    	 
			    	 String EG_SD_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
			    	 EG_SD_A_AR =Integer.parseInt(EG_SD_A_AR1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_A_AR1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_A_AR =Integer.parseInt(EG_SD_A_AR1);
	    	            	}
		            break;
		            case "Air Arabia Egypt": 
		            	 if(element.equals("Air Arabia Egypt"))
			    	       {     
			    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

			    	System.out.println("No of Air Arabia Egypt SOLD OUT:" + A_AR_E.size());
			    	
			    	 
			    	 String EG_SD_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
			    	 EG_SD_A_AR_E =Integer.parseInt(EG_SD_A_AR_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_A_AR_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_A_AR_E =Integer.parseInt(EG_SD_A_AR_E1);
	    	            	}
		            break;
		            case "Air Arabia Moroc": 
		            	 if(element.equals("Air Arabia Moroc"))
			    	       {     
			    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

			    	System.out.println("No of Air Arabia Moroc SOLD OUT:" + A_AR_M.size());
			    	
			    	 
			    	 String EG_SD_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
			    	 EG_SD_A_AR_M =Integer.parseInt(EG_SD_A_AR_M1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_A_AR_M1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_A_AR_M =Integer.parseInt(EG_SD_A_AR_M1);
	    	            	}
		            break;
		            case "AirIndiaExpress": 
		            	 if(element.equals("AirIndiaExpress"))
			    	       {     
			    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

			    	System.out.println("No of AirIndiaExpress SOLD OUT:" + A_I_E.size());
			    	
			    	 
			    	 String EG_SD_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
			    	 EG_SD_A_I_E =Integer.parseInt(EG_SD_A_I_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_A_I_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_A_I_E =Integer.parseInt(EG_SD_A_I_E1);
	    	            	}
		            break;
		            case "FlyDubai": 
		            	 if(element.equals("FlyDubai"))
			    	       {     
			    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

			    	System.out.println("No of FlyDubai SOLD OUT:" + FlyDubai.size());
			    	
			    	 
			    	 String EG_SD_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
			    	 EG_SD_FlyDubai =Integer.parseInt(EG_SD_FlyDubai1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_FlyDubai1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_FlyDubai =Integer.parseInt(EG_SD_FlyDubai1);
	    	            	}
		            break;
		            case "Flynas": 
		            	 if(element.equals("Flynas"))
			    	       {     
			    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

			    	System.out.println("No of Flynas SOLD OUT:" + Flynas.size());
			    	
			    	 
			    	 String EG_SD_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
			    	 EG_SD_Flynas =Integer.parseInt(EG_SD_Flynas1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_Flynas1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_Flynas =Integer.parseInt(EG_SD_Flynas1);
	    	            	}
		            	 
		            	 break;
		            case "FLYADEAL": 
		            	 if(element.equals("FLYADEAL"))
			    	       {     
			    	List<WebElement> Flyadeal=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FLYADEAL ']"));

			    	System.out.println("No of FLYADEAL SOLD OUT:" + Flyadeal.size());
			    	
			    	 
			    	 String EG_SD_Flyadeal1 =String.format("%1s",Flyadeal.size());   		    	
		    		    
			    	 EG_SD_Flyadeal =Integer.parseInt(EG_SD_Flyadeal1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_Flyadeal1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_Flyadeal =Integer.parseInt(EG_SD_Flyadeal1);
	    	            	}
		            break;
		            case "GAL-7Q0W": 
		            	 if(element.equals("GAL-7Q0W"))
			    	       {     
			    	List<WebElement> GAL_7Q=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' GAL-7Q0W ']"));

			    	System.out.println("No of GAL-7Q0W SOLD OUT:" + GAL_7Q.size());
			    	
			    	 
			    	 String EG_SD_GAL701 =String.format("%1s",GAL_7Q.size());   		    	
		    		    
			    	 EG_SD_GAL7Q =Integer.parseInt(EG_SD_GAL701);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_GAL701 =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_GAL7Q =Integer.parseInt(EG_SD_GAL701);
	    	            	}
		            break;
		            case "SABRE-1LNJ": 
		            	 if(element.equals("SABRE-1LNJ"))
			    	       {     
			    	List<WebElement> S_1LNJ=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-1LNJ ']"));

			    	System.out.println("No of SABRE-1LNJ SOLD OUT:" + S_1LNJ.size());
			    	
			    	 
			    	 String EG_SD_1LNJ =String.format("%1s",S_1LNJ.size());   		    	
		    		    
			    	 EG_SD_S_1LNJ =Integer.parseInt(EG_SD_1LNJ );
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_SD_1LNJ  =String.format("%1s",0);   		    	
				    		    
		            		 EG_SD_S_1LNJ =Integer.parseInt(EG_SD_1LNJ );
	    	            	}
		            break;
		            default:System.out.println("Not in 10, 20 or 30");  
		         
		            }
		           }
		        }
		  
	        
	        int TotalValue = EG_SD_G_3R1+EG_SD_G_570E+EG_SD_G_5N61+EG_SD_G_7FK5+EG_SD_G_7JY2+EG_SD_G_7X7W+EG_SD_G_802N+EG_SD_G_802R
	        		+EG_SD_G_8SQ7+EG_SD_JAZEERA+EG_SD_KIWI+EG_SD_M_u+EG_SD_My_Fly+EG_SD_NESMA+EG_SD_PEGASUS+EG_SD_S_9JFH+EG_SD_S_ID2I
	        		+EG_SD_S_L8YI+EG_SD_S_L9AI+EG_SD_S_L9CI+EG_SD_S_T13I+EG_SD_S_T20I+EG_SD_SALAM+EG_SD_S_Jet+EG_SD_U_3R1G+EG_SD_U_570E
	        		+EG_SD_U_5N61+EG_SD_U_6E+EG_SD_U_7FK5+EG_SD_U_7JY2+EG_SD_U_802N+EG_SD_U_802R+EG_SD_U_8SQ7+EG_SD_WATANIYA+EG_SD_A_AR
	        		+EG_SD_A_AR_E+EG_SD_A_AR_M+EG_SD_A_I_E+EG_SD_FlyDubai+EG_SD_Flynas+EG_SD_Flyadeal+EG_SD_GAL7Q+EG_SD_G_3K6+EG_SD_S_1LNJ;
			  
	        EG_SD_Supplier_Soldout_Total = TotalValue; 
			 System.out.println("Supplier SOLD OUT total:::----"+EG_SD_Supplier_Soldout_Total);
			
			
	    
	   
			}
		
		
	}
	public static void SupplierEG_CN(WebDriver driver,String EG_Can_count)
	{
		if("Flight Search Results : 0".equals(EG_Can_count))
		{
			
			System.out.println("Supplier Cancelled total:::----0");
			EG_CN_G_3K6=0;
			EG_CN_G_3R1=0;
			EG_CN_G_570E=0;
			EG_CN_G_5N61=0;
			EG_CN_G_7FK5=0;
			EG_CN_G_7JY2=0;
			EG_CN_G_7X7W=0;
			EG_CN_G_802N=0;
			EG_CN_G_802R=0;
			EG_CN_G_8SQ7=0;
			EG_CN_JAZEERA=0;
			EG_CN_KIWI=0;
			EG_CN_M_u=0;
			EG_CN_My_Fly=0;
			EG_CN_NESMA=0;
			EG_CN_PEGASUS=0;
			EG_CN_S_9JFH=0;
			EG_CN_S_ID2I=0;
			EG_CN_S_L8YI=0;
			EG_CN_S_L9AI=0;
			EG_CN_S_L9CI=0;
			EG_CN_S_T13I=0;
			EG_CN_S_T20I=0;
			EG_CN_SALAM=0;
			EG_CN_S_Jet=0;
			EG_CN_U_3R1G=0;
			EG_CN_U_570E=0;
			EG_CN_U_5N61=0;
			EG_CN_U_6E=0;
			EG_CN_U_7FK5=0;
			EG_CN_U_7JY2=0;
			EG_CN_U_802N=0;
			EG_CN_U_802R=0;
			EG_CN_U_8SQ7=0;
			EG_CN_WATANIYA=0;
			EG_CN_A_AR=0;
			EG_CN_A_AR_E=0;
			EG_CN_A_AR_M=0;
			EG_CN_A_I_E=0;
			EG_CN_FlyDubai=0;
			EG_CN_Flynas=0;
			EG_CN_Flyadeal=0;
			EG_CN_GAL7Q=0;
			EG_CN_S_1LNJ=0;   
			
			
	         int TotalValue =0;
	         EG_CN_Supplier_Cancelled_Total = TotalValue; 
	 				 System.out.println("Supplier Cancelled total:::----"+EG_CN_Supplier_Cancelled_Total);
	 				
	 				
	 	        
	        
	      
		}
		else
		{
		
			List<WebElement> CN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
			 
			  System.out.println("Total Number of Supplier:" + CN.size());
			
			ArrayList<String>list=new ArrayList<>();
			
			 for (WebElement element1 : CN)
			  {
				 list.add(element1.getText());
				 Suppliers_CN_EG.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
			  EG_UniqueCount_CN=unique.size();
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            case "Galileo-3K6": 
		            	if(element.equals("Galileo-3K6")) 
			    	       {
			    	        
			    	List<WebElement> G_3k6=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3K6 ']"));

			    	System.out.println("No of G_3K6 Cancelled:" + G_3k6.size());
			    	String EG_CN_3K6 =String.format("%1s",G_3k6.size());
			    	
			    	
			    	 EG_CN_G_3K6 =Integer.parseInt(EG_CN_3K6);
			    	
			    	       }
		            	else
		            	{
		            		String EG_CN_3K6 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_CN_G_3K6 =Integer.parseInt(EG_CN_3K6);
		            	}
			    	      
		            break; 
		            case "Galileo-3R1G": 
		            	if(element.equals("Galileo-3R1G")) 
			    	       {
			    	        
			    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

			    	System.out.println("No of G_3R1 Cancelled:" + G_3R1.size());
			    	String EG_CN_G_3R11 =String.format("%1s",G_3R1.size());
			    	
			    	
			    	 EG_CN_G_3R1 =Integer.parseInt(EG_CN_G_3R11);
			    	
			    	       }
		            	else
		            	{
		            		String EG_CN_G_3R11 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_CN_G_3R1 =Integer.parseInt(EG_CN_G_3R11);
		            	}
			    	      
		            break; 
		            
		            case "Galileo-570E": 
		            	   
			    	       if(element.equals("Galileo-570E"))
			    	       {
			    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

			    	  System.out.println("No of Galileo-570E Cancelled:" + G_570E.size());
			    	  String EG_CN_G_570E1 =String.format("%1s",G_570E.size());
			    	  
	    		    	
	    		    	
			    	  EG_CN_G_570E =Integer.parseInt(EG_CN_G_570E1);
			    	       }
			    	       else
	    	            	{
			    	    	   String EG_CN_G_570E1 =String.format("%1s",0);
			    		    	  
			    		    	
			    		    	
			    	    	   EG_CN_G_570E =Integer.parseInt(EG_CN_G_570E1);
	    	            	}
			    	      
		            break;  
		            case "Galileo-5N61": 
		            	 if(element.equals("Galileo-5N61"))
			    	       {   
			    	       
			    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

			    	System.out.println("No of Galileo-5N61 Cancelled:" + G_5N61.size());
			    	
			    	
			    	 String EG_CN_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
			    	 EG_CN_G_5N61 =Integer.parseInt(EG_CN_G_5N611);
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_G_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_G_5N61 =Integer.parseInt(EG_CN_G_5N611);
	    	            	}
		            break; 
		            case "Galileo-7FK5": 
		            	 if(element.equals("Galileo-7FK5"))
			    	       {   
			    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

			    	System.out.println("No of Galileo-7FK5 Cancelled:" + G_7FK5.size());
			    	 
			    	 String EG_CN_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
			    	 EG_CN_G_7FK5 =Integer.parseInt(EG_CN_G_7FK51);
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_G_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_G_7FK5 =Integer.parseInt(EG_CN_G_7FK51);
	    	            	}
			    	      
		            break; 
		            case "Galileo-7JY2": 
		            	 if(element.equals("Galileo-7JY2"))
			    	       {        
			    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

			    	System.out.println("No of Galileo-7JY2 Cancelled:" + G_7JY2.size());
			    	
			    	 String EG_CN_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
			    	 EG_CN_G_7JY2 =Integer.parseInt(EG_CN_G_7JY21);
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_G_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_G_7JY2 =Integer.parseInt(EG_CN_G_7JY21);
	    	            	}
			    	     
			    	       
		            break;  
		            case "Galileo-7X7W": 
		            	  if(element.equals("Galileo-7X7W"))
			    	       {   
			    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

			    	System.out.println("No of Galileo-7X7W Cancelled:" + G_7X7W.size());
			    	
			    	
			    	String EG_CN_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
			    	EG_CN_G_7X7W =Integer.parseInt(EG_CN_G_7X7W1);
			    	       }
		            	  else
	    	            	{
		            			String EG_CN_G_7X7W1 =String.format("%1s",0);   		    	
				    		    
		            			EG_CN_G_7X7W =Integer.parseInt(EG_CN_G_7X7W1);
	    	            	}
		            break; 
		            case "Galileo-802N": 
		            	  if(element.equals("Galileo-802N"))
			    	       {        
			    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

			    	System.out.println("No of Galileo-802N Cancelled:" + G_802N.size());
			    	
			    	
			    	String EG_CN_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
			    	EG_CN_G_802N =Integer.parseInt(EG_CN_G_802N1);
			    	
			    	       }
		            	  else
	    	            	{
		            		  String EG_CN_G_802N1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_CN_G_802N =Integer.parseInt(EG_CN_G_802N1);
	    	            	}
			    	      
			    	     
		            break;
		            case "Galileo-802R": 
		            	  if(element.equals("Galileo-802R"))
			    	       {   
			    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

			    	System.out.println("No of Galileo-802R Cancelled:" + G_802R.size());
			    	
			    	String EG_CN_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
			    	EG_CN_G_802R =Integer.parseInt(EG_CN_G_802R1);
			    	       }
			    	       
		            	  else
	    	            	{
		            		  String EG_CN_G_802R1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_CN_G_802R =Integer.parseInt(EG_CN_G_802R1);
	    	            	}
			    	       
		            break; 
		            case "Galileo-8SQ7": 
		            	if(element.equals("Galileo-8SQ7"))
			    	       {  
			    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

			    	System.out.println("No of Galileo-8SQ7 Cancelled:" + G_8SQ7.size());
			    	 
			    	 String EG_CN_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
			    	 EG_CN_G_8SQ7 =Integer.parseInt(EG_CN_G_8SQ71);
			    	       }
		            	else
		            	{
		            		String EG_CN_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
		            		EG_CN_G_8SQ7 =Integer.parseInt(EG_CN_G_8SQ71);
		            	}
			    	     
		            break;
		            case "JAZEERA": 
		            	
		            	  if(element.equals("JAZEERA"))
			    	       {  
			    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

			     	System.out.println("No of JAZEERA Cancelled:" + JAZEERA.size());
			    	 
			    	 String EG_CN_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
			    	 EG_CN_JAZEERA =Integer.parseInt(EG_CN_JAZEERA1);
			    	       }
		            	  else
	    	            	{
		            		  
			    		    	 String EG_CN_JAZEERA1 =String.format("%1s",0);   		    	
					    		    
			    		    	 EG_CN_JAZEERA =Integer.parseInt(EG_CN_JAZEERA1);
	    	            	}
			    	      
		            break; 
		            case "KIWI": 
		            	 if(element.equals("KIWI"))
			    	       {     
			    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

			    	System.out.println("No of KIWI Cancelled:" + KIWI.size());
			    	
			    	 
			    	 String EG_CN_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
			    	 EG_CN_KIWI =Integer.parseInt(EG_CN_KIWI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_KIWI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_KIWI =Integer.parseInt(EG_CN_KIWI1);
	    	            	}
		            break;
		            case "Manual": 
		            	 if(element.equals("Manual"))
			    	       {     
			    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

			    	System.out.println("No of Manual Cancelled:" + M_u.size());
			    	
			    	 
			    	 String EG_CN_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
			    	 EG_CN_M_u =Integer.parseInt(EG_CN_M_u1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_M_u1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_M_u =Integer.parseInt(EG_CN_M_u1);
	    	            	}
		            break;
		            case "MystiFly": 
		            	 if(element.equals("MystiFly"))
			    	       {     
			    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

			    	System.out.println("No of MystiFly Cancelled:" + My_Fly.size());
			    	
			    	 
			    	 String EG_CN_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
			    	 EG_CN_My_Fly =Integer.parseInt(EG_CN_My_Fly1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_My_Fly1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_My_Fly =Integer.parseInt(EG_CN_My_Fly1);
	    	            	}
		            break;
		            case "NESMA": 
		            	 if(element.equals("NESMA"))
			    	       {     
			    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

			    	System.out.println("No of NESMA Cancelled:" + NESMA.size());
			    	
			    	 
			    	 String EG_CN_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
			    	 EG_CN_NESMA =Integer.parseInt(EG_CN_NESMA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_NESMA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_NESMA =Integer.parseInt(EG_CN_NESMA1);
	    	            	}
		            break;
		            case "PEGASUS": 
		            	 if(element.equals("PEGASUS"))
			    	       {     
			    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

			    	System.out.println("No of PEGASUS Cancelled:" + PEGASUS.size());
			    	
			    	 
			    	 String EG_CN_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
			    	 EG_CN_PEGASUS =Integer.parseInt(EG_CN_PEGASUS1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_PEGASUS1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_PEGASUS =Integer.parseInt(EG_CN_PEGASUS1);
	    	            	}
		            break;
		            case "SABRE-9JFH": 
		            	 if(element.equals("SABRE-9JFH"))
			    	       {     
			    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

			    	System.out.println("No of SABRE-9JFH Cancelled:" + S_9JFH.size());
			    	
			    	 
			    	 String EG_CN_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
			    	 EG_CN_S_9JFH =Integer.parseInt(EG_CN_S_9JFH1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_9JFH1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_9JFH =Integer.parseInt(EG_CN_S_9JFH1);
	    	            	}
		            break;
		            case "SABRE-ID2I": 
		            	 if(element.equals("SABRE-ID2I"))
			    	       {     
			    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

			    	System.out.println("No of SABRE-ID2I Cancelled:" + S_ID2I.size());
			    	
			    	 
			    	 String EG_CN_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
			    	 EG_CN_S_ID2I =Integer.parseInt(EG_CN_S_ID2I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_ID2I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_ID2I =Integer.parseInt(EG_CN_S_ID2I1);
	    	            	}
		            break;
		            case "SABRE-L8YI": 
		            	 if(element.equals("SABRE-L8YI"))
			    	       {     
			    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

			    	System.out.println("No of SABRE-L8YI Cancelled:" + S_L8YI.size());
			    	
			    	 
			    	 String EG_CN_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
			    	 EG_CN_S_L8YI =Integer.parseInt(EG_CN_S_L8YI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_L8YI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_L8YI =Integer.parseInt(EG_CN_S_L8YI1);
	    	            	}
		            break;
		            case "SABRE-L9AI": 
		            	 if(element.equals("SABRE-L9AI"))
			    	       {     
			    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

			    	System.out.println("No of SABRE-L9AI Cancelled:" + S_L9AI.size());
			    	
			    	 
			    	 String EG_CN_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
			    	 EG_CN_S_L9AI =Integer.parseInt(EG_CN_S_L9AI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_L9AI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_L9AI =Integer.parseInt(EG_CN_S_L9AI1);
	    	            	}
		            break;
		            case "SABRE-L9CI": 
		            	 if(element.equals("SABRE-L9CI"))
			    	       {     
			    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

			    	System.out.println("No of SABRE-L9CI Cancelled:" + S_L9CI.size());
			    	
			    	 
			    	 String EG_CN_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
			    	 EG_CN_S_L9CI =Integer.parseInt(EG_CN_S_L9CI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_L9CI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_L9CI =Integer.parseInt(EG_CN_S_L9CI1);
	    	            	}
		            break;
		            case "SABRE-T13I": 
		            	 if(element.equals("SABRE-T13I"))
			    	       {     
			    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

			    	System.out.println("No of SABRE-T13I Cancelled:" + S_T13I.size());
			    	
			    	 
			    	 String EG_CN_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
			    	 EG_CN_S_T13I =Integer.parseInt(EG_CN_S_T13I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_T13I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_T13I =Integer.parseInt(EG_CN_S_T13I1);
	    	            	}
		            break;
		            case "SABRE-T20I": 
		            	 if(element.equals("SABRE-T20I"))
			    	       {     
			    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

			    	System.out.println("No of SABRE-T20I Cancelled:" + S_T20I.size());
			    	
			    	 
			    	 String EG_CN_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
			    	 EG_CN_S_T20I =Integer.parseInt(EG_CN_S_T20I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_T20I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_T20I =Integer.parseInt(EG_CN_S_T20I1);
	    	            	}
		            break;
		            case "SALAM": 
		            	 if(element.equals("SALAM"))
			    	       {     
			    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

			    	System.out.println("No of SALAM Cancelled:" + SALAM.size());
			    	
			    	 
			    	 String EG_CN_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
			    	 EG_CN_SALAM =Integer.parseInt(EG_CN_SALAM1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_SALAM1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_SALAM =Integer.parseInt(EG_CN_SALAM1);
	    	            	}
		            break;
		            case "SpiceJet": 
		            	 if(element.equals("SpiceJet"))
			    	       {     
			    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

			    	System.out.println("No of SpiceJet Cancelled:" + S_Jet.size());
			    	
			    	 
			    	 String EG_CN_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
			    	 EG_CN_S_Jet =Integer.parseInt(EG_CN_S_Jet1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_S_Jet1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_Jet =Integer.parseInt(EG_CN_S_Jet1);
	    	            	}
		            break;
		            case "UAPI-3R1G": 
		            	 if(element.equals("UAPI-3R1G"))
			    	       {     
			    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

			    	System.out.println("No of UAPI-3R1G Cancelled:" + U_3R1G.size());
			    	
			    	 
			    	 String EG_CN_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
			    	 EG_CN_U_3R1G =Integer.parseInt(EG_CN_U_3R1G1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_3R1G1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_3R1G =Integer.parseInt(EG_CN_U_3R1G1);
	    	            	}
		            break;
		            case "UAPI-570E": 
		            	 if(element.equals("UAPI-570E"))
			    	       {     
			    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

			    	System.out.println("No of UAPI-570E Cancelled:" + U_570E.size());
			    	
			    	 
			    	 String EG_CN_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
			    	 EG_CN_U_570E =Integer.parseInt(EG_CN_U_570E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_570E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_570E =Integer.parseInt(EG_CN_U_570E1);
	    	            	}
		            break;
		            case "UAPI-5N61": 
		            	 if(element.equals("UAPI-5N61"))
			    	       {     
			    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

			    	System.out.println("No of UAPI-5N61 Cancelled:" + U_5N61.size());
			    	
			    	 
			    	 String EG_CN_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
			    	 EG_CN_U_5N61 =Integer.parseInt(EG_CN_U_5N611);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_5N61 =Integer.parseInt(EG_CN_U_5N611);
	    	            	}
		            break;
		            case "UAPI-6E": 
		            	 if(element.equals("UAPI-6E"))
			    	       {     
			    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

			    	System.out.println("No of UAPI-6E Cancelled:" + U_6E.size());
			    	
			    	 
			    	 String EG_CN_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
			    	 EG_CN_U_6E =Integer.parseInt(EG_CN_U_6E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_6E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_6E =Integer.parseInt(EG_CN_U_6E1);
	    	            	}
		            break;
		            case "UAPI-7FK5": 
		            	 if(element.equals("UAPI-7FK5"))
			    	       {     
			    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

			    	System.out.println("No of UAPI-7FK5 Cancelled:" + U_7FK5.size());
			    	
			    	 
			    	 String EG_CN_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
			    	 EG_CN_U_7FK5 =Integer.parseInt(EG_CN_U_7FK51);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_7FK5 =Integer.parseInt(EG_CN_U_7FK51);
	    	            	}
		            break;
		            case "UAPI-7JY2": 
		            	 if(element.equals("UAPI-7JY2"))
			    	       {     
			    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

			    	System.out.println("No of UAPI-7JY2 Cancelled:" + U_7JY2.size());
			    	
			    	 
			    	 String EG_CN_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
			    	 EG_CN_U_7JY2 =Integer.parseInt(EG_CN_U_7JY21);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_7JY2 =Integer.parseInt(EG_CN_U_7JY21);
	    	            	}
		            break;
		            case "UAPI-802N": 
		            	 if(element.equals("UAPI-802N"))
			    	       {     
			    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

			    	System.out.println("No of UAPI-802N Cancelled:" + U_802N.size());
			    	
			    	 
			    	 String EG_CN_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
			    	 EG_CN_U_802N =Integer.parseInt(EG_CN_U_802N1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_802N1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_802N =Integer.parseInt(EG_CN_U_802N1);
	    	            	}
		            break;
		            case "UAPI-802R": 
		            	 if(element.equals("UAPI-802R"))
			    	       {     
			    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

			    	System.out.println("No of UAPI-802R Cancelled:" + U_802R.size());
			    	
			    	 
			    	 String EG_CN_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
			    	 EG_CN_U_802R =Integer.parseInt(EG_CN_U_802R1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_802R1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_802R =Integer.parseInt(EG_CN_U_802R1);
	    	            	}
		            break;
		            case "UAPI-8SQ7": 
		            	 if(element.equals("UAPI-8SQ7"))
			    	       {     
			    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

			    	System.out.println("No of UAPI-8SQ7 Cancelled:" + U_8SQ7.size());
			    	
			    	 
			    	 String EG_CN_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
			    	 EG_CN_U_8SQ7 =Integer.parseInt(EG_CN_U_8SQ71);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_U_8SQ71 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_U_8SQ7 =Integer.parseInt(EG_CN_U_8SQ71);
	    	            	}
		            break;
		            case "WATANIYA": 
		            	 if(element.equals("WATANIYA"))
			    	       {     
			    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

			    	System.out.println("No of WATANIYA Cancelled:" + WATANIYA.size());
			    	
			    	 
			    	 String EG_CN_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
			    	 EG_CN_WATANIYA =Integer.parseInt(EG_CN_WATANIYA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_WATANIYA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_WATANIYA =Integer.parseInt(EG_CN_WATANIYA1);
	    	            	}
		            break;
		            case "Air Arabia": 
		            	 if(element.equals("Air Arabia"))
			    	       {     
			    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

			    	System.out.println("No of Air Arabia Cancelled:" + A_AR.size());
			    	
			    	 
			    	 String EG_CN_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
			    	 EG_CN_A_AR =Integer.parseInt(EG_CN_A_AR1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_A_AR1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_A_AR =Integer.parseInt(EG_CN_A_AR1);
	    	            	}
		            break;
		            case "Air Arabia Egypt": 
		            	 if(element.equals("Air Arabia Egypt"))
			    	       {     
			    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

			    	System.out.println("No of Air Arabia Egypt Cancelled:" + A_AR_E.size());
			    	
			    	 
			    	 String EG_CN_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
			    	 EG_CN_A_AR_E =Integer.parseInt(EG_CN_A_AR_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_A_AR_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_A_AR_E =Integer.parseInt(EG_CN_A_AR_E1);
	    	            	}
		            break;
		            case "Air Arabia Moroc": 
		            	 if(element.equals("Air Arabia Moroc"))
			    	       {     
			    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

			    	System.out.println("No of Air Arabia Moroc Cancelled:" + A_AR_M.size());
			    	
			    	 
			    	 String EG_CN_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
			    	 EG_CN_A_AR_M =Integer.parseInt(EG_CN_A_AR_M1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_A_AR_M1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_A_AR_M =Integer.parseInt(EG_CN_A_AR_M1);
	    	            	}
		            break;
		            case "AirIndiaExpress": 
		            	 if(element.equals("AirIndiaExpress"))
			    	       {     
			    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

			    	System.out.println("No of AirIndiaExpress Cancelled:" + A_I_E.size());
			    	
			    	 
			    	 String EG_CN_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
			    	 EG_CN_A_I_E =Integer.parseInt(EG_CN_A_I_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_A_I_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_A_I_E =Integer.parseInt(EG_CN_A_I_E1);
	    	            	}
		            break;
		            case "FlyDubai": 
		            	 if(element.equals("FlyDubai"))
			    	       {     
			    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

			    	System.out.println("No of FlyDubai Cancelled:" + FlyDubai.size());
			    	
			    	 
			    	 String EG_CN_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
			    	 EG_CN_FlyDubai =Integer.parseInt(EG_CN_FlyDubai1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_FlyDubai1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_FlyDubai =Integer.parseInt(EG_CN_FlyDubai1);
	    	            	}
		            break;
		            case "Flynas": 
		            	 if(element.equals("Flynas"))
			    	       {     
			    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

			    	System.out.println("No of Flynas Cancelled:" + Flynas.size());
			    	
			    	 
			    	 String EG_CN_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
			    	 EG_CN_Flynas =Integer.parseInt(EG_CN_Flynas1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_Flynas1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_Flynas =Integer.parseInt(EG_CN_Flynas1);
	    	            	}
		            	 
		            	 
		            	 break;
		            case "FLYADEAL": 
		            	 if(element.equals("FLYADEAL"))
			    	       {     
			    	List<WebElement> Flyadeal=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FLYADEAL ']"));

			    	System.out.println("No of FLYADEAL Cancelled:" + Flyadeal.size());
			    	
			    	 
			    	 String EG_CN_Flyadeal1 =String.format("%1s",Flyadeal.size());   		    	
		    		    
			    	 EG_CN_Flyadeal =Integer.parseInt(EG_CN_Flyadeal1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_Flyadeal1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_Flyadeal =Integer.parseInt(EG_CN_Flyadeal1);
	    	            	}
		            break;
		            case "GAL-7Q0W": 
		            	 if(element.equals("GAL-7Q0W"))
			    	       {     
			    	List<WebElement> GAL_7Q=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' GAL-7Q0W ']"));

			    	System.out.println("No of GAL-7Q0W Cancelled:" + GAL_7Q.size());
			    	
			    	 
			    	 String EG_CN_GAL701 =String.format("%1s",GAL_7Q.size());   		    	
		    		    
			    	 EG_CN_GAL7Q =Integer.parseInt(EG_CN_GAL701);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_GAL701 =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_GAL7Q =Integer.parseInt(EG_CN_GAL701);
	    	            	}
		            break;
		            case "SABRE-1LNJ": 
		            	 if(element.equals("SABRE-1LNJ"))
			    	       {     
			    	List<WebElement> S_1LNJ=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-1LNJ ']"));

			    	System.out.println("No of SABRE-1LNJ Cancelled:" + S_1LNJ.size());
			    	
			    	 
			    	 String EG_CN_1LNJ =String.format("%1s",S_1LNJ.size());   		    	
		    		    
			    	 EG_CN_S_1LNJ =Integer.parseInt(EG_CN_1LNJ );
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_CN_1LNJ  =String.format("%1s",0);   		    	
				    		    
		            		 EG_CN_S_1LNJ =Integer.parseInt(EG_CN_1LNJ );
	    	            	}
		            break;
		            
		            default:System.out.println("Not in 10, 20 or 30");  
		         
		            }
		           }
		        }
		  
	        
	        int TotalValue = EG_CN_G_3R1+EG_CN_G_570E+EG_CN_G_5N61+EG_CN_G_7FK5+EG_CN_G_7JY2+EG_CN_G_7X7W+EG_CN_G_802N+EG_CN_G_802R
	        		+EG_CN_G_8SQ7+EG_CN_JAZEERA+EG_CN_KIWI+EG_CN_M_u+EG_CN_My_Fly+EG_CN_NESMA+EG_CN_PEGASUS+EG_CN_S_9JFH+EG_CN_S_ID2I
	        		+EG_CN_S_L8YI+EG_CN_S_L9AI+EG_CN_S_L9CI+EG_CN_S_T13I+EG_CN_S_T20I+EG_CN_SALAM+EG_CN_S_Jet+EG_CN_U_3R1G+EG_CN_U_570E
	        		+EG_CN_U_5N61+EG_CN_U_6E+EG_CN_U_7FK5+EG_CN_U_7JY2+EG_CN_U_802N+EG_CN_U_802R+EG_CN_U_8SQ7+EG_CN_WATANIYA+EG_CN_A_AR
	        		+EG_CN_A_AR_E+EG_CN_A_AR_M+EG_CN_A_I_E+EG_CN_FlyDubai+EG_CN_Flynas+EG_CN_Flyadeal+EG_CN_GAL7Q+EG_CN_G_3K6+EG_CN_S_1LNJ;
			  
	        EG_CN_Supplier_Cancelled_Total = TotalValue; 
			 System.out.println("Supplier Cancelled total:::----"+EG_CN_Supplier_Cancelled_Total);
			
			
	    
	   
			}
		
	}
	public static void SupplierEG_TH(WebDriver driver,String EG_TH_count)
	{
		if("Flight Search Results : 0".equals(EG_TH_count))
		{
			
			System.out.println("Supplier Transaction Hold total:::----0");
			EG_TH_G_3K6=0;
			EG_TH_G_3R1=0;
			EG_TH_G_570E=0;
			EG_TH_G_5N61=0;
			EG_TH_G_7FK5=0;
			EG_TH_G_7JY2=0;
			EG_TH_G_7X7W=0;
			EG_TH_G_802N=0;
			EG_TH_G_802R=0;
			EG_TH_G_8SQ7=0;
			EG_TH_JAZEERA=0;
			EG_TH_KIWI=0;
			EG_TH_M_u=0;
			EG_TH_My_Fly=0;
			EG_TH_NESMA=0;
			EG_TH_PEGASUS=0;
			EG_TH_S_9JFH=0;
			EG_TH_S_ID2I=0;
			EG_TH_S_L8YI=0;
			EG_TH_S_L9AI=0;
			EG_TH_S_L9CI=0;
			EG_TH_S_T13I=0;
			EG_TH_S_T20I=0;
			EG_TH_SALAM=0;
			EG_TH_S_Jet=0;
			EG_TH_U_3R1G=0;
			EG_TH_U_570E=0;
			EG_TH_U_5N61=0;
			EG_TH_U_6E=0;
			EG_TH_U_7FK5=0;
			EG_TH_U_7JY2=0;
			EG_TH_U_802N=0;
			EG_TH_U_802R=0;
			EG_TH_U_8SQ7=0;
			EG_TH_WATANIYA=0;
			EG_TH_A_AR=0;
			EG_TH_A_AR_E=0;
			EG_TH_A_AR_M=0;
			EG_TH_A_I_E=0;
			EG_TH_FlyDubai=0;
			EG_TH_Flynas=0;
			EG_TH_Flyadeal=0;
			EG_TH_GAL7Q=0;
			EG_TH_S_1LNJ=0;    
			
			
	         int TotalValue =0;
	         EG_TH_Supplier_Transaction_Hold_Total = TotalValue; 
	 				 System.out.println("Supplier Transaction Hold total:::----"+EG_TH_Supplier_Transaction_Hold_Total);
	 				
	 				
	 	        
	        
	      
		}
		else
		{
		
			List<WebElement> TH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
			 
			  System.out.println("Total Number of Supplier:" + TH.size());
			
			ArrayList<String>list=new ArrayList<>();
			
			 for (WebElement element1 : TH)
			  {
				 list.add(element1.getText());
				 Suppliers_TH_EG.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
			  EG_UniqueCount_TH=unique.size();
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            case "Galileo-3K6": 
		            	if(element.equals("Galileo-3K6")) 
			    	       {
			    	        
			    	List<WebElement> G_3k6=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3K6 ']"));

			    	System.out.println("No of G_3K6 Transaction Hold:" + G_3k6.size());
			    	String EG_TH_3K6 =String.format("%1s",G_3k6.size());
			    	
			    	
			    	 EG_TH_G_3K6 =Integer.parseInt(EG_TH_3K6);
			    	
			    	       }
		            	else
		            	{
		            		String EG_TH_3K6 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_TH_G_3K6 =Integer.parseInt(EG_TH_3K6);
		            	}
			    	      
		            break; 
		            case "Galileo-3R1G": 
		            	if(element.equals("Galileo-3R1G")) 
			    	       {
			    	        
			    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

			    	System.out.println("No of G_3R1 Transaction Hold:" + G_3R1.size());
			    	String EG_TH_G_3R11 =String.format("%1s",G_3R1.size());
			    	
			    	
			    	 EG_TH_G_3R1 =Integer.parseInt(EG_TH_G_3R11);
			    	
			    	       }
		            	else
		            	{
		            		String EG_TH_G_3R11 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_TH_G_3R1 =Integer.parseInt(EG_TH_G_3R11);
		            	}
			    	      
		            break; 
		            
		            case "Galileo-570E": 
		            	   
			    	       if(element.equals("Galileo-570E"))
			    	       {
			    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

			    	  System.out.println("No of Galileo-570E Transaction Hold:" + G_570E.size());
			    	  String EG_TH_G_570E1 =String.format("%1s",G_570E.size());
			    	  
	    		    	
	    		    	
			    	  EG_TH_G_570E =Integer.parseInt(EG_TH_G_570E1);
			    	       }
			    	       else
	    	            	{
			    	    	   String EG_TH_G_570E1 =String.format("%1s",0);
			    		    	  
			    		    	
			    		    	
			    	    	   EG_TH_G_570E =Integer.parseInt(EG_TH_G_570E1);
	    	            	}
			    	      
		            break;  
		            case "Galileo-5N61": 
		            	 if(element.equals("Galileo-5N61"))
			    	       {   
			    	       
			    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

			    	System.out.println("No of Galileo-5N61 Transaction Hold:" + G_5N61.size());
			    	
			    	
			    	 String EG_TH_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
			    	 EG_TH_G_5N61 =Integer.parseInt(EG_TH_G_5N611);
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_G_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_G_5N61 =Integer.parseInt(EG_TH_G_5N611);
	    	            	}
		            break; 
		            case "Galileo-7FK5": 
		            	 if(element.equals("Galileo-7FK5"))
			    	       {   
			    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

			    	System.out.println("No of Galileo-7FK5 Transaction Hold:" + G_7FK5.size());
			    	 
			    	 String EG_TH_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
			    	 EG_TH_G_7FK5 =Integer.parseInt(EG_TH_G_7FK51);
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_G_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_G_7FK5 =Integer.parseInt(EG_TH_G_7FK51);
	    	            	}
			    	      
		            break; 
		            case "Galileo-7JY2": 
		            	 if(element.equals("Galileo-7JY2"))
			    	       {        
			    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

			    	System.out.println("No of Galileo-7JY2 Transaction Hold:" + G_7JY2.size());
			    	
			    	 String EG_TH_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
			    	 EG_TH_G_7JY2 =Integer.parseInt(EG_TH_G_7JY21);
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_G_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_G_7JY2 =Integer.parseInt(EG_TH_G_7JY21);
	    	            	}
			    	     
			    	       
		            break;  
		            case "Galileo-7X7W": 
		            	  if(element.equals("Galileo-7X7W"))
			    	       {   
			    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

			    	System.out.println("No of Galileo-7X7W Transaction Hold:" + G_7X7W.size());
			    	
			    	
			    	String EG_TH_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
			    	EG_TH_G_7X7W =Integer.parseInt(EG_TH_G_7X7W1);
			    	       }
		            	  else
	    	            	{
		            			String EG_TH_G_7X7W1 =String.format("%1s",0);   		    	
				    		    
		            			EG_TH_G_7X7W =Integer.parseInt(EG_TH_G_7X7W1);
	    	            	}
		            break; 
		            case "Galileo-802N": 
		            	  if(element.equals("Galileo-802N"))
			    	       {        
			    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

			    	System.out.println("No of Galileo-802N Transaction Hold:" + G_802N.size());
			    	
			    	
			    	String EG_TH_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
			    	EG_TH_G_802N =Integer.parseInt(EG_TH_G_802N1);
			    	
			    	       }
		            	  else
	    	            	{
		            		  String EG_TH_G_802N1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_TH_G_802N =Integer.parseInt(EG_TH_G_802N1);
	    	            	}
			    	      
			    	     
		            break;
		            case "Galileo-802R": 
		            	  if(element.equals("Galileo-802R"))
			    	       {   
			    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

			    	System.out.println("No of Galileo-802R Transaction Hold:" + G_802R.size());
			    	
			    	String EG_TH_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
			    	EG_TH_G_802R =Integer.parseInt(EG_TH_G_802R1);
			    	       }
			    	       
		            	  else
	    	            	{
		            		  String EG_TH_G_802R1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_TH_G_802R =Integer.parseInt(EG_TH_G_802R1);
	    	            	}
			    	       
		            break; 
		            case "Galileo-8SQ7": 
		            	if(element.equals("Galileo-8SQ7"))
			    	       {  
			    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

			    	System.out.println("No of Galileo-8SQ7 Transaction Hold:" + G_8SQ7.size());
			    	 
			    	 String EG_TH_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
			    	 EG_TH_G_8SQ7 =Integer.parseInt(EG_TH_G_8SQ71);
			    	       }
		            	else
		            	{
		            		String EG_TH_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
		            		EG_TH_G_8SQ7 =Integer.parseInt(EG_TH_G_8SQ71);
		            	}
			    	     
		            break;
		            case "JAZEERA": 
		            	
		            	  if(element.equals("JAZEERA"))
			    	       {  
			    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

			     	System.out.println("No of JAZEERA Transaction Hold:" + JAZEERA.size());
			    	 
			    	 String EG_TH_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
			    	 EG_TH_JAZEERA =Integer.parseInt(EG_TH_JAZEERA1);
			    	       }
		            	  else
	    	            	{
		            		  
			    		    	 String EG_TH_JAZEERA1 =String.format("%1s",0);   		    	
					    		    
			    		    	 EG_TH_JAZEERA =Integer.parseInt(EG_TH_JAZEERA1);
	    	            	}
			    	      
		            break; 
		            case "KIWI": 
		            	 if(element.equals("KIWI"))
			    	       {     
			    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

			    	System.out.println("No of KIWI Transaction Hold:" + KIWI.size());
			    	
			    	 
			    	 String EG_TH_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
			    	 EG_TH_KIWI =Integer.parseInt(EG_TH_KIWI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_KIWI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_KIWI =Integer.parseInt(EG_TH_KIWI1);
	    	            	}
		            break;
		            case "Manual": 
		            	 if(element.equals("Manual"))
			    	       {     
			    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

			    	System.out.println("No of Manual Transaction Hold:" + M_u.size());
			    	
			    	 
			    	 String EG_TH_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
			    	 EG_TH_M_u =Integer.parseInt(EG_TH_M_u1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_M_u1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_M_u =Integer.parseInt(EG_TH_M_u1);
	    	            	}
		            break;
		            case "MystiFly": 
		            	 if(element.equals("MystiFly"))
			    	       {     
			    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

			    	System.out.println("No of MystiFly Transaction Hold:" + My_Fly.size());
			    	
			    	 
			    	 String EG_TH_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
			    	 EG_TH_My_Fly =Integer.parseInt(EG_TH_My_Fly1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_My_Fly1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_My_Fly =Integer.parseInt(EG_TH_My_Fly1);
	    	            	}
		            break;
		            case "NESMA": 
		            	 if(element.equals("NESMA"))
			    	       {     
			    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

			    	System.out.println("No of NESMA Transaction Hold:" + NESMA.size());
			    	
			    	 
			    	 String EG_TH_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
			    	 EG_TH_NESMA =Integer.parseInt(EG_TH_NESMA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_NESMA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_NESMA =Integer.parseInt(EG_TH_NESMA1);
	    	            	}
		            break;
		            case "PEGASUS": 
		            	 if(element.equals("PEGASUS"))
			    	       {     
			    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

			    	System.out.println("No of PEGASUS Transaction Hold:" + PEGASUS.size());
			    	
			    	 
			    	 String EG_TH_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
			    	 EG_TH_PEGASUS =Integer.parseInt(EG_TH_PEGASUS1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_PEGASUS1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_PEGASUS =Integer.parseInt(EG_TH_PEGASUS1);
	    	            	}
		            break;
		            case "SABRE-9JFH": 
		            	 if(element.equals("SABRE-9JFH"))
			    	       {     
			    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

			    	System.out.println("No of SABRE-9JFH Transaction Hold:" + S_9JFH.size());
			    	
			    	 
			    	 String EG_TH_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
			    	 EG_TH_S_9JFH =Integer.parseInt(EG_TH_S_9JFH1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_9JFH1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_9JFH =Integer.parseInt(EG_TH_S_9JFH1);
	    	            	}
		            break;
		            case "SABRE-ID2I": 
		            	 if(element.equals("SABRE-ID2I"))
			    	       {     
			    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

			    	System.out.println("No of SABRE-ID2I Transaction Hold:" + S_ID2I.size());
			    	
			    	 
			    	 String EG_TH_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
			    	 EG_TH_S_ID2I =Integer.parseInt(EG_TH_S_ID2I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_ID2I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_ID2I =Integer.parseInt(EG_TH_S_ID2I1);
	    	            	}
		            break;
		            case "SABRE-L8YI": 
		            	 if(element.equals("SABRE-L8YI"))
			    	       {     
			    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

			    	System.out.println("No of SABRE-L8YI Transaction Hold:" + S_L8YI.size());
			    	
			    	 
			    	 String EG_TH_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
			    	 EG_TH_S_L8YI =Integer.parseInt(EG_TH_S_L8YI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_L8YI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_L8YI =Integer.parseInt(EG_TH_S_L8YI1);
	    	            	}
		            break;
		            case "SABRE-L9AI": 
		            	 if(element.equals("SABRE-L9AI"))
			    	       {     
			    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

			    	System.out.println("No of SABRE-L9AI Transaction Hold:" + S_L9AI.size());
			    	
			    	 
			    	 String EG_TH_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
			    	 EG_TH_S_L9AI =Integer.parseInt(EG_TH_S_L9AI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_L9AI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_L9AI =Integer.parseInt(EG_TH_S_L9AI1);
	    	            	}
		            break;
		            case "SABRE-L9CI": 
		            	 if(element.equals("SABRE-L9CI"))
			    	       {     
			    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

			    	System.out.println("No of SABRE-L9CI Transaction Hold:" + S_L9CI.size());
			    	
			    	 
			    	 String EG_TH_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
			    	 EG_TH_S_L9CI =Integer.parseInt(EG_TH_S_L9CI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_L9CI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_L9CI =Integer.parseInt(EG_TH_S_L9CI1);
	    	            	}
		            break;
		            case "SABRE-T13I": 
		            	 if(element.equals("SABRE-T13I"))
			    	       {     
			    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

			    	System.out.println("No of SABRE-T13I Transaction Hold:" + S_T13I.size());
			    	
			    	 
			    	 String EG_TH_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
			    	 EG_TH_S_T13I =Integer.parseInt(EG_TH_S_T13I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_T13I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_T13I =Integer.parseInt(EG_TH_S_T13I1);
	    	            	}
		            break;
		            case "SABRE-T20I": 
		            	 if(element.equals("SABRE-T20I"))
			    	       {     
			    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

			    	System.out.println("No of SABRE-T20I Transaction Hold:" + S_T20I.size());
			    	
			    	 
			    	 String EG_TH_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
			    	 EG_TH_S_T20I =Integer.parseInt(EG_TH_S_T20I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_T20I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_T20I =Integer.parseInt(EG_TH_S_T20I1);
	    	            	}
		            break;
		            case "SALAM": 
		            	 if(element.equals("SALAM"))
			    	       {     
			    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

			    	System.out.println("No of SALAM Transaction Hold:" + SALAM.size());
			    	
			    	 
			    	 String EG_TH_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
			    	 EG_TH_SALAM =Integer.parseInt(EG_TH_SALAM1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_SALAM1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_SALAM =Integer.parseInt(EG_TH_SALAM1);
	    	            	}
		            break;
		            case "SpiceJet": 
		            	 if(element.equals("SpiceJet"))
			    	       {     
			    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

			    	System.out.println("No of SpiceJet Transaction Hold:" + S_Jet.size());
			    	
			    	 
			    	 String EG_TH_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
			    	 EG_TH_S_Jet =Integer.parseInt(EG_TH_S_Jet1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_S_Jet1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_Jet =Integer.parseInt(EG_TH_S_Jet1);
	    	            	}
		            break;
		            case "UAPI-3R1G": 
		            	 if(element.equals("UAPI-3R1G"))
			    	       {     
			    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

			    	System.out.println("No of UAPI-3R1G Transaction Hold:" + U_3R1G.size());
			    	
			    	 
			    	 String EG_TH_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
			    	 EG_TH_U_3R1G =Integer.parseInt(EG_TH_U_3R1G1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_3R1G1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_3R1G =Integer.parseInt(EG_TH_U_3R1G1);
	    	            	}
		            break;
		            case "UAPI-570E": 
		            	 if(element.equals("UAPI-570E"))
			    	       {     
			    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

			    	System.out.println("No of UAPI-570E Transaction Hold:" + U_570E.size());
			    	
			    	 
			    	 String EG_TH_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
			    	 EG_TH_U_570E =Integer.parseInt(EG_TH_U_570E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_570E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_570E =Integer.parseInt(EG_TH_U_570E1);
	    	            	}
		            break;
		            case "UAPI-5N61": 
		            	 if(element.equals("UAPI-5N61"))
			    	       {     
			    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

			    	System.out.println("No of UAPI-5N61 Transaction Hold:" + U_5N61.size());
			    	
			    	 
			    	 String EG_TH_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
			    	 EG_TH_U_5N61 =Integer.parseInt(EG_TH_U_5N611);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_5N61 =Integer.parseInt(EG_TH_U_5N611);
	    	            	}
		            break;
		            case "UAPI-6E": 
		            	 if(element.equals("UAPI-6E"))
			    	       {     
			    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

			    	System.out.println("No of UAPI-6E Transaction Hold:" + U_6E.size());
			    	
			    	 
			    	 String EG_TH_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
			    	 EG_TH_U_6E =Integer.parseInt(EG_TH_U_6E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_6E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_6E =Integer.parseInt(EG_TH_U_6E1);
	    	            	}
		            break;
		            case "UAPI-7FK5": 
		            	 if(element.equals("UAPI-7FK5"))
			    	       {     
			    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

			    	System.out.println("No of UAPI-7FK5 Transaction Hold:" + U_7FK5.size());
			    	
			    	 
			    	 String EG_TH_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
			    	 EG_TH_U_7FK5 =Integer.parseInt(EG_TH_U_7FK51);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_7FK5 =Integer.parseInt(EG_TH_U_7FK51);
	    	            	}
		            break;
		            case "UAPI-7JY2": 
		            	 if(element.equals("UAPI-7JY2"))
			    	       {     
			    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

			    	System.out.println("No of UAPI-7JY2 Transaction Hold:" + U_7JY2.size());
			    	
			    	 
			    	 String EG_TH_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
			    	 EG_TH_U_7JY2 =Integer.parseInt(EG_TH_U_7JY21);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_7JY2 =Integer.parseInt(EG_TH_U_7JY21);
	    	            	}
		            break;
		            case "UAPI-802N": 
		            	 if(element.equals("UAPI-802N"))
			    	       {     
			    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

			    	System.out.println("No of UAPI-802N Transaction Hold:" + U_802N.size());
			    	
			    	 
			    	 String EG_TH_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
			    	 EG_TH_U_802N =Integer.parseInt(EG_TH_U_802N1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_802N1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_802N =Integer.parseInt(EG_TH_U_802N1);
	    	            	}
		            break;
		            case "UAPI-802R": 
		            	 if(element.equals("UAPI-802R"))
			    	       {     
			    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

			    	System.out.println("No of UAPI-802R Transaction Hold:" + U_802R.size());
			    	
			    	 
			    	 String EG_TH_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
			    	 EG_TH_U_802R =Integer.parseInt(EG_TH_U_802R1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_802R1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_802R =Integer.parseInt(EG_TH_U_802R1);
	    	            	}
		            break;
		            case "UAPI-8SQ7": 
		            	 if(element.equals("UAPI-8SQ7"))
			    	       {     
			    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

			    	System.out.println("No of UAPI-8SQ7 Transaction Hold:" + U_8SQ7.size());
			    	
			    	 
			    	 String EG_TH_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
			    	 EG_TH_U_8SQ7 =Integer.parseInt(EG_TH_U_8SQ71);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_U_8SQ71 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_U_8SQ7 =Integer.parseInt(EG_TH_U_8SQ71);
	    	            	}
		            break;
		            case "WATANIYA": 
		            	 if(element.equals("WATANIYA"))
			    	       {     
			    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

			    	System.out.println("No of WATANIYA Transaction Hold:" + WATANIYA.size());
			    	
			    	 
			    	 String EG_TH_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
			    	 EG_TH_WATANIYA =Integer.parseInt(EG_TH_WATANIYA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_WATANIYA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_WATANIYA =Integer.parseInt(EG_TH_WATANIYA1);
	    	            	}
		            break;
		            case "Air Arabia": 
		            	 if(element.equals("Air Arabia"))
			    	       {     
			    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

			    	System.out.println("No of Air Arabia Transaction Hold:" + A_AR.size());
			    	
			    	 
			    	 String EG_TH_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
			    	 EG_TH_A_AR =Integer.parseInt(EG_TH_A_AR1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_A_AR1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_A_AR =Integer.parseInt(EG_TH_A_AR1);
	    	            	}
		            break;
		            case "Air Arabia Egypt": 
		            	 if(element.equals("Air Arabia Egypt"))
			    	       {     
			    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

			    	System.out.println("No of Air Arabia Egypt Transaction Hold:" + A_AR_E.size());
			    	
			    	 
			    	 String EG_TH_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
			    	 EG_TH_A_AR_E =Integer.parseInt(EG_TH_A_AR_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_A_AR_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_A_AR_E =Integer.parseInt(EG_TH_A_AR_E1);
	    	            	}
		            break;
		            case "Air Arabia Moroc": 
		            	 if(element.equals("Air Arabia Moroc"))
			    	       {     
			    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

			    	System.out.println("No of Air Arabia Moroc Transaction Hold:" + A_AR_M.size());
			    	
			    	 
			    	 String EG_TH_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
			    	 EG_TH_A_AR_M =Integer.parseInt(EG_TH_A_AR_M1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_A_AR_M1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_A_AR_M =Integer.parseInt(EG_TH_A_AR_M1);
	    	            	}
		            break;
		            case "AirIndiaExpress": 
		            	 if(element.equals("AirIndiaExpress"))
			    	       {     
			    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

			    	System.out.println("No of AirIndiaExpress Transaction Hold:" + A_I_E.size());
			    	
			    	 
			    	 String EG_TH_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
			    	 EG_TH_A_I_E =Integer.parseInt(EG_TH_A_I_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_A_I_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_A_I_E =Integer.parseInt(EG_TH_A_I_E1);
	    	            	}
		            break;
		            case "FlyDubai": 
		            	 if(element.equals("FlyDubai"))
			    	       {     
			    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

			    	System.out.println("No of FlyDubai Transaction Hold:" + FlyDubai.size());
			    	
			    	 
			    	 String EG_TH_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
			    	 EG_TH_FlyDubai =Integer.parseInt(EG_TH_FlyDubai1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_FlyDubai1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_FlyDubai =Integer.parseInt(EG_TH_FlyDubai1);
	    	            	}
		            break;
		            case "Flynas": 
		            	 if(element.equals("Flynas"))
			    	       {     
			    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

			    	System.out.println("No of Flynas Transaction Hold:" + Flynas.size());
			    	
			    	 
			    	 String EG_TH_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
			    	 EG_TH_Flynas =Integer.parseInt(EG_TH_Flynas1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_Flynas1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_Flynas =Integer.parseInt(EG_TH_Flynas1);
	    	            	}
		            	 
		            	 break;
		            case "FLYADEAL": 
		            	 if(element.equals("FLYADEAL"))
			    	       {     
			    	List<WebElement> Flyadeal=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FLYADEAL ']"));

			    	System.out.println("No of FLYADEAL Transaction Hold:" + Flyadeal.size());
			    	
			    	 
			    	 String EG_TH_Flyadeal1 =String.format("%1s",Flyadeal.size());   		    	
		    		    
			    	 EG_TH_Flyadeal =Integer.parseInt(EG_TH_Flyadeal1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_Flyadeal1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_Flyadeal =Integer.parseInt(EG_TH_Flyadeal1);
	    	            	}
		            break;
		            case "GAL-7Q0W": 
		            	 if(element.equals("GAL-7Q0W"))
			    	       {     
			    	List<WebElement> GAL_7Q=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' GAL-7Q0W ']"));

			    	System.out.println("No of GAL-7Q0W Transaction Hold:" + GAL_7Q.size());
			    	
			    	 
			    	 String EG_TH_GAL701 =String.format("%1s",GAL_7Q.size());   		    	
		    		    
			    	 EG_TH_GAL7Q =Integer.parseInt(EG_TH_GAL701);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_GAL701 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_GAL7Q =Integer.parseInt(EG_TH_GAL701);
	    	            	}
		            break;
		            case "SABRE-1LNJ": 
		            	 if(element.equals("SABRE-1LNJ"))
			    	       {     
			    	List<WebElement> S_1LNJ=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-1LNJ ']"));

			    	System.out.println("No of SABRE-1LNJ Transaction Hold:" + S_1LNJ.size());
			    	
			    	 
			    	 String EG_TH_1LNJ =String.format("%1s",S_1LNJ.size());   		    	
		    		    
			    	 EG_TH_S_1LNJ =Integer.parseInt(EG_TH_1LNJ );
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TH_1LNJ  =String.format("%1s",0);   		    	
				    		    
		            		 EG_TH_S_1LNJ =Integer.parseInt(EG_TH_1LNJ );
	    	            	}
		            break;
		            default:System.out.println("Not in 10, 20 or 30");  
		         
		            }
		           }
		        }
		  
	        
	        int TotalValue = EG_TH_G_3R1+EG_TH_G_570E+EG_TH_G_5N61+EG_TH_G_7FK5+EG_TH_G_7JY2+EG_TH_G_7X7W+EG_TH_G_802N+EG_TH_G_802R
	        		+EG_TH_G_8SQ7+EG_TH_JAZEERA+EG_TH_KIWI+EG_TH_M_u+EG_TH_My_Fly+EG_TH_NESMA+EG_TH_PEGASUS+EG_TH_S_9JFH+EG_TH_S_ID2I
	        		+EG_TH_S_L8YI+EG_TH_S_L9AI+EG_TH_S_L9CI+EG_TH_S_T13I+EG_TH_S_T20I+EG_TH_SALAM+EG_TH_S_Jet+EG_TH_U_3R1G+EG_TH_U_570E
	        		+EG_TH_U_5N61+EG_TH_U_6E+EG_TH_U_7FK5+EG_TH_U_7JY2+EG_TH_U_802N+EG_TH_U_802R+EG_TH_U_8SQ7+EG_TH_WATANIYA+EG_TH_A_AR
	        		+EG_TH_A_AR_E+EG_TH_A_AR_M+EG_TH_A_I_E+EG_TH_FlyDubai+EG_TH_Flynas+EG_TH_Flyadeal+EG_TH_GAL7Q+EG_TH_G_3K6+EG_TH_S_1LNJ;
			  
	        EG_TH_Supplier_Transaction_Hold_Total = TotalValue; 
			 System.out.println("Supplier Transaction Hold total:::----"+EG_TH_Supplier_Transaction_Hold_Total);
			
			
	    
	   
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
