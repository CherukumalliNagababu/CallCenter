package AppModules;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

import SuppliersCode.SupplierAE;
import SuppliersCode.SupplierSA;
import SuppliersCode.SupplierEG;
import SuppliersCode.SupplierCom;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import utility.Utils;

public class DeleteSuplerMail extends Delete123{

	
	
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
			
			
			
			//CONFIRMATION PENDING
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
			
			
			//REPRICING
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
			
			
			//SOLDOUT
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
			
			
			//CANCELLED
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
			
			
			//TRANSACTION HOLD
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

email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 500 height = 200 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center ><tr align=LEFT bgcolor=#FF7C00 style=border-color:black;color:#ffffff><th STYLE=color:#ffffff colspan=10>SUPPLIERS</th></ <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th><th>SUPPLIERS </th> <th>COM</th> <th>AE</th><th>SA</th><th>EG</th><th>TOTAL</th><th>GRAND TOTAL</th></tr> "));
email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td rowspan="+TS_UNQ_VALUE+">SUPPLIERS TRANSACTION SUCCESSFUL</td>"));

//Transaction Success--suppliers

//Not Equal to Zero
if(!G_3R1G_AD.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td><td rowspan="+TS_UNQ_VALUE+">"+All_Sup_TransactionSuccess_total+"</td></tr>"));

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

//Equal TO Zero

/*if(G_3R1G_AD.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TS_G_3R1+"</td><td>"+AE_TS_G_3R1+"</td><td>"+SA_TS_G_3R1+"</td><td>"+EG_TS_G_3R1+"</td><td>"+G_3R1G_T+"</td></tr>"));

}
if(G_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_TS_G_570E+"</td><td>"+AE_TS_G_570E+"</td><td>"+SA_TS_G_570E+"</td><td>"+EG_TS_G_570E+"</td><td>"+G_570E_T+"</td></tr>"));
	
}
if(G_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-5N61</td> <td>"+Com_TS_G_5N61+"</td><td>"+AE_TS_G_5N61+"</td><td>"+SA_TS_G_5N61+"</td><td>"+EG_TS_G_5N61+"</td><td>"+G_5N61_T+"</td></tr>"));
	
}
if(G_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7FK5</td> <td>"+Com_TS_G_7FK5+"</td><td>"+AE_TS_G_7FK5+"</td><td>"+SA_TS_G_7FK5+"</td><td>"+EG_TS_G_7FK5+"</td><td>"+G_7FK5_T+"</td></tr>"));
	
}
if(G_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7JY2</td> <td>"+Com_TS_G_7JY2+"</td><td>"+AE_TS_G_7JY2+"</td><td>"+SA_TS_G_7JY2+"</td><td>"+EG_TS_G_7JY2+"</td><td>"+G_7JY2_T+"</td></tr>"));
	
}
if(G_7X7W_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-7X7W</td> <td>"+Com_TS_G_7X7W+"</td><td>"+AE_TS_G_7X7W+"</td><td>"+SA_TS_G_7X7W+"</td><td>"+EG_TS_G_7X7W+"</td><td>"+G_7X7W_T+"</td></tr>"));
	
}
if(G_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802N</td> <td>"+Com_TS_G_802N+"</td><td>"+AE_TS_G_802N+"</td><td>"+SA_TS_G_802N+"</td><td>"+EG_TS_G_802N+"</td><td>"+G_802N_T+"</td></tr>"));
	
}
if(G_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-802R</td> <td>"+Com_TS_G_802R+"</td><td>"+AE_TS_G_802R+"</td><td>"+SA_TS_G_802R+"</td><td>"+EG_TS_G_802R+"</td><td>"+G_802R_T+"</td></tr>"));
	
}
if(G_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-8SQ7</td> <td>"+Com_TS_G_8SQ7+"</td><td>"+AE_TS_G_8SQ7+"</td><td>"+SA_TS_G_8SQ7+"</td><td>"+EG_TS_G_8SQ7+"</td><td>"+G_8SQ7_T+"</td></tr>"));
	
}
if(JAZEERA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>JAZEERA</td> <td>"+Com_TS_JAZEERA+"</td><td>"+AE_TS_JAZEERA+"</td><td>"+SA_TS_JAZEERA+"</td><td>"+EG_TS_JAZEERA+"</td><td>"+JAZEERA_T+"</td></tr>"));
	
}
if(KIWI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>KIWI</td> <td>"+Com_TS_KIWI+"</td><td>"+AE_TS_KIWI+"</td><td>"+SA_TS_KIWI+"</td><td>"+EG_TS_KIWI+"</td><td>"+KIWI_T+"</td></tr>"));
	
}
if(Manual_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Manual</td> <td>"+Com_TS_M_u+"</td><td>"+AE_TS_M_u+"</td><td>"+SA_TS_M_u+"</td><td>"+EG_TS_M_u+"</td><td>"+Manual_T+"</td></tr>"));
	
}
if(My_Fly_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>MystiFly</td> <td>"+Com_TS_My_Fly+"</td><td>"+AE_TS_My_Fly+"</td><td>"+SA_TS_My_Fly+"</td><td>"+EG_TS_My_Fly+"</td><td>"+My_Fly_T+"</td></tr>"));
	
}
if(NESMA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>NESMA</td> <td>"+Com_TS_NESMA+"</td><td>"+AE_TS_NESMA+"</td><td>"+SA_TS_NESMA+"</td><td>"+EG_TS_NESMA+"</td><td>"+NESMA_T+"</td></tr>"));
	
}
if(PEGASUS_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>PEGASUS</td> <td>"+Com_TS_PEGASUS+"</td><td>"+AE_TS_PEGASUS+"</td><td>"+SA_TS_PEGASUS+"</td><td>"+EG_TS_PEGASUS+"</td><td>"+PEGASUS_T+"</td></tr>"));
	
}
if(S_9JFH_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_9JFH</td> <td>"+Com_TS_S_9JFH+"</td><td>"+AE_TS_S_9JFH+"</td><td>"+SA_TS_S_9JFH+"</td><td>"+EG_TS_S_9JFH+"</td><td>"+S_9JFH_T+"</td></tr>"));
	
}
if(S_ID2I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_ID2I</td> <td>"+Com_TS_S_ID2I+"</td><td>"+AE_TS_S_ID2I+"</td><td>"+SA_TS_S_ID2I+"</td><td>"+EG_TS_S_ID2I+"</td><td>"+S_ID2I_T+"</td></tr>"));
	
}
if(S_L8YI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L8YI</td> <td>"+Com_TS_S_L8YI+"</td><td>"+AE_TS_S_L8YI+"</td><td>"+SA_TS_S_L8YI+"</td><td>"+EG_TS_S_L8YI+"</td><td>"+S_L8YI_T+"</td></tr>"));
	
}
if(S_L9AI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9AI</td> <td>"+Com_TS_S_L9AI+"</td><td>"+AE_TS_S_L9AI+"</td><td>"+SA_TS_S_L9AI+"</td><td>"+EG_TS_S_L9AI+"</td><td>"+S_L9AI_T+"</td></tr>"));
	
}
if(S_L9CI_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_L9CI</td> <td>"+Com_TS_S_L9CI+"</td><td>"+AE_TS_S_L9CI+"</td><td>"+SA_TS_S_L9CI+"</td><td>"+EG_TS_S_L9CI+"</td><td>"+S_L9CI_T+"</td></tr>"));
	
}
if(S_T13I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T13I</td> <td>"+Com_TS_S_T13I+"</td><td>"+AE_TS_S_T13I+"</td><td>"+SA_TS_S_T13I+"</td><td>"+EG_TS_S_T13I+"</td><td>"+S_T13I_T+"</td></tr>"));
	
}
if(S_T20I_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>S_T20I</td> <td>"+Com_TS_S_T20I+"</td><td>"+AE_TS_S_T20I+"</td><td>"+SA_TS_S_T20I+"</td><td>"+EG_TS_S_T20I+"</td><td>"+S_T20I_T+"</td></tr>"));
	
}
if(SALAM_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SALAM</td> <td>"+Com_TS_SALAM+"</td><td>"+AE_TS_SALAM+"</td><td>"+SA_TS_SALAM+"</td><td>"+EG_TS_SALAM+"</td><td>"+SALAM_T+"</td></tr>"));
	
}
if(S_Jet_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SpiceJet</td> <td>"+Com_TS_S_Jet+"</td><td>"+AE_TS_S_Jet+"</td><td>"+SA_TS_S_Jet+"</td><td>"+EG_TS_S_Jet+"</td><td>"+S_Jet_T+"</td></tr>"));
	
}
if(U_3R1G_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_3R1G</td> <td>"+Com_TS_U_3R1G+"</td><td>"+AE_TS_U_3R1G+"</td><td>"+SA_TS_U_3R1G+"</td><td>"+EG_TS_U_3R1G+"</td><td>"+U_3R1G_T+"</td></tr>"));
	
}
if(U_570E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_570E</td> <td>"+Com_TS_U_570E+"</td><td>"+AE_TS_U_570E+"</td><td>"+SA_TS_U_570E+"</td><td>"+EG_TS_U_570E+"</td><td>"+U_570E_T+"</td></tr>"));
	
}
if(U_5N61_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_5N61</td> <td>"+Com_TS_U_5N61+"</td><td>"+AE_TS_U_5N61+"</td><td>"+SA_TS_U_5N61+"</td><td>"+EG_TS_U_5N61+"</td><td>"+U_5N61_T+"</td></tr>"));
	
}
if(U_6E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_6E</td> <td>"+Com_TS_U_6E+"</td><td>"+AE_TS_U_6E+"</td><td>"+SA_TS_U_6E+"</td><td>"+EG_TS_U_6E+"</td><td>"+U_6E_T+"</td></tr>"));
	
}
if(U_7FK5_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7FK5</td> <td>"+Com_TS_U_7FK5+"</td><td>"+AE_TS_U_7FK5+"</td><td>"+SA_TS_U_7FK5+"</td><td>"+EG_TS_U_7FK5+"</td><td>"+U_7FK5_T+"</td></tr>"));
	
}
if(U_7JY2_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_7JY2</td> <td>"+Com_TS_U_7JY2+"</td><td>"+AE_TS_U_7JY2+"</td><td>"+SA_TS_U_7JY2+"</td><td>"+EG_TS_U_7JY2+"</td><td>"+U_7JY2_T+"</td></tr>"));
	
}
if(U_802N_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802N</td> <td>"+Com_TS_U_802N+"</td><td>"+AE_TS_U_802N+"</td><td>"+SA_TS_U_802N+"</td><td>"+EG_TS_U_802N+"</td><td>"+U_802N_T+"</td></tr>"));
	
}
if(U_802R_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_802R</td> <td>"+Com_TS_U_802R+"</td><td>"+AE_TS_U_802R+"</td><td>"+SA_TS_U_802R+"</td><td>"+EG_TS_U_802R+"</td><td>"+U_802R_T+"</td></tr>"));
	
}
if(U_8SQ7_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>U_8SQ7</td> <td>"+Com_TS_U_8SQ7+"</td><td>"+AE_TS_U_8SQ7+"</td><td>"+SA_TS_U_8SQ7+"</td><td>"+EG_TS_U_8SQ7+"</td><td>"+U_8SQ7_T+"</td></tr>"));
	
}
if(WATANIYA_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>WATANIYA</td> <td>"+Com_TS_WATANIYA+"</td><td>"+AE_TS_WATANIYA+"</td><td>"+SA_TS_WATANIYA+"</td><td>"+EG_TS_WATANIYA+"</td><td>"+WATANIYA_T+"</td></tr>"));
	
}
if(A_AR_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabia</td> <td>"+Com_TS_A_AR+"</td><td>"+AE_TS_A_AR+"</td><td>"+SA_TS_A_AR+"</td><td>"+EG_TS_A_AR+"</td><td>"+A_AR_T+"</td></tr>"));
	
}
if(A_AR_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaEgypt</td> <td>"+Com_TS_A_AR_E+"</td><td>"+AE_TS_A_AR_E+"</td><td>"+SA_TS_A_AR_E+"</td><td>"+EG_TS_A_AR_E+"</td><td>"+A_AR_E_T+"</td></tr>"));
	
}
if(A_AR_M_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirArabiaMoroc</td> <td>"+Com_TS_A_AR_M+"</td><td>"+AE_TS_A_AR_M+"</td><td>"+SA_TS_A_AR_M+"</td><td>"+EG_TS_A_AR_M+"</td><td>"+A_AR_M_T+"</td></tr>"));
	
} 
if(A_I_E_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AirIndiaExpress</td> <td>"+Com_TS_A_I_E+"</td><td>"+AE_TS_A_I_E+"</td><td>"+SA_TS_A_I_E+"</td><td>"+EG_TS_A_I_E+"</td><td>"+A_I_E_T+"</td></tr>"));
	
} 
if(FlyDubai_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>FlyDubai</td> <td>"+Com_TS_FlyDubai+"</td><td>"+AE_TS_FlyDubai+"</td><td>"+SA_TS_FlyDubai+"</td><td>"+EG_TS_FlyDubai+"</td><td>"+FlyDubai_T+"</td></tr>"));
	
} 
if(Flynas_AD.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>Flynas</td> <td>"+Com_TS_Flynas+"</td><td>"+AE_TS_Flynas+"</td><td>"+SA_TS_Flynas+"</td><td>"+EG_TS_Flynas+"</td><td>"+Flynas_T+"</td></tr>"));

} 
*/

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center  rowspan="+CP_UNQ_VALUE+" >SUPPLIERS CONFIRMATION PENDING</td>"));

//Not Equal to Zero
//ConFirmation Pending
if(!G_3R1G_C_P.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_CP_G_3R1+"</td><td>"+AE_CP_G_3R1+"</td><td>"+SA_CP_G_3R1+"</td><td>"+EG_CP_G_3R1+"</td><td>"+G_3R1G_CP+"</td><td rowspan="+CP_UNQ_VALUE+">"+All_Sup_Confirmationpending_total+"</td></tr>"));

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

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td rowspan="+RP_UNQ_VALUE+" >SUPPLIERS REPRICING</td>"));

//Not Equal to Zero
//REPRICING
if(!G_3R1G_R_P.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_RP_G_3R1+"</td><td>"+AE_RP_G_3R1+"</td><td>"+SA_RP_G_3R1+"</td><td>"+EG_RP_G_3R1+"</td><td>"+G_3R1G_RP+"</td><td rowspan="+RP_UNQ_VALUE+">"+All_Sup_Repricing_total+"</td></tr>"));

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


email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; rowspan="+SD_UNQ_VALUE+" >SUPPLIERS SOLDOUT</td>"));

//Not Equal to Zero
//SOLDOUT
if(!G_3R1G_S_D.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_SD_G_3R1+"</td><td>"+AE_SD_G_3R1+"</td><td>"+SA_SD_G_3R1+"</td><td>"+EG_SD_G_3R1+"</td><td>"+G_3R1G_SD+"</td><td rowspan="+SD_UNQ_VALUE+">"+All_Sup_SoldOut_total+"</td></tr>"));

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

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td  rowspan="+CN_UNQ_VALUE+"  >SUPPLIERS CANCELLED</td>"));

//Not Equal to Zero
//CANCELLED
if(!G_3R1G_C_N.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_CN_G_3R1+"</td><td>"+AE_CN_G_3R1+"</td><td>"+SA_CN_G_3R1+"</td><td>"+EG_CN_G_3R1+"</td><td>"+G_3R1G_CN+"</td><td rowspan="+CN_UNQ_VALUE+">"+All_Sup_Cancelled_total+"</td></tr>"));

}
if(!G_570E_C_N.equals("0"))
{
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>G-570E</td> <td>"+Com_CN_G_570E+"</td><td>"+AE_CN_G_570E+"</td><td>"+SA_CN_G_570E+"</td><td>"+EG_CN_G_570E+"</td><td>"+G_570E_CN+"</td></tr>"));
	
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

email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td rowspan="+TH_UNQ_VALUE+"  >SUPPLIERS TRANSACTION HOLD</td>"));

//Not Equal to Zero
//TRANSACTION HOLD
if(!G_3R1G_T_H.equals("0")){
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>G-3R1G</td> <td>"+Com_TH_G_3R1+"</td><td>"+AE_TH_G_3R1+"</td><td>"+SA_TH_G_3R1+"</td><td>"+EG_TH_G_3R1+"</td><td>"+G_3R1G_TH+"</td><td  rowspan="+TH_UNQ_VALUE+">"+All_Sup_TransactionHold_total+"</td></tr>"));

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



//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>GRAND TOTAL</td> <td>"+Com_TS_Supplier_Transaction_Total+"</td><td>"+AE_TS_Supplier_Transaction_Total+"</td><td>"+SA_TS_Supplier_Transaction_Total+"</td><td>"+EG_TS_Supplier_Transaction_Total+"</td><td>"+All_Sup_TransactionSuccess_total+"</td></tr>"));




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












	


email.addTo("naga.ch199@gmail.com");


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
	wwb.write();
	wwb.close();
	System.out.println("close");
}
public static String timestamp() {
    return new SimpleDateFormat("dd_MMM_yyyy hh a").format(new Date());
}
public static Integer findMin(List<Integer> list) 
{ 

    // check list is empty or not 
    if (list == null || list.size() == 0) { 
        return Integer.MAX_VALUE; 
    } 

    // create a new list to avoid modification  
    // in the original list 
    List<Integer> sortedlist = new ArrayList<>(list); 

    // sort list in natural order 
    Collections.sort(sortedlist); 

    // first element in the sorted list 
    // would be minimum 
    return sortedlist.get(0); 
} 

// function return maximum value in an unsorted 
// list in Java using Collection 
public static Integer findMax(List<Integer> list) 
{ 

    // check list is empty or not 
    if (list == null || list.size() == 0) { 
        return Integer.MIN_VALUE; 
    } 

    // create a new list to avoid modification 
    // in the original list 
    List<Integer> sortedlist = new ArrayList<>(list); 

    // sort list in natural order 
    Collections.sort(sortedlist); 

    // last element in the sorted list would be maximum 
    return sortedlist.get(sortedlist.size() - 1); 
} 
public static Integer maxCount(Integer TS,Integer CP,Integer RP,Integer SD,Integer CN,Integer TH){
List<Integer> list = new ArrayList<>(); 

// add element in ArrayList object list 
list.add(TS); 
list.add(CP); 
list.add(RP); 
list.add(SD);
list.add(CN); 
list.add(TH);

// print min amd max value of ArrayList 
System.out.println("Min: " + findMin(list)); 
System.out.println("Max: " + findMax(list));
return findMax(list); 
}
}