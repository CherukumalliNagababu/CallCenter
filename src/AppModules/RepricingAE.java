package AppModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Loginpage;

public class RepricingAE {
	
public static void Repricing_AE(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		
		//Loginpage.AE_link().click();
driver.get("http://callcenter.rehlat.ae/");
		Thread.sleep(1000);
		String domain_name="AE";
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
		Calendar calAE2 = Calendar.getInstance();
	  	   DateFormat AEdateFormat2 = new SimpleDateFormat("d-M-yyyy");
	  	   
	  	 calAE2.add(Calendar.DATE, -2);
	  	   System.out.println("Yesterday's date was "+AEdateFormat2.format(calAE2.getTime()));  
	  	  String AEst2=AEdateFormat2.format(calAE2.getTime());
	  	   String[] AEspliteddate2 = AEst2.split("-");
	  	   System.out.println("Split the Date::"+AEspliteddate2[0]);
	  	   
	  	 Calendar calAE = Calendar.getInstance();
	  	   DateFormat AEdateFormat = new SimpleDateFormat("d-M-yyyy");
	  	   
	  	 
	  	 calAE.add(Calendar.DATE, -1);
	  	   System.out.println("Yesterday's date was "+AEdateFormat.format(calAE.getTime()));  
	  	  String AEst=AEdateFormat.format(calAE.getTime());
	  	   String[] AEspliteddate = AEst.split("-");
	  	   System.out.println("Split the Date::"+AEspliteddate[0]);


		
		Loginpage.Select_dateFrom(AEspliteddate2[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateTo(AEspliteddate[0]);
		Thread.sleep(1000);
		
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
    		System.out.println("Repricing Count = 0");
    		
    		
    		
    		
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		  
    		 
    		  
    		  System.out.println("Total Number of Repricing:" + WE1.size());
    		  RepricingMail.sendMail(iTestCaseRow, driver,domain_name);
    		  Thread.sleep(2000);
    	}
}

}
