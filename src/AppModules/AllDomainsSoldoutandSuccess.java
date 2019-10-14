package AppModules;

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

public class AllDomainsSoldoutandSuccess {
	
	static String comNum;
	static String AeNum;
	static String SANum;
	static String EGNum;
	static String comTransactioncount;
	static String AETransactioncount;
	static String SATransactioncount;
	static String EGTransactioncount;
	
		public static void Soldouts(int iTestCaseRow,WebDriver driver) throws Exception {
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
	    	
	    	if("Flight Search Results : 0".equals(count))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		 comNum="Number of Sold Outs for "+urldomain1[0]+" Domain :"+splited[1];
	    		
	    		 
	          
	    	}
	    	else
	    	{
	    	
	    	//it's export the Header Values
	    	/*ExcelUtils.lable(1, 0,"Booking Id");
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
*/	    	
	    	
		/*	List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
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
	        }*/
	        
	         comNum="Number of Sold Outs for "+urldomain1[0]+" Domain :"+splited[1];
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	//Transaction Successful for COM
	    	
	    	Select transaction1=new Select(Loginpage.BookingSatus());
	    	transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			//ExcelUtils.lable(0, 0,comTrancount);
			
	    	String comtranstr = comTrancount.trim();
	    	String[] comtransplited = comtranstr.split("\\:");
	    	System.out.println("No of Results Count"+comtransplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(comTrancount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		 comTransactioncount="Number of Transaction Successful for "+urldomain1[0]+" Domain :"+comtransplited[1];
	    		
	    		 
	          
	    	}
	    	else
	    	{
	    	
	    	//it's export the Header Values
	    	/*ExcelUtils.lable(1, 0,"Booking Id");
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
*/	    	
	    	
			/*List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
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
	        }*/
	        
	        comTransactioncount="Number of Transaction Successful for "+urldomain1[0]+" Domain :"+comtransplited[1];
	        
	      
	    	}
	    	
	    	//---------------------------------
			

	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	Loginpage.AE_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	
	    	Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl1=driver.getCurrentUrl();
			String[] urldomainAE = CurrentUrl1.split("\\//");
	    	System.out.println("Current Url"+urldomainAE[1]);
	    	String[] urldomainAE1 = urldomainAE[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomainAE1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat dateFormatAE = new SimpleDateFormat("d-M-yyyy ");
			Date dateAE = new Date();
			System.out.println(dateFormatAE.format(dateAE));
			String AEdate=dateFormatAE.format(date);
			String[] splitedAEdate = AEdate.split("-");
	    	System.out.println("Split the Date::"+splitedAEdate[0]);
	    	
	    	
			Loginpage.Select_dateFrom(splitedAEdate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(splitedAEdate[0]);
			Thread.sleep(1000);
			
			Select s1=new Select(Loginpage.BookingSatus());
			s1.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String AEcount=Loginpage.FlightResults_text().getText();
			System.out.println(AEcount);
			//ExcelUtils.lable(0, 0,AEcount);
			
	    	String AEstr = AEcount.trim();
	    	String[] AEsplited = AEstr.split("\\:");
	    	System.out.println("No of Results Count"+AEsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(AEcount))
	    	{
	    		
	    		  AeNum="Number of Sold Outs for "+urldomainAE1[0]+" Domain :"+AEsplited[1];
	    		
	    		 
	           
	    	}
	    	else
	    	{
	    	
	    	
	    	
			
	        
	         AeNum="Number of Sold Outs for "+urldomainAE1[0]+" Domain :"+AEsplited[1];
	        
	       
	    	}
	    	Thread.sleep(2000);
	    	
         //Transaction Successful for AE
	    	
	    	Select transaction2=new Select(Loginpage.BookingSatus());
	    	transaction2.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String AeTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(AeTrancount);
			//ExcelUtils.lable(0, 0,comTrancount);
			
	    	String Aetranstr = AeTrancount.trim();
	    	String[] Aetransplited = Aetranstr.split("\\:");
	    	System.out.println("No of Results Count"+Aetransplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(AeTrancount))
	    	{
	    		
	    		
	    		 AETransactioncount="Number of Transaction Successful for "+urldomainAE1[0]+" Domain :"+Aetransplited[1];
	    		
	    		 
	          
	    	}
	    	else
	    	{
	    
  	
	    	
	        AETransactioncount="Number of Transaction Successful for "+urldomainAE1[0]+" Domain :"+Aetransplited[1];
	      
	    	}
	    	
	    	//---------------------------------
	    	Thread.sleep(1000);
	    	
	    	
	    	
	    	
	    	//SA
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	Loginpage.SA_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	
	    	Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String SACurrentUrl=driver.getCurrentUrl();
			String[] urldomainSA = SACurrentUrl.split("\\//");
	    	System.out.println("Current Url"+urldomainSA[1]);
	    	String[] urldomainSA1 = urldomainSA[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomainSA1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat dateFormatSA = new SimpleDateFormat("d-M-yyyy ");
			Date dateSA = new Date();
			System.out.println(dateFormatSA.format(dateSA));
			String Sadate=dateFormatAE.format(dateSA);
			String[] splitedSAdate = Sadate.split("-");
	    	System.out.println("Split the Date::"+splitedSAdate[0]);
	    	
	    	
			Loginpage.Select_dateFrom(splitedSAdate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(splitedSAdate[0]);
			Thread.sleep(1000);
			
			Select s2=new Select(Loginpage.BookingSatus());
			s2.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String Sacount=Loginpage.FlightResults_text().getText();
			System.out.println(Sacount);
			//ExcelUtils.lable(0, 0,Sacount);
			
	    	String Sastr = Sacount.trim();
	    	String[] Sasplited = Sastr.split("\\:");
	    	System.out.println("No of Results Count"+Sasplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(Sacount))
	    	{
	    		
	    		  SANum="Number of Sold Outs for "+urldomainSA1[0]+" Domain :"+Sasplited[1];
	    		
	    		 
	           
	    	}
	    	else
	    	{
	    	
	    	
	    	
	    	
			
	        
	        SANum="Number of Sold Outs for "+urldomainSA1[0]+" Domain :"+Sasplited[1];
	        
	       
	    	}
	    	
	    	
      //Transaction Successful for SA
	    	
	    	Select transaction3=new Select(Loginpage.BookingSatus());
	    	transaction3.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String SaTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(SaTrancount);
			//ExcelUtils.lable(0, 0,comTrancount);
			
	    	String Satranstr = SaTrancount.trim();
	    	String[] Satransplited = Satranstr.split("\\:");
	    	System.out.println("No of Results Count"+Satransplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(SaTrancount))
	    	{
	    		
	    		
	    		 SATransactioncount="Number of Transaction Successful for "+urldomainSA1[0]+" Domain :"+Satransplited[1];
	    		
	    		 
	          
	    	}
	    	else
	    	{
	    
  	
	    	
			
	        SATransactioncount="Number of Transaction Successful for "+urldomainSA1[0]+" Domain :"+Satransplited[1];
	      
	    	}
	    	
	    	//---------------------------------
	    	
	    	//EG
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	Loginpage.EG_link().click();
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	
	    	Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String EGCurrentUrl=driver.getCurrentUrl();
			String[] urldomainEG = EGCurrentUrl.split("\\//");
	    	System.out.println("Current Url"+urldomainEG[1]);
	    	String[] urldomainEG1 = urldomainEG[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomainEG1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	DateFormat dateFormatEG = new SimpleDateFormat("d-M-yyyy ");
			Date dateEG = new Date();
			System.out.println(dateFormatEG.format(dateEG));
			String EGdate=dateFormatEG.format(dateEG);
			String[] splitedEGdate = EGdate.split("-");
	    	System.out.println("Split the Date::"+splitedEGdate[0]);
	    	
	    	
			Loginpage.Select_dateFrom(splitedEGdate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(splitedEGdate[0]);
			Thread.sleep(1000);
			
			Select s3=new Select(Loginpage.BookingSatus());
			s3.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String EGcount=Loginpage.FlightResults_text().getText();
			System.out.println(EGcount);
			//ExcelUtils.lable(0, 0,EGcount);
			
	    	String EGstr = EGcount.trim();
	    	String[] EGsplited = EGstr.split("\\:");
	    	System.out.println("No of Results Count"+EGsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(EGcount))
	    	{
	    	
	    		  EGNum="Number of Sold Outs for "+urldomainEG1[0]+" Domain :"+EGsplited[1];
	    		
	    		 
	           
	    	}
	    	else
	    	{
	    	
	    	
	    	
	    	
			
	        
	        EGNum="Number of Sold Outs for "+urldomainEG1[0]+" Domain :"+EGsplited[1];
	        
	       
	    	}
	    	Thread.sleep(2000);
        //Transaction Successful for EG
	    	
	    	Select transaction4=new Select(Loginpage.BookingSatus());
	    	transaction4.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			String EgTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(EgTrancount);
			//ExcelUtils.lable(0, 0,comTrancount);
			
	    	String Egtranstr = EgTrancount.trim();
	    	String[] Egtransplited = Egtranstr.split("\\:");
	    	System.out.println("No of Results Count"+Egtransplited[1]);
	    	Thread.sleep(1000);
	    	
	    	if("Flight Search Results : 0".equals(EgTrancount))
	    	{
	    		
	    		
	    		 EGTransactioncount="Number of Transaction Successful for "+urldomainEG1[0]+" Domain :"+Egtransplited[1];
	    		
	    		 
	          
	    	}
	    	else
	    	{
	    
  	
	    	
			
	        
	        EGTransactioncount="Number of Transaction Successful for "+urldomainEG1[0]+" Domain :"+Egtransplited[1];
	      
	    	}
	    	
	    	//---------------------------------
	    	
	    	
	    	//Total count of Transaction Successful
	    	Double TotalValue = Double.parseDouble(splited[1]) + Double.parseDouble(AEsplited[1]) + Double.parseDouble(Sasplited[1])+ Double.parseDouble(EGsplited[1]);
			Double SoldOuttotal = new Double(TotalValue); 
			System.out.println("SoldOuts total:::----"+SoldOuttotal);
			//Total count of Sold Outs
	    	Double TotalValue1 = Double.parseDouble(comtransplited[1]) + Double.parseDouble(Aetransplited[1]) + Double.parseDouble(Satransplited[1])+ Double.parseDouble(Egtransplited[1]);
			Double TransactionTotal = new Double(TotalValue1); 
			System.out.println("Transaction Total:::----"+TransactionTotal);
	    	
	    	
	    	
	    	
	    	
	    	System.out.println("Started");
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			System.out.println("1");
			email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
			email.setSSLOnConnect(true);
			email.setFrom("naga123.ch@gmail.com");
			//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
			email.setSubject(Utils.timestamp()+" - Automated Reports of Sold Outs and Transaction Successful Bookings from CallCenter ");
			System.out.println("2");
			
			/*email.setMsg("SOLD OUTS----"+"\n"+"\n"+comNum +"\n"+"\n"+ AeNum +"\n"+"\n"+ SANum +"\n"+"\n"+EGNum+"\n"+"\n"+"\n"+
					
					"TRANSACTION SUCCESSFUL----"+"\n"+"\n"+comTransactioncount +"\n"+"\n"+ AETransactioncount +"\n"+"\n"+ SATransactioncount +"\n"+"\n"+EGTransactioncount);*/
			
email.setMsg("SOLD OUTS:--"+"\n"+"\n"+comNum +"\n"+"\n"+ AeNum +"\n"+"\n"+ SANum +"\n"+"\n"+EGNum+"\n"+"\n"+"------------------------------------------------------------------------------------------------------------------"+"\n"+"\n"+ " TOTAL                                                                                  = "+SoldOuttotal+"\n"+"------------------------------------------------------------------------------------------------------------------" +"\n"+"\n"+"\n"+
					
					"TRANSACTION SUCCESSFUL:--"+"\n"+"\n"+comTransactioncount +"\n"+"\n"+ AETransactioncount +"\n"+"\n"+ SATransactioncount +"\n"+"\n"+EGTransactioncount+"\n"+"\n"+"------------------------------------------------------------------------------------------------------------------"+"\n"+"\n"+ " TOTAL                                                                                             = "+TransactionTotal+"\n"+"------------------------------------------------------------------------------------------------------------------" );
			
			email.addTo("Sreenivas.bodige@rehlat.com");
			email.addTo("tariqraza@rehlat.com");
			email.addTo("rajendra.purohit@rehlat.com ");
			email.addTo("brteam@rehlat.com");
			
			
          //email.addTo("naga.ch199@gmail.com");
			
			System.out.println("3");
			email.send();
			System.out.println("END");
	    	
		}
		
		
		
		
}
