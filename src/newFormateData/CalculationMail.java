package newFormateData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utility.NewReportCal;
import utility.Utils;

public class CalculationMail extends NewReportCal {
	static String CureentFile;
	static String LastWekFile;
	
	public static void Report_Generate_Time(String Time) throws Exception {

		// To day 8:30 AM Report
		DateFormat Formate_10 = new SimpleDateFormat("dd_MMM_yyyy");
		Date d_10 = new Date();
		System.out.println(Formate_10.format(d_10));
		String ToDay_10 = Formate_10.format(d_10);
		String R8AM_toDayDate = ToDay_10.replace("_", "-");
		System.out.println(R8AM_toDayDate);
		String[] SD_10 = ToDay_10.split("_");
		System.out.println("Split the Date::" + SD_10[0]);
		System.out.println("Split the month::" + SD_10[1]);
		System.out.println("Split the Year::" + SD_10[2]);
		
		System.out.println("naga");

		System.out.println("C:/NewReports/" + SD_10[2] + "/" + SD_10[1] + "/" + ToDay_10 + "/Report_" + SD_10[0]
				+ "_" + SD_10[1] + "_" + SD_10[2] +" " +  Time+ ".xls");
		//08 AM
	
 CureentFile="C:/NewReports/" + SD_10[2] + "/" + SD_10[1] + "/" + ToDay_10 + "/Report_" + SD_10[0]
		+ "_" + SD_10[1] + "_" + SD_10[2] +" " +Time+ ".xls";
		
		

Calendar cal = Calendar.getInstance();
DateFormat lastweek = new SimpleDateFormat("dd_MMM_yyyy");
cal.add(Calendar.DATE, -7);
Date TO1 = cal.getTime();
System.out.println(lastweek.format(TO1));
String st = lastweek.format(TO1);
String lastday = st.replace("_", "-");
String LDate1 = lastweek.format(TO1);
String[] SD = st.split("_");
System.out.println("Split the Date::" + SD[0]);
System.out.println("Split the month::" + SD[1]);
System.out.println("Split the Year::" + SD[2]);

System.out.println("lastDates  is " + LDate1);
System.out.println("C:/NewReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_" + SD[0] + "_" + SD[1]
		+ "_" + SD[2] + " 08 AM.xls");

 LastWekFile="C:/NewReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_" + SD[0] + "_" + SD[1]
		+ "_" + SD[2] +" " +Time+ ".xls";


		wow_Growth_Cal(CureentFile,LastWekFile);


		
		System.out.println(Wow_Meta);
		System.out.println(Wow_B2C);
		System.out.println(Wow_MobApp);
		System.out.println(Wow_Others);
		System.out.println(Wow_ALL_Total);
		
		
		
		// 2 weeks back 8:30AM Report
		Calendar cal1 = Calendar.getInstance();
		DateFormat lastweek_2 = new SimpleDateFormat("dd_MMM_yyyy");
		cal1.add(Calendar.DATE, -14);
		Date TO2 = cal1.getTime();
		System.out.println(lastweek_2.format(TO2));
		String st1 = lastweek_2.format(TO2);
		String d = st1.replace("_", "-");
		String L_W_Date1 = lastweek_2.format(TO2);
		String[] SD1 = st1.split("_");
		System.out.println("Split the Date::" + SD1[0]);
		System.out.println("Split the month::" + SD1[1]);
		System.out.println("Split the Year::" + SD1[2]);

				System.out.println("lastDates  is " + L_W_Date1);
				System.out.println("C:/NewReports/" + SD1[2] + "/" + SD1[1] + "/" + L_W_Date1 + "/Report_" + SD1[0] + "_"
						+ SD1[1] + "_" + SD1[2] + " 08 AM.xls");
		
	String last_Two_Weeks_File=	"C:/NewReports/" + SD1[2] + "/" + SD1[1] + "/" + L_W_Date1 + "/Report_" + SD1[0] + "_"
			+ SD1[1] + "_" + SD1[2] +" " +Time+ ".xls";		
		
	
		wow2_Growth_Cal(CureentFile, last_Two_Weeks_File);
	
		
		System.out.println(Wow2_Meta);
		System.out.println(Wow2_B2C);
		System.out.println(Wow2_MobApp);
		System.out.println(Wow2_Others);
		System.out.println(Wow2_ALL_Total);
		
		
	}

	public static void html_table_Report() throws EmailException, BiffException, IOException {

		
		
		System.out.println("Started");
		// StringBuilder htmlStringBuilder=new StringBuilder();
		HtmlEmail email = new HtmlEmail();
		// Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		System.out.println("1");
		email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
		email.setSSLOnConnect(true);
		email.setFrom("naga123.ch@gmail.com");
		Date mDate = new Date();
		DateFormat timeFormat = SimpleDateFormat.getTimeInstance();
		DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		String time = timeFormat.format(mDate);
		String Date = date.format(mDate);
		// This method used for 5 Min slow
		DateFormat GetMin = new SimpleDateFormat("hh:mm:ss a");
		Calendar getCal = Calendar.getInstance();
		getCal.add(Calendar.SECOND, -30);
		getCal.add(Calendar.MINUTE, -5);
		System.out.println("Current Date Time : " + GetMin.format(getCal.getTime()));
		String currentServerTime = GetMin.format(getCal.getTime());
		email.setSubject("Flight Bookings Growth Report:- "+Utils.TodayName()+"- Date: "+Date+" Time: "+currentServerTime);
		System.out.println("2");
		
		StringBuilder htmlStringBuilder=new StringBuilder();
		
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 200 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th> </th> <th>Client_Cluster</th> <th>TodayBookings</th><th>WOW Growth %</th><th>WO2W Growth %</th> </tr> "));

		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Wego and skyscaner</td> <td>Meta</td><td>"+currentDay_meta_bothtotal+"</td><td>"+Wow_Meta+"%</td><td>"+Wow2_Meta+"%</td></tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Mobileweb and Website</td> <td>B2C</td><td>"+Currentday_B2c_total+"</td><td>"+Wow_B2C+"%</td><td>"+Wow2_B2C+"%</td></tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Android and IOS</td> <td>Mobile Apps</td><td>"+Currentday_mobapp_both_total+"</td><td>"+Wow_MobApp+"%</td><td>"+Wow2_MobApp+"%</td></tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td></td> <td>Others</td><td>"+Currentday_others_total+"</td><td>"+Wow_Others+"%</td><td>"+Wow2_Others+"%</td></tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td></td> <td> </td><td>"+Currentday_ALL_Total+"</td><td>"+Wow_ALL_Total+"%</td><td>"+Wow2_ALL_Total+"%</td></tr>"));
		
		
		
		calculation_Report_Present(CureentFile,LastWekFile);
		
		//Meta
		
		email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));

		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 400 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center  ><tr align=center bgcolor=#FF7C00 style=border-color:black;color:#ffffff><th STYLE=color:#ffffff colspan=14>META</th></tr>  <tr  align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff ><th></th><th></th><th align=center colspan=2>Transaction Successful</th><th align=center colspan=2>Confirmation Pending</th><th align=center colspan=2>Transaction On Hold</th> <th align=center colspan=2>Sold Out</th> <th align=center colspan=2>Cancelled</th> <th align=center colspan=2> Repricing </th></tr> "));


		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Client</td><td>Domain</td> <td >Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td></tr>"));

		
		//WEGO
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >WEGO</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td><td>"+com_wego_ts+"</td><td>"+WEGO_ts_com+"%</td><td>"+com_wego_cp+"</td><td>"+WEGO_cp_com+"%</td><td>"+com_wego_th+"</td><td>"+WEGO_th_com+"%</td><td>"+com_wego_sd+"</td><td>"+WEGO_sd_com+"%</td><td>"+com_wego_cn+"</td><td>"+WEGO_cn_com+"%</td><td>"+com_wego_rp+"</td><td>"+WEGO_rp_com+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+ae_wego_ts+"</td><td>"+WEGO_ts_ae+"%</td><td>"+ae_wego_cp+"</td><td>"+WEGO_cp_ae+"%</td><td>"+ae_wego_th+"</td><td>"+WEGO_th_ae+"%</td><td>"+ae_wego_sd+"</td><td>"+WEGO_sd_ae+"%</td><td>"+ae_wego_cn+"</td><td>"+WEGO_cn_ae+"%</td><td>"+ae_wego_rp+"</td><td>"+WEGO_rp_ae+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+sa_wego_ts+"</td><td>"+WEGO_ts_sa+"%</td><td>"+sa_wego_cp+"</td><td>"+WEGO_cp_sa+"%</td><td>"+sa_wego_th+"</td><td>"+WEGO_th_sa+"%</td><td>"+sa_wego_sd+"</td><td>"+WEGO_sd_sa+"%</td><td>"+sa_wego_cn+"</td><td>"+WEGO_cn_sa+"%</td><td>"+sa_wego_rp+"</td><td>"+WEGO_rp_sa+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+eg_wego_ts+"</td><td>"+WEGO_ts_eg+"%</td><td>"+eg_wego_cp+"</td><td>"+WEGO_cp_eg+"%</td><td>"+eg_wego_th+"</td><td>"+WEGO_th_eg+"%</td><td>"+eg_wego_sd+"</td><td>"+WEGO_sd_eg+"%</td><td>"+eg_wego_cn+"</td><td>"+WEGO_cn_eg+"%</td><td>"+eg_wego_rp+"</td><td>"+WEGO_rp_eg+"%</td></tr>"));

		//SKYSCAN
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >SKYSCAN</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td><td>"+com_skyscan_ts+"</td><td>"+SKYSCAN_ts_com+"%</td><td>"+com_skyscan_cp+"</td><td>"+SKYSCAN_cp_com+"%</td><td>"+com_skyscan_th+"</td><td>"+SKYSCAN_th_com+"%</td><td>"+com_skyscan_sd+"</td><td>"+SKYSCAN_sd_com+"%</td><td>"+com_skyscan_cn+"</td><td>"+SKYSCAN_cn_com+"%</td><td>"+com_skyscan_rp+"</td><td>"+SKYSCAN_rp_com+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+ae_skyscan_ts+"</td><td>"+SKYSCAN_ts_ae+"%</td><td>"+ae_skyscan_cp+"</td><td>"+SKYSCAN_cp_ae+"%</td><td>"+ae_skyscan_th+"</td><td>"+SKYSCAN_th_ae+"%</td><td>"+ae_skyscan_sd+"</td><td>"+SKYSCAN_sd_ae+"%</td><td>"+ae_skyscan_cn+"</td><td>"+SKYSCAN_cn_ae+"%</td><td>"+ae_skyscan_rp+"</td><td>"+SKYSCAN_rp_ae+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+sa_skyscan_ts+"</td><td>"+SKYSCAN_ts_sa+"%</td><td>"+sa_skyscan_cp+"</td><td>"+SKYSCAN_cp_sa+"%</td><td>"+sa_skyscan_th+"</td><td>"+SKYSCAN_th_sa+"%</td><td>"+sa_skyscan_sd+"</td><td>"+SKYSCAN_sd_sa+"%</td><td>"+sa_skyscan_cn+"</td><td>"+SKYSCAN_cn_sa+"%</td><td>"+sa_skyscan_rp+"</td><td>"+SKYSCAN_rp_sa+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+eg_skyscan_ts+"</td><td>"+SKYSCAN_ts_eg+"%</td><td>"+eg_skyscan_cp+"</td><td>"+SKYSCAN_cp_eg+"%</td><td>"+eg_skyscan_th+"</td><td>"+SKYSCAN_th_eg+"%</td><td>"+eg_skyscan_sd+"</td><td>"+SKYSCAN_sd_eg+"%</td><td>"+eg_skyscan_cn+"</td><td>"+SKYSCAN_cn_eg+"%</td><td>"+eg_skyscan_rp+"</td><td>"+SKYSCAN_rp_eg+"%</td></tr>"));

		//OTHERS
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >OTHERS</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td><td>"+com_others_ts+"</td><td>"+OTHERS_ts_com+"%</td><td>"+com_others_cp+"</td><td>"+OTHERS_cp_com+"%</td><td>"+com_others_th+"</td><td>"+OTHERS_th_com+"%</td><td>"+com_others_sd+"</td><td>"+OTHERS_sd_com+"%</td><td>"+com_others_cn+"</td><td>"+OTHERS_cn_com+"%</td><td>"+com_others_rp+"</td><td>"+OTHERS_rp_com+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+ae_others_ts+"</td><td>"+OTHERS_ts_ae+"%</td><td>"+ae_others_cp+"</td><td>"+OTHERS_cp_ae+"%</td><td>"+ae_others_th+"</td><td>"+OTHERS_th_ae+"%</td><td>"+ae_others_sd+"</td><td>"+OTHERS_sd_ae+"%</td><td>"+ae_others_cn+"</td><td>"+OTHERS_cn_ae+"%</td><td>"+ae_others_rp+"</td><td>"+OTHERS_rp_ae+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+sa_others_ts+"</td><td>"+OTHERS_ts_sa+"%</td><td>"+sa_others_cp+"</td><td>"+OTHERS_cp_sa+"%</td><td>"+sa_others_th+"</td><td>"+OTHERS_th_sa+"%</td><td>"+sa_others_sd+"</td><td>"+OTHERS_sd_sa+"%</td><td>"+sa_others_cn+"</td><td>"+OTHERS_cn_sa+"%</td><td>"+sa_others_rp+"</td><td>"+OTHERS_rp_sa+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+eg_others_ts+"</td><td>"+OTHERS_ts_eg+"%</td><td>"+eg_others_cp+"</td><td>"+OTHERS_cp_eg+"%</td><td>"+eg_others_th+"</td><td>"+OTHERS_th_eg+"%</td><td>"+eg_others_sd+"</td><td>"+OTHERS_sd_eg+"%</td><td>"+eg_others_cn+"</td><td>"+OTHERS_cn_eg+"%</td><td>"+eg_others_rp+"</td><td>"+OTHERS_rp_eg+"%</td></tr>"));

		
		
		
		
		
		
		//Mobile Apps & Website
		
		
		email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));

		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
		
		email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 400 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center  ><tr align=center bgcolor=#FF7C00 style=border-color:black;color:#ffffff><th STYLE=color:#ffffff colspan=14>Mobile Apps & Website</th></tr>  <tr  align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff ><th></th><th></th><th align=center colspan=2>Transaction Successful</th><th align=center colspan=2>Confirmation Pending</th><th align=center colspan=2>Transaction On Hold</th> <th align=center colspan=2>Sold Out</th> <th align=center colspan=2>Cancelled</th> <th align=center colspan=2> Repricing </th></tr> "));


		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Client</td><td>Domain</td> <td >Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td><td>Bookings</td><td>WOW Growth %</td></tr>"));
        //B2C
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >B2C</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td><td>"+com_b2c_ts+"</td><td>"+B2C_ts_com+"%</td><td>"+com_b2c_cp+"</td><td>"+B2C_cp_com+"%</td><td>"+com_b2c_th+"</td><td>"+B2C_th_com+"%</td><td>"+com_b2c_sd+"</td><td>"+B2C_sd_com+"%</td><td>"+com_b2c_cn+"</td><td>"+B2C_cn_com+"%</td><td>"+com_b2c_rp+"</td><td>"+B2C_rp_com+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+ae_b2c_ts+"</td><td>"+B2C_ts_ae+"%</td><td>"+ae_b2c_cp+"</td><td>"+B2C_cp_ae+"%</td><td>"+ae_b2c_th+"</td><td>"+B2C_th_ae+"%</td><td>"+ae_b2c_sd+"</td><td>"+B2C_sd_ae+"%</td><td>"+ae_b2c_cn+"</td><td>"+B2C_cn_ae+"%</td><td>"+ae_b2c_rp+"</td><td>"+B2C_rp_ae+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+sa_b2c_ts+"</td><td>"+B2C_ts_sa+"%</td><td>"+sa_b2c_cp+"</td><td>"+B2C_cp_sa+"%</td><td>"+sa_b2c_th+"</td><td>"+B2C_th_sa+"%</td><td>"+sa_b2c_sd+"</td><td>"+B2C_sd_sa+"%</td><td>"+sa_b2c_cn+"</td><td>"+B2C_cn_sa+"%</td><td>"+sa_b2c_rp+"</td><td>"+B2C_rp_sa+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+eg_b2c_ts+"</td><td>"+B2C_ts_eg+"%</td><td>"+eg_b2c_cp+"</td><td>"+B2C_cp_eg+"%</td><td>"+eg_b2c_th+"</td><td>"+B2C_th_eg+"%</td><td>"+eg_b2c_sd+"</td><td>"+B2C_sd_eg+"%</td><td>"+eg_b2c_cn+"</td><td>"+B2C_cn_eg+"%</td><td>"+eg_b2c_rp+"</td><td>"+B2C_rp_eg+"%</td></tr>"));
        //MOBILEAPP
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >MOBILEAPP</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td><td>"+com_mobapp_ts+"</td><td>"+MOBAPP_ts_com+"%</td><td>"+com_mobapp_cp+"</td><td>"+MOBAPP_cp_com+"%</td><td>"+com_mobapp_th+"</td><td>"+MOBAPP_th_com+"%</td><td>"+com_mobapp_sd+"</td><td>"+MOBAPP_sd_com+"%</td><td>"+com_mobapp_cn+"</td><td>"+MOBAPP_cn_com+"%</td><td>"+com_mobapp_rp+"</td><td>"+MOBAPP_rp_com+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+ae_mobapp_ts+"</td><td>"+MOBAPP_ts_ae+"%</td><td>"+ae_mobapp_cp+"</td><td>"+MOBAPP_cp_ae+"%</td><td>"+ae_mobapp_th+"</td><td>"+MOBAPP_th_ae+"%</td><td>"+ae_mobapp_sd+"</td><td>"+MOBAPP_sd_ae+"%</td><td>"+ae_mobapp_cn+"</td><td>"+MOBAPP_cn_ae+"%</td><td>"+ae_mobapp_rp+"</td><td>"+MOBAPP_rp_ae+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+sa_mobapp_ts+"</td><td>"+MOBAPP_ts_sa+"%</td><td>"+sa_mobapp_cp+"</td><td>"+MOBAPP_cp_sa+"%</td><td>"+sa_mobapp_th+"</td><td>"+MOBAPP_th_sa+"%</td><td>"+sa_mobapp_sd+"</td><td>"+MOBAPP_sd_sa+"%</td><td>"+sa_mobapp_cn+"</td><td>"+MOBAPP_cn_sa+"%</td><td>"+sa_mobapp_rp+"</td><td>"+MOBAPP_rp_sa+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+eg_mobapp_ts+"</td><td>"+MOBAPP_ts_eg+"%</td><td>"+eg_mobapp_cp+"</td><td>"+MOBAPP_cp_eg+"%</td><td>"+eg_mobapp_th+"</td><td>"+MOBAPP_th_eg+"%</td><td>"+eg_mobapp_sd+"</td><td>"+MOBAPP_sd_eg+"%</td><td>"+eg_mobapp_cn+"</td><td>"+MOBAPP_cn_eg+"%</td><td>"+eg_mobapp_rp+"</td><td>"+MOBAPP_rp_eg+"%</td></tr>"));
	
		//MOBIOS
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >MOBIOS</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td><td>"+com_mobios_ts+"</td><td>"+MOBIOS_ts_com+"%</td><td>"+com_mobios_cp+"</td><td>"+MOBIOS_cp_com+"%</td><td>"+com_mobios_th+"</td><td>"+MOBIOS_th_com+"%</td><td>"+com_mobios_sd+"</td><td>"+MOBIOS_sd_com+"%</td><td>"+com_mobios_cn+"</td><td>"+MOBIOS_cn_com+"%</td><td>"+com_mobios_rp+"</td><td>"+MOBIOS_rp_com+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+ae_mobios_ts+"</td><td>"+MOBIOS_ts_ae+"%</td><td>"+ae_mobios_cp+"</td><td>"+MOBIOS_cp_ae+"%</td><td>"+ae_mobios_th+"</td><td>"+MOBIOS_th_ae+"%</td><td>"+ae_mobios_sd+"</td><td>"+MOBIOS_sd_ae+"%</td><td>"+ae_mobios_cn+"</td><td>"+MOBIOS_cn_ae+"%</td><td>"+ae_mobios_rp+"</td><td>"+MOBIOS_rp_ae+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+sa_mobios_ts+"</td><td>"+MOBIOS_ts_sa+"%</td><td>"+sa_mobios_cp+"</td><td>"+MOBIOS_cp_sa+"%</td><td>"+sa_mobios_th+"</td><td>"+MOBIOS_th_sa+"%</td><td>"+sa_mobios_sd+"</td><td>"+MOBIOS_sd_sa+"%</td><td>"+sa_mobios_cn+"</td><td>"+MOBIOS_cn_sa+"%</td><td>"+sa_mobios_rp+"</td><td>"+MOBIOS_rp_sa+"%</td></tr>"));
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+eg_mobios_ts+"</td><td>"+MOBIOS_ts_eg+"%</td><td>"+eg_mobios_cp+"</td><td>"+MOBIOS_cp_eg+"%</td><td>"+eg_mobios_th+"</td><td>"+MOBIOS_th_eg+"%</td><td>"+eg_mobios_sd+"</td><td>"+MOBIOS_sd_eg+"%</td><td>"+eg_mobios_cn+"</td><td>"+MOBIOS_cn_eg+"%</td><td>"+eg_mobios_rp+"</td><td>"+MOBIOS_rp_eg+"%</td></tr>"));
	
		
		
		
		
		email.addTo("Sreenivas.bodige@rehlat.com");
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
		email.addCc("sankalp.chhabra@rehlat.com");
	
		//email.addTo("naga.ch199@gmail.com");
		  
		
		System.out.println("3");
		email.send();
		System.out.println("END");
		
	}

}
