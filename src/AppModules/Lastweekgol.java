package AppModules;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Loginpage;

public class Lastweekgol {
	
	static String Com_TS_LW_count;
	static String Com_TS_count;
	static String Com_TS_count_total;
	static String Com_print;
	
	static String AE_TS_LW_count;
	static String AE_TS_count;
	static String AE_TS_count_total;
	static String AE_print;
	
	static String SA_TS_LW_count;
	static String SA_TS_count;
	static String SA_TS_count_total;
	static String SA_print;
	
	static String EG_TS_LW_count;
	static String EG_TS_count;
	static String EG_TS_count_total;
	static String EG_print;
	
	public static void Transaction_success_Com(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		
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
    	 Calendar cal = Calendar.getInstance();
	  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
	  	 
	  	   cal.add(Calendar.DATE, -7);
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
          double result = Double.parseDouble(comtransplited[1]);
    		
    		//Com_TS_LW_count =result;
    		//Convert double to string
    		Com_TS_LW_count=String.format("%.0f", result);
    		
    		System.out.println("Com_TS_LW_count::"+Com_TS_LW_count);
    	}
    	
    	
    	else
    	{
    		
    		double result = Double.parseDouble(comtransplited[1]);
    		
    		//Com_TS_LW_count =result;
    		//Convert double to string
    		Com_TS_LW_count=String.format("%.0f", result);
    		
    		System.out.println("Com_TS_LW_count::"+Com_TS_LW_count);
    	}
    	
    	
    	Thread.sleep(3000);
    	
  	Loginpage.FromDate().click();
		Thread.sleep(1000);
		
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		  DateFormat dateFormatcom = new SimpleDateFormat("d-M-yyyy");
		Date date = new Date();
		System.out.println(dateFormatcom.format(date));
		String stcom=dateFormatcom.format(date);
		String[] spliteddatecom = stcom.split("-");
    	System.out.println("Split the Date::"+spliteddatecom[0]);
    	
    	
		Loginpage.Select_dateFrom(spliteddatecom[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateTo_ActiveDate(spliteddatecom[0]);
		Thread.sleep(1000);
		
		//******************* Transaction Successfull*********************************************
    	Select transactioncom=new Select(Loginpage.BookingSatus());
    	transactioncom.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		String Trancount=Loginpage.FlightResults_text().getText();
		System.out.println(Trancount);
		
		
    	String transtr = Trancount.trim();
    	String[] transplited = transtr.split("\\:");
    	System.out.println("No of Results Count"+transplited[1]);
    	Thread.sleep(1000);
    	String tran1="Transaction Successful";
    	
    	if("Flight Search Results : 0".equals(Trancount))
    	{

    		double result1 = Double.parseDouble(transplited[1]);
    		
    		//Com_TS_count =result1;
    		//Convert double to string
    		Com_TS_count=String.format("%.0f", result1);
    		
    		System.out.println("Com_TS_count::"+Com_TS_count);
    	}
    	else
    	{
    		
    		double result1 = Double.parseDouble(transplited[1]);
    		
    		//Com_TS_count =result1;
    		//Convert double to string
    		Com_TS_count=String.format("%.0f", result1);
    		
    		System.out.println("Com_TS_count::"+Com_TS_count);
    	}
    	
    	
    	
    	System.out.println(Com_TS_count +"/"+ Com_TS_LW_count);
    	 Com_print=Com_TS_count +"/"+ Com_TS_LW_count +"*"+100;
    	System.out.println("Com_print::"+Com_print);
    	
    	//convert String to double
    	double number = Double.parseDouble(Com_TS_count);
    	double number1 = Double.parseDouble(Com_TS_LW_count);
    	
    	double Com_TS_count_total1 =number / number1 * 100;
    	 //Convert double to string
    	
    	DecimalFormat df = new DecimalFormat("#.##"); 
		 Com_TS_count_total = df.format(Com_TS_count_total1); 
    	
    	 //Com_TS_count_total=String.format("%.0f", Com_TS_count_total1);
    	 
         System.out.println("total value"+ Com_TS_count_total);
         
	
         
         Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
         
        

	}
	
	
public static void Transaction_success_AE(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		
		Loginpage.AE_link().click();
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
    	 Calendar cal = Calendar.getInstance();
	  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
	  	 
	  	   cal.add(Calendar.DATE, -7);
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
    		double result = Double.parseDouble(comtransplited[1]);
    		//AE_TS_LW_count =result;
    		AE_TS_LW_count=String.format("%.0f", result);
    		
    		
    		System.out.println("AE_TS_LW_count::"+AE_TS_LW_count);
    	}
    	
    	
    	else
    	{
    		
    		double result = Double.parseDouble(comtransplited[1]);
    		//AE_TS_LW_count =result;
    		AE_TS_LW_count=String.format("%.0f", result);
    		
    		
    		System.out.println("AE_TS_LW_count::"+AE_TS_LW_count);
    	}
    	
    	
    	Thread.sleep(3000);
    	
  	Loginpage.FromDate().click();
		Thread.sleep(1000);
		
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		  DateFormat dateFormatcom = new SimpleDateFormat("d-M-yyyy");
		Date date = new Date();
		System.out.println(dateFormatcom.format(date));
		String stcom=dateFormatcom.format(date);
		String[] spliteddatecom = stcom.split("-");
    	System.out.println("Split the Date::"+spliteddatecom[0]);
    	
    	
		Loginpage.Select_dateFrom(spliteddatecom[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		//Loginpage.Month_back().click();
		//Thread.sleep(1000);
		Loginpage.Select_dateTo_ActiveDate(spliteddatecom[0]);
		Thread.sleep(1000);
		
		//******************* Transaction Successfull*********************************************
    	Select transactioncom=new Select(Loginpage.BookingSatus());
    	transactioncom.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		String Trancount=Loginpage.FlightResults_text().getText();
		System.out.println(Trancount);
		
		
    	String transtr = Trancount.trim();
    	String[] transplited = transtr.split("\\:");
    	System.out.println("No of Results Count"+transplited[1]);
    	Thread.sleep(1000);
    	String tran1="Transaction Successful";
    	
    	if("Flight Search Results : 0".equals(Trancount))
    	{
            double result1 = Double.parseDouble(transplited[1]);
    		
    		//AE_TS_count =result1;
    		AE_TS_count=String.format("%.0f", result1);
    		System.out.println("AE_TS_count::"+AE_TS_count);
    	}
    	else
    	{
    		
    		double result1 = Double.parseDouble(transplited[1]);
    		
    		//AE_TS_count =result1;
    		AE_TS_count=String.format("%.0f", result1);
    		System.out.println("AE_TS_count::"+AE_TS_count);
    	}
    	
    	
    	
    	System.out.println(AE_TS_count +"/"+ AE_TS_LW_count);
    	AE_print=AE_TS_count +"/"+ AE_TS_LW_count +"*"+100;
    	System.out.println("AE_print::"+AE_print);
    	//convert String to double
    	double number = Double.parseDouble(AE_TS_count);
    	double number1 = Double.parseDouble(AE_TS_LW_count);
    	
    	double AE_TS_count_total1 =number / number1 * 100;
    	 //Convert double to string
    	DecimalFormat df = new DecimalFormat("#.##"); 
    	AE_TS_count_total = df.format(AE_TS_count_total1); 
    	
    	//AE_TS_count_total=String.format("%.0f", AE_TS_count_total1);
    	 
    	
    	
         System.out.println("total value"+ AE_TS_count_total);
         
	
         Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);

	}

public static void Transaction_success_SA(int iTestCaseRow,WebDriver driver) throws Exception {
	
	
	
	Loginpage.SA_link().click();
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
	 Calendar cal = Calendar.getInstance();
  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
  	 
  	   cal.add(Calendar.DATE, -7);
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
		double result = Double.parseDouble(comtransplited[1]);
		//SA_TS_LW_count =result;
		SA_TS_LW_count=String.format("%.0f", result);
		System.out.println("SA_TS_LW_count::"+SA_TS_LW_count);
	}
	
	
	else
	{
		
		double result = Double.parseDouble(comtransplited[1]);
		//SA_TS_LW_count =result;
		SA_TS_LW_count=String.format("%.0f", result);
		System.out.println("SA_TS_LW_count::"+SA_TS_LW_count);
	}
	
	
	Thread.sleep(3000);
	
	Loginpage.FromDate().click();
	Thread.sleep(1000);
	
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	  DateFormat dateFormatcom = new SimpleDateFormat("d-M-yyyy");
	Date date = new Date();
	System.out.println(dateFormatcom.format(date));
	String stcom=dateFormatcom.format(date);
	String[] spliteddatecom = stcom.split("-");
	System.out.println("Split the Date::"+spliteddatecom[0]);
	
	
	Loginpage.Select_dateFrom(spliteddatecom[0]);
	Thread.sleep(1000);
	Loginpage.ToDate().click();
	Thread.sleep(1000);
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	Loginpage.Select_dateTo_ActiveDate(spliteddatecom[0]);
	Thread.sleep(1000);
	
	//******************* Transaction Successfull*********************************************
	Select transactioncom=new Select(Loginpage.BookingSatus());
	transactioncom.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	String Trancount=Loginpage.FlightResults_text().getText();
	System.out.println(Trancount);
	
	
	String transtr = Trancount.trim();
	String[] transplited = transtr.split("\\:");
	System.out.println("No of Results Count"+transplited[1]);
	Thread.sleep(1000);
	String tran1="Transaction Successful";
	
	if("Flight Search Results : 0".equals(Trancount))
	{
       double result1 = Double.parseDouble(transplited[1]);
		
		//SA_TS_count =result1;
		SA_TS_count=String.format("%.0f", result1);
		System.out.println("SA_TS_count::"+SA_TS_count);
	}
	else
	{
		
		double result1 = Double.parseDouble(transplited[1]);
		
		//SA_TS_count =result1;
		SA_TS_count=String.format("%.0f", result1);
		System.out.println("SA_TS_count::"+SA_TS_count);
	}
	
	
	
	System.out.println(SA_TS_count +"/"+ SA_TS_LW_count);
	SA_print=SA_TS_count +"/"+ SA_TS_LW_count +"*"+100;
	System.out.println("SA_print::"+SA_print);
	
	//convert String to double
	double number = Double.parseDouble(SA_TS_count);
	double number1 = Double.parseDouble(SA_TS_LW_count);
	
	double SA_TS_count_total1 =number / number1 * 100;
	 //Convert double to string
	
	DecimalFormat df = new DecimalFormat("#.##"); 
	SA_TS_count_total = df.format(SA_TS_count_total1); 

	//SA_TS_count_total=String.format("%.0f", SA_TS_count_total1);
	 
	
	
     System.out.println("total value"+ SA_TS_count_total);
     

     Loginpage.ClickOnUsername().click();
    	Thread.sleep(1000);
    	Loginpage.Log_Out().click();
    	Thread.sleep(2000);

}


public static void Transaction_success_EG(int iTestCaseRow,WebDriver driver) throws Exception {
	
	
	
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
	 Calendar cal = Calendar.getInstance();
  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
  	 
  	   cal.add(Calendar.DATE, -7);
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
		double result = Double.parseDouble(comtransplited[1]);
		//EG_TS_LW_count =result;
		EG_TS_LW_count=String.format("%.0f", result);
		System.out.println("EG_TS_LW_count::"+EG_TS_LW_count);
	}
	
	
	else
	{
		
		double result = Double.parseDouble(comtransplited[1]);
		//EG_TS_LW_count =result;
		EG_TS_LW_count=String.format("%.0f", result);
		System.out.println("EG_TS_LW_count::"+EG_TS_LW_count);
	}
	
	
	Thread.sleep(3000);
	
	Loginpage.FromDate().click();
	Thread.sleep(1000);
	
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	  DateFormat dateFormatcom = new SimpleDateFormat("d-M-yyyy");
	Date date = new Date();
	System.out.println(dateFormatcom.format(date));
	String stcom=dateFormatcom.format(date);
	String[] spliteddatecom = stcom.split("-");
	System.out.println("Split the Date::"+spliteddatecom[0]);
	
	
	Loginpage.Select_dateFrom(spliteddatecom[0]);
	Thread.sleep(1000);
	Loginpage.ToDate().click();
	Thread.sleep(1000);
	//Loginpage.Month_back().click();
	//Thread.sleep(1000);
	Loginpage.Select_dateTo_ActiveDate(spliteddatecom[0]);
	Thread.sleep(1000);
	
	//******************* Transaction Successfull*********************************************
	Select transactioncom=new Select(Loginpage.BookingSatus());
	transactioncom.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	String Trancount=Loginpage.FlightResults_text().getText();
	System.out.println(Trancount);
	
	
	String transtr = Trancount.trim();
	String[] transplited = transtr.split("\\:");
	System.out.println("No of Results Count"+transplited[1]);
	Thread.sleep(1000);
	String tran1="Transaction Successful";
	
	if("Flight Search Results : 0".equals(Trancount))
	{
    double result1 = Double.parseDouble(transplited[1]);
		
		//EG_TS_count =result1;
		EG_TS_count=String.format("%.0f", result1);
		System.out.println("EG_TS_count::"+EG_TS_count);
	}
	else
	{
		
		double result1 = Double.parseDouble(transplited[1]);
		
		//EG_TS_count =result1;
		EG_TS_count=String.format("%.0f", result1);
		System.out.println("EG_TS_count::"+EG_TS_count);
	}
	
	
	
	System.out.println(EG_TS_count +"/"+ EG_TS_LW_count);
	EG_print=EG_TS_count +"/"+ EG_TS_LW_count +"*"+100;
	System.out.println("EG_print::"+EG_print);
	

	//convert String to double
	double number = Double.parseDouble(EG_TS_count);
	double number1 = Double.parseDouble(EG_TS_LW_count);
	
	double EG_TS_count_total1 =number / number1 * 100;
	 //Convert double to string
	
	DecimalFormat df = new DecimalFormat("#.##"); 
	EG_TS_count_total = df.format(EG_TS_count_total1); 
	//EG_TS_count_total=String.format("%.0f", EG_TS_count_total1);
	 
	
	//EG_TS_count_total =EG_TS_count/ EG_TS_LW_count * 100;
     System.out.println("total value"+ EG_TS_count_total);
     

     Loginpage.ClickOnUsername().click();
    	Thread.sleep(1000);
    	Loginpage.Log_Out().click();
    	Thread.sleep(2000);

}
}
