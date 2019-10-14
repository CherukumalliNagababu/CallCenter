package careemCabsModules;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import utility.Utils;

public class Yesterday_Html_Report extends Cabs_Yesterday_Booking_Status {

	
public static void GenerateMail_Report(int iTestCaseRow,WebDriver driver) throws Exception {
		
	
	StringBuilder htmlStringBuilder=new StringBuilder();

//Mail sent

System.out.println("Started");
 HtmlEmail email = new HtmlEmail();
email.setHostName("smtp.googlemail.com");
email.setSmtpPort(465);
System.out.println("1");
email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
email.setSSLOnConnect(true);
email.setFrom("naga123.ch@gmail.com");
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


email.setSubject("Yesterday :(Date:"+Utils.Yesterdaytimestamp()+")-  Cabs Booking Status Report - "+Utils.YesterdayName());

System.out.println("2");




int total=EG_Trip_Ended+EG_Trip_Started+EG_Canceled+EG_UP_Coming+EG_Driver_assigned+EG_Driver_Coming+EG_Driver_Here;

email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 400 height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>COUNT</th></tr> "));

//Transaction Success
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>TRIP ENDED</td><td>"+EG_Trip_Ended+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>TRIP STARTED</td> <td>"+EG_Trip_Started+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>CANCELLED</td> <td>"+EG_Canceled+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>UPCOMING</td> <td>"+EG_UP_Coming+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>DRIVER ASSIGNED</td> <td>"+EG_Driver_assigned+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>DRIVER COMING</td> <td>"+EG_Driver_Coming+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>DRIVER HERE</td> <td>"+EG_Driver_Here+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <td>"+total+"</td></tr>"));











email.addTo("avinash.ambati@rehlat.com");
email.addCc("mobileapp@rehlat.com");
email.addCc("sankalp.chhabra@rehlat.com");
	


//email.addTo("naga.ch199@gmail.com");


System.out.println("3");
email.send();
System.out.println("END");



















}


}
