package AppModules;

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

public class NormalFormate extends Flights_BookingStatus_From_CallCenter {

	static int All_TransactionSuccess_total;
	static int All_Repricing_total;
public static void TestFormate(int iTestCaseRow,WebDriver driver) throws Exception {
		
	//COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
	StringBuilder htmlStringBuilder=new StringBuilder();
	//Repricing Transaction Successful
	String IR_COM_TS_Total = new Integer(Isreprice_Com_TS_Transaction_Total).toString();
	String IR_AE_TS_Total = new Integer(Isreprice_AE_TS_Transaction_Total).toString();
	String IR_SA_TS_Total = new Integer(Isreprice_SA_TS_Transaction_Total).toString();
	String IR_EG_TS_Total = new Integer(Isreprice_EG_TS_Transaction_Total).toString();
	
	
	
	 int IR_TS_TotalValue = Integer.parseInt(IR_COM_TS_Total) + Integer.parseInt(IR_AE_TS_Total) +Integer.parseInt(IR_SA_TS_Total) + Integer.parseInt(IR_EG_TS_Total);
	 int IR_All_TransactionSuccess_total = IR_TS_TotalValue; 
	System.out.println("TRANSACTION SUCCESS GRAND TOTAL:::----"+IR_All_TransactionSuccess_total);
	
	//Repricing Conformation Pending
	
	String IR_COM_CP_Total = new Integer(Isreprice_Com_CP_COnformationPending_Total).toString();
	String IR_AE_CP_Total = new Integer(Isreprice_AE_CP_COnformationPending_Total).toString();
	String IR_SA_CP_Total = new Integer(Isreprice_SA_CP_COnformationPending_Total).toString();
	String IR_EG_CP_Total = new Integer(Isreprice_EG_CP_COnformationPending_Total).toString();
	
	
	
	 int IR_CP_TotalValue = Integer.parseInt(IR_COM_CP_Total) + Integer.parseInt(IR_AE_CP_Total) +Integer.parseInt(IR_SA_CP_Total) + Integer.parseInt(IR_EG_CP_Total);
	 int IR_All_ConformationPending_total = IR_CP_TotalValue; 
	System.out.println("Conformation Pending GRAND TOTAL:::----"+IR_All_ConformationPending_total);
	
//Repricing Partilly Ticket
	
	String IR_COM_PT_Total = new Integer(Isreprice_Com_PT_PartiallyTicketed_Total).toString();
	String IR_AE_PT_Total = new Integer(Isreprice_AE_PT_PartiallyTicketed_Total).toString();
	String IR_SA_PT_Total = new Integer(Isreprice_SA_PT_PartiallyTicketed_Total).toString();
	String IR_EG_PT_Total = new Integer(Isreprice_EG_PT_PartiallyTicketed_Total).toString();
	
	
	
	 int IR_PT_TotalValue = Integer.parseInt(IR_COM_PT_Total) + Integer.parseInt(IR_AE_PT_Total) +Integer.parseInt(IR_SA_PT_Total) + Integer.parseInt(IR_EG_PT_Total);
	 int IR_All_PartillyTicket_total = IR_PT_TotalValue; 
	System.out.println("PartillyTicket GRAND TOTAL:::----"+IR_All_PartillyTicket_total);
	
//Repricing Tranction Hold
	
	String IR_COM_TH_Total = new Integer(Isreprice_Com_TH_Transactionhold_total).toString();
	String IR_AE_TH_Total = new Integer(Isreprice_AE_TH_Transactionhold_total).toString();
	String IR_SA_TH_Total = new Integer(Isreprice_SA_TH_Transactionhold_total).toString();
	String IR_EG_TH_Total = new Integer(Isreprice_EG_TH_Transactionhold_total).toString();
	
	
	
	 int IR_TH_TotalValue = Integer.parseInt(IR_COM_TH_Total) + Integer.parseInt(IR_AE_TH_Total) +Integer.parseInt(IR_SA_TH_Total) + Integer.parseInt(IR_EG_TH_Total);
	 int IR_All_TrancationHold_total = IR_TH_TotalValue; 
	System.out.println("TrancationHold GRAND TOTAL:::----"+IR_All_TrancationHold_total);


//Transaction Successful
String COM_TS_Total = new Integer(Com_TS_Transaction_Total).toString();
String AE_TS_Total = new Integer(AE_TS_Transaction_Total).toString();
String SA_TS_Total = new Integer(SA_TS_Transaction_Total).toString();
String EG_TS_Total = new Integer(EG_TS_Transaction_Total).toString();



 int TS_TotalValue = Integer.parseInt(COM_TS_Total) + Integer.parseInt(AE_TS_Total) +Integer.parseInt(SA_TS_Total) + Integer.parseInt(EG_TS_Total);
  All_TransactionSuccess_total = TS_TotalValue; 
System.out.println("TRANSACTION SUCCESS GRAND TOTAL:::----"+All_TransactionSuccess_total);

//Confirmation pending
String COM_CP_Total = new Integer(Com_CP_conformation_pending_Total).toString();
String AE_CP_Total = new Integer(AE_CP_conformation_pending_Total).toString();
String SA_CP_Total = new Integer(SA_CP_conformation_pending_Total).toString();
String EG_CP_Total = new Integer(EG_CP_conformation_pending_Total).toString();



 int CP_TotalValue = Integer.parseInt(COM_CP_Total) + Integer.parseInt(AE_CP_Total) +Integer.parseInt(SA_CP_Total) + Integer.parseInt(EG_CP_Total);
 int All_Confirmationpending_total = CP_TotalValue; 
System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----"+All_Confirmationpending_total);



//Repricing
String COM_RP_Total = new Integer(Com_RP_Repricing_Total).toString();
String AE_RP_Total = new Integer(AE_RP_Repricing_Total).toString();
String SA_RP_Total = new Integer(SA_RP_Repricing_Total).toString();
String EG_RP_Total = new Integer(EG_RP_Repricing_Total).toString();

int RP_TotalValue = Integer.parseInt(COM_RP_Total) + Integer.parseInt(AE_RP_Total) +Integer.parseInt(SA_RP_Total) + Integer.parseInt(EG_RP_Total);
 All_Repricing_total = RP_TotalValue; 
System.out.println("REPRICING  GRAND TOTAL:::----"+All_Repricing_total);


//SoldOuts
	String COM_SD_Total = new Integer(Com_SD_SoldOut_Total).toString();
	String AE_SD_Total = new Integer(AE_SD_SoldOut_Total).toString();
	String SA_SD_Total = new Integer(SA_SD_SoldOut_Total).toString();
	String EG_SD_Total = new Integer(EG_SD_SoldOut_Total).toString();
	
	int SD_TotalValue = Integer.parseInt(COM_SD_Total) + Integer.parseInt(AE_SD_Total) +Integer.parseInt(SA_SD_Total) + Integer.parseInt(EG_SD_Total);
	int All_SoldOut_total = SD_TotalValue; 
	System.out.println("SOLD OUTS GRAND TOTAL:::----"+All_SoldOut_total);
	
	//Cancelled
			String COM_CN_Total = new Integer(Com_CN_CancelledTotal).toString();
			String AE_CN_Total = new Integer(AE_CN_CancelledTotal).toString();
			String SA_CN_Total = new Integer(SA_CN_CancelledTotal).toString();
			String EG_CN_Total = new Integer(EG_CN_CancelledTotal).toString();
			int CN_TotalValue = Integer.parseInt(COM_CN_Total) + Integer.parseInt(AE_CN_Total) +Integer.parseInt(SA_CN_Total) + Integer.parseInt(EG_CN_Total);
			 int All_Cancelled_total = CN_TotalValue; 
			System.out.println("CANCELLED GRAND TOTAL:::----"+All_Cancelled_total);
			
	//Transaction Hold
			String COM_TH_Total = new Integer( Com_TH_Transactionhold_total).toString();
			String AE_TH_Total = new Integer(AE_TH_Transactionhold_total).toString();
			String SA_TH_Total = new Integer(SA_TH_Transactionhold_total).toString();
			String EG_TH_Total = new Integer(EG_TH_Transactionhold_total).toString();
			int TH_TotalValue = Integer.parseInt(COM_TH_Total) + Integer.parseInt(AE_TH_Total) +Integer.parseInt(SA_TH_Total) + Integer.parseInt(EG_TH_Total);
			int All_TransactionHold_total = TH_TotalValue; 
			System.out.println("TRANSACTION HOLD GRAND TOTAL:::----"+All_TransactionHold_total);
	
	
	


String TS_Grand_Total=String.format("%7s " ,"TRANSACTION SUCCESS GRAND TOTAL :)- "+All_TransactionSuccess_total+"");
String Com_ts=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_TS_Transaction_Total+") :","-B2C("+Com_TS_b2c+")", "-MOBAPP("+Com_TS_MobAnd+")", "-MOBIOS("+Com_TS_MobIos+")", "-WEGO("+Com_TS_Wego+")","-SKYSCN("+Com_TS_skyscan+")", "-OTHERS("+Com_TS_Other_TrancationSuccessfull+")");
String AE_ts =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_TS_Transaction_Total+") :", "-B2C("+AE_TS_b2c+")", "-MOBAPP("+AE_TS_MobAnd+")", "-MOBIOS("+AE_TS_MobIos+")", "-WEGO("+AE_TS_Wego+")","-SKYSCN("+AE_TS_skyscan+")", "-OTHERS("+AE_TS_Other_TrancationSuccessfull+")");
String Sa_ts =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_TS_Transaction_Total+") :", "-B2C("+SA_TS_b2c+")", "-MOBAPP("+SA_TS_MobAnd+")", "-MOBIOS("+SA_TS_MobIos+")", "-WEGO("+SA_TS_Wego+")","-SKYSCN("+SA_TS_skyscan+")", "-OTHERS("+SA_TS_Other_TrancationSuccessfull+")");
String Eg_ts =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_TS_Transaction_Total+") :", "-B2C("+EG_TS_b2c+")", "-MOBAPP("+EG_TS_MobAnd+")", "-MOBIOS("+EG_TS_MobIos+")", "-WEGO("+EG_TS_Wego+")","-SKYSCN("+EG_TS_skyscan+")", "-OTHERS("+EG_TS_Other_TrancationSuccessfull+")");



//Reprice
	 String RP_Grand_Total=String.format("%7s " ,"REPRICING GRAND TOTAL :)- "+All_Repricing_total+"");
		String Com_Rp=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_RP_Repricing_Total+") :","-B2C("+Com_RP_b2c+")", "-MOBAPP("+Com_RP_MobAnd+")", "-MOBIOS("+Com_RP_MobIos+")", "-WEGO("+Com_RP_Wego+")","-SKYSCN("+Com_RP_skyscan+")", "-OTHERS("+Com_RP_Other_Repricingtotal+")");
		String AE_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_RP_Repricing_Total+") :", "-B2C("+AE_RP_b2c+")", "-MOBAPP("+AE_RP_MobAnd+")", "-MOBIOS("+AE_RP_MobIos+")", "-WEGO("+AE_RP_Wego+")","-SKYSCN("+AE_RP_skyscan+")", "-OTHERS("+AE_RP_Other_Repricingtotal+")");
		String Sa_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_RP_Repricing_Total+") :", "-B2C("+SA_RP_b2c+")", "-MOBAPP("+SA_RP_MobAnd+")", "-MOBIOS("+SA_RP_MobIos+")", "-WEGO("+SA_RP_Wego+")","-SKYSCN("+SA_RP_skyscan+")", "-OTHERS("+SA_RP_Other_Repricingtotal+")");
		String Eg_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_RP_Repricing_Total+") :", "-B2C("+EG_RP_b2c+")", "-MOBAPP("+EG_RP_MobAnd+")", "-MOBIOS("+EG_RP_MobIos+")", "-WEGO("+EG_RP_Wego+")","-SKYSCN("+EG_RP_skyscan+")", "-OTHERS("+EG_RP_Other_Repricingtotal+")");
		
		


String SD_Grand_Total=String.format("%7s " ,"SOLD OUTS GRAND TOTAL :)- "+All_SoldOut_total+"");
String Com_sd=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_SD_SoldOut_Total+") :","-B2C("+Com_SD_b2c+")", "-MOBAPP("+Com_SD_MobAnd+")", "-MOBIOS("+Com_SD_MobIos+")", "-WEGO("+Com_SD_Wego+")","-SKYSCN("+Com_SD_skyscan+")", "-OTHERS("+Com_SD_Other_SoldOutstotal+")");
String AE_sd =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_SD_SoldOut_Total+") :", "-B2C("+AE_SD_b2c+")", "-MOBAPP("+AE_SD_MobAnd+")", "-MOBIOS("+AE_SD_MobIos+")", "-WEGO("+AE_SD_Wego+")","-SKYSCN("+AE_SD_skyscan+")", "-OTHERS("+AE_SD_Other_SoldOutstotal+")");
String Sa_sd =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_SD_SoldOut_Total+") :", "-B2C("+SA_SD_b2c+")", "-MOBAPP("+SA_SD_MobAnd+")", "-MOBIOS("+SA_SD_MobIos+")", "-WEGO("+SA_SD_Wego+")","-SKYSCN("+SA_SD_skyscan+")", "-OTHERS("+SA_SD_Other_SoldOutstotal+")");
String Eg_sd =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_SD_SoldOut_Total+") :", "-B2C("+EG_SD_b2c+")", "-MOBAPP("+EG_SD_MobAnd+")", "-MOBIOS("+EG_SD_MobIos+")", "-WEGO("+EG_SD_Wego+")","-SKYSCN("+EG_SD_skyscan+")", "-OTHERS("+EG_SD_Other_SoldOutstotal+")");

String CN_Grand_Total=String.format("%7s " ,"CANCELLED GRAND TOTAL :)- "+All_Cancelled_total+"");
String Com_cn=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_CN_CancelledTotal+") :","-B2C("+Com_CN_b2c+")", "-MOBAPP("+Com_CN_MobAnd+")", "-MOBIOS("+Com_CN_MobIos+")", "-WEGO("+Com_CN_Wego+")","-SKYSCN("+Com_CN_skyscan+")", "-OTHERS("+Com_CN_Other_CancelledTotal+")");
String AE_cn =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_CN_CancelledTotal+") :", "-B2C("+AE_CN_b2c+")", "-MOBAPP("+AE_CN_MobAnd+")", "-MOBIOS("+AE_CN_MobIos+")", "-WEGO("+AE_CN_Wego+")","-SKYSCN("+AE_CN_skyscan+")", "-OTHERS("+AE_CN_Other_CancelledTotal+")");
String Sa_cn =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_CN_CancelledTotal+") :", "-B2C("+SA_CN_b2c+")", "-MOBAPP("+SA_CN_MobAnd+")", "-MOBIOS("+SA_CN_MobIos+")", "-WEGO("+SA_CN_Wego+")","-SKYSCN("+SA_CN_skyscan+")", "-OTHERS("+SA_CN_Other_CancelledTotal+")");
String Eg_cn =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_CN_CancelledTotal+") :", "-B2C("+EG_CN_b2c+")", "-MOBAPP("+EG_CN_MobAnd+")", "-MOBIOS("+EG_CN_MobIos+")", "-WEGO("+EG_CN_Wego+")","-SKYSCN("+EG_CN_skyscan+")", "-OTHERS("+EG_CN_Other_CancelledTotal+")");


String TH_Grand_Total=String.format("%7s " ,"TRANSACTION HOLD GRAND TOTAL :)- "+All_TransactionHold_total+"");
String Com_th=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_TH_Transactionhold_total+") :","-B2C("+Com_TH_b2c+")", "-MOBAPP("+Com_TH_MobAnd+")", "-MOBIOS("+Com_TH_MobIos+")", "-WEGO("+Com_TH_Wego+")","-SKYSCN("+Com_TH_skyscan+")", "-OTHERS("+Com_Other_TH_Transactionhold_total+")");
String AE_th =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_TH_Transactionhold_total+") :", "-B2C("+AE_TH_b2c+")", "-MOBAPP("+AE_TH_MobAnd+")", "-MOBIOS("+AE_TH_MobIos+")", "-WEGO("+AE_TH_Wego+")","-SKYSCN("+AE_TH_skyscan+")", "-OTHERS("+AE_TH_Other_TransactionholdTotal+")");
String Sa_th =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_TH_Transactionhold_total+") :", "-B2C("+SA_TH_b2c+")", "-MOBAPP("+SA_TH_MobAnd+")", "-MOBIOS("+SA_TH_MobIos+")", "-WEGO("+SA_TH_Wego+")","-SKYSCN("+SA_TH_skyscan+")", "-OTHERS("+SA_TH_Other_TransactionholdTotal+")");
String Eg_th =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_TH_Transactionhold_total+") :", "-B2C("+EG_TH_b2c+")", "-MOBAPP("+EG_TH_MobAnd+")", "-MOBIOS("+EG_TH_MobIos+")", "-WEGO("+EG_TH_Wego+")","-SKYSCN("+EG_TH_skyscan+")", "-OTHERS("+EG_TH_Other_TransactionHoldTotal+")");



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


email.setSubject("Flight Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+currentServerTime);
//email.setSubject("Flight Bookings :- "+Utils.TodayName()+"- Date: "+Date+" Time: "+time);
//email.setSubject(Utils.timestamp()+" -  Flight Booking Status Report ");
System.out.println("2");








email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 400 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

//Transaction Success
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_TS_b2c+"</td><td>"+Com_TS_MobAnd+"</td><td>"+Com_TS_MobIos+"</td><td>"+Com_TS_Wego+"</td><td>"+Com_TS_skyscan+"</td><td>"+Com_TS_Other_TrancationSuccessfull+"</td><td>"+Com_TS_Transaction_Total+"</td><td rowspan=5>"+All_TransactionSuccess_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_TS_b2c+"</td><td>"+AE_TS_MobAnd+"</td><td>"+AE_TS_MobIos+"</td><td>"+AE_TS_Wego+"</td><td>"+AE_TS_skyscan+"</td><td>"+AE_TS_Other_TrancationSuccessfull+"</td><td>"+AE_TS_Transaction_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_TS_b2c+"</td><td>"+SA_TS_MobAnd+"</td><td>"+SA_TS_MobIos+"</td><td>"+SA_TS_Wego+"</td><td>"+SA_TS_skyscan+"</td><td>"+SA_TS_Other_TrancationSuccessfull+"</td><td>"+SA_TS_Transaction_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_TS_b2c+"</td><td>"+EG_TS_MobAnd+"</td><td>"+EG_TS_MobIos+"</td><td>"+EG_TS_Wego+"</td><td>"+EG_TS_skyscan+"</td><td>"+EG_TS_Other_TrancationSuccessfull+"</td><td>"+EG_TS_Transaction_Total+"</td></tr>"));

//Confirmation pending
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CP_b2c+"</td><td>"+Com_CP_MobAnd+"</td><td>"+Com_CP_MobIos+"</td><td>"+Com_CP_Wego+"</td><td>"+Com_CP_skyscan+"</td><td>"+ Com_CP_Other_conformation_pending+"</td><td>"+Com_CP_conformation_pending_Total+"</td><td rowspan=5>"+All_Confirmationpending_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_CP_b2c+"</td><td>"+AE_CP_MobAnd+"</td><td>"+AE_CP_MobIos+"</td><td>"+AE_CP_Wego+"</td><td>"+AE_CP_skyscan+"</td><td>"+AE_CP_Other_conformation_pending+"</td><td>"+AE_CP_conformation_pending_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_CP_b2c+"</td><td>"+SA_CP_MobAnd+"</td><td>"+SA_CP_MobIos+"</td><td>"+SA_CP_Wego+"</td><td>"+SA_CP_skyscan+"</td><td>"+SA_CP_Other_conformation_pending+"</td><td>"+SA_CP_conformation_pending_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_CP_b2c+"</td><td>"+EG_CP_MobAnd+"</td><td>"+EG_CP_MobIos+"</td><td>"+EG_CP_Wego+"</td><td>"+EG_CP_skyscan+"</td><td>"+EG_CP_Other_conformation_pending+"</td><td>"+EG_CP_conformation_pending_Total+"</td></tr>"));


//Repricing
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >REPRICING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_RP_b2c+"</td><td>"+Com_RP_MobAnd+"</td><td>"+Com_RP_MobIos+"</td><td>"+Com_RP_Wego+"</td><td>"+Com_RP_skyscan+"</td><td>"+ Com_RP_Other_Repricingtotal+"</td><td>"+Com_RP_Repricing_Total+"</td><td rowspan=5>"+All_Repricing_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_RP_b2c+"</td><td>"+AE_RP_MobAnd+"</td><td>"+AE_RP_MobIos+"</td><td>"+AE_RP_Wego+"</td><td>"+AE_RP_skyscan+"</td><td>"+AE_RP_Other_Repricingtotal+"</td><td>"+AE_RP_Repricing_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_RP_b2c+"</td><td>"+SA_RP_MobAnd+"</td><td>"+SA_RP_MobIos+"</td><td>"+SA_RP_Wego+"</td><td>"+SA_RP_skyscan+"</td><td>"+SA_RP_Other_Repricingtotal+"</td><td>"+SA_RP_Repricing_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_RP_b2c+"</td><td>"+EG_RP_MobAnd+"</td><td>"+EG_RP_MobIos+"</td><td>"+EG_RP_Wego+"</td><td>"+EG_RP_skyscan+"</td><td>"+EG_RP_Other_Repricingtotal+"</td><td>"+EG_RP_Repricing_Total+"</td></tr>"));



//SoldOuts

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >SOLDOUT</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_SD_b2c+"</td><td>"+Com_SD_MobAnd+"</td><td>"+Com_SD_MobIos+"</td><td>"+Com_SD_Wego+"</td><td>"+Com_SD_skyscan+"</td><td>"+Com_SD_Other_SoldOutstotal+"</td><td>"+Com_SD_SoldOut_Total+"</td><td rowspan=5>"+All_SoldOut_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_SD_b2c+"</td><td>"+AE_SD_MobAnd+"</td><td>"+AE_SD_MobIos+"</td><td>"+AE_SD_Wego+"</td><td>"+AE_SD_skyscan+"</td><td>"+AE_SD_Other_SoldOutstotal+"</td><td>"+AE_SD_SoldOut_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_SD_b2c+"</td><td>"+SA_SD_MobAnd+"</td><td>"+SA_SD_MobIos+"</td><td>"+SA_SD_Wego+"</td><td>"+SA_SD_skyscan+"</td><td>"+SA_SD_Other_SoldOutstotal+"</td><td>"+SA_SD_SoldOut_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_SD_b2c+"</td><td>"+EG_SD_MobAnd+"</td><td>"+EG_SD_MobIos+"</td><td>"+EG_SD_Wego+"</td><td>"+EG_SD_skyscan+"</td><td>"+EG_SD_Other_SoldOutstotal+"</td><td>"+EG_SD_SoldOut_Total+"</td></tr>"));




//Cancled
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CANCELLED</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CN_b2c+"</td><td>"+Com_CN_MobAnd+"</td><td>"+Com_CN_MobIos+"</td><td>"+Com_CN_Wego+"</td><td>"+Com_CN_skyscan+"</td><td>"+Com_CN_Other_CancelledTotal+"</td><td>"+Com_CN_CancelledTotal+"</td><td rowspan=5>"+All_Cancelled_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_CN_b2c+"</td><td>"+AE_CN_MobAnd+"</td><td>"+AE_CN_MobIos+"</td><td>"+AE_CN_Wego+"</td><td>"+AE_CN_skyscan+"</td><td>"+AE_CN_Other_CancelledTotal+"</td><td>"+AE_CN_CancelledTotal+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_CN_b2c+"</td><td>"+SA_CN_MobAnd+"</td><td>"+SA_CN_MobIos+"</td><td>"+SA_CN_Wego+"</td><td>"+SA_CN_skyscan+"</td><td>"+SA_CN_Other_CancelledTotal+"</td><td>"+SA_CN_CancelledTotal+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_CN_b2c+"</td><td>"+EG_CN_MobAnd+"</td><td>"+EG_CN_MobIos+"</td><td>"+EG_CN_Wego+"</td><td>"+EG_CN_skyscan+"</td><td>"+EG_CN_Other_CancelledTotal+"</td><td>"+EG_CN_CancelledTotal+"</td></tr>"));




//Trancation Hold

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION HOLD</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_TH_b2c+"</td><td>"+Com_TH_MobAnd+"</td><td>"+Com_TH_MobIos+"</td><td>"+Com_TH_Wego+"</td><td>"+Com_TH_skyscan+"</td><td>"+Com_Other_TH_Transactionhold_total+"</td><td>"+Com_TH_Transactionhold_total+"</td><td rowspan=5>"+All_TransactionHold_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_TH_b2c+"</td><td>"+AE_TH_MobAnd+"</td><td>"+AE_TH_MobIos+"</td><td>"+AE_TH_Wego+"</td><td>"+AE_TH_skyscan+"</td><td>"+AE_TH_Other_TransactionholdTotal+"</td><td>"+AE_TH_Transactionhold_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_TH_b2c+"</td><td>"+SA_TH_MobAnd+"</td><td>"+SA_TH_MobIos+"</td><td>"+SA_TH_Wego+"</td><td>"+SA_TH_skyscan+"</td><td>"+SA_TH_Other_TransactionholdTotal+"</td><td>"+SA_TH_Transactionhold_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_TH_b2c+"</td><td>"+EG_TH_MobAnd+"</td><td>"+EG_TH_MobIos+"</td><td>"+EG_TH_Wego+"</td><td>"+EG_TH_skyscan+"</td><td>"+EG_TH_Other_TransactionHoldTotal+"</td><td>"+EG_TH_Transactionhold_total+"</td></tr>"));

//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <td colspan=10> NOTE:--TS -- Transaction Successful ,SD -- Sold Out,CX -- Cancelled,TH -- Transaction Hold </td></tr>"));


email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));

email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= ##FF0000 class=table table-bordered style=border-color:black> Is Repriced  </tr>"));


email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 400 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center  ><tr align=LEFT bgcolor=#FF7C00 style=border-color:black;color:#ffffff><th STYLE=color:#ffffff colspan=10>REPRICED PNR's</th></tr>  <tr  align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff ><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));




//Is reprice-TS
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_TS_b2c+"</td><td>"+Isreprice_Com_TS_MobAnd+"</td><td>"+Isreprice_Com_TS_MobIos+"</td><td>"+Isreprice_Com_TS_Wego+"</td><td>"+Isreprice_Com_TS_skyscan+"</td><td>"+Isreprice_Com_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_Com_TS_Transaction_Total+"</td><td rowspan=5>"+IR_All_TransactionSuccess_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_TS_b2c+"</td><td>"+Isreprice_AE_TS_MobAnd+"</td><td>"+Isreprice_AE_TS_MobIos+"</td><td>"+Isreprice_AE_TS_Wego+"</td><td>"+Isreprice_AE_TS_skyscan+"</td><td>"+Isreprice_AE_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_AE_TS_Transaction_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_TS_b2c+"</td><td>"+Isreprice_SA_TS_MobAnd+"</td><td>"+Isreprice_SA_TS_MobIos+"</td><td>"+Isreprice_SA_TS_Wego+"</td><td>"+Isreprice_SA_TS_skyscan+"</td><td>"+Isreprice_SA_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_SA_TS_Transaction_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_TS_b2c+"</td><td>"+Isreprice_EG_TS_MobAnd+"</td><td>"+Isreprice_EG_TS_MobIos+"</td><td>"+Isreprice_EG_TS_Wego+"</td><td>"+Isreprice_EG_TS_skyscan+"</td><td>"+Isreprice_EG_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_EG_TS_Transaction_Total+"</td></tr>"));

//Is reprice-CP
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_CP_b2c+"</td><td>"+Isreprice_Com_CP_MobAnd+"</td><td>"+Isreprice_Com_CP_MobIos+"</td><td>"+Isreprice_Com_CP_Wego+"</td><td>"+Isreprice_Com_CP_skyscan+"</td><td>"+Isreprice_Com_CP_Other_ConformationPending+"</td><td>"+Isreprice_Com_CP_COnformationPending_Total+"</td><td rowspan=5>"+IR_All_ConformationPending_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_CP_b2c+"</td><td>"+Isreprice_AE_CP_MobAnd+"</td><td>"+Isreprice_AE_CP_MobIos+"</td><td>"+Isreprice_AE_CP_Wego+"</td><td>"+Isreprice_AE_CP_skyscan+"</td><td>"+Isreprice_AE_CP_Other_ConformationPending+"</td><td>"+Isreprice_AE_CP_COnformationPending_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_CP_b2c+"</td><td>"+Isreprice_SA_CP_MobAnd+"</td><td>"+Isreprice_SA_CP_MobIos+"</td><td>"+Isreprice_SA_CP_Wego+"</td><td>"+Isreprice_SA_CP_skyscan+"</td><td>"+Isreprice_SA_CP_Other_ConformationPending+"</td><td>"+Isreprice_SA_CP_COnformationPending_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_CP_b2c+"</td><td>"+Isreprice_EG_CP_MobAnd+"</td><td>"+Isreprice_EG_CP_MobIos+"</td><td>"+Isreprice_EG_CP_Wego+"</td><td>"+Isreprice_EG_CP_skyscan+"</td><td>"+Isreprice_EG_CP_Other_ConformationPending+"</td><td>"+Isreprice_EG_CP_COnformationPending_Total+"</td></tr>"));

//Is reprice-PT
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >PARTIALLY TICKETED</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_PT_b2c+"</td><td>"+Isreprice_Com_PT_MobAnd+"</td><td>"+Isreprice_Com_PT_MobIos+"</td><td>"+Isreprice_Com_PT_Wego+"</td><td>"+Isreprice_Com_PT_skyscan+"</td><td>"+Isreprice_Com_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_Com_PT_PartiallyTicketed_Total+"</td><td rowspan=5>"+IR_All_PartillyTicket_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_PT_b2c+"</td><td>"+Isreprice_AE_PT_MobAnd+"</td><td>"+Isreprice_AE_PT_MobIos+"</td><td>"+Isreprice_AE_PT_Wego+"</td><td>"+Isreprice_AE_PT_skyscan+"</td><td>"+Isreprice_AE_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_AE_PT_PartiallyTicketed_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_PT_b2c+"</td><td>"+Isreprice_SA_PT_MobAnd+"</td><td>"+Isreprice_SA_PT_MobIos+"</td><td>"+Isreprice_SA_PT_Wego+"</td><td>"+Isreprice_SA_PT_skyscan+"</td><td>"+Isreprice_SA_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_SA_PT_PartiallyTicketed_Total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_PT_b2c+"</td><td>"+Isreprice_EG_PT_MobAnd+"</td><td>"+Isreprice_EG_PT_MobIos+"</td><td>"+Isreprice_EG_PT_Wego+"</td><td>"+Isreprice_EG_PT_skyscan+"</td><td>"+Isreprice_EG_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_EG_PT_PartiallyTicketed_Total+"</td></tr>"));

//Is reprice-TH

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION HOLD</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_TH_b2c+"</td><td>"+Isreprice_Com_TH_MobAnd+"</td><td>"+Isreprice_Com_TH_MobIos+"</td><td>"+Isreprice_Com_TH_Wego+"</td><td>"+Isreprice_Com_TH_skyscan+"</td><td>"+Isreprice_Com_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_Com_TH_Transactionhold_total+"</td><td rowspan=5>"+IR_All_TrancationHold_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_TH_b2c+"</td><td>"+Isreprice_AE_TH_MobAnd+"</td><td>"+Isreprice_AE_TH_MobIos+"</td><td>"+Isreprice_AE_TH_Wego+"</td><td>"+Isreprice_AE_TH_skyscan+"</td><td>"+Isreprice_AE_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_AE_TH_Transactionhold_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_TH_b2c+"</td><td>"+Isreprice_SA_TH_MobAnd+"</td><td>"+Isreprice_SA_TH_MobIos+"</td><td>"+Isreprice_SA_TH_Wego+"</td><td>"+Isreprice_SA_TH_skyscan+"</td><td>"+Isreprice_SA_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_SA_TH_Transactionhold_total+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_TH_b2c+"</td><td>"+Isreprice_EG_TH_MobAnd+"</td><td>"+Isreprice_EG_TH_MobIos+"</td><td>"+Isreprice_EG_TH_Wego+"</td><td>"+Isreprice_EG_TH_skyscan+"</td><td>"+Isreprice_EG_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_EG_TH_Transactionhold_total+"</td></tr>"));










/*email.addTo("Sreenivas.bodige@rehlat.com");
email.addCc("amanpreet@rehlat.com");
email.addCc("dinesh.kodiguti@rehlat.com");
email.addCc("avinash.ambati@rehlat.com");
email.addCc("ramesh.g@rehlat.com");
email.addCc("laxman.pagadala@rehlat.com");
email.addCc("ahmed.syed@rehlat.com");
email.addCc("abdul.khan@rehlat.com");
email.addCc("abhaypratap.singh@rehlat.com");
email.addCc("qateam@rehlat.com");
email.addCc("brteam@rehlat.com");	
email.addCc("mobileapp@rehlat.com");
email.addCc("rajashekar.uppu@rehlat.com");
email.addCc("lakshmi.amaraneni@rehlat.com");
*/
	


email.addTo("naga.ch199@gmail.com");


System.out.println("3");
email.send();
System.out.println("END");



















}

public void getValues() throws IOException, RowsExceededException, WriteException
{
	
	WritableWorkbook wwb;
	WritableSheet ws;
	

	FileOutputStream fo = new FileOutputStream("C:/DailyXLReports/Report_"+timestamp()+".xls");
	wwb = Workbook.createWorkbook(fo);
	ws = wwb.createSheet("Results", 0);
	String trs = Integer.toString(All_TransactionSuccess_total);
	String rep = Integer.toString(All_Repricing_total);
	Label l = new Label(0, 1,trs );
	Label l1 = new Label(0, 2,rep );
	ws.addCell(l);
	ws.addCell(l1);
	wwb.write();
	wwb.close();
}
public String timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd hh a").format(new Date());
}
}
