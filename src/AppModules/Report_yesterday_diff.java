package AppModules;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import utility.Utils;
import utility.differentPageReports;




public class Report_yesterday_diff extends differentPageReports {
	static String NA="00";

	static String Today_count_T;
	static String Today_count_R;
	static String Oneweeklast_count_T;
	static String Oneweeklast_count_R;
	static String Twoweekslast_count_T;
	static String Twoweekslast_count_R;
	static String Threeweekslast_count_T;
	static String Threeweekslast_count_R;
	static String fourweekslast_count_T;
	static String fourweekslast_count_R;
	static String fiveweekslast_count_T;
	static String fiveweekslast_count_R;
	static String sixweekslast_count_T;
	static String sixweekslast_count_R;
	
	static String yesterdayDate;
	static String toDayDate1;
	static String toDayDate2;
	static String toDayDate3;
	static String toDayDate4;
	static String toDayDate5;
	static String toDayDate6;
	
	public static void Yesterday_Report() throws Exception {
		//Yesterday Report
		Calendar cal_y = Calendar.getInstance();
		DateFormat lastday = new SimpleDateFormat("dd_MMM_yyyy");
        cal_y.add(Calendar.DATE, -1);
        Date TO1_y = cal_y.getTime();
       System.out.println(lastday.format(TO1_y));
       String st_y = lastday.format(TO1_y);
       yesterdayDate = st_y.replace("_", "-");
       String Yes_date = lastday.format(TO1_y);
       String[] SD_Yes = st_y.split("_");
		System.out.println("Split the Date::" + SD_Yes[0]);
		System.out.println("Split the month::" + SD_Yes[1]);
		System.out.println("Split the Year::" + SD_Yes[2]);
		System.out.println("C:/DailyXLReports/"+SD_Yes[2]+"/"+SD_Yes[1]+"/"+Yes_date+"/Report_Yesterday.xls");
		
				try{
					FileInputStream file2_y = new FileInputStream("C:/DailyXLReports/"+SD_Yes[2]+"/"+SD_Yes[1]+"/"+Yes_date+"/Report_Yesterday.xls");
					Workbook wb2_y = Workbook.getWorkbook(file2_y);
					Sheet sheet2_y = wb2_y.getSheet("Results");
					 Today_count_T=sheet2_y.getCell(0, 1).getContents();
					 Today_count_R=sheet2_y.getCell(0, 2).getContents();
					System.out.println(Today_count_T);
					System.out.println(Today_count_R);
			       }catch(Exception e){
			    	    Today_count_T=NA;
			    	    Today_count_R=NA;
						
			        }
		//Last week  Report
				Calendar cal = Calendar.getInstance();
				DateFormat lastweek = new SimpleDateFormat("dd_MMM_yyyy");
		        cal.add(Calendar.DATE, -8);
		        Date TO1 = cal.getTime();
		       System.out.println(lastweek.format(TO1));
		       String st = lastweek.format(TO1);
		        toDayDate1 = st.replace("_", "-");
		       String LDate1 = lastweek.format(TO1);
		       String[] SD = st.split("_");
				System.out.println("Split the Date::" + SD[0]);
				System.out.println("Split the month::" + SD[1]);
				System.out.println("Split the Year::" + SD[2]);
				System.out.println("C:/DailyXLReports/"+SD[2]+"/"+SD[1]+"/"+LDate1+"/Report_Yesterday.xls");
		try{
		FileInputStream file2_y = new FileInputStream("C:/DailyXLReports/"+SD[2]+"/"+SD[1]+"/"+LDate1+"/Report_Yesterday.xls");
		Workbook wb2_y = Workbook.getWorkbook(file2_y);
		Sheet sheet2_y = wb2_y.getSheet("Results");
		 Oneweeklast_count_T=sheet2_y.getCell(0, 1).getContents();
		 Oneweeklast_count_R=sheet2_y.getCell(0, 2).getContents();
		
       }catch(Exception e){
    	    Oneweeklast_count_T=NA;
    	    Oneweeklast_count_R=NA;
			
        }
		//2 weeks back  Report
		Calendar cal1 = Calendar.getInstance();
		DateFormat lastweek_2 = new SimpleDateFormat("dd_MMM_yyyy");
        cal1.add(Calendar.DATE, -15);
        Date TO2 = cal1.getTime();
       System.out.println(lastweek_2.format(TO2));
       String st1 = lastweek_2.format(TO2);
        toDayDate2 = st1.replace("_", "-");
       String L_W_Date1 = lastweek_2.format(TO2);
       String[] SD1 = st1.split("_");
		System.out.println("Split the Date::" + SD1[0]);
		System.out.println("Split the month::" + SD1[1]);
		System.out.println("Split the Year::" + SD1[2]);
		System.out.println("C:/DailyXLReports/"+SD1[2]+"/"+SD1[1]+"/"+L_W_Date1+"/Report_Yesterday.xls");
		
		try{
			FileInputStream file3_y = new FileInputStream("C:/DailyXLReports/"+SD1[2]+"/"+SD1[1]+"/"+L_W_Date1+"/Report_Yesterday.xls");
			Workbook wb3_y = Workbook.getWorkbook(file3_y);
			Sheet sheet3_y = wb3_y.getSheet("Results");
			 Twoweekslast_count_T=sheet3_y.getCell(0, 1).getContents();
			 Twoweekslast_count_R=sheet3_y.getCell(0, 2).getContents();
			
			}
			catch(Exception e){
				 Twoweekslast_count_T=NA;
				 Twoweekslast_count_R=NA;
				
            }
		//3 weeks back Report
		Calendar cal2 = Calendar.getInstance();
		DateFormat lastweek_3 = new SimpleDateFormat("dd_MMM_yyyy");
        cal2.add(Calendar.DATE, -22);
        Date TO3 = cal2.getTime();
       System.out.println(lastweek_3.format(TO3));
       String st2 = lastweek_3.format(TO3);
        toDayDate3 = st2.replace("_", "-");
       String L_W_Date2 = lastweek_3.format(TO3);
       String[] SD2 = st2.split("_");
		System.out.println("Split the Date::" + SD2[0]);
		System.out.println("Split the month::" + SD2[1]);
		System.out.println("Split the Year::" + SD2[2]);
		System.out.println("C:/DailyXLReports/"+SD2[2]+"/"+SD2[1]+"/"+L_W_Date2+"/Report_Yesterday.xls");
		
		try{
			FileInputStream file4_y = new FileInputStream("C:/DailyXLReports/"+SD2[2]+"/"+SD2[1]+"/"+L_W_Date2+"/Report_Yesterday.xls");
			Workbook wb4_y = Workbook.getWorkbook(file4_y);
			Sheet sheet4_y = wb4_y.getSheet("Results");
			 Threeweekslast_count_T=sheet4_y.getCell(0, 1).getContents();
			 Threeweekslast_count_R=sheet4_y.getCell(0, 2).getContents();
			
			}
			catch(Exception e){
				 Threeweekslast_count_T=NA;
				 Threeweekslast_count_R=NA;
				
            }
		
		//4 weeks back  Report
		Calendar cal3 = Calendar.getInstance();
		DateFormat lastweek_4 = new SimpleDateFormat("dd_MMM_yyyy");
        cal3.add(Calendar.DATE, -29);
        Date TO4 = cal3.getTime();
       System.out.println(lastweek_4.format(TO4));
       String st3 = lastweek_4.format(TO4);
        toDayDate4 = st3.replace("_", "-");
       String L_W_Date3 = lastweek_4.format(TO4);
       String[] SD3 = st3.split("_");
		System.out.println("Split the Date::" + SD3[0]);
		System.out.println("Split the month::" + SD3[1]);
		System.out.println("Split the Year::" + SD3[2]);
		System.out.println("C:/DailyXLReports/"+SD3[2]+"/"+SD3[1]+"/"+L_W_Date3+"/Report_Yesterday.xls");
		try{
			FileInputStream file5_y = new FileInputStream("C:/DailyXLReports/"+SD3[2]+"/"+SD3[1]+"/"+L_W_Date3+"/Report_Yesterday.xls");
			Workbook wb5_y = Workbook.getWorkbook(file5_y);
			Sheet sheet5_y = wb5_y.getSheet("Results");
			 fourweekslast_count_T=sheet5_y.getCell(0, 1).getContents();
			 fourweekslast_count_R=sheet5_y.getCell(0, 2).getContents();
			
			}
			catch(Exception e){
				 fourweekslast_count_T=NA;
				 fourweekslast_count_R=NA;
				}
		
		//5 weeks back Report
		Calendar cal4 = Calendar.getInstance();
		DateFormat lastweek_5 = new SimpleDateFormat("dd_MMM_yyyy");
        cal4.add(Calendar.DATE, -36);
        Date TO5 = cal4.getTime();
       System.out.println(lastweek_5.format(TO5));
       String st4 = lastweek_5.format(TO5);
        toDayDate5 = st4.replace("_", "-");
       String L_W_Date4 = lastweek_5.format(TO5);
       String[] SD4 = st4.split("_");
		System.out.println("Split the Date::" + SD4[0]);
		System.out.println("Split the month::" + SD4[1]);
		System.out.println("Split the Year::" + SD4[2]);
		System.out.println("C:/DailyXLReports/"+SD4[2]+"/"+SD4[1]+"/"+L_W_Date4+"/Report_Yesterday.xls");
		try{
			FileInputStream file6_y = new FileInputStream("C:/DailyXLReports/"+SD4[2]+"/"+SD4[1]+"/"+L_W_Date4+"/Report_Yesterday.xls");
			Workbook wb6_y = Workbook.getWorkbook(file6_y);
			Sheet sheet6_y = wb6_y.getSheet("Results");
			 fiveweekslast_count_T=sheet6_y.getCell(0, 1).getContents();
			 fiveweekslast_count_R=sheet6_y.getCell(0, 2).getContents();
			
			}
			catch(Exception e){
				 fiveweekslast_count_T=NA;
				 fiveweekslast_count_R=NA;
			}
		
		//6 weeks back Report
		Calendar cal5 = Calendar.getInstance();
		DateFormat lastweek_6 = new SimpleDateFormat("dd_MMM_yyyy");
        cal5.add(Calendar.DATE, -43);
        Date TO6 = cal5.getTime();
       System.out.println(lastweek_6.format(TO6));
       String st5 = lastweek_6.format(TO6);
         toDayDate6 = st5.replace("_", "-");
       String L_W_Date5 = lastweek_6.format(TO6);
       String[] SD5 = st5.split("_");
		System.out.println("Split the Date::" + SD5[0]);
		System.out.println("Split the month::" + SD5[1]);
		System.out.println("Split the Year::" + SD5[2]);
		System.out.println("C:/DailyXLReports/"+SD5[2]+"/"+SD5[1]+"/"+L_W_Date5+"/Report_Yesterday.xls");
		try{
			FileInputStream file7_y = new FileInputStream("C:/DailyXLReports/"+SD5[2]+"/"+SD5[1]+"/"+L_W_Date5+"/Report_Yesterday.xls");
			Workbook wb7_y = Workbook.getWorkbook(file7_y);
			Sheet sheet7_y = wb7_y.getSheet("Results");
			 sixweekslast_count_T=sheet7_y.getCell(0, 1).getContents();
			 sixweekslast_count_R=sheet7_y.getCell(0, 2).getContents();
			
			}
			catch(Exception e){
				 sixweekslast_count_T=NA;
				 sixweekslast_count_R=NA;
				
            }

	}

	
	public static void yesterday_deviation_Report() {

		// Yesterday 8:30PM Report(Yesterday Reports)
		Calendar cal_y = Calendar.getInstance();
		DateFormat lastday = new SimpleDateFormat("dd_MMM_yyyy");
		cal_y.add(Calendar.DATE, -1);
		Date TO1_y = cal_y.getTime();
		System.out.println(lastday.format(TO1_y));
		String st_y = lastday.format(TO1_y);
		String R8AM_toDayDate1 = st_y.replace("_", "-");
		String LDate1_Y = lastday.format(TO1_y);
		String[] SD_Y = st_y.split("_");
		System.out.println("Split the Date::" + SD_Y[0]);
		System.out.println("Split the month::" + SD_Y[1]);
		System.out.println("Split the Year::" + SD_Y[2]);

		System.out.println("lastDates  is " + LDate1_Y);
		System.out.println("C:/DailyXLReports/" + SD_Y[2] + "/" + SD_Y[1] + "/" + LDate1_Y + "/Report_Yesterday.xls");

		try {
			differentPageReports.Yesterday_deviation_Report("C:/DailyXLReports/" + SD_Y[2] + "/" + SD_Y[1] + "/" + LDate1_Y + "/Report_Yesterday.xls",4,5,6,7);

		} catch (Exception e) {

		}

		// Last week 8:30PM Report(Yesterday Reports)
		Calendar cal = Calendar.getInstance();
		DateFormat lastweek = new SimpleDateFormat("dd_MMM_yyyy");
		cal.add(Calendar.DATE, -8);
		Date TO1 = cal.getTime();
		System.out.println(lastweek.format(TO1));
		String st = lastweek.format(TO1);
		String R8AM_toDayDate = st.replace("_", "-");
		String LDate1 = lastweek.format(TO1);
		String[] SD = st.split("_");
		System.out.println("Split the Date::" + SD[0]);
		System.out.println("Split the month::" + SD[1]);
		System.out.println("Split the Year::" + SD[2]);

		System.out.println("lastDates  is " + LDate1);
		System.out.println("C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_Yesterday.xls");

		try {

			
			differentPageReports.Yesterday_deviation_Report_Lastweek("C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_Yesterday.xls", 4, 5, 6, 7);
			

		} catch (Exception e) {

		}
	}
	
	public static void SoldOutPercentage_Report()
	{
		//Yesterday
		Calendar cal_y = Calendar.getInstance();
		DateFormat lastday = new SimpleDateFormat("dd_MMM_yyyy");
		cal_y.add(Calendar.DATE, -1);
		Date TO1_y = cal_y.getTime();
		System.out.println(lastday.format(TO1_y));
		String st_y = lastday.format(TO1_y);
		String R8AM_toDayDate1 = st_y.replace("_", "-");
		String LDate1_Y = lastday.format(TO1_y);
		String[] SD_Y = st_y.split("_");
		System.out.println("Split the Date::" + SD_Y[0]);
		System.out.println("Split the month::" + SD_Y[1]);
		System.out.println("Split the Year::" + SD_Y[2]);

		System.out.println("lastDates  is " + LDate1_Y);
		System.out.println("C:/DailyXLReports/" + SD_Y[2] + "/" + SD_Y[1] + "/" + LDate1_Y + "/Report_Yesterday.xls");

		
		try{
			differentPageReports.SoldOut_Percentage("C:/DailyXLReports/" + SD_Y[2] + "/" + SD_Y[1] + "/" + LDate1_Y + "/Report_Yesterday.xls",9,10,11,12);
			
		}
		catch(Exception e){
			
        }
	}
	
	public static void html_table_for_Yesterday() throws EmailException
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
		  email.setSubject("Flights Booking Status Difference Report :- Date: "+yesterdayDate+" - "+Utils.YesterdayName());
		System.out.println("2");
		
		differentPageReports.Yesterday_calculation_deviation_Report();
		SoldOutPercentage_Report();
		int Today_count_value=Integer.parseInt(Today_count_T)+Integer.parseInt(Today_count_R);
		int last_week_count_value=Integer.parseInt(Oneweeklast_count_T)+Integer.parseInt(Oneweeklast_count_R);
		int Two_week_count_value=Integer.parseInt(Twoweekslast_count_T)+Integer.parseInt(Twoweekslast_count_R);
		int Three_week_count_value=Integer.parseInt(Threeweekslast_count_T)+Integer.parseInt(Threeweekslast_count_R);
		int Four_week_count_value=Integer.parseInt(fourweekslast_count_T)+Integer.parseInt(fourweekslast_count_R);
		int Five_week_count_value=Integer.parseInt(fiveweekslast_count_T)+Integer.parseInt(fiveweekslast_count_R);
		int Six_week_count_value=Integer.parseInt(sixweekslast_count_T)+Integer.parseInt(sixweekslast_count_R);
		
		
		
		 int last_Week_Total=Today_count_value-last_week_count_value;
		 int Two_Weeks_Total=Today_count_value-Two_week_count_value;
		 int Three_Weeks_Total=Today_count_value-Three_week_count_value;
		 int Four_Weeks_Total=Today_count_value-Four_week_count_value;
		 int Five_Weeks_Total=Today_count_value-Five_week_count_value;
		 int Six_Weeks_Total=Today_count_value-Six_week_count_value;
		 
		 String last_Week_Total_color;
		 String two_Week_Total_color;
		 String three_Week_Total_color;
		 String four_Week_Total_color;
		 String five_Week_Total_color;
		 String six_Week_Total_color;
		 
		 
		 
		 if(last_Week_Total>-1)
		 {
			
			 last_Week_Total_color="#2ECC71";
		 }
		 else
		 {
			
			 last_Week_Total_color="#FFD700";
		 }
		 if(Two_Weeks_Total>-1)
		 {
			
			 two_Week_Total_color="#2ECC71";
		 }
		 else
		 {
			
			 two_Week_Total_color="#FFD700";
		 }
		 if(Three_Weeks_Total>-1)
		 {
			
			 three_Week_Total_color="#2ECC71";
		 }
		 else
		 {
			
			 three_Week_Total_color="#FFD700";
		 }
		 if(Four_Weeks_Total>-1)
		 {
			
			 four_Week_Total_color="#2ECC71";
		 }
		 else
		 {
			
			 four_Week_Total_color="#FFD700";
		 }
		 if(Five_Weeks_Total>-1)
		 {
			
			 five_Week_Total_color="#2ECC71";
		 }
		 else
		 {
			
			 five_Week_Total_color="#FFD700";
		 }
		 if(Six_Weeks_Total>-1)
		 {
			
			 six_Week_Total_color="#2ECC71";
		 }
		 else
		 {
			
			 six_Week_Total_color="#FFD700";
		 }
		
	
		StringBuilder htmlStringBuilder=new StringBuilder();
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Soldout Percentage Report<tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Please find the flight booking status report for "+yesterdayDate+"<tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 200 height = 50 cellpadding=2 border=1 cellspacing=2 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th colspan=2 scope=colgroup>Soldout Percentage</th></tr> "));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #F8C471>COM</td> <td bgcolor= #F8C471 style=color:"+com_sd_color+">"+Com_SD+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #F8C471>AE</td> <td bgcolor= #F8C471 style=color:"+AE_sd_color+">"+AE_SD+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #F8C471>SA</td> <td bgcolor= #F8C471 style=color:"+SA_sd_color+">"+SA_SD+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center  class=table table-bordered style=border-color:black><td bgcolor= #F8C471>EG</td> <td bgcolor= #F8C471 style=color:"+EG_sd_color+">"+EG_SD+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));
		
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr>Flights Deviation Report  <tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append(" <table width = 800 height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>COM</td> <td style=color:"+ com_b2c_color_yesterday + ">" + Com_b2c_value_yesterday + "</td><td style=color:" + com_Mobapp_color_yesterday + ">"+ Com_Mobapp_value_yesterday + "</td><td style=color:" + com_Mobios_color_yesterday + ">" + Com_Mobios_value_yesterday+ "</td><td style=color:" + com_Wego_color_yesterday + ">" + Com_wego_value_yesterday + "</td><td style=color:"+ com_Skyscan_color_yesterday + ">" + Com_Skyscan_value_yesterday + "</td><td style=color:" + com_Other_color_yesterday + ">"+ Com_other_value_yesterday + "</td><td style=color:" + com_total_color_yesterday + ">" + Com_total_yesterday+ "</td><td rowspan=5 style=color:" + ALL_values_color_yesterday + ">" + All_value_yesterday + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>AE</td> <td style=color:"+ AE_b2c_color_yesterday + ">" + AE_b2c_value_yesterday + "</td><td style=color:" + AE_Mobapp_color_yesterday + ">"+ AE_Mobapp_value_yesterday + "</td><td style=color:" + AE_Mobios_color_yesterday + ">" + AE_Mobios_value_yesterday+ "</td><td style=color:" + AE_Wego_color_yesterday + ">" + AE_wego_value_yesterday + "</td><td style=color:"+ AE_Skyscan_color_yesterday + ">" + AE_Skyscan_value_yesterday + "</td><td style=color:" + AE_Other_color_yesterday + ">"+ AE_other_value_yesterday + "</td><td style=color:" + AE_total_color_yesterday + ">" + AE_total_yesterday + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder	.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>SA</td> <td style=color:"+ SA_b2c_color_yesterday + ">" + SA_b2c_value_yesterday + "</td><td style=color:" + SA_Mobapp_color_yesterday + ">"+ SA_Mobapp_value_yesterday + "</td><td style=color:" + SA_Mobios_color_yesterday + ">" + SA_Mobios_value_yesterday+ "</td><td style=color:" + SA_Wego_color_yesterday + ">" + SA_wego_value_yesterday + "</td><td style=color:"+ SA_Skyscan_color_yesterday + ">" + SA_Skyscan_value_yesterday + "</td><td style=color:" + SA_Other_color_yesterday + ">"+ SA_other_value_yesterday + "</td><td style=color:" + SA_total_color_yesterday + ">" + SA_total_yesterday + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr align=center  class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>EG</td> <td style=color:"+ EG_b2c_color_yesterday + ">" + EG_b2c_value_yesterday + "</td><td style=color:" + EG_Mobapp_color_yesterday + ">"+ EG_Mobapp_value_yesterday + "</td><td style=color:" + EG_Mobios_color_yesterday + ">" + EG_Mobios_value_yesterday+ "</td><td style=color:" + EG_Wego_color_yesterday + ">" + EG_wego_value_yesterday + "</td><td style=color:"+ EG_Skyscan_color_yesterday + ">" + EG_Skyscan_value_yesterday + "</td><td style=color:" + EG_Other_color_yesterday + ">"+ EG_other_value_yesterday + "</td><td style=color:" + EG_total_color_yesterday + ">" + EG_total_yesterday + "</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr>    <tr>"));
		
		
		//Please find the flight booking status and deviation report for 
		email.setHtmlMsg(""+htmlStringBuilder.append("<table width = 800 height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th> </th><th>"+yesterdayDate+"</th> <th>"+toDayDate6+"</th> <th>"+toDayDate5+"</th><th>"+toDayDate4+"</th><th>"+toDayDate3+"</th> <th>"+toDayDate2+"</th> <th>"+toDayDate1+"</th> </tr> "));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #BB8FCE class=table table-bordered style=border-color:black><td>Total Bookings</td><td>"+Today_count_value+"</td> <td>"+Six_week_count_value+"</td><td>"+Five_week_count_value+"</td><td>"+Four_week_count_value+"</td><td>"+Three_week_count_value+"</td><td>"+Two_week_count_value+"</td><td>"+last_week_count_value+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFFFF class=table table-bordered style=border-color:black><td>TXNS</td><td>"+Today_count_T+"</td> <td>"+sixweekslast_count_T+"</td><td>"+fiveweekslast_count_T+"</td><td>"+fourweekslast_count_T+"</td><td>"+Threeweekslast_count_T+"</td><td>"+Twoweekslast_count_T+"</td><td>"+Oneweeklast_count_T+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFFFF class=table table-bordered style=border-color:black><td>REPR</td><td>"+Today_count_R+"</td> <td>"+sixweekslast_count_R+"</td><td>"+fiveweekslast_count_R+"</td><td>"+fourweekslast_count_R+"</td><td>"+Threeweekslast_count_R+"</td><td>"+Twoweekslast_count_R+"</td><td>"+Oneweeklast_count_R+"</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Running Total</td><td>"+Today_count_value+"</td> <td>"+Six_week_count_value+"</td><td>"+Five_week_count_value+"</td><td>"+Four_week_count_value+"</td><td>"+Three_week_count_value+"</td><td>"+Two_week_count_value+"</td><td>"+last_week_count_value+"</td></tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #2ECC71 class=table table-bordered style=border-color:black><td>Leading</td><td> </td> <td bgcolor="+six_Week_Total_color+">"+Six_Weeks_Total+"</td><td bgcolor="+five_Week_Total_color+">"+Five_Weeks_Total+"</td><td bgcolor="+four_Week_Total_color+">"+Four_Weeks_Total+"</td><td bgcolor="+three_Week_Total_color+">"+Three_Weeks_Total+"</td><td bgcolor="+two_Week_Total_color+">"+Two_Weeks_Total+"</td><td bgcolor="+last_Week_Total_color+">"+last_Week_Total+"</td></tr>"));
		
		
		
		
		
		System.out.println("3");
		
		email.addTo("tariqraza@rehlat.com");
		email.addCc("rajendra.purohit@rehlat.com");
		email.addCc("suresh.kakarlapudi@rehlat.com");
		email.addCc("sreenivas.bodige@rehlat.com");
		email.addCc("chaitanya.varigonda@rehlat.com");
		email.addCc("rajashekar.uppu@rehlat.com");
		email.addCc("veerendra.parvataneni@rehlat.com");
		email.addCc("lakshmi.amaraneni@rehlat.com");
		email.addCc("devi.kosuri@rehlat.com");
		email.addCc("kumar.uba@rehlat.com");
		email.addCc("suresh.kodithyala@rehlat.com");
		email.addCc("gopi.cherukumalli@rehlat.com");
		email.addCc("rekha.chintalapati@rehlat.com");
		
		//email.addTo("naga.ch199@gmail.com");
		email.send();
		System.out.println("END");
	}
}
