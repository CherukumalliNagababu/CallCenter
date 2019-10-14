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
import utility.ExcelUtils;

public class ConfirmationPending {
public static void Confimation_Com(int iTestCaseRow,WebDriver driver) throws Exception {
	driver.get("http://callcenter.rehlat.com/");
	Thread.sleep(1000);
	String domain_name="COM";
	Login.LoginCallCenter(iTestCaseRow);
	Thread.sleep(1000);
	
	WebElement checkbox = driver.findElement(By.id("DisablePagination"));
	
	if (!checkbox.isSelected())
		checkbox.click();
	else
	{
		System.out.println("Already Check Box is selected");
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
	 Calendar cal2 = Calendar.getInstance();
  	   DateFormat dateFormat2 = new SimpleDateFormat("d-M-yyyy");
  	   
  	 cal2.add(Calendar.DATE, -2);
  	   System.out.println("Yesterday's date was "+dateFormat2.format(cal2.getTime()));  
  	  String st2=dateFormat2.format(cal2.getTime());
  	   String[] spliteddate2 = st2.split("-");
  	   System.out.println("Split the Date::"+spliteddate2[0]);
  	 
  	 Calendar cal = Calendar.getInstance();
  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
  	   
  	   cal.add(Calendar.DATE, -1);
  	   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));  
  	  String st=dateFormat.format(cal.getTime());
  	   String[] spliteddate = st.split("-");
  	   System.out.println("Split the Date::"+spliteddate[0]);
	
	
	Loginpage.Select_dateFrom(spliteddate2[0]);
	Thread.sleep(1000);
	Loginpage.ToDate().click();
	Thread.sleep(1000);
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	Loginpage.Select_dateTo(spliteddate[0]);
	Thread.sleep(1000);
	
	
	
	//confirmation Pending 
	
	Select re=new Select(Loginpage.BookingSatus());
	re.selectByIndex(4);
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
	
	
	if("Flight Search Results : 0".equals(Rcount))
	{
		System.out.println("Repricing Count = 0");
      
	}
	else
	{
		ExcelUtils.lable(1, 0,"Booking Id");
		ExcelUtils.lable(2, 0,"Trip Type");
		ExcelUtils.lable(3, 0,"Pax Name");
		ExcelUtils.lable(4, 0,"Status");
		ExcelUtils.lable(5, 0,"Payment Status");
		ExcelUtils.lable(6, 0,"Supplier ");
		ExcelUtils.lable(7, 0,"PNR");
		ExcelUtils.lable(8, 0,"Booking Date");
		ExcelUtils.lable(9, 0,"Amount");
		ExcelUtils.lable(10,0,"Client");
	
		List<WebElement> tr_collection=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr"));
		System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		List<WebElement> td_collection1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td"));
		System.out.println("NUMBER OF Columns IN THIS TABLE = "+td_collection1.size()/tr_collection.size());
		ExcelUtils.lable(22, 22, "naga");
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
	    }
	}
}
}
