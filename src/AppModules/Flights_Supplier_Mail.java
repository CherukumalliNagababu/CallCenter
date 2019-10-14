package AppModules;

import java.io.File;
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

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import utility.Utils;

public class Flights_Supplier_Mail extends Flights_Supplier_BookingReport {
	static int All_TransactionSuccess_total;
	static int All_Confirmationpending_total;
	static int All_Repricing_total;
	static File file;
public static void GenerateMail(int iTestCaseRow,WebDriver driver) throws Exception {
		
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


	
	
	//Supplier Transaction Successful
			String COM_TS_Sup_Total = new Integer(Com_TS_Supplier_Transaction_Total).toString();
			String AE_TS_Sup_Total = new Integer(AE_TS_Supplier_Transaction_Total).toString();
			String SA_TS_Sup_Total = new Integer(SA_TS_Supplier_Transaction_Total).toString();
			String EG_TS_Sup_Total = new Integer(EG_TS_Supplier_Transaction_Total).toString();

			int TS_Sup_TotalValue = Integer.parseInt(COM_TS_Sup_Total) + Integer.parseInt(AE_TS_Sup_Total) +Integer.parseInt(SA_TS_Sup_Total) + Integer.parseInt(EG_TS_Sup_Total);
			 int All_Sup_TransactionSuccess_total = TS_Sup_TotalValue; 
			System.out.println("SUPPLIERS TRANSACTION SUCCESS GRAND TOTAL:::----"+All_Sup_TransactionSuccess_total);

			//Supplier Confirmation pending
			String COM_CP_Sup_Total = new Integer(Com_CP_Supplier_ConfirmationPending_Total).toString();
			String AE_CP_Sup_Total = new Integer(AE_CP_Supplier_ConfirmationPending_Total).toString();
			String SA_CP_Sup_Total = new Integer(SA_CP_Supplier_ConfirmationPending_Total).toString();
			String EG_CP_Sup_Total = new Integer(EG_CP_Supplier_ConfirmationPending_Total).toString();



			 int CP_Sup_TotalValue = Integer.parseInt(COM_CP_Sup_Total) + Integer.parseInt(AE_CP_Sup_Total) +Integer.parseInt(SA_CP_Sup_Total) + Integer.parseInt(EG_CP_Sup_Total);
			  int All_Sup_Confirmationpending_total = CP_Sup_TotalValue; 
			System.out.println("SUPPLIERS CONFIRMATION PENDING GRAND TOTAL:::----"+All_Sup_Confirmationpending_total);

			
			//Supplier Repricing
			String COM_RP_Sup_Total = new Integer(Com_RP_Supplier_Repricing_Total).toString();
			String AE_RP_Sup_Total = new Integer(AE_RP_Supplier_Repricing_Total).toString();
			String SA_RP_Sup_Total = new Integer(SA_RP_Supplier_Repricing_Total).toString();
			String EG_RP_Sup_Total = new Integer(EG_RP_Supplier_Repricing_Total).toString();

			int RP_Sup_TotalValue = Integer.parseInt(COM_RP_Sup_Total) + Integer.parseInt(AE_RP_Sup_Total) +Integer.parseInt(SA_RP_Sup_Total) + Integer.parseInt(EG_RP_Sup_Total);
			 int All_Sup_Repricing_total = RP_Sup_TotalValue; 
			System.out.println("SUPPLIERS REPRICING  GRAND TOTAL:::----"+All_Sup_Repricing_total);

			
			//Supplier SoldOuts
				String COM_SD_Sup_Total = new Integer(Com_SD_Supplier_Soldout_Total).toString();
				String AE_SD_Sup_Total = new Integer(AE_SD_Supplier_Soldout_Total).toString();
				String SA_SD_Sup_Total = new Integer(SA_SD_Supplier_Soldout_Total).toString();
				String EG_SD_Sup_Total = new Integer(EG_SD_Supplier_Soldout_Total).toString();
				
				int SD_Sup_TotalValue = Integer.parseInt(COM_SD_Sup_Total) + Integer.parseInt(AE_SD_Sup_Total) +Integer.parseInt(SA_SD_Sup_Total) + Integer.parseInt(EG_SD_Sup_Total);
				int All_Sup_SoldOut_total = SD_Sup_TotalValue; 
				System.out.println("SUPPLIERS SOLD OUTS GRAND TOTAL:::----"+All_Sup_SoldOut_total);
				
				//Supplier Cancelled
				String COM_CN_Sup_Total = new Integer(Com_CN_Supplier_Cancelled_Total).toString();
				String AE_CN_Sup_Total = new Integer(AE_CN_Supplier_Cancelled_Total).toString();
				String SA_CN_Sup_Total = new Integer(SA_CN_Supplier_Cancelled_Total).toString();
				String EG_CN_Sup_Total = new Integer(EG_CN_Supplier_Cancelled_Total).toString();
				int CN_Sup_TotalValue = Integer.parseInt(COM_CN_Sup_Total) + Integer.parseInt(AE_CN_Sup_Total) +Integer.parseInt(SA_CN_Sup_Total) + Integer.parseInt(EG_CN_Sup_Total);
				 int All_Sup_Cancelled_total = CN_Sup_TotalValue; 
				System.out.println("SUPPLIERS CANCELLED GRAND TOTAL:::----"+All_Sup_Cancelled_total);
				
		       // SUPPLIERS Transaction Hold
				String COM_TH_Sup_Total = new Integer( Com_TH_Supplier_Transaction_Hold_Total).toString();
				String AE_TH_Sup_Total = new Integer(AE_TH_Supplier_Transaction_Hold_Total).toString();
				String SA_TH_Sup_Total = new Integer(SA_TH_Supplier_Transaction_Hold_Total).toString();
				String EG_TH_Sup_Total = new Integer(EG_TH_Supplier_Transaction_Hold_Total).toString();
				int TH_Sup_TotalValue = Integer.parseInt(COM_TH_Sup_Total) + Integer.parseInt(AE_TH_Sup_Total) +Integer.parseInt(SA_TH_Sup_Total) + Integer.parseInt(EG_TH_Sup_Total);
				int All_Sup_TransactionHold_total = TH_Sup_TotalValue; 
				System.out.println("SUPPLIERS TRANSACTION HOLD GRAND TOTAL:::----"+All_Sup_TransactionHold_total);


	
	
	
	
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
  All_Confirmationpending_total = CP_TotalValue; 
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
	
	
	

			//Total value of All Domains
			//Transaction Succefull
			int Gal_3K6_T=Com_TS_G_3K6+AE_TS_G_3K6+SA_TS_G_3K6+EG_TS_G_3K6;
			int G_3R1G_T=Com_TS_G_3R1+AE_TS_G_3R1+SA_TS_G_3R1+EG_TS_G_3R1;
			int G_570E_T=Com_TS_G_570E+AE_TS_G_570E+SA_TS_G_570E+EG_TS_G_570E;
			int G_5N61_T=Com_TS_G_5N61+AE_TS_G_5N61+SA_TS_G_5N61+EG_TS_G_5N61;
			int G_7FK5_T=Com_TS_G_7FK5+AE_TS_G_7FK5+SA_TS_G_7FK5+EG_TS_G_7FK5;
			
			int G_7JY2_T=Com_TS_G_7JY2+AE_TS_G_7JY2+SA_TS_G_7JY2+EG_TS_G_7JY2;
			int G_7X7W_T=Com_TS_G_7X7W+AE_TS_G_7X7W+SA_TS_G_7X7W+EG_TS_G_7X7W;
			int G_802N_T=Com_TS_G_802N+AE_TS_G_802N+SA_TS_G_802N+EG_TS_G_802N;
			int G_802R_T=Com_TS_G_802R+AE_TS_G_802R+SA_TS_G_802R+EG_TS_G_802R;
			
			int G_8SQ7_T=Com_TS_G_8SQ7+AE_TS_G_8SQ7+SA_TS_G_8SQ7+EG_TS_G_8SQ7;
			int JAZEERA_T=Com_TS_JAZEERA+AE_TS_JAZEERA+SA_TS_JAZEERA+EG_TS_JAZEERA;
			int KIWI_T=Com_TS_KIWI+AE_TS_KIWI+SA_TS_KIWI+EG_TS_KIWI;
			int Manual_T=Com_TS_M_u+AE_TS_M_u+SA_TS_M_u+EG_TS_M_u;
			
			int My_Fly_T=Com_TS_My_Fly+AE_TS_My_Fly+SA_TS_My_Fly+EG_TS_My_Fly;
			int NESMA_T=Com_TS_NESMA+AE_TS_NESMA+SA_TS_NESMA+EG_TS_NESMA;
			int PEGASUS_T=Com_TS_PEGASUS+AE_TS_PEGASUS+SA_TS_PEGASUS+EG_TS_PEGASUS;
			int S_9JFH_T=Com_TS_S_9JFH+AE_TS_S_9JFH+SA_TS_S_9JFH+EG_TS_S_9JFH;
			
			int S_ID2I_T=Com_TS_S_ID2I+AE_TS_S_ID2I+SA_TS_S_ID2I+EG_TS_S_ID2I;
			int S_L8YI_T=Com_TS_S_L8YI+AE_TS_S_L8YI+SA_TS_S_L8YI+EG_TS_S_L8YI;
			int S_L9AI_T=Com_TS_S_L9AI+AE_TS_S_L9AI+SA_TS_S_L9AI+EG_TS_S_L9AI;
			int S_L9CI_T=Com_TS_S_L9CI+AE_TS_S_L9CI+SA_TS_S_L9CI+EG_TS_S_L9CI;
			
			int S_T13I_T=Com_TS_S_T13I+AE_TS_S_T13I+SA_TS_S_T13I+EG_TS_S_T13I;
			int S_T20I_T=Com_TS_S_T20I+AE_TS_S_T20I+SA_TS_S_T20I+EG_TS_S_T20I;
			int SALAM_T=Com_TS_SALAM+AE_TS_SALAM+SA_TS_SALAM+EG_TS_SALAM;
			int S_Jet_T=Com_TS_S_Jet+AE_TS_S_Jet+SA_TS_S_Jet+EG_TS_S_Jet;
			
			int U_3R1G_T=Com_TS_U_3R1G+AE_TS_U_3R1G+SA_TS_U_3R1G+EG_TS_U_3R1G;
			int U_570E_T=Com_TS_U_570E+AE_TS_U_570E+SA_TS_U_570E+EG_TS_U_570E;
			int U_5N61_T=Com_TS_U_5N61+AE_TS_U_5N61+SA_TS_U_5N61+EG_TS_U_5N61;
			int U_6E_T=Com_TS_U_6E+AE_TS_U_6E+SA_TS_U_6E+EG_TS_U_6E;
			
			int U_7FK5_T=Com_TS_U_7FK5+AE_TS_U_7FK5+SA_TS_U_7FK5+EG_TS_U_7FK5;
			int U_7JY2_T=Com_TS_U_7JY2+AE_TS_U_7JY2+SA_TS_U_7JY2+EG_TS_U_7JY2;
			int U_802N_T=Com_TS_U_802N+AE_TS_U_802N+SA_TS_U_802N+EG_TS_U_802N;
			int U_802R_T=Com_TS_U_802R+AE_TS_U_802R+SA_TS_U_802R+EG_TS_U_802R;
			
			int U_8SQ7_T=Com_TS_U_8SQ7+AE_TS_U_8SQ7+SA_TS_U_8SQ7+EG_TS_U_8SQ7;
			int WATANIYA_T=Com_TS_WATANIYA+AE_TS_WATANIYA+SA_TS_WATANIYA+EG_TS_WATANIYA;
			int A_AR_T=Com_TS_A_AR+AE_TS_A_AR+SA_TS_A_AR+EG_TS_A_AR;
			int A_AR_E_T=Com_TS_A_AR_E+AE_TS_A_AR_E+SA_TS_A_AR_E+EG_TS_A_AR_E;
			
			int A_AR_M_T=Com_TS_A_AR_M+AE_TS_A_AR_M+SA_TS_A_AR_M+EG_TS_A_AR_M;
			int A_I_E_T=Com_TS_A_I_E+AE_TS_A_I_E+SA_TS_A_I_E+EG_TS_A_I_E;
			int FlyDubai_T=Com_TS_FlyDubai+AE_TS_FlyDubai+SA_TS_FlyDubai+EG_TS_FlyDubai;
			int Flynas_T=Com_TS_Flynas+AE_TS_Flynas+SA_TS_Flynas+EG_TS_Flynas;
			int Flyadeal_T=Com_TS_Flyadeal+AE_TS_Flyadeal+SA_TS_Flyadeal+EG_TS_Flyadeal;
			
			int Gal_T=Com_TS_GAL7Q+AE_TS_GAL7Q+SA_TS_GAL7Q+EG_TS_GAL7Q;
			int S_1LNJ_T=Com_TS_S_1LNJ+AE_TS_S_1LNJ+SA_TS_S_1LNJ+EG_TS_S_1LNJ;
			
			
			
			String G_3K6_AD=Integer.toString(Gal_3K6_T);
			String G_3R1G_AD=Integer.toString(G_3R1G_T);
			String G_570E_AD=Integer.toString(G_570E_T);
			String G_5N61_AD=Integer.toString(G_5N61_T);
			String G_7FK5_AD=Integer.toString(G_7FK5_T);
			String G_7JY2_AD=Integer.toString(G_7JY2_T);
			String G_7X7W_AD=Integer.toString(G_7X7W_T);
			String G_802N_AD=Integer.toString(G_802N_T);
			
			String G_802R_AD=Integer.toString(G_802R_T);
			String G_8SQ7_AD=Integer.toString(G_8SQ7_T);
			String JAZEERA_AD=Integer.toString(JAZEERA_T);
			String KIWI_AD=Integer.toString(KIWI_T);
			String Manual_AD=Integer.toString(Manual_T);
			String My_Fly_AD=Integer.toString(My_Fly_T);
			String NESMA_AD=Integer.toString(NESMA_T);
			
			String PEGASUS_AD=Integer.toString(PEGASUS_T);
			String S_9JFH_AD=Integer.toString(S_9JFH_T);
			String S_ID2I_AD=Integer.toString(S_ID2I_T);
			String S_L8YI_AD=Integer.toString(S_L8YI_T);
			String S_L9AI_AD=Integer.toString(S_L9AI_T);
			String S_L9CI_AD=Integer.toString(S_L9CI_T);
			String S_T13I_AD=Integer.toString(S_T13I_T);
			String S_T20I_AD=Integer.toString(S_T20I_T);
			String SALAM_AD=Integer.toString(SALAM_T);
			String S_Jet_AD=Integer.toString(S_Jet_T);
			
			String U_3R1G_AD=Integer.toString(U_3R1G_T);
			String U_570E_AD=Integer.toString(U_570E_T);
			String U_5N61_AD=Integer.toString(U_5N61_T);
			String U_6E_AD=Integer.toString(U_6E_T);
			String U_7FK5_AD=Integer.toString(U_7FK5_T);
			String U_7JY2_AD=Integer.toString(U_7JY2_T);
			String U_802N_AD=Integer.toString(U_802N_T);
			
			String U_802R_AD=Integer.toString(U_802R_T);
			String U_8SQ7_AD=Integer.toString(U_8SQ7_T);
			String WATANIYA_AD=Integer.toString(WATANIYA_T);
			String A_AR_AD=Integer.toString(A_AR_T);
			String A_AR_E_AD=Integer.toString(A_AR_E_T);
			String A_AR_M_AD=Integer.toString(A_AR_M_T);
			String A_I_E_AD=Integer.toString(A_I_E_T);
			String FlyDubai_AD=Integer.toString(FlyDubai_T);
			String Flynas_AD=Integer.toString(Flynas_T);
			String Flyadeal_AD=Integer.toString(Flyadeal_T);
			String Gal_AD=Integer.toString(Gal_T);
			String S_1LNJ_AD=Integer.toString(S_1LNJ_T);
			
			
			
			//CONFIRMATION PENDING
			int Gal_3K6_CP=Com_CP_G_3K6+AE_CP_G_3K6+SA_CP_G_3K6+EG_CP_G_3K6;
			int G_3R1G_CP=Com_CP_G_3R1+AE_CP_G_3R1+SA_CP_G_3R1+EG_CP_G_3R1;
			int G_570E_CP=Com_CP_G_570E+AE_CP_G_570E+SA_CP_G_570E+EG_CP_G_570E;
			int G_5N61_CP=Com_CP_G_5N61+AE_CP_G_5N61+SA_CP_G_5N61+EG_CP_G_5N61;
			int G_7FK5_CP=Com_CP_G_7FK5+AE_CP_G_7FK5+SA_CP_G_7FK5+EG_CP_G_7FK5;
			
			int G_7JY2_CP=Com_CP_G_7JY2+AE_CP_G_7JY2+SA_CP_G_7JY2+EG_CP_G_7JY2;
			int G_7X7W_CP=Com_CP_G_7X7W+AE_CP_G_7X7W+SA_CP_G_7X7W+EG_CP_G_7X7W;
			int G_802N_CP=Com_CP_G_802N+AE_CP_G_802N+SA_CP_G_802N+EG_CP_G_802N;
			int G_802R_CP=Com_CP_G_802R+AE_CP_G_802R+SA_CP_G_802R+EG_CP_G_802R;
			
			int G_8SQ7_CP=Com_CP_G_8SQ7+AE_CP_G_8SQ7+SA_CP_G_8SQ7+EG_CP_G_8SQ7;
			int JAZEERA_CP=Com_CP_JAZEERA+AE_CP_JAZEERA+SA_CP_JAZEERA+EG_CP_JAZEERA;
			int KIWI_CP=Com_CP_KIWI+AE_CP_KIWI+SA_CP_KIWI+EG_CP_KIWI;
			int Manual_CP=Com_CP_M_u+AE_CP_M_u+SA_CP_M_u+EG_CP_M_u;
			
			int My_Fly_CP=Com_CP_My_Fly+AE_CP_My_Fly+SA_CP_My_Fly+EG_CP_My_Fly;
			int NESMA_CP=Com_CP_NESMA+AE_CP_NESMA+SA_CP_NESMA+EG_CP_NESMA;
			int PEGASUS_CP=Com_CP_PEGASUS+AE_CP_PEGASUS+SA_CP_PEGASUS+EG_CP_PEGASUS;
			int S_9JFH_CP=Com_CP_S_9JFH+AE_CP_S_9JFH+SA_CP_S_9JFH+EG_CP_S_9JFH;
			
			int S_ID2I_CP=Com_CP_S_ID2I+AE_CP_S_ID2I+SA_CP_S_ID2I+EG_CP_S_ID2I;
			int S_L8YI_CP=Com_CP_S_L8YI+AE_CP_S_L8YI+SA_CP_S_L8YI+EG_CP_S_L8YI;
			int S_L9AI_CP=Com_CP_S_L9AI+AE_CP_S_L9AI+SA_CP_S_L9AI+EG_CP_S_L9AI;
			int S_L9CI_CP=Com_CP_S_L9CI+AE_CP_S_L9CI+SA_CP_S_L9CI+EG_CP_S_L9CI;
			
			int S_T13I_CP=Com_CP_S_T13I+AE_CP_S_T13I+SA_CP_S_T13I+EG_CP_S_T13I;
			int S_T20I_CP=Com_CP_S_T20I+AE_CP_S_T20I+SA_CP_S_T20I+EG_CP_S_T20I;
			int SALAM_CP=Com_CP_SALAM+AE_CP_SALAM+SA_CP_SALAM+EG_CP_SALAM;
			int S_Jet_CP=Com_CP_S_Jet+AE_CP_S_Jet+SA_CP_S_Jet+EG_CP_S_Jet;
			
			int U_3R1G_CP=Com_CP_U_3R1G+AE_CP_U_3R1G+SA_CP_U_3R1G+EG_CP_U_3R1G;
			int U_570E_CP=Com_CP_U_570E+AE_CP_U_570E+SA_CP_U_570E+EG_CP_U_570E;
			int U_5N61_CP=Com_CP_U_5N61+AE_CP_U_5N61+SA_CP_U_5N61+EG_CP_U_5N61;
			int U_6E_CP=Com_CP_U_6E+AE_CP_U_6E+SA_CP_U_6E+EG_CP_U_6E;
			
			int U_7FK5_CP=Com_CP_U_7FK5+AE_CP_U_7FK5+SA_CP_U_7FK5+EG_CP_U_7FK5;
			int U_7JY2_CP=Com_CP_U_7JY2+AE_CP_U_7JY2+SA_CP_U_7JY2+EG_CP_U_7JY2;
			int U_802N_CP=Com_CP_U_802N+AE_CP_U_802N+SA_CP_U_802N+EG_CP_U_802N;
			int U_802R_CP=Com_CP_U_802R+AE_CP_U_802R+SA_CP_U_802R+EG_CP_U_802R;
			
			int U_8SQ7_CP=Com_CP_U_8SQ7+AE_CP_U_8SQ7+SA_CP_U_8SQ7+EG_CP_U_8SQ7;
			int WATANIYA_CP=Com_CP_WATANIYA+AE_CP_WATANIYA+SA_CP_WATANIYA+EG_CP_WATANIYA;
			int A_AR_CP=Com_CP_A_AR+AE_CP_A_AR+SA_CP_A_AR+EG_CP_A_AR;
			int A_AR_E_CP=Com_CP_A_AR_E+AE_CP_A_AR_E+SA_CP_A_AR_E+EG_CP_A_AR_E;
			
			int A_AR_M_CP=Com_CP_A_AR_M+AE_CP_A_AR_M+SA_CP_A_AR_M+EG_CP_A_AR_M;
			int A_I_E_CP=Com_CP_A_I_E+AE_CP_A_I_E+SA_CP_A_I_E+EG_CP_A_I_E;
			int FlyDubai_CP=Com_CP_FlyDubai+AE_CP_FlyDubai+SA_CP_FlyDubai+EG_CP_FlyDubai;
			int Flynas_CP=Com_CP_Flynas+AE_CP_Flynas+SA_CP_Flynas+EG_CP_Flynas;
			int Flyadeal_CP=Com_CP_Flyadeal+AE_CP_Flyadeal+SA_CP_Flyadeal+EG_CP_Flyadeal;
			int Gal_CP=Com_CP_GAL7Q+AE_CP_GAL7Q+SA_CP_GAL7Q+EG_CP_GAL7Q;
			int S_1LNJ_CP=Com_CP_S_1LNJ+AE_CP_S_1LNJ+SA_CP_S_1LNJ+EG_CP_S_1LNJ;

			
			String G_3K6_C_P=Integer.toString(Gal_3K6_CP);
			String G_3R1G_C_P=Integer.toString(G_3R1G_CP);
			String G_570E_C_P=Integer.toString(G_570E_CP);
			String G_5N61_C_P=Integer.toString(G_5N61_CP);
			String G_7FK5_C_P=Integer.toString(G_7FK5_CP);
			String G_7JY2_C_P=Integer.toString(G_7JY2_CP);
			String G_7X7W_C_P=Integer.toString(G_7X7W_CP);
			String G_802N_C_P=Integer.toString(G_802N_CP);
			
			String G_802R_C_P=Integer.toString(G_802R_CP);
			String G_8SQ7_C_P=Integer.toString(G_8SQ7_CP);
			String JAZEERA_C_P=Integer.toString(JAZEERA_CP);
			String KIWI_C_P=Integer.toString(KIWI_CP);
			String Manual_C_P=Integer.toString(Manual_CP);
			String My_Fly_C_P=Integer.toString(My_Fly_CP);
			String NESMA_C_P=Integer.toString(NESMA_CP);
			
			String PEGASUS_C_P=Integer.toString(PEGASUS_CP);
			String S_9JFH_C_P=Integer.toString(S_9JFH_CP);
			String S_ID2I_C_P=Integer.toString(S_ID2I_CP);
			String S_L8YI_C_P=Integer.toString(S_L8YI_CP);
			String S_L9AI_C_P=Integer.toString(S_L9AI_CP);
			String S_L9CI_C_P=Integer.toString(S_L9CI_CP);
			String S_T13I_C_P=Integer.toString(S_T13I_CP);
			String S_T20I_C_P=Integer.toString(S_T20I_CP);
			String SALAM_C_P=Integer.toString(SALAM_CP);
			String S_Jet_C_P=Integer.toString(S_Jet_CP);
			
			String U_3R1G_C_P=Integer.toString(U_3R1G_CP);
			String U_570E_C_P=Integer.toString(U_570E_CP);
			String U_5N61_C_P=Integer.toString(U_5N61_CP);
			String U_6E_C_P=Integer.toString(U_6E_CP);
			String U_7FK5_C_P=Integer.toString(U_7FK5_CP);
			String U_7JY2_C_P=Integer.toString(U_7JY2_CP);
			String U_802N_C_P=Integer.toString(U_802N_CP);
			
			String U_802R_C_P=Integer.toString(U_802R_CP);
			String U_8SQ7_C_P=Integer.toString(U_8SQ7_CP);
			String WATANIYA_C_P=Integer.toString(WATANIYA_CP);
			String A_AR_C_P=Integer.toString(A_AR_CP);
			String A_AR_E_C_P=Integer.toString(A_AR_E_CP);
			String A_AR_M_C_P=Integer.toString(A_AR_M_CP);
			String A_I_E_C_P=Integer.toString(A_I_E_CP);
			String FlyDubai_C_P=Integer.toString(FlyDubai_CP);
			String Flynas_C_P=Integer.toString(Flynas_CP);
			String Flyadeal_C_P=Integer.toString(Flyadeal_CP);
			String Gal_C_P=Integer.toString(Gal_CP);
			String S_1LNJ_C_P=Integer.toString(S_1LNJ_CP);
			
			
			//REPRICING
			int Gal_3K6_RP=Com_RP_G_3K6+AE_RP_G_3K6+SA_RP_G_3K6+EG_RP_G_3K6;
			int G_3R1G_RP=Com_RP_G_3R1+AE_RP_G_3R1+SA_RP_G_3R1+EG_RP_G_3R1;
			int G_570E_RP=Com_RP_G_570E+AE_RP_G_570E+SA_RP_G_570E+EG_RP_G_570E;
			int G_5N61_RP=Com_RP_G_5N61+AE_RP_G_5N61+SA_RP_G_5N61+EG_RP_G_5N61;
			int G_7FK5_RP=Com_RP_G_7FK5+AE_RP_G_7FK5+SA_RP_G_7FK5+EG_RP_G_7FK5;
			
			int G_7JY2_RP=Com_RP_G_7JY2+AE_RP_G_7JY2+SA_RP_G_7JY2+EG_RP_G_7JY2;
			int G_7X7W_RP=Com_RP_G_7X7W+AE_RP_G_7X7W+SA_RP_G_7X7W+EG_RP_G_7X7W;
			int G_802N_RP=Com_RP_G_802N+AE_RP_G_802N+SA_RP_G_802N+EG_RP_G_802N;
			int G_802R_RP=Com_RP_G_802R+AE_RP_G_802R+SA_RP_G_802R+EG_RP_G_802R;
			
			int G_8SQ7_RP=Com_RP_G_8SQ7+AE_RP_G_8SQ7+SA_RP_G_8SQ7+EG_RP_G_8SQ7;
			int JAZEERA_RP=Com_RP_JAZEERA+AE_RP_JAZEERA+SA_RP_JAZEERA+EG_RP_JAZEERA;
			int KIWI_RP=Com_RP_KIWI+AE_RP_KIWI+SA_RP_KIWI+EG_RP_KIWI;
			int Manual_RP=Com_RP_M_u+AE_RP_M_u+SA_RP_M_u+EG_RP_M_u;
			
			int My_Fly_RP=Com_RP_My_Fly+AE_RP_My_Fly+SA_RP_My_Fly+EG_RP_My_Fly;
			int NESMA_RP=Com_RP_NESMA+AE_RP_NESMA+SA_RP_NESMA+EG_RP_NESMA;
			int PEGASUS_RP=Com_RP_PEGASUS+AE_RP_PEGASUS+SA_RP_PEGASUS+EG_RP_PEGASUS;
			int S_9JFH_RP=Com_RP_S_9JFH+AE_RP_S_9JFH+SA_RP_S_9JFH+EG_RP_S_9JFH;
			
			int S_ID2I_RP=Com_RP_S_ID2I+AE_RP_S_ID2I+SA_RP_S_ID2I+EG_RP_S_ID2I;
			int S_L8YI_RP=Com_RP_S_L8YI+AE_RP_S_L8YI+SA_RP_S_L8YI+EG_RP_S_L8YI;
			int S_L9AI_RP=Com_RP_S_L9AI+AE_RP_S_L9AI+SA_RP_S_L9AI+EG_RP_S_L9AI;
			int S_L9CI_RP=Com_RP_S_L9CI+AE_RP_S_L9CI+SA_RP_S_L9CI+EG_RP_S_L9CI;
			
			int S_T13I_RP=Com_RP_S_T13I+AE_RP_S_T13I+SA_RP_S_T13I+EG_RP_S_T13I;
			int S_T20I_RP=Com_RP_S_T20I+AE_RP_S_T20I+SA_RP_S_T20I+EG_RP_S_T20I;
			int SALAM_RP=Com_RP_SALAM+AE_RP_SALAM+SA_RP_SALAM+EG_RP_SALAM;
			int S_Jet_RP=Com_RP_S_Jet+AE_RP_S_Jet+SA_RP_S_Jet+EG_RP_S_Jet;
			
			int U_3R1G_RP=Com_RP_U_3R1G+AE_RP_U_3R1G+SA_RP_U_3R1G+EG_RP_U_3R1G;
			int U_570E_RP=Com_RP_U_570E+AE_RP_U_570E+SA_RP_U_570E+EG_RP_U_570E;
			int U_5N61_RP=Com_RP_U_5N61+AE_RP_U_5N61+SA_RP_U_5N61+EG_RP_U_5N61;
			int U_6E_RP=Com_RP_U_6E+AE_RP_U_6E+SA_RP_U_6E+EG_RP_U_6E;
			
			int U_7FK5_RP=Com_RP_U_7FK5+AE_RP_U_7FK5+SA_RP_U_7FK5+EG_RP_U_7FK5;
			int U_7JY2_RP=Com_RP_U_7JY2+AE_RP_U_7JY2+SA_RP_U_7JY2+EG_RP_U_7JY2;
			int U_802N_RP=Com_RP_U_802N+AE_RP_U_802N+SA_RP_U_802N+EG_RP_U_802N;
			int U_802R_RP=Com_RP_U_802R+AE_RP_U_802R+SA_RP_U_802R+EG_RP_U_802R;
			
			int U_8SQ7_RP=Com_RP_U_8SQ7+AE_RP_U_8SQ7+SA_RP_U_8SQ7+EG_RP_U_8SQ7;
			int WATANIYA_RP=Com_RP_WATANIYA+AE_RP_WATANIYA+SA_RP_WATANIYA+EG_RP_WATANIYA;
			int A_AR_RP=Com_RP_A_AR+AE_RP_A_AR+SA_RP_A_AR+EG_RP_A_AR;
			int A_AR_E_RP=Com_RP_A_AR_E+AE_RP_A_AR_E+SA_RP_A_AR_E+EG_RP_A_AR_E;
			
			int A_AR_M_RP=Com_RP_A_AR_M+AE_RP_A_AR_M+SA_RP_A_AR_M+EG_RP_A_AR_M;
			int A_I_E_RP=Com_RP_A_I_E+AE_RP_A_I_E+SA_RP_A_I_E+EG_RP_A_I_E;
			int FlyDubai_RP=Com_RP_FlyDubai+AE_RP_FlyDubai+SA_RP_FlyDubai+EG_RP_FlyDubai;
			int Flynas_RP=Com_RP_Flynas+AE_RP_Flynas+SA_RP_Flynas+EG_RP_Flynas;
			int Flyadeal_RP=Com_RP_Flyadeal+SA_RP_Flyadeal+AE_RP_Flyadeal+EG_RP_Flyadeal;
			int Gal_RP=Com_RP_GAL7Q+AE_RP_GAL7Q+SA_RP_GAL7Q+EG_RP_GAL7Q;
			int S_1LNJ_RP=Com_RP_S_1LNJ+AE_RP_S_1LNJ+SA_RP_S_1LNJ+EG_RP_S_1LNJ;

			
			String G_3K6_R_P=Integer.toString(Gal_3K6_RP);
			String G_3R1G_R_P=Integer.toString(G_3R1G_RP);
			String G_570E_R_P=Integer.toString(G_570E_RP);
			String G_5N61_R_P=Integer.toString(G_5N61_RP);
			String G_7FK5_R_P=Integer.toString(G_7FK5_RP);
			String G_7JY2_R_P=Integer.toString(G_7JY2_RP);
			String G_7X7W_R_P=Integer.toString(G_7X7W_RP);
			String G_802N_R_P=Integer.toString(G_802N_RP);
			
			String G_802R_R_P=Integer.toString(G_802R_RP);
			String G_8SQ7_R_P=Integer.toString(G_8SQ7_RP);
			String JAZEERA_R_P=Integer.toString(JAZEERA_RP);
			String KIWI_R_P=Integer.toString(KIWI_RP);
			String Manual_R_P=Integer.toString(Manual_RP);
			String My_Fly_R_P=Integer.toString(My_Fly_RP);
			String NESMA_R_P=Integer.toString(NESMA_RP);
			
			String PEGASUS_R_P=Integer.toString(PEGASUS_RP);
			String S_9JFH_R_P=Integer.toString(S_9JFH_RP);
			String S_ID2I_R_P=Integer.toString(S_ID2I_RP);
			String S_L8YI_R_P=Integer.toString(S_L8YI_RP);
			String S_L9AI_R_P=Integer.toString(S_L9AI_RP);
			String S_L9CI_R_P=Integer.toString(S_L9CI_RP);
			String S_T13I_R_P=Integer.toString(S_T13I_RP);
			String S_T20I_R_P=Integer.toString(S_T20I_RP);
			String SALAM_R_P=Integer.toString(SALAM_RP);
			String S_Jet_R_P=Integer.toString(S_Jet_RP);
			
			String U_3R1G_R_P=Integer.toString(U_3R1G_RP);
			String U_570E_R_P=Integer.toString(U_570E_RP);
			String U_5N61_R_P=Integer.toString(U_5N61_RP);
			String U_6E_R_P=Integer.toString(U_6E_RP);
			String U_7FK5_R_P=Integer.toString(U_7FK5_RP);
			String U_7JY2_R_P=Integer.toString(U_7JY2_RP);
			String U_802N_R_P=Integer.toString(U_802N_RP);
			
			String U_802R_R_P=Integer.toString(U_802R_RP);
			String U_8SQ7_R_P=Integer.toString(U_8SQ7_RP);
			String WATANIYA_R_P=Integer.toString(WATANIYA_RP);
			String A_AR_R_P=Integer.toString(A_AR_RP);
			String A_AR_E_R_P=Integer.toString(A_AR_E_RP);
			String A_AR_M_R_P=Integer.toString(A_AR_M_RP);
			String A_I_E_R_P=Integer.toString(A_I_E_RP);
			String FlyDubai_R_P=Integer.toString(FlyDubai_RP);
			String Flynas_R_P=Integer.toString(Flynas_RP);
			String Flyadeal_R_P=Integer.toString(Flyadeal_RP);
			String Gal_R_P=Integer.toString(Gal_RP);
			String S_1LNJ_R_P=Integer.toString(S_1LNJ_RP);
			
			
			//SOLDOUT
			int Gal_3K6_SD=Com_SD_G_3K6+AE_SD_G_3K6+SA_SD_G_3K6+EG_SD_G_3K6;
			int G_3R1G_SD=Com_SD_G_3R1+AE_SD_G_3R1+SA_SD_G_3R1+EG_SD_G_3R1;
			int G_570E_SD=Com_SD_G_570E+AE_SD_G_570E+SA_SD_G_570E+EG_SD_G_570E;
			int G_5N61_SD=Com_SD_G_5N61+AE_SD_G_5N61+SA_SD_G_5N61+EG_SD_G_5N61;
			int G_7FK5_SD=Com_SD_G_7FK5+AE_SD_G_7FK5+SA_SD_G_7FK5+EG_SD_G_7FK5;
			
			int G_7JY2_SD=Com_SD_G_7JY2+AE_SD_G_7JY2+SA_SD_G_7JY2+EG_SD_G_7JY2;
			int G_7X7W_SD=Com_SD_G_7X7W+AE_SD_G_7X7W+SA_SD_G_7X7W+EG_SD_G_7X7W;
			int G_802N_SD=Com_SD_G_802N+AE_SD_G_802N+SA_SD_G_802N+EG_SD_G_802N;
			int G_802R_SD=Com_SD_G_802R+AE_SD_G_802R+SA_SD_G_802R+EG_SD_G_802R;
			
			int G_8SQ7_SD=Com_SD_G_8SQ7+AE_SD_G_8SQ7+SA_SD_G_8SQ7+EG_SD_G_8SQ7;
			int JAZEERA_SD=Com_SD_JAZEERA+AE_SD_JAZEERA+SA_SD_JAZEERA+EG_SD_JAZEERA;
			int KIWI_SD=Com_SD_KIWI+AE_SD_KIWI+SA_SD_KIWI+EG_SD_KIWI;
			int Manual_SD=Com_SD_M_u+AE_SD_M_u+SA_SD_M_u+EG_SD_M_u;
			
			int My_Fly_SD=Com_SD_My_Fly+AE_SD_My_Fly+SA_SD_My_Fly+EG_SD_My_Fly;
			int NESMA_SD=Com_SD_NESMA+AE_SD_NESMA+SA_SD_NESMA+EG_SD_NESMA;
			int PEGASUS_SD=Com_SD_PEGASUS+AE_SD_PEGASUS+SA_SD_PEGASUS+EG_SD_PEGASUS;
			int S_9JFH_SD=Com_SD_S_9JFH+AE_SD_S_9JFH+SA_SD_S_9JFH+EG_SD_S_9JFH;
			
			int S_ID2I_SD=Com_SD_S_ID2I+AE_SD_S_ID2I+SA_SD_S_ID2I+EG_SD_S_ID2I;
			int S_L8YI_SD=Com_SD_S_L8YI+AE_SD_S_L8YI+SA_SD_S_L8YI+EG_SD_S_L8YI;
			int S_L9AI_SD=Com_SD_S_L9AI+AE_SD_S_L9AI+SA_SD_S_L9AI+EG_SD_S_L9AI;
			int S_L9CI_SD=Com_SD_S_L9CI+AE_SD_S_L9CI+SA_SD_S_L9CI+EG_SD_S_L9CI;
			
			int S_T13I_SD=Com_SD_S_T13I+AE_SD_S_T13I+SA_SD_S_T13I+EG_SD_S_T13I;
			int S_T20I_SD=Com_SD_S_T20I+AE_SD_S_T20I+SA_SD_S_T20I+EG_SD_S_T20I;
			int SALAM_SD=Com_SD_SALAM+AE_SD_SALAM+SA_SD_SALAM+EG_SD_SALAM;
			int S_Jet_SD=Com_SD_S_Jet+AE_SD_S_Jet+SA_SD_S_Jet+EG_SD_S_Jet;
			
			int U_3R1G_SD=Com_SD_U_3R1G+AE_SD_U_3R1G+SA_SD_U_3R1G+EG_SD_U_3R1G;
			int U_570E_SD=Com_SD_U_570E+AE_SD_U_570E+SA_SD_U_570E+EG_SD_U_570E;
			int U_5N61_SD=Com_SD_U_5N61+AE_SD_U_5N61+SA_SD_U_5N61+EG_SD_U_5N61;
			int U_6E_SD=Com_SD_U_6E+AE_SD_U_6E+SA_SD_U_6E+EG_SD_U_6E;
			
			int U_7FK5_SD=Com_SD_U_7FK5+AE_SD_U_7FK5+SA_SD_U_7FK5+EG_SD_U_7FK5;
			int U_7JY2_SD=Com_SD_U_7JY2+AE_SD_U_7JY2+SA_SD_U_7JY2+EG_SD_U_7JY2;
			int U_802N_SD=Com_SD_U_802N+AE_SD_U_802N+SA_SD_U_802N+EG_SD_U_802N;
			int U_802R_SD=Com_SD_U_802R+AE_SD_U_802R+SA_SD_U_802R+EG_SD_U_802R;
			
			int U_8SQ7_SD=Com_SD_U_8SQ7+AE_SD_U_8SQ7+SA_SD_U_8SQ7+EG_SD_U_8SQ7;
			int WATANIYA_SD=Com_SD_WATANIYA+AE_SD_WATANIYA+SA_SD_WATANIYA+EG_SD_WATANIYA;
			int A_AR_SD=Com_SD_A_AR+AE_SD_A_AR+SA_SD_A_AR+EG_SD_A_AR;
			int A_AR_E_SD=Com_SD_A_AR_E+AE_SD_A_AR_E+SA_SD_A_AR_E+EG_SD_A_AR_E;
			
			int A_AR_M_SD=Com_SD_A_AR_M+AE_SD_A_AR_M+SA_SD_A_AR_M+EG_SD_A_AR_M;
			int A_I_E_SD=Com_SD_A_I_E+AE_SD_A_I_E+SA_SD_A_I_E+EG_SD_A_I_E;
			int FlyDubai_SD=Com_SD_FlyDubai+AE_SD_FlyDubai+SA_SD_FlyDubai+EG_SD_FlyDubai;
			int Flynas_SD=Com_SD_Flynas+AE_SD_Flynas+SA_SD_Flynas+EG_SD_Flynas;
			int Flyadeal_SD=Com_SD_Flyadeal+AE_SD_Flyadeal+SA_SD_Flyadeal+EG_SD_Flyadeal;
			int Gal_SD=Com_SD_GAL7Q+AE_SD_GAL7Q+SA_SD_GAL7Q+EG_SD_GAL7Q;
			int S_1LNJ_SD=Com_SD_S_1LNJ+AE_SD_S_1LNJ+SA_SD_S_1LNJ+EG_SD_S_1LNJ;

			String G_3K6_S_D=Integer.toString(Gal_3K6_SD);
			String G_3R1G_S_D=Integer.toString(G_3R1G_SD);
			String G_570E_S_D=Integer.toString(G_570E_SD);
			String G_5N61_S_D=Integer.toString(G_5N61_SD);
			String G_7FK5_S_D=Integer.toString(G_7FK5_SD);
			String G_7JY2_S_D=Integer.toString(G_7JY2_SD);
			String G_7X7W_S_D=Integer.toString(G_7X7W_SD);
			String G_802N_S_D=Integer.toString(G_802N_SD);
			
			String G_802R_S_D=Integer.toString(G_802R_SD);
			String G_8SQ7_S_D=Integer.toString(G_8SQ7_SD);
			String JAZEERA_S_D=Integer.toString(JAZEERA_SD);
			String KIWI_S_D=Integer.toString(KIWI_SD);
			String Manual_S_D=Integer.toString(Manual_SD);
			String My_Fly_S_D=Integer.toString(My_Fly_SD);
			String NESMA_S_D=Integer.toString(NESMA_SD);
			
			String PEGASUS_S_D=Integer.toString(PEGASUS_SD);
			String S_9JFH_S_D=Integer.toString(S_9JFH_SD);
			String S_ID2I_S_D=Integer.toString(S_ID2I_SD);
			String S_L8YI_S_D=Integer.toString(S_L8YI_SD);
			String S_L9AI_S_D=Integer.toString(S_L9AI_SD);
			String S_L9CI_S_D=Integer.toString(S_L9CI_SD);
			String S_T13I_S_D=Integer.toString(S_T13I_SD);
			String S_T20I_S_D=Integer.toString(S_T20I_SD);
			String SALAM_S_D=Integer.toString(SALAM_SD);
			String S_Jet_S_D=Integer.toString(S_Jet_SD);
			
			String U_3R1G_S_D=Integer.toString(U_3R1G_SD);
			String U_570E_S_D=Integer.toString(U_570E_SD);
			String U_5N61_S_D=Integer.toString(U_5N61_SD);
			String U_6E_S_D=Integer.toString(U_6E_SD);
			String U_7FK5_S_D=Integer.toString(U_7FK5_SD);
			String U_7JY2_S_D=Integer.toString(U_7JY2_SD);
			String U_802N_S_D=Integer.toString(U_802N_SD);
			
			String U_802R_S_D=Integer.toString(U_802R_SD);
			String U_8SQ7_S_D=Integer.toString(U_8SQ7_SD);
			String WATANIYA_S_D=Integer.toString(WATANIYA_SD);
			String A_AR_S_D=Integer.toString(A_AR_SD);
			String A_AR_E_S_D=Integer.toString(A_AR_E_SD);
			String A_AR_M_S_D=Integer.toString(A_AR_M_SD);
			String A_I_E_S_D=Integer.toString(A_I_E_SD);
			String FlyDubai_S_D=Integer.toString(FlyDubai_SD);
			String Flynas_S_D=Integer.toString(Flynas_SD);
			String Flyadeal_S_D=Integer.toString(Flyadeal_SD);
			String Gal_S_D=Integer.toString(Gal_SD);
			String S_1LNJ_S_D=Integer.toString(S_1LNJ_SD);
			
			
			//CANCELLED
			int Gal_3K6_CN=Com_CN_G_3K6+AE_CN_G_3K6+SA_CN_G_3K6+EG_CN_G_3K6;
			int G_3R1G_CN=Com_CN_G_3R1+AE_CN_G_3R1+SA_CN_G_3R1+EG_CN_G_3R1;
			int G_570E_CN=Com_CN_G_570E+AE_CN_G_570E+SA_CN_G_570E+EG_CN_G_570E;
			int G_5N61_CN=Com_CN_G_5N61+AE_CN_G_5N61+SA_CN_G_5N61+EG_CN_G_5N61;
			int G_7FK5_CN=Com_CN_G_7FK5+AE_CN_G_7FK5+SA_CN_G_7FK5+EG_CN_G_7FK5;
			
			int G_7JY2_CN=Com_CN_G_7JY2+AE_CN_G_7JY2+SA_CN_G_7JY2+EG_CN_G_7JY2;
			int G_7X7W_CN=Com_CN_G_7X7W+AE_CN_G_7X7W+SA_CN_G_7X7W+EG_CN_G_7X7W;
			int G_802N_CN=Com_CN_G_802N+AE_CN_G_802N+SA_CN_G_802N+EG_CN_G_802N;
			int G_802R_CN=Com_CN_G_802R+AE_CN_G_802R+SA_CN_G_802R+EG_CN_G_802R;
			
			int G_8SQ7_CN=Com_CN_G_8SQ7+AE_CN_G_8SQ7+SA_CN_G_8SQ7+EG_CN_G_8SQ7;
			int JAZEERA_CN=Com_CN_JAZEERA+AE_CN_JAZEERA+SA_CN_JAZEERA+EG_CN_JAZEERA;
			int KIWI_CN=Com_CN_KIWI+AE_CN_KIWI+SA_CN_KIWI+EG_CN_KIWI;
			int Manual_CN=Com_CN_M_u+AE_CN_M_u+SA_CN_M_u+EG_CN_M_u;
			
			int My_Fly_CN=Com_CN_My_Fly+AE_CN_My_Fly+SA_CN_My_Fly+EG_CN_My_Fly;
			int NESMA_CN=Com_CN_NESMA+AE_CN_NESMA+SA_CN_NESMA+EG_CN_NESMA;
			int PEGASUS_CN=Com_CN_PEGASUS+AE_CN_PEGASUS+SA_CN_PEGASUS+EG_CN_PEGASUS;
			int S_9JFH_CN=Com_CN_S_9JFH+AE_CN_S_9JFH+SA_CN_S_9JFH+EG_CN_S_9JFH;
			
			int S_ID2I_CN=Com_CN_S_ID2I+AE_CN_S_ID2I+SA_CN_S_ID2I+EG_CN_S_ID2I;
			int S_L8YI_CN=Com_CN_S_L8YI+AE_CN_S_L8YI+SA_CN_S_L8YI+EG_CN_S_L8YI;
			int S_L9AI_CN=Com_CN_S_L9AI+AE_CN_S_L9AI+SA_CN_S_L9AI+EG_CN_S_L9AI;
			int S_L9CI_CN=Com_CN_S_L9CI+AE_CN_S_L9CI+SA_CN_S_L9CI+EG_CN_S_L9CI;
			
			int S_T13I_CN=Com_CN_S_T13I+AE_CN_S_T13I+SA_CN_S_T13I+EG_CN_S_T13I;
			int S_T20I_CN=Com_CN_S_T20I+AE_CN_S_T20I+SA_CN_S_T20I+EG_CN_S_T20I;
			int SALAM_CN=Com_CN_SALAM+AE_CN_SALAM+SA_CN_SALAM+EG_CN_SALAM;
			int S_Jet_CN=Com_CN_S_Jet+AE_CN_S_Jet+SA_CN_S_Jet+EG_CN_S_Jet;
			
			int U_3R1G_CN=Com_CN_U_3R1G+AE_CN_U_3R1G+SA_CN_U_3R1G+EG_CN_U_3R1G;
			int U_570E_CN=Com_CN_U_570E+AE_CN_U_570E+SA_CN_U_570E+EG_CN_U_570E;
			int U_5N61_CN=Com_CN_U_5N61+AE_CN_U_5N61+SA_CN_U_5N61+EG_CN_U_5N61;
			int U_6E_CN=Com_CN_U_6E+AE_CN_U_6E+SA_CN_U_6E+EG_CN_U_6E;
			
			int U_7FK5_CN=Com_CN_U_7FK5+AE_CN_U_7FK5+SA_CN_U_7FK5+EG_CN_U_7FK5;
			int U_7JY2_CN=Com_CN_U_7JY2+AE_CN_U_7JY2+SA_CN_U_7JY2+EG_CN_U_7JY2;
			int U_802N_CN=Com_CN_U_802N+AE_CN_U_802N+SA_CN_U_802N+EG_CN_U_802N;
			int U_802R_CN=Com_CN_U_802R+AE_CN_U_802R+SA_CN_U_802R+EG_CN_U_802R;
			
			int U_8SQ7_CN=Com_CN_U_8SQ7+AE_CN_U_8SQ7+SA_CN_U_8SQ7+EG_CN_U_8SQ7;
			int WATANIYA_CN=Com_CN_WATANIYA+AE_CN_WATANIYA+SA_CN_WATANIYA+EG_CN_WATANIYA;
			int A_AR_CN=Com_CN_A_AR+AE_CN_A_AR+SA_CN_A_AR+EG_CN_A_AR;
			int A_AR_E_CN=Com_CN_A_AR_E+AE_CN_A_AR_E+SA_CN_A_AR_E+EG_CN_A_AR_E;
			
			int A_AR_M_CN=Com_CN_A_AR_M+AE_CN_A_AR_M+SA_CN_A_AR_M+EG_CN_A_AR_M;
			int A_I_E_CN=Com_CN_A_I_E+AE_CN_A_I_E+SA_CN_A_I_E+EG_CN_A_I_E;
			int FlyDubai_CN=Com_CN_FlyDubai+AE_CN_FlyDubai+SA_CN_FlyDubai+EG_CN_FlyDubai;
			int Flynas_CN=Com_CN_Flynas+AE_CN_Flynas+SA_CN_Flynas+EG_CN_Flynas;
			int Flyadeal_CN=Com_CN_Flyadeal+AE_CN_Flyadeal+SA_CN_Flyadeal+EG_CN_Flyadeal;
			int Gal_CN=Com_CN_GAL7Q+AE_CN_GAL7Q+SA_CN_GAL7Q+EG_CN_GAL7Q;
			int S_1LNJ_CN=Com_CN_S_1LNJ+AE_CN_S_1LNJ+SA_CN_S_1LNJ+EG_CN_S_1LNJ;

			String G_3K6_C_N=Integer.toString(Gal_3K6_CN);
			String G_3R1G_C_N=Integer.toString(G_3R1G_CN);
			String G_570E_C_N=Integer.toString(G_570E_CN);
			String G_5N61_C_N=Integer.toString(G_5N61_CN);
			String G_7FK5_C_N=Integer.toString(G_7FK5_CN);
			String G_7JY2_C_N=Integer.toString(G_7JY2_CN);
			String G_7X7W_C_N=Integer.toString(G_7X7W_CN);
			String G_802N_C_N=Integer.toString(G_802N_CN);
			
			String G_802R_C_N=Integer.toString(G_802R_CN);
			String G_8SQ7_C_N=Integer.toString(G_8SQ7_CN);
			String JAZEERA_C_N=Integer.toString(JAZEERA_CN);
			String KIWI_C_N=Integer.toString(KIWI_CN);
			String Manual_C_N=Integer.toString(Manual_CN);
			String My_Fly_C_N=Integer.toString(My_Fly_CN);
			String NESMA_C_N=Integer.toString(NESMA_CN);
			
			String PEGASUS_C_N=Integer.toString(PEGASUS_CN);
			String S_9JFH_C_N=Integer.toString(S_9JFH_CN);
			String S_ID2I_C_N=Integer.toString(S_ID2I_CN);
			String S_L8YI_C_N=Integer.toString(S_L8YI_CN);
			String S_L9AI_C_N=Integer.toString(S_L9AI_CN);
			String S_L9CI_C_N=Integer.toString(S_L9CI_CN);
			String S_T13I_C_N=Integer.toString(S_T13I_CN);
			String S_T20I_C_N=Integer.toString(S_T20I_CN);
			String SALAM_C_N=Integer.toString(SALAM_CN);
			String S_Jet_C_N=Integer.toString(S_Jet_CN);
			
			String U_3R1G_C_N=Integer.toString(U_3R1G_CN);
			String U_570E_C_N=Integer.toString(U_570E_CN);
			String U_5N61_C_N=Integer.toString(U_5N61_CN);
			String U_6E_C_N=Integer.toString(U_6E_CN);
			String U_7FK5_C_N=Integer.toString(U_7FK5_CN);
			String U_7JY2_C_N=Integer.toString(U_7JY2_CN);
			String U_802N_C_N=Integer.toString(U_802N_CN);
			
			String U_802R_C_N=Integer.toString(U_802R_CN);
			String U_8SQ7_C_N=Integer.toString(U_8SQ7_CN);
			String WATANIYA_C_N=Integer.toString(WATANIYA_CN);
			String A_AR_C_N=Integer.toString(A_AR_CN);
			String A_AR_E_C_N=Integer.toString(A_AR_E_CN);
			String A_AR_M_C_N=Integer.toString(A_AR_M_CN);
			String A_I_E_C_N=Integer.toString(A_I_E_CN);
			String FlyDubai_C_N=Integer.toString(FlyDubai_CN);
			String Flynas_C_N=Integer.toString(Flynas_CN);
			String Flyadeal_C_N=Integer.toString(Flyadeal_CN);
			String Gal_C_N=Integer.toString(Gal_CN);
			String S_1LNJ_C_N=Integer.toString(S_1LNJ_CN);
			
			
			//TRANSACTION HOLD
			int Gal_3K6_TH=Com_TH_G_3K6+AE_TH_G_3K6+SA_TH_G_3K6+EG_TH_G_3K6;
			int G_3R1G_TH=Com_TH_G_3R1+AE_TH_G_3R1+SA_TH_G_3R1+EG_TH_G_3R1;
			int G_570E_TH=Com_TH_G_570E+AE_TH_G_570E+SA_TH_G_570E+EG_TH_G_570E;
			int G_5N61_TH=Com_TH_G_5N61+AE_TH_G_5N61+SA_TH_G_5N61+EG_TH_G_5N61;
			int G_7FK5_TH=Com_TH_G_7FK5+AE_TH_G_7FK5+SA_TH_G_7FK5+EG_TH_G_7FK5;
			
			int G_7JY2_TH=Com_TH_G_7JY2+AE_TH_G_7JY2+SA_TH_G_7JY2+EG_TH_G_7JY2;
			int G_7X7W_TH=Com_TH_G_7X7W+AE_TH_G_7X7W+SA_TH_G_7X7W+EG_TH_G_7X7W;
			int G_802N_TH=Com_TH_G_802N+AE_TH_G_802N+SA_TH_G_802N+EG_TH_G_802N;
			int G_802R_TH=Com_TH_G_802R+AE_TH_G_802R+SA_TH_G_802R+EG_TH_G_802R;
			
			int G_8SQ7_TH=Com_TH_G_8SQ7+AE_TH_G_8SQ7+SA_TH_G_8SQ7+EG_TH_G_8SQ7;
			int JAZEERA_TH=Com_TH_JAZEERA+AE_TH_JAZEERA+SA_TH_JAZEERA+EG_TH_JAZEERA;
			int KIWI_TH=Com_TH_KIWI+AE_TH_KIWI+SA_TH_KIWI+EG_TH_KIWI;
			int Manual_TH=Com_TH_M_u+AE_TH_M_u+SA_TH_M_u+EG_TH_M_u;
			
			int My_Fly_TH=Com_TH_My_Fly+AE_TH_My_Fly+SA_TH_My_Fly+EG_TH_My_Fly;
			int NESMA_TH=Com_TH_NESMA+AE_TH_NESMA+SA_TH_NESMA+EG_TH_NESMA;
			int PEGASUS_TH=Com_TH_PEGASUS+AE_TH_PEGASUS+SA_TH_PEGASUS+EG_TH_PEGASUS;
			int S_9JFH_TH=Com_TH_S_9JFH+AE_TH_S_9JFH+SA_TH_S_9JFH+EG_TH_S_9JFH;
			
			int S_ID2I_TH=Com_TH_S_ID2I+AE_TH_S_ID2I+SA_TH_S_ID2I+EG_TH_S_ID2I;
			int S_L8YI_TH=Com_TH_S_L8YI+AE_TH_S_L8YI+SA_TH_S_L8YI+EG_TH_S_L8YI;
			int S_L9AI_TH=Com_TH_S_L9AI+AE_TH_S_L9AI+SA_TH_S_L9AI+EG_TH_S_L9AI;
			int S_L9CI_TH=Com_TH_S_L9CI+AE_TH_S_L9CI+SA_TH_S_L9CI+EG_TH_S_L9CI;
			
			int S_T13I_TH=Com_TH_S_T13I+AE_TH_S_T13I+SA_TH_S_T13I+EG_TH_S_T13I;
			int S_T20I_TH=Com_TH_S_T20I+AE_TH_S_T20I+SA_TH_S_T20I+EG_TH_S_T20I;
			int SALAM_TH=Com_TH_SALAM+AE_TH_SALAM+SA_TH_SALAM+EG_TH_SALAM;
			int S_Jet_TH=Com_TH_S_Jet+AE_TH_S_Jet+SA_TH_S_Jet+EG_TH_S_Jet;
			
			int U_3R1G_TH=Com_TH_U_3R1G+AE_TH_U_3R1G+SA_TH_U_3R1G+EG_TH_U_3R1G;
			int U_570E_TH=Com_TH_U_570E+AE_TH_U_570E+SA_TH_U_570E+EG_TH_U_570E;
			int U_5N61_TH=Com_TH_U_5N61+AE_TH_U_5N61+SA_TH_U_5N61+EG_TH_U_5N61;
			int U_6E_TH=Com_TH_U_6E+AE_TH_U_6E+SA_TH_U_6E+EG_TH_U_6E;
			
			int U_7FK5_TH=Com_TH_U_7FK5+AE_TH_U_7FK5+SA_TH_U_7FK5+EG_TH_U_7FK5;
			int U_7JY2_TH=Com_TH_U_7JY2+AE_TH_U_7JY2+SA_TH_U_7JY2+EG_TH_U_7JY2;
			int U_802N_TH=Com_TH_U_802N+AE_TH_U_802N+SA_TH_U_802N+EG_TH_U_802N;
			int U_802R_TH=Com_TH_U_802R+AE_TH_U_802R+SA_TH_U_802R+EG_TH_U_802R;
			
			int U_8SQ7_TH=Com_TH_U_8SQ7+AE_TH_U_8SQ7+SA_TH_U_8SQ7+EG_TH_U_8SQ7;
			int WATANIYA_TH=Com_TH_WATANIYA+AE_TH_WATANIYA+SA_TH_WATANIYA+EG_TH_WATANIYA;
			int A_AR_TH=Com_TH_A_AR+AE_TH_A_AR+SA_TH_A_AR+EG_TH_A_AR;
			int A_AR_E_TH=Com_TH_A_AR_E+AE_TH_A_AR_E+SA_TH_A_AR_E+EG_TH_A_AR_E;
			
			int A_AR_M_TH=Com_TH_A_AR_M+AE_TH_A_AR_M+SA_TH_A_AR_M+EG_TH_A_AR_M;
			int A_I_E_TH=Com_TH_A_I_E+AE_TH_A_I_E+SA_TH_A_I_E+EG_TH_A_I_E;
			int FlyDubai_TH=Com_TH_FlyDubai+AE_TH_FlyDubai+SA_TH_FlyDubai+EG_TH_FlyDubai;
			int Flynas_TH=Com_TH_Flynas+AE_TH_Flynas+SA_TH_Flynas+EG_TH_Flynas;
			int Flyadeal_TH=Com_TH_Flyadeal+AE_TH_Flyadeal+SA_TH_Flyadeal+EG_TH_Flyadeal;
			int Gal_TH=Com_TH_GAL7Q+AE_TH_GAL7Q+SA_TH_GAL7Q+EG_TH_GAL7Q;
			int S_1LNJ_TH=Com_TH_S_1LNJ+AE_TH_S_1LNJ+SA_TH_S_1LNJ+EG_TH_S_1LNJ;
			

			String G_3K6_T_H=Integer.toString(Gal_3K6_TH);
			String G_3R1G_T_H=Integer.toString(G_3R1G_TH);
			String G_570E_T_H=Integer.toString(G_570E_TH);
			String G_5N61_T_H=Integer.toString(G_5N61_TH);
			String G_7FK5_T_H=Integer.toString(G_7FK5_TH);
			String G_7JY2_T_H=Integer.toString(G_7JY2_TH);
			String G_7X7W_T_H=Integer.toString(G_7X7W_TH);
			String G_802N_T_H=Integer.toString(G_802N_TH);
			
			String G_802R_T_H=Integer.toString(G_802R_TH);
			String G_8SQ7_T_H=Integer.toString(G_8SQ7_TH);
			String JAZEERA_T_H=Integer.toString(JAZEERA_TH);
			String KIWI_T_H=Integer.toString(KIWI_TH);
			String Manual_T_H=Integer.toString(Manual_TH);
			String My_Fly_T_H=Integer.toString(My_Fly_TH);
			String NESMA_T_H=Integer.toString(NESMA_TH);
			
			String PEGASUS_T_H=Integer.toString(PEGASUS_TH);
			String S_9JFH_T_H=Integer.toString(S_9JFH_TH);
			String S_ID2I_T_H=Integer.toString(S_ID2I_TH);
			String S_L8YI_T_H=Integer.toString(S_L8YI_TH);
			String S_L9AI_T_H=Integer.toString(S_L9AI_TH);
			String S_L9CI_T_H=Integer.toString(S_L9CI_TH);
			String S_T13I_T_H=Integer.toString(S_T13I_TH);
			String S_T20I_T_H=Integer.toString(S_T20I_TH);
			String SALAM_T_H=Integer.toString(SALAM_TH);
			String S_Jet_T_H=Integer.toString(S_Jet_TH);
			
			String U_3R1G_T_H=Integer.toString(U_3R1G_TH);
			String U_570E_T_H=Integer.toString(U_570E_TH);
			String U_5N61_T_H=Integer.toString(U_5N61_TH);
			String U_6E_T_H=Integer.toString(U_6E_TH);
			String U_7FK5_T_H=Integer.toString(U_7FK5_TH);
			String U_7JY2_T_H=Integer.toString(U_7JY2_TH);
			String U_802N_T_H=Integer.toString(U_802N_TH);
			
			String U_802R_T_H=Integer.toString(U_802R_TH);
			String U_8SQ7_T_H=Integer.toString(U_8SQ7_TH);
			String WATANIYA_T_H=Integer.toString(WATANIYA_TH);
			String A_AR_T_H=Integer.toString(A_AR_TH);
			String A_AR_E_T_H=Integer.toString(A_AR_E_TH);
			String A_AR_M_T_H=Integer.toString(A_AR_M_TH);
			String A_I_E_T_H=Integer.toString(A_I_E_TH);
			String FlyDubai_T_H=Integer.toString(FlyDubai_TH);
			String Flynas_T_H=Integer.toString(Flynas_TH);
			String Flyadeal_T_H=Integer.toString(Flyadeal_TH);
			String Gal_T_H=Integer.toString(Gal_TH);
			String S_1LNJ_T_H=Integer.toString(S_1LNJ_TH);
			

			
			

			
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

email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 800 height = 300 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center ><tr align=LEFT bgcolor=#FF7C00 style=border-color:black;color:#ffffff><th STYLE=color:#ffffff colspan=8>SUPPLIERS</th><tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th><th>SUPPLIERS </th> <th>COM</th> <th>AE</th><th>SA</th><th>EG</th><th>TOTAL</th><th>GRAND TOTAL</th></tr> "));
Integer ts_sub=TS_UNQ_VALUE-2;

String TS_NullValue=Integer.toString(TS_UNQ_VALUE);
if(TS_NullValue.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center>TRANSACTION SUCCESSFUL</td>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<td>0</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td><td width = 50; align=center>"+All_Sup_TransactionSuccess_total+"</td></tr>"));

	

}
if(!TS_NullValue.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+TS_UNQ_VALUE+">TRANSACTION SUCCESSFUL</td>"));
	if(!G_3R1G_AD.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td><td width = 50; align=center rowspan="+ts_sub+">"+All_Sup_TransactionSuccess_total+"</td></tr>"));

	}
	if(G_3R1G_AD.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td><td width = 50; align=center rowspan="+ts_sub+">"+All_Sup_TransactionSuccess_total+"</td></tr>"));

	}

}

//Transaction Success--suppliers

//Not Equal to Zero
if(!G_3K6_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G_3K6</td> <td>"+Com_TS_G_3K6+"</td><td>"+AE_TS_G_3K6+"</td><td>"+SA_TS_G_3K6+"</td><td>"+EG_TS_G_3K6+"</td><td>"+Gal_3K6_T+"</td></tr>"));
	
}
if(!G_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TS_G_570E+"</td><td>"+AE_TS_G_570E+"</td><td>"+SA_TS_G_570E+"</td><td>"+EG_TS_G_570E+"</td><td>"+G_570E_T+"</td></tr>"));
	
}
if(!G_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TS_G_5N61+"</td><td>"+AE_TS_G_5N61+"</td><td>"+SA_TS_G_5N61+"</td><td>"+EG_TS_G_5N61+"</td><td>"+G_5N61_T+"</td></tr>"));
	
}
if(!G_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TS_G_7FK5+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+G_7FK5_T+"</td></tr>"));
	
}
if(!G_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TS_G_7JY2+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+G_7JY2_T+"</td></tr>"));
	
}
if(!G_7X7W_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TS_G_7X7W+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+G_7X7W_T+"</td></tr>"));
	
}
if(!G_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TS_G_802N+"</td><td>"+AE_TS_G_802N+"</td><td>"+SA_TS_G_802N+"</td><td>"+EG_TS_G_802N+"</td><td>"+G_802N_T+"</td></tr>"));
	
}
if(!G_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TS_G_802R+"</td><td>"+AE_TS_G_802R+"</td><td>"+SA_TS_G_802R+"</td><td>"+EG_TS_G_802R+"</td><td>"+G_802R_T+"</td></tr>"));
	
}
if(!G_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TS_G_8SQ7+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+G_8SQ7_T+"</td></tr>"));
	
}
if(!JAZEERA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TS_JAZEERA+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+JAZEERA_T+"</td></tr>"));
	
}
if(!KIWI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TS_KIWI+"</td><td>"+AE_TS_KIWI+"</td><td>"+SA_TS_KIWI+"</td><td>"+EG_TS_KIWI+"</td><td>"+KIWI_T+"</td></tr>"));
	
}
if(!Manual_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TS_M_u+"</td><td>"+AE_TS_M_u+"</td><td>"+SA_TS_M_u+"</td><td>"+EG_TS_M_u+"</td><td>"+Manual_T+"</td></tr>"));
	
}
if(!My_Fly_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TS_My_Fly+"</td><td>"+AE_TS_My_Fly+"</td><td>"+SA_TS_My_Fly+"</td><td>"+EG_TS_My_Fly+"</td><td>"+My_Fly_T+"</td></tr>"));
	
}
if(!NESMA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TS_NESMA+"</td><td>"+AE_TS_NESMA+"</td><td>"+SA_TS_NESMA+"</td><td>"+EG_TS_NESMA+"</td><td>"+NESMA_T+"</td></tr>"));
	
}
if(!PEGASUS_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TS_PEGASUS+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+PEGASUS_T+"</td></tr>"));
	
}
if(!S_9JFH_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TS_S_9JFH+"</td><td>"+AE_TS_S_9JFH+"</td><td>"+SA_TS_S_9JFH+"</td><td>"+EG_TS_S_9JFH+"</td><td>"+S_9JFH_T+"</td></tr>"));
	
}
if(!S_ID2I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TS_S_ID2I+"</td><td>"+AE_TS_S_ID2I+"</td><td>"+SA_TS_S_ID2I+"</td><td>"+EG_TS_S_ID2I+"</td><td>"+S_ID2I_T+"</td></tr>"));
	
}
if(!S_L8YI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TS_S_L8YI+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+S_L8YI_T+"</td></tr>"));
	
}
if(!S_L9AI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TS_S_L9AI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+S_L9AI_T+"</td></tr>"));
	
}
if(!S_L9CI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TS_S_L9CI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+S_L9CI_T+"</td></tr>"));
	
}
if(!S_T13I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TS_S_T13I+"</td><td>"+AE_TS_S_T13I+"</td><td>"+SA_TS_S_T13I+"</td><td>"+EG_TS_S_T13I+"</td><td>"+S_T13I_T+"</td></tr>"));
	
}
if(!S_T20I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TS_S_T20I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+S_T20I_T+"</td></tr>"));
	
}
if(!SALAM_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TS_SALAM+"</td><td>"+AE_TS_SALAM+"</td><td>"+SA_TS_SALAM+"</td><td>"+EG_TS_SALAM+"</td><td>"+SALAM_T+"</td></tr>"));
	
}
if(!S_Jet_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TS_S_Jet+"</td><td>"+AE_TS_S_Jet+"</td><td>"+SA_TS_S_Jet+"</td><td>"+EG_TS_S_Jet+"</td><td>"+S_Jet_T+"</td></tr>"));
	
}
if(!U_3R1G_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TS_U_3R1G+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+U_3R1G_T+"</td></tr>"));
	
}
if(!U_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TS_U_570E+"</td><td>"+AE_TS_U_570E+"</td><td>"+SA_TS_U_570E+"</td><td>"+EG_TS_U_570E+"</td><td>"+U_570E_T+"</td></tr>"));
	
}
if(!U_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TS_U_5N61+"</td><td>"+AE_TS_U_5N61+"</td><td>"+SA_TS_U_5N61+"</td><td>"+EG_TS_U_5N61+"</td><td>"+U_5N61_T+"</td></tr>"));
	
}
if(!U_6E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TS_U_6E+"</td><td>"+AE_TS_U_6E+"</td><td>"+SA_TS_U_6E+"</td><td>"+EG_TS_U_6E+"</td><td>"+U_6E_T+"</td></tr>"));
	
}
if(!U_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TS_U_7FK5+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+U_7FK5_T+"</td></tr>"));
	
}
if(!U_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TS_U_7JY2+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+U_7JY2_T+"</td></tr>"));
	
}
if(!U_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TS_U_802N+"</td><td>"+AE_TS_U_802N+"</td><td>"+SA_TS_U_802N+"</td><td>"+EG_TS_U_802N+"</td><td>"+U_802N_T+"</td></tr>"));
	
}
if(!U_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TS_U_802R+"</td><td>"+AE_TS_U_802R+"</td><td>"+SA_TS_U_802R+"</td><td>"+EG_TS_U_802R+"</td><td>"+U_802R_T+"</td></tr>"));
	
}
if(!U_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TS_U_8SQ7+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+U_8SQ7_T+"</td></tr>"));
	
}
if(!WATANIYA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TS_WATANIYA+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+WATANIYA_T+"</td></tr>"));
	
}
if(!A_AR_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TS_A_AR+"</td><td>"+AE_TS_A_AR+"</td><td>"+SA_TS_A_AR+"</td><td>"+EG_TS_A_AR+"</td><td>"+A_AR_T+"</td></tr>"));
	
}
if(!A_AR_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+A_AR_E_T+"</td></tr>"));
	
}
if(!A_AR_M_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TS_A_AR_M+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+A_AR_M_T+"</td></tr>"));
	
} 
if(!A_I_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TS_A_I_E+"</td><td>"+AE_TS_A_I_E+"</td><td>"+SA_TS_A_I_E+"</td><td>"+EG_TS_A_I_E+"</td><td>"+A_I_E_T+"</td></tr>"));
	
} 
if(!FlyDubai_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TS_FlyDubai+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+FlyDubai_T+"</td></tr>"));
	
} 
if(!Flynas_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TS_Flynas+"</td><td>"+AE_TS_Flynas+"</td><td>"+SA_TS_Flynas+"</td><td>"+EG_TS_Flynas+"</td><td>"+Flynas_T+"</td></tr>"));

} 
if(!Flyadeal_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyaDeal</td> <td>"+Com_TS_Flyadeal+"</td><td>"+AE_TS_Flyadeal+"</td><td>"+SA_TS_Flyadeal+"</td><td>"+EG_TS_Flyadeal+"</td><td>"+Flyadeal_T+"</td></tr>"));

} 
if(!Gal_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>GAL-7Q0W</td> <td>"+Com_TS_GAL7Q+"</td><td>"+AE_TS_GAL7Q+"</td><td>"+SA_TS_GAL7Q+"</td><td>"+EG_TS_GAL7Q+"</td><td>"+Gal_T+"</td></tr>"));

} 
if(!S_1LNJ_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_1LNJ</td> <td>"+Com_TS_S_1LNJ+"</td><td>"+AE_TS_S_1LNJ+"</td><td>"+SA_TS_S_1LNJ+"</td><td>"+EG_TS_S_1LNJ+"</td><td>"+S_1LNJ_T+"</td></tr>"));

} 



String CP_NullValue=Integer.toString(CP_UNQ_VALUE);
Integer cp_sub=CP_UNQ_VALUE-2;
if(CP_NullValue.equals("0"))
{
	
   email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center>CONFIRMATION PENDING</td>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<td>0</td> <td>"+Com_CP_G_3R1+"</td><td>"+AE_CP_G_3R1+"</td><td>"+SA_CP_G_3R1+"</td><td>"+EG_CP_G_3R1+"</td><td>"+G_3R1G_CP+"</td><td width = 50; align=center>"+All_Sup_Confirmationpending_total+"</td></tr>"));

}
if(!CP_NullValue.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center  rowspan="+CP_UNQ_VALUE+" >CONFIRMATION PENDING</td>"));

	if(!G_3R1G_C_P.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_CP_G_3R1+"</td><td>"+AE_CP_G_3R1+"</td><td>"+SA_CP_G_3R1+"</td><td>"+EG_CP_G_3R1+"</td><td>"+G_3R1G_CP+"</td><td width = 50; align=center rowspan="+cp_sub+">"+All_Sup_Confirmationpending_total+"</td></tr>"));

	}
	if(G_3R1G_C_P.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_CP_G_3R1+"</td><td>"+AE_CP_G_3R1+"</td><td>"+SA_CP_G_3R1+"</td><td>"+EG_CP_G_3R1+"</td><td>"+G_3R1G_CP+"</td><td width = 50; align=center rowspan="+cp_sub+">"+All_Sup_Confirmationpending_total+"</td></tr>"));

	}
}
//Not Equal to Zero
//ConFirmation Pending

if(!G_3K6_C_P.equals("0"))
{
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G_3K6</td> <td>"+Com_CP_G_3K6+"</td><td>"+AE_CP_G_3K6+"</td><td>"+SA_CP_G_3K6+"</td><td>"+EG_CP_G_3K6+"</td><td>"+Gal_3K6_CP+"</td></tr>"));

}

if(!G_570E_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_CP_G_570E+"</td><td>"+AE_CP_G_570E+"</td><td>"+SA_CP_G_570E+"</td><td>"+EG_CP_G_570E+"</td><td>"+G_570E_CP+"</td></tr>"));
	
}
if(!G_5N61_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_CP_G_5N61+"</td><td>"+AE_CP_G_5N61+"</td><td>"+SA_CP_G_5N61+"</td><td>"+EG_CP_G_5N61+"</td><td>"+G_5N61_CP+"</td></tr>"));
	
}
if(!G_7FK5_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_CP_G_7FK5+"</td><td>"+AE_CP_G_7FK5+"</td><td>"+SA_CP_G_7FK5+"</td><td>"+EG_CP_G_7FK5+"</td><td>"+G_7FK5_CP+"</td></tr>"));
	
}
if(!G_7JY2_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_CP_G_7JY2+"</td><td>"+AE_CP_G_7JY2+"</td><td>"+SA_CP_G_7JY2+"</td><td>"+EG_CP_G_7JY2+"</td><td>"+G_7JY2_CP+"</td></tr>"));
	
}
if(!G_7X7W_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_CP_G_7X7W+"</td><td>"+AE_CP_G_7X7W+"</td><td>"+SA_CP_G_7X7W+"</td><td>"+EG_CP_G_7X7W+"</td><td>"+G_7X7W_CP+"</td></tr>"));
	
}
if(!G_802N_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_CP_G_802N+"</td><td>"+AE_CP_G_802N+"</td><td>"+SA_CP_G_802N+"</td><td>"+EG_CP_G_802N+"</td><td>"+G_802N_CP+"</td></tr>"));
	
}
if(!G_802R_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_CP_G_802R+"</td><td>"+AE_CP_G_802R+"</td><td>"+SA_CP_G_802R+"</td><td>"+EG_CP_G_802R+"</td><td>"+G_802R_CP+"</td></tr>"));
	
}
if(!G_8SQ7_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_CP_G_8SQ7+"</td><td>"+AE_CP_G_8SQ7+"</td><td>"+SA_CP_G_8SQ7+"</td><td>"+EG_CP_G_8SQ7+"</td><td>"+G_8SQ7_CP+"</td></tr>"));
	
}
if(!JAZEERA_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_CP_JAZEERA+"</td><td>"+AE_CP_JAZEERA+"</td><td>"+SA_CP_JAZEERA+"</td><td>"+EG_CP_JAZEERA+"</td><td>"+JAZEERA_CP+"</td></tr>"));
	
}
if(!KIWI_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_CP_KIWI+"</td><td>"+AE_CP_KIWI+"</td><td>"+SA_CP_KIWI+"</td><td>"+EG_CP_KIWI+"</td><td>"+KIWI_CP+"</td></tr>"));
	
}
if(!Manual_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_CP_M_u+"</td><td>"+AE_CP_M_u+"</td><td>"+SA_CP_M_u+"</td><td>"+EG_CP_M_u+"</td><td>"+Manual_CP+"</td></tr>"));
	
}
if(!My_Fly_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_CP_My_Fly+"</td><td>"+AE_CP_My_Fly+"</td><td>"+SA_CP_My_Fly+"</td><td>"+EG_CP_My_Fly+"</td><td>"+My_Fly_CP+"</td></tr>"));
	
}
if(!NESMA_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_CP_NESMA+"</td><td>"+AE_CP_NESMA+"</td><td>"+SA_CP_NESMA+"</td><td>"+EG_CP_NESMA+"</td><td>"+NESMA_CP+"</td></tr>"));
	
}
if(!PEGASUS_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_CP_PEGASUS+"</td><td>"+AE_CP_PEGASUS+"</td><td>"+SA_CP_PEGASUS+"</td><td>"+EG_CP_PEGASUS+"</td><td>"+PEGASUS_CP+"</td></tr>"));
	
}
if(!S_9JFH_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_CP_S_9JFH+"</td><td>"+AE_CP_S_9JFH+"</td><td>"+SA_CP_S_9JFH+"</td><td>"+EG_CP_S_9JFH+"</td><td>"+S_9JFH_CP+"</td></tr>"));
	
}
if(!S_ID2I_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_CP_S_ID2I+"</td><td>"+AE_CP_S_ID2I+"</td><td>"+SA_CP_S_ID2I+"</td><td>"+EG_CP_S_ID2I+"</td><td>"+S_ID2I_CP+"</td></tr>"));
	
}
if(!S_L8YI_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_CP_S_L8YI+"</td><td>"+AE_CP_S_L8YI+"</td><td>"+SA_CP_S_L8YI+"</td><td>"+EG_CP_S_L8YI+"</td><td>"+S_L8YI_CP+"</td></tr>"));
	
}
if(!S_L9AI_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_CP_S_L9AI+"</td><td>"+AE_CP_S_L9AI+"</td><td>"+SA_CP_S_L9AI+"</td><td>"+EG_CP_S_L9AI+"</td><td>"+S_L9AI_CP+"</td></tr>"));
	
}
if(!S_L9CI_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_CP_S_L9CI+"</td><td>"+AE_CP_S_L9CI+"</td><td>"+SA_CP_S_L9CI+"</td><td>"+EG_CP_S_L9CI+"</td><td>"+S_L9CI_CP+"</td></tr>"));
	
}
if(!S_T13I_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_CP_S_T13I+"</td><td>"+AE_CP_S_T13I+"</td><td>"+SA_CP_S_T13I+"</td><td>"+EG_CP_S_T13I+"</td><td>"+S_T13I_CP+"</td></tr>"));
	
}
if(!S_T20I_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_CP_S_T20I+"</td><td>"+AE_CP_S_T20I+"</td><td>"+SA_CP_S_T20I+"</td><td>"+EG_CP_S_T20I+"</td><td>"+S_T20I_CP+"</td></tr>"));
	
}
if(!SALAM_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_CP_SALAM+"</td><td>"+AE_CP_SALAM+"</td><td>"+SA_CP_SALAM+"</td><td>"+EG_CP_SALAM+"</td><td>"+SALAM_CP+"</td></tr>"));
	
}
if(!S_Jet_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_CP_S_Jet+"</td><td>"+AE_CP_S_Jet+"</td><td>"+SA_CP_S_Jet+"</td><td>"+EG_CP_S_Jet+"</td><td>"+S_Jet_CP+"</td></tr>"));
	
}
if(!U_3R1G_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_CP_U_3R1G+"</td><td>"+AE_CP_U_3R1G+"</td><td>"+SA_CP_U_3R1G+"</td><td>"+EG_CP_U_3R1G+"</td><td>"+U_3R1G_CP+"</td></tr>"));
	
}
if(!U_570E_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_CP_U_570E+"</td><td>"+AE_CP_U_570E+"</td><td>"+SA_CP_U_570E+"</td><td>"+EG_CP_U_570E+"</td><td>"+U_570E_CP+"</td></tr>"));
	
}
if(!U_5N61_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_CP_U_5N61+"</td><td>"+AE_CP_U_5N61+"</td><td>"+SA_CP_U_5N61+"</td><td>"+EG_CP_U_5N61+"</td><td>"+U_5N61_CP+"</td></tr>"));
	
}
if(!U_6E_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_CP_U_6E+"</td><td>"+AE_CP_U_6E+"</td><td>"+SA_CP_U_6E+"</td><td>"+EG_CP_U_6E+"</td><td>"+U_6E_CP+"</td></tr>"));
	
}
if(!U_7FK5_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_CP_U_7FK5+"</td><td>"+AE_CP_U_7FK5+"</td><td>"+SA_CP_U_7FK5+"</td><td>"+EG_CP_U_7FK5+"</td><td>"+U_7FK5_CP+"</td></tr>"));
	
}
if(!U_7JY2_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_CP_U_7JY2+"</td><td>"+AE_CP_U_7JY2+"</td><td>"+SA_CP_U_7JY2+"</td><td>"+EG_CP_U_7JY2+"</td><td>"+U_7JY2_CP+"</td></tr>"));
	
}
if(!U_802N_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_CP_U_802N+"</td><td>"+AE_CP_U_802N+"</td><td>"+SA_CP_U_802N+"</td><td>"+EG_CP_U_802N+"</td><td>"+U_802N_CP+"</td></tr>"));
	
}
if(!U_802R_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_CP_U_802R+"</td><td>"+AE_CP_U_802R+"</td><td>"+SA_CP_U_802R+"</td><td>"+EG_CP_U_802R+"</td><td>"+U_802R_CP+"</td></tr>"));
	
}
if(!U_8SQ7_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_CP_U_8SQ7+"</td><td>"+AE_CP_U_8SQ7+"</td><td>"+SA_CP_U_8SQ7+"</td><td>"+EG_CP_U_8SQ7+"</td><td>"+U_8SQ7_CP+"</td></tr>"));
	
}
if(!WATANIYA_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_CP_WATANIYA+"</td><td>"+AE_CP_WATANIYA+"</td><td>"+SA_CP_WATANIYA+"</td><td>"+EG_CP_WATANIYA+"</td><td>"+WATANIYA_CP+"</td></tr>"));
	
}
if(!A_AR_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_CP_A_AR+"</td><td>"+AE_CP_A_AR+"</td><td>"+SA_CP_A_AR+"</td><td>"+EG_CP_A_AR+"</td><td>"+A_AR_CP+"</td></tr>"));
	
}
if(!A_AR_E_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_CP_A_AR_E+"</td><td>"+AE_CP_A_AR_E+"</td><td>"+SA_CP_A_AR_E+"</td><td>"+EG_CP_A_AR_E+"</td><td>"+A_AR_E_CP+"</td></tr>"));
	
}
if(!A_AR_M_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_CP_A_AR_M+"</td><td>"+AE_CP_A_AR_M+"</td><td>"+SA_CP_A_AR_M+"</td><td>"+EG_CP_A_AR_M+"</td><td>"+A_AR_M_CP+"</td></tr>"));
	
} 
if(!A_I_E_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_CP_A_I_E+"</td><td>"+AE_CP_A_I_E+"</td><td>"+SA_CP_A_I_E+"</td><td>"+EG_CP_A_I_E+"</td><td>"+A_I_E_CP+"</td></tr>"));
	
} 
if(!FlyDubai_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_CP_FlyDubai+"</td><td>"+AE_CP_FlyDubai+"</td><td>"+SA_CP_FlyDubai+"</td><td>"+EG_CP_FlyDubai+"</td><td>"+FlyDubai_CP+"</td></tr>"));
	
} 
if(!Flynas_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_CP_Flynas+"</td><td>"+AE_CP_Flynas+"</td><td>"+SA_CP_Flynas+"</td><td>"+EG_CP_Flynas+"</td><td>"+Flynas_CP+"</td></tr>"));

} 
if(!Flyadeal_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>FlyaDeal</td> <td>"+Com_CP_Flyadeal+"</td><td>"+AE_CP_Flyadeal+"</td><td>"+SA_CP_Flyadeal+"</td><td>"+EG_CP_Flyadeal+"</td><td>"+Flyadeal_CP+"</td></tr>"));

} 
if(!Gal_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GAL-7Q0W</td> <td>"+Com_CP_GAL7Q+"</td><td>"+AE_CP_GAL7Q+"</td><td>"+SA_CP_GAL7Q+"</td><td>"+EG_CP_GAL7Q+"</td><td>"+Gal_CP+"</td></tr>"));

} 
if(!S_1LNJ_C_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_1LNJ</td> <td>"+Com_CP_S_1LNJ+"</td><td>"+AE_CP_S_1LNJ+"</td><td>"+SA_CP_S_1LNJ+"</td><td>"+EG_CP_S_1LNJ+"</td><td>"+S_1LNJ_CP+"</td></tr>"));

} 


String RP_NullValue=Integer.toString(RP_UNQ_VALUE);
Integer rp_sub=RP_UNQ_VALUE-2;
if(RP_NullValue.equals("0"))
{
	
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center>REPRICING</td>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<td>0</td> <td>"+Com_RP_G_3R1+"</td><td>"+AE_RP_G_3R1+"</td><td>"+SA_RP_G_3R1+"</td><td>"+EG_RP_G_3R1+"</td><td>"+G_3R1G_RP+"</td><td width = 50; align=center>"+All_Sup_Repricing_total+"</td></tr>"));

  
}
if(!RP_NullValue.equals("0")){
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+RP_UNQ_VALUE+" >REPRICING</td>"));

if(!G_3R1G_R_P.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_RP_G_3R1+"</td><td>"+AE_RP_G_3R1+"</td><td>"+SA_RP_G_3R1+"</td><td>"+EG_RP_G_3R1+"</td><td>"+G_3R1G_RP+"</td><td width = 50; align=center rowspan="+rp_sub+">"+All_Sup_Repricing_total+"</td></tr>"));

}
if(G_3R1G_R_P.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_RP_G_3R1+"</td><td>"+AE_RP_G_3R1+"</td><td>"+SA_RP_G_3R1+"</td><td>"+EG_RP_G_3R1+"</td><td>"+G_3R1G_RP+"</td><td width = 50; align=center rowspan="+rp_sub+">"+All_Sup_Repricing_total+"</td></tr>"));

}

}
//Not Equal to Zero
//REPRICING
if(!G_3K6_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G_3K6</td> <td>"+Com_RP_G_3K6+"</td><td>"+AE_RP_G_3K6+"</td><td>"+SA_RP_G_3K6+"</td><td>"+EG_RP_G_3K6+"</td><td>"+Gal_3K6_RP+"</td></tr>"));

}
if(!G_570E_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_RP_G_570E+"</td><td>"+AE_RP_G_570E+"</td><td>"+SA_RP_G_570E+"</td><td>"+EG_RP_G_570E+"</td><td>"+G_570E_RP+"</td></tr>"));
	
}
if(!G_5N61_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_RP_G_5N61+"</td><td>"+AE_RP_G_5N61+"</td><td>"+SA_RP_G_5N61+"</td><td>"+EG_RP_G_5N61+"</td><td>"+G_5N61_RP+"</td></tr>"));
	
}
if(!G_7FK5_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_RP_G_7FK5+"</td><td>"+AE_RP_G_7FK5+"</td><td>"+SA_RP_G_7FK5+"</td><td>"+EG_RP_G_7FK5+"</td><td>"+G_7FK5_RP+"</td></tr>"));
	
}
if(!G_7JY2_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_RP_G_7JY2+"</td><td>"+AE_RP_G_7JY2+"</td><td>"+SA_RP_G_7JY2+"</td><td>"+EG_RP_G_7JY2+"</td><td>"+G_7JY2_RP+"</td></tr>"));
	
}
if(!G_7X7W_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_RP_G_7X7W+"</td><td>"+AE_RP_G_7X7W+"</td><td>"+SA_RP_G_7X7W+"</td><td>"+EG_RP_G_7X7W+"</td><td>"+G_7X7W_RP+"</td></tr>"));
	
}
if(!G_802N_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_RP_G_802N+"</td><td>"+AE_RP_G_802N+"</td><td>"+SA_RP_G_802N+"</td><td>"+EG_RP_G_802N+"</td><td>"+G_802N_RP+"</td></tr>"));
	
}
if(!G_802R_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_RP_G_802R+"</td><td>"+AE_RP_G_802R+"</td><td>"+SA_RP_G_802R+"</td><td>"+EG_RP_G_802R+"</td><td>"+G_802R_RP+"</td></tr>"));
	
}
if(!G_8SQ7_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_RP_G_8SQ7+"</td><td>"+AE_RP_G_8SQ7+"</td><td>"+SA_RP_G_8SQ7+"</td><td>"+EG_RP_G_8SQ7+"</td><td>"+G_8SQ7_RP+"</td></tr>"));
	
}
if(!JAZEERA_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_RP_JAZEERA+"</td><td>"+AE_RP_JAZEERA+"</td><td>"+SA_RP_JAZEERA+"</td><td>"+EG_RP_JAZEERA+"</td><td>"+JAZEERA_RP+"</td></tr>"));
	
}
if(!KIWI_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_RP_KIWI+"</td><td>"+AE_RP_KIWI+"</td><td>"+SA_RP_KIWI+"</td><td>"+EG_RP_KIWI+"</td><td>"+KIWI_RP+"</td></tr>"));
	
}
if(!Manual_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_RP_M_u+"</td><td>"+AE_RP_M_u+"</td><td>"+SA_RP_M_u+"</td><td>"+EG_RP_M_u+"</td><td>"+Manual_RP+"</td></tr>"));
	
}
if(!My_Fly_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_RP_My_Fly+"</td><td>"+AE_RP_My_Fly+"</td><td>"+SA_RP_My_Fly+"</td><td>"+EG_RP_My_Fly+"</td><td>"+My_Fly_RP+"</td></tr>"));
	
}
if(!NESMA_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_RP_NESMA+"</td><td>"+AE_RP_NESMA+"</td><td>"+SA_RP_NESMA+"</td><td>"+EG_RP_NESMA+"</td><td>"+NESMA_RP+"</td></tr>"));
	
}
if(!PEGASUS_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_RP_PEGASUS+"</td><td>"+AE_RP_PEGASUS+"</td><td>"+SA_RP_PEGASUS+"</td><td>"+EG_RP_PEGASUS+"</td><td>"+PEGASUS_RP+"</td></tr>"));
	
}
if(!S_9JFH_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_RP_S_9JFH+"</td><td>"+AE_RP_S_9JFH+"</td><td>"+SA_RP_S_9JFH+"</td><td>"+EG_RP_S_9JFH+"</td><td>"+S_9JFH_RP+"</td></tr>"));
	
}
if(!S_ID2I_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_RP_S_ID2I+"</td><td>"+AE_RP_S_ID2I+"</td><td>"+SA_RP_S_ID2I+"</td><td>"+EG_RP_S_ID2I+"</td><td>"+S_ID2I_RP+"</td></tr>"));
	
}
if(!S_L8YI_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_RP_S_L8YI+"</td><td>"+AE_RP_S_L8YI+"</td><td>"+SA_RP_S_L8YI+"</td><td>"+EG_RP_S_L8YI+"</td><td>"+S_L8YI_RP+"</td></tr>"));
	
}
if(!S_L9AI_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_RP_S_L9AI+"</td><td>"+AE_RP_S_L9AI+"</td><td>"+SA_RP_S_L9AI+"</td><td>"+EG_RP_S_L9AI+"</td><td>"+S_L9AI_RP+"</td></tr>"));
	
}
if(!S_L9CI_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_RP_S_L9CI+"</td><td>"+AE_RP_S_L9CI+"</td><td>"+SA_RP_S_L9CI+"</td><td>"+EG_RP_S_L9CI+"</td><td>"+S_L9CI_RP+"</td></tr>"));
	
}
if(!S_T13I_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_RP_S_T13I+"</td><td>"+AE_RP_S_T13I+"</td><td>"+SA_RP_S_T13I+"</td><td>"+EG_RP_S_T13I+"</td><td>"+S_T13I_RP+"</td></tr>"));
	
}
if(!S_T20I_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_RP_S_T20I+"</td><td>"+AE_RP_S_T20I+"</td><td>"+SA_RP_S_T20I+"</td><td>"+EG_RP_S_T20I+"</td><td>"+S_T20I_RP+"</td></tr>"));
	
}
if(!SALAM_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_RP_SALAM+"</td><td>"+AE_RP_SALAM+"</td><td>"+SA_RP_SALAM+"</td><td>"+EG_RP_SALAM+"</td><td>"+SALAM_RP+"</td></tr>"));
	
}
if(!S_Jet_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_RP_S_Jet+"</td><td>"+AE_RP_S_Jet+"</td><td>"+SA_RP_S_Jet+"</td><td>"+EG_RP_S_Jet+"</td><td>"+S_Jet_RP+"</td></tr>"));
	
}
if(!U_3R1G_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_RP_U_3R1G+"</td><td>"+AE_RP_U_3R1G+"</td><td>"+SA_RP_U_3R1G+"</td><td>"+EG_RP_U_3R1G+"</td><td>"+U_3R1G_RP+"</td></tr>"));
	
}
if(!U_570E_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_RP_U_570E+"</td><td>"+AE_RP_U_570E+"</td><td>"+SA_RP_U_570E+"</td><td>"+EG_RP_U_570E+"</td><td>"+U_570E_RP+"</td></tr>"));
	
}
if(!U_5N61_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_RP_U_5N61+"</td><td>"+AE_RP_U_5N61+"</td><td>"+SA_RP_U_5N61+"</td><td>"+EG_RP_U_5N61+"</td><td>"+U_5N61_RP+"</td></tr>"));
	
}
if(!U_6E_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_RP_U_6E+"</td><td>"+AE_RP_U_6E+"</td><td>"+SA_RP_U_6E+"</td><td>"+EG_RP_U_6E+"</td><td>"+U_6E_RP+"</td></tr>"));
	
}
if(!U_7FK5_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_RP_U_7FK5+"</td><td>"+AE_RP_U_7FK5+"</td><td>"+SA_RP_U_7FK5+"</td><td>"+EG_RP_U_7FK5+"</td><td>"+U_7FK5_RP+"</td></tr>"));
	
}
if(!U_7JY2_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_RP_U_7JY2+"</td><td>"+AE_RP_U_7JY2+"</td><td>"+SA_RP_U_7JY2+"</td><td>"+EG_RP_U_7JY2+"</td><td>"+U_7JY2_RP+"</td></tr>"));
	
}
if(!U_802N_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_RP_U_802N+"</td><td>"+AE_RP_U_802N+"</td><td>"+SA_RP_U_802N+"</td><td>"+EG_RP_U_802N+"</td><td>"+U_802N_RP+"</td></tr>"));
	
}
if(!U_802R_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_RP_U_802R+"</td><td>"+AE_RP_U_802R+"</td><td>"+SA_RP_U_802R+"</td><td>"+EG_RP_U_802R+"</td><td>"+U_802R_RP+"</td></tr>"));
	
}
if(!U_8SQ7_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_RP_U_8SQ7+"</td><td>"+AE_RP_U_8SQ7+"</td><td>"+SA_RP_U_8SQ7+"</td><td>"+EG_RP_U_8SQ7+"</td><td>"+U_8SQ7_RP+"</td></tr>"));
	
}
if(!WATANIYA_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_RP_WATANIYA+"</td><td>"+AE_RP_WATANIYA+"</td><td>"+SA_RP_WATANIYA+"</td><td>"+EG_RP_WATANIYA+"</td><td>"+WATANIYA_RP+"</td></tr>"));
	
}
if(!A_AR_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_RP_A_AR+"</td><td>"+AE_RP_A_AR+"</td><td>"+SA_RP_A_AR+"</td><td>"+EG_RP_A_AR+"</td><td>"+A_AR_RP+"</td></tr>"));
	
}
if(!A_AR_E_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_RP_A_AR_E+"</td><td>"+AE_RP_A_AR_E+"</td><td>"+SA_RP_A_AR_E+"</td><td>"+EG_RP_A_AR_E+"</td><td>"+A_AR_E_RP+"</td></tr>"));
	
}
if(!A_AR_M_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_RP_A_AR_M+"</td><td>"+AE_RP_A_AR_M+"</td><td>"+SA_RP_A_AR_M+"</td><td>"+EG_RP_A_AR_M+"</td><td>"+A_AR_M_RP+"</td></tr>"));
	
} 
if(!A_I_E_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_RP_A_I_E+"</td><td>"+AE_RP_A_I_E+"</td><td>"+SA_RP_A_I_E+"</td><td>"+EG_RP_A_I_E+"</td><td>"+A_I_E_RP+"</td></tr>"));
	
} 
if(!FlyDubai_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_RP_FlyDubai+"</td><td>"+AE_RP_FlyDubai+"</td><td>"+SA_RP_FlyDubai+"</td><td>"+EG_RP_FlyDubai+"</td><td>"+FlyDubai_RP+"</td></tr>"));
	
} 
if(!Flynas_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_RP_Flynas+"</td><td>"+AE_RP_Flynas+"</td><td>"+SA_RP_Flynas+"</td><td>"+EG_RP_Flynas+"</td><td>"+Flynas_RP+"</td></tr>"));

} 

if(!Flyadeal_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyaDeal</td> <td>"+Com_RP_Flyadeal+"</td><td>"+AE_RP_Flyadeal+"</td><td>"+SA_RP_Flyadeal+"</td><td>"+EG_RP_Flyadeal+"</td><td>"+Flyadeal_RP+"</td></tr>"));

} 
if(!Gal_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>GAL-7Q0W</td> <td>"+Com_RP_GAL7Q+"</td><td>"+AE_RP_GAL7Q+"</td><td>"+SA_RP_GAL7Q+"</td><td>"+EG_RP_GAL7Q+"</td><td>"+Gal_RP+"</td></tr>"));

} 
if(!S_1LNJ_R_P.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_1LNJ</td> <td>"+Com_RP_S_1LNJ+"</td><td>"+AE_RP_S_1LNJ+"</td><td>"+SA_RP_S_1LNJ+"</td><td>"+EG_RP_S_1LNJ+"</td><td>"+S_1LNJ_RP+"</td></tr>"));

} 


String SD_NullValue=Integer.toString(SD_UNQ_VALUE);
Integer sd_sub=SD_UNQ_VALUE-2;
if(SD_NullValue.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+SD_UNQ_VALUE+" >SOLDOUT</td>"));
   email.setHtmlMsg(""+htmlStringBuilder.append("<td>0</td> <td>"+Com_SD_G_3R1+"</td><td>"+AE_SD_G_3R1+"</td><td>"+SA_SD_G_3R1+"</td><td>"+EG_SD_G_3R1+"</td><td>"+G_3R1G_SD+"</td><td width = 50; align=center>"+All_Sup_SoldOut_total+"</td></tr>"));

	

}
if(!SD_NullValue.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+SD_UNQ_VALUE+" >SOLDOUT</td>"));
	if(!G_3R1G_S_D.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_SD_G_3R1+"</td><td>"+AE_SD_G_3R1+"</td><td>"+SA_SD_G_3R1+"</td><td>"+EG_SD_G_3R1+"</td><td>"+G_3R1G_SD+"</td><td width = 50; align=center rowspan="+sd_sub+">"+All_Sup_SoldOut_total+"</td></tr>"));

	}
	if(G_3R1G_S_D.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_SD_G_3R1+"</td><td>"+AE_SD_G_3R1+"</td><td>"+SA_SD_G_3R1+"</td><td>"+EG_SD_G_3R1+"</td><td>"+G_3R1G_SD+"</td><td width = 50; align=center rowspan="+sd_sub+">"+All_Sup_SoldOut_total+"</td></tr>"));

	}

}
//Not Equal to Zero
//SOLDOUT
if(!G_3K6_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G_3K6</td> <td>"+Com_SD_G_3K6+"</td><td>"+AE_SD_G_3K6+"</td><td>"+SA_SD_G_3K6+"</td><td>"+EG_SD_G_3K6+"</td><td>"+Gal_3K6_SD+"</td></tr>"));

}
if(!G_570E_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_SD_G_570E+"</td><td>"+AE_SD_G_570E+"</td><td>"+SA_SD_G_570E+"</td><td>"+EG_SD_G_570E+"</td><td>"+G_570E_SD+"</td></tr>"));
	
}
if(!G_5N61_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_SD_G_5N61+"</td><td>"+AE_SD_G_5N61+"</td><td>"+SA_SD_G_5N61+"</td><td>"+EG_SD_G_5N61+"</td><td>"+G_5N61_SD+"</td></tr>"));
	
}
if(!G_7FK5_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_SD_G_7FK5+"</td><td>"+AE_SD_G_7FK5+"</td><td>"+SA_SD_G_7FK5+"</td><td>"+EG_SD_G_7FK5+"</td><td>"+G_7FK5_SD+"</td></tr>"));
	
}
if(!G_7JY2_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_SD_G_7JY2+"</td><td>"+AE_SD_G_7JY2+"</td><td>"+SA_SD_G_7JY2+"</td><td>"+EG_SD_G_7JY2+"</td><td>"+G_7JY2_SD+"</td></tr>"));
	
}
if(!G_7X7W_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_SD_G_7X7W+"</td><td>"+AE_SD_G_7X7W+"</td><td>"+SA_SD_G_7X7W+"</td><td>"+EG_SD_G_7X7W+"</td><td>"+G_7X7W_SD+"</td></tr>"));
	
}
if(!G_802N_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_SD_G_802N+"</td><td>"+AE_SD_G_802N+"</td><td>"+SA_SD_G_802N+"</td><td>"+EG_SD_G_802N+"</td><td>"+G_802N_SD+"</td></tr>"));
	
}
if(!G_802R_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_SD_G_802R+"</td><td>"+AE_SD_G_802R+"</td><td>"+SA_SD_G_802R+"</td><td>"+EG_SD_G_802R+"</td><td>"+G_802R_SD+"</td></tr>"));
	
}
if(!G_8SQ7_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_SD_G_8SQ7+"</td><td>"+AE_SD_G_8SQ7+"</td><td>"+SA_SD_G_8SQ7+"</td><td>"+EG_SD_G_8SQ7+"</td><td>"+G_8SQ7_SD+"</td></tr>"));
	
}
if(!JAZEERA_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_SD_JAZEERA+"</td><td>"+AE_SD_JAZEERA+"</td><td>"+SA_SD_JAZEERA+"</td><td>"+EG_SD_JAZEERA+"</td><td>"+JAZEERA_SD+"</td></tr>"));
	
}
if(!KIWI_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_SD_KIWI+"</td><td>"+AE_SD_KIWI+"</td><td>"+SA_SD_KIWI+"</td><td>"+EG_SD_KIWI+"</td><td>"+KIWI_SD+"</td></tr>"));
	
}
if(!Manual_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_SD_M_u+"</td><td>"+AE_SD_M_u+"</td><td>"+SA_SD_M_u+"</td><td>"+EG_SD_M_u+"</td><td>"+Manual_SD+"</td></tr>"));
	
}
if(!My_Fly_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_SD_My_Fly+"</td><td>"+AE_SD_My_Fly+"</td><td>"+SA_SD_My_Fly+"</td><td>"+EG_SD_My_Fly+"</td><td>"+My_Fly_SD+"</td></tr>"));
	
}
if(!NESMA_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_SD_NESMA+"</td><td>"+AE_SD_NESMA+"</td><td>"+SA_SD_NESMA+"</td><td>"+EG_SD_NESMA+"</td><td>"+NESMA_SD+"</td></tr>"));
	
}
if(!PEGASUS_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_SD_PEGASUS+"</td><td>"+AE_SD_PEGASUS+"</td><td>"+SA_SD_PEGASUS+"</td><td>"+EG_SD_PEGASUS+"</td><td>"+PEGASUS_SD+"</td></tr>"));
	
}
if(!S_9JFH_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_SD_S_9JFH+"</td><td>"+AE_SD_S_9JFH+"</td><td>"+SA_SD_S_9JFH+"</td><td>"+EG_SD_S_9JFH+"</td><td>"+S_9JFH_SD+"</td></tr>"));
	
}
if(!S_ID2I_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_SD_S_ID2I+"</td><td>"+AE_SD_S_ID2I+"</td><td>"+SA_SD_S_ID2I+"</td><td>"+EG_SD_S_ID2I+"</td><td>"+S_ID2I_SD+"</td></tr>"));
	
}
if(!S_L8YI_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_SD_S_L8YI+"</td><td>"+AE_SD_S_L8YI+"</td><td>"+SA_SD_S_L8YI+"</td><td>"+EG_SD_S_L8YI+"</td><td>"+S_L8YI_SD+"</td></tr>"));
	
}
if(!S_L9AI_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_SD_S_L9AI+"</td><td>"+AE_SD_S_L9AI+"</td><td>"+SA_SD_S_L9AI+"</td><td>"+EG_SD_S_L9AI+"</td><td>"+S_L9AI_SD+"</td></tr>"));
	
}
if(!S_L9CI_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_SD_S_L9CI+"</td><td>"+AE_SD_S_L9CI+"</td><td>"+SA_SD_S_L9CI+"</td><td>"+EG_SD_S_L9CI+"</td><td>"+S_L9CI_SD+"</td></tr>"));
	
}
if(!S_T13I_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_SD_S_T13I+"</td><td>"+AE_SD_S_T13I+"</td><td>"+SA_SD_S_T13I+"</td><td>"+EG_SD_S_T13I+"</td><td>"+S_T13I_SD+"</td></tr>"));
	
}
if(!S_T20I_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_SD_S_T20I+"</td><td>"+AE_SD_S_T20I+"</td><td>"+SA_SD_S_T20I+"</td><td>"+EG_SD_S_T20I+"</td><td>"+S_T20I_SD+"</td></tr>"));
	
}
if(!SALAM_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_SD_SALAM+"</td><td>"+AE_SD_SALAM+"</td><td>"+SA_SD_SALAM+"</td><td>"+EG_SD_SALAM+"</td><td>"+SALAM_SD+"</td></tr>"));
	
}
if(!S_Jet_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_SD_S_Jet+"</td><td>"+AE_SD_S_Jet+"</td><td>"+SA_SD_S_Jet+"</td><td>"+EG_SD_S_Jet+"</td><td>"+S_Jet_SD+"</td></tr>"));
	
}
if(!U_3R1G_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_SD_U_3R1G+"</td><td>"+AE_SD_U_3R1G+"</td><td>"+SA_SD_U_3R1G+"</td><td>"+EG_SD_U_3R1G+"</td><td>"+U_3R1G_SD+"</td></tr>"));
	
}
if(!U_570E_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_SD_U_570E+"</td><td>"+AE_SD_U_570E+"</td><td>"+SA_SD_U_570E+"</td><td>"+EG_SD_U_570E+"</td><td>"+U_570E_SD+"</td></tr>"));
	
}
if(!U_5N61_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_SD_U_5N61+"</td><td>"+AE_SD_U_5N61+"</td><td>"+SA_SD_U_5N61+"</td><td>"+EG_SD_U_5N61+"</td><td>"+U_5N61_SD+"</td></tr>"));
	
}
if(!U_6E_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_SD_U_6E+"</td><td>"+AE_SD_U_6E+"</td><td>"+SA_SD_U_6E+"</td><td>"+EG_SD_U_6E+"</td><td>"+U_6E_SD+"</td></tr>"));
	
}
if(!U_7FK5_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_SD_U_7FK5+"</td><td>"+AE_SD_U_7FK5+"</td><td>"+SA_SD_U_7FK5+"</td><td>"+EG_SD_U_7FK5+"</td><td>"+U_7FK5_SD+"</td></tr>"));
	
}
if(!U_7JY2_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_SD_U_7JY2+"</td><td>"+AE_SD_U_7JY2+"</td><td>"+SA_SD_U_7JY2+"</td><td>"+EG_SD_U_7JY2+"</td><td>"+U_7JY2_SD+"</td></tr>"));
	
}
if(!U_802N_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_SD_U_802N+"</td><td>"+AE_SD_U_802N+"</td><td>"+SA_SD_U_802N+"</td><td>"+EG_SD_U_802N+"</td><td>"+U_802N_SD+"</td></tr>"));
	
}
if(!U_802R_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_SD_U_802R+"</td><td>"+AE_SD_U_802R+"</td><td>"+SA_SD_U_802R+"</td><td>"+EG_SD_U_802R+"</td><td>"+U_802R_SD+"</td></tr>"));
	
}
if(!U_8SQ7_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_SD_U_8SQ7+"</td><td>"+AE_SD_U_8SQ7+"</td><td>"+SA_SD_U_8SQ7+"</td><td>"+EG_SD_U_8SQ7+"</td><td>"+U_8SQ7_SD+"</td></tr>"));
	
}
if(!WATANIYA_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_SD_WATANIYA+"</td><td>"+AE_SD_WATANIYA+"</td><td>"+SA_SD_WATANIYA+"</td><td>"+EG_SD_WATANIYA+"</td><td>"+WATANIYA_SD+"</td></tr>"));
	
}
if(!A_AR_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_SD_A_AR+"</td><td>"+AE_SD_A_AR+"</td><td>"+SA_SD_A_AR+"</td><td>"+EG_SD_A_AR+"</td><td>"+A_AR_SD+"</td></tr>"));
	
}
if(!A_AR_E_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_SD_A_AR_E+"</td><td>"+AE_SD_A_AR_E+"</td><td>"+SA_SD_A_AR_E+"</td><td>"+EG_SD_A_AR_E+"</td><td>"+A_AR_E_SD+"</td></tr>"));
	
}
if(!A_AR_M_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_SD_A_AR_M+"</td><td>"+AE_SD_A_AR_M+"</td><td>"+SA_SD_A_AR_M+"</td><td>"+EG_SD_A_AR_M+"</td><td>"+A_AR_M_SD+"</td></tr>"));
	
} 
if(!A_I_E_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_SD_A_I_E+"</td><td>"+AE_SD_A_I_E+"</td><td>"+SA_SD_A_I_E+"</td><td>"+EG_SD_A_I_E+"</td><td>"+A_I_E_SD+"</td></tr>"));
	
} 
if(!FlyDubai_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_SD_FlyDubai+"</td><td>"+AE_SD_FlyDubai+"</td><td>"+SA_SD_FlyDubai+"</td><td>"+EG_SD_FlyDubai+"</td><td>"+FlyDubai_SD+"</td></tr>"));
	
} 
if(!Flynas_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_SD_Flynas+"</td><td>"+AE_SD_Flynas+"</td><td>"+SA_SD_Flynas+"</td><td>"+EG_SD_Flynas+"</td><td>"+Flynas_SD+"</td></tr>"));

} 
if(!Flyadeal_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>FlyaDeal</td> <td>"+Com_SD_Flyadeal+"</td><td>"+AE_SD_Flyadeal+"</td><td>"+SA_SD_Flyadeal+"</td><td>"+EG_SD_Flyadeal+"</td><td>"+Flyadeal_SD+"</td></tr>"));

} 
if(!Gal_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GAL-7Q0W</td> <td>"+Com_SD_GAL7Q+"</td><td>"+AE_SD_GAL7Q+"</td><td>"+SA_SD_GAL7Q+"</td><td>"+EG_SD_GAL7Q+"</td><td>"+Gal_SD+"</td></tr>"));

} 
if(!S_1LNJ_S_D.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_1LNJ</td> <td>"+Com_SD_S_1LNJ+"</td><td>"+AE_SD_S_1LNJ+"</td><td>"+SA_SD_S_1LNJ+"</td><td>"+EG_SD_S_1LNJ+"</td><td>"+S_1LNJ_SD+"</td></tr>"));

} 

String CN_NullValue=Integer.toString(CN_UNQ_VALUE);
Integer cn_sub=CN_UNQ_VALUE-2;
if(CN_NullValue.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+CN_UNQ_VALUE+" >CANCELLED</td>"));
    email.setHtmlMsg(""+htmlStringBuilder.append("<td>0</td> <td>"+Com_CN_G_3R1+"</td><td>"+AE_CN_G_3R1+"</td><td>"+SA_CN_G_3R1+"</td><td>"+EG_CN_G_3R1+"</td><td>"+G_3R1G_CN+"</td><td width = 50; align=center>"+All_Sup_Cancelled_total+"</td></tr>"));


}
if(!CN_NullValue.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+CN_UNQ_VALUE+" >CANCELLED</td>"));
     }

//Not Equal to Zero
//CANCELLED

if(!G_3R1G_C_N.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_CN_G_3R1+"</td><td>"+AE_CN_G_3R1+"</td><td>"+SA_CN_G_3R1+"</td><td>"+EG_CN_G_3R1+"</td><td>"+G_3R1G_CN+"</td><td width = 50; align=center rowspan="+cn_sub+">"+All_Sup_Cancelled_total+"</td></tr>"));

	if(G_3R1G_C_N.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_CN_G_3R1+"</td><td>"+AE_CN_G_3R1+"</td><td>"+SA_CN_G_3R1+"</td><td>"+EG_CN_G_3R1+"</td><td>"+G_3R1G_CN+"</td><td width = 50; align=center rowspan="+cn_sub+">"+All_Sup_Cancelled_total+"</td></tr>"));

	}
	if(!G_570E_C_N.equals("0"))
	{
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_CN_G_570E+"</td><td>"+AE_CN_G_570E+"</td><td>"+SA_CN_G_570E+"</td><td>"+EG_CN_G_570E+"</td><td>"+G_570E_CN+"</td></tr>"));
		
	}
}

if(!G_3K6_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G_3K6</td> <td>"+Com_CN_G_3K6+"</td><td>"+AE_CN_G_3K6+"</td><td>"+SA_CN_G_3K6+"</td><td>"+EG_CN_G_3K6+"</td><td>"+Gal_3K6_CN+"</td></tr>"));

}
if(!G_5N61_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_CN_G_5N61+"</td><td>"+AE_CN_G_5N61+"</td><td>"+SA_CN_G_5N61+"</td><td>"+EG_CN_G_5N61+"</td><td>"+G_5N61_CN+"</td></tr>"));
	
}
if(!G_7FK5_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_CN_G_7FK5+"</td><td>"+AE_CN_G_7FK5+"</td><td>"+SA_CN_G_7FK5+"</td><td>"+EG_CN_G_7FK5+"</td><td>"+G_7FK5_CN+"</td></tr>"));
	
}
if(!G_7JY2_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_CN_G_7JY2+"</td><td>"+AE_CN_G_7JY2+"</td><td>"+SA_CN_G_7JY2+"</td><td>"+EG_CN_G_7JY2+"</td><td>"+G_7JY2_CN+"</td></tr>"));
	
}
if(!G_7X7W_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_CN_G_7X7W+"</td><td>"+AE_CN_G_7X7W+"</td><td>"+SA_CN_G_7X7W+"</td><td>"+EG_CN_G_7X7W+"</td><td>"+G_7X7W_CN+"</td></tr>"));
	
}
if(!G_802N_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_CN_G_802N+"</td><td>"+AE_CN_G_802N+"</td><td>"+SA_CN_G_802N+"</td><td>"+EG_CN_G_802N+"</td><td>"+G_802N_CN+"</td></tr>"));
	
}
if(!G_802R_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_CN_G_802R+"</td><td>"+AE_CN_G_802R+"</td><td>"+SA_CN_G_802R+"</td><td>"+EG_CN_G_802R+"</td><td>"+G_802R_CN+"</td></tr>"));
	
}
if(!G_8SQ7_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_CN_G_8SQ7+"</td><td>"+AE_CN_G_8SQ7+"</td><td>"+SA_CN_G_8SQ7+"</td><td>"+EG_CN_G_8SQ7+"</td><td>"+G_8SQ7_CN+"</td></tr>"));
	
}
if(!JAZEERA_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_CN_JAZEERA+"</td><td>"+AE_CN_JAZEERA+"</td><td>"+SA_CN_JAZEERA+"</td><td>"+EG_CN_JAZEERA+"</td><td>"+JAZEERA_CN+"</td></tr>"));
	
}
if(!KIWI_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_CN_KIWI+"</td><td>"+AE_CN_KIWI+"</td><td>"+SA_CN_KIWI+"</td><td>"+EG_CN_KIWI+"</td><td>"+KIWI_CN+"</td></tr>"));
	
}
if(!Manual_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_CN_M_u+"</td><td>"+AE_CN_M_u+"</td><td>"+SA_CN_M_u+"</td><td>"+EG_CN_M_u+"</td><td>"+Manual_CN+"</td></tr>"));
	
}
if(!My_Fly_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_CN_My_Fly+"</td><td>"+AE_CN_My_Fly+"</td><td>"+SA_CN_My_Fly+"</td><td>"+EG_CN_My_Fly+"</td><td>"+My_Fly_CN+"</td></tr>"));
	
}
if(!NESMA_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_CN_NESMA+"</td><td>"+AE_CN_NESMA+"</td><td>"+SA_CN_NESMA+"</td><td>"+EG_CN_NESMA+"</td><td>"+NESMA_CN+"</td></tr>"));
	
}
if(!PEGASUS_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_CN_PEGASUS+"</td><td>"+AE_CN_PEGASUS+"</td><td>"+SA_CN_PEGASUS+"</td><td>"+EG_CN_PEGASUS+"</td><td>"+PEGASUS_CN+"</td></tr>"));
	
}
if(!S_9JFH_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_CN_S_9JFH+"</td><td>"+AE_CN_S_9JFH+"</td><td>"+SA_CN_S_9JFH+"</td><td>"+EG_CN_S_9JFH+"</td><td>"+S_9JFH_CN+"</td></tr>"));
	
}
if(!S_ID2I_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_CN_S_ID2I+"</td><td>"+AE_CN_S_ID2I+"</td><td>"+SA_CN_S_ID2I+"</td><td>"+EG_CN_S_ID2I+"</td><td>"+S_ID2I_CN+"</td></tr>"));
	
}
if(!S_L8YI_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_CN_S_L8YI+"</td><td>"+AE_CN_S_L8YI+"</td><td>"+SA_CN_S_L8YI+"</td><td>"+EG_CN_S_L8YI+"</td><td>"+S_L8YI_CN+"</td></tr>"));
	
}
if(!S_L9AI_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_CN_S_L9AI+"</td><td>"+AE_CN_S_L9AI+"</td><td>"+SA_CN_S_L9AI+"</td><td>"+EG_CN_S_L9AI+"</td><td>"+S_L9AI_CN+"</td></tr>"));
	
}
if(!S_L9CI_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_CN_S_L9CI+"</td><td>"+AE_CN_S_L9CI+"</td><td>"+SA_CN_S_L9CI+"</td><td>"+EG_CN_S_L9CI+"</td><td>"+S_L9CI_CN+"</td></tr>"));
	
}
if(!S_T13I_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_CN_S_T13I+"</td><td>"+AE_CN_S_T13I+"</td><td>"+SA_CN_S_T13I+"</td><td>"+EG_CN_S_T13I+"</td><td>"+S_T13I_CN+"</td></tr>"));
	
}
if(!S_T20I_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_CN_S_T20I+"</td><td>"+AE_CN_S_T20I+"</td><td>"+SA_CN_S_T20I+"</td><td>"+EG_CN_S_T20I+"</td><td>"+S_T20I_CN+"</td></tr>"));
	
}
if(!SALAM_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_CN_SALAM+"</td><td>"+AE_CN_SALAM+"</td><td>"+SA_CN_SALAM+"</td><td>"+EG_CN_SALAM+"</td><td>"+SALAM_CN+"</td></tr>"));
	
}
if(!S_Jet_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_CN_S_Jet+"</td><td>"+AE_CN_S_Jet+"</td><td>"+SA_CN_S_Jet+"</td><td>"+EG_CN_S_Jet+"</td><td>"+S_Jet_CN+"</td></tr>"));
	
}
if(!U_3R1G_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_CN_U_3R1G+"</td><td>"+AE_CN_U_3R1G+"</td><td>"+SA_CN_U_3R1G+"</td><td>"+EG_CN_U_3R1G+"</td><td>"+U_3R1G_CN+"</td></tr>"));
	
}
if(!U_570E_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_CN_U_570E+"</td><td>"+AE_CN_U_570E+"</td><td>"+SA_CN_U_570E+"</td><td>"+EG_CN_U_570E+"</td><td>"+U_570E_CN+"</td></tr>"));
	
}
if(!U_5N61_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_CN_U_5N61+"</td><td>"+AE_CN_U_5N61+"</td><td>"+SA_CN_U_5N61+"</td><td>"+EG_CN_U_5N61+"</td><td>"+U_5N61_CN+"</td></tr>"));
	
}
if(!U_6E_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_CN_U_6E+"</td><td>"+AE_CN_U_6E+"</td><td>"+SA_CN_U_6E+"</td><td>"+EG_CN_U_6E+"</td><td>"+U_6E_CN+"</td></tr>"));
	
}
if(!U_7FK5_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_CN_U_7FK5+"</td><td>"+AE_CN_U_7FK5+"</td><td>"+SA_CN_U_7FK5+"</td><td>"+EG_CN_U_7FK5+"</td><td>"+U_7FK5_CN+"</td></tr>"));
	
}
if(!U_7JY2_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_CN_U_7JY2+"</td><td>"+AE_CN_U_7JY2+"</td><td>"+SA_CN_U_7JY2+"</td><td>"+EG_CN_U_7JY2+"</td><td>"+U_7JY2_CN+"</td></tr>"));
	
}
if(!U_802N_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_CN_U_802N+"</td><td>"+AE_CN_U_802N+"</td><td>"+SA_CN_U_802N+"</td><td>"+EG_CN_U_802N+"</td><td>"+U_802N_CN+"</td></tr>"));
	
}
if(!U_802R_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_CN_U_802R+"</td><td>"+AE_CN_U_802R+"</td><td>"+SA_CN_U_802R+"</td><td>"+EG_CN_U_802R+"</td><td>"+U_802R_CN+"</td></tr>"));
	
}
if(!U_8SQ7_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_CN_U_8SQ7+"</td><td>"+AE_CN_U_8SQ7+"</td><td>"+SA_CN_U_8SQ7+"</td><td>"+EG_CN_U_8SQ7+"</td><td>"+U_8SQ7_CN+"</td></tr>"));
	
}
if(!WATANIYA_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_CN_WATANIYA+"</td><td>"+AE_CN_WATANIYA+"</td><td>"+SA_CN_WATANIYA+"</td><td>"+EG_CN_WATANIYA+"</td><td>"+WATANIYA_CN+"</td></tr>"));
	
}
if(!A_AR_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_CN_A_AR+"</td><td>"+AE_CN_A_AR+"</td><td>"+SA_CN_A_AR+"</td><td>"+EG_CN_A_AR+"</td><td>"+A_AR_CN+"</td></tr>"));
	
}
if(!A_AR_E_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_CN_A_AR_E+"</td><td>"+AE_CN_A_AR_E+"</td><td>"+SA_CN_A_AR_E+"</td><td>"+EG_CN_A_AR_E+"</td><td>"+A_AR_E_CN+"</td></tr>"));
	
}
if(!A_AR_M_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_CN_A_AR_M+"</td><td>"+AE_CN_A_AR_M+"</td><td>"+SA_CN_A_AR_M+"</td><td>"+EG_CN_A_AR_M+"</td><td>"+A_AR_M_CN+"</td></tr>"));
	
} 
if(!A_I_E_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_CN_A_I_E+"</td><td>"+AE_CN_A_I_E+"</td><td>"+SA_CN_A_I_E+"</td><td>"+EG_CN_A_I_E+"</td><td>"+A_I_E_CN+"</td></tr>"));
	
} 
if(!FlyDubai_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_CN_FlyDubai+"</td><td>"+AE_CN_FlyDubai+"</td><td>"+SA_CN_FlyDubai+"</td><td>"+EG_CN_FlyDubai+"</td><td>"+FlyDubai_CN+"</td></tr>"));
	
} 
if(!Flynas_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_CN_Flynas+"</td><td>"+AE_CN_Flynas+"</td><td>"+SA_CN_Flynas+"</td><td>"+EG_CN_Flynas+"</td><td>"+Flynas_CN+"</td></tr>"));

} 
if(!Flyadeal_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyaDeal</td> <td>"+Com_CN_Flyadeal+"</td><td>"+AE_CN_Flyadeal+"</td><td>"+SA_CN_Flyadeal+"</td><td>"+EG_CN_Flyadeal+"</td><td>"+Flyadeal_CN+"</td></tr>"));

} 
if(!Gal_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>GAL-7Q0W</td> <td>"+Com_CN_GAL7Q+"</td><td>"+AE_CN_GAL7Q+"</td><td>"+SA_CN_GAL7Q+"</td><td>"+EG_CN_GAL7Q+"</td><td>"+Gal_CN+"</td></tr>"));

} 
if(!S_1LNJ_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_1LNJ</td> <td>"+Com_CN_S_1LNJ+"</td><td>"+AE_CN_S_1LNJ+"</td><td>"+SA_CN_S_1LNJ+"</td><td>"+EG_CN_S_1LNJ+"</td><td>"+S_1LNJ_CN+"</td></tr>"));

} 

String TH_NullValue=Integer.toString(TH_UNQ_VALUE);
Integer th_sub=TH_UNQ_VALUE-2;
if(TH_NullValue.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+TH_UNQ_VALUE+"  >TRANSACTION HOLD</td>"));
    email.setHtmlMsg(""+htmlStringBuilder.append("<td>0</td> <td>"+Com_TH_G_3R1+"</td><td>"+AE_TH_G_3R1+"</td><td>"+SA_TH_G_3R1+"</td><td>"+EG_TH_G_3R1+"</td><td>"+G_3R1G_TH+"</td><td width = 50; align=center>"+All_Sup_TransactionHold_total+"</td></tr>"));

	

}
if(!TH_NullValue.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan="+TH_UNQ_VALUE+"  >TRANSACTION HOLD</td>"));
	if(!G_3R1G_T_H.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TH_G_3R1+"</td><td>"+AE_TH_G_3R1+"</td><td>"+SA_TH_G_3R1+"</td><td>"+EG_TH_G_3R1+"</td><td>"+G_3R1G_TH+"</td><td width = 50; align=center rowspan="+th_sub+">"+All_Sup_TransactionHold_total+"</td></tr>"));

	}
	if(G_3R1G_T_H.equals("0")){
		email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TH_G_3R1+"</td><td>"+AE_TH_G_3R1+"</td><td>"+SA_TH_G_3R1+"</td><td>"+EG_TH_G_3R1+"</td><td>"+G_3R1G_TH+"</td><td width = 50; align=center rowspan="+th_sub+">"+All_Sup_TransactionHold_total+"</td></tr>"));

	}

}
//Not Equal to Zero
//TRANSACTION HOLD

if(!G_3K6_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G_3K6</td> <td>"+Com_TH_G_3K6+"</td><td>"+AE_TH_G_3K6+"</td><td>"+SA_TH_G_3K6+"</td><td>"+EG_TH_G_3K6+"</td><td>"+Gal_3K6_TH+"</td></tr>"));

}
if(!G_570E_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TH_G_570E+"</td><td>"+AE_TH_G_570E+"</td><td>"+SA_TH_G_570E+"</td><td>"+EG_TH_G_570E+"</td><td>"+G_570E_TH+"</td></tr>"));
	
}
if(!G_5N61_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TH_G_5N61+"</td><td>"+AE_TH_G_5N61+"</td><td>"+SA_TH_G_5N61+"</td><td>"+EG_TH_G_5N61+"</td><td>"+G_5N61_TH+"</td></tr>"));
	
}
if(!G_7FK5_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TH_G_7FK5+"</td><td>"+AE_TH_G_7FK5+"</td><td>"+SA_TH_G_7FK5+"</td><td>"+EG_TH_G_7FK5+"</td><td>"+G_7FK5_TH+"</td></tr>"));
	
}
if(!G_7JY2_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TH_G_7JY2+"</td><td>"+AE_TH_G_7JY2+"</td><td>"+SA_TH_G_7JY2+"</td><td>"+EG_TH_G_7JY2+"</td><td>"+G_7JY2_TH+"</td></tr>"));
	
}
if(!G_7X7W_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TH_G_7X7W+"</td><td>"+AE_TH_G_7X7W+"</td><td>"+SA_TH_G_7X7W+"</td><td>"+EG_TH_G_7X7W+"</td><td>"+G_7X7W_TH+"</td></tr>"));
	
}
if(!G_802N_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TH_G_802N+"</td><td>"+AE_TH_G_802N+"</td><td>"+SA_TH_G_802N+"</td><td>"+EG_TH_G_802N+"</td><td>"+G_802N_TH+"</td></tr>"));
	
}
if(!G_802R_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TH_G_802R+"</td><td>"+AE_TH_G_802R+"</td><td>"+SA_TH_G_802R+"</td><td>"+EG_TH_G_802R+"</td><td>"+G_802R_TH+"</td></tr>"));
	
}
if(!G_8SQ7_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TH_G_8SQ7+"</td><td>"+AE_TH_G_8SQ7+"</td><td>"+SA_TH_G_8SQ7+"</td><td>"+EG_TH_G_8SQ7+"</td><td>"+G_8SQ7_TH+"</td></tr>"));
	
}
if(!JAZEERA_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TH_JAZEERA+"</td><td>"+AE_TH_JAZEERA+"</td><td>"+SA_TH_JAZEERA+"</td><td>"+EG_TH_JAZEERA+"</td><td>"+JAZEERA_TH+"</td></tr>"));
	
}
if(!KIWI_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TH_KIWI+"</td><td>"+AE_TH_KIWI+"</td><td>"+SA_TH_KIWI+"</td><td>"+EG_TH_KIWI+"</td><td>"+KIWI_TH+"</td></tr>"));
	
}
if(!Manual_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TH_M_u+"</td><td>"+AE_TH_M_u+"</td><td>"+SA_TH_M_u+"</td><td>"+EG_TH_M_u+"</td><td>"+Manual_TH+"</td></tr>"));
	
}
if(!My_Fly_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TH_My_Fly+"</td><td>"+AE_TH_My_Fly+"</td><td>"+SA_TH_My_Fly+"</td><td>"+EG_TH_My_Fly+"</td><td>"+My_Fly_TH+"</td></tr>"));
	
}
if(!NESMA_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TH_NESMA+"</td><td>"+AE_TH_NESMA+"</td><td>"+SA_TH_NESMA+"</td><td>"+EG_TH_NESMA+"</td><td>"+NESMA_TH+"</td></tr>"));
	
}
if(!PEGASUS_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TH_PEGASUS+"</td><td>"+AE_TH_PEGASUS+"</td><td>"+SA_TH_PEGASUS+"</td><td>"+EG_TH_PEGASUS+"</td><td>"+PEGASUS_TH+"</td></tr>"));
	
}
if(!S_9JFH_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TH_S_9JFH+"</td><td>"+AE_TH_S_9JFH+"</td><td>"+SA_TH_S_9JFH+"</td><td>"+EG_TH_S_9JFH+"</td><td>"+S_9JFH_TH+"</td></tr>"));
	
}
if(!S_ID2I_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TH_S_ID2I+"</td><td>"+AE_TH_S_ID2I+"</td><td>"+SA_TH_S_ID2I+"</td><td>"+EG_TH_S_ID2I+"</td><td>"+S_ID2I_TH+"</td></tr>"));
	
}
if(!S_L8YI_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TH_S_L8YI+"</td><td>"+AE_TH_S_L8YI+"</td><td>"+SA_TH_S_L8YI+"</td><td>"+EG_TH_S_L8YI+"</td><td>"+S_L8YI_TH+"</td></tr>"));
	
}
if(!S_L9AI_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TH_S_L9AI+"</td><td>"+AE_TH_S_L9AI+"</td><td>"+SA_TH_S_L9AI+"</td><td>"+EG_TH_S_L9AI+"</td><td>"+S_L9AI_TH+"</td></tr>"));
	
}
if(!S_L9CI_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TH_S_L9CI+"</td><td>"+AE_TH_S_L9CI+"</td><td>"+SA_TH_S_L9CI+"</td><td>"+EG_TH_S_L9CI+"</td><td>"+S_L9CI_TH+"</td></tr>"));
	
}
if(!S_T13I_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TH_S_T13I+"</td><td>"+AE_TH_S_T13I+"</td><td>"+SA_TH_S_T13I+"</td><td>"+EG_TH_S_T13I+"</td><td>"+S_T13I_TH+"</td></tr>"));
	
}
if(!S_T20I_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TH_S_T20I+"</td><td>"+AE_TH_S_T20I+"</td><td>"+SA_TH_S_T20I+"</td><td>"+EG_TH_S_T20I+"</td><td>"+S_T20I_TH+"</td></tr>"));
	
}
if(!SALAM_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TH_SALAM+"</td><td>"+AE_TH_SALAM+"</td><td>"+SA_TH_SALAM+"</td><td>"+EG_TH_SALAM+"</td><td>"+SALAM_TH+"</td></tr>"));
	
}
if(!S_Jet_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TH_S_Jet+"</td><td>"+AE_TH_S_Jet+"</td><td>"+SA_TH_S_Jet+"</td><td>"+EG_TH_S_Jet+"</td><td>"+S_Jet_TH+"</td></tr>"));
	
}
if(!U_3R1G_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TH_U_3R1G+"</td><td>"+AE_TH_U_3R1G+"</td><td>"+SA_TH_U_3R1G+"</td><td>"+EG_TH_U_3R1G+"</td><td>"+U_3R1G_TH+"</td></tr>"));
	
}
if(!U_570E_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TH_U_570E+"</td><td>"+AE_TH_U_570E+"</td><td>"+SA_TH_U_570E+"</td><td>"+EG_TH_U_570E+"</td><td>"+U_570E_TH+"</td></tr>"));
	
}
if(!U_5N61_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TH_U_5N61+"</td><td>"+AE_TH_U_5N61+"</td><td>"+SA_TH_U_5N61+"</td><td>"+EG_TH_U_5N61+"</td><td>"+U_5N61_TH+"</td></tr>"));
	
}
if(!U_6E_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TH_U_6E+"</td><td>"+AE_TH_U_6E+"</td><td>"+SA_TH_U_6E+"</td><td>"+EG_TH_U_6E+"</td><td>"+U_6E_TH+"</td></tr>"));
	
}
if(!U_7FK5_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TH_U_7FK5+"</td><td>"+AE_TH_U_7FK5+"</td><td>"+SA_TH_U_7FK5+"</td><td>"+EG_TH_U_7FK5+"</td><td>"+U_7FK5_TH+"</td></tr>"));
	
}
if(!U_7JY2_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TH_U_7JY2+"</td><td>"+AE_TH_U_7JY2+"</td><td>"+SA_TH_U_7JY2+"</td><td>"+EG_TH_U_7JY2+"</td><td>"+U_7JY2_TH+"</td></tr>"));
	
}
if(!U_802N_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TH_U_802N+"</td><td>"+AE_TH_U_802N+"</td><td>"+SA_TH_U_802N+"</td><td>"+EG_TH_U_802N+"</td><td>"+U_802N_TH+"</td></tr>"));
	
}
if(!U_802R_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TH_U_802R+"</td><td>"+AE_TH_U_802R+"</td><td>"+SA_TH_U_802R+"</td><td>"+EG_TH_U_802R+"</td><td>"+U_802R_TH+"</td></tr>"));
	
}
if(!U_8SQ7_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TH_U_8SQ7+"</td><td>"+AE_TH_U_8SQ7+"</td><td>"+SA_TH_U_8SQ7+"</td><td>"+EG_TH_U_8SQ7+"</td><td>"+U_8SQ7_TH+"</td></tr>"));
	
}
if(!WATANIYA_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TH_WATANIYA+"</td><td>"+AE_TH_WATANIYA+"</td><td>"+SA_TH_WATANIYA+"</td><td>"+EG_TH_WATANIYA+"</td><td>"+WATANIYA_TH+"</td></tr>"));
	
}
if(!A_AR_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TH_A_AR+"</td><td>"+AE_TH_A_AR+"</td><td>"+SA_TH_A_AR+"</td><td>"+EG_TH_A_AR+"</td><td>"+A_AR_TH+"</td></tr>"));
	
}
if(!A_AR_E_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TH_A_AR_E+"</td><td>"+AE_TH_A_AR_E+"</td><td>"+SA_TH_A_AR_E+"</td><td>"+EG_TH_A_AR_E+"</td><td>"+A_AR_E_TH+"</td></tr>"));
	
}
if(!A_AR_M_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TH_A_AR_M+"</td><td>"+AE_TH_A_AR_M+"</td><td>"+SA_TH_A_AR_M+"</td><td>"+EG_TH_A_AR_M+"</td><td>"+A_AR_M_TH+"</td></tr>"));
	
} 
if(!A_I_E_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TH_A_I_E+"</td><td>"+AE_TH_A_I_E+"</td><td>"+SA_TH_A_I_E+"</td><td>"+EG_TH_A_I_E+"</td><td>"+A_I_E_TH+"</td></tr>"));
	
} 
if(!FlyDubai_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TH_FlyDubai+"</td><td>"+AE_TH_FlyDubai+"</td><td>"+SA_TH_FlyDubai+"</td><td>"+EG_TH_FlyDubai+"</td><td>"+FlyDubai_TH+"</td></tr>"));
	
} 
if(!Flynas_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TH_Flynas+"</td><td>"+AE_TH_Flynas+"</td><td>"+SA_TH_Flynas+"</td><td>"+EG_TH_Flynas+"</td><td>"+Flynas_TH+"</td></tr>"));

} 
if(!Flyadeal_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>FlyaDeal</td> <td>"+Com_TH_Flyadeal+"</td><td>"+AE_TH_Flyadeal+"</td><td>"+SA_TH_Flyadeal+"</td><td>"+EG_TH_Flyadeal+"</td><td>"+Flyadeal_TH+"</td></tr>"));

} 
if(!Gal_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GAL-7Q0W</td> <td>"+Com_TH_GAL7Q+"</td><td>"+AE_TH_GAL7Q+"</td><td>"+SA_TH_GAL7Q+"</td><td>"+EG_TH_GAL7Q+"</td><td>"+Gal_TH+"</td></tr>"));

} 
if(!S_1LNJ_T_H.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>S_1LNJ</td> <td>"+Com_TH_S_1LNJ+"</td><td>"+AE_TH_S_1LNJ+"</td><td>"+SA_TH_S_1LNJ+"</td><td>"+EG_TH_S_1LNJ+"</td><td>"+S_1LNJ_TH+"</td></tr>"));

} 



/*email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=44 >SUPPLIERS TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TS_G_570E+"</td><td>"+AE_TS_G_570E+"</td><td>"+SA_TS_G_570E+"</td><td>"+EG_TS_G_570E+"</td><td>"+G_570E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TS_G_5N61+"</td><td>"+AE_TS_G_5N61+"</td><td>"+SA_TS_G_5N61+"</td><td>"+EG_TS_G_5N61+"</td><td>"+G_5N61_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TS_G_7FK5+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+G_7FK5_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TS_G_7JY2+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+G_7JY2_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TS_G_7X7W+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+G_7X7W_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TS_G_802N+"</td><td>"+AE_TS_G_802N+"</td><td>"+SA_TS_G_802N+"</td><td>"+EG_TS_G_802N+"</td><td>"+G_802N_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TS_G_802R+"</td><td>"+AE_TS_G_802R+"</td><td>"+SA_TS_G_802R+"</td><td>"+EG_TS_G_802R+"</td><td>"+G_802R_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TS_G_8SQ7+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+G_8SQ7_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TS_JAZEERA+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+JAZEERA_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TS_KIWI+"</td><td>"+AE_TS_KIWI+"</td><td>"+SA_TS_KIWI+"</td><td>"+EG_TS_KIWI+"</td><td>"+KIWI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TS_M_u+"</td><td>"+AE_TS_M_u+"</td><td>"+SA_TS_M_u+"</td><td>"+EG_TS_M_u+"</td><td>"+Manual_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TS_My_Fly+"</td><td>"+AE_TS_My_Fly+"</td><td>"+SA_TS_My_Fly+"</td><td>"+EG_TS_My_Fly+"</td><td>"+My_Fly_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TS_NESMA+"</td><td>"+AE_TS_NESMA+"</td><td>"+SA_TS_NESMA+"</td><td>"+EG_TS_NESMA+"</td><td>"+NESMA_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TS_PEGASUS+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+PEGASUS_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TS_S_9JFH+"</td><td>"+AE_TS_S_9JFH+"</td><td>"+SA_TS_S_9JFH+"</td><td>"+EG_TS_S_9JFH+"</td><td>"+S_9JFH_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TS_S_ID2I+"</td><td>"+AE_TS_S_ID2I+"</td><td>"+SA_TS_S_ID2I+"</td><td>"+EG_TS_S_ID2I+"</td><td>"+S_ID2I_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TS_S_L8YI+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+S_L8YI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TS_S_L9AI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+S_L9AI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TS_S_L9CI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+S_L9CI_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TS_S_T13I+"</td><td>"+AE_TS_S_T13I+"</td><td>"+SA_TS_S_T13I+"</td><td>"+EG_TS_S_T13I+"</td><td>"+S_T13I_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TS_S_T20I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+S_T20I_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TS_SALAM+"</td><td>"+AE_TS_SALAM+"</td><td>"+SA_TS_SALAM+"</td><td>"+EG_TS_SALAM+"</td><td>"+SALAM_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TS_S_Jet+"</td><td>"+AE_TS_S_Jet+"</td><td>"+SA_TS_S_Jet+"</td><td>"+EG_TS_S_Jet+"</td><td>"+S_Jet_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TS_U_3R1G+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+U_3R1G_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TS_U_570E+"</td><td>"+AE_TS_U_570E+"</td><td>"+SA_TS_U_570E+"</td><td>"+EG_TS_U_570E+"</td><td>"+U_570E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TS_U_5N61+"</td><td>"+AE_TS_U_5N61+"</td><td>"+SA_TS_U_5N61+"</td><td>"+EG_TS_U_5N61+"</td><td>"+U_5N61_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TS_U_6E+"</td><td>"+AE_TS_U_6E+"</td><td>"+SA_TS_U_6E+"</td><td>"+EG_TS_U_6E+"</td><td>"+U_6E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TS_U_7FK5+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+U_7FK5_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TS_U_7JY2+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+U_7JY2_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TS_U_802N+"</td><td>"+AE_TS_U_802N+"</td><td>"+SA_TS_U_802N+"</td><td>"+EG_TS_U_802N+"</td><td>"+U_802N_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TS_U_802R+"</td><td>"+AE_TS_U_802R+"</td><td>"+SA_TS_U_802R+"</td><td>"+EG_TS_U_802R+"</td><td>"+U_802R_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TS_U_8SQ7+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+U_8SQ7_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TS_WATANIYA+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+WATANIYA_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TS_A_AR+"</td><td>"+AE_TS_A_AR+"</td><td>"+SA_TS_A_AR+"</td><td>"+EG_TS_A_AR+"</td><td>"+A_AR_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+A_AR_E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TS_A_AR_M+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+A_AR_M_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TS_A_I_E+"</td><td>"+AE_TS_A_I_E+"</td><td>"+SA_TS_A_I_E+"</td><td>"+EG_TS_A_I_E+"</td><td>"+A_I_E_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TS_FlyDubai+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+FlyDubai_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TS_Flynas+"</td><td>"+AE_TS_Flynas+"</td><td>"+SA_TS_Flynas+"</td><td>"+EG_TS_Flynas+"</td><td>"+Flynas_T+"</td></tr>"));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <td>"+Com_TS_Supplier_Transaction_Total+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td><td>"+All_Sup_TransactionSuccess_total+"</td></tr>"));
//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>TOTAL</td> <td>"+Com_TS_Supplier_Transaction_Total+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td></tr>"));
//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <th colspan=5>"+All_Sup_TransactionSuccess_total+"</th></tr>"));	
*/




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
email.addCc("ravi.anthony@rehlat.com");
 


//email.addTo("naga.ch199@gmail.com");


System.out.println("3");
email.send();
System.out.println("END");



















}
public static void getValues() throws IOException, RowsExceededException, WriteException
{
	
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
        file = new File("C:/DailyXLReports/"+year);
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



public static void getValues_new() throws IOException, RowsExceededException, WriteException
{
	
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
        file = new File("C:/NewReports/"+year);
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
	int TCall=All_TransactionSuccess_total;
	String trs = Integer.toString(TCall);
	String rep = Integer.toString(All_Repricing_total);
	Label l = new Label(0, 1,trs );
	Label l1 = new Label(0, 2,rep );
	ws.addCell(l);
	ws.addCell(l1);
	
	
//---------------------------------------------com---------------------------------------------
		// Transaction Success
		int COM_B2C_TS = Com_TS_b2c;
		int COM_MOBAND_TS = Com_TS_MobAnd;
		int COM_MOBIOS_TS = Com_TS_MobIos;
		int COM_WEGO_TS = Com_TS_Wego;
		int COM_SKYSCAN_TS = Com_TS_skyscan;
		int COM_OTHERS_TS = Com_TS_Other_TrancationSuccessfull;

		// Conformation Pending
		int COM_B2C_CP = Com_CP_b2c;
		int COM_MOBAND_CP = Com_CP_MobAnd;
		int COM_MOBIOS_CP = Com_CP_MobIos;
		int COM_WEGO_CP = Com_CP_Wego;
		int COM_SKYSCAN_CP = Com_CP_skyscan;
		int COM_OTHERS_CP = Com_CP_Other_conformation_pending;

		// Transaction On Hold

		int COM_B2C_TH = Com_TH_b2c;
		int COM_MOBAND_TH = Com_TH_MobAnd;
		int COM_MOBIOS_TH = Com_TH_MobIos;
		int COM_WEGO_TH = Com_TH_Wego;
		int COM_SKYSCAN_TH = Com_TH_skyscan;
		int COM_OTHERS_TH = Com_Other_TH_Transactionhold_total;

		// Sold Out
		int COM_B2C_SD = Com_SD_b2c;
		int COM_MOBAND_SD = Com_SD_MobAnd;
		int COM_MOBIOS_SD = Com_SD_MobIos;
		int COM_WEGO_SD = Com_SD_Wego;
		int COM_SKYSCAN_SD = Com_SD_skyscan;
		int COM_OTHERS_SD = Com_SD_Other_SoldOutstotal;

		// Cancelled
		int COM_B2C_CN = Com_CN_b2c;
		int COM_MOBAND_CN = Com_CN_MobAnd;
		int COM_MOBIOS_CN = Com_CN_MobIos;
		int COM_WEGO_CN = Com_CN_Wego;
		int COM_SKYSCAN_CN = Com_CN_skyscan;
		int COM_OTHERS_CN = Com_CN_Other_CancelledTotal;

		// Repricing
		int COM_B2C_RP = Com_RP_b2c;
		int COM_MOBAND_RP = Com_RP_MobAnd;
		int COM_MOBIOS_RP = Com_RP_MobIos;
		int COM_WEGO_RP = Com_RP_Wego;
		int COM_SKYSCAN_RP = Com_RP_skyscan;
		int COM_OTHERS_RP = Com_RP_Other_Repricingtotal;

		String Com_b2c_t = Integer.toString(COM_B2C_TS);
		String COM_Mobapp_t = Integer.toString(COM_MOBAND_TS);
		String COM_Mobios_t = Integer.toString(COM_MOBIOS_TS);
		String COM_Wego_t = Integer.toString(COM_WEGO_TS);
		String COM_Skyscan_t = Integer.toString(COM_SKYSCAN_TS);
		String COM_Other_t = Integer.toString(COM_OTHERS_TS);

		String Com_b2c_cp = Integer.toString(COM_B2C_CP);
		String COM_Mobapp_cp = Integer.toString(COM_MOBAND_CP);
		String COM_Mobios_cp = Integer.toString(COM_MOBIOS_CP);
		String COM_Wego_cp = Integer.toString(COM_WEGO_CP);
		String COM_Skyscan_cp = Integer.toString(COM_SKYSCAN_CP);
		String COM_Other_cp = Integer.toString(COM_OTHERS_CP);

		String Com_b2c_th = Integer.toString(COM_B2C_TH);
		String COM_Mobapp_th = Integer.toString(COM_MOBAND_TH);
		String COM_Mobios_th = Integer.toString(COM_MOBIOS_TH);
		String COM_Wego_th = Integer.toString(COM_WEGO_TH);
		String COM_Skyscan_th = Integer.toString(COM_SKYSCAN_TH);
		String COM_Other_th = Integer.toString(COM_OTHERS_TH);

		String Com_b2c_s = Integer.toString(COM_B2C_SD);
		String COM_Mobapp_s = Integer.toString(COM_MOBAND_SD);
		String COM_Mobios_s = Integer.toString(COM_MOBIOS_SD);
		String COM_Wego_s = Integer.toString(COM_WEGO_SD);
		String COM_Skyscan_s = Integer.toString(COM_SKYSCAN_SD);
		String COM_Other_s = Integer.toString(COM_OTHERS_SD);

		String Com_b2c_cn = Integer.toString(COM_B2C_CN);
		String COM_Mobapp_cn = Integer.toString(COM_MOBAND_CN);
		String COM_Mobios_cn = Integer.toString(COM_MOBIOS_CN);
		String COM_Wego_cn = Integer.toString(COM_WEGO_CN);
		String COM_Skyscan_cn = Integer.toString(COM_SKYSCAN_CN);
		String COM_Other_cn = Integer.toString(COM_OTHERS_CN);

		String Com_b2c_rp = Integer.toString(COM_B2C_RP);
		String COM_Mobapp_rp = Integer.toString(COM_MOBAND_RP);
		String COM_Mobios_rp = Integer.toString(COM_MOBIOS_RP);
		String COM_Wego_rp = Integer.toString(COM_WEGO_RP);
		String COM_Skyscan_rp = Integer.toString(COM_SKYSCAN_RP);
		String COM_Other_rp = Integer.toString(COM_OTHERS_RP);
	
	//---------------------------------------------AE---------------------------------------------
		//Transaction Success
		int AE_B2C_TS=AE_TS_b2c;
		int AE_MOBAND_TS=AE_TS_MobAnd;
		int AE_MOBIOS_TS=AE_TS_MobIos;
		int AE_WEGO_TS=AE_TS_Wego;
		int AE_SKYSCAN_TS=AE_TS_skyscan;
		int AE_OTHERS_TS=AE_TS_Other_TrancationSuccessfull;
		
		//Conformation Pending
		int AE_B2C_CP=AE_CP_b2c;
		int AE_MOBAND_CP=AE_CP_MobAnd;
		int AE_MOBIOS_CP=AE_CP_MobIos;
		int AE_WEGO_CP=AE_CP_Wego;
		int AE_SKYSCAN_CP=AE_CP_skyscan;
		int AE_OTHERS_CP=AE_CP_Other_conformation_pending;
		
		//Transaction On Hold
		
		int AE_B2C_TH=AE_TH_b2c;
		int AE_MOBAND_TH=AE_TH_MobAnd;
		int AE_MOBIOS_TH=AE_TH_MobIos;
		int AE_WEGO_TH=AE_TH_Wego;
		int AE_SKYSCAN_TH=AE_TH_skyscan;
		int AE_OTHERS_TH=AE_TH_Other_TransactionholdTotal;
		
		//Sold Out
		int AE_B2C_SD=AE_SD_b2c;
		int AE_MOBAND_SD=AE_SD_MobAnd;
		int AE_MOBIOS_SD=AE_SD_MobIos;
		int AE_WEGO_SD=AE_SD_Wego;
		int AE_SKYSCAN_SD=AE_SD_skyscan;
		int AE_OTHERS_SD=AE_SD_Other_SoldOutstotal;
		
		//Cancelled
	    int AE_B2C_CN=AE_CN_b2c;
		int AE_MOBAND_CN=AE_CN_MobAnd;
		int AE_MOBIOS_CN=AE_CN_MobIos;
		int AE_WEGO_CN=AE_CN_Wego;
		int AE_SKYSCAN_CN=AE_CN_skyscan;
		int AE_OTHERS_CN=AE_CN_Other_CancelledTotal;
			
			//Repricing
		int AE_B2C_RP=AE_RP_b2c;
		int AE_MOBAND_RP=AE_RP_MobAnd;
		int AE_MOBIOS_RP=AE_RP_MobIos;
		int AE_WEGO_RP=AE_RP_Wego;
		int AE_SKYSCAN_RP=AE_RP_skyscan;
		int AE_OTHERS_RP=AE_RP_Other_Repricingtotal;
		
						
		String AE_b2c_t = Integer.toString(AE_B2C_TS);
		String AE_Mobapp_t = Integer.toString(AE_MOBAND_TS);
		String AE_Mobios_t= Integer.toString(AE_MOBIOS_TS);
		String AE_Wego_t = Integer.toString(AE_WEGO_TS);
		String AE_Skyscan_t = Integer.toString(AE_SKYSCAN_TS);
		String AE_Other_t = Integer.toString(AE_OTHERS_TS);
		
		
		
		String AE_b2c_cp = Integer.toString(AE_B2C_CP);
		String AE_Mobapp_cp = Integer.toString(AE_MOBAND_CP);
		String AE_Mobios_cp= Integer.toString(AE_MOBIOS_CP);
		String AE_Wego_cp = Integer.toString(AE_WEGO_CP);
		String AE_Skyscan_cp = Integer.toString(AE_SKYSCAN_CP);
		String AE_Other_cp = Integer.toString(AE_OTHERS_CP);
		
		String AE_b2c_th = Integer.toString(AE_B2C_TH);
		String AE_Mobapp_th = Integer.toString(AE_MOBAND_TH);
		String AE_Mobios_th= Integer.toString(AE_MOBIOS_TH);
		String AE_Wego_th = Integer.toString(AE_WEGO_TH);
		String AE_Skyscan_th = Integer.toString(AE_SKYSCAN_TH);
		String AE_Other_th = Integer.toString(AE_OTHERS_TH);
		
		String AE_b2c_s = Integer.toString(AE_B2C_SD);
		String AE_Mobapp_s = Integer.toString(AE_MOBAND_SD);
		String AE_Mobios_s= Integer.toString(AE_MOBIOS_SD);
		String AE_Wego_s = Integer.toString(AE_WEGO_SD);
		String AE_Skyscan_s = Integer.toString(AE_SKYSCAN_SD);
		String AE_Other_s = Integer.toString(AE_OTHERS_SD);
		
		String AE_b2c_cn = Integer.toString(AE_B2C_CN);
		String AE_Mobapp_cn = Integer.toString(AE_MOBAND_CN);
		String AE_Mobios_cn= Integer.toString(AE_MOBIOS_CN);
		String AE_Wego_cn = Integer.toString(AE_WEGO_CN);
		String AE_Skyscan_cn = Integer.toString(AE_SKYSCAN_CN);
		String AE_Other_cn = Integer.toString(AE_OTHERS_CN);
		
		String AE_b2c_rp = Integer.toString(AE_B2C_RP);
		String AE_Mobapp_rp = Integer.toString(AE_MOBAND_RP);
		String AE_Mobios_rp= Integer.toString(AE_MOBIOS_RP);
		String AE_Wego_rp = Integer.toString(AE_WEGO_RP);
		String AE_Skyscan_rp = Integer.toString(AE_SKYSCAN_RP);
		String AE_Other_rp = Integer.toString(AE_OTHERS_RP);
	
	
	
		//---------------------------------------------SA---------------------------------------------
				//Transaction Success
		int SA_B2C_TS=SA_TS_b2c;
		int SA_MOBAND_TS=SA_TS_MobAnd;
		int SA_MOBIOS_TS=SA_TS_MobIos;
		int SA_WEGO_TS=SA_TS_Wego;
		int SA_SKYSCAN_TS=SA_TS_skyscan;
		int SA_OTHERS_TS=SA_TS_Other_TrancationSuccessfull;
				
			//Conformation Pending
		int SA_B2C_CP=SA_CP_b2c;
		int SA_MOBAND_CP=SA_CP_MobAnd;
		int SA_MOBIOS_CP=SA_CP_MobIos;
		int SA_WEGO_CP=SA_CP_Wego;
		int SA_SKYSCAN_CP=SA_CP_skyscan;
		int SA_OTHERS_CP=SA_CP_Other_conformation_pending;
				
				//Transaction On Hold
				
		int SA_B2C_TH=SA_TH_b2c;
		int SA_MOBAND_TH=SA_TH_MobAnd;
		int SA_MOBIOS_TH=SA_TH_MobIos;
		int SA_WEGO_TH=SA_TH_Wego;
		int SA_SKYSCAN_TH=SA_TH_skyscan;
		int SA_OTHERS_TH=SA_TH_Other_TransactionholdTotal;
				
				//Sold Out
		int SA_B2C_SD=SA_SD_b2c;
		int SA_MOBAND_SD=SA_SD_MobAnd;
		int SA_MOBIOS_SD=SA_SD_MobIos;
		int SA_WEGO_SD=SA_SD_Wego;
		int SA_SKYSCAN_SD=SA_SD_skyscan;
		int SA_OTHERS_SD=SA_SD_Other_SoldOutstotal;
				
				//Cancelled
		int SA_B2C_CN=SA_CN_b2c;
		int SA_MOBAND_CN=SA_CN_MobAnd;
		int SA_MOBIOS_CN=SA_CN_MobIos;
		int SA_WEGO_CN=SA_CN_Wego;
		int SA_SKYSCAN_CN=SA_CN_skyscan;
		int SA_OTHERS_CN=SA_CN_Other_CancelledTotal;
					
					//Repricing
		int SA_B2C_RP=SA_RP_b2c;
		int SA_MOBAND_RP=SA_RP_MobAnd;
		int SA_MOBIOS_RP=SA_RP_MobIos;
		int SA_WEGO_RP=SA_RP_Wego;
		int SA_SKYSCAN_RP=SA_RP_skyscan;
		int SA_OTHERS_RP=SA_RP_Other_Repricingtotal;
				
					
				
				
		String SA_b2c_t = Integer.toString(SA_B2C_TS);
		String SA_Mobapp_t = Integer.toString(SA_MOBAND_TS);
		String SA_Mobios_t= Integer.toString(SA_MOBIOS_TS);
		String SA_Wego_t = Integer.toString(SA_WEGO_TS);
		String SA_Skyscan_t = Integer.toString(SA_SKYSCAN_TS);
		String SA_Other_t = Integer.toString(SA_OTHERS_TS);
				
				
		String SA_b2c_cp = Integer.toString(SA_B2C_CP);
		String SA_Mobapp_cp = Integer.toString(SA_MOBAND_CP);
		String SA_Mobios_cp= Integer.toString(SA_MOBIOS_CP);
		String SA_Wego_cp = Integer.toString(SA_WEGO_CP);
		String SA_Skyscan_cp = Integer.toString(SA_SKYSCAN_CP);
		String SA_Other_cp = Integer.toString(SA_OTHERS_CP);
				
		String SA_b2c_th = Integer.toString(SA_B2C_TH);
		String SA_Mobapp_th = Integer.toString(SA_MOBAND_TH);
		String SA_Mobios_th= Integer.toString(SA_MOBIOS_TH);
		String SA_Wego_th = Integer.toString(SA_WEGO_TH);
		String SA_Skyscan_th = Integer.toString(SA_SKYSCAN_TH);
		String SA_Other_th = Integer.toString(SA_OTHERS_TH);
				
		String SA_b2c_s = Integer.toString(SA_B2C_SD);
		String SA_Mobapp_s = Integer.toString(SA_MOBAND_SD);
		String SA_Mobios_s= Integer.toString(SA_MOBIOS_SD);
		String SA_Wego_s = Integer.toString(SA_WEGO_SD);
		String SA_Skyscan_s = Integer.toString(SA_SKYSCAN_SD);
		String SA_Other_s = Integer.toString(SA_OTHERS_SD);
				
		String SA_b2c_cn = Integer.toString(SA_B2C_CN);
		String SA_Mobapp_cn = Integer.toString(SA_MOBAND_CN);
		String SA_Mobios_cn= Integer.toString(SA_MOBIOS_CN);
		String SA_Wego_cn = Integer.toString(SA_WEGO_CN);
		String SA_Skyscan_cn = Integer.toString(SA_SKYSCAN_CN);
		String SA_Other_cn = Integer.toString(SA_OTHERS_CN);
				
		String SA_b2c_rp = Integer.toString(SA_B2C_RP);
		String SA_Mobapp_rp = Integer.toString(SA_MOBAND_RP);
		String SA_Mobios_rp= Integer.toString(SA_MOBIOS_RP);
		String SA_Wego_rp = Integer.toString(SA_WEGO_RP);
		String SA_Skyscan_rp = Integer.toString(SA_SKYSCAN_RP);
		String SA_Other_rp = Integer.toString(SA_OTHERS_RP);
			
			
				//---------------------------------------------EG---------------------------------------------
				//Transaction Success
		int EG_B2C_TS = EG_TS_b2c;
		int EG_MOBAND_TS = EG_TS_MobAnd;
		int EG_MOBIOS_TS = EG_TS_MobIos;
		int EG_WEGO_TS = EG_TS_Wego;
		int EG_SKYSCAN_TS = EG_TS_skyscan;
		int EG_OTHERS_TS = EG_TS_Other_TrancationSuccessfull;

		// Conformation Pending
		int EG_B2C_CP = EG_CP_b2c;
		int EG_MOBAND_CP = EG_CP_MobAnd;
		int EG_MOBIOS_CP = EG_CP_MobIos;
		int EG_WEGO_CP = EG_CP_Wego;
		int EG_SKYSCAN_CP = EG_CP_skyscan;
		int EG_OTHERS_CP = EG_CP_Other_conformation_pending;

		// TranEGction On Hold

		int EG_B2C_TH = EG_TH_b2c;
		int EG_MOBAND_TH = EG_TH_MobAnd;
		int EG_MOBIOS_TH = EG_TH_MobIos;
		int EG_WEGO_TH = EG_TH_Wego;
		int EG_SKYSCAN_TH = EG_TH_skyscan;
		int EG_OTHERS_TH = EG_TH_Other_TransactionHoldTotal;

		// Sold Out
		int EG_B2C_SD = EG_SD_b2c;
		int EG_MOBAND_SD = EG_SD_MobAnd;
		int EG_MOBIOS_SD = EG_SD_MobIos;
		int EG_WEGO_SD = EG_SD_Wego;
		int EG_SKYSCAN_SD = EG_SD_skyscan;
		int EG_OTHERS_SD = EG_SD_Other_SoldOutstotal;

		// Cancelled
		int EG_B2C_CN = EG_CN_b2c;
		int EG_MOBAND_CN = EG_CN_MobAnd;
		int EG_MOBIOS_CN = EG_CN_MobIos;
		int EG_WEGO_CN = EG_CN_Wego;
		int EG_SKYSCAN_CN = EG_CN_skyscan;
		int EG_OTHERS_CN = EG_CN_Other_CancelledTotal;

		// Repricing
		int EG_B2C_RP = EG_RP_b2c;
		int EG_MOBAND_RP = EG_RP_MobAnd;
		int EG_MOBIOS_RP = EG_RP_MobIos;
		int EG_WEGO_RP = EG_RP_Wego;
		int EG_SKYSCAN_RP = EG_RP_skyscan;
		int EG_OTHERS_RP = EG_RP_Other_Repricingtotal;

		String EG_b2c_t = Integer.toString(EG_B2C_TS);
		String EG_Mobapp_t = Integer.toString(EG_MOBAND_TS);
		String EG_Mobios_t = Integer.toString(EG_MOBIOS_TS);
		String EG_Wego_t = Integer.toString(EG_WEGO_TS);
		String EG_Skyscan_t = Integer.toString(EG_SKYSCAN_TS);
		String EG_Other_t = Integer.toString(EG_OTHERS_TS);


		String EG_b2c_cp = Integer.toString(EG_B2C_CP);
		String EG_Mobapp_cp = Integer.toString(EG_MOBAND_CP);
		String EG_Mobios_cp = Integer.toString(EG_MOBIOS_CP);
		String EG_Wego_cp = Integer.toString(EG_WEGO_CP);
		String EG_Skyscan_cp = Integer.toString(EG_SKYSCAN_CP);
		String EG_Other_cp = Integer.toString(EG_OTHERS_CP);

		String EG_b2c_th = Integer.toString(EG_B2C_TH);
		String EG_Mobapp_th = Integer.toString(EG_MOBAND_TH);
		String EG_Mobios_th = Integer.toString(EG_MOBIOS_TH);
		String EG_Wego_th = Integer.toString(EG_WEGO_TH);
		String EG_Skyscan_th = Integer.toString(EG_SKYSCAN_TH);
		String EG_Other_th = Integer.toString(EG_OTHERS_TH);

		String EG_b2c_s = Integer.toString(EG_B2C_SD);
		String EG_Mobapp_s = Integer.toString(EG_MOBAND_SD);
		String EG_Mobios_s = Integer.toString(EG_MOBIOS_SD);
		String EG_Wego_s = Integer.toString(EG_WEGO_SD);
		String EG_Skyscan_s = Integer.toString(EG_SKYSCAN_SD);
		String EG_Other_s = Integer.toString(EG_OTHERS_SD);

		String EG_b2c_cn = Integer.toString(EG_B2C_CN);
		String EG_Mobapp_cn = Integer.toString(EG_MOBAND_CN);
		String EG_Mobios_cn = Integer.toString(EG_MOBIOS_CN);
		String EG_Wego_cn = Integer.toString(EG_WEGO_CN);
		String EG_Skyscan_cn = Integer.toString(EG_SKYSCAN_CN);
		String EG_Other_cn = Integer.toString(EG_OTHERS_CN);

		String EG_b2c_rp = Integer.toString(EG_B2C_RP);
		String EG_Mobapp_rp = Integer.toString(EG_MOBAND_RP);
		String EG_Mobios_rp = Integer.toString(EG_MOBIOS_RP);
		String EG_Wego_rp = Integer.toString(EG_WEGO_RP);
		String EG_Skyscan_rp = Integer.toString(EG_SKYSCAN_RP);
		String EG_Other_rp = Integer.toString(EG_OTHERS_RP);
	
	
	
		
		
		//TS
		Label labests = new Label(0, 2,"Transaction Successful" );
		Label Com = new Label(0, 4,"COM" );
		Label AE = new Label(0, 5,"AE" );
		Label SA = new Label(0, 6,"SA" );
		Label EG = new Label(0, 7,"EG" );
		ws.addCell(labests);
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
		
		Label COM_b2c_T_s = new Label(1, 4,Com_b2c_t );
		Label COM_Mobapp_T_s = new Label(2, 4,COM_Mobapp_t );
		Label COM_Mobios_T_s = new Label(3, 4,COM_Mobios_t );
		Label COM_Wego_T_s = new Label(4, 4,COM_Wego_t );
		Label COM_Skyscan_T_s = new Label(5, 4,COM_Skyscan_t );
		Label COM_Other_T_s = new Label(6, 4,COM_Other_t );
		
		Label AE_b2c_T_s = new Label(1, 5,AE_b2c_t );
		Label AE_Mobapp_T_s = new Label(2, 5,AE_Mobapp_t );
		Label AE_Mobios_T_s = new Label(3, 5,AE_Mobios_t );
		Label AE_Wego_T_s = new Label(4, 5,AE_Wego_t );
		Label AE_Skyscan_T_s = new Label(5, 5,AE_Skyscan_t );
		Label AE_Other_T_s = new Label(6, 5,AE_Other_t );
		
		Label SA_b2c_T_s = new Label(1, 6,SA_b2c_t );
		Label SA_Mobapp_T_s = new Label(2, 6,SA_Mobapp_t );
		Label SA_Mobios_T_s = new Label(3, 6,SA_Mobios_t );
		Label SA_Wego_T_s = new Label(4, 6,SA_Wego_t );
		Label SA_Skyscan_T_s = new Label(5, 6,SA_Skyscan_t );
		Label SA_Other_T_s = new Label(6, 6,SA_Other_t );
		
		Label EG_b2c_T_s = new Label(1, 7,EG_b2c_t );
		Label EG_Mobapp_T_s = new Label(2, 7,EG_Mobapp_t );
		Label EG_Mobios_T_s = new Label(3, 7,EG_Mobios_t );
		Label EG_Wego_T_s = new Label(4, 7,EG_Wego_t );
		Label EG_Skyscan_T_s = new Label(5, 7,EG_Skyscan_t );
		Label EG_Other_T_s = new Label(6, 7,EG_Other_t );
		
		ws.addCell(COM_b2c_T_s);
		ws.addCell(COM_Mobapp_T_s);
		ws.addCell(COM_Mobios_T_s);
		ws.addCell(COM_Wego_T_s);
		ws.addCell(COM_Skyscan_T_s);
		ws.addCell(COM_Other_T_s);
		
		ws.addCell(AE_b2c_T_s);
		ws.addCell(AE_Mobapp_T_s);
		ws.addCell(AE_Mobios_T_s);
		ws.addCell(AE_Wego_T_s);
		ws.addCell(AE_Skyscan_T_s);
		ws.addCell(AE_Other_T_s);
		
		ws.addCell(SA_b2c_T_s);
		ws.addCell(SA_Mobapp_T_s);
		ws.addCell(SA_Mobios_T_s);
		ws.addCell(SA_Wego_T_s);
		ws.addCell(SA_Skyscan_T_s);
		ws.addCell(SA_Other_T_s);
		
		ws.addCell(EG_b2c_T_s);
		ws.addCell(EG_Mobapp_T_s);
		ws.addCell(EG_Mobios_T_s);
		ws.addCell(EG_Wego_T_s);
		ws.addCell(EG_Skyscan_T_s);
		ws.addCell(EG_Other_T_s);
		
		
		//CP
		
		Label labescp = new Label(0, 9,"Confirmation Pending" );
		Label Com_cp_x = new Label(0, 11,"COM" );
		Label AE_cp_x = new Label(0, 12,"AE" );
		Label SA_cp_x = new Label(0, 13,"SA" );
		Label EG_cp_x = new Label(0, 14,"EG" );
		ws.addCell(labescp);
		ws.addCell(Com_cp_x);
		ws.addCell(AE_cp_x);
		ws.addCell(SA_cp_x);
		ws.addCell(EG_cp_x);
		Label DOMAIN_cp = new Label(0, 10,"DOMAIN" );
		Label B2C_cp = new Label(1, 10,"B2C" );
		Label MOBAPP_cp = new Label(2, 10,"MOBAPP" );
		Label MOBIOS_cp = new Label(3, 10,"MOBIOS" );
		Label WEGO_cp = new Label(4, 10,"WEGO" );
		Label SKYSCN_cp = new Label(5, 10,"SKYSCN" );
		Label OTHERS_cp = new Label(6, 10,"OTHERS" );
		ws.addCell(DOMAIN_cp);
		ws.addCell(B2C_cp);
		ws.addCell(MOBAPP_cp);
		ws.addCell(MOBIOS_cp);
		ws.addCell(WEGO_cp);
		ws.addCell(SKYSCN_cp);
		ws.addCell(OTHERS_cp);
		
		Label COM_b2c_C_p = new Label(1, 11,Com_b2c_cp );
		Label COM_Mobapp_C_p = new Label(2, 11,COM_Mobapp_cp );
		Label COM_Mobios_C_p = new Label(3, 11,COM_Mobios_cp );
		Label COM_Wego_C_p = new Label(4, 11,COM_Wego_cp );
		Label COM_Skyscan_C_p = new Label(5, 11,COM_Skyscan_cp );
		Label COM_Other_C_p = new Label(6, 11,COM_Other_cp );
		
		Label AE_b2c_C_p = new Label(1, 12,AE_b2c_cp );
		Label AE_Mobapp_C_p = new Label(2, 12,AE_Mobapp_cp );
		Label AE_Mobios_C_p = new Label(3, 12,AE_Mobios_cp );
		Label AE_Wego_C_p = new Label(4, 12,AE_Wego_cp );
		Label AE_Skyscan_C_p = new Label(5, 12,AE_Skyscan_cp );
		Label AE_Other_C_p = new Label(6, 12,AE_Other_cp );
		
		Label SA_b2c_C_p = new Label(1, 13,SA_b2c_cp );
		Label SA_Mobapp_C_p = new Label(2, 13,SA_Mobapp_cp );
		Label SA_Mobios_C_p = new Label(3, 13,SA_Mobios_cp );
		Label SA_Wego_C_p = new Label(4, 13,SA_Wego_cp );
		Label SA_Skyscan_C_p = new Label(5, 13,SA_Skyscan_cp );
		Label SA_Other_C_p = new Label(6, 13,SA_Other_cp );
		
		Label EG_b2c_C_p = new Label(1, 14,EG_b2c_cp );
		Label EG_Mobapp_C_p = new Label(2, 14,EG_Mobapp_cp );
		Label EG_Mobios_C_p = new Label(3, 14,EG_Mobios_cp );
		Label EG_Wego_C_p = new Label(4, 14,EG_Wego_cp );
		Label EG_Skyscan_C_p = new Label(5, 14,EG_Skyscan_cp );
		Label EG_Other_C_p = new Label(6, 14,EG_Other_cp );
		
		ws.addCell(COM_b2c_C_p);
		ws.addCell(COM_Mobapp_C_p);
		ws.addCell(COM_Mobios_C_p);
		ws.addCell(COM_Wego_C_p);
		ws.addCell(COM_Skyscan_C_p);
		ws.addCell(COM_Other_C_p);
		
		ws.addCell(AE_b2c_C_p);
		ws.addCell(AE_Mobapp_C_p);
		ws.addCell(AE_Mobios_C_p);
		ws.addCell(AE_Wego_C_p);
		ws.addCell(AE_Skyscan_C_p);
		ws.addCell(AE_Other_C_p);
		
		ws.addCell(SA_b2c_C_p);
		ws.addCell(SA_Mobapp_C_p);
		ws.addCell(SA_Mobios_C_p);
		ws.addCell(SA_Wego_C_p);
		ws.addCell(SA_Skyscan_C_p);
		ws.addCell(SA_Other_C_p);
		
		ws.addCell(EG_b2c_C_p);
		ws.addCell(EG_Mobapp_C_p);
		ws.addCell(EG_Mobios_C_p);
		ws.addCell(EG_Wego_C_p);
		ws.addCell(EG_Skyscan_C_p);
		ws.addCell(EG_Other_C_p);
		
	//TH
		
		Label labesth = new Label(0, 16,"Transaction On Hold" );
		Label com_th_x = new Label(0, 18,"COM" );
		Label AE_th_x = new Label(0, 19,"AE" );
		Label SA_th_x = new Label(0, 20,"SA" );
		Label EG_th_x = new Label(0, 21,"EG" );
		ws.addCell(labesth);
		ws.addCell(com_th_x);
		ws.addCell(AE_th_x);
		ws.addCell(SA_th_x);
		ws.addCell(EG_th_x);
		Label DOMAIN_th = new Label(0, 17,"DOMAIN" );
		Label B2C_th = new Label(1, 17,"B2C" );
		Label MOBAPP_th = new Label(2, 17,"MOBAPP" );
		Label MOBIOS_th = new Label(3, 17,"MOBIOS" );
		Label WEGO_th = new Label(4, 17,"WEGO" );
		Label SKYSCN_th = new Label(5, 17,"SKYSCN" );
		Label OTHERS_th = new Label(6, 17,"OTHERS" );
		ws.addCell(DOMAIN_th);
		ws.addCell(B2C_th);
		ws.addCell(MOBAPP_th);
		ws.addCell(MOBIOS_th);
		ws.addCell(WEGO_th);
		ws.addCell(SKYSCN_th);
		ws.addCell(OTHERS_th);
		
		Label COM_b2c_T_h = new Label(1, 18,Com_b2c_th );
		Label COM_Mobapp_T_h = new Label(2, 18,COM_Mobapp_th );
		Label COM_Mobios_T_h = new Label(3,18,COM_Mobios_th );
		Label COM_Wego_T_h = new Label(4, 18,COM_Wego_th );
		Label COM_Skyscan_T_h = new Label(5, 18,COM_Skyscan_th );
		Label COM_Other_T_h = new Label(6, 18,COM_Other_th );
		
		Label AE_b2c_T_h = new Label(1, 19,AE_b2c_th );
		Label AE_Mobapp_T_h = new Label(2, 19,AE_Mobapp_th );
		Label AE_Mobios_T_h = new Label(3, 19,AE_Mobios_th );
		Label AE_Wego_T_h = new Label(4, 19,AE_Wego_th );
		Label AE_Skyscan_T_h = new Label(5, 19,AE_Skyscan_th );
		Label AE_Other_T_h = new Label(6, 19,AE_Other_th );
		
		Label SA_b2c_T_h = new Label(1, 20,SA_b2c_th );
		Label SA_Mobapp_T_h = new Label(2, 20,SA_Mobapp_th );
		Label SA_Mobios_T_h = new Label(3, 20,SA_Mobios_th );
		Label SA_Wego_T_h = new Label(4, 20,SA_Wego_th );
		Label SA_Skyscan_T_h = new Label(5, 20,SA_Skyscan_th );
		Label SA_Other_T_h = new Label(6, 20,SA_Other_th );
		
		Label EG_b2c_T_h = new Label(1, 21,EG_b2c_th );
		Label EG_Mobapp_T_h = new Label(2, 21,EG_Mobapp_th );
		Label EG_Mobios_T_h = new Label(3, 21,EG_Mobios_th );
		Label EG_Wego_T_h = new Label(4, 21,EG_Wego_th );
		Label EG_Skyscan_T_h = new Label(5, 21,EG_Skyscan_th );
		Label EG_Other_T_h = new Label(6, 21,EG_Other_th );
		
		ws.addCell(COM_b2c_T_h);
		ws.addCell(COM_Mobapp_T_h);
		ws.addCell(COM_Mobios_T_h);
		ws.addCell(COM_Wego_T_h);
		ws.addCell(COM_Skyscan_T_h);
		ws.addCell(COM_Other_T_h);
		
		ws.addCell(AE_b2c_T_h);
		ws.addCell(AE_Mobapp_T_h);
		ws.addCell(AE_Mobios_T_h);
		ws.addCell(AE_Wego_T_h);
		ws.addCell(AE_Skyscan_T_h);
		ws.addCell(AE_Other_T_h);
		
		ws.addCell(SA_b2c_T_h);
		ws.addCell(SA_Mobapp_T_h);
		ws.addCell(SA_Mobios_T_h);
		ws.addCell(SA_Wego_T_h);
		ws.addCell(SA_Skyscan_T_h);
		ws.addCell(SA_Other_T_h);
		
		ws.addCell(EG_b2c_T_h);
		ws.addCell(EG_Mobapp_T_h);
		ws.addCell(EG_Mobios_T_h);
		ws.addCell(EG_Wego_T_h);
		ws.addCell(EG_Skyscan_T_h);
		ws.addCell(EG_Other_T_h);
		
		
		//SD
		
		Label labessd = new Label(0, 23,"Sold Out" );
		Label com_sd_x = new Label(0, 25,"COM" );
		Label AE_sd_x = new Label(0, 26,"AE" );
		Label SA_sd_x = new Label(0, 27,"SA" );
		Label EG_sd_x = new Label(0, 28,"EG" );
		ws.addCell(labessd);
		ws.addCell(com_sd_x);
		ws.addCell(AE_sd_x);
		ws.addCell(SA_sd_x);
		ws.addCell(EG_sd_x);
		Label DOMAIN_sd = new Label(0, 24,"DOMAIN" );
		Label B2C_sd = new Label(1, 24,"B2C" );
		Label MOBAPP_sd = new Label(2, 24,"MOBAPP" );
		Label MOBIOS_sd = new Label(3, 24,"MOBIOS" );
		Label WEGO_sd = new Label(4, 24,"WEGO" );
		Label SKYSCN_sd = new Label(5,24,"SKYSCN" );
		Label OTHERS_sd = new Label(6, 24,"OTHERS" );
		ws.addCell(DOMAIN_sd);
		ws.addCell(B2C_sd);
		ws.addCell(MOBAPP_sd);
		ws.addCell(MOBIOS_sd);
		ws.addCell(WEGO_sd);
		ws.addCell(SKYSCN_sd);
		ws.addCell(OTHERS_sd);
		
		Label COM_b2c_S_d = new Label(1, 25,Com_b2c_s );
		Label COM_Mobapp_S_d = new Label(2, 25,COM_Mobapp_s );
		Label COM_Mobios_S_d = new Label(3, 25,COM_Mobios_s );
		Label COM_Wego_S_d = new Label(4, 25,COM_Wego_s );
		Label COM_Skyscan_S_d = new Label(5, 25,COM_Skyscan_s );
		Label COM_Other_S_d = new Label(6, 25,COM_Other_s );
		
		Label AE_b2c_S_d = new Label(1, 26,AE_b2c_s );
		Label AE_Mobapp_S_d = new Label(2, 26,AE_Mobapp_s );
		Label AE_Mobios_S_d = new Label(3, 26,AE_Mobios_s );
		Label AE_Wego_S_d = new Label(4, 26,AE_Wego_s );
		Label AE_Skyscan_S_d = new Label(5, 26,AE_Skyscan_s );
		Label AE_Other_S_d = new Label(6, 26,AE_Other_s );
		
		Label SA_b2c_S_d = new Label(1, 27,SA_b2c_s );
		Label SA_Mobapp_S_d = new Label(2, 27,SA_Mobapp_s );
		Label SA_Mobios_S_d = new Label(3, 27,SA_Mobios_s );
		Label SA_Wego_S_d = new Label(4, 27,SA_Wego_s );
		Label SA_Skyscan_S_d = new Label(5, 27,SA_Skyscan_s );
		Label SA_Other_S_d = new Label(6, 27,SA_Other_s );
		
		Label EG_b2c_S_d = new Label(1, 28,EG_b2c_s );
		Label EG_Mobapp_S_d = new Label(2, 28,EG_Mobapp_s );
		Label EG_Mobios_S_d = new Label(3, 28,EG_Mobios_s );
		Label EG_Wego_S_d = new Label(4, 28,EG_Wego_s );
		Label EG_Skyscan_S_d = new Label(5, 28,EG_Skyscan_s );
		Label EG_Other_S_d = new Label(6, 28,EG_Other_s );
		
		ws.addCell(COM_b2c_S_d);
		ws.addCell(COM_Mobapp_S_d);
		ws.addCell(COM_Mobios_S_d);
		ws.addCell(COM_Wego_S_d);
		ws.addCell(COM_Skyscan_S_d);
		ws.addCell(COM_Other_S_d);
		
		ws.addCell(AE_b2c_S_d);
		ws.addCell(AE_Mobapp_S_d);
		ws.addCell(AE_Mobios_S_d);
		ws.addCell(AE_Wego_S_d);
		ws.addCell(AE_Skyscan_S_d);
		ws.addCell(AE_Other_S_d);
		
		ws.addCell(SA_b2c_S_d);
		ws.addCell(SA_Mobapp_S_d);
		ws.addCell(SA_Mobios_S_d);
		ws.addCell(SA_Wego_S_d);
		ws.addCell(SA_Skyscan_S_d);
		ws.addCell(SA_Other_S_d);
		
		ws.addCell(EG_b2c_S_d);
		ws.addCell(EG_Mobapp_S_d);
		ws.addCell(EG_Mobios_S_d);
		ws.addCell(EG_Wego_S_d);
		ws.addCell(EG_Skyscan_S_d);
		ws.addCell(EG_Other_S_d);
		
		
		//CN
		
		Label labescn = new Label(0, 30,"Cancelled" );
		Label com_cn_x = new Label(0, 32,"COM" );
		Label AE_cn_x = new Label(0, 33,"AE" );
		Label SA_cn_x = new Label(0, 34,"SA" );
		Label EG_cn_x = new Label(0, 35,"EG" );
		ws.addCell(labescn);
		ws.addCell(com_cn_x);
		ws.addCell(AE_cn_x);
		ws.addCell(SA_cn_x);
		ws.addCell(EG_cn_x);
		Label DOMAIN_cn = new Label(0, 31,"DOMAIN" );
		Label B2C_cn = new Label(1, 31,"B2C" );
		Label MOBAPP_cn = new Label(2, 31,"MOBAPP" );
		Label MOBIOS_cn = new Label(3, 31,"MOBIOS" );
		Label WEGO_cn = new Label(4, 31,"WEGO" );
		Label SKYSCN_cn = new Label(5, 31,"SKYSCN" );
		Label OTHERS_cn = new Label(6, 31,"OTHERS" );
		ws.addCell(DOMAIN_cn);
		ws.addCell(B2C_cn);
		ws.addCell(MOBAPP_cn);
		ws.addCell(MOBIOS_cn);
		ws.addCell(WEGO_cn);
		ws.addCell(SKYSCN_cn);
		ws.addCell(OTHERS_cn);
		
		Label COM_b2c_C_n = new Label(1, 32,Com_b2c_cn );
		Label COM_Mobapp_C_n = new Label(2, 32,COM_Mobapp_cn );
		Label COM_Mobios_C_n = new Label(3, 32,COM_Mobios_cn );
		Label COM_Wego_C_n = new Label(4, 32,COM_Wego_cn );
		Label COM_Skyscan_C_n = new Label(5, 32,COM_Skyscan_cn );
		Label COM_Other_C_n = new Label(6, 32,COM_Other_cn );
		
		Label AE_b2c_C_n = new Label(1, 33,AE_b2c_cn );
		Label AE_Mobapp_C_n = new Label(2, 33,AE_Mobapp_cn );
		Label AE_Mobios_C_n = new Label(3, 33,AE_Mobios_cn );
		Label AE_Wego_C_n = new Label(4, 33,AE_Wego_cn );
		Label AE_Skyscan_C_n = new Label(5, 33,AE_Skyscan_cn );
		Label AE_Other_C_n = new Label(6, 33,AE_Other_cn );
		
		Label SA_b2c_C_n = new Label(1, 34,SA_b2c_cn );
		Label SA_Mobapp_C_n = new Label(2, 34,SA_Mobapp_cn );
		Label SA_Mobios_C_n = new Label(3, 34,SA_Mobios_cn );
		Label SA_Wego_C_n = new Label(4, 34,SA_Wego_cn );
		Label SA_Skyscan_C_n = new Label(5, 34,SA_Skyscan_cn );
		Label SA_Other_C_n = new Label(6, 34,SA_Other_cn );
		
		Label EG_b2c_C_n = new Label(1, 35,EG_b2c_cn );
		Label EG_Mobapp_C_n = new Label(2, 35,EG_Mobapp_cn );
		Label EG_Mobios_C_n = new Label(3, 35,EG_Mobios_cn );
		Label EG_Wego_C_n = new Label(4, 35,EG_Wego_cn );
		Label EG_Skyscan_C_n = new Label(5, 35,EG_Skyscan_cn );
		Label EG_Other_C_n = new Label(6, 35,EG_Other_cn );
		
		ws.addCell(COM_b2c_C_n);
		ws.addCell(COM_Mobapp_C_n);
		ws.addCell(COM_Mobios_C_n);
		ws.addCell(COM_Wego_C_n);
		ws.addCell(COM_Skyscan_C_n);
		ws.addCell(COM_Other_C_n);
		
		ws.addCell(AE_b2c_C_n);
		ws.addCell(AE_Mobapp_C_n);
		ws.addCell(AE_Mobios_C_n);
		ws.addCell(AE_Wego_C_n);
		ws.addCell(AE_Skyscan_C_n);
		ws.addCell(AE_Other_C_n);
		
		ws.addCell(SA_b2c_C_n);
		ws.addCell(SA_Mobapp_C_n);
		ws.addCell(SA_Mobios_C_n);
		ws.addCell(SA_Wego_C_n);
		ws.addCell(SA_Skyscan_C_n);
		ws.addCell(SA_Other_C_n);
		
		ws.addCell(EG_b2c_C_n);
		ws.addCell(EG_Mobapp_C_n);
		ws.addCell(EG_Mobios_C_n);
		ws.addCell(EG_Wego_C_n);
		ws.addCell(EG_Skyscan_C_n);
		ws.addCell(EG_Other_C_n);
		
		
		//RP
		
		Label labesrp = new Label(0, 37,"Repricing" );
		Label com_rp_x = new Label(0, 39,"COM" );
		Label AE_rp_x = new Label(0, 40,"AE" );
		Label SA_rp_x = new Label(0, 41,"SA" );
		Label EG_rp_x = new Label(0, 42,"EG" );
		ws.addCell(labesrp);
		ws.addCell(com_rp_x);
		ws.addCell(AE_rp_x);
		ws.addCell(SA_rp_x);
		ws.addCell(EG_rp_x);
		Label DOMAIN_rp = new Label(0, 38,"DOMAIN" );
		Label B2C_rp = new Label(1, 38,"B2C" );
		Label MOBAPP_rp = new Label(2, 38,"MOBAPP" );
		Label MOBIOS_rp = new Label(3, 38,"MOBIOS" );
		Label WEGO_rp = new Label(4, 38,"WEGO" );
		Label SKYSCN_rp = new Label(5, 38,"SKYSCN" );
		Label OTHERS_rp = new Label(6, 38,"OTHERS" );
		ws.addCell(DOMAIN_rp);
		ws.addCell(B2C_rp);
		ws.addCell(MOBAPP_rp);
		ws.addCell(MOBIOS_rp);
		ws.addCell(WEGO_rp);
		ws.addCell(SKYSCN_rp);
		ws.addCell(OTHERS_rp);
		
		Label COM_b2c_R_p = new Label(1, 39,Com_b2c_rp );
		Label COM_Mobapp_R_p = new Label(2,39,COM_Mobapp_rp );
		Label COM_Mobios_R_p = new Label(3, 39,COM_Mobios_rp );
		Label COM_Wego_R_p = new Label(4, 39,COM_Wego_rp );
		Label COM_Skyscan_R_p = new Label(5, 39,COM_Skyscan_rp );
		Label COM_Other_R_p = new Label(6,39,COM_Other_rp );
		
		Label AE_b2c_R_p = new Label(1, 40,AE_b2c_rp );
		Label AE_Mobapp_R_p = new Label(2, 40,AE_Mobapp_rp );
		Label AE_Mobios_R_p = new Label(3, 40,AE_Mobios_rp );
		Label AE_Wego_R_p = new Label(4, 40,AE_Wego_rp );
		Label AE_Skyscan_R_p = new Label(5, 40,AE_Skyscan_rp );
		Label AE_Other_R_p = new Label(6, 40,AE_Other_rp );
		
		Label SA_b2c_R_p = new Label(1, 41,SA_b2c_rp );
		Label SA_Mobapp_R_p = new Label(2, 41,SA_Mobapp_rp );
		Label SA_Mobios_R_p = new Label(3, 41,SA_Mobios_rp );
		Label SA_Wego_R_p = new Label(4, 41,SA_Wego_rp );
		Label SA_Skyscan_R_p = new Label(5, 41,SA_Skyscan_rp );
		Label SA_Other_R_p = new Label(6, 41,SA_Other_rp );
		
		Label EG_b2c_R_p = new Label(1, 42,EG_b2c_rp );
		Label EG_Mobapp_R_p = new Label(2, 42,EG_Mobapp_rp );
		Label EG_Mobios_R_p = new Label(3, 42,EG_Mobios_rp );
		Label EG_Wego_R_p = new Label(4, 42,EG_Wego_rp );
		Label EG_Skyscan_R_p = new Label(5, 42,EG_Skyscan_rp );
		Label EG_Other_R_p = new Label(6, 42,EG_Other_rp );
		
		ws.addCell(COM_b2c_R_p);
		ws.addCell(COM_Mobapp_R_p);
		ws.addCell(COM_Mobios_R_p);
		ws.addCell(COM_Wego_R_p);
		ws.addCell(COM_Skyscan_R_p);
		ws.addCell(COM_Other_R_p);
		
		ws.addCell(AE_b2c_R_p);
		ws.addCell(AE_Mobapp_R_p);
		ws.addCell(AE_Mobios_R_p);
		ws.addCell(AE_Wego_R_p);
		ws.addCell(AE_Skyscan_R_p);
		ws.addCell(AE_Other_R_p);
		
		ws.addCell(SA_b2c_R_p);
		ws.addCell(SA_Mobapp_R_p);
		ws.addCell(SA_Mobios_R_p);
		ws.addCell(SA_Wego_R_p);
		ws.addCell(SA_Skyscan_R_p);
		ws.addCell(SA_Other_R_p);
		
		ws.addCell(EG_b2c_R_p);
		ws.addCell(EG_Mobapp_R_p);
		ws.addCell(EG_Mobios_R_p);
		ws.addCell(EG_Wego_R_p);
		ws.addCell(EG_Skyscan_R_p);
		ws.addCell(EG_Other_R_p);
		
	
	
	wwb.write();
	wwb.close();
	System.out.println("close");
}

}
