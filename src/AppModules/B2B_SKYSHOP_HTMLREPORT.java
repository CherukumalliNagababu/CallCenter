package AppModules;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;


import org.apache.commons.mail.DefaultAuthenticator;

import org.apache.commons.mail.HtmlEmail;


import org.openqa.selenium.WebDriver;


import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import utility.Utils;

public class B2B_SKYSHOP_HTMLREPORT extends B2B_SKYSHOPPAGE{

	static int All_TransactionSuccess_total;
	static int All_Repricing_total;
	
	static String GetValueFromXl;
	static String NA = "00";
public static void GenerateMail(int iTestCaseRow,WebDriver driver) throws Exception {
		
	

//Confirmation pending
String COM_CP_Total = new Integer(Com_CP_conformation_pending_Total).toString();
String AE_CP_Total = new Integer(AE_CP_conformation_pending_Total).toString();
String SA_CP_Total = new Integer(SA_CP_conformation_pending_Total).toString();
String EG_CP_Total = new Integer(EG_CP_conformation_pending_Total).toString();



 int CP_TotalValue = Integer.parseInt(COM_CP_Total) + Integer.parseInt(AE_CP_Total) +Integer.parseInt(SA_CP_Total) + Integer.parseInt(EG_CP_Total);
 int All_Confirmationpending_total = CP_TotalValue; 
System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----"+All_Confirmationpending_total);




//Mail sent
StringBuilder htmlStringBuilder=new StringBuilder();
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


//email.setSubject("Flight Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+currentServerTime);
  
email.setSubject("Confirmation Pending Case alert for Skyshopper "+Utils.TodayName()+"- Date: "+Date+" Time: "+currentServerTime);
System.out.println("2");
String Ae_con=Integer.toString(AE_CP_conformation_pending_Total);

if(!Ae_con.equals("0"))
{
	String BookingIds = String.join(",", AE_CP_Bookingid);
	System.out.println("Booking ID's:"+BookingIds);
	 try {
		FileInputStream file1 = new FileInputStream("C:\\DailyXLReports\\B2B_SKY\\B2b.xls");
		Workbook wb1 = Workbook.getWorkbook(file1);
		Sheet sheet1 = wb1.getSheet("Results");
		GetValueFromXl = sheet1.getCell(0, 0).getContents();
		
		System.out.println("GetValueFromXl:"+GetValueFromXl);
		
	} catch (Exception e) {
		GetValueFromXl = NA;
		System.out.println("Exception");
		
	}
	if(GetValueFromXl.equals(BookingIds))
	{
		System.out.println("Booking IDs are Same");
	}
	else{
	
	System.out.println("Not equals");
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Dear Abhay/Team,</tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Please note that below are the confirmation pending cases for Skyshopper. Payment will be received at Skyshopper Payment gateway for this booking and the same, we will deduct from their wallet. So no need to check payment received (or) not for Skyshopper bookings whose status is successful (or) confirmation pending.</tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr>1.Please call the customer mobile. Once the customer confirms stating that he wants the ticket, then only ticket it and send the ticket copy to the customer email address. Else</tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr>2.If the customer denies stating that he booked on another portal or any other reason, please void the ticket and cancel the booking. Send email to Skyshopper team  for refund of the booking for email addresses seperately- (manohar.s@reward360.co, skysupport@reward360.co, pavan.kumar@reward360.co. with cc to team.operations@rehlat.com, tariqraza@rehlat.com, sreenivas.bodige@rehlat.com, suresh.kakarlapudi@rehlat.com)</tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	
	email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 250 height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>BOOKING ID'S</th></tr> "));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td  align=center rowspan=2 >CONF-PENDING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_CP_Bookingid+"</td>"));
	//email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> </tr>"));
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Note:This email auto triggers every two hours until the case is closed by changing the booking status.</tr>"));
	
	
	email.addTo("abhaypratap.singh@rehlat.com");
    email.addTo("team.operations@rehlat.com");
	email.addCc("Sreenivas.bodige@rehlat.com");
	email.addCc("tariqraza@rehlat.com");
	email.addCc("suresh.kakarlapudi@rehlat.com");
	email.addCc("chaitanya.varigonda@rehlat.com");
	
	
	//email.addTo("naga.ch199@gmail.com");
	
	
	System.out.println("3");
	email.send();
	System.out.println("END");
}
}
if(Ae_con.equals("0"))
{
	
	
	System.out.println("--------------------------------------------");
	System.out.println("CONFIRMATION-PENDING MAIL IS NOT REQUIRED");
	System.out.println("--------------------------------------------");
}




//email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 300 height = 100 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>BOOKING ID'S</th></tr> "));


/*//Confirmation pending
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td><td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));
*/

//Confirmation pending --Booking Id's
/*email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 100; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_Bookingid+"</td>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td><td>"+AE_CP_Bookingid+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td><td>"+SA_CP_Bookingid+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td><td>"+EG_CP_Bookingid+"</td></tr>"));
*/


























}

static File file;
public static void getValues() throws IOException, RowsExceededException, WriteException
{
	
	WritableWorkbook wwb;
	WritableSheet ws;
	     
       
	FileOutputStream fo = new FileOutputStream("C:\\DailyXLReports\\B2B_SKY\\B2b.xls");
	wwb = Workbook.createWorkbook(fo);
	ws = wwb.createSheet("Results", 0);
	String Bookingids = String.join(",", AE_CP_Bookingid);
	System.out.println(" Import Booking Ids:"+Bookingids);
	
	
	 Label l2 = new Label(0, 0, Bookingids);
		ws.addCell(l2);
	
	
	wwb.write();
	wwb.close();
	System.out.println("close");
}
public static String timestamp() {
    return new SimpleDateFormat("dd_MMM_yyyy hh a").format(new Date());
}



}
