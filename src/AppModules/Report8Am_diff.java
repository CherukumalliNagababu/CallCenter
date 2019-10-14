package AppModules;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.poi.xssf.model.CalculationChain;
import org.testng.annotations.Test;

import AppModules.Repricing_TH_CP_HTML_Reports;
import AppModules.Repricing_TH_CP_Reports;
import DiffrentReports.Report_8AM_Dif;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import utility.Utils;
import utility.differentPageReports;

public class Report8Am_diff extends differentPageReports {
	static String R8AM_toDayDate;
	static String R8AM_toDayDate1;
	static String R8AM_toDayDate2;
	static String R8AM_toDayDate3;
	static String R8AM_toDayDate4;
	static String R8AM_toDayDate5;
	static String R8AM_toDayDate6;

	static String R8AM_First2_y;
	static String R8AM_First3_y;
	static String R8AM_First4_y;
	static String R8AM_First5_y;
	static String R8AM_First6_y;
	static String R8AM_First7_y;

	static String R8AM_First1;
	static String R8AM_First2;
	static String R8AM_First3;
	static String R8AM_First4;
	static String R8AM_First5;
	static String R8AM_First6;
	static String R8AM_First7;

	static String R8AM_Second1;
	static String R8AM_Second2;
	static String R8AM_Second3;
	static String R8AM_Second4;
	static String R8AM_Second5;
	static String R8AM_Second6;
	static String R8AM_Second7;
	static String NA = "00";

	public static void Report_8_30AM() throws Exception {

		// To day 8:30 AM Report
		DateFormat Formate_10 = new SimpleDateFormat("dd_MMM_yyyy");
		Date d_10 = new Date();
		System.out.println(Formate_10.format(d_10));
		String ToDay_10 = Formate_10.format(d_10);
		R8AM_toDayDate = ToDay_10.replace("_", "-");
		System.out.println(R8AM_toDayDate);
		String[] SD_10 = ToDay_10.split("_");
		System.out.println("Split the Date::" + SD_10[0]);
		System.out.println("Split the month::" + SD_10[1]);
		System.out.println("Split the Year::" + SD_10[2]);

		System.out.println("C:/DailyXLReports/" + SD_10[2] + "/" + SD_10[1] + "/" + ToDay_10 + "/Report_" + SD_10[0]
				+ "_" + SD_10[1] + "_" + SD_10[2] + " 08 AM.xls");

		System.out.println("naga");
		try {
			FileInputStream file1 = new FileInputStream("C:/DailyXLReports/" + SD_10[2] + "/" + SD_10[1] + "/"
					+ ToDay_10 + "/Report_" + SD_10[0] + "_" + SD_10[1] + "_" + SD_10[2] + " 08 AM.xls");
			Workbook wb1 = Workbook.getWorkbook(file1);
			Sheet sheet1 = wb1.getSheet("Results");
			R8AM_First1 = sheet1.getCell(0, 1).getContents();
			R8AM_Second1 = sheet1.getCell(0, 2).getContents();
			System.out.println(R8AM_First1);
			System.out.println(R8AM_Second1);
		} catch (Exception e) {
			R8AM_First1 = NA;
			R8AM_Second1 = NA;
		}
		// Last week 8:30AM Report
		Calendar cal = Calendar.getInstance();
		DateFormat lastweek = new SimpleDateFormat("dd_MMM_yyyy");
		cal.add(Calendar.DATE, -7);
		Date TO1 = cal.getTime();
		System.out.println(lastweek.format(TO1));
		String st = lastweek.format(TO1);
		R8AM_toDayDate1 = st.replace("_", "-");
		String LDate1 = lastweek.format(TO1);
		String[] SD = st.split("_");
		System.out.println("Split the Date::" + SD[0]);
		System.out.println("Split the month::" + SD[1]);
		System.out.println("Split the Year::" + SD[2]);

		System.out.println("lastDates  is " + LDate1);
		System.out.println("C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_" + SD[0] + "_" + SD[1]
				+ "_" + SD[2] + " 08 AM.xls");

		try {
			FileInputStream file2 = new FileInputStream("C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1
					+ "/Report_" + SD[0] + "_" + SD[1] + "_" + SD[2] + " 08 AM.xls");
			Workbook wb2 = Workbook.getWorkbook(file2);
			Sheet sheet2 = wb2.getSheet("Results");
			R8AM_First2 = sheet2.getCell(0, 1).getContents();
			R8AM_Second2 = sheet2.getCell(0, 2).getContents();

			System.out.println(R8AM_First2);
			System.out.println(R8AM_Second2);
		} catch (Exception e) {
			R8AM_First2 = NA;
			R8AM_Second2 = NA;
		}
		try {
			FileInputStream file2_y = new FileInputStream(
					"C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_Yesterday.xls");
			Workbook wb2_y = Workbook.getWorkbook(file2_y);
			Sheet sheet2_y = wb2_y.getSheet("Results");
			R8AM_First2_y = sheet2_y.getCell(0, 1).getContents();
			System.out.println(R8AM_First2_y);
		} catch (Exception e) {
			R8AM_First2_y = NA;

		}

		// 2 weeks back 8:30AM Report
		Calendar cal1 = Calendar.getInstance();
		DateFormat lastweek_2 = new SimpleDateFormat("dd_MMM_yyyy");
		cal1.add(Calendar.DATE, -14);
		Date TO2 = cal1.getTime();
		System.out.println(lastweek_2.format(TO2));
		String st1 = lastweek_2.format(TO2);
		R8AM_toDayDate2 = st1.replace("_", "-");
		String L_W_Date1 = lastweek_2.format(TO2);
		String[] SD1 = st1.split("_");
		System.out.println("Split the Date::" + SD1[0]);
		System.out.println("Split the month::" + SD1[1]);
		System.out.println("Split the Year::" + SD1[2]);

		System.out.println("lastDates  is " + L_W_Date1);
		System.out.println("C:/DailyXLReports/" + SD1[2] + "/" + SD1[1] + "/" + L_W_Date1 + "/Report_" + SD1[0] + "_"
				+ SD1[1] + "_" + SD1[2] + " 08 AM.xls");
		try {
			FileInputStream file3 = new FileInputStream("C:/DailyXLReports/" + SD1[2] + "/" + SD1[1] + "/" + L_W_Date1
					+ "/Report_" + SD1[0] + "_" + SD1[1] + "_" + SD1[2] + " 08 AM.xls");
			Workbook wb3 = Workbook.getWorkbook(file3);
			Sheet sheet3 = wb3.getSheet("Results");
			R8AM_First3 = sheet3.getCell(0, 1).getContents();
			R8AM_Second3 = sheet3.getCell(0, 2).getContents();
			System.out.println(R8AM_First3);
			System.out.println(R8AM_Second3);
		} catch (Exception e) {
			R8AM_First3 = NA;
			R8AM_Second3 = NA;
		}

		try {
			FileInputStream file3_y = new FileInputStream(
					"C:/DailyXLReports/" + SD1[2] + "/" + SD1[1] + "/" + L_W_Date1 + "/Report_Yesterday.xls");
			Workbook wb3_y = Workbook.getWorkbook(file3_y);
			Sheet sheet3_y = wb3_y.getSheet("Results");
			R8AM_First3_y = sheet3_y.getCell(0, 1).getContents();
			System.out.println(R8AM_First3_y);
		} catch (Exception e) {
			R8AM_First3_y = NA;

		}

		// 3 weeks back 8:30AM Report
		Calendar cal2 = Calendar.getInstance();
		DateFormat lastweek_3 = new SimpleDateFormat("dd_MMM_yyyy");
		cal2.add(Calendar.DATE, -21);
		Date TO3 = cal2.getTime();
		System.out.println(lastweek_3.format(TO3));
		String st2 = lastweek_3.format(TO3);
		R8AM_toDayDate3 = st2.replace("_", "-");
		String L_W_Date2 = lastweek_3.format(TO3);
		String[] SD2 = st2.split("_");
		System.out.println("Split the Date::" + SD2[0]);
		System.out.println("Split the month::" + SD2[1]);
		System.out.println("Split the Year::" + SD2[2]);

		System.out.println("lastDates  is " + L_W_Date2);
		System.out.println("C:/DailyXLReports/" + SD2[2] + "/" + SD2 + "/" + L_W_Date2 + "/Report_" + SD2[0] + "_"
				+ SD2[1] + "_" + SD2[2] + " 08 AM.xls");
		try {
			FileInputStream file4 = new FileInputStream("C:/DailyXLReports/" + SD2[2] + "/" + SD2[1] + "/" + L_W_Date2
					+ "/Report_" + SD2[0] + "_" + SD2[1] + "_" + SD2[2] + " 08 AM.xls");
			Workbook wb4 = Workbook.getWorkbook(file4);
			Sheet sheet4 = wb4.getSheet("Results");
			R8AM_First4 = sheet4.getCell(0, 1).getContents();
			R8AM_Second4 = sheet4.getCell(0, 2).getContents();
			System.out.println(R8AM_First4);
			System.out.println(R8AM_Second4);
		} catch (Exception e) {
			R8AM_First4 = NA;
			R8AM_Second4 = NA;
		}
		try {
			FileInputStream file4_y = new FileInputStream(
					"C:/DailyXLReports/" + SD2[2] + "/" + SD2[1] + "/" + L_W_Date2 + "/Report_Yesterday.xls");
			Workbook wb4_y = Workbook.getWorkbook(file4_y);
			Sheet sheet4_y = wb4_y.getSheet("Results");
			R8AM_First4_y = sheet4_y.getCell(0, 1).getContents();
			System.out.println(R8AM_First4_y);
		} catch (Exception e) {
			R8AM_First4_y = NA;

		}

		// 4 weeks back 8:30AM Report
		Calendar cal3 = Calendar.getInstance();
		DateFormat lastweek_4 = new SimpleDateFormat("dd_MMM_yyyy");
		cal3.add(Calendar.DATE, -28);
		Date TO4 = cal3.getTime();
		System.out.println(lastweek_4.format(TO4));
		String st3 = lastweek_4.format(TO4);
		R8AM_toDayDate4 = st3.replace("_", "-");
		String L_W_Date3 = lastweek_4.format(TO4);
		String[] SD3 = st3.split("_");
		System.out.println("Split the Date::" + SD3[0]);
		System.out.println("Split the month::" + SD3[1]);
		System.out.println("Split the Year::" + SD3[2]);

		System.out.println("lastDates  is " + L_W_Date3);
		System.out.println("C:/DailyXLReports/" + SD3[2] + "/" + SD3[1] + "/" + L_W_Date3 + "/Report_" + SD3[0] + "_"
				+ SD3[1] + "_" + SD3[2] + " 08 AM.xls");
		try {
			FileInputStream file5 = new FileInputStream("C:/DailyXLReports/" + SD3[2] + "/" + SD3[1] + "/" + L_W_Date3
					+ "/Report_" + SD3[0] + "_" + SD3[1] + "_" + SD3[2] + " 08 AM.xls");
			Workbook wb5 = Workbook.getWorkbook(file5);
			Sheet sheet5 = wb5.getSheet("Results");
			R8AM_First5 = sheet5.getCell(0, 1).getContents();
			R8AM_Second5 = sheet5.getCell(0, 2).getContents();
			System.out.println(R8AM_First5);
			System.out.println(R8AM_Second5);
		} catch (Exception e) {
			R8AM_First5 = NA;
			R8AM_Second5 = NA;
		}
		try {
			FileInputStream file5_y = new FileInputStream(
					"C:/DailyXLReports/" + SD3[2] + "/" + SD3[1] + "/" + L_W_Date3 + "/Report_Yesterday.xls");
			Workbook wb5_y = Workbook.getWorkbook(file5_y);
			Sheet sheet5_y = wb5_y.getSheet("Results");
			R8AM_First5_y = sheet5_y.getCell(0, 1).getContents();
			System.out.println(R8AM_First5_y);
		} catch (Exception e) {
			R8AM_First5_y = NA;
		}

		// 5 weeks back 8:30AM Report
		Calendar cal4 = Calendar.getInstance();
		DateFormat lastweek_5 = new SimpleDateFormat("dd_MMM_yyyy");
		cal4.add(Calendar.DATE, -35);
		Date TO5 = cal4.getTime();
		System.out.println(lastweek_5.format(TO5));
		String st4 = lastweek_5.format(TO5);
		R8AM_toDayDate5 = st4.replace("_", "-");
		String L_W_Date4 = lastweek_5.format(TO5);
		String[] SD4 = st4.split("_");
		System.out.println("Split the Date::" + SD4[0]);
		System.out.println("Split the month::" + SD4[1]);
		System.out.println("Split the Year::" + SD4[2]);

		System.out.println("lastDates  is " + L_W_Date4);
		System.out.println("C:/DailyXLReports/" + SD4[2] + "/" + SD4[1] + "/" + L_W_Date4 + "/Report_" + SD4[0] + "_"
				+ SD4[1] + "_" + SD4[2] + " 08 AM.xls");
		try {
			FileInputStream file6 = new FileInputStream("C:/DailyXLReports/" + SD4[2] + "/" + SD4[1] + "/" + L_W_Date4
					+ "/Report_" + SD4[0] + "_" + SD4[1] + "_" + SD4[2] + " 08 AM.xls");
			Workbook wb6 = Workbook.getWorkbook(file6);
			Sheet sheet6 = wb6.getSheet("Results");
			R8AM_First6 = sheet6.getCell(0, 1).getContents();
			R8AM_Second6 = sheet6.getCell(0, 2).getContents();
			System.out.println(R8AM_First6);
			System.out.println(R8AM_Second6);
		} catch (Exception e) {
			R8AM_First6 = NA;
			R8AM_Second6 = NA;
		}

		try {
			FileInputStream file6_y = new FileInputStream(
					"C:/DailyXLReports/" + SD4[2] + "/" + SD4[1] + "/" + L_W_Date4 + "/Report_Yesterday.xls");
			Workbook wb6_y = Workbook.getWorkbook(file6_y);
			Sheet sheet6_y = wb6_y.getSheet("Results");
			R8AM_First6_y = sheet6_y.getCell(0, 1).getContents();
			System.out.println(R8AM_First6_y);
		} catch (Exception e) {
			R8AM_First6_y = NA;
		}

		// 6 weeks back 8:30AM Report
		Calendar cal5 = Calendar.getInstance();
		DateFormat lastweek_6 = new SimpleDateFormat("dd_MMM_yyyy");
		cal5.add(Calendar.DATE, -42);
		Date TO6 = cal5.getTime();
		System.out.println(lastweek_6.format(TO6));
		String st5 = lastweek_6.format(TO6);
		R8AM_toDayDate6 = st5.replace("_", "-");
		String L_W_Date5 = lastweek_6.format(TO6);
		String[] SD5 = st5.split("_");
		System.out.println("Split the Date::" + SD5[0]);
		System.out.println("Split the month::" + SD5[1]);
		System.out.println("Split the Year::" + SD5[2]);

		System.out.println("lastDates  is " + L_W_Date5);
		System.out.println("C:/DailyXLReports/" + SD5[2] + "/" + SD5[1] + "/" + L_W_Date5 + "/Report_" + SD5[0] + "_"
				+ SD5[1] + "_" + SD5[2] + " 08 AM.xls");
		try {
			FileInputStream file7 = new FileInputStream("C:/DailyXLReports/" + SD5[2] + "/" + SD5[1] + "/" + L_W_Date5
					+ "/Report_" + SD5[0] + "_" + SD5[1] + "_" + SD5[2] + " 08 AM.xls");
			Workbook wb7 = Workbook.getWorkbook(file7);
			Sheet sheet7 = wb7.getSheet("Results");
			R8AM_First7 = sheet7.getCell(0, 1).getContents();
			R8AM_Second7 = sheet7.getCell(0, 2).getContents();
			System.out.println(R8AM_First7);
			System.out.println(R8AM_Second7);
		} catch (Exception e) {
			R8AM_First7 = NA;
			R8AM_Second7 = NA;
		}
		try {
			FileInputStream file7_y = new FileInputStream(
					"C:/DailyXLReports/" + SD5[2] + "/" + SD5[1] + "/" + L_W_Date5 + "/Report_Yesterday.xls");
			Workbook wb7_y = Workbook.getWorkbook(file7_y);
			Sheet sheet7_y = wb7_y.getSheet("Results");
			R8AM_First7_y = sheet7_y.getCell(0, 1).getContents();
			System.out.println(R8AM_First7_y);
		} catch (Exception e) {
			R8AM_First7_y = NA;

		}

	}

	

	public static void deviation_Report_8AM() {

		// To day 8:30 AM Report
		DateFormat Formate_10 = new SimpleDateFormat("dd_MMM_yyyy");
		Date d_10 = new Date();
		System.out.println(Formate_10.format(d_10));
		String ToDay_10 = Formate_10.format(d_10);
		String R8AM_toDayDate_d = ToDay_10.replace("_", "-");
		System.out.println(R8AM_toDayDate_d);
		String[] SD_10 = ToDay_10.split("_");
		System.out.println("Split the Date::" + SD_10[0]);
		System.out.println("Split the month::" + SD_10[1]);
		System.out.println("Split the Year::" + SD_10[2]);

		System.out.println("C:/DailyXLReports/" + SD_10[2] + "/" + SD_10[1] + "/" + ToDay_10 + "/Report_" + SD_10[0]
				+ "_" + SD_10[1] + "_" + SD_10[2] + " 08 AM.xls");

		System.out.println("naga");
		try {
			differentPageReports.deviation_Report_Today("C:/DailyXLReports/" + SD_10[2] + "/" + SD_10[1] + "/"
					+ ToDay_10 + "/Report_" + SD_10[0] + "_" + SD_10[1] + "_" + SD_10[2] + " 08 AM.xls", 4, 5, 6, 7);

		} catch (Exception e) {

		}

		// Last week 8:30AM Report
		Calendar cal = Calendar.getInstance();
		DateFormat lastweek = new SimpleDateFormat("dd_MMM_yyyy");
		cal.add(Calendar.DATE, -7);
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
		System.out.println("C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1 + "/Report_" + SD[0] + "_" + SD[1]
				+ "_" + SD[2] + " 08 AM.xls");

		try {
			/*
			 * FileInputStream file2 = new
			 * FileInputStream("C:/DailyXLReports/"+SD[2]+"/"+SD[1]+"/"+LDate1+
			 * "/Report_"+SD[0]+"_"+ SD[1]+"_"+ SD[2]+" 08 AM.xls"); Workbook
			 * wb2 = Workbook.getWorkbook(file2); Sheet sheet2 =
			 * wb2.getSheet("Results");
			 */

			differentPageReports.deviation_Report_Lastweek("C:/DailyXLReports/" + SD[2] + "/" + SD[1] + "/" + LDate1
					+ "/Report_" + SD[0] + "_" + SD[1] + "_" + SD[2] + " 08 AM.xls", 4, 5, 6, 7);

			/*
			 * String Com_b2c_d_8AM=sheet2.getCell(1, 4).getContents(); String
			 * Com_mobapp_d_8AM=sheet2.getCell(2, 4).getContents(); String
			 * Com_mobios_d_8AM=sheet2.getCell(3, 4).getContents(); String
			 * Com_wego_d_8AM=sheet2.getCell(4, 4).getContents(); String
			 * Com_skyscan_d_8AM=sheet2.getCell(5, 4).getContents(); String
			 * Com_other_d_8AM=sheet2.getCell(6, 4).getContents();
			 * 
			 * String AE_b2c_d_8AM=sheet2.getCell(1, 5).getContents(); String
			 * AE_mobapp_d_8AM=sheet2.getCell(2, 5).getContents(); String
			 * AE_mobios_d_8AM=sheet2.getCell(3, 5).getContents(); String
			 * AE_wego_d_8AM=sheet2.getCell(4, 5).getContents(); String
			 * AE_skyscan_d_8AM=sheet2.getCell(5, 5).getContents(); String
			 * AE_other_d_8AM=sheet2.getCell(6, 5).getContents();
			 * 
			 * 
			 * String SA_b2c_d_8AM=sheet2.getCell(1, 6).getContents(); String
			 * SA_mobapp_d_8AM=sheet2.getCell(2, 6).getContents(); String
			 * SA_mobios_d_8AM=sheet2.getCell(3, 6).getContents(); String
			 * SA_wego_d_8AM=sheet2.getCell(4, 6).getContents(); String
			 * SA_skyscan_d_8AM=sheet2.getCell(5, 6).getContents(); String
			 * SA_other_d_8AM=sheet2.getCell(6, 6).getContents();
			 * 
			 * String EG_b2c_d_8AM=sheet2.getCell(1, 7).getContents(); String
			 * EG_mobapp_d_8AM=sheet2.getCell(2, 7).getContents(); String
			 * EG_mobios_d_8AM=sheet2.getCell(3, 7).getContents(); String
			 * EG_wego_d_8AM=sheet2.getCell(4, 7).getContents(); String
			 * EG_skyscan_d_8AM=sheet2.getCell(5, 7).getContents(); String
			 * EG_other_d_8AM=sheet2.getCell(6, 7).getContents();
			 */

		} catch (Exception e) {

		}

	}

	public static void SoldOutPercentage_Report() {
		// To day 8:30 AM Report
		DateFormat Formate_10 = new SimpleDateFormat("dd_MMM_yyyy");
		Date d_10 = new Date();
		System.out.println(Formate_10.format(d_10));
		String ToDay_10 = Formate_10.format(d_10);
		String R8AM_toDayDate_d = ToDay_10.replace("_", "-");
		System.out.println(R8AM_toDayDate_d);
		String[] SD_10 = ToDay_10.split("_");
		System.out.println("Split the Date::" + SD_10[0]);
		System.out.println("Split the month::" + SD_10[1]);
		System.out.println("Split the Year::" + SD_10[2]);

		System.out.println("C:/DailyXLReports/" + SD_10[2] + "/" + SD_10[1] + "/" + ToDay_10 + "/Report_" + SD_10[0]
				+ "_" + SD_10[1] + "_" + SD_10[2] + " 08 AM.xls");

		System.out.println("naga");
		try {
			differentPageReports.SoldOut_Percentage("C:/DailyXLReports/" + SD_10[2] + "/" + SD_10[1] + "/" + ToDay_10
					+ "/Report_" + SD_10[0] + "_" + SD_10[1] + "_" + SD_10[2] + " 08 AM.xls", 9, 10, 11, 12);

		} catch (Exception e) {

		}
	}

	public static void html_table_for_8AM() throws EmailException {

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
		email.setSubject("Flights Booking Status Difference Report :- Date: " + Date + " - " + Utils.TodayName()
				+ "-Time:-" + currentServerTime);
		System.out.println("2");

		differentPageReports.calculation_deviation_Report();
		SoldOutPercentage_Report();

		int R8AM_f1 = Integer.parseInt(R8AM_First1) + Integer.parseInt(R8AM_Second1);
		int R8AM_f2 = Integer.parseInt(R8AM_First2) + Integer.parseInt(R8AM_Second2);
		int R8AM_f3 = Integer.parseInt(R8AM_First3) + Integer.parseInt(R8AM_Second3);
		int R8AM_f4 = Integer.parseInt(R8AM_First4) + Integer.parseInt(R8AM_Second4);
		int R8AM_f5 = Integer.parseInt(R8AM_First5) + Integer.parseInt(R8AM_Second5);
		int R8AM_f6 = Integer.parseInt(R8AM_First6) + Integer.parseInt(R8AM_Second6);
		int R8AM_f7 = Integer.parseInt(R8AM_First7) + Integer.parseInt(R8AM_Second7);

		int R8AM_L1 = R8AM_f1 - R8AM_f2;
		int R8AM_L2 = R8AM_f1 - R8AM_f3;
		int R8AM_L3 = R8AM_f1 - R8AM_f4;
		int R8AM_L4 = R8AM_f1 - R8AM_f5;
		int R8AM_L5 = R8AM_f1 - R8AM_f6;
		int R8AM_L6 = R8AM_f1 - R8AM_f7;
		String R8AM_neg1;
		String R8AM_neg2;
		String R8AM_neg3;
		String R8AM_neg4;
		String R8AM_neg5;
		String R8AM_neg6;

		if (R8AM_L1 > -1) {
			System.out.println(R8AM_L1);
			R8AM_neg1 = "#2ECC71";
		} else {
			System.out.println("neg");
			R8AM_neg1 = "#FFD700";
		}
		if (R8AM_L2 > -1) {
			System.out.println(R8AM_L2);
			R8AM_neg2 = "#2ECC71";
		} else {
			System.out.println("neg");
			R8AM_neg2 = "#FFD700";
		}
		if (R8AM_L3 > -1) {
			System.out.println(R8AM_L3);
			R8AM_neg3 = "#2ECC71";
		} else {
			System.out.println("neg");
			R8AM_neg3 = "#FFD700";
		}
		if (R8AM_L4 > -1) {
			System.out.println(R8AM_L4);
			R8AM_neg4 = "#2ECC71";
		} else {
			System.out.println("neg");
			R8AM_neg4 = "#FFD700";
		}
		if (R8AM_L5 > -1) {
			System.out.println(R8AM_L5);
			R8AM_neg5 = "#2ECC71";
		} else {
			System.out.println("neg");
			R8AM_neg5 = "#FFD700";
		}
		if (R8AM_L6 > -1) {
			System.out.println(R8AM_L6);
			R8AM_neg6 = "#2ECC71";
		} else {
			System.out.println("neg");
			R8AM_neg6 = "#FFD700";
		}

		StringBuilder htmlStringBuilder = new StringBuilder();
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr>Soldout Percentage Report<tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr>Please find the Flights Booking Status Difference Report @8:30 AM <tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append(
				" <table width = 200 height = 50 cellpadding=2 border=1 cellspacing=2 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th colspan=2 scope=colgroup>Soldout Percentage</th></tr> "));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #F8C471>COM</td> <td bgcolor= #F8C471 style=color:"
						+ com_sd_color + ">" + Com_SD + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #F8C471>AE</td> <td bgcolor= #F8C471 style=color:"
						+ AE_sd_color + ">" + AE_SD + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #F8C471>SA</td> <td bgcolor= #F8C471 style=color:"
						+ SA_sd_color + ">" + SA_SD + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center  class=table table-bordered style=border-color:black><td bgcolor= #F8C471>EG</td> <td bgcolor= #F8C471 style=color:"
						+ EG_sd_color + ">" + EG_SD + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("</table></body></html>"));

		email.setHtmlMsg("" + htmlStringBuilder.append("<tr>Flights Deviation Report  <tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr> <tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append(" <table width = 800 height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

		/*
		 * email.setHtmlMsg(""+htmlStringBuilder.append(
		 * "<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"
		 * +Com_b2c_value+"</td><td>"+Com_Mobapp_value+"</td><td>"+
		 * Com_Mobios_value+"</td><td>"+Com_wego_value+"</td><td>"+
		 * Com_Skyscan_value+"</td><td>"+Com_other_value+"</td><td>"+Com_total+
		 * "</td><td rowspan=5>"+All_Values+"</td></tr>"));
		 * email.setHtmlMsg(""+htmlStringBuilder.append(
		 * "<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"
		 * +AE_b2c_value+"</td><td>"+AE_Mobapp_value+"</td><td>"+AE_Mobios_value
		 * +"</td><td>"+AE_wego_value+"</td><td>"+AE_Skyscan_value+"</td><td>"+
		 * AE_other_value+"</td><td>"+AE_total+"</td></tr>"));
		 * email.setHtmlMsg(""+htmlStringBuilder.append(
		 * "<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"
		 * +SA_b2c_value+"</td><td>"+SA_Mobapp_value+"</td><td>"+SA_Mobios_value
		 * +"</td><td>"+SA_wego_value+"</td><td>"+SA_Skyscan_value+"</td><td>"+
		 * SA_other_value+"</td><td>"+SA_total+"</td></tr>"));
		 * email.setHtmlMsg(""+htmlStringBuilder.append(
		 * "<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"
		 * +EG_b2c_value+"</td><td>"+EG_Mobapp_value+"</td><td>"+EG_Mobios_value
		 * +"</td><td>"+EG_wego_value+"</td><td>"+EG_Skyscan_value+"</td><td>"+
		 * EG_other_value+"</td><td>"+EG_total+"</td></tr>"));
		 */

		email.setHtmlMsg("" + htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>COM</td> <td style=color:"+ com_b2c_color + ">" + Com_b2c_value + "</td><td style=color:" + com_Mobapp_color + ">"+ Com_Mobapp_value + "</td><td style=color:" + com_Mobios_color + ">" + Com_Mobios_value+ "</td><td style=color:" + com_Wego_color + ">" + Com_wego_value + "</td><td style=color:"+ com_Skyscan_color + ">" + Com_Skyscan_value + "</td><td style=color:" + com_Other_color + ">"+ Com_other_value + "</td><td style=color:" + com_total_color + ">" + Com_total+ "</td><td rowspan=5 style=color:" + ALL_values_color + ">" + All_Values + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>AE</td> <td style=color:"+ AE_b2c_color + ">" + AE_b2c_value + "</td><td style=color:" + AE_Mobapp_color + ">"+ AE_Mobapp_value + "</td><td style=color:" + AE_Mobios_color + ">" + AE_Mobios_value+ "</td><td style=color:" + AE_Wego_color + ">" + AE_wego_value + "</td><td style=color:"+ AE_Skyscan_color + ">" + AE_Skyscan_value + "</td><td style=color:" + AE_Other_color + ">"+ AE_other_value + "</td><td style=color:" + AE_total_color + ">" + AE_total + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder	.append("<tr align=center class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>SA</td> <td style=color:"+ SA_b2c_color + ">" + SA_b2c_value + "</td><td style=color:" + SA_Mobapp_color + ">"+ SA_Mobapp_value + "</td><td style=color:" + SA_Mobios_color + ">" + SA_Mobios_value+ "</td><td style=color:" + SA_Wego_color + ">" + SA_wego_value + "</td><td style=color:"+ SA_Skyscan_color + ">" + SA_Skyscan_value + "</td><td style=color:" + SA_Other_color + ">"+ SA_other_value + "</td><td style=color:" + SA_total_color + ">" + SA_total + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr align=center  class=table table-bordered style=border-color:black><td bgcolor= #FFFF00>EG</td> <td style=color:"+ EG_b2c_color + ">" + EG_b2c_value + "</td><td style=color:" + EG_Mobapp_color + ">"+ EG_Mobapp_value + "</td><td style=color:" + EG_Mobios_color + ">" + EG_Mobios_value+ "</td><td style=color:" + EG_Wego_color + ">" + EG_wego_value + "</td><td style=color:"+ EG_Skyscan_color + ">" + EG_Skyscan_value + "</td><td style=color:" + EG_Other_color + ">"+ EG_other_value + "</td><td style=color:" + EG_total_color + ">" + EG_total + "</td></tr>"));

		email.setHtmlMsg("" + htmlStringBuilder.append("</table></body></html>"));
		email.setHtmlMsg("" + htmlStringBuilder.append("<tr> <tr>"));

		email.setHtmlMsg("" + htmlStringBuilder.append("<tr>8:30AM<tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append(" <table width = 800 height = 150 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th> </th><th>"
						+ R8AM_toDayDate + "</th> <th>" + R8AM_toDayDate6 + "</th> <th>" + R8AM_toDayDate5 + "</th><th>"
						+ R8AM_toDayDate4 + "</th><th>" + R8AM_toDayDate3 + "</th> <th>" + R8AM_toDayDate2
						+ "</th> <th>" + R8AM_toDayDate1 + "</th> </tr> "));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center bgcolor= #BB8FCE class=table table-bordered style=border-color:black><td>Total Bookings</td><td>NA</td> <td>"
						+ R8AM_First7_y + "</td><td>" + R8AM_First6_y + "</td><td>" + R8AM_First5_y + "</td><td>"
						+ R8AM_First4_y + "</td><td>" + R8AM_First3_y + "</td><td>" + R8AM_First2_y + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center bgcolor= #FFFFFF class=table table-bordered style=border-color:black><td>TXNS</td><td>"
						+ R8AM_First1 + "</td> <td>" + R8AM_First7 + "</td><td>" + R8AM_First6 + "</td><td>"
						+ R8AM_First5 + "</td><td>" + R8AM_First4 + "</td><td>" + R8AM_First3 + "</td><td>"
						+ R8AM_First2 + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center bgcolor= #FFFFFF class=table table-bordered style=border-color:black><td>REPR</td><td>"
						+ R8AM_Second1 + "</td> <td>" + R8AM_Second7 + "</td><td>" + R8AM_Second6 + "</td><td>"
						+ R8AM_Second5 + "</td><td>" + R8AM_Second4 + "</td><td>" + R8AM_Second3 + "</td><td>"
						+ R8AM_Second2 + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Running Total</td><td>"
						+ R8AM_f1 + "</td> <td>" + R8AM_f7 + "</td><td>" + R8AM_f6 + "</td><td>" + R8AM_f5 + "</td><td>"
						+ R8AM_f4 + "</td><td>" + R8AM_f3 + "</td><td>" + R8AM_f2 + "</td></tr>"));
		email.setHtmlMsg("" + htmlStringBuilder
				.append("<tr align=center bgcolor= #2ECC71 class=table table-bordered style=border-color:black><td>Leading</td><td> </td> <td bgcolor="
						+ R8AM_neg6 + ">" + R8AM_L6 + "</td><td bgcolor=" + R8AM_neg5 + ">" + R8AM_L5
						+ "</td><td bgcolor=" + R8AM_neg4 + ">" + R8AM_L4 + "</td><td bgcolor=" + R8AM_neg3 + ">"
						+ R8AM_L3 + "</td><td bgcolor=" + R8AM_neg2 + ">" + R8AM_L2 + "</td><td bgcolor=" + R8AM_neg1
						+ ">" + R8AM_L1 + "</td></tr>"));

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

		// email.addTo("naga.ch199@gmail.com");
		email.send();
		System.out.println("END");
	}
}
