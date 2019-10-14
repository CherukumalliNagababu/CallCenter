package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class dd {
	static int All_TransactionSuccess_total=100;
	static int All_Repricing_total=545;
	static File file;
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException, BiffException {
		
		
		
		
		
		// TODO Auto-generated method stub
		/*WritableWorkbook wwb;
		WritableSheet ws;
		
		
		 DateFormat format = new SimpleDateFormat("dd_MM_yyyy");
	        Date date = new Date();
	       String currentDateTime = format.format(date);
            String s=""+currentDateTime;
             file = new File("C:/DailyXLReports/"+s);
            file.mkdir();
	      
            
           
		FileOutputStream fo = new FileOutputStream(file+"/Report_"+timestamp()+".xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results", 0);
		String trs = Integer.toString(All_TransactionSuccess_total);
		String rep = Integer.toString(All_Repricing_total);
		Label l = new Label(0, 1,trs );
		Label l1 = new Label(0, 2,rep );
		ws.addCell(l);
		ws.addCell(l1);
		wwb.write();
		wwb.close();*/
		System.out.println("close");
		
		
		
		/*DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date3 = new Date();
		System.out.println(dateFormat.format(date3));
		String st = dateFormat.format(date3);
		String[] SD = st.split("-");
		System.out.println("Split the Year::" + SD[0]);
		System.out.println("Split the month::" + SD[1]);
		System.out.println("Split the Date::" + SD[2]);
		System.out.println(file+"\\Report_"+SD[2]+"-"+SD[1]+"-"+ SD[0]+" 06 PM.xls");
		
		System.out.println("naga");
		FileInputStream fi = new FileInputStream(file+"/Report_"+SD[2]+"-"+ SD[1]+"-"+ SD[0]+" 06 PM.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s1 = wb.getSheet("Results");
		
		String t=s1.getCell(0, 1).getContents();
		String t1=s1.getCell(0, 2).getContents();
		System.out.println(t);
		System.out.println(t1);*/
		
		Calendar cal = Calendar.getInstance();
		 DateFormat lastweek = new SimpleDateFormat("dd_MM_yyyy");
        cal.add(Calendar.DATE, -7);
        Date TO1 = cal.getTime();
        System.out.println(lastweek.format(TO1));
        String st = lastweek.format(TO1);
        String LDate1 = lastweek.format(TO1);
        String[] SD = st.split("_");
 		System.out.println("Split the Date::" + SD[0]);
 		System.out.println("Split the month::" + SD[1]);
 		System.out.println("Split the Year::" + SD[2]);
        
        System.out.println("lastDates  is "+LDate1);
		
        /*DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date3 = new Date();
		System.out.println(dateFormat.format(date3));
		String st = dateFormat.format(date3);
		String[] SD = st.split("-");
		System.out.println("Split the Year::" + SD[0]);
		System.out.println("Split the month::" + SD[1]);
		System.out.println("Split the Date::" + SD[2]);*/
		System.out.println("C:/DailyXLReports/"+LDate1+"/Report_"+SD[0]+"_"+SD[1]+"_"+ SD[2]+" 06 PM.xls");
		
		System.out.println("naga");
		FileInputStream fi = new FileInputStream("C:/DailyXLReports/"+LDate1+"/Report_"+SD[0]+"_"+ SD[1]+"_"+ SD[2]+" 06 PM.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s1 = wb.getSheet("Results");
		
		String t=s1.getCell(0, 1).getContents();
		String t1=s1.getCell(0, 2).getContents();
		System.out.println(t);
		System.out.println(t1);
		
		
		Calendar cal2 = Calendar.getInstance();
		 DateFormat lastweek2 = new SimpleDateFormat("dd_MM_yyyy");
       cal2.add(Calendar.DATE, -14);
       Date TO2 = cal2.getTime(); 
       System.out.println(lastweek2.format(TO2));
       String st1 = lastweek2.format(TO2);
       String LDate2 = lastweek2.format(TO2);
       String[] SD1 = st1.split("_");
		System.out.println("Split the Date::" + SD1[0]);
		System.out.println("Split the month::" + SD1[1]);
		System.out.println("Split the Year::" + SD1[2]);
       System.out.println("lastDates  is "+LDate2);
		
      /* DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = new Date();
		System.out.println(df1.format(d1));
		String st1 = df1.format(d1);
		String[] SD1 = st1.split("-");
		System.out.println("Split the Year::" + SD1[0]);
		System.out.println("Split the month::" + SD1[1]);
		System.out.println("Split the Date::" + SD1[2]);*/
		System.out.println("C:/DailyXLReports/"+LDate2+"/Report_"+SD1[0]+"_"+SD1[1]+"_"+ SD1[2]+" 06 PM.xls");
		
		System.out.println("naga");
		FileInputStream fi1 = new FileInputStream("C:/DailyXLReports/"+LDate2+"/Report_"+SD1[0]+"_"+ SD1[1]+"_"+ SD1[2]+" 06 PM.xls");
		Workbook wb11 = Workbook.getWorkbook(fi1);
		Sheet s11 = wb11.getSheet("Results");
		
		String t2=s11.getCell(0, 1).getContents();
		String t11=s11.getCell(0, 2).getContents();
		System.out.println(t2);
		System.out.println(t11);
		
	}
	public static String timestamp() {
	    return new SimpleDateFormat("dd_MM_yyyy hh a").format(new Date());
	}
	public void getFromXl() throws BiffException, IOException
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date3 = new Date();
		System.out.println(dateFormat.format(date3));
		String st = dateFormat.format(date3);
		String[] SD = st.split("-");
		System.out.println("Split the Year::" + SD[0]);
		System.out.println("Split the month::" + SD[1]);
		System.out.println("Split the Date::" + SD[2]);
		System.out.println(file+"\\Report_"+SD[2]+"-"+SD[1]+"-"+ SD[0]+" 06 PM.xls");
		
		System.out.println("naga");
		FileInputStream fi = new FileInputStream(file+"/Report_"+SD[2]+"-"+ SD[1]+"-"+ SD[0]+" 06 PM.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet s1 = wb.getSheet("Results");
		
		String t=s1.getCell(0, 1).getContents();
		String t1=s1.getCell(0, 2).getContents();
		System.out.println(t);
		System.out.println(t1);
	}
	
	public void getFromXl2() throws BiffException, IOException
	{
		 Calendar cal = Calendar.getInstance();
		 DateFormat lastDates = new SimpleDateFormat("dd_MM_yyyy");
         cal.add(Calendar.DATE, -7);
         Date todate1 = cal.getTime();    
         String fromdate = lastDates.format(todate1);
         System.out.println("lastDates  is "+fromdate);
		
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 		Date date3 = new Date();
 		System.out.println(dateFormat.format(date3));
 		String st = dateFormat.format(date3);
 		String[] SD = st.split("-");
 		System.out.println("Split the Year::" + SD[0]);
 		System.out.println("Split the month::" + SD[1]);
 		System.out.println("Split the Date::" + SD[2]);
 		System.out.println(file+"\\Report_"+SD[2]+"-"+SD[1]+"-"+ SD[0]+" 06 PM.xls");
 		
 		System.out.println("naga");
 		FileInputStream fi = new FileInputStream("C:/DailyXLReports"+fromdate+"/Report_"+SD[2]+"-"+ SD[1]+"-"+ SD[0]+" 06 PM.xls");
 		Workbook wb = Workbook.getWorkbook(fi);
 		Sheet s1 = wb.getSheet("Results");
 		
 		String t=s1.getCell(0, 1).getContents();
 		String t1=s1.getCell(0, 2).getContents();
 		System.out.println(t);
 		System.out.println(t1);
		
	}
	public void Report_10AM() throws BiffException, IOException
	{
		//To day 10:30 Report
		DateFormat Formate_10 = new SimpleDateFormat("dd_MM_yyyy");
		Date d_10 = new Date();
		System.out.println(Formate_10.format(d_10));
		String ToDay_10 = Formate_10.format(d_10);
		String[] SD_10 = ToDay_10.split("_");
		System.out.println("Split the Date::" + SD_10[0]);
		System.out.println("Split the month::" + SD_10[1]);
		System.out.println("Split the Year::" + SD_10[2]);
		System.out.println("C:/DailyXLReports/"+ToDay_10+"/Report_"+SD_10[0]+"_"+SD_10[1]+"_"+ SD_10[2]+" 10 AM.xls");
		
		System.out.println("naga");
		FileInputStream file1 = new FileInputStream("C:/DailyXLReports/"+ToDay_10+"/Report_"+SD_10[0]+"_"+ SD_10[1]+"_"+ SD_10[2]+" 10 AM.xls");
		Workbook wb1 = Workbook.getWorkbook(file1);
		Sheet sheet1 = wb1.getSheet("Results");
		
		String first1=sheet1.getCell(0, 1).getContents();
		String second1=sheet1.getCell(0, 2).getContents();
		System.out.println(first1);
		System.out.println(second1);
		
		//Last week 10:30 Report
		Calendar cal = Calendar.getInstance();
		DateFormat lastweek = new SimpleDateFormat("dd_MM_yyyy");
        cal.add(Calendar.DATE, -7);
        Date TO1 = cal.getTime();
       System.out.println(lastweek.format(TO1));
       String st = lastweek.format(TO1);
       String LDate1 = lastweek.format(TO1);
       String[] SD = st.split("_");
		System.out.println("Split the Date::" + SD[0]);
		System.out.println("Split the month::" + SD[1]);
		System.out.println("Split the Year::" + SD[2]);
       
       System.out.println("lastDates  is "+LDate1);
       System.out.println("C:/DailyXLReports/"+LDate1+"/Report_"+SD[0]+"_"+SD[1]+"_"+ SD[2]+" 06 PM.xls");
		FileInputStream file2 = new FileInputStream("C:/DailyXLReports/"+LDate1+"/Report_"+SD[0]+"_"+ SD[1]+"_"+ SD[2]+" 06 PM.xls");
		Workbook wb2 = Workbook.getWorkbook(file2);
		Sheet sheet2 = wb2.getSheet("Results");
		
		String First2=sheet2.getCell(0, 1).getContents();
		String Second2=sheet2.getCell(0, 2).getContents();
		System.out.println(First2);
		System.out.println(Second2);
		
		//2 weeks back 10:30 Report
				Calendar cal1 = Calendar.getInstance();
				DateFormat lastweek_2 = new SimpleDateFormat("dd_MM_yyyy");
		        cal1.add(Calendar.DATE, -14);
		        Date TO2 = cal1.getTime();
		       System.out.println(lastweek_2.format(TO2));
		       String st1 = lastweek_2.format(TO2);
		       String L_W_Date1 = lastweek_2.format(TO2);
		       String[] SD1 = st1.split("_");
				System.out.println("Split the Date::" + SD1[0]);
				System.out.println("Split the month::" + SD1[1]);
				System.out.println("Split the Year::" + SD1[2]);
		       
		       System.out.println("lastDates  is "+L_W_Date1);
		       System.out.println("C:/DailyXLReports/"+L_W_Date1+"/Report_"+SD1[0]+"_"+SD1[1]+"_"+ SD1[2]+" 06 PM.xls");
				FileInputStream file3 = new FileInputStream("C:/DailyXLReports/"+L_W_Date1+"/Report_"+SD1[0]+"_"+ SD1[1]+"_"+ SD1[2]+" 06 PM.xls");
				Workbook wb3 = Workbook.getWorkbook(file3);
				Sheet sheet3 = wb3.getSheet("Results");
				
				String First3=sheet3.getCell(0, 1).getContents();
				String Second3=sheet3.getCell(0, 2).getContents();
				System.out.println(First3);
				System.out.println(Second3);
		
				//3 weeks back 10:30 Report
				Calendar cal2 = Calendar.getInstance();
				DateFormat lastweek_3 = new SimpleDateFormat("dd_MM_yyyy");
		        cal2.add(Calendar.DATE, -21);
		        Date TO3 = cal2.getTime();
		       System.out.println(lastweek_3.format(TO3));
		       String st2 = lastweek_3.format(TO3);
		       String L_W_Date2 = lastweek_3.format(TO3);
		       String[] SD2 = st2.split("_");
				System.out.println("Split the Date::" + SD2[0]);
				System.out.println("Split the month::" + SD2[1]);
				System.out.println("Split the Year::" + SD2[2]);
		       
		       System.out.println("lastDates  is "+L_W_Date2);
		       System.out.println("C:/DailyXLReports/"+L_W_Date2+"/Report_"+SD2[0]+"_"+SD2[1]+"_"+ SD2[2]+" 06 PM.xls");
				FileInputStream file4 = new FileInputStream("C:/DailyXLReports/"+L_W_Date2+"/Report_"+SD2[0]+"_"+ SD2[1]+"_"+ SD2[2]+" 06 PM.xls");
				Workbook wb4 = Workbook.getWorkbook(file4);
				Sheet sheet4 = wb4.getSheet("Results");
				
				String First4=sheet4.getCell(0, 1).getContents();
				String Second4=sheet4.getCell(0, 2).getContents();
				System.out.println(First4);
				System.out.println(Second4);
		
				
				//4 weeks back 10:30 Report
				Calendar cal3 = Calendar.getInstance();
				DateFormat lastweek_4 = new SimpleDateFormat("dd_MM_yyyy");
		        cal3.add(Calendar.DATE, -28);
		        Date TO4 = cal3.getTime();
		       System.out.println(lastweek_4.format(TO4));
		       String st3 = lastweek_4.format(TO4);
		       String L_W_Date3 = lastweek_4.format(TO4);
		       String[] SD3 = st3.split("_");
				System.out.println("Split the Date::" + SD3[0]);
				System.out.println("Split the month::" + SD3[1]);
				System.out.println("Split the Year::" + SD3[2]);
		       
		       System.out.println("lastDates  is "+L_W_Date3);
		       System.out.println("C:/DailyXLReports/"+L_W_Date3+"/Report_"+SD3[0]+"_"+SD3[1]+"_"+ SD3[2]+" 06 PM.xls");
				FileInputStream file5 = new FileInputStream("C:/DailyXLReports/"+L_W_Date3+"/Report_"+SD3[0]+"_"+ SD3[1]+"_"+ SD3[2]+" 06 PM.xls");
				Workbook wb5 = Workbook.getWorkbook(file5);
				Sheet sheet5 = wb5.getSheet("Results");
				
				String First5=sheet5.getCell(0, 1).getContents();
				String Second5=sheet5.getCell(0, 2).getContents();
				System.out.println(First5);
				System.out.println(Second5);
				
				
				//5 weeks back 10:30 Report
				Calendar cal4 = Calendar.getInstance();
				DateFormat lastweek_5 = new SimpleDateFormat("dd_MM_yyyy");
		        cal4.add(Calendar.DATE, -35);
		        Date TO5 = cal4.getTime();
		       System.out.println(lastweek_5.format(TO5));
		       String st4 = lastweek_5.format(TO5);
		       String L_W_Date4 = lastweek_5.format(TO5);
		       String[] SD4 = st4.split("_");
				System.out.println("Split the Date::" + SD4[0]);
				System.out.println("Split the month::" + SD4[1]);
				System.out.println("Split the Year::" + SD4[2]);
		       
		       System.out.println("lastDates  is "+L_W_Date4);
		       System.out.println("C:/DailyXLReports/"+L_W_Date4+"/Report_"+SD4[0]+"_"+SD4[1]+"_"+ SD4[2]+" 06 PM.xls");
				FileInputStream file6 = new FileInputStream("C:/DailyXLReports/"+L_W_Date4+"/Report_"+SD4[0]+"_"+ SD4[1]+"_"+ SD4[2]+" 06 PM.xls");
				Workbook wb6 = Workbook.getWorkbook(file6);
				Sheet sheet6 = wb6.getSheet("Results");
				
				String First6=sheet6.getCell(0, 1).getContents();
				String Second6=sheet6.getCell(0, 2).getContents();
				System.out.println(First6);
				System.out.println(Second6);
				
				//6 weeks back 10:30 Report
				Calendar cal5 = Calendar.getInstance();
				DateFormat lastweek_6 = new SimpleDateFormat("dd_MM_yyyy");
		        cal5.add(Calendar.DATE, -42);
		        Date TO6 = cal5.getTime();
		       System.out.println(lastweek_6.format(TO6));
		       String st5 = lastweek_6.format(TO6);
		       String L_W_Date5 = lastweek_6.format(TO6);
		       String[] SD5 = st5.split("_");
				System.out.println("Split the Date::" + SD5[0]);
				System.out.println("Split the month::" + SD5[1]);
				System.out.println("Split the Year::" + SD5[2]);
		       
		       System.out.println("lastDates  is "+L_W_Date5);
		       System.out.println("C:/DailyXLReports/"+L_W_Date5+"/Report_"+SD5[0]+"_"+SD5[1]+"_"+ SD5[2]+" 06 PM.xls");
				FileInputStream file7 = new FileInputStream("C:/DailyXLReports/"+L_W_Date5+"/Report_"+SD5[0]+"_"+ SD5[1]+"_"+ SD5[2]+" 06 PM.xls");
				Workbook wb7 = Workbook.getWorkbook(file7);
				Sheet sheet7 = wb7.getSheet("Results");
				
				String First7=sheet7.getCell(0, 1).getContents();
				String Second7=sheet7.getCell(0, 2).getContents();
				System.out.println(First7);
				System.out.println(Second7);
		
		
	}
	
	
}
