package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class differentPageReports {
	
	protected static String Com_b2c_d_lastweek;
	protected static String Com_mobapp_d_lastweek;
	protected static String Com_mobios_d_lastweek;
	protected static String Com_wego_d_lastweek;
	protected static String Com_skyscan_d_lastweek;
	protected static String Com_other_d_lastweek;
	
	protected static String AE_b2c_d_lastweek;
	protected static String AE_mobapp_d_lastweek;
	protected static String AE_mobios_d_lastweek;
	protected static String AE_wego_d_lastweek;
	protected static String AE_skyscan_d_lastweek;
	protected static String AE_other_d_lastweek;
	
	protected static String SA_b2c_d_lastweek;
	protected static String SA_mobapp_d_lastweek;
	protected static String SA_mobios_d_lastweek;
	protected static String SA_wego_d_lastweek;
	protected static String SA_skyscan_d_lastweek;
	protected static String SA_other_d_lastweek;
	
	protected static String EG_b2c_d_lastweek;
	protected static String EG_mobapp_d_lastweek;
	protected static String EG_mobios_d_lastweek;
	protected static String EG_wego_d_lastweek;
	protected static String EG_skyscan_d_lastweek;
	protected static String EG_other_d_lastweek;
	
	
	
	protected static String Com_b2c_d_today;
	protected static String Com_mobapp_d_today;
	protected static String Com_mobios_d_today;
	protected static String Com_wego_d_today;
	protected static String Com_skyscan_d_today;
	protected static String Com_other_d_today;
	
	protected static String AE_b2c_d_today;
	protected static String AE_mobapp_d_today;
	protected static String AE_mobios_d_today;
	protected static String AE_wego_d_today;
	protected static String AE_skyscan_d_today;
	protected static String AE_other_d_today;
	
	protected static String SA_b2c_d_today;
	protected static String SA_mobapp_d_today;
	protected static String SA_mobios_d_today;
	protected static String SA_wego_d_today;
	protected static String SA_skyscan_d_today;
	protected static String SA_other_d_today;
	
	protected static String EG_b2c_d_today;
	protected static String EG_mobapp_d_today;
	protected static String EG_mobios_d_today;
	protected static String EG_wego_d_today;
	protected static String EG_skyscan_d_today;
	protected static String EG_other_d_today;
	
	//Yesterday Report Details
	protected static String Com_b2c_d_yesterday;
	protected static String Com_mobapp_d_yesterday;
	protected static String Com_mobios_d_yesterday;
	protected static String Com_wego_d_yesterday;
	protected static String Com_skyscan_d_yesterday;
	protected static String Com_other_d_yesterday;
	
	protected static String AE_b2c_d_yesterday;
	protected static String AE_mobapp_d_yesterday;
	protected static String AE_mobios_d_yesterday;
	protected static String AE_wego_d_yesterday;
	protected static String AE_skyscan_d_yesterday;
	protected static String AE_other_d_yesterday;
	
	protected static String SA_b2c_d_yesterday;
	protected static String SA_mobapp_d_yesterday;
	protected static String SA_mobios_d_yesterday;
	protected static String SA_wego_d_yesterday;
	protected static String SA_skyscan_d_yesterday;
	protected static String SA_other_d_yesterday;
	
	protected static String EG_b2c_d_yesterday;
	protected static String EG_mobapp_d_yesterday;
	protected static String EG_mobios_d_yesterday;
	protected static String EG_wego_d_yesterday;
	protected static String EG_skyscan_d_yesterday;
	protected static String EG_other_d_yesterday;
	
	protected static String Com_b2c_d_lastweek_yesterday;
	protected static String Com_mobapp_d_lastweek_yesterday;
	protected static String Com_mobios_d_lastweek_yesterday;
	protected static String Com_wego_d_lastweek_yesterday;
	protected static String Com_skyscan_d_lastweek_yesterday;
	protected static String Com_other_d_lastweek_yesterday;
	
	protected static String AE_b2c_d_lastweek_yesterday;
	protected static String AE_mobapp_d_lastweek_yesterday;
	protected static String AE_mobios_d_lastweek_yesterday;
	protected static String AE_wego_d_lastweek_yesterday;
	protected static String AE_skyscan_d_lastweek_yesterday;
	protected static String AE_other_d_lastweek_yesterday;
	
	protected static String SA_b2c_d_lastweek_yesterday;
	protected static String SA_mobapp_d_lastweek_yesterday;
	protected static String SA_mobios_d_lastweek_yesterday;
	protected static String SA_wego_d_lastweek_yesterday;
	protected static String SA_skyscan_d_lastweek_yesterday;
	protected static String SA_other_d_lastweek_yesterday;
	
	protected static String EG_b2c_d_lastweek_yesterday;
	protected static String EG_mobapp_d_lastweek_yesterday;
	protected static String EG_mobios_d_lastweek_yesterday;
	protected static String EG_wego_d_lastweek_yesterday;
	protected static String EG_skyscan_d_lastweek_yesterday;
	protected static String EG_other_d_lastweek_yesterday;
	
	
	protected static int Com_b2c_value;
	protected static int Com_Mobapp_value;
	protected static int Com_Mobios_value;
	protected static int Com_wego_value;
	protected static int Com_Skyscan_value;
	protected static int Com_other_value;
	protected static int Com_total;
	
	protected static int AE_b2c_value;
	protected static int AE_Mobapp_value;
	protected static int AE_Mobios_value;
	protected static int AE_wego_value;
	protected static int AE_Skyscan_value;
	protected static int AE_other_value;
	protected static int AE_total;
	
	protected static int SA_b2c_value;
	protected static int SA_Mobapp_value;
	protected static int SA_Mobios_value;
	protected static int SA_wego_value;
	protected static int SA_Skyscan_value;
	protected static int SA_other_value;
	protected static int SA_total;
	
	protected static int EG_b2c_value;
	protected static int EG_Mobapp_value;
	protected static int EG_Mobios_value;
	protected static int EG_wego_value;
	protected static int EG_Skyscan_value;
	protected static int EG_other_value;
	protected static int EG_total;
	
	protected static int All_Values;
	
	
	protected static int Com_b2c_value_yesterday;
	protected static int Com_Mobapp_value_yesterday;
	protected static int Com_Mobios_value_yesterday;
	protected static int Com_wego_value_yesterday;
	protected static int Com_Skyscan_value_yesterday;
	protected static int Com_other_value_yesterday;
	protected static int Com_total_yesterday;
	
	protected static int AE_b2c_value_yesterday;
	protected static int AE_Mobapp_value_yesterday;
	protected static int AE_Mobios_value_yesterday;
	protected static int AE_wego_value_yesterday;
	protected static int AE_Skyscan_value_yesterday;
	protected static int AE_other_value_yesterday;
	protected static int AE_total_yesterday;
	
	protected static int SA_b2c_value_yesterday;
	protected static int SA_Mobapp_value_yesterday;
	protected static int SA_Mobios_value_yesterday;
	protected static int SA_wego_value_yesterday;
	protected static int SA_Skyscan_value_yesterday;
	protected static int SA_other_value_yesterday;
	protected static int SA_total_yesterday;
	
	protected static int EG_b2c_value_yesterday;
	protected static int EG_Mobapp_value_yesterday;
	protected static int EG_Mobios_value_yesterday;
	protected static int EG_wego_value_yesterday;
	protected static int EG_Skyscan_value_yesterday;
	protected static int EG_other_value_yesterday;
	protected static int EG_total_yesterday;
	
	protected static int All_value_yesterday;
	
	//Html Colour codes
	
	 protected static String com_b2c_color;
	 protected static String com_Mobapp_color;
	 protected static String com_Mobios_color;
	 protected static String com_Wego_color;
	 protected static String com_Skyscan_color;
	 protected static String com_Other_color;
	 protected static String com_total_color;
	 
	 
	 protected static String AE_b2c_color;
	 protected static String AE_Mobapp_color;
	 protected static String AE_Mobios_color;
	 protected static String AE_Wego_color;
	 protected static String AE_Skyscan_color;
	 protected static String AE_Other_color;
	 protected static String AE_total_color;
	 
	 
	 protected static String SA_b2c_color;
	 protected static String SA_Mobapp_color;
	 protected static String SA_Mobios_color;
	 protected static String SA_Wego_color;
	 protected static String SA_Skyscan_color;
	 protected static String SA_Other_color;
	 protected static String SA_total_color;
	 
	 protected static String EG_b2c_color;
	 protected static String EG_Mobapp_color;
	 protected static String EG_Mobios_color;
	 protected static String EG_Wego_color;
	 protected static String EG_Skyscan_color;
	 protected static String EG_Other_color;
	 protected static String EG_total_color;
	 
	 protected static String ALL_values_color;
	 
	//Html Colour codes for Yesterday
		
		 protected static String com_b2c_color_yesterday;
		 protected static String com_Mobapp_color_yesterday;
		 protected static String com_Mobios_color_yesterday;
		 protected static String com_Wego_color_yesterday;
		 protected static String com_Skyscan_color_yesterday;
		 protected static String com_Other_color_yesterday;
		 protected static String com_total_color_yesterday;
		 
		 
		 protected static String AE_b2c_color_yesterday;
		 protected static String AE_Mobapp_color_yesterday;
		 protected static String AE_Mobios_color_yesterday;
		 protected static String AE_Wego_color_yesterday;
		 protected static String AE_Skyscan_color_yesterday;
		 protected static String AE_Other_color_yesterday;
		 protected static String AE_total_color_yesterday;
		 
		 
		 protected static String SA_b2c_color_yesterday;
		 protected static String SA_Mobapp_color_yesterday;
		 protected static String SA_Mobios_color_yesterday;
		 protected static String SA_Wego_color_yesterday;
		 protected static String SA_Skyscan_color_yesterday;
		 protected static String SA_Other_color_yesterday;
		 protected static String SA_total_color_yesterday;
		 
		 protected static String EG_b2c_color_yesterday;
		 protected static String EG_Mobapp_color_yesterday;
		 protected static String EG_Mobios_color_yesterday;
		 protected static String EG_Wego_color_yesterday;
		 protected static String EG_Skyscan_color_yesterday;
		 protected static String EG_Other_color_yesterday;
		 protected static String EG_total_color_yesterday;
		 
		 protected static String ALL_values_color_yesterday;
	 
	 //Sold Percentage
	 
	 protected static String Com_SD;
	 protected static String AE_SD;
	 protected static String SA_SD;
	 protected static String EG_SD;
	 
	 protected static float Com_SD_P;
	 protected static float AE_SD_P;
	 protected static float SA_SD_P;
	 protected static float EG_SD_P;
	 
	 protected static String com_sd_color;
	 protected static String AE_sd_color;
	 protected static String SA_sd_color;
	 protected static String EG_sd_color;
	 
	public static void deviation_Report_Today(String file,int com,int ae,int sa,int eg) throws BiffException, IOException
	{
		FileInputStream file2 = new FileInputStream(file);
		 System.out.println("Today File Date:"+file);
			Workbook wb2 = Workbook.getWorkbook(file2);
			Sheet sheet2 = wb2.getSheet("Results");
			Com_b2c_d_today=sheet2.getCell(1, com).getContents();
			 Com_mobapp_d_today=sheet2.getCell(2, com).getContents();
			 Com_mobios_d_today=sheet2.getCell(3, com).getContents();
			 Com_wego_d_today=sheet2.getCell(4, com).getContents();
			 Com_skyscan_d_today=sheet2.getCell(5, com).getContents();
			 Com_other_d_today=sheet2.getCell(6, com).getContents();
			
			 AE_b2c_d_today=sheet2.getCell(1, ae).getContents();
			 AE_mobapp_d_today=sheet2.getCell(2, ae).getContents();
			 AE_mobios_d_today=sheet2.getCell(3, ae).getContents();
			 AE_wego_d_today=sheet2.getCell(4, ae).getContents();
			 AE_skyscan_d_today=sheet2.getCell(5, ae).getContents();
			 AE_other_d_today=sheet2.getCell(6, ae).getContents();
			
			
			 SA_b2c_d_today=sheet2.getCell(1, sa).getContents();
			 SA_mobapp_d_today=sheet2.getCell(2, sa).getContents();
			 SA_mobios_d_today=sheet2.getCell(3, sa).getContents();
			 SA_wego_d_today=sheet2.getCell(4, sa).getContents();
			 SA_skyscan_d_today=sheet2.getCell(5, sa).getContents();
			 SA_other_d_today=sheet2.getCell(6, sa).getContents();
			
			 EG_b2c_d_today=sheet2.getCell(1, eg).getContents();
			 EG_mobapp_d_today=sheet2.getCell(2, eg).getContents();
			 EG_mobios_d_today=sheet2.getCell(3, eg).getContents();
			 EG_wego_d_today=sheet2.getCell(4, eg).getContents();
			 EG_skyscan_d_today=sheet2.getCell(5, eg).getContents();
			 EG_other_d_today=sheet2.getCell(6, eg).getContents();
	}
	
	public static void deviation_Report_Lastweek(String file,int com,int ae,int sa,int eg) throws BiffException, IOException
	{
		 FileInputStream file2 = new FileInputStream(file);
		 System.out.println("Lastweek File Date:"+file);
			Workbook wb2 = Workbook.getWorkbook(file2);
			Sheet sheet2 = wb2.getSheet("Results");
			
			
			
			
			
		 Com_b2c_d_lastweek=sheet2.getCell(1, com).getContents();
		 Com_mobapp_d_lastweek=sheet2.getCell(2, com).getContents();
		 Com_mobios_d_lastweek=sheet2.getCell(3, com).getContents();
		 Com_wego_d_lastweek=sheet2.getCell(4, com).getContents();
		 Com_skyscan_d_lastweek=sheet2.getCell(5, com).getContents();
		 Com_other_d_lastweek=sheet2.getCell(6, com).getContents();
		
		 AE_b2c_d_lastweek=sheet2.getCell(1, ae).getContents();
		 AE_mobapp_d_lastweek=sheet2.getCell(2, ae).getContents();
		 AE_mobios_d_lastweek=sheet2.getCell(3, ae).getContents();
		 AE_wego_d_lastweek=sheet2.getCell(4, ae).getContents();
		 AE_skyscan_d_lastweek=sheet2.getCell(5, ae).getContents();
		 AE_other_d_lastweek=sheet2.getCell(6, ae).getContents();
		
		
		 SA_b2c_d_lastweek=sheet2.getCell(1, sa).getContents();
		 SA_mobapp_d_lastweek=sheet2.getCell(2, sa).getContents();
		 SA_mobios_d_lastweek=sheet2.getCell(3, sa).getContents();
		 SA_wego_d_lastweek=sheet2.getCell(4, sa).getContents();
		 SA_skyscan_d_lastweek=sheet2.getCell(5, sa).getContents();
		 SA_other_d_lastweek=sheet2.getCell(6, sa).getContents();
		
		 EG_b2c_d_lastweek=sheet2.getCell(1, eg).getContents();
		 EG_mobapp_d_lastweek=sheet2.getCell(2, eg).getContents();
		 EG_mobios_d_lastweek=sheet2.getCell(3, eg).getContents();
		 EG_wego_d_lastweek=sheet2.getCell(4, eg).getContents();
		 EG_skyscan_d_lastweek=sheet2.getCell(5, eg).getContents();
		 EG_other_d_lastweek=sheet2.getCell(6, eg).getContents();
	}

	
	public static void calculation_deviation_Report()
	{
		
		 Com_b2c_value=Integer.parseInt(Com_b2c_d_today)-Integer.parseInt(Com_b2c_d_lastweek);
		 Com_Mobapp_value=Integer.parseInt(Com_mobapp_d_today)-Integer.parseInt(Com_mobapp_d_lastweek);
		 Com_Mobios_value=Integer.parseInt(Com_mobios_d_today)-Integer.parseInt(Com_mobios_d_lastweek);
		 Com_wego_value=Integer.parseInt(Com_wego_d_today)-Integer.parseInt(Com_wego_d_lastweek);
		 Com_Skyscan_value=Integer.parseInt(Com_skyscan_d_today)-Integer.parseInt(Com_skyscan_d_lastweek);
		 Com_other_value=Integer.parseInt(Com_other_d_today)-Integer.parseInt(Com_other_d_lastweek);
		
		 Com_total=Com_b2c_value+Com_Mobapp_value+Com_Mobios_value+Com_wego_value+Com_Skyscan_value+Com_other_value;
		
		 AE_b2c_value=Integer.parseInt(AE_b2c_d_today)-Integer.parseInt(AE_b2c_d_lastweek);
		 AE_Mobapp_value=Integer.parseInt(AE_mobapp_d_today)-Integer.parseInt(AE_mobapp_d_lastweek);
		 AE_Mobios_value=Integer.parseInt(AE_mobios_d_today)-Integer.parseInt(AE_mobios_d_lastweek);
		 AE_wego_value=Integer.parseInt(AE_wego_d_today)-Integer.parseInt(AE_wego_d_lastweek);
		 AE_Skyscan_value=Integer.parseInt(AE_skyscan_d_today)-Integer.parseInt(AE_skyscan_d_lastweek);
		 AE_other_value=Integer.parseInt(AE_other_d_today)-Integer.parseInt(AE_other_d_lastweek);
		
		 AE_total=AE_b2c_value+AE_Mobapp_value+AE_Mobios_value+AE_wego_value+AE_Skyscan_value+AE_other_value;
		
		
		 SA_b2c_value=Integer.parseInt(SA_b2c_d_today)-Integer.parseInt(SA_b2c_d_lastweek);
		 SA_Mobapp_value=Integer.parseInt(SA_mobapp_d_today)-Integer.parseInt(SA_mobapp_d_lastweek);
		 SA_Mobios_value=Integer.parseInt(SA_mobios_d_today)-Integer.parseInt(SA_mobios_d_lastweek);
		 SA_wego_value=Integer.parseInt(SA_wego_d_today)-Integer.parseInt(SA_wego_d_lastweek);
		 SA_Skyscan_value=Integer.parseInt(SA_skyscan_d_today)-Integer.parseInt(SA_skyscan_d_lastweek);
		 SA_other_value=Integer.parseInt(SA_other_d_today)-Integer.parseInt(SA_other_d_lastweek);
		
		 SA_total=SA_b2c_value+SA_Mobapp_value+SA_Mobios_value+SA_wego_value+SA_Skyscan_value+SA_other_value;
		
		
		 EG_b2c_value=Integer.parseInt(EG_b2c_d_today)-Integer.parseInt(EG_b2c_d_lastweek);
		 EG_Mobapp_value=Integer.parseInt(EG_mobapp_d_today)-Integer.parseInt(EG_mobapp_d_lastweek);
		 EG_Mobios_value=Integer.parseInt(EG_mobios_d_today)-Integer.parseInt(EG_mobios_d_lastweek);
		 EG_wego_value=Integer.parseInt(EG_wego_d_today)-Integer.parseInt(EG_wego_d_lastweek);
		 EG_Skyscan_value=Integer.parseInt(EG_skyscan_d_today)-Integer.parseInt(EG_skyscan_d_lastweek);
		 EG_other_value=Integer.parseInt(EG_other_d_today)-Integer.parseInt(EG_other_d_lastweek);
		
		 EG_total=EG_b2c_value+EG_Mobapp_value+EG_Mobios_value+EG_wego_value+EG_Skyscan_value+EG_other_value;
		
		 All_Values=Com_total+AE_total+SA_total+EG_total;
		 
		 
		
		 //COM
		 if(Com_b2c_value>-1)
		 {
			 com_b2c_color="#000000";
		 }
		 else
		 {
			 com_b2c_color="#FF0000";
		 }
		 
		 if(Com_Mobapp_value>-1)
		 {
			 com_Mobapp_color="#000000";
		 }
		 else
		 {
			 com_Mobapp_color="#FF0000";
		 }
		 
		 if(Com_Mobios_value>-1)
		 {
			 com_Mobios_color="#000000";
		 }
		 else
		 {
			 com_Mobios_color="#FF0000";
		 }
		 if(Com_wego_value>-1)
		 {
			 com_Wego_color="#000000";
		 }
		 else
		 {
			 com_Wego_color="#FF0000";
		 }
		 if(Com_Skyscan_value>-1)
		 {
			 com_Skyscan_color="#000000";
		 }
		 else
		 {
			 com_Skyscan_color="#FF0000";
		 }
		 if(Com_other_value>-1)
		 {
			 com_Other_color="#000000";
		 }
		 else
		 {
			 com_Other_color="#FF0000";
		 }
		 
		 if(Com_total>-1)
		 {
			 com_total_color="#000000";
		 }
		 else
		 {
			 com_total_color="#FF0000";
		 }
		 
		 
		 
		 //AE
		 if(AE_b2c_value>-1)
		 {
			 AE_b2c_color="#000000";
		 }
		 else
		 {
			 AE_b2c_color="#FF0000";
		 }
		 
		 if(AE_Mobapp_value>-1)
		 {
			 AE_Mobapp_color="#000000";
		 }
		 else
		 {
			 AE_Mobapp_color="#FF0000";
		 }
		 
		 if(AE_Mobios_value>-1)
		 {
			 AE_Mobios_color="#000000";
		 }
		 else
		 {
			 AE_Mobios_color="#FF0000";
		 }
		 if(AE_wego_value>-1)
		 {
			 AE_Wego_color="#000000";
		 }
		 else
		 {
			 AE_Wego_color="#FF0000";
		 }
		 if(AE_Skyscan_value>-1)
		 {
			 AE_Skyscan_color="#000000";
		 }
		 else
		 {
			 AE_Skyscan_color="#FF0000";
		 }
		 if(AE_other_value>-1)
		 {
			 AE_Other_color="#000000";
		 }
		 else
		 {
			 AE_Other_color="#FF0000";
		 }
		 
		 if(AE_total>-1)
		 {
			 AE_total_color="#000000";
		 }
		 else
		 {
			 AE_total_color="#FF0000";
		 }
		 
		 
		 
		 
		//SA
		 if(SA_b2c_value>-1)
		 {
			 SA_b2c_color="#000000";
		 }
		 else
		 {
			 SA_b2c_color="#FF0000";
		 }
		 
		 if(SA_Mobapp_value>-1)
		 {
			 SA_Mobapp_color="#000000";
		 }
		 else
		 {
			 SA_Mobapp_color="#FF0000";
		 }
		 
		 if(SA_Mobios_value>-1)
		 {
			 SA_Mobios_color="#000000";
		 }
		 else
		 {
			 SA_Mobios_color="#FF0000";
		 }
		 if(SA_wego_value>-1)
		 {
			 SA_Wego_color="#000000";
		 }
		 else
		 {
			 SA_Wego_color="#FF0000";
		 }
		 if(SA_Skyscan_value>-1)
		 {
			 SA_Skyscan_color="#000000";
		 }
		 else
		 {
			 SA_Skyscan_color="#FF0000";
		 }
		 if(SA_other_value>-1)
		 {
			 SA_Other_color="#000000";
		 }
		 else
		 {
			 SA_Other_color="#FF0000";
		 }
		 
		 if(SA_total>-1)
		 {
			 SA_total_color="#000000";
		 }
		 else
		 {
			 SA_total_color="#FF0000";
		 }
		 
		 
		//EG
		 if(EG_b2c_value>-1)
		 {
			 EG_b2c_color="#000000";
		 }
		 else
		 {
			 EG_b2c_color="#FF0000";
		 }
		 
		 if(EG_Mobapp_value>-1)
		 {
			 EG_Mobapp_color="#000000";
		 }
		 else
		 {
			 EG_Mobapp_color="#FF0000";
		 }
		 
		 if(EG_Mobios_value>-1)
		 {
			 EG_Mobios_color="#000000";
		 }
		 else
		 {
			 EG_Mobios_color="#FF0000";
		 }
		 if(EG_wego_value>-1)
		 {
			 EG_Wego_color="#000000";
		 }
		 else
		 {
			 EG_Wego_color="#FF0000";
		 }
		 if(EG_Skyscan_value>-1)
		 {
			 EG_Skyscan_color="#000000";
		 }
		 else
		 {
			 EG_Skyscan_color="#FF0000";
		 }
		 if(EG_other_value>-1)
		 {
			 EG_Other_color="#000000";
		 }
		 else
		 {
			 EG_Other_color="#FF0000";
		 }
		 
		 if(EG_total>-1)
		 {
			 EG_total_color="#000000";
		 }
		 else
		 {
			 EG_total_color="#FF0000";
		 }
		 
		
		 if(All_Values>-1)
		 {
			 ALL_values_color="#000000";
		 }
		 else
		 {
			 ALL_values_color="#FF0000";
		 }
		 
	}
	
	public static void SoldOut_Percentage(String file,int com,int ae,int sa,int eg) throws BiffException, IOException
	{
		 FileInputStream file2 = new FileInputStream(file);
			Workbook wb2 = Workbook.getWorkbook(file2);
			Sheet sheet2 = wb2.getSheet("Results");
			
			 Com_SD=sheet2.getCell(2, com).getContents();
			 AE_SD=sheet2.getCell(2, ae).getContents();
			 SA_SD=sheet2.getCell(2, sa).getContents();
			 EG_SD=sheet2.getCell(2, eg).getContents();
			 
			 
			 Com_SD_P=Float.parseFloat(Com_SD);
			 AE_SD_P=Float.parseFloat(AE_SD);
			 SA_SD_P=Float.parseFloat(SA_SD);
			 EG_SD_P=Float.parseFloat(EG_SD);
			  
			 if(Com_SD_P<=7)
			 {
				 com_sd_color="#170B0B";
				
			 }
			 else
			 {
				
				 com_sd_color="#FF0000";
			 }
			 if(AE_SD_P<=7)
			 {
				 AE_sd_color="#170B0B";
			 }
			 else
			 {
				 AE_sd_color="#FF0000";
			 }
			 if(SA_SD_P<=7)
			 {
				 SA_sd_color="#170B0B";
			 }
			 else
			 {
				 SA_sd_color="#FF0000";
			 }
			 if(EG_SD_P<=7)
			 {
				 EG_sd_color="#170B0B";
			 }
			 else
			 {
				 EG_sd_color="#FF0000";
			 }
	}

	public static void Yesterday_deviation_Report(String file,int com,int ae,int sa,int eg) throws BiffException, IOException
	{
		FileInputStream file2 = new FileInputStream(file);
		 System.out.println("Today File Date:"+file);
			Workbook wb2 = Workbook.getWorkbook(file2);
			Sheet sheet2 = wb2.getSheet("Results");
			Com_b2c_d_yesterday=sheet2.getCell(1, com).getContents();
			 Com_mobapp_d_yesterday=sheet2.getCell(2, com).getContents();
			 Com_mobios_d_yesterday=sheet2.getCell(3, com).getContents();
			 Com_wego_d_yesterday=sheet2.getCell(4, com).getContents();
			 Com_skyscan_d_yesterday=sheet2.getCell(5, com).getContents();
			 Com_other_d_yesterday=sheet2.getCell(6, com).getContents();
			
			 AE_b2c_d_yesterday=sheet2.getCell(1, ae).getContents();
			 AE_mobapp_d_yesterday=sheet2.getCell(2, ae).getContents();
			 AE_mobios_d_yesterday=sheet2.getCell(3, ae).getContents();
			 AE_wego_d_yesterday=sheet2.getCell(4, ae).getContents();
			 AE_skyscan_d_yesterday=sheet2.getCell(5, ae).getContents();
			 AE_other_d_yesterday=sheet2.getCell(6, ae).getContents();
			
			
			 SA_b2c_d_yesterday=sheet2.getCell(1, sa).getContents();
			 SA_mobapp_d_yesterday=sheet2.getCell(2, sa).getContents();
			 SA_mobios_d_yesterday=sheet2.getCell(3, sa).getContents();
			 SA_wego_d_yesterday=sheet2.getCell(4, sa).getContents();
			 SA_skyscan_d_yesterday=sheet2.getCell(5, sa).getContents();
			 SA_other_d_yesterday=sheet2.getCell(6, sa).getContents();
			
			 EG_b2c_d_yesterday=sheet2.getCell(1, eg).getContents();
			 EG_mobapp_d_yesterday=sheet2.getCell(2, eg).getContents();
			 EG_mobios_d_yesterday=sheet2.getCell(3, eg).getContents();
			 EG_wego_d_yesterday=sheet2.getCell(4, eg).getContents();
			 EG_skyscan_d_yesterday=sheet2.getCell(5, eg).getContents();
			 EG_other_d_yesterday=sheet2.getCell(6, eg).getContents();
	}
	
	public static void Yesterday_deviation_Report_Lastweek(String file,int com,int ae,int sa,int eg) throws BiffException, IOException
	{
		 FileInputStream file2 = new FileInputStream(file);
		 System.out.println("Lastweek File Date:"+file);
			Workbook wb2 = Workbook.getWorkbook(file2);
			Sheet sheet2 = wb2.getSheet("Results");
			
			
			
			
			
		 Com_b2c_d_lastweek_yesterday=sheet2.getCell(1, com).getContents();
		 Com_mobapp_d_lastweek_yesterday=sheet2.getCell(2, com).getContents();
		 Com_mobios_d_lastweek_yesterday=sheet2.getCell(3, com).getContents();
		 Com_wego_d_lastweek_yesterday=sheet2.getCell(4, com).getContents();
		 Com_skyscan_d_lastweek_yesterday=sheet2.getCell(5, com).getContents();
		 Com_other_d_lastweek_yesterday=sheet2.getCell(6, com).getContents();
		
		 AE_b2c_d_lastweek_yesterday=sheet2.getCell(1, ae).getContents();
		 AE_mobapp_d_lastweek_yesterday=sheet2.getCell(2, ae).getContents();
		 AE_mobios_d_lastweek_yesterday=sheet2.getCell(3, ae).getContents();
		 AE_wego_d_lastweek_yesterday=sheet2.getCell(4, ae).getContents();
		 AE_skyscan_d_lastweek_yesterday=sheet2.getCell(5, ae).getContents();
		 AE_other_d_lastweek_yesterday=sheet2.getCell(6, ae).getContents();
		
		
		 SA_b2c_d_lastweek_yesterday=sheet2.getCell(1, sa).getContents();
		 SA_mobapp_d_lastweek_yesterday=sheet2.getCell(2, sa).getContents();
		 SA_mobios_d_lastweek_yesterday=sheet2.getCell(3, sa).getContents();
		 SA_wego_d_lastweek_yesterday=sheet2.getCell(4, sa).getContents();
		 SA_skyscan_d_lastweek_yesterday=sheet2.getCell(5, sa).getContents();
		 SA_other_d_lastweek_yesterday=sheet2.getCell(6, sa).getContents();
		
		 EG_b2c_d_lastweek_yesterday=sheet2.getCell(1, eg).getContents();
		 EG_mobapp_d_lastweek_yesterday=sheet2.getCell(2, eg).getContents();
		 EG_mobios_d_lastweek_yesterday=sheet2.getCell(3, eg).getContents();
		 EG_wego_d_lastweek_yesterday=sheet2.getCell(4, eg).getContents();
		 EG_skyscan_d_lastweek_yesterday=sheet2.getCell(5, eg).getContents();
		 EG_other_d_lastweek_yesterday=sheet2.getCell(6, eg).getContents();
	}

	public static void Yesterday_calculation_deviation_Report()
	{
		
		 Com_b2c_value_yesterday=Integer.parseInt(Com_b2c_d_yesterday)-Integer.parseInt(Com_b2c_d_lastweek_yesterday);
		 Com_Mobapp_value_yesterday=Integer.parseInt(Com_mobapp_d_yesterday)-Integer.parseInt(Com_mobapp_d_lastweek_yesterday);
		 Com_Mobios_value_yesterday=Integer.parseInt(Com_mobios_d_yesterday)-Integer.parseInt(Com_mobios_d_lastweek_yesterday);
		 Com_wego_value_yesterday=Integer.parseInt(Com_wego_d_yesterday)-Integer.parseInt(Com_wego_d_lastweek_yesterday);
		 Com_Skyscan_value_yesterday=Integer.parseInt(Com_skyscan_d_yesterday)-Integer.parseInt(Com_skyscan_d_lastweek_yesterday);
		 Com_other_value_yesterday=Integer.parseInt(Com_other_d_yesterday)-Integer.parseInt(Com_other_d_lastweek_yesterday);
		
		 Com_total_yesterday=Com_b2c_value_yesterday+Com_Mobapp_value_yesterday+Com_Mobios_value_yesterday+Com_wego_value_yesterday+Com_Skyscan_value_yesterday+Com_other_value_yesterday;
		
		 AE_b2c_value_yesterday=Integer.parseInt(AE_b2c_d_yesterday)-Integer.parseInt(AE_b2c_d_lastweek_yesterday);
		 AE_Mobapp_value_yesterday=Integer.parseInt(AE_mobapp_d_yesterday)-Integer.parseInt(AE_mobapp_d_lastweek_yesterday);
		 AE_Mobios_value_yesterday=Integer.parseInt(AE_mobios_d_yesterday)-Integer.parseInt(AE_mobios_d_lastweek_yesterday);
		 AE_wego_value_yesterday=Integer.parseInt(AE_wego_d_yesterday)-Integer.parseInt(AE_wego_d_lastweek_yesterday);
		 AE_Skyscan_value_yesterday=Integer.parseInt(AE_skyscan_d_yesterday)-Integer.parseInt(AE_skyscan_d_lastweek_yesterday);
		 AE_other_value_yesterday=Integer.parseInt(AE_other_d_yesterday)-Integer.parseInt(AE_other_d_lastweek_yesterday);
		
		 AE_total_yesterday=AE_b2c_value_yesterday+AE_Mobapp_value_yesterday+AE_Mobios_value_yesterday+AE_wego_value_yesterday+AE_Skyscan_value_yesterday+AE_other_value_yesterday;
		
		
		 SA_b2c_value_yesterday=Integer.parseInt(SA_b2c_d_yesterday)-Integer.parseInt(SA_b2c_d_lastweek_yesterday);
		 SA_Mobapp_value_yesterday=Integer.parseInt(SA_mobapp_d_yesterday)-Integer.parseInt(SA_mobapp_d_lastweek_yesterday);
		 SA_Mobios_value_yesterday=Integer.parseInt(SA_mobios_d_yesterday)-Integer.parseInt(SA_mobios_d_lastweek_yesterday);
		 SA_wego_value_yesterday=Integer.parseInt(SA_wego_d_yesterday)-Integer.parseInt(SA_wego_d_lastweek_yesterday);
		 SA_Skyscan_value_yesterday=Integer.parseInt(SA_skyscan_d_yesterday)-Integer.parseInt(SA_skyscan_d_lastweek_yesterday);
		 SA_other_value_yesterday=Integer.parseInt(SA_other_d_yesterday)-Integer.parseInt(SA_other_d_lastweek_yesterday);
		
		 SA_total_yesterday=SA_b2c_value_yesterday+SA_Mobapp_value_yesterday+SA_Mobios_value_yesterday+SA_wego_value_yesterday+SA_Skyscan_value_yesterday+SA_other_value_yesterday;
		
		
		 EG_b2c_value_yesterday=Integer.parseInt(EG_b2c_d_yesterday)-Integer.parseInt(EG_b2c_d_lastweek_yesterday);
		 EG_Mobapp_value_yesterday=Integer.parseInt(EG_mobapp_d_yesterday)-Integer.parseInt(EG_mobapp_d_lastweek_yesterday);
		 EG_Mobios_value_yesterday=Integer.parseInt(EG_mobios_d_yesterday)-Integer.parseInt(EG_mobios_d_lastweek_yesterday);
		 EG_wego_value_yesterday=Integer.parseInt(EG_wego_d_yesterday)-Integer.parseInt(EG_wego_d_lastweek_yesterday);
		 EG_Skyscan_value_yesterday=Integer.parseInt(EG_skyscan_d_yesterday)-Integer.parseInt(EG_skyscan_d_lastweek_yesterday);
		 EG_other_value_yesterday=Integer.parseInt(EG_other_d_yesterday)-Integer.parseInt(EG_other_d_lastweek_yesterday);
		
		 EG_total_yesterday=EG_b2c_value_yesterday+EG_Mobapp_value_yesterday+EG_Mobios_value_yesterday+EG_wego_value_yesterday+EG_Skyscan_value_yesterday+EG_other_value_yesterday;
		
		 All_value_yesterday=Com_total_yesterday+AE_total_yesterday+SA_total_yesterday+EG_total_yesterday;
		 
		 
		
		 //COM
		 if(Com_b2c_value_yesterday>-1)
		 {
			 com_b2c_color_yesterday="#000000";
		 }
		 else
		 {
			 com_b2c_color_yesterday="#FF0000";
		 }
		 
		 if(Com_Mobapp_value_yesterday>-1)
		 {
			 com_Mobapp_color_yesterday="#000000";
		 }
		 else
		 {
			 com_Mobapp_color_yesterday="#FF0000";
		 }
		 
		 if(Com_Mobios_value_yesterday>-1)
		 {
			 com_Mobios_color_yesterday="#000000";
		 }
		 else
		 {
			 com_Mobios_color_yesterday="#FF0000";
		 }
		 if(Com_wego_value_yesterday>-1)
		 {
			 com_Wego_color_yesterday="#000000";
		 }
		 else
		 {
			 com_Wego_color_yesterday="#FF0000";
		 }
		 if(Com_Skyscan_value_yesterday>-1)
		 {
			 com_Skyscan_color_yesterday="#000000";
		 }
		 else
		 {
			 com_Skyscan_color_yesterday="#FF0000";
		 }
		 if(Com_other_value_yesterday>-1)
		 {
			 com_Other_color_yesterday="#000000";
		 }
		 else
		 {
			 com_Other_color_yesterday="#FF0000";
		 }
		 
		 if(Com_total_yesterday>-1)
		 {
			 com_total_color_yesterday="#000000";
		 }
		 else
		 {
			 com_total_color_yesterday="#FF0000";
		 }
		 
		 
		 
		 //AE
		 if(AE_b2c_value_yesterday>-1)
		 {
			 AE_b2c_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_b2c_color_yesterday="#FF0000";
		 }
		 
		 if(AE_Mobapp_value_yesterday>-1)
		 {
			 AE_Mobapp_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_Mobapp_color_yesterday="#FF0000";
		 }
		 
		 if(AE_Mobios_value_yesterday>-1)
		 {
			 AE_Mobios_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_Mobios_color_yesterday="#FF0000";
		 }
		 if(AE_wego_value_yesterday>-1)
		 {
			 AE_Wego_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_Wego_color_yesterday="#FF0000";
		 }
		 if(AE_Skyscan_value_yesterday>-1)
		 {
			 AE_Skyscan_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_Skyscan_color_yesterday="#FF0000";
		 }
		 if(AE_other_value_yesterday>-1)
		 {
			 AE_Other_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_Other_color_yesterday="#FF0000";
		 }
		 
		 if(AE_total_yesterday>-1)
		 {
			 AE_total_color_yesterday="#000000";
		 }
		 else
		 {
			 AE_total_color_yesterday="#FF0000";
		 }
		 
		 
		 
		 
		//SA
		 if(SA_b2c_value_yesterday>-1)
		 {
			 SA_b2c_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_b2c_color_yesterday="#FF0000";
		 }
		 
		 if(SA_Mobapp_value_yesterday>-1)
		 {
			 SA_Mobapp_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_Mobapp_color_yesterday="#FF0000";
		 }
		 
		 if(SA_Mobios_value_yesterday>-1)
		 {
			 SA_Mobios_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_Mobios_color_yesterday="#FF0000";
		 }
		 if(SA_wego_value_yesterday>-1)
		 {
			 SA_Wego_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_Wego_color_yesterday="#FF0000";
		 }
		 if(SA_Skyscan_value_yesterday>-1)
		 {
			 SA_Skyscan_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_Skyscan_color_yesterday="#FF0000";
		 }
		 if(SA_other_value_yesterday>-1)
		 {
			 SA_Other_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_Other_color_yesterday="#FF0000";
		 }
		 
		 if(SA_total_yesterday>-1)
		 {
			 SA_total_color_yesterday="#000000";
		 }
		 else
		 {
			 SA_total_color_yesterday="#FF0000";
		 }
		 
		 
		//EG
		 if(EG_b2c_value_yesterday>-1)
		 {
			 EG_b2c_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_b2c_color_yesterday="#FF0000";
		 }
		 
		 if(EG_Mobapp_value_yesterday>-1)
		 {
			 EG_Mobapp_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_Mobapp_color_yesterday="#FF0000";
		 }
		 
		 if(EG_Mobios_value_yesterday>-1)
		 {
			 EG_Mobios_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_Mobios_color_yesterday="#FF0000";
		 }
		 if(EG_wego_value_yesterday>-1)
		 {
			 EG_Wego_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_Wego_color_yesterday="#FF0000";
		 }
		 if(EG_Skyscan_value_yesterday>-1)
		 {
			 EG_Skyscan_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_Skyscan_color_yesterday="#FF0000";
		 }
		 if(EG_other_value_yesterday>-1)
		 {
			 EG_Other_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_Other_color_yesterday="#FF0000";
		 }
		 
		 if(EG_total_yesterday>-1)
		 {
			 EG_total_color_yesterday="#000000";
		 }
		 else
		 {
			 EG_total_color_yesterday="#FF0000";
		 }
		 
		
		 if(All_value_yesterday>-1)
		 {
			 ALL_values_color_yesterday="#000000";
		 }
		 else
		 {
			 ALL_values_color_yesterday="#FF0000";
		 }
		 
	}
	
	

}
