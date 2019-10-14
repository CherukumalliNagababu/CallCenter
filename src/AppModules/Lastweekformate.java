package AppModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

import utility.Utils;

public class Lastweekformate extends Lastweekgol {
public static void TestFormate(int iTestCaseRow,WebDriver driver) throws Exception {
		
	
	


	StringBuilder htmlStringBuilder=new StringBuilder();
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


email.setSubject("Date: "+Date+" Time: "+time+" -  last week transactions  and today transactions status ");

//email.setSubject(Utils.timestamp()+" -  Flight Booking Status Report ");
System.out.println("2");








email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 50 height = 50 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>DOMAIN NAMES </th> <th>LAST WEEK TRANSACTIONS TOTAL</th> <th>CURRENT TRANSACTIONS</th><th>CALCULATE VALUES</th><th>PERCENTAGE</th> </tr> "));


email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=2 >COM</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black> <td>"+Com_TS_LW_count+"</td><td>"+Com_TS_count+"</td><td>"+Com_print+"</td><td>"+Com_TS_count_total+"%"+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=2 >AE</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black> <td>"+AE_TS_LW_count+"</td><td>"+AE_TS_count+"</td><td>"+AE_print+"</td><td>"+AE_TS_count_total+"%"+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=2 >SA</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black> <td>"+SA_TS_LW_count+"</td><td>"+SA_TS_count+"</td><td>"+SA_print+"</td><td>"+SA_TS_count_total+"%"+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=2 >EG</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black> <td>"+EG_TS_LW_count+"</td><td>"+EG_TS_count+"</td><td>"+EG_print+"</td><td>"+EG_TS_count_total+"%"+"</td></tr>"));



     email.addTo("Sreenivas.bodige@rehlat.com");
    // email.addTo("naga.ch199@gmail.com");


System.out.println("3");
email.send();
System.out.println("END");



















}

}
