package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.testng.annotations.Test;

import AppModules.Repricing_TH_CP_HTML_Reports;
import AppModules.Repricing_TH_CP_Reports;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import utility.Utils;

public class Report_12PM {
	String toDayDate;
	String toDayDate1;
	String toDayDate2;
	String toDayDate3;
	String toDayDate4;
	String toDayDate5;
	String toDayDate6;
	
	String First2_y;
	String First3_y;
	String First4_y;
	String First5_y;
	String First6_y;
	String First7_y;
	
	String First1;
	String First2;
	String First3;
	String First4;
	String First5;
	String First6;
	String First7;
	
	String Second1;
	String Second2;
	String Second3;
	String Second4;
	String Second5;
	String Second6;
	String Second7;
	
	
	@Test
	public void Report_12_30PM() throws Exception
	{
		
		//To day 12:30 Report
				DateFormat Formate_10 = new SimpleDateFormat("dd_MM_yyyy");
				Date d_10 = new Date();
				System.out.println(Formate_10.format(d_10));
				String ToDay_10 = Formate_10.format(d_10);
				 toDayDate = ToDay_10.replace("_", "-");
				System.out.println(toDayDate);
				String[] SD_10 = ToDay_10.split("_");
				System.out.println("Split the Date::" + SD_10[0]);
				System.out.println("Split the month::" + SD_10[1]);
				System.out.println("Split the Year::" + SD_10[2]);
				System.out.println("C:/DailyXLReports/"+ToDay_10+"/Report_"+SD_10[0]+"_"+SD_10[1]+"_"+ SD_10[2]+" 12 PM.xls");
				
				System.out.println("naga");
				FileInputStream file1 = new FileInputStream("C:/DailyXLReports/"+ToDay_10+"/Report_"+SD_10[0]+"_"+ SD_10[1]+"_"+ SD_10[2]+" 12 PM.xls");
				Workbook wb1 = Workbook.getWorkbook(file1);
				Sheet sheet1 = wb1.getSheet("Results");
				
				 First1=sheet1.getCell(0, 1).getContents();
				 Second1=sheet1.getCell(0, 2).getContents();
				System.out.println(First1);
				System.out.println(Second1);
				
				//Last week 12:30 Report
				Calendar cal = Calendar.getInstance();
				DateFormat lastweek = new SimpleDateFormat("dd_MM_yyyy");
		        cal.add(Calendar.DATE, -7);
		        Date TO1 = cal.getTime();
		       System.out.println(lastweek.format(TO1));
		       String st = lastweek.format(TO1);
		        toDayDate1 = st.replace("_", "-");
		       String LDate1 = lastweek.format(TO1);
		       String[] SD = st.split("_");
				System.out.println("Split the Date::" + SD[0]);
				System.out.println("Split the month::" + SD[1]);
				System.out.println("Split the Year::" + SD[2]);
		       
		       System.out.println("lastDates  is "+LDate1);
		       System.out.println("C:/DailyXLReports/"+LDate1+"/Report_"+SD[0]+"_"+SD[1]+"_"+ SD[2]+" 12 PM.xls");
				FileInputStream file2 = new FileInputStream("C:/DailyXLReports/"+LDate1+"/Report_"+SD[0]+"_"+ SD[1]+"_"+ SD[2]+" 12 PM.xls");
				Workbook wb2 = Workbook.getWorkbook(file2);
				Sheet sheet2 = wb2.getSheet("Results");
				
				 First2=sheet2.getCell(0, 1).getContents();
				 Second2=sheet2.getCell(0, 2).getContents();
				System.out.println(First2);
				System.out.println(Second2);
				
				FileInputStream file2_y = new FileInputStream("C:/DailyXLReports/"+LDate1+"/Report_Yesterday.xls");
				Workbook wb2_y = Workbook.getWorkbook(file2_y);
				Sheet sheet2_y = wb2_y.getSheet("Results");
				
				 First2_y=sheet2_y.getCell(0, 1).getContents();
				System.out.println(First2_y);
				
				
				//2 weeks back 12:30 Report
						Calendar cal1 = Calendar.getInstance();
						DateFormat lastweek_2 = new SimpleDateFormat("dd_MM_yyyy");
				        cal1.add(Calendar.DATE, -14);
				        Date TO2 = cal1.getTime();
				       System.out.println(lastweek_2.format(TO2));
				       String st1 = lastweek_2.format(TO2);
				        toDayDate2 = st1.replace("_", "-");
				       String L_W_Date1 = lastweek_2.format(TO2);
				       String[] SD1 = st1.split("_");
						System.out.println("Split the Date::" + SD1[0]);
						System.out.println("Split the month::" + SD1[1]);
						System.out.println("Split the Year::" + SD1[2]);
				       
				       System.out.println("lastDates  is "+L_W_Date1);
				       System.out.println("C:/DailyXLReports/"+L_W_Date1+"/Report_"+SD1[0]+"_"+SD1[1]+"_"+ SD1[2]+" 12 PM.xls");
						FileInputStream file3 = new FileInputStream("C:/DailyXLReports/"+L_W_Date1+"/Report_"+SD1[0]+"_"+ SD1[1]+"_"+ SD1[2]+" 12 PM.xls");
						Workbook wb3 = Workbook.getWorkbook(file3);
						Sheet sheet3 = wb3.getSheet("Results");
						
						 First3=sheet3.getCell(0, 1).getContents();
						 Second3=sheet3.getCell(0, 2).getContents();
						System.out.println(First3);
						System.out.println(Second3);
						
						FileInputStream file3_y = new FileInputStream("C:/DailyXLReports/"+L_W_Date1+"/Report_Yesterday.xls");
						Workbook wb3_y = Workbook.getWorkbook(file3_y);
						Sheet sheet3_y = wb3_y.getSheet("Results");
						
						 First3_y=sheet3_y.getCell(0, 1).getContents();
						System.out.println(First3_y);
						
				
						//3 weeks back 12:30 Report
						Calendar cal2 = Calendar.getInstance();
						DateFormat lastweek_3 = new SimpleDateFormat("dd_MM_yyyy");
				        cal2.add(Calendar.DATE, -21);
				        Date TO3 = cal2.getTime();
				       System.out.println(lastweek_3.format(TO3));
				       String st2 = lastweek_3.format(TO3);
				        toDayDate3 = st2.replace("_", "-");
				       String L_W_Date2 = lastweek_3.format(TO3);
				       String[] SD2 = st2.split("_");
						System.out.println("Split the Date::" + SD2[0]);
						System.out.println("Split the month::" + SD2[1]);
						System.out.println("Split the Year::" + SD2[2]);
				       
				       System.out.println("lastDates  is "+L_W_Date2);
				       System.out.println("C:/DailyXLReports/"+L_W_Date2+"/Report_"+SD2[0]+"_"+SD2[1]+"_"+ SD2[2]+" 12 PM.xls");
						FileInputStream file4 = new FileInputStream("C:/DailyXLReports/"+L_W_Date2+"/Report_"+SD2[0]+"_"+ SD2[1]+"_"+ SD2[2]+" 12 PM.xls");
						Workbook wb4 = Workbook.getWorkbook(file4);
						Sheet sheet4 = wb4.getSheet("Results");
						
						 First4=sheet4.getCell(0, 1).getContents();
						 Second4=sheet4.getCell(0, 2).getContents();
						System.out.println(First4);
						System.out.println(Second4);
			 
						FileInputStream file4_y = new FileInputStream("C:/DailyXLReports/"+L_W_Date2+"/Report_Yesterday.xls");
						Workbook wb4_y = Workbook.getWorkbook(file4_y);
						Sheet sheet4_y = wb4_y.getSheet("Results");
						
						 First4_y=sheet4_y.getCell(0, 1).getContents();
						System.out.println(First4_y);
						
						
						//4 weeks back 12:30 Report
						Calendar cal3 = Calendar.getInstance();
						DateFormat lastweek_4 = new SimpleDateFormat("dd_MM_yyyy");
				        cal3.add(Calendar.DATE, -28);
				        Date TO4 = cal3.getTime();
				       System.out.println(lastweek_4.format(TO4));
				       String st3 = lastweek_4.format(TO4);
				        toDayDate4 = st3.replace("_", "-");
				       String L_W_Date3 = lastweek_4.format(TO4);
				       String[] SD3 = st3.split("_");
						System.out.println("Split the Date::" + SD3[0]);
						System.out.println("Split the month::" + SD3[1]);
						System.out.println("Split the Year::" + SD3[2]);
				       
				       System.out.println("lastDates  is "+L_W_Date3);
				       System.out.println("C:/DailyXLReports/"+L_W_Date3+"/Report_"+SD3[0]+"_"+SD3[1]+"_"+ SD3[2]+" 12 PM.xls");
						FileInputStream file5 = new FileInputStream("C:/DailyXLReports/"+L_W_Date3+"/Report_"+SD3[0]+"_"+ SD3[1]+"_"+ SD3[2]+" 12 PM.xls");
						Workbook wb5 = Workbook.getWorkbook(file5);
						Sheet sheet5 = wb5.getSheet("Results");
						
						 First5=sheet5.getCell(0, 1).getContents();
						 Second5=sheet5.getCell(0, 2).getContents();
						System.out.println(First5);
						System.out.println(Second5);
						
						FileInputStream file5_y = new FileInputStream("C:/DailyXLReports/"+L_W_Date3+"/Report_Yesterday.xls");
						Workbook wb5_y = Workbook.getWorkbook(file5_y);
						Sheet sheet5_y = wb5_y.getSheet("Results");
						
						 First5_y=sheet5_y.getCell(0, 1).getContents();
						System.out.println(First5_y);
						
						
						//5 weeks back 12:30 Report
						Calendar cal4 = Calendar.getInstance();
						DateFormat lastweek_5 = new SimpleDateFormat("dd_MM_yyyy");
				        cal4.add(Calendar.DATE, -35);
				        Date TO5 = cal4.getTime();
				       System.out.println(lastweek_5.format(TO5));
				       String st4 = lastweek_5.format(TO5);
				        toDayDate5 = st4.replace("_", "-");
				       String L_W_Date4 = lastweek_5.format(TO5);
				       String[] SD4 = st4.split("_");
						System.out.println("Split the Date::" + SD4[0]);
						System.out.println("Split the month::" + SD4[1]);
						System.out.println("Split the Year::" + SD4[2]);
				       
				       System.out.println("lastDates  is "+L_W_Date4);
				       System.out.println("C:/DailyXLReports/"+L_W_Date4+"/Report_"+SD4[0]+"_"+SD4[1]+"_"+ SD4[2]+" 12 PM.xls");
						FileInputStream file6 = new FileInputStream("C:/DailyXLReports/"+L_W_Date4+"/Report_"+SD4[0]+"_"+ SD4[1]+"_"+ SD4[2]+" 12 PM.xls");
						Workbook wb6 = Workbook.getWorkbook(file6);
						Sheet sheet6 = wb6.getSheet("Results");
						
						 First6=sheet6.getCell(0, 1).getContents();
						 Second6=sheet6.getCell(0, 2).getContents();
						System.out.println(First6);
						System.out.println(Second6);
						
						FileInputStream file6_y = new FileInputStream("C:/DailyXLReports/"+L_W_Date4+"/Report_Yesterday.xls");
						Workbook wb6_y = Workbook.getWorkbook(file6_y);
						Sheet sheet6_y = wb6_y.getSheet("Results");
						
						 First6_y=sheet6_y.getCell(0, 1).getContents();
						System.out.println(First6_y);
						
						
						//6 weeks back 12:30 Report
						Calendar cal5 = Calendar.getInstance();
						DateFormat lastweek_6 = new SimpleDateFormat("dd_MM_yyyy");
				        cal5.add(Calendar.DATE, -42);
				        Date TO6 = cal5.getTime();
				       System.out.println(lastweek_6.format(TO6));
				       String st5 = lastweek_6.format(TO6);
				        toDayDate6 = st5.replace("_", "-");
				       String L_W_Date5 = lastweek_6.format(TO6);
				       String[] SD5 = st5.split("_");
						System.out.println("Split the Date::" + SD5[0]);
						System.out.println("Split the month::" + SD5[1]);
						System.out.println("Split the Year::" + SD5[2]);
				       
				       System.out.println("lastDates  is "+L_W_Date5);
				       System.out.println("C:/DailyXLReports/"+L_W_Date5+"/Report_"+SD5[0]+"_"+SD5[1]+"_"+ SD5[2]+" 12 PM.xls");
						FileInputStream file7 = new FileInputStream("C:/DailyXLReports/"+L_W_Date5+"/Report_"+SD5[0]+"_"+ SD5[1]+"_"+ SD5[2]+" 12 PM.xls");
						Workbook wb7 = Workbook.getWorkbook(file7);
						Sheet sheet7 = wb7.getSheet("Results");
						
						 First7=sheet7.getCell(0, 1).getContents();
						 Second7=sheet7.getCell(0, 2).getContents();
						System.out.println(First7);
						System.out.println(Second7);
						
						FileInputStream file7_y = new FileInputStream("C:/DailyXLReports/"+L_W_Date5+"/Report_Yesterday.xls");
						Workbook wb7_y = Workbook.getWorkbook(file7_y);
						Sheet sheet7_y = wb7_y.getSheet("Results");
						
						 First7_y=sheet7_y.getCell(0, 1).getContents();
						System.out.println(First7_y);
						
						html_table_for_12PM();
						
				
				
	}
	
	public void html_table_for_12PM() throws EmailException
	{
		
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
		email.setSubject("Flights Booking Status Difference Report @12:30 PM");
		System.out.println("2");
		
		int f1=Integer.parseInt(First1)+Integer.parseInt(Second1);
		int f2=Integer.parseInt(First2)+Integer.parseInt(Second2);
		int f3=Integer.parseInt(First3)+Integer.parseInt(Second3);
		int f4=Integer.parseInt(First4)+Integer.parseInt(Second4);
		int f5=Integer.parseInt(First5)+Integer.parseInt(Second5);
		int f6=Integer.parseInt(First6)+Integer.parseInt(Second6);
		int f7=Integer.parseInt(First7)+Integer.parseInt(Second7);
		
	 int L1=f1-f2;
	 int L2=f1-f3;
	 int L3=f1-f4;
	 int L4=f1-f5;
	 int L5=f1-f6;
	 int L6=f1-f7;
	 String neg1;
	 String neg2;
	 String neg3;
	 String neg4;
	 String neg5;
	 String neg6;
	 
	 if(L1>-1)
	 {
		 System.out.println(L1);
		  neg1="#2ECC71";
	 }
	 else
	 {
		 System.out.println("neg");
		  neg1="#FFD700";
	 }
	 if(L2>-1)
	 {
		 System.out.println(L2);
		  neg2="#2ECC71";
	 }
	 else
	 {
		 System.out.println("neg");
		  neg2="#FFD700";
	 }
	 if(L3>-1)
	 {
		 System.out.println(L3);
		  neg3="#2ECC71";
	 }
	 else
	 {
		 System.out.println("neg");
		  neg3="#FFD700";
	 }
	 if(L4>-1)
	 {
		 System.out.println(L4);
		  neg4="#2ECC71";
	 }
	 else
	 {
		 System.out.println("neg");
		  neg4="#FFD700";
	 }
	 if(L5>-1)
	 {
		 System.out.println(L5);
		  neg5="#2ECC71";
	 }
	 else
	 {
		 System.out.println("neg");
		  neg5="#FFD700";
	 }
	 if(L6>-1)
	 {
		 System.out.println(L6);
		  neg6="#2ECC71";
	 }
	 else
	 {
		 System.out.println("neg");
		  neg6="#FFD700";
	 }

		StringBuilder htmlStringBuilder=new StringBuilder();
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 800 height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th> </th><th>"+toDayDate+"</th> <th>"+toDayDate6+"</th> <th>"+toDayDate5+"</th><th>"+toDayDate4+"</th><th>"+toDayDate3+"</th> <th>"+toDayDate2+"</th> <th>"+toDayDate1+"</th> </tr> "));

		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #BB8FCE class=table table-bordered style=border-color:black><td>Total Bookings</td><td>NA</td> <td>"+First7_y+"</td><td>"+First6_y+"</td><td>"+First5_y+"</td><td>"+First4_y+"</td><td>"+First3_y+"</td><td>"+First2_y+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFFFF class=table table-bordered style=border-color:black><td>TXNS</td><td>"+First1+"</td> <td>"+First7+"</td><td>"+First6+"</td><td>"+First5+"</td><td>"+First4+"</td><td>"+First3+"</td><td>"+First2+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFFFF class=table table-bordered style=border-color:black><td>REPR</td><td>"+Second1+"</td> <td>"+Second7+"</td><td>"+Second6+"</td><td>"+Second5+"</td><td>"+Second4+"</td><td>"+Second3+"</td><td>"+Second2+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Running Total</td><td>"+f1+"</td> <td>"+f7+"</td><td>"+f6+"</td><td>"+f5+"</td><td>"+f4+"</td><td>"+f3+"</td><td>"+f2+"</td></tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #2ECC71 class=table table-bordered style=border-color:black><td>Leading</td><td> </td> <td bgcolor="+neg6+">"+L6+"</td><td bgcolor="+neg5+">"+L5+"</td><td bgcolor="+neg4+">"+L4+"</td><td bgcolor="+neg3+">"+L3+"</td><td bgcolor="+neg2+">"+L2+"</td><td bgcolor="+neg1+">"+L1+"</td></tr>"));
		
		
		System.out.println("3");
		email.addTo("naga.ch199@gmail.com");
		email.send();
		System.out.println("END");
	}
}
