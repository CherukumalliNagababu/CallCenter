package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class DEEEE {
	
	static int All_TransactionSuccess_total;
	static int All_Confirmationpending_total;
	static int All_Repricing_total;
	
	
	static int Com_TS_Transaction_Total=109;
	static int Com_TS_Other_TrancationSuccessfull;
	static int Com_CP_conformation_pending_Total;
	static int Com_CP_Other_conformation_pending;
	
	static int Com_RP_Repricing_Total;
	static int Com_RP_Other_Repricingtotal;
	static int Com_SD_SoldOut_Total;
	static int Com_SD_Other_SoldOutstotal;
	static int Com_CN_CancelledTotal;
	static int Com_CN_Other_CancelledTotal;
	static int Com_TH_Transactionhold_total;
	static int Com_Other_TH_Transactionhold_total;
	
	static int AE_TS_Transaction_Total;
	static int AE_TS_Other_TrancationSuccessfull;
	static int AE_CP_conformation_pending_Total;
	static int AE_CP_Other_conformation_pending;
	static int AE_RP_Repricing_Total;
	static int AE_RP_Other_Repricingtotal;
	static int AE_SD_SoldOut_Total;
	static int AE_SD_Other_SoldOutstotal;
	static int AE_CN_CancelledTotal;
	static int AE_CN_Other_CancelledTotal;
	static int AE_TH_Transactionhold_total;
	static int AE_TH_Other_TransactionholdTotal;
	
	static int EG_TS_Transaction_Total;
	static int EG_TS_Other_TrancationSuccessfull;
	static int EG_CP_conformation_pending_Total;
	static int EG_CP_Other_conformation_pending;
	static int EG_RP_Repricing_Total;
	static int EG_RP_Other_Repricingtotal;
	static int EG_SD_SoldOut_Total;
	static int EG_SD_Other_SoldOutstotal;
	static int EG_CN_CancelledTotal ;
	static int EG_CN_Other_CancelledTotal;
	static int EG_TH_Transactionhold_total;
	static int EG_TH_Other_TransactionHoldTotal;
	
	static int SA_TS_Transaction_Total;
	static int SA_TS_Other_TrancationSuccessfull;
	static int SA_CP_conformation_pending_Total;
	static int SA_CP_Other_conformation_pending;
	static int SA_RP_Repricing_Total;
	static int SA_RP_Other_Repricingtotal;
	static int SA_SD_SoldOut_Total;
	static int SA_SD_Other_SoldOutstotal;
	static int SA_CN_CancelledTotal;
	static int SA_CN_Other_CancelledTotal;
	static int SA_TH_Transactionhold_total ;
	static int SA_TH_Other_TransactionholdTotal;
	
	
	static int Com_TS_Wego;
	static int Com_TS_b2c;
	static int Com_TS_MobIos;
	static int Com_TS_MobAnd;
	static int Com_TS_skyscan ;
	static int  Com_TS_Dhrehlat;
	static int Com_TS_Aviasa;
	static int Com_TS_Kayak;
	static int Com_TS_Dohop;
	static int Com_TS_Farecompare;
	static int Com_TS_Shoogloo;
	static int Com_TS_B2bAgent;
	static int Com_TS_B2b_Skyshop;
	
	static int Com_CP_Wego;
	static int Com_CP_b2c;
	static int Com_CP_MobIos;
	static int Com_CP_MobAnd;
	static int Com_CP_skyscan ;
	static int  Com_CP_Dhrehlat;
	static int Com_CP_Aviasa;
	static int Com_CP_Kayak;
	static int Com_CP_Dohop;
	static int Com_CP_Farecompare;
	static int Com_CP_Shoogloo;
	static int Com_CP_B2bAgent;
	static int Com_CP_B2b_Skyshop;
	
	
	static int Com_RP_Wego; 
	static int Com_RP_b2c ;
	static int Com_RP_MobIos; 
	static int Com_RP_MobAnd ;
	static int Com_RP_skyscan ;
	static int  Com_RP_Dhrehlat ;
	static int Com_RP_Aviasa;
	static int Com_RP_Kayak;
	static int Com_RP_Dohop;
	static int Com_RP_Farecompare;
	static int Com_RP_Shoogloo;
	static int Com_RP_B2bAgent;
	static int Com_RP_B2b_Skyshop;
	
	static int Com_SD_Wego ;
	static int Com_SD_b2c;
	static int Com_SD_MobIos; 
	static int Com_SD_MobAnd ;
	static int Com_SD_skyscan ;
	static int  Com_SD_Dhrehlat ;
	static int Com_SD_Aviasa;
	static int Com_SD_Kayak;
	static int Com_SD_Dohop;
	static int Com_SD_Farecompare;
	static int Com_SD_Shoogloo;
	static int Com_SD_B2bAgent;
	static int Com_SD_B2b_Skyshop;
	
	static int Com_CN_Wego ;
	static int Com_CN_b2c;
	static int Com_CN_MobIos; 
	static int Com_CN_MobAnd ;
	static int Com_CN_skyscan ;
	static int  Com_CN_Dhrehlat ;
	static int Com_CN_Aviasa;
	static int Com_CN_Kayak;
	static int Com_CN_Dohop;
	static int Com_CN_Farecompare;
	static int Com_CN_Shoogloo;
	static int Com_CN_B2bAgent;
	static int Com_CN_B2b_Skyshop;
	
	static int Com_TH_Wego; 
	static int Com_TH_b2c ;
	static int Com_TH_MobIos; 
	static int Com_TH_MobAnd ;
	static int Com_TH_skyscan ;
	static int  Com_TH_Dhrehlat ;
	static int Com_TH_Aviasa;
	static int Com_TH_Kayak;
	static int Com_TH_Dohop;
	static int Com_TH_Farecompare;
	static int Com_TH_Shoogloo;
	static int Com_TH_B2bAgent;
	static int Com_TH_B2b_Skyshop;
	
	static int SA_TS_Wego;
	static int SA_TS_b2c ;
	static int SA_TS_MobIos; 
	static int SA_TS_MobAnd;
	static int SA_TS_skyscan ;
	static int  SA_TS_Dhrehlat ;
	static int SA_TS_Aviasa;
	static int SA_TS_Kayak;
	static int SA_TS_Dohop;
	static int SA_TS_Farecompare;
	static int SA_TS_Shoogloo;
	static int SA_TS_B2bAgent;
	static int SA_TS_B2b_Skyshop;
	
	static int SA_CP_Wego;
	static int SA_CP_b2c ;
	static int SA_CP_MobIos; 
	static int SA_CP_MobAnd;
	static int SA_CP_skyscan ;
	static int  SA_CP_Dhrehlat ;
	static int SA_CP_Aviasa;
	static int SA_CP_Kayak;
	static int SA_CP_Dohop;
	static int SA_CP_Farecompare;
	static int SA_CP_Shoogloo;
	static int SA_CP_B2bAgent;
	static int SA_CP_B2b_Skyshop;
	
	static int SA_RP_Wego ;
	static int SA_RP_b2c;
	static int SA_RP_MobIos; 
	static int SA_RP_MobAnd ;
	static int SA_RP_skyscan ;
	static int  SA_RP_Dhrehlat ;
	static int SA_RP_Aviasa;
	static int SA_RP_Kayak;
	static int SA_RP_Dohop;
	static int SA_RP_Farecompare;
	static int SA_RP_Shoogloo;
	static int SA_RP_B2bAgent;
	static int SA_RP_B2b_Skyshop;
	
	
	static int SA_SD_Wego ;
	static int SA_SD_b2c;
	static int SA_SD_MobIos; 
	static int SA_SD_MobAnd ;
	static int SA_SD_skyscan ;
	static int  SA_SD_Dhrehlat ;
	static int SA_SD_Aviasa;
	static int SA_SD_Kayak;
	static int SA_SD_Dohop;
	static int SA_SD_Farecompare;
	static int SA_SD_Shoogloo;
	static int SA_SD_B2bAgent;
	static int SA_SD_B2b_Skyshop;
	
	static int SA_CN_Wego ;
	static int SA_CN_b2c;
	static int SA_CN_MobIos; 
	static int SA_CN_MobAnd ;
	static int SA_CN_skyscan ;
	static int  SA_CN_Dhrehlat ;
	static int SA_CN_Aviasa;
	static int SA_CN_Kayak;
	static int SA_CN_Dohop;
	static int SA_CN_Farecompare;
	static int SA_CN_Shoogloo;
	static int SA_CN_B2bAgent;
	static int SA_CN_B2b_Skyshop;
	
	static int SA_TH_Wego; 
	static int SA_TH_b2c ;
	static int SA_TH_MobIos; 
	static int SA_TH_MobAnd ;
	static int SA_TH_skyscan ;
	static int SA_TH_Dhrehlat ;
	static int SA_TH_Aviasa;
	static int SA_TH_Kayak;
	static int SA_TH_Dohop;
	static int SA_TH_Farecompare;
	static int SA_TH_Shoogloo;
	static int SA_TH_B2bAgent;
	static int SA_TH_B2b_Skyshop;
	
	static int AE_TS_Wego;
	static int AE_TS_b2c ;
	static int AE_TS_MobIos; 
	static int AE_TS_MobAnd;
	static int AE_TS_skyscan ;
	static int AE_TS_Dhrehlat ;
	static int AE_TS_Aviasa;
	static int AE_TS_Kayak;
	static int AE_TS_Dohop;
	static int AE_TS_Farecompare;
	static int AE_TS_Shoogloo;
	static int AE_TS_B2bAgent;
	static int AE_TS_B2b_Skyshop;
	
	static int AE_CP_Wego;
	static int AE_CP_b2c ;
	static int AE_CP_MobIos; 
	static int AE_CP_MobAnd;
	static int AE_CP_skyscan ;
	static int AE_CP_Dhrehlat ;
	static int AE_CP_Aviasa;
	static int AE_CP_Kayak;
	static int AE_CP_Dohop;
	static int AE_CP_Farecompare;
	static int AE_CP_Shoogloo;
	static int AE_CP_B2bAgent;
	static int AE_CP_B2b_Skyshop;
	
	static int AE_RP_Wego ;
	static int AE_RP_b2c;
	static int AE_RP_MobIos; 
	static int AE_RP_MobAnd ;
	static int AE_RP_skyscan ;
	static int AE_RP_Dhrehlat ;
	static int AE_RP_Aviasa;
	static int AE_RP_Kayak;
	static int AE_RP_Dohop;
	static int AE_RP_Farecompare;
	static int AE_RP_Shoogloo;
	static int AE_RP_B2bAgent;
	static int AE_RP_B2b_Skyshop;
	
	static int AE_SD_Wego ;
	static int AE_SD_b2c;
	static int AE_SD_MobIos; 
	static int AE_SD_MobAnd ;
	static int AE_SD_skyscan ;
	static int AE_SD_Dhrehlat ;
	static int AE_SD_Aviasa;
	static int AE_SD_Kayak;
	static int AE_SD_Dohop;
	static int AE_SD_Farecompare;
	static int AE_SD_Shoogloo;
	static int AE_SD_B2bAgent;
	static int AE_SD_B2b_Skyshop;
	
	static int AE_CN_Wego ;
	static int AE_CN_b2c;
	static int AE_CN_MobIos; 
	static int AE_CN_MobAnd ;
	static int AE_CN_skyscan ;
	static int AE_CN_Dhrehlat ;
	static int AE_CN_Aviasa;
	static int AE_CN_Kayak;
	static int AE_CN_Dohop;
	static int AE_CN_Farecompare;
	static int AE_CN_Shoogloo;
	static int AE_CN_B2bAgent;
	static int AE_CN_B2b_Skyshop;
	
	static int AE_TH_Wego; 
	static int AE_TH_b2c ;
	static int AE_TH_MobIos; 
	static int AE_TH_MobAnd ;
	static int AE_TH_skyscan ;
	static int AE_TH_Dhrehlat ;
	static int AE_TH_Aviasa;
	static int AE_TH_Kayak;
	static int AE_TH_Dohop;
	static int AE_TH_Farecompare;
	static int AE_TH_Shoogloo;
	static int AE_TH_B2bAgent;
	static int AE_TH_B2b_Skyshop;
	
	static int EG_TS_Wego;
	static int EG_TS_b2c ;
	static int EG_TS_MobIos; 
	static int EG_TS_MobAnd;
	static int EG_TS_skyscan ;
	static int EG_TS_Dhrehlat ;
	static int EG_TS_Aviasa;
	static int EG_TS_Kayak;
	static int EG_TS_Dohop;
	static int EG_TS_Farecompare;
	static int EG_TS_Shoogloo;
	static int EG_TS_B2bAgent;
	static int EG_TS_B2b_Skyshop;
	
	static int EG_CP_Wego ;
	static int EG_CP_b2c;
	static int EG_CP_MobIos; 
	static int EG_CP_MobAnd ;
	static int EG_CP_skyscan ;
	static int EG_CP_Dhrehlat ;
	static int EG_CP_Aviasa;
	static int EG_CP_Kayak;
	static int EG_CP_Dohop;
	static int EG_CP_Farecompare;
	static int EG_CP_Shoogloo;
	static int EG_CP_B2bAgent;
	static int EG_CP_B2b_Skyshop;
	
	static int EG_RP_Wego ;
	static int EG_RP_b2c;
	static int EG_RP_MobIos; 
	static int EG_RP_MobAnd ;
	static int EG_RP_skyscan ;
	static int EG_RP_Dhrehlat ;
	static int EG_RP_Aviasa;
	static int EG_RP_Kayak;
	static int EG_RP_Dohop;
	static int EG_RP_Farecompare;
	static int EG_RP_Shoogloo;
	static int EG_RP_B2bAgent;
	static int EG_RP_B2b_Skyshop;
	
	
	static int EG_SD_Wego ;
	static int EG_SD_b2c;
	static int EG_SD_MobIos; 
	static int EG_SD_MobAnd ;
	static int EG_SD_skyscan ;
	static int EG_SD_Dhrehlat ;
	static int EG_SD_Aviasa;
	static int EG_SD_Kayak;
	static int EG_SD_Dohop;
	static int EG_SD_Farecompare;
	static int EG_SD_Shoogloo;
	static int EG_SD_B2bAgent;
	static int EG_SD_B2b_Skyshop;
	
	static int EG_CN_Wego ;
	static int EG_CN_b2c;
	static int EG_CN_MobIos; 
	static int EG_CN_MobAnd ;
	static int EG_CN_skyscan ;
	static int EG_CN_Dhrehlat ;
	static int EG_CN_Aviasa;
	static int EG_CN_Kayak;
	static int EG_CN_Dohop;
	static int EG_CN_Farecompare;
	static int EG_CN_Shoogloo;
	static int EG_CN_B2bAgent;
	static int EG_CN_B2b_Skyshop;
	
	static int EG_TH_Wego; 
	static int EG_TH_b2c ;
	static int EG_TH_MobIos; 
	static int EG_TH_MobAnd ;
	static int EG_TH_skyscan ;
	static int EG_TH_Dhrehlat ;
	static int EG_TH_Aviasa;
	static int EG_TH_Kayak;
	static int EG_TH_Dohop;
	static int EG_TH_Farecompare;
	static int EG_TH_Shoogloo;
	static int EG_TH_B2bAgent;
	static int EG_TH_B2b_Skyshop;

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		// TODO Auto-generated method stub
		
		WritableWorkbook wwb;
		WritableSheet ws;
		
		
		 DateFormat format = new SimpleDateFormat("dd_MMM_yyyy");
	        Date date = new Date();
	       String currentDateTime = format.format(date);
	        String[] getDetails = currentDateTime.split("_");
			System.out.println("Split the Date::" + getDetails[1]);
	        String all=""+currentDateTime;
	        String month=""+getDetails[1];
	        String year=""+getDetails[2];
	       File file = new File("C:/DailyXLReports/"+year);
		    File file1 = new File(file+"/"+month);
		    File file2 = new File(file1+"/"+all);
	          file.mkdir();
	          file1.mkdir();
	          file2.mkdir();
	        
	        
	         /*file = new File("C:/DailyXLReports/"+s);
	        file.mkdir();*/
	      
	        
	       
		FileOutputStream fo = new FileOutputStream(file2+"/Report_"+timestamp()+".xls");
		wwb = Workbook.createWorkbook(fo);
		ws = wwb.createSheet("Results", 0);
		int TCall=All_TransactionSuccess_total+All_Confirmationpending_total;
		String trs = Integer.toString(TCall);
		String rep = Integer.toString(All_Repricing_total);
		Label l = new Label(0, 1,trs );
		Label l1 = new Label(0, 2,rep );
		ws.addCell(l);
		ws.addCell(l1);
		Label Com = new Label(0, 4,"COM" );
		Label AE = new Label(0, 5,"AE" );
		Label SA = new Label(0, 6,"SA" );
		Label EG = new Label(0, 7,"EG" );
		ws.addCell(Com);
		ws.addCell(AE);
		ws.addCell(SA);
		ws.addCell(EG);
		Label DOMAIN = new Label(0, 3,"DOMAIN" );
		Label B2C = new Label(1, 3,"B2C" );
		Label MOBAPP = new Label(2, 3,"MOBAPP" );
		Label MOBIOS = new Label(3, 3,"MOBIOS" );
		Label WEGO = new Label(4, 3,"WEGO" );
		Label SKYSCN = new Label(5, 3,"SKYSCN" );
		Label OTHERS = new Label(6, 3,"OTHERS" );
		ws.addCell(DOMAIN);
		ws.addCell(B2C);
		ws.addCell(MOBAPP);
		ws.addCell(MOBIOS);
		ws.addCell(WEGO);
		ws.addCell(SKYSCN);
		ws.addCell(OTHERS);
		int COM_B2C_ALL=Com_TS_b2c+Com_CP_b2c+Com_RP_b2c;
		int COM_MOBAND_ALL=Com_TS_MobAnd+Com_CP_MobAnd+Com_RP_MobAnd;
		int COM_MOBIOS_ALL=Com_TS_MobIos+Com_CP_MobIos+Com_RP_MobIos;
		int COM_WEGO_ALL=Com_TS_Wego+Com_CP_Wego+Com_RP_Wego;
		int COM_SKYSCAN_ALL=Com_TS_skyscan+Com_CP_skyscan+Com_RP_skyscan;
		int COM_OTHERS_ALL=Com_TS_Other_TrancationSuccessfull+Com_CP_Other_conformation_pending+Com_RP_Other_Repricingtotal;
		
		int AE_B2C_ALL=AE_TS_b2c+AE_CP_b2c+AE_RP_b2c;
		int AE_MOBAND_ALL=AE_TS_MobAnd+AE_CP_MobAnd+AE_RP_MobAnd;
		int AE_MOBIOS_ALL=AE_TS_MobIos+AE_CP_MobIos+AE_RP_MobIos;
		int AE_WEGO_ALL=AE_TS_Wego+AE_CP_Wego+AE_RP_Wego;
		int AE_SKYSCAN_ALL=AE_TS_skyscan+AE_CP_skyscan+AE_RP_skyscan;
		int AE_OTHERS_ALL=AE_TS_Other_TrancationSuccessfull+AE_CP_Other_conformation_pending+AE_RP_Other_Repricingtotal;
		
		int SA_B2C_ALL=SA_TS_b2c+SA_CP_b2c+SA_RP_b2c;
		int SA_MOBAND_ALL=SA_TS_MobAnd+SA_CP_MobAnd+SA_RP_MobAnd;
		int SA_MOBIOS_ALL=SA_TS_MobIos+SA_CP_MobIos+SA_RP_MobIos;
		int SA_WEGO_ALL=SA_TS_Wego+SA_CP_Wego+SA_RP_Wego;
		int SA_SKYSCAN_ALL=SA_TS_skyscan+SA_CP_skyscan+SA_RP_skyscan;
		int SA_OTHERS_ALL=SA_TS_Other_TrancationSuccessfull+SA_CP_Other_conformation_pending+SA_RP_Other_Repricingtotal;
		
		int EG_B2C_ALL=EG_TS_b2c+EG_CP_b2c+EG_RP_b2c;
		int EG_MOBAND_ALL=EG_TS_MobAnd+EG_CP_MobAnd+EG_RP_MobAnd;
		int EG_MOBIOS_ALL=EG_TS_MobIos+EG_CP_MobIos+EG_RP_MobIos;
		int EG_WEGO_ALL=EG_TS_Wego+EG_CP_Wego+EG_RP_Wego;
		int EG_SKYSCAN_ALL=EG_TS_skyscan+EG_CP_skyscan+EG_RP_skyscan;
		int EG_OTHERS_ALL=EG_TS_Other_TrancationSuccessfull+EG_CP_Other_conformation_pending+EG_RP_Other_Repricingtotal;
		
		
		String Com_b2c_s = Integer.toString(COM_B2C_ALL);
		String COM_Mobapp_s = Integer.toString(COM_MOBAND_ALL);
		String COM_Mobios_s = Integer.toString(COM_MOBIOS_ALL);
		String COM_Wego_s = Integer.toString(COM_WEGO_ALL);
		String COM_Skyscan_s = Integer.toString(COM_SKYSCAN_ALL);
		String COM_Other_s = Integer.toString(COM_OTHERS_ALL);
		
		String AE_b2c_s = Integer.toString(AE_B2C_ALL);
		String AE_Mobapp_s = Integer.toString(AE_MOBAND_ALL);
		String AE_Mobios_s = Integer.toString(AE_MOBIOS_ALL);
		String AE_Wego_s = Integer.toString(AE_WEGO_ALL);
		String AE_Skyscan_s = Integer.toString(AE_SKYSCAN_ALL);
		String AE_Other_s = Integer.toString(AE_OTHERS_ALL);
		
		String SA_b2c_s = Integer.toString(SA_B2C_ALL);
		String SA_Mobapp_s = Integer.toString(SA_MOBAND_ALL);
		String SA_Mobios_s = Integer.toString(SA_MOBIOS_ALL);
		String SA_Wego_s = Integer.toString(SA_WEGO_ALL);
		String SA_Skyscan_s = Integer.toString(SA_SKYSCAN_ALL);
		String SA_Other_s = Integer.toString(SA_OTHERS_ALL);
		
		
		String EG_b2c_s = Integer.toString(EG_B2C_ALL);
		String EG_Mobapp_s = Integer.toString(EG_MOBAND_ALL);
		String EG_Mobios_s = Integer.toString(EG_MOBIOS_ALL);
		String EG_Wego_s = Integer.toString(EG_WEGO_ALL);
		String EG_Skyscan_s = Integer.toString(EG_SKYSCAN_ALL);
		String EG_Other_s = Integer.toString(EG_OTHERS_ALL);
		
		Label COM_b2c = new Label(1, 4,Com_b2c_s );
		Label COM_Mobapp = new Label(2, 4,COM_Mobapp_s );
		Label COM_Mobios = new Label(3, 4,COM_Mobios_s );
		Label COM_Wego = new Label(4, 4,COM_Wego_s );
		Label COM_Skyscan = new Label(5, 4,COM_Skyscan_s );
		Label COM_Other = new Label(6, 4,COM_Other_s );
		
		Label AE_b2c = new Label(1, 5,AE_b2c_s );
		Label AE_Mobapp = new Label(2, 5,AE_Mobapp_s );
		Label AE_Mobios = new Label(3, 5,AE_Mobios_s );
		Label AE_Wego = new Label(4, 5,AE_Wego_s );
		Label AE_Skyscan = new Label(5, 5,AE_Skyscan_s);
		Label AE_Other = new Label(6, 5,AE_Other_s );
		
		Label SA_b2c = new Label(1, 6,SA_b2c_s );
		Label SA_Mobapp = new Label(2, 6,SA_Mobapp_s );
		Label SA_Mobios = new Label(3, 6,SA_Mobios_s );
		Label SA_Wego = new Label(4, 6,SA_Wego_s );
		Label SA_Skyscan = new Label(5, 6,SA_Skyscan_s );
		Label SA_Other = new Label(6, 6,SA_Other_s);
		
		
		Label EG_b2c = new Label(1, 7,EG_b2c_s );
		Label EG_Mobapp = new Label(2, 7,EG_Mobapp_s );
		Label EG_Mobios = new Label(3, 7,EG_Mobios_s );
		Label EG_Wego = new Label(4, 7,EG_Wego_s );
		Label EG_Skyscan = new Label(5, 7,EG_Skyscan_s );
		Label EG_Other = new Label(6, 7,EG_Other_s );
		
		
		
		ws.addCell(COM_b2c);
		ws.addCell(COM_Mobapp);
		ws.addCell(COM_Mobios);
		ws.addCell(COM_Wego);
		ws.addCell(COM_Skyscan);
		ws.addCell(COM_Other);
		
		ws.addCell(AE_b2c);
		ws.addCell(AE_Mobapp);
		ws.addCell(AE_Mobios);
		ws.addCell(AE_Wego);
		ws.addCell(AE_Skyscan);
		ws.addCell(AE_Other);
		
		ws.addCell(SA_b2c);
		ws.addCell(SA_Mobapp);
		ws.addCell(SA_Mobios);
		ws.addCell(SA_Wego);
		ws.addCell(SA_Skyscan);
		ws.addCell(SA_Other);
		
		ws.addCell(EG_b2c);
		ws.addCell(EG_Mobapp);
		ws.addCell(EG_Mobios);
		ws.addCell(EG_Wego);
		ws.addCell(EG_Skyscan);
		ws.addCell(EG_Other);
		
		//add all values
		int COM_AllBookings_Count=Com_TS_Transaction_Total+Com_CP_conformation_pending_Total+Com_RP_Repricing_Total+Com_SD_SoldOut_Total+Com_CN_CancelledTotal+Com_TH_Transactionhold_total;
		int AE_AllBookings_Count=AE_TS_Transaction_Total+AE_CP_conformation_pending_Total+AE_RP_Repricing_Total+AE_SD_SoldOut_Total+AE_CN_CancelledTotal+AE_TH_Transactionhold_total;
		int SA_AllBookings_Count=SA_TS_Transaction_Total+SA_CP_conformation_pending_Total+SA_RP_Repricing_Total+SA_SD_SoldOut_Total+SA_CN_CancelledTotal+SA_TH_Transactionhold_total;
		int EG_AllBookings_Count=EG_TS_Transaction_Total+EG_CP_conformation_pending_Total+EG_RP_Repricing_Total+EG_SD_SoldOut_Total+EG_CN_CancelledTotal+EG_TH_Transactionhold_total;
		
		int All_Domains_All_Bookings=COM_AllBookings_Count+AE_AllBookings_Count+SA_AllBookings_Count+EG_AllBookings_Count;
		
		String COM_ALL_COUNT = Integer.toString(COM_AllBookings_Count);
		String AE_ALL_COUNT = Integer.toString(AE_AllBookings_Count);
		String SA_ALL_COUNT = Integer.toString(SA_AllBookings_Count);
		String EG_ALL_COUNT = Integer.toString(EG_AllBookings_Count);
		String TOTAL_ALL_COUNT = Integer.toString(All_Domains_All_Bookings);
		
		
		Label COM_TEXT = new Label(0, 9,"COM" );
		Label AE_TEXT = new Label(0, 10,"AE" );
		Label SA_TEXT = new Label(0, 11,"SA" );
		Label EG_TEXT = new Label(0, 12,"EG" );
		Label Total_TEXT = new Label(0, 13,"TOTAL COUNT" );
		
		Label COM_T = new Label(1, 9,COM_ALL_COUNT);
		Label AE_T = new Label(1, 10,AE_ALL_COUNT);
		Label SA_T = new Label(1, 11,SA_ALL_COUNT);
		Label EG_T = new Label(1, 12,EG_ALL_COUNT );
		Label TOTAL_T = new Label(1, 13,TOTAL_ALL_COUNT );
		
		ws.addCell(COM_TEXT);
		ws.addCell(AE_TEXT);
		ws.addCell(SA_TEXT);
		ws.addCell(EG_TEXT);
		ws.addCell(Total_TEXT);
		
		ws.addCell(COM_T);
		ws.addCell(AE_T);
		ws.addCell(SA_T);
		ws.addCell(EG_T);
		ws.addCell(TOTAL_T);
		
		//Sold Out percentage
		 Double Com_SoldOut = Com_SD_SoldOut_Total /Double.parseDouble(COM_ALL_COUNT) * 100;
		 Double AE_SoldOut = AE_SD_SoldOut_Total /Double.parseDouble(AE_ALL_COUNT)  * 100;
		 Double SA_SoldOut = SA_SD_SoldOut_Total / Double.parseDouble(SA_ALL_COUNT)  * 100;
		 Double EG_SoldOut = EG_SD_SoldOut_Total /Double.parseDouble(EG_ALL_COUNT)  * 100;
		
		 String Com_Sold_Percentage = Double.toString(Com_SoldOut);
			String AE_Sold_Percentage = Double.toString(AE_SoldOut);
			String SA_Sold_Percentage = Double.toString(SA_SoldOut);
			String EG_Sold_Percentage = Double.toString(EG_SoldOut);
		
		Label COM_P = new Label(2, 9,Com_Sold_Percentage);
		Label AE_P = new Label(2, 10,AE_Sold_Percentage);
		Label SA_P = new Label(2, 11,SA_Sold_Percentage);
		Label EG_P = new Label(2, 12,EG_Sold_Percentage );
		ws.addCell(COM_P);
		ws.addCell(AE_P);
		ws.addCell(SA_P);
		ws.addCell(EG_P);
		
		
		
		wwb.write();
		wwb.close();
		System.out.println("close");
	}
	public static String timestamp() {
	    return new SimpleDateFormat("dd_MMM_yyyy hh a").format(new Date());
	}


}
