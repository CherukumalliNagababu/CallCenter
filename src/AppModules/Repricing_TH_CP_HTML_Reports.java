package AppModules;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

import utility.Utils;



public class Repricing_TH_CP_HTML_Reports extends Repricing_TH_CP_Reports {
	static int All_Repricing_total;
	static int All_TransactionHold_total;
	static int All_Confirmationpending_total;
	static int All_Confirmationpending_F_total;
	
	
	 public static final String USERNAME = "nagababu16";
	    public static final String AUTOMATE_KEY = "EmyCucUNpkzxzQFrqzVw";
	    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
public static void HtmlReport(int iTestCaseRow,WebDriver driver) throws Exception {
	
	
	StringBuilder htmlStringBuilder=new StringBuilder();
	
	

 
//Repricing
String COM_RP_Total = new Integer(Com_RP_Repricing_Total).toString();
String AE_RP_Total = new Integer(AE_RP_Repricing_Total).toString();
String SA_RP_Total = new Integer(SA_RP_Repricing_Total).toString();
String EG_RP_Total = new Integer(EG_RP_Repricing_Total).toString();

int RP_TotalValue = Integer.parseInt(COM_RP_Total) + Integer.parseInt(AE_RP_Total) +Integer.parseInt(SA_RP_Total) + Integer.parseInt(EG_RP_Total);
 All_Repricing_total = RP_TotalValue; 
System.out.println("REPRICING  GRAND TOTAL:::----"+All_Repricing_total);






//Confirmation pending
String COM_CP_Total = new Integer(Com_CP_conformation_pending_Total).toString();
String AE_CP_Total = new Integer(AE_CP_conformation_pending_Total).toString();
String SA_CP_Total = new Integer(SA_CP_conformation_pending_Total).toString();
String EG_CP_Total = new Integer(EG_CP_conformation_pending_Total).toString();



int CP_TotalValue = Integer.parseInt(COM_CP_Total) + Integer.parseInt(AE_CP_Total) +Integer.parseInt(SA_CP_Total) + Integer.parseInt(EG_CP_Total);
 All_Confirmationpending_total = CP_TotalValue; 
System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----"+All_Confirmationpending_total);
	
	
//Transaction Hold
String COM_TH_Total = new Integer( Com_TH_Transactionhold_total).toString();
String AE_TH_Total = new Integer(AE_TH_Transactionhold_total).toString();
String SA_TH_Total = new Integer(SA_TH_Transactionhold_total).toString();
String EG_TH_Total = new Integer(EG_TH_Transactionhold_total).toString();
int TH_TotalValue = Integer.parseInt(COM_TH_Total) + Integer.parseInt(AE_TH_Total) +Integer.parseInt(SA_TH_Total) + Integer.parseInt(EG_TH_Total);
 All_TransactionHold_total = TH_TotalValue; 
System.out.println("TRANSACTION HOLD GRAND TOTAL:::----"+All_TransactionHold_total);
		
	
//Confirmation pending --- Payment Fail
String COM_CP_F_Total = new Integer(Com_CP_F_conformation_pending_Total).toString();
String AE_CP_F_Total = new Integer(AE_CP_F_conformation_pending_Total).toString();
String SA_CP_F_Total = new Integer(SA_CP_F_conformation_pending_Total).toString();
String EG_CP_F_Total = new Integer(EG_CP_F_conformation_pending_Total).toString();



int CP_F_TotalValue = Integer.parseInt(COM_CP_F_Total) + Integer.parseInt(AE_CP_F_Total) +Integer.parseInt(SA_CP_F_Total) + Integer.parseInt(EG_CP_F_Total);
All_Confirmationpending_F_total = CP_F_TotalValue; 
System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----"+All_Confirmationpending_F_total);
	
	
	



//Reprice
	 String RP_Grand_Total=String.format("%7s " ,"REPRICING GRAND TOTAL :)- "+All_Repricing_total+"");
		String Com_Rp=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_RP_Repricing_Total+") :","-B2C("+Com_RP_b2c+")", "-MOBAPP("+Com_RP_MobAnd+")", "-MOBIOS("+Com_RP_MobIos+")", "-WEGO("+Com_RP_Wego+")","-SKYSCN("+Com_RP_skyscan+")", "-OTHERS("+Com_RP_Other_Repricingtotal+")");
		String AE_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_RP_Repricing_Total+") :", "-B2C("+AE_RP_b2c+")", "-MOBAPP("+AE_RP_MobAnd+")", "-MOBIOS("+AE_RP_MobIos+")", "-WEGO("+AE_RP_Wego+")","-SKYSCN("+AE_RP_skyscan+")", "-OTHERS("+AE_RP_Other_Repricingtotal+")");
		String Sa_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_RP_Repricing_Total+") :", "-B2C("+SA_RP_b2c+")", "-MOBAPP("+SA_RP_MobAnd+")", "-MOBIOS("+SA_RP_MobIos+")", "-WEGO("+SA_RP_Wego+")","-SKYSCN("+SA_RP_skyscan+")", "-OTHERS("+SA_RP_Other_Repricingtotal+")");
		String Eg_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_RP_Repricing_Total+") :", "-B2C("+EG_RP_b2c+")", "-MOBAPP("+EG_RP_MobAnd+")", "-MOBIOS("+EG_RP_MobIos+")", "-WEGO("+EG_RP_Wego+")","-SKYSCN("+EG_RP_skyscan+")", "-OTHERS("+EG_RP_Other_Repricingtotal+")");
		
		









//Mail sent
	
	System.out.println("Started");
	 //StringBuilder htmlStringBuilder=new StringBuilder();
	 HtmlEmail email = new HtmlEmail();
	//Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	//email.setSubject(Utils.Yesterdaytimestamp()+" - Automation Report For "+urldomain1[0]+" Domain");
	email.setSubject(""+Utils.Yesterdaytimestamp()+" "+"To"+" "+ Utils.CurrentDate()+"  Repricing 2:00 AM Status Report");
	System.out.println("2");
	
	
 
 
 

	
	/*email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =400  height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

	
	
	//Repricing
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_RP_b2c+"</td><td>"+Com_RP_MobAnd+"</td><td>"+Com_RP_MobIos+"</td><td>"+Com_RP_Wego+"</td><td>"+Com_RP_skyscan+"</td><td>"+ Com_RP_Other_Repricingtotal+"</td><td>"+Com_RP_Repricing_Total+"</td><td rowspan=5>"+All_Repricing_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_RP_b2c+"</td><td>"+AE_RP_MobAnd+"</td><td>"+AE_RP_MobIos+"</td><td>"+AE_RP_Wego+"</td><td>"+AE_RP_skyscan+"</td><td>"+AE_RP_Other_Repricingtotal+"</td><td>"+AE_RP_Repricing_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_RP_b2c+"</td><td>"+SA_RP_MobAnd+"</td><td>"+SA_RP_MobIos+"</td><td>"+SA_RP_Wego+"</td><td>"+SA_RP_skyscan+"</td><td>"+SA_RP_Other_Repricingtotal+"</td><td>"+SA_RP_Repricing_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_RP_b2c+"</td><td>"+EG_RP_MobAnd+"</td><td>"+EG_RP_MobIos+"</td><td>"+EG_RP_Wego+"</td><td>"+EG_RP_skyscan+"</td><td>"+EG_RP_Other_Repricingtotal+"</td><td>"+EG_RP_Repricing_Total+"</td></tr>"));
	
 
 
 
	//Confirmation pending
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_b2c+"</td><td>"+Com_CP_MobAnd+"</td><td>"+Com_CP_MobIos+"</td><td>"+Com_CP_Wego+"</td><td>"+Com_CP_skyscan+"</td><td>"+ Com_CP_Other_conformation_pending+"</td><td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_CP_b2c+"</td><td>"+AE_CP_MobAnd+"</td><td>"+AE_CP_MobIos+"</td><td>"+AE_CP_Wego+"</td><td>"+AE_CP_skyscan+"</td><td>"+AE_CP_Other_conformation_pending+"</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_CP_b2c+"</td><td>"+SA_CP_MobAnd+"</td><td>"+SA_CP_MobIos+"</td><td>"+SA_CP_Wego+"</td><td>"+SA_CP_skyscan+"</td><td>"+SA_CP_Other_conformation_pending+"</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_CP_b2c+"</td><td>"+EG_CP_MobAnd+"</td><td>"+EG_CP_MobIos+"</td><td>"+EG_CP_Wego+"</td><td>"+EG_CP_skyscan+"</td><td>"+EG_CP_Other_conformation_pending+"</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));

	
	*/

 
 
	email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =200  height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th>  <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

	
	/*//Repricing
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+com_byDefault+"</td><td rowspan=5>"+All_Repricing_total1+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Ae_byDefault+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Sa_byDefault+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Eg_byDefault+"</td></tr>"));
		*/
	
		/*email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));

		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));*/
	
		//email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =200  height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));
		
	//Repricing
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_RP_Repricing_Total+"</td><td rowspan=5>"+All_Repricing_total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_RP_Repricing_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_RP_Repricing_Total+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_RP_Repricing_Total+"</td></tr>"));
		
	
	            //Confirmation pending
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));

			
	
	
				//Trancation Hold

				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION HOLD-REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td><td>"+Com_TH_Transactionhold_total+"</td><td rowspan=5>"+All_TransactionHold_total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_TH_Transactionhold_total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_TH_Transactionhold_total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_TH_Transactionhold_total+"</td></tr>"));

	
				
				//Confirmation pending --Payment Fail
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING - PAYMENT FAIL</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_F_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_F_total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_F_conformation_pending_Total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_F_conformation_pending_Total+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_F_conformation_pending_Total+"</td></tr>"));

			
				email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));

				email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));	
				
				email.setHtmlMsg(""+htmlStringBuilder.append(" <table width =200  height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th> BOOKINGID'S </th></tr> "));
				
				//Confirmation pending --Booking Id's
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 100; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_Bookingid+"</td>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_Bookingid+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_Bookingid+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_Bookingid+"</td></tr>"));
	
				
				//Trancation Hold --Booking Id's
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 100; align=center rowspan=5 >TRANSACTION HOLD</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_TH_Bookingid+"</td>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_TH_Bookingid+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_TH_Bookingid+"</td></tr>"));
				email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_TH_Bookingid+"</td></tr>"));
	
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <td colspan=10> NOTE:--TS -- Transaction Successful ,SD -- Sold Out,CX -- Cancelled,TH -- Transaction Hold </td></tr>"));
 
 

	
		
	email.addTo("Sreenivas.bodige@rehlat.com");
	email.addCc("tariqraza@rehlat.com");
	email.addCc("qateam@rehlat.com");
	email.addCc("rajendra.purohit@rehlat.com");
	
	email.addCc("veerendra.parvataneni@rehlat.com");
	email.addCc("suresh.kakarlapudi@rehlat.com");
	email.addCc("kumar.uba@rehlat.com");
	
	
	
  //email.addTo("naga.ch199@gmail.com");
	
	
	
  
	
	System.out.println("3");
	email.send();
	System.out.println("END");
	
   


	/*String top="REPR:::----"+All_Repricing_total+ "\n" + 
			"TXNF:::----"+All_Confirmationpending_total+ "\n" + 
            "TXNH:::----"+All_TransactionHold_total+ "\n" +
            "TXNF-PAYMENT FAIL:::-----"+All_Confirmationpending_F_total+ "\n" +"-------------------------------------------------------------------"+ "\n"+ 
            "TXNF--COM--BOOKING ID's:::----"+Com_CP_Bookingid+ "\n"+
			"TXNF--AE--BOOKING ID's:::----"+AE_CP_Bookingid+ "\n"+
			"TXNF--SA--BOOKING ID's:::----"+SA_CP_Bookingid+ "\n"+
			"TXNF--EG--BOOKING ID's:::----"+EG_CP_Bookingid+ "\n" +"-------------------------------------------------------------------"+ "\n"+
			"TXNH--COM--BOOKING ID's:::----"+Com_TH_Bookingid+ "\n"+
			"TXNH--AE--BOOKING ID's:::----"+AE_TH_Bookingid+ "\n"+
			"TXNH--SA--BOOKING ID's:::----"+SA_TH_Bookingid+ "\n"+
			"TXNH--EG--BOOKING ID's:::----"+EG_TH_Bookingid+ "\n";
	
	Payload payload = Payload.builder()
	          .channel("#builds")
	          .username("jSlack")
	          .iconEmoji(":smile_cat:")
	          .text(top)
	           .build();
			Slack s=Slack.getInstance();
			WebhookResponse res=s.send("https://hooks.slack.com/services/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", payload);
		

*/

	


}
public static void Slack(WebDriver driver) throws Exception {
	
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("--start-maximized");
	//System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
	//driver = new ChromeDriver(options);
	
	/*System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\ChromeDriver\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();*/
	
	DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "73.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "10");
    caps.setCapability("resolution", "1024x768");

     driver = new RemoteWebDriver(new URL(URL), caps);
     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	
	
	
	
	
	
	 
	
		System.out.println("Slack Start");
		driver.get("https://rehlatofficial.slack.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nagababu.cherukumalli@rehlat.com");
		Thread.sleep(2000);
		WebElement ww=driver.findElement(By.xpath(".//*[@id='email']"));
		System.out.println("Get ATTRIBUTE NAME:"+ww.getAttribute("value"));
		System.out.println("Get USER NAME:"+ww.getText());
		
		System.out.println("UserName");
		driver.findElement(By.id("password")).sendKeys("naga@qtselenium");
		Thread.sleep(1000);
		WebElement ww1=driver.findElement(By.id("password"));
		System.out.println("Get ATTRIBUTE PWD:"+ww1.getAttribute("value"));
		System.out.println("Get PWD:"+ww1.getText());
		System.out.println("PWD");
		driver.findElement(By.id("signin_btn")).click();
		System.out.println("Login");
		Thread.sleep(5000);
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      // FileUtils.copyFile(scrFile, new File("D:/WorkSpacess/OctWorkSpace/CallCenter_RE/ScreenShoots/image_"+timestamp()+".png"));
			
		System.out.println("Current Url::"+driver.getCurrentUrl());
		//div[@class='p-channel_sidebar__close_container']/a
		//div[@class='p-channel_sidebar__static_list']/div/a
		/*List<WebElement> ew=driver.findElements(By.xpath("//div[@class='p-channel_sidebar__static_list']/div/a"));
		
		for(WebElement e:ew)
		{
			System.out.println(e.getText());
			String getChannels=e.getText();
		//Nagababu(you) repricing
		if(getChannels.equals("repricing"))
		{
			e.click();
			break;
		}
		}*/
		
		
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='qa_team'])[1]/following::span[1]")).click();
		//driver.findElement(By.cssSelector(".p-channel_sidebar__channel--im-you span:nth-child(1)")).click();
		//System.out.println("check");
		//driver.findElement(By.linkText("repricing")).isDisplayed();
		//driver.findElement(By.linkText("repricing")).click();
		//System.out.println("repricing");
		Thread.sleep(3000);
		
		//List<WebElement> we=d.findElements(By.tagName("iframe"));
		//System.out.println(we.size());
		
		driver.findElement(By.id("undefined")).click();
		System.out.println("enter");
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='msg_input']/div[1]")).sendKeys("test");
		driver.findElement(By.id("undefined")).sendKeys("REPR:::----"+All_Repricing_total+ "\n" + 
				                                                              "TXNF:::----"+All_Confirmationpending_total+ "\n" + 
				                                                              "TXNH:::----"+All_TransactionHold_total+ "\n" +
				                                                              "TXNF-PAYMENT FAIL:::-----"+All_Confirmationpending_F_total+ "\n" +"-------------------------------------------------------------------"+ "\n"+ 
				                                                              
				
				
				"TXNF--COM--BOOKING ID's:::----"+Com_CP_Bookingid+ "\n"+
				"TXNF--AE--BOOKING ID's:::----"+AE_CP_Bookingid+ "\n"+
				"TXNF--SA--BOOKING ID's:::----"+SA_CP_Bookingid+ "\n"+
				"TXNF--EG--BOOKING ID's:::----"+EG_CP_Bookingid+ "\n" +"-------------------------------------------------------------------"+ "\n"+
				"TXNH--COM--BOOKING ID's:::----"+Com_TH_Bookingid+ "\n"+
				"TXNH--AE--BOOKING ID's:::----"+AE_TH_Bookingid+ "\n"+
				"TXNH--SA--BOOKING ID's:::----"+SA_TH_Bookingid+ "\n"+
				"TXNH--EG--BOOKING ID's:::----"+EG_TH_Bookingid+ "\n");
		
		
		
		System.out.println("REPR:::----"+All_Repricing_total+ "\n" +"TXNF:::----"+All_Confirmationpending_total+ "\n" + 
				            "TXNH:::----"+All_TransactionHold_total+ "\n" + "TXNF-PAYMENT FAIL:::-----"+All_Confirmationpending_F_total);
		Thread.sleep(2000);
		driver.findElement(By.id("undefined")).sendKeys(Keys.ENTER);
		System.out.println("Slack End");
		driver.quit();
	
	
}
public static String timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}


}
