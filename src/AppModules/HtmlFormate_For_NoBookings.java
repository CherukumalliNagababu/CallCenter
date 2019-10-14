package AppModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

import utility.Utils;

public class HtmlFormate_For_NoBookings extends NoBookings_All{
public static void TestFormate(int iTestCaseRow,WebDriver driver) throws Exception {
		
	//COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
	StringBuilder htmlStringBuilder=new StringBuilder();
	
	
	
	
	
	
	
	




//Transaction Successful
String COM_TS_Total = new Integer(Com_TS_Transaction_Total).toString();
String AE_TS_Total = new Integer(AE_TS_Transaction_Total).toString();
String SA_TS_Total = new Integer(SA_TS_Transaction_Total).toString();




 int TS_TotalValue = Integer.parseInt(COM_TS_Total) + Integer.parseInt(AE_TS_Total) +Integer.parseInt(SA_TS_Total);
 int All_TransactionSuccess_total = TS_TotalValue; 
System.out.println("TRANSACTION SUCCESS GRAND TOTAL:::----"+All_TransactionSuccess_total);






 


//Repricing
String COM_RP_Total = new Integer(Com_RP_Repricing_Total).toString();
String AE_RP_Total = new Integer(AE_RP_Repricing_Total).toString();
String SA_RP_Total = new Integer(SA_RP_Repricing_Total).toString();


int RP_TotalValue = Integer.parseInt(COM_RP_Total) + Integer.parseInt(AE_RP_Total) +Integer.parseInt(SA_RP_Total) ;
int All_Repricing_total = RP_TotalValue; 
System.out.println("REPRICING  GRAND TOTAL:::----"+All_Repricing_total);



	
	
	
	
	





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

//Date And Time

Date mDate = new Date();
DateFormat timeFormat = SimpleDateFormat.getTimeInstance();


  DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
  String time=timeFormat.format(mDate); 
  String Date=date.format(mDate);
  
  //This method used for 5 Min slow
  DateFormat GetMin = new SimpleDateFormat("hh:mm:ss a");
  Calendar getCal = Calendar.getInstance();
  getCal.add(Calendar.SECOND, -30);
  getCal.add(Calendar.MINUTE, -5);
  System.out.println("Current Date Time : " + GetMin.format(getCal.getTime()));
  
  String currentServerTime =GetMin.format(getCal.getTime());


email.setSubject("No Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+currentServerTime);
//email.setSubject("Flight Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+time);
//email.setSubject(Utils.timestamp()+" -  Flight Booking Status Report ");
System.out.println("2");


if((0>=Com_TS_b2c) && (0>=Com_RP_b2c) ||(0>=Com_TS_MobAnd)&&(0>=Com_RP_MobAnd)||(0>=Com_TS_MobIos)&&(0>=Com_RP_MobIos) ||
		(0>=Com_TS_Wego)&&(0>=Com_RP_Wego)||(0>=Com_TS_skyscan)&&(0>=Com_RP_skyscan)||(0>=AE_TS_b2c)&&(0>=AE_RP_b2c) ||(0>=AE_TS_MobAnd)&&(0>=AE_RP_MobAnd)||
		(0>=AE_TS_MobIos)&&(0>=AE_RP_MobIos)||(0>=AE_TS_Wego)&&(0>=AE_RP_Wego)||(0>=AE_TS_skyscan)&&(0>=AE_RP_skyscan)||
		(0>=SA_TS_b2c)&&(0>=SA_RP_b2c)||(0>=SA_TS_MobAnd)&&(0>=SA_RP_MobAnd)||(0>=SA_TS_MobIos)&&(0>=SA_RP_MobIos)||(0>=SA_TS_Wego)&&(0>=SA_RP_Wego)||(0>=SA_TS_skyscan)&&(0>=SA_RP_skyscan)){
	
	email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 500 height = 200 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th><th>SKYSCN</th></tr> "));

	//Transaction Success
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=4 >TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_TS_b2c+"</td><td>"+Com_TS_MobAnd+"</td><td>"+Com_TS_MobIos+"</td><td>"+Com_TS_Wego+"</td><td>"+Com_TS_skyscan+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_TS_b2c+"</td><td>"+AE_TS_MobAnd+"</td><td>"+AE_TS_MobIos+"</td><td>"+AE_TS_Wego+"</td><td>"+AE_TS_skyscan+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_TS_b2c+"</td><td>"+SA_TS_MobAnd+"</td><td>"+SA_TS_MobIos+"</td><td>"+SA_TS_Wego+"</td><td>"+SA_TS_skyscan+"</td></tr>"));




	//Repricing
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=4 >REPRICING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_RP_b2c+"</td><td>"+Com_RP_MobAnd+"</td><td>"+Com_RP_MobIos+"</td><td>"+Com_RP_Wego+"</td><td>"+Com_RP_skyscan+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_RP_b2c+"</td><td>"+AE_RP_MobAnd+"</td><td>"+AE_RP_MobIos+"</td><td>"+AE_RP_Wego+"</td><td>"+AE_RP_skyscan+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_RP_b2c+"</td><td>"+SA_RP_MobAnd+"</td><td>"+SA_RP_MobIos+"</td><td>"+SA_RP_Wego+"</td><td>"+SA_RP_skyscan+"</td></tr>"));
		












	/*email.addTo("Sreenivas.bodige@rehlat.com");
	email.addCc("amanpreet@rehlat.com");
	email.addCc("nishtha.arora@rehlat.com");
	email.addCc("avinash.ambati@rehlat.com");
	email.addCc("ramesh.g@rehlat.com");
	email.addCc("laxman.pagadala@rehlat.com");
	email.addCc("ahmed.syed@rehlat.com");
	email.addCc("abdul.khan@rehlat.com");
	email.addCc("seema.mohammad@rehlat.com");
	email.addCc("abhaypratap.singh@rehlat.com");
	email.addCc("qateam@rehlat.com");
	email.addCc("brteam@rehlat.com");	
	email.addCc("mobileapp@rehlat.com");
	*/
		


	email.addTo("naga.ch199@gmail.com");


	System.out.println("3");
	email.send();
	System.out.println("END");

	
	
}



else
{
	System.out.println("Booking Are Fine");
}




















}

}
