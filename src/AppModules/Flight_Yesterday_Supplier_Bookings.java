package AppModules;

import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import SuppliersCode.SupplierAE;
import SuppliersCode.SupplierCom;
import SuppliersCode.SupplierEG;
import SuppliersCode.SupplierSA;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import pageobjects.Loginpage;

public class Flight_Yesterday_Supplier_Bookings extends SupplierEG {
	
	
	static int TS_UNQ_VALUE;
	static int CP_UNQ_VALUE;
	static int RP_UNQ_VALUE;
	static int SD_UNQ_VALUE;
	static int CN_UNQ_VALUE;
	static int TH_UNQ_VALUE;
	
	
	
	
	static String COMDomainNames;
	static String COMSoldOuts;
	static String COMRepricing;
	static String Isreprice_COMTrancationSuccess;
	static String Isreprice_COMConformationPending;
	static String Isreprice_COMTransactionHold;
	static String COMTrancationSuccess;
	static String COMConfirmationPending;
	static String COMTransactionHold;
	static String COMCancelled;
	

	static String SADomainNames;
	static String Isreprice_SATrancationSuccess;
	static String Isreprice_SAConformationPending;
	static String Isreprice_SATransactionHold;
	static String SARepricing;
	static String SASoldOuts;
	static String SATrancationSuccess;
	static String SAConfirmationPending;
	static String SATransactionHold;
	static String SACancelled;
	
	static String AEDomainNames;
	static String Isreprice_AETrancationSuccess;
	static String Isreprice_AEConformationPending;
	static String Isreprice_AETransactionHold;
	static String AERepricing;
	static String AESoldOuts;
	static String AETrancationSuccess;
	static String AEConfirmationPending;
	static String AETransactionHold;
	static String AECancelled;
	
	static String EGDomainNames;
	static String Isreprice_EGTrancationSuccess;
	static String Isreprice_EGConformationPending;
	static String Isreprice_EGTransactionHold;
	static String EGRepricing;
	static String EGSoldOuts;
	static String EGTrancationSuccess;
	static String EGConfirmationPending;
	static String EGTransactionHold;
	static String EGCancelled;
	
	
	// COM
	
	//Is Repricing

	static int Isreprice_Com_TS_Wego;
	static int Isreprice_Com_TS_b2c;
	static int Isreprice_Com_TS_MobIos;
	static int Isreprice_Com_TS_MobAnd;
	static int Isreprice_Com_TS_skyscan ;
	static int  Isreprice_Com_TS_Dhrehlat;
	static int Isreprice_Com_TS_Aviasa;
	static int Isreprice_Com_TS_Kayak;
	static int Isreprice_Com_TS_Dohop;
	static int Isreprice_Com_TS_Farecompare;
	static int Isreprice_Com_TS_Shoogloo;
	
	static int Isreprice_Com_CP_Wego;
	static int Isreprice_Com_CP_b2c;
	static int Isreprice_Com_CP_MobIos;
	static int Isreprice_Com_CP_MobAnd;
	static int Isreprice_Com_CP_skyscan ;
	static int  Isreprice_Com_CP_Dhrehlat;
	static int Isreprice_Com_CP_Aviasa;
	static int Isreprice_Com_CP_Kayak;
	static int Isreprice_Com_CP_Dohop;
	static int Isreprice_Com_CP_Farecompare;
	static int Isreprice_Com_CP_Shoogloo;
	
	static int Isreprice_Com_PT_Wego;
	static int Isreprice_Com_PT_b2c;
	static int Isreprice_Com_PT_MobIos;
	static int Isreprice_Com_PT_MobAnd;
	static int Isreprice_Com_PT_skyscan ;
	static int  Isreprice_Com_PT_Dhrehlat;
	static int Isreprice_Com_PT_Aviasa;
	static int Isreprice_Com_PT_Kayak;
	static int Isreprice_Com_PT_Dohop;
	static int Isreprice_Com_PT_Farecompare;
	static int Isreprice_Com_PT_Shoogloo;
	
	static int Isreprice_Com_TH_Wego;
	static int Isreprice_Com_TH_b2c;
	static int Isreprice_Com_TH_MobIos;
	static int Isreprice_Com_TH_MobAnd;
	static int Isreprice_Com_TH_skyscan ;
	static int  Isreprice_Com_TH_Dhrehlat;
	static int Isreprice_Com_TH_Aviasa;
	static int Isreprice_Com_TH_Kayak;
	static int Isreprice_Com_TH_Dohop;
	static int Isreprice_Com_TH_Farecompare;
	static int Isreprice_Com_TH_Shoogloo;
	
	
	
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
	
	// SA
	
	//Is Repricing

			static int Isreprice_SA_TS_Wego;
			static int Isreprice_SA_TS_b2c;
			static int Isreprice_SA_TS_MobIos;
			static int Isreprice_SA_TS_MobAnd;
			static int Isreprice_SA_TS_skyscan ;
			static int  Isreprice_SA_TS_Dhrehlat;
			static int Isreprice_SA_TS_Aviasa;
			static int Isreprice_SA_TS_Kayak;
			static int Isreprice_SA_TS_Dohop;
			static int Isreprice_SA_TS_Farecompare;
			static int Isreprice_SA_TS_Shoogloo;
			
			static int Isreprice_SA_CP_Wego;
			static int Isreprice_SA_CP_b2c;
			static int Isreprice_SA_CP_MobIos;
			static int Isreprice_SA_CP_MobAnd;
			static int Isreprice_SA_CP_skyscan ;
			static int  Isreprice_SA_CP_Dhrehlat;
			static int Isreprice_SA_CP_Aviasa;
			static int Isreprice_SA_CP_Kayak;
			static int Isreprice_SA_CP_Dohop;
			static int Isreprice_SA_CP_Farecompare;
			static int Isreprice_SA_CP_Shoogloo;
			
			static int Isreprice_SA_PT_Wego;
			static int Isreprice_SA_PT_b2c;
			static int Isreprice_SA_PT_MobIos;
			static int Isreprice_SA_PT_MobAnd;
			static int Isreprice_SA_PT_skyscan ;
			static int  Isreprice_SA_PT_Dhrehlat;
			static int Isreprice_SA_PT_Aviasa;
			static int Isreprice_SA_PT_Kayak;
			static int Isreprice_SA_PT_Dohop;
			static int Isreprice_SA_PT_Farecompare;
			static int Isreprice_SA_PT_Shoogloo;
			
			static int Isreprice_SA_TH_Wego;
			static int Isreprice_SA_TH_b2c;
			static int Isreprice_SA_TH_MobIos;
			static int Isreprice_SA_TH_MobAnd;
			static int Isreprice_SA_TH_skyscan ;
			static int  Isreprice_SA_TH_Dhrehlat;
			static int Isreprice_SA_TH_Aviasa;
			static int Isreprice_SA_TH_Kayak;
			static int Isreprice_SA_TH_Dohop;
			static int Isreprice_SA_TH_Farecompare;
			static int Isreprice_SA_TH_Shoogloo;
			
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
		
		
		// AE
		//Is Repricing
		static int Isreprice_AE_TS_Wego;
		static int Isreprice_AE_TS_b2c;
		static int Isreprice_AE_TS_MobIos;
		static int Isreprice_AE_TS_MobAnd;
		static int Isreprice_AE_TS_skyscan ;
		static int  Isreprice_AE_TS_Dhrehlat;
		static int Isreprice_AE_TS_Aviasa;
		static int Isreprice_AE_TS_Kayak;
		static int Isreprice_AE_TS_Dohop;
		static int Isreprice_AE_TS_Farecompare;
		static int Isreprice_AE_TS_Shoogloo;
		
		static int Isreprice_AE_CP_Wego;
		static int Isreprice_AE_CP_b2c;
		static int Isreprice_AE_CP_MobIos;
		static int Isreprice_AE_CP_MobAnd;
		static int Isreprice_AE_CP_skyscan ;
		static int  Isreprice_AE_CP_Dhrehlat;
		static int Isreprice_AE_CP_Aviasa;
		static int Isreprice_AE_CP_Kayak;
		static int Isreprice_AE_CP_Dohop;
		static int Isreprice_AE_CP_Farecompare;
		static int Isreprice_AE_CP_Shoogloo;
		
		static int Isreprice_AE_PT_Wego;
		static int Isreprice_AE_PT_b2c;
		static int Isreprice_AE_PT_MobIos;
		static int Isreprice_AE_PT_MobAnd;
		static int Isreprice_AE_PT_skyscan ;
		static int  Isreprice_AE_PT_Dhrehlat;
		static int Isreprice_AE_PT_Aviasa;
		static int Isreprice_AE_PT_Kayak;
		static int Isreprice_AE_PT_Dohop;
		static int Isreprice_AE_PT_Farecompare;
		static int Isreprice_AE_PT_Shoogloo;
		
		static int Isreprice_AE_TH_Wego;
		static int Isreprice_AE_TH_b2c;
		static int Isreprice_AE_TH_MobIos;
		static int Isreprice_AE_TH_MobAnd;
		static int Isreprice_AE_TH_skyscan ;
		static int  Isreprice_AE_TH_Dhrehlat;
		static int Isreprice_AE_TH_Aviasa;
		static int Isreprice_AE_TH_Kayak;
		static int Isreprice_AE_TH_Dohop;
		static int Isreprice_AE_TH_Farecompare;
		static int Isreprice_AE_TH_Shoogloo;
		
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
		
		// EG
		//Is Repricing

		static int Isreprice_EG_TS_Wego;
		static int Isreprice_EG_TS_b2c;
		static int Isreprice_EG_TS_MobIos;
		static int Isreprice_EG_TS_MobAnd;
		static int Isreprice_EG_TS_skyscan ;
		static int  Isreprice_EG_TS_Dhrehlat;
		static int Isreprice_EG_TS_Aviasa;
		static int Isreprice_EG_TS_Kayak;
		static int Isreprice_EG_TS_Dohop;
		static int Isreprice_EG_TS_Farecompare;
		static int Isreprice_EG_TS_Shoogloo;
		
		static int Isreprice_EG_CP_Wego;
		static int Isreprice_EG_CP_b2c;
		static int Isreprice_EG_CP_MobIos;
		static int Isreprice_EG_CP_MobAnd;
		static int Isreprice_EG_CP_skyscan ;
		static int  Isreprice_EG_CP_Dhrehlat;
		static int Isreprice_EG_CP_Aviasa;
		static int Isreprice_EG_CP_Kayak;
		static int Isreprice_EG_CP_Dohop;
		static int Isreprice_EG_CP_Farecompare;
		static int Isreprice_EG_CP_Shoogloo;
		
		static int Isreprice_EG_PT_Wego;
		static int Isreprice_EG_PT_b2c;
		static int Isreprice_EG_PT_MobIos;
		static int Isreprice_EG_PT_MobAnd;
		static int Isreprice_EG_PT_skyscan ;
		static int  Isreprice_EG_PT_Dhrehlat;
		static int Isreprice_EG_PT_Aviasa;
		static int Isreprice_EG_PT_Kayak;
		static int Isreprice_EG_PT_Dohop;
		static int Isreprice_EG_PT_Farecompare;
		static int Isreprice_EG_PT_Shoogloo;
		
		static int Isreprice_EG_TH_Wego;
		static int Isreprice_EG_TH_b2c;
		static int Isreprice_EG_TH_MobIos;
		static int Isreprice_EG_TH_MobAnd;
		static int Isreprice_EG_TH_skyscan ;
		static int  Isreprice_EG_TH_Dhrehlat;
		static int Isreprice_EG_TH_Aviasa;
		static int Isreprice_EG_TH_Kayak;
		static int Isreprice_EG_TH_Dohop;
		static int Isreprice_EG_TH_Farecompare;
		static int Isreprice_EG_TH_Shoogloo;
		
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
		
	 //
				
			   static int Isreprice_Com_TS_Transaction_Total;
			   static int Isreprice_Com_TS_Other_TrancationSuccessfull;
			   static int Isreprice_Com_CP_COnformationPending_Total;
			   static int Isreprice_Com_CP_Other_ConformationPending;
			   static int Isreprice_Com_PT_PartiallyTicketed_Total;
			   static int Isreprice_Com_PT_Other_PartiallyTicketed;
			   static int Isreprice_Com_Other_TH_Transactionhold_total;
			   static int Isreprice_Com_TH_Transactionhold_total;
			   
				static int Com_TS_Transaction_Total;
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
				
				
				
				static int Isreprice_SA_TS_Transaction_Total;
			    static int Isreprice_SA_TS_Other_TrancationSuccessfull;
			    static int Isreprice_SA_CP_COnformationPending_Total;
			    static int Isreprice_SA_CP_Other_ConformationPending;
				static int Isreprice_SA_PT_PartiallyTicketed_Total;
				static int Isreprice_SA_PT_Other_PartiallyTicketed;
				static int Isreprice_SA_Other_TH_Transactionhold_total;
				static int Isreprice_SA_TH_Transactionhold_total;
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
				
				
				static int Isreprice_AE_TS_Transaction_Total;
				static int Isreprice_AE_TS_Other_TrancationSuccessfull;
				static int Isreprice_AE_CP_COnformationPending_Total;
				static int Isreprice_AE_CP_Other_ConformationPending;
				static int Isreprice_AE_PT_PartiallyTicketed_Total;
				static int Isreprice_AE_PT_Other_PartiallyTicketed;
			    static int Isreprice_AE_Other_TH_Transactionhold_total;
			    static int Isreprice_AE_TH_Transactionhold_total;
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
				
				static int Isreprice_EG_TS_Transaction_Total;
				static int Isreprice_EG_TS_Other_TrancationSuccessfull;
				static int Isreprice_EG_CP_COnformationPending_Total;
				static int Isreprice_EG_CP_Other_ConformationPending;
				static int Isreprice_EG_PT_PartiallyTicketed_Total;
				static int Isreprice_EG_PT_Other_PartiallyTicketed;
			    static int Isreprice_EG_Other_TH_Transactionhold_total;
			    static int Isreprice_EG_TH_Transactionhold_total;
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
				
				
public static void IsRepriced_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
					
					
					//******************* Transaction Successfull*********************************************
			    	Select transaction1=new Select(Loginpage.BookingSatus());
			    	transaction1.selectByIndex(3);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					waitforElement(driver);
					
					String comTrancount=Loginpage.FlightResults_text().getText();
					System.out.println(comTrancount);
					
					
			    	String comtranstr = comTrancount.trim();
			    	String[] comtransplited = comtranstr.split("\\:");
			    	System.out.println("No of Results Count"+comtransplited[1]);
			    	Thread.sleep(1000);
			    	String tran="Transaction Successful";
			    	
			    	if("Flight Search Results : 0".equals(comTrancount))
			    	{
			    		Isreprice_COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
			    		System.out.println("TrancationSuccess total:::----0");
			    		
			    		Isreprice_Com_TS_Wego =0;
			    		Isreprice_Com_TS_b2c =0;
			    		Isreprice_Com_TS_MobIos =0;
			    		Isreprice_Com_TS_MobAnd =0;
			    		Isreprice_Com_TS_skyscan =0;
			 	         
			    		Isreprice_Com_TS_Dhrehlat =0;
			    		Isreprice_Com_TS_Aviasa =0;
			    		Isreprice_Com_TS_Kayak =0;
				         
			    		Isreprice_Com_TS_Dohop =0;
			    		Isreprice_Com_TS_Farecompare =0;
			    		Isreprice_Com_TS_Shoogloo =0;
			 	         
				         int TotalValue = Isreprice_Com_TS_Wego + Isreprice_Com_TS_b2c +Isreprice_Com_TS_MobIos +Isreprice_Com_TS_skyscan+Isreprice_Com_TS_MobAnd
				 		        + Isreprice_Com_TS_Dhrehlat+ Isreprice_Com_TS_Aviasa +Isreprice_Com_TS_Kayak + Isreprice_Com_TS_Dohop+ Isreprice_Com_TS_Farecompare +Isreprice_Com_TS_Shoogloo;
				 				  
				         Isreprice_Com_TS_Transaction_Total = TotalValue; 
				 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_Com_TS_Transaction_Total);
				 				
				 				int Other =Isreprice_Com_TS_Dhrehlat + Isreprice_Com_TS_Aviasa +Isreprice_Com_TS_Kayak+ Isreprice_Com_TS_Dohop+ Isreprice_Com_TS_Farecompare+ Isreprice_Com_TS_Shoogloo;
				 		 	    	
				 				Isreprice_Com_TS_Other_TrancationSuccessfull = Other; 
				 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_Com_TS_Other_TrancationSuccessfull);
				 	        
				 	        
				        
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
			    		  
			    		
			    		ArrayList<String>list=new ArrayList<>();
			    		
			    		 for (WebElement element1 : WE1)
			    		  {
			    			 list.add(element1.getText());
			    		  }
			    		  ArrayList<String> unique = removeDuplicates(list);
			    		  System.out.println("unique:"+unique.size());
			    	        for (String element : unique) {
			    	            System.out.println("element:"+element);
			    	            
			    	             
			    	            
			    	            
			    	            String number=element;
			    	           for(int j=0;j<unique.size();j++)
			    	           {	
			    	            switch(number){  
			    	            case "WEGO": 
			    	            	if(element.equals("WEGO")) 
			    		    	       {
			    		    	        
			    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

			    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
			    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
			    		    	
			    		    	
			    		    	Isreprice_Com_TS_Wego =Integer.parseInt(Com_TS_Wego1);
			    		    	
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Wego1 =String.format("%1s",0);
			    	    		    	
			    	    		    	
			    	            		Isreprice_Com_TS_Wego =Integer.parseInt(Com_TS_Wego1);
			    	            	}
			    		    	      
			    	            break; 
			    	            
			    	            case "B2C": 
			    	            	   
			    		    	       if(element.equals("B2C"))
			    		    	       {
			    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

			    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
			    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
			    		    	  
				    		    	
				    		    	
			    		    	  Isreprice_Com_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    		    	       }
			    		    	       else
				    	            	{
			    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
			    		    		    	  
			   		    		    	
			   		    		    	
			    		    	    	   Isreprice_Com_TS_b2c =Integer.parseInt(Com_TS_b2c1);
				    	            	}
			    		    	      
			    	            break;  
			    	            case "MOBIOS": 
			    	            	 if(element.equals("MOBIOS"))
			    		    	       {   
			    		    	       
			    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

			    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
			    		    	
			    		    	
			    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
				    		    
			    		    	 Isreprice_Com_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		 Isreprice_Com_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    	            	}
			    	            break; 
			    	            case "MOBAPP": 
			    	            	 if(element.equals("MOBAPP"))
			    		    	       {   
			    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

			    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
			    		    	 
			    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
					    		    
			    		    	 Isreprice_Com_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SKYSCN": 
			    	            	 if(element.equals("SKYSCN"))
			    		    	       {        
			    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

			    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
			    		    	
			    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
					    		    
			    		    	 Isreprice_Com_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    	            	}
			    		    	     
			    		    	       
			    	            break;  
			    	            case "DHREHLAT": 
			    	            	  if(element.equals("DHREHLAT"))
			    		    	       {   
			    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

			    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
			    		    	
			    		    	
			    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
				    		    
			    		    	Isreprice_Com_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
			    			    		    
			    	            			Isreprice_Com_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    	            	}
			    	            break; 
			    	            case "AVIASALES": 
			    	            	  if(element.equals("AVIASALES"))
			    		    	       {        
			    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

			    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
			    		    	
			    		    	
			    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
				    		    
			    		    	Isreprice_Com_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    		    	
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_Com_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    	            	}
			    		    	      
			    		    	     
			    	            break;
			    	            case "KAYAK": 
			    	            	  if(element.equals("KAYAK"))
			    		    	       {   
			    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

			    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
			    		    	
			    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
				    		    
			    		    	Isreprice_Com_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    		    	       }
			    		    	       
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_Com_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    	            	}
			    		    	       
			    	            break; 
			    	            case "DOHOP": 
			    	            	if(element.equals("DOHOP"))
			    		    	       {  
			    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

			    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
			    		    	 
			    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
					    		    
			    		    	 Isreprice_Com_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
						    		    
			    	            		Isreprice_Com_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    	            	}
			    		    	     
			    	            break;
			    	            case "FARECOMPARE": 
			    	            	
			    	            	  if(element.equals("FARECOMPARE"))
			    		    	       {  
			    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

			    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
			    		    	 
			    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
					    		    
			    		    	 Isreprice_Com_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  
			    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
			    				    		    
			    		    		    	 Isreprice_Com_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SHOOGLOO": 
			    	            	 if(element.equals("SHOOGLOO"))
			    		    	       {     
			    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

			    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
			    		    	
			    		    	 
			    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
					    		    
			    		    	 Isreprice_Com_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    		    	 
			    		    	
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    	            	}
			    	            break;
			    	            default:System.out.println("Not in 10, 20 or 30");  
			    	         
			    	            }
			    	           }
			    	        }
			    	 
			   
				        
				         int TotalValue = Isreprice_Com_TS_Wego + Isreprice_Com_TS_b2c +Isreprice_Com_TS_MobIos +Isreprice_Com_TS_skyscan+Isreprice_Com_TS_MobAnd
					 		        + Isreprice_Com_TS_Dhrehlat+ Isreprice_Com_TS_Aviasa +Isreprice_Com_TS_Kayak + Isreprice_Com_TS_Dohop+ Isreprice_Com_TS_Farecompare +Isreprice_Com_TS_Shoogloo;
					 				  
					         Isreprice_Com_TS_Transaction_Total = TotalValue; 
					 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_Com_TS_Transaction_Total);
					 				
					 				int Other =Isreprice_Com_TS_Dhrehlat + Isreprice_Com_TS_Aviasa +Isreprice_Com_TS_Kayak+ Isreprice_Com_TS_Dohop+ Isreprice_Com_TS_Farecompare+ Isreprice_Com_TS_Shoogloo;
					 		 	    	
					 				Isreprice_Com_TS_Other_TrancationSuccessfull = Other; 
					 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_Com_TS_Other_TrancationSuccessfull);
					 	        
			       
						//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
			    	
			    	
			    	
			    	
			    	}
			    	
			    	
			    	//******************* ConformationPending*********************************************
			    	Select Conpending=new Select(Loginpage.BookingSatus());
			    	Conpending.selectByIndex(4);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String IScomTrancount=Loginpage.FlightResults_text().getText();
					System.out.println(IScomTrancount);
					
					
			    	String Iscomtranstr = IScomTrancount.trim();
			    	String[] IScomtransplited = Iscomtranstr.split("\\:");
			    	System.out.println("No of Results Count"+IScomtransplited[1]);
			    	Thread.sleep(1000);
			    	String ConPen="Confirmation Pending";
			    	
			    	if("Flight Search Results : 0".equals(IScomTrancount))
			    	{
			    		Isreprice_COMConformationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConPen,0,0,0,0,0,0);
			    		System.out.println("TrancationSuccess total:::----0");
			    		
			    		Isreprice_Com_CP_Wego =0;
			    		Isreprice_Com_CP_b2c =0;
			    		Isreprice_Com_CP_MobIos =0;
			    		Isreprice_Com_CP_MobAnd =0;
			    		Isreprice_Com_CP_skyscan =0;
			 	         
			    		Isreprice_Com_CP_Dhrehlat =0;
			    		Isreprice_Com_CP_Aviasa =0;
			    		Isreprice_Com_CP_Kayak =0;
				         
			    		Isreprice_Com_CP_Dohop =0;
			    		Isreprice_Com_CP_Farecompare =0;
			    		Isreprice_Com_CP_Shoogloo =0;
			 	         
				         int TotalValue = Isreprice_Com_CP_Wego + Isreprice_Com_CP_b2c +Isreprice_Com_CP_MobIos +Isreprice_Com_CP_skyscan+Isreprice_Com_CP_MobAnd
				 		        + Isreprice_Com_CP_Dhrehlat+ Isreprice_Com_CP_Aviasa +Isreprice_Com_CP_Kayak + Isreprice_Com_CP_Dohop+ Isreprice_Com_CP_Farecompare +Isreprice_Com_CP_Shoogloo;
				 				  
				         Isreprice_Com_CP_COnformationPending_Total = TotalValue; 
				 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_Com_CP_COnformationPending_Total);
				 				
				 				int Other =Isreprice_Com_CP_Dhrehlat + Isreprice_Com_CP_Aviasa +Isreprice_Com_CP_Kayak+ Isreprice_Com_CP_Dohop+ Isreprice_Com_CP_Farecompare+ Isreprice_Com_CP_Shoogloo;
				 		 	    	
				 				Isreprice_Com_CP_Other_ConformationPending = Other; 
				 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_Com_CP_Other_ConformationPending);
				 	        
				 	        
				        
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
			    		
			    		ArrayList<String>list=new ArrayList<>();
			    		
			    		 for (WebElement element1 : WE1)
			    		  {
			    			 list.add(element1.getText());
			    		  }
			    		  ArrayList<String> unique = removeDuplicates(list);
			    		  System.out.println("unique:"+unique.size());
			    	        for (String element : unique) {
			    	            System.out.println("element:"+element);
			    	            
			    	             
			    	            
			    	            
			    	            String number=element;
			    	           for(int j=0;j<unique.size();j++)
			    	           {	
			    	            switch(number){  
			    	            case "WEGO": 
			    	            	if(element.equals("WEGO")) 
			    		    	       {
			    		    	        
			    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

			    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
			    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
			    		    	
			    		    	
			    		    	Isreprice_Com_CP_Wego =Integer.parseInt(Com_TS_Wego1);
			    		    	
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Wego1 =String.format("%1s",0);
			    	    		    	
			    	    		    	
			    	            		Isreprice_Com_CP_Wego =Integer.parseInt(Com_TS_Wego1);
			    	            	}
			    		    	      
			    	            break; 
			    	            
			    	            case "B2C": 
			    	            	   
			    		    	       if(element.equals("B2C"))
			    		    	       {
			    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

			    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
			    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
			    		    	  
				    		    	
				    		    	
			    		    	  Isreprice_Com_CP_b2c =Integer.parseInt(Com_TS_b2c1);
			    		    	       }
			    		    	       else
				    	            	{
			    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
			    		    		    	  
			   		    		    	
			   		    		    	
			    		    	    	   Isreprice_Com_CP_b2c =Integer.parseInt(Com_TS_b2c1);
				    	            	}
			    		    	      
			    	            break;  
			    	            case "MOBIOS": 
			    	            	 if(element.equals("MOBIOS"))
			    		    	       {   
			    		    	       
			    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

			    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
			    		    	
			    		    	
			    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
				    		    
			    		    	 Isreprice_Com_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		 Isreprice_Com_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    	            	}
			    	            break; 
			    	            case "MOBAPP": 
			    	            	 if(element.equals("MOBAPP"))
			    		    	       {   
			    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

			    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
			    		    	 
			    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
					    		    
			    		    	 Isreprice_Com_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SKYSCN": 
			    	            	 if(element.equals("SKYSCN"))
			    		    	       {        
			    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

			    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
			    		    	
			    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
					    		    
			    		    	 Isreprice_Com_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    	            	}
			    		    	     
			    		    	       
			    	            break;  
			    	            case "DHREHLAT": 
			    	            	  if(element.equals("DHREHLAT"))
			    		    	       {   
			    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

			    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
			    		    	
			    		    	
			    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
				    		    
			    		    	Isreprice_Com_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
			    			    		    
			    	            			Isreprice_Com_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    	            	}
			    	            break; 
			    	            case "AVIASALES": 
			    	            	  if(element.equals("AVIASALES"))
			    		    	       {        
			    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

			    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
			    		    	
			    		    	
			    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
				    		    
			    		    	Isreprice_Com_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    		    	
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_Com_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    	            	}
			    		    	      
			    		    	     
			    	            break;
			    	            case "KAYAK": 
			    	            	  if(element.equals("KAYAK"))
			    		    	       {   
			    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

			    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
			    		    	
			    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
				    		    
			    		    	Isreprice_Com_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    		    	       }
			    		    	       
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_Com_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    	            	}
			    		    	       
			    	            break; 
			    	            case "DOHOP": 
			    	            	if(element.equals("DOHOP"))
			    		    	       {  
			    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

			    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
			    		    	 
			    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
					    		    
			    		    	 Isreprice_Com_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
						    		    
			    	            		Isreprice_Com_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    	            	}
			    		    	     
			    	            break;
			    	            case "FARECOMPARE": 
			    	            	
			    	            	  if(element.equals("FARECOMPARE"))
			    		    	       {  
			    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

			    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
			    		    	 
			    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
					    		    
			    		    	 Isreprice_Com_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  
			    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
			    				    		    
			    		    		    	 Isreprice_Com_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SHOOGLOO": 
			    	            	 if(element.equals("SHOOGLOO"))
			    		    	       {     
			    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

			    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
			    		    	
			    		    	 
			    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
					    		    
			    		    	 Isreprice_Com_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    		    	 
			    		    	
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    	            	}
			    	            break;
			    	            default:System.out.println("Not in 10, 20 or 30");  
			    	         
			    	            }
			    	           }
			    	        }
			    	  
			    	  
			
				        
				         int TotalValue = Isreprice_Com_CP_Wego + Isreprice_Com_CP_b2c +Isreprice_Com_CP_MobIos +Isreprice_Com_CP_skyscan+Isreprice_Com_CP_MobAnd
					 		        + Isreprice_Com_CP_Dhrehlat+ Isreprice_Com_CP_Aviasa +Isreprice_Com_CP_Kayak + Isreprice_Com_CP_Dohop+ Isreprice_Com_CP_Farecompare +Isreprice_Com_CP_Shoogloo;
					 				  
					         Isreprice_Com_CP_COnformationPending_Total = TotalValue; 
					 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_Com_CP_COnformationPending_Total);
					 				
					 				int Other =Isreprice_Com_CP_Dhrehlat + Isreprice_Com_CP_Aviasa +Isreprice_Com_CP_Kayak+ Isreprice_Com_CP_Dohop+ Isreprice_Com_CP_Farecompare+ Isreprice_Com_CP_Shoogloo;
					 		 	    	
					 				Isreprice_Com_CP_Other_ConformationPending = Other; 
					 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_Com_CP_Other_ConformationPending);
					 	        
					 	        
						//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
			    	}
			    	
			    	//******************* Partially Ticketed*********************************************
			    	Select Partialy=new Select(Loginpage.BookingSatus());
			    	Partialy.selectByIndex(2);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String IScomParticket=Loginpage.FlightResults_text().getText();
					System.out.println(IScomParticket);
					
					
			    	String Iscompar = IScomParticket.trim();
			    	String[] IScompartiplited = Iscompar.split("\\:");
			    	System.out.println("No of Results Count"+IScompartiplited[1]);
			    	Thread.sleep(1000);
			    	String PartillyTicket="Partially Ticketed";
			    	
			    	if("Flight Search Results : 0".equals(IScomParticket))
			    	{
			    		Isreprice_COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",PartillyTicket,0,0,0,0,0,0);
			    		System.out.println("TrancationSuccess total:::----0");
			    		
			    		Isreprice_Com_PT_Wego =0;
			    		Isreprice_Com_PT_b2c =0;
			    		Isreprice_Com_PT_MobIos =0;
			    		Isreprice_Com_PT_MobAnd =0;
			    		Isreprice_Com_PT_skyscan =0;
			 	         
			    		Isreprice_Com_PT_Dhrehlat =0;
			    		Isreprice_Com_PT_Aviasa =0;
			    		Isreprice_Com_PT_Kayak =0;
				         
			    		Isreprice_Com_PT_Dohop =0;
			    		Isreprice_Com_PT_Farecompare =0;
			    		Isreprice_Com_PT_Shoogloo =0;
			 	         
				         int TotalValue = Isreprice_Com_PT_Wego + Isreprice_Com_PT_b2c +Isreprice_Com_PT_MobIos +Isreprice_Com_PT_skyscan+Isreprice_Com_PT_MobAnd
				 		        + Isreprice_Com_PT_Dhrehlat+ Isreprice_Com_PT_Aviasa +Isreprice_Com_PT_Kayak + Isreprice_Com_PT_Dohop+ Isreprice_Com_PT_Farecompare +Isreprice_Com_PT_Shoogloo;
				 				  
				         Isreprice_Com_PT_PartiallyTicketed_Total = TotalValue; 
				 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_Com_PT_PartiallyTicketed_Total);
				 				
				 				int Other =Isreprice_Com_PT_Dhrehlat + Isreprice_Com_PT_Aviasa +Isreprice_Com_PT_Kayak+ Isreprice_Com_PT_Dohop+ Isreprice_Com_PT_Farecompare+ Isreprice_Com_PT_Shoogloo;
				 		 	    	
				 				Isreprice_Com_PT_Other_PartiallyTicketed = Other; 
				 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_Com_PT_Other_PartiallyTicketed);
				 	        
				 	        
				        
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
			    		
			    		ArrayList<String>list=new ArrayList<>();
			    		
			    		 for (WebElement element1 : WE1)
			    		  {
			    			 list.add(element1.getText());
			    		  }
			    		  ArrayList<String> unique = removeDuplicates(list);
			    		  System.out.println("unique:"+unique.size());
			    	        for (String element : unique) {
			    	            System.out.println("element:"+element);
			    	            
			    	             
			    	            
			    	            
			    	            String number=element;
			    	           for(int j=0;j<unique.size();j++)
			    	           {	
			    	            switch(number){  
			    	            case "WEGO": 
			    	            	if(element.equals("WEGO")) 
			    		    	       {
			    		    	        
			    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

			    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
			    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
			    		    	
			    		    	
			    		    	Isreprice_Com_PT_Wego =Integer.parseInt(Com_TS_Wego1);
			    		    	
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Wego1 =String.format("%1s",0);
			    	    		    	
			    	    		    	
			    	            		Isreprice_Com_PT_Wego =Integer.parseInt(Com_TS_Wego1);
			    	            	}
			    		    	      
			    	            break; 
			    	            
			    	            case "B2C": 
			    	            	   
			    		    	       if(element.equals("B2C"))
			    		    	       {
			    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

			    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
			    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
			    		    	  
				    		    	
				    		    	
			    		    	  Isreprice_Com_PT_b2c =Integer.parseInt(Com_TS_b2c1);
			    		    	       }
			    		    	       else
				    	            	{
			    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
			    		    		    	  
			   		    		    	
			   		    		    	
			    		    	    	   Isreprice_Com_PT_b2c =Integer.parseInt(Com_TS_b2c1);
				    	            	}
			    		    	      
			    	            break;  
			    	            case "MOBIOS": 
			    	            	 if(element.equals("MOBIOS"))
			    		    	       {   
			    		    	       
			    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

			    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
			    		    	
			    		    	
			    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
				    		    
			    		    	 Isreprice_Com_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		 Isreprice_Com_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    	            	}
			    	            break; 
			    	            case "MOBAPP": 
			    	            	 if(element.equals("MOBAPP"))
			    		    	       {   
			    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

			    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
			    		    	 
			    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
					    		    
			    		    	 Isreprice_Com_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SKYSCN": 
			    	            	 if(element.equals("SKYSCN"))
			    		    	       {        
			    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

			    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
			    		    	
			    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
					    		    
			    		    	 Isreprice_Com_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    	            	}
			    		    	     
			    		    	       
			    	            break;  
			    	            case "DHREHLAT": 
			    	            	  if(element.equals("DHREHLAT"))
			    		    	       {   
			    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

			    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
			    		    	
			    		    	
			    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
				    		    
			    		    	Isreprice_Com_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
			    			    		    
			    	            			Isreprice_Com_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    	            	}
			    	            break; 
			    	            case "AVIASALES": 
			    	            	  if(element.equals("AVIASALES"))
			    		    	       {        
			    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

			    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
			    		    	
			    		    	
			    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
				    		    
			    		    	Isreprice_Com_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    		    	
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_Com_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    	            	}
			    		    	      
			    		    	     
			    	            break;
			    	            case "KAYAK": 
			    	            	  if(element.equals("KAYAK"))
			    		    	       {   
			    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

			    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
			    		    	
			    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
				    		    
			    		    	Isreprice_Com_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    		    	       }
			    		    	       
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_Com_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    	            	}
			    		    	       
			    	            break; 
			    	            case "DOHOP": 
			    	            	if(element.equals("DOHOP"))
			    		    	       {  
			    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

			    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
			    		    	 
			    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
					    		    
			    		    	 Isreprice_Com_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
						    		    
			    	            		Isreprice_Com_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    	            	}
			    		    	     
			    	            break;
			    	            case "FARECOMPARE": 
			    	            	
			    	            	  if(element.equals("FARECOMPARE"))
			    		    	       {  
			    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

			    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
			    		    	 
			    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
					    		    
			    		    	 Isreprice_Com_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  
			    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
			    				    		    
			    		    		    	 Isreprice_Com_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SHOOGLOO": 
			    	            	 if(element.equals("SHOOGLOO"))
			    		    	       {     
			    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

			    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
			    		    	
			    		    	 
			    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
					    		    
			    		    	 Isreprice_Com_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    		    	 
			    		    	
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_Com_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    	            	}
			    	            break;
			    	            default:System.out.println("Not in 10, 20 or 30");  
			    	         
			    	            }
			    	           }
			    	        }
			    	  
			    	  
			
				        
			    	        int TotalValue = Isreprice_Com_PT_Wego + Isreprice_Com_PT_b2c +Isreprice_Com_PT_MobIos +Isreprice_Com_PT_skyscan+Isreprice_Com_PT_MobAnd
					 		        + Isreprice_Com_PT_Dhrehlat+ Isreprice_Com_PT_Aviasa +Isreprice_Com_PT_Kayak + Isreprice_Com_PT_Dohop+ Isreprice_Com_PT_Farecompare +Isreprice_Com_PT_Shoogloo;
					 				  
					         Isreprice_Com_PT_PartiallyTicketed_Total = TotalValue; 
					 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_Com_PT_PartiallyTicketed_Total);
					 				
					 				int Other =Isreprice_Com_PT_Dhrehlat + Isreprice_Com_PT_Aviasa +Isreprice_Com_PT_Kayak+ Isreprice_Com_PT_Dohop+ Isreprice_Com_PT_Farecompare+ Isreprice_Com_PT_Shoogloo;
					 		 	    	
					 				Isreprice_Com_PT_Other_PartiallyTicketed = Other; 
					 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_Com_PT_Other_PartiallyTicketed);
					 	        
						//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
			    	}
			    	
			    	
			    	//*********************Transaction Hold*****************************
			    	Select transactionHold=new Select(Loginpage.BookingSatus());
			    	transactionHold.selectByIndex(1);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Flight Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		Isreprice_COMTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		Isreprice_Com_TH_Wego =0;
			    		Isreprice_Com_TH_b2c =0;
			    		Isreprice_Com_TH_MobIos =0;
			    		Isreprice_Com_TH_MobAnd =0;
			    		Isreprice_Com_TH_skyscan =0;
		  		         
			    		Isreprice_Com_TH_Dhrehlat =0;
			    		Isreprice_Com_TH_Aviasa =0;
			    		Isreprice_Com_TH_Kayak =0;
				         
			    		Isreprice_Com_TH_Dohop =0;
			    		Isreprice_Com_TH_Farecompare =0;
			    		Isreprice_Com_TH_Shoogloo =0;
			    		
				         int TotalValue =Isreprice_Com_TH_Wego + Isreprice_Com_TH_b2c +Isreprice_Com_TH_MobIos + Isreprice_Com_TH_MobAnd+ Isreprice_Com_TH_skyscan
				        +Isreprice_Com_TH_Dhrehlat +Isreprice_Com_TH_Aviasa +Isreprice_Com_TH_Kayak +Isreprice_Com_TH_Dohop+ Isreprice_Com_TH_Farecompare + Isreprice_Com_TH_Shoogloo ;
				         Isreprice_Com_TH_Transactionhold_total =  TotalValue; 
						 
						 int otherTotal=Isreprice_Com_TH_Dhrehlat+ Isreprice_Com_TH_Aviasa +Isreprice_Com_TH_Kayak + Isreprice_Com_TH_Dohop+ Isreprice_Com_TH_Farecompare +Isreprice_Com_TH_Shoogloo;
						 Isreprice_Com_Other_TH_Transactionhold_total =  otherTotal; 
					System.out.println("TransactionHold total:::----"+Isreprice_Com_Other_TH_Transactionhold_total);
						 
						 
						System.out.println("TransactionHold total:::----"+Isreprice_Com_TH_Transactionhold_total);
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	Isreprice_Com_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		Isreprice_Com_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  Isreprice_Com_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   Isreprice_Com_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 Isreprice_Com_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 Isreprice_Com_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 Isreprice_Com_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 Isreprice_Com_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 Isreprice_Com_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 Isreprice_Com_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	Isreprice_Com_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			Isreprice_Com_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	Isreprice_Com_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  Isreprice_Com_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	Isreprice_Com_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  Isreprice_Com_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 Isreprice_Com_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		Isreprice_Com_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 Isreprice_Com_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 Isreprice_Com_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 Isreprice_Com_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 Isreprice_Com_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
				    	   
			    	
			    	
			        
			        
			        
			   
				    	        int TotalValue =Isreprice_Com_TH_Wego + Isreprice_Com_TH_b2c +Isreprice_Com_TH_MobIos + Isreprice_Com_TH_MobAnd+ Isreprice_Com_TH_skyscan
								        +Isreprice_Com_TH_Dhrehlat +Isreprice_Com_TH_Aviasa +Isreprice_Com_TH_Kayak +Isreprice_Com_TH_Dohop+ Isreprice_Com_TH_Farecompare + Isreprice_Com_TH_Shoogloo ;
								         Isreprice_Com_TH_Transactionhold_total =  TotalValue; 
										 
										 int otherTotal=Isreprice_Com_TH_Dhrehlat+ Isreprice_Com_TH_Aviasa +Isreprice_Com_TH_Kayak + Isreprice_Com_TH_Dohop+ Isreprice_Com_TH_Farecompare +Isreprice_Com_TH_Shoogloo;
										 Isreprice_Com_Other_TH_Transactionhold_total =  otherTotal; 
									System.out.println("Others TransactionHold total:::----"+Isreprice_Com_Other_TH_Transactionhold_total);
										 
										 
										System.out.println("TransactionHold total:::----"+Isreprice_Com_TH_Transactionhold_total);
							    	
			      
			    	}
			    	
				}
				
public static void IsRepriced_TS_SD_CN_TH_SA(int iTestCaseRow,WebDriver driver) throws Exception {
					
					
					//******************* Transaction Successfull*********************************************
			    	Select transaction1=new Select(Loginpage.BookingSatus());
			    	transaction1.selectByIndex(3);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					waitforElement(driver);
					String comTrancount=Loginpage.FlightResults_text().getText();
					System.out.println(comTrancount);
					
					
			    	String comtranstr = comTrancount.trim();
			    	String[] comtransplited = comtranstr.split("\\:");
			    	System.out.println("No of Results Count"+comtransplited[1]);
			    	Thread.sleep(1000);
			    	String tran="Transaction Successful";
			    	
			    	if("Flight Search Results : 0".equals(comTrancount))
			    	{
			    		Isreprice_SATrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
			    		System.out.println("TrancationSuccess total:::----0");
			    		
			    		Isreprice_SA_TS_Wego =0;
			    		Isreprice_SA_TS_b2c =0;
			    		Isreprice_SA_TS_MobIos =0;
			    		Isreprice_SA_TS_MobAnd =0;
			    		Isreprice_SA_TS_skyscan =0;
			 	         
			    		Isreprice_SA_TS_Dhrehlat =0;
			    		Isreprice_SA_TS_Aviasa =0;
			    		Isreprice_SA_TS_Kayak =0;
				         
			    		Isreprice_SA_TS_Dohop =0;
			    		Isreprice_SA_TS_Farecompare =0;
			    		Isreprice_SA_TS_Shoogloo =0;
			 	         
				         int TotalValue = Isreprice_SA_TS_Wego + Isreprice_SA_TS_b2c +Isreprice_SA_TS_MobIos +Isreprice_SA_TS_skyscan+Isreprice_SA_TS_MobAnd
				 		        + Isreprice_SA_TS_Dhrehlat+ Isreprice_SA_TS_Aviasa +Isreprice_SA_TS_Kayak + Isreprice_SA_TS_Dohop+ Isreprice_SA_TS_Farecompare +Isreprice_SA_TS_Shoogloo;
				 				  
				         Isreprice_SA_TS_Transaction_Total = TotalValue; 
				 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_SA_TS_Transaction_Total);
				 				
				 				int Other =Isreprice_SA_TS_Dhrehlat + Isreprice_SA_TS_Aviasa +Isreprice_SA_TS_Kayak+ Isreprice_SA_TS_Dohop+ Isreprice_SA_TS_Farecompare+ Isreprice_SA_TS_Shoogloo;
				 		 	    	
				 				Isreprice_SA_TS_Other_TrancationSuccessfull = Other; 
				 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_SA_TS_Other_TrancationSuccessfull);
				 	        
				 	        
				        
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
			    		
			    		ArrayList<String>list=new ArrayList<>();
			    		
			    		 for (WebElement element1 : WE1)
			    		  {
			    			 list.add(element1.getText());
			    		  }
			    		  ArrayList<String> unique = removeDuplicates(list);
			    		  System.out.println("unique:"+unique.size());
			    	        for (String element : unique) {
			    	            System.out.println("element:"+element);
			    	            
			    	             
			    	            
			    	            
			    	            String number=element;
			    	           for(int j=0;j<unique.size();j++)
			    	           {	
			    	            switch(number){  
			    	            case "WEGO": 
			    	            	if(element.equals("WEGO")) 
			    		    	       {
			    		    	        
			    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

			    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
			    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
			    		    	
			    		    	
			    		    	Isreprice_SA_TS_Wego =Integer.parseInt(Com_TS_Wego1);
			    		    	
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Wego1 =String.format("%1s",0);
			    	    		    	
			    	    		    	
			    	            		Isreprice_SA_TS_Wego =Integer.parseInt(Com_TS_Wego1);
			    	            	}
			    		    	      
			    	            break; 
			    	            
			    	            case "B2C": 
			    	            	   
			    		    	       if(element.equals("B2C"))
			    		    	       {
			    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

			    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
			    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
			    		    	  
				    		    	
				    		    	
			    		    	  Isreprice_SA_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    		    	       }
			    		    	       else
				    	            	{
			    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
			    		    		    	  
			   		    		    	
			   		    		    	
			    		    	    	   Isreprice_SA_TS_b2c =Integer.parseInt(Com_TS_b2c1);
				    	            	}
			    		    	      
			    	            break;  
			    	            case "MOBIOS": 
			    	            	 if(element.equals("MOBIOS"))
			    		    	       {   
			    		    	       
			    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

			    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
			    		    	
			    		    	
			    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
				    		    
			    		    	 Isreprice_SA_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		 Isreprice_SA_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    	            	}
			    	            break; 
			    	            case "MOBAPP": 
			    	            	 if(element.equals("MOBAPP"))
			    		    	       {   
			    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

			    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
			    		    	 
			    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
					    		    
			    		    	 Isreprice_SA_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SKYSCN": 
			    	            	 if(element.equals("SKYSCN"))
			    		    	       {        
			    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

			    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
			    		    	
			    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
					    		    
			    		    	 Isreprice_SA_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    	            	}
			    		    	     
			    		    	       
			    	            break;  
			    	            case "DHREHLAT": 
			    	            	  if(element.equals("DHREHLAT"))
			    		    	       {   
			    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

			    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
			    		    	
			    		    	
			    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
				    		    
			    		    	Isreprice_SA_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
			    			    		    
			    	            			Isreprice_SA_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    	            	}
			    	            break; 
			    	            case "AVIASALES": 
			    	            	  if(element.equals("AVIASALES"))
			    		    	       {        
			    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

			    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
			    		    	
			    		    	
			    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
				    		    
			    		    	Isreprice_SA_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    		    	
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_SA_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    	            	}
			    		    	      
			    		    	     
			    	            break;
			    	            case "KAYAK": 
			    	            	  if(element.equals("KAYAK"))
			    		    	       {   
			    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

			    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
			    		    	
			    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
				    		    
			    		    	Isreprice_SA_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    		    	       }
			    		    	       
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_SA_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    	            	}
			    		    	       
			    	            break; 
			    	            case "DOHOP": 
			    	            	if(element.equals("DOHOP"))
			    		    	       {  
			    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

			    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
			    		    	 
			    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
					    		    
			    		    	 Isreprice_SA_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
						    		    
			    	            		Isreprice_SA_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    	            	}
			    		    	     
			    	            break;
			    	            case "FARECOMPARE": 
			    	            	
			    	            	  if(element.equals("FARECOMPARE"))
			    		    	       {  
			    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

			    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
			    		    	 
			    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
					    		    
			    		    	 Isreprice_SA_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  
			    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
			    				    		    
			    		    		    	 Isreprice_SA_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SHOOGLOO": 
			    	            	 if(element.equals("SHOOGLOO"))
			    		    	       {     
			    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

			    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
			    		    	
			    		    	 
			    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
					    		    
			    		    	 Isreprice_SA_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    		    	 
			    		    	
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    	            	}
			    	            break;
			    	            default:System.out.println("Not in 10, 20 or 30");  
			    	         
			    	            }
			    	           }
			    	        }
			    	 
			   
				        
			    	        int TotalValue = Isreprice_SA_TS_Wego + Isreprice_SA_TS_b2c +Isreprice_SA_TS_MobIos +Isreprice_SA_TS_skyscan+Isreprice_SA_TS_MobAnd
					 		        + Isreprice_SA_TS_Dhrehlat+ Isreprice_SA_TS_Aviasa +Isreprice_SA_TS_Kayak + Isreprice_SA_TS_Dohop+ Isreprice_SA_TS_Farecompare +Isreprice_SA_TS_Shoogloo;
					 				  
					         Isreprice_SA_TS_Transaction_Total = TotalValue; 
					 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_SA_TS_Transaction_Total);
					 				
					 				int Other =Isreprice_SA_TS_Dhrehlat + Isreprice_SA_TS_Aviasa +Isreprice_SA_TS_Kayak+ Isreprice_SA_TS_Dohop+ Isreprice_SA_TS_Farecompare+ Isreprice_SA_TS_Shoogloo;
					 		 	    	
					 				Isreprice_SA_TS_Other_TrancationSuccessfull = Other; 
					 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_SA_TS_Other_TrancationSuccessfull);
					 	        
					 	        
						//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
			    	
			    	
			    	
			    	
			    	}
			    	
			    	
			    	//******************* ConformationPending*********************************************
			    	Select Conpending=new Select(Loginpage.BookingSatus());
			    	Conpending.selectByIndex(4);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String IScomTrancount=Loginpage.FlightResults_text().getText();
					System.out.println(IScomTrancount);
					
					
			    	String Iscomtranstr = IScomTrancount.trim();
			    	String[] IScomtransplited = Iscomtranstr.split("\\:");
			    	System.out.println("No of Results Count"+IScomtransplited[1]);
			    	Thread.sleep(1000);
			    	String ConPen="Confirmation Pending";
			    	
			    	if("Flight Search Results : 0".equals(IScomTrancount))
			    	{
			    		Isreprice_SAConformationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConPen,0,0,0,0,0,0);
			    		System.out.println("TrancationSuccess total:::----0");
			    		
			    		Isreprice_SA_CP_Wego =0;
			    		Isreprice_SA_CP_b2c =0;
			    		Isreprice_SA_CP_MobIos =0;
			    		Isreprice_SA_CP_MobAnd =0;
			    		Isreprice_SA_CP_skyscan =0;
			 	         
			    		Isreprice_SA_CP_Dhrehlat =0;
			    		Isreprice_SA_CP_Aviasa =0;
			    		Isreprice_SA_CP_Kayak =0;
				         
			    		Isreprice_SA_CP_Dohop =0;
			    		Isreprice_SA_CP_Farecompare =0;
			    		Isreprice_SA_CP_Shoogloo =0;
			 	         
				         int TotalValue = Isreprice_SA_CP_Wego + Isreprice_SA_CP_b2c +Isreprice_SA_CP_MobIos +Isreprice_SA_CP_skyscan+Isreprice_SA_CP_MobAnd
				 		        + Isreprice_SA_CP_Dhrehlat+ Isreprice_SA_CP_Aviasa +Isreprice_SA_CP_Kayak + Isreprice_SA_CP_Dohop+ Isreprice_SA_CP_Farecompare +Isreprice_SA_CP_Shoogloo;
				 				  
				         Isreprice_SA_CP_COnformationPending_Total = TotalValue; 
				 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_SA_CP_COnformationPending_Total);
				 				
				 				int Other =Isreprice_SA_CP_Dhrehlat + Isreprice_SA_CP_Aviasa +Isreprice_SA_CP_Kayak+ Isreprice_SA_CP_Dohop+ Isreprice_SA_CP_Farecompare+ Isreprice_SA_CP_Shoogloo;
				 		 	    	
				 				Isreprice_SA_CP_Other_ConformationPending = Other; 
				 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_SA_CP_Other_ConformationPending);
				 	        
				 	        
				        
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
			    		
			    		ArrayList<String>list=new ArrayList<>();
			    		
			    		 for (WebElement element1 : WE1)
			    		  {
			    			 list.add(element1.getText());
			    		  }
			    		  ArrayList<String> unique = removeDuplicates(list);
			    		  System.out.println("unique:"+unique.size());
			    	        for (String element : unique) {
			    	            System.out.println("element:"+element);
			    	            
			    	             
			    	            
			    	            
			    	            String number=element;
			    	           for(int j=0;j<unique.size();j++)
			    	           {	
			    	            switch(number){  
			    	            case "WEGO": 
			    	            	if(element.equals("WEGO")) 
			    		    	       {
			    		    	        
			    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

			    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
			    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
			    		    	
			    		    	
			    		    	Isreprice_SA_CP_Wego =Integer.parseInt(Com_TS_Wego1);
			    		    	
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Wego1 =String.format("%1s",0);
			    	    		    	
			    	    		    	
			    	            		Isreprice_SA_CP_Wego =Integer.parseInt(Com_TS_Wego1);
			    	            	}
			    		    	      
			    	            break; 
			    	            
			    	            case "B2C": 
			    	            	   
			    		    	       if(element.equals("B2C"))
			    		    	       {
			    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

			    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
			    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
			    		    	  
				    		    	
				    		    	
			    		    	  Isreprice_SA_CP_b2c =Integer.parseInt(Com_TS_b2c1);
			    		    	       }
			    		    	       else
				    	            	{
			    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
			    		    		    	  
			   		    		    	
			   		    		    	
			    		    	    	   Isreprice_SA_CP_b2c =Integer.parseInt(Com_TS_b2c1);
				    	            	}
			    		    	      
			    	            break;  
			    	            case "MOBIOS": 
			    	            	 if(element.equals("MOBIOS"))
			    		    	       {   
			    		    	       
			    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

			    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
			    		    	
			    		    	
			    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
				    		    
			    		    	 Isreprice_SA_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		 Isreprice_SA_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    	            	}
			    	            break; 
			    	            case "MOBAPP": 
			    	            	 if(element.equals("MOBAPP"))
			    		    	       {   
			    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

			    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
			    		    	 
			    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
					    		    
			    		    	 Isreprice_SA_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SKYSCN": 
			    	            	 if(element.equals("SKYSCN"))
			    		    	       {        
			    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

			    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
			    		    	
			    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
					    		    
			    		    	 Isreprice_SA_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    	            	}
			    		    	     
			    		    	       
			    	            break;  
			    	            case "DHREHLAT": 
			    	            	  if(element.equals("DHREHLAT"))
			    		    	       {   
			    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

			    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
			    		    	
			    		    	
			    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
				    		    
			    		    	Isreprice_SA_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
			    			    		    
			    	            			Isreprice_SA_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    	            	}
			    	            break; 
			    	            case "AVIASALES": 
			    	            	  if(element.equals("AVIASALES"))
			    		    	       {        
			    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

			    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
			    		    	
			    		    	
			    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
				    		    
			    		    	Isreprice_SA_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    		    	
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_SA_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    	            	}
			    		    	      
			    		    	     
			    	            break;
			    	            case "KAYAK": 
			    	            	  if(element.equals("KAYAK"))
			    		    	       {   
			    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

			    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
			    		    	
			    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
				    		    
			    		    	Isreprice_SA_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    		    	       }
			    		    	       
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_SA_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    	            	}
			    		    	       
			    	            break; 
			    	            case "DOHOP": 
			    	            	if(element.equals("DOHOP"))
			    		    	       {  
			    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

			    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
			    		    	 
			    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
					    		    
			    		    	 Isreprice_SA_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
						    		    
			    	            		Isreprice_SA_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    	            	}
			    		    	     
			    	            break;
			    	            case "FARECOMPARE": 
			    	            	
			    	            	  if(element.equals("FARECOMPARE"))
			    		    	       {  
			    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

			    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
			    		    	 
			    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
					    		    
			    		    	 Isreprice_SA_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  
			    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
			    				    		    
			    		    		    	 Isreprice_SA_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SHOOGLOO": 
			    	            	 if(element.equals("SHOOGLOO"))
			    		    	       {     
			    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

			    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
			    		    	
			    		    	 
			    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
					    		    
			    		    	 Isreprice_SA_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    		    	 
			    		    	
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    	            	}
			    	            break;
			    	            default:System.out.println("Not in 10, 20 or 30");  
			    	         
			    	            }
			    	           }
			    	        }
			    	  
			    	  
			
				        
			    	        int TotalValue = Isreprice_SA_CP_Wego + Isreprice_SA_CP_b2c +Isreprice_SA_CP_MobIos +Isreprice_SA_CP_skyscan+Isreprice_SA_CP_MobAnd
					 		        + Isreprice_SA_CP_Dhrehlat+ Isreprice_SA_CP_Aviasa +Isreprice_SA_CP_Kayak + Isreprice_SA_CP_Dohop+ Isreprice_SA_CP_Farecompare +Isreprice_SA_CP_Shoogloo;
					 				  
					         Isreprice_SA_CP_COnformationPending_Total = TotalValue; 
					 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_SA_CP_COnformationPending_Total);
					 				
					 				int Other =Isreprice_SA_CP_Dhrehlat + Isreprice_SA_CP_Aviasa +Isreprice_SA_CP_Kayak+ Isreprice_SA_CP_Dohop+ Isreprice_SA_CP_Farecompare+ Isreprice_SA_CP_Shoogloo;
					 		 	    	
					 				Isreprice_SA_CP_Other_ConformationPending = Other; 
					 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_SA_CP_Other_ConformationPending);
					 	        
					 	        
					 	        
						//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
			    	}
			    	
			    	//******************* Partially Ticketed*********************************************
			    	Select Partialy=new Select(Loginpage.BookingSatus());
			    	Partialy.selectByIndex(2);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String IScomParticket=Loginpage.FlightResults_text().getText();
					System.out.println(IScomParticket);
					
					
			    	String Iscompar = IScomParticket.trim();
			    	String[] IScompartiplited = Iscompar.split("\\:");
			    	System.out.println("No of Results Count"+IScompartiplited[1]);
			    	Thread.sleep(1000);
			    	String PartillyTicket="Partially Ticketed";
			    	
			    	if("Flight Search Results : 0".equals(IScomParticket))
			    	{
			    		Isreprice_SATrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",PartillyTicket,0,0,0,0,0,0);
			    		System.out.println("TrancationSuccess total:::----0");
			    		
			    		Isreprice_SA_PT_Wego =0;
			    		Isreprice_SA_PT_b2c =0;
			    		Isreprice_SA_PT_MobIos =0;
			    		Isreprice_SA_PT_MobAnd =0;
			    		Isreprice_SA_PT_skyscan =0;
			 	         
			    		Isreprice_SA_PT_Dhrehlat =0;
			    		Isreprice_SA_PT_Aviasa =0;
			    		Isreprice_SA_PT_Kayak =0;
				         
			    		Isreprice_SA_PT_Dohop =0;
			    		Isreprice_SA_PT_Farecompare =0;
			    		Isreprice_SA_PT_Shoogloo =0;
			 	         
				         int TotalValue = Isreprice_SA_PT_Wego + Isreprice_SA_PT_b2c +Isreprice_SA_PT_MobIos +Isreprice_SA_PT_skyscan+Isreprice_SA_PT_MobAnd
				 		        + Isreprice_SA_PT_Dhrehlat+ Isreprice_SA_PT_Aviasa +Isreprice_SA_PT_Kayak + Isreprice_SA_PT_Dohop+ Isreprice_SA_PT_Farecompare +Isreprice_SA_PT_Shoogloo;
				 				  
				         Isreprice_SA_PT_PartiallyTicketed_Total = TotalValue; 
				 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_SA_PT_PartiallyTicketed_Total);
				 				
				 				int Other =Isreprice_SA_PT_Dhrehlat + Isreprice_SA_PT_Aviasa +Isreprice_SA_PT_Kayak+ Isreprice_SA_PT_Dohop+ Isreprice_SA_PT_Farecompare+ Isreprice_SA_PT_Shoogloo;
				 		 	    	
				 				Isreprice_SA_PT_Other_PartiallyTicketed = Other; 
				 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_SA_PT_Other_PartiallyTicketed);
				 	        
				 	        
				        
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
			    		
			    		ArrayList<String>list=new ArrayList<>();
			    		
			    		 for (WebElement element1 : WE1)
			    		  {
			    			 list.add(element1.getText());
			    		  }
			    		  ArrayList<String> unique = removeDuplicates(list);
			    		  System.out.println("unique:"+unique.size());
			    	        for (String element : unique) {
			    	            System.out.println("element:"+element);
			    	            
			    	             
			    	            
			    	            
			    	            String number=element;
			    	           for(int j=0;j<unique.size();j++)
			    	           {	
			    	            switch(number){  
			    	            case "WEGO": 
			    	            	if(element.equals("WEGO")) 
			    		    	       {
			    		    	        
			    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

			    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
			    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
			    		    	
			    		    	
			    		    	Isreprice_SA_PT_Wego =Integer.parseInt(Com_TS_Wego1);
			    		    	
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Wego1 =String.format("%1s",0);
			    	    		    	
			    	    		    	
			    	            		Isreprice_SA_PT_Wego =Integer.parseInt(Com_TS_Wego1);
			    	            	}
			    		    	      
			    	            break; 
			    	            
			    	            case "B2C": 
			    	            	   
			    		    	       if(element.equals("B2C"))
			    		    	       {
			    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

			    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
			    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
			    		    	  
				    		    	
				    		    	
			    		    	  Isreprice_SA_PT_b2c =Integer.parseInt(Com_TS_b2c1);
			    		    	       }
			    		    	       else
				    	            	{
			    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
			    		    		    	  
			   		    		    	
			   		    		    	
			    		    	    	   Isreprice_SA_PT_b2c =Integer.parseInt(Com_TS_b2c1);
				    	            	}
			    		    	      
			    	            break;  
			    	            case "MOBIOS": 
			    	            	 if(element.equals("MOBIOS"))
			    		    	       {   
			    		    	       
			    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

			    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
			    		    	
			    		    	
			    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
				    		    
			    		    	 Isreprice_SA_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		 Isreprice_SA_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    	            	}
			    	            break; 
			    	            case "MOBAPP": 
			    	            	 if(element.equals("MOBAPP"))
			    		    	       {   
			    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

			    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
			    		    	 
			    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
					    		    
			    		    	 Isreprice_SA_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SKYSCN": 
			    	            	 if(element.equals("SKYSCN"))
			    		    	       {        
			    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

			    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
			    		    	
			    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
					    		    
			    		    	 Isreprice_SA_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    	            	}
			    		    	     
			    		    	       
			    	            break;  
			    	            case "DHREHLAT": 
			    	            	  if(element.equals("DHREHLAT"))
			    		    	       {   
			    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

			    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
			    		    	
			    		    	
			    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
				    		    
			    		    	Isreprice_SA_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
			    			    		    
			    	            			Isreprice_SA_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    	            	}
			    	            break; 
			    	            case "AVIASALES": 
			    	            	  if(element.equals("AVIASALES"))
			    		    	       {        
			    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

			    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
			    		    	
			    		    	
			    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
				    		    
			    		    	Isreprice_SA_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    		    	
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_SA_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    	            	}
			    		    	      
			    		    	     
			    	            break;
			    	            case "KAYAK": 
			    	            	  if(element.equals("KAYAK"))
			    		    	       {   
			    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

			    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
			    		    	
			    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
				    		    
			    		    	Isreprice_SA_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    		    	       }
			    		    	       
			    	            	  else
				    	            	{
			    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
			    			    		    
			    	            		  Isreprice_SA_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    	            	}
			    		    	       
			    	            break; 
			    	            case "DOHOP": 
			    	            	if(element.equals("DOHOP"))
			    		    	       {  
			    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

			    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
			    		    	 
			    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
					    		    
			    		    	 Isreprice_SA_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    		    	       }
			    	            	else
			    	            	{
			    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
						    		    
			    	            		Isreprice_SA_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
			    	            	}
			    		    	     
			    	            break;
			    	            case "FARECOMPARE": 
			    	            	
			    	            	  if(element.equals("FARECOMPARE"))
			    		    	       {  
			    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

			    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
			    		    	 
			    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
					    		    
			    		    	 Isreprice_SA_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    		    	       }
			    	            	  else
				    	            	{
			    	            		  
			    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
			    				    		    
			    		    		    	 Isreprice_SA_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    	            	}
			    		    	      
			    	            break; 
			    	            case "SHOOGLOO": 
			    	            	 if(element.equals("SHOOGLOO"))
			    		    	       {     
			    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

			    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
			    		    	
			    		    	 
			    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
					    		    
			    		    	 Isreprice_SA_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    		    	 
			    		    	
			    		    	       }
			    	            	 else
				    	            	{
			    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
			 			    		    
			    	            		 Isreprice_SA_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    	            	}
			    	            break;
			    	            default:System.out.println("Not in 10, 20 or 30");  
			    	         
			    	            }
			    	           }
			    	        }
			    	  
			    	  
			
				        
			    	        int TotalValue = Isreprice_SA_PT_Wego + Isreprice_SA_PT_b2c +Isreprice_SA_PT_MobIos +Isreprice_SA_PT_skyscan+Isreprice_SA_PT_MobAnd
					 		        + Isreprice_SA_PT_Dhrehlat+ Isreprice_SA_PT_Aviasa +Isreprice_SA_PT_Kayak + Isreprice_SA_PT_Dohop+ Isreprice_SA_PT_Farecompare +Isreprice_SA_PT_Shoogloo;
					 				  
					         Isreprice_SA_PT_PartiallyTicketed_Total = TotalValue; 
					 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_SA_PT_PartiallyTicketed_Total);
					 				
					 				int Other =Isreprice_SA_PT_Dhrehlat + Isreprice_SA_PT_Aviasa +Isreprice_SA_PT_Kayak+ Isreprice_SA_PT_Dohop+ Isreprice_SA_PT_Farecompare+ Isreprice_SA_PT_Shoogloo;
					 		 	    	
					 				Isreprice_SA_PT_Other_PartiallyTicketed = Other; 
					 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_SA_PT_Other_PartiallyTicketed);
					 	        
						//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
			    	}
			    	
			    	
			    	//*********************Transaction Hold*****************************
			    	Select transactionHold=new Select(Loginpage.BookingSatus());
			    	transactionHold.selectByIndex(1);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Flight Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		Isreprice_SATransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		Isreprice_SA_TH_Wego =0;
			    		Isreprice_SA_TH_b2c =0;
			    		Isreprice_SA_TH_MobIos =0;
			    		Isreprice_SA_TH_MobAnd =0;
			    		Isreprice_SA_TH_skyscan =0;
		  		         
			    		Isreprice_SA_TH_Dhrehlat =0;
			    		Isreprice_SA_TH_Aviasa =0;
			    		Isreprice_SA_TH_Kayak =0;
				         
			    		Isreprice_SA_TH_Dohop =0;
			    		Isreprice_SA_TH_Farecompare =0;
			    		Isreprice_SA_TH_Shoogloo =0;
			    		
				         int TotalValue =Isreprice_SA_TH_Wego + Isreprice_SA_TH_b2c +Isreprice_SA_TH_MobIos + Isreprice_SA_TH_MobAnd+ Isreprice_SA_TH_skyscan
				        +Isreprice_SA_TH_Dhrehlat +Isreprice_SA_TH_Aviasa +Isreprice_SA_TH_Kayak +Isreprice_SA_TH_Dohop+ Isreprice_SA_TH_Farecompare + Isreprice_SA_TH_Shoogloo ;
				         Isreprice_SA_TH_Transactionhold_total =  TotalValue; 
						 
						 int otherTotal=Isreprice_SA_TH_Dhrehlat+ Isreprice_SA_TH_Aviasa +Isreprice_SA_TH_Kayak + Isreprice_SA_TH_Dohop+ Isreprice_SA_TH_Farecompare +Isreprice_SA_TH_Shoogloo;
						 Isreprice_SA_Other_TH_Transactionhold_total =  otherTotal; 
					System.out.println("TransactionHold total:::----"+Isreprice_SA_Other_TH_Transactionhold_total);
						 
						 
						System.out.println("TransactionHold total:::----"+Isreprice_SA_TH_Transactionhold_total);
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	Isreprice_SA_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		Isreprice_SA_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  Isreprice_SA_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   Isreprice_SA_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 Isreprice_SA_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 Isreprice_SA_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 Isreprice_SA_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 Isreprice_SA_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 Isreprice_SA_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 Isreprice_SA_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	Isreprice_SA_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			Isreprice_SA_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	Isreprice_SA_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  Isreprice_SA_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	Isreprice_SA_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  Isreprice_SA_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 Isreprice_SA_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		Isreprice_SA_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 Isreprice_SA_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 Isreprice_SA_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 Isreprice_SA_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 Isreprice_SA_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
				    	   
			    	
			    	
			        
			        
			        
			   
				    	        int TotalValue =Isreprice_SA_TH_Wego + Isreprice_SA_TH_b2c +Isreprice_SA_TH_MobIos + Isreprice_SA_TH_MobAnd+ Isreprice_SA_TH_skyscan
								        +Isreprice_SA_TH_Dhrehlat +Isreprice_SA_TH_Aviasa +Isreprice_SA_TH_Kayak +Isreprice_SA_TH_Dohop+ Isreprice_SA_TH_Farecompare + Isreprice_SA_TH_Shoogloo ;
								         Isreprice_SA_TH_Transactionhold_total =  TotalValue; 
										 
										 int otherTotal=Isreprice_SA_TH_Dhrehlat+ Isreprice_SA_TH_Aviasa +Isreprice_SA_TH_Kayak + Isreprice_SA_TH_Dohop+ Isreprice_SA_TH_Farecompare +Isreprice_SA_TH_Shoogloo;
										 Isreprice_SA_Other_TH_Transactionhold_total =  otherTotal; 
									System.out.println("TransactionHold total:::----"+Isreprice_SA_Other_TH_Transactionhold_total);
										 
			      
			    	}
			    	
				}
 
 public static void IsRepriced_TS_SD_CN_TH_EG(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		//******************* Transaction Successfull*********************************************
    	Select transaction1=new Select(Loginpage.BookingSatus());
    	transaction1.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		
		String comTrancount=Loginpage.FlightResults_text().getText();
		System.out.println(comTrancount);
		
		
    	String comtranstr = comTrancount.trim();
    	String[] comtransplited = comtranstr.split("\\:");
    	System.out.println("No of Results Count"+comtransplited[1]);
    	Thread.sleep(1000);
    	String tran="Transaction Successful";
    	
    	if("Flight Search Results : 0".equals(comTrancount))
    	{
    		Isreprice_EGTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
    		System.out.println("TrancationSuccess total:::----0");
    		
    		Isreprice_EG_TS_Wego =0;
    		Isreprice_EG_TS_b2c =0;
    		Isreprice_EG_TS_MobIos =0;
    		Isreprice_EG_TS_MobAnd =0;
    		Isreprice_EG_TS_skyscan =0;
 	         
    		Isreprice_EG_TS_Dhrehlat =0;
    		Isreprice_EG_TS_Aviasa =0;
    		Isreprice_EG_TS_Kayak =0;
	         
    		Isreprice_EG_TS_Dohop =0;
    		Isreprice_EG_TS_Farecompare =0;
    		Isreprice_EG_TS_Shoogloo =0;
 	         
	         int TotalValue = Isreprice_EG_TS_Wego + Isreprice_EG_TS_b2c +Isreprice_EG_TS_MobIos +Isreprice_EG_TS_skyscan+Isreprice_EG_TS_MobAnd
	 		        + Isreprice_EG_TS_Dhrehlat+ Isreprice_EG_TS_Aviasa +Isreprice_EG_TS_Kayak + Isreprice_EG_TS_Dohop+ Isreprice_EG_TS_Farecompare +Isreprice_EG_TS_Shoogloo;
	 				  
	         Isreprice_EG_TS_Transaction_Total = TotalValue; 
	 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_EG_TS_Transaction_Total);
	 				
	 				int Other =Isreprice_EG_TS_Dhrehlat + Isreprice_EG_TS_Aviasa +Isreprice_EG_TS_Kayak+ Isreprice_EG_TS_Dohop+ Isreprice_EG_TS_Farecompare+ Isreprice_EG_TS_Shoogloo;
	 		 	    	
	 				Isreprice_EG_TS_Other_TrancationSuccessfull = Other; 
	 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_EG_TS_Other_TrancationSuccessfull);
	 	        
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : WE1)
    		  {
    			 list.add(element1.getText());
    		  }
    		  ArrayList<String> unique = removeDuplicates(list);
    		  System.out.println("unique:"+unique.size());
    	        for (String element : unique) {
    	            System.out.println("element:"+element);
    	            
    	             
    	            
    	            
    	            String number=element;
    	           for(int j=0;j<unique.size();j++)
    	           {	
    	            switch(number){  
    	            case "WEGO": 
    	            	if(element.equals("WEGO")) 
    		    	       {
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
    		    	
    		    	
    		    	Isreprice_EG_TS_Wego =Integer.parseInt(Com_TS_Wego1);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Wego1 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Isreprice_EG_TS_Wego =Integer.parseInt(Com_TS_Wego1);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "B2C": 
    	            	   
    		    	       if(element.equals("B2C"))
    		    	       {
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
    		    	  
	    		    	
	    		    	
    		    	  Isreprice_EG_TS_b2c =Integer.parseInt(Com_TS_b2c1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Isreprice_EG_TS_b2c =Integer.parseInt(Com_TS_b2c1);
	    	            	}
    		    	      
    	            break;  
    	            case "MOBIOS": 
    	            	 if(element.equals("MOBIOS"))
    		    	       {   
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
    		    	
    		    	
    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
	    		    
    		    	 Isreprice_EG_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
    			    		    
    	            		 Isreprice_EG_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    	            	}
    	            break; 
    	            case "MOBAPP": 
    	            	 if(element.equals("MOBAPP"))
    		    	       {   
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
    		    	 
    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
		    		    
    		    	 Isreprice_EG_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    	            	}
    		    	      
    	            break; 
    	            case "SKYSCN": 
    	            	 if(element.equals("SKYSCN"))
    		    	       {        
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
    		    	
    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
		    		    
    		    	 Isreprice_EG_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "DHREHLAT": 
    	            	  if(element.equals("DHREHLAT"))
    		    	       {   
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
    		    	
    		    	
    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
	    		    
    		    	Isreprice_EG_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
    			    		    
    	            			Isreprice_EG_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    	            	}
    	            break; 
    	            case "AVIASALES": 
    	            	  if(element.equals("AVIASALES"))
    		    	       {        
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
    		    	
    		    	
    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
	    		    
    		    	Isreprice_EG_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_EG_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "KAYAK": 
    	            	  if(element.equals("KAYAK"))
    		    	       {   
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
    		    	
    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
	    		    
    		    	Isreprice_EG_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_EG_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    	            	}
    		    	       
    	            break; 
    	            case "DOHOP": 
    	            	if(element.equals("DOHOP"))
    		    	       {  
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
    		    	 
    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
		    		    
    		    	 Isreprice_EG_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
			    		    
    	            		Isreprice_EG_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
    	            	}
    		    	     
    	            break;
    	            case "FARECOMPARE": 
    	            	
    	            	  if(element.equals("FARECOMPARE"))
    		    	       {  
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
    		    	 
    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
		    		    
    		    	 Isreprice_EG_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Isreprice_EG_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    	            	}
    		    	      
    	            break; 
    	            case "SHOOGLOO": 
    	            	 if(element.equals("SHOOGLOO"))
    		    	       {     
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
    		    	
    		    	 
    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
		    		    
    		    	 Isreprice_EG_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    	            	}
    	            break;
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	 
   
	        
    	        int TotalValue = Isreprice_EG_TS_Wego + Isreprice_EG_TS_b2c +Isreprice_EG_TS_MobIos +Isreprice_EG_TS_skyscan+Isreprice_EG_TS_MobAnd
		 		        + Isreprice_EG_TS_Dhrehlat+ Isreprice_EG_TS_Aviasa +Isreprice_EG_TS_Kayak + Isreprice_EG_TS_Dohop+ Isreprice_EG_TS_Farecompare +Isreprice_EG_TS_Shoogloo;
		 				  
		         Isreprice_EG_TS_Transaction_Total = TotalValue; 
		 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_EG_TS_Transaction_Total);
		 				
		 				int Other =Isreprice_EG_TS_Dhrehlat + Isreprice_EG_TS_Aviasa +Isreprice_EG_TS_Kayak+ Isreprice_EG_TS_Dohop+ Isreprice_EG_TS_Farecompare+ Isreprice_EG_TS_Shoogloo;
		 		 	    	
		 				Isreprice_EG_TS_Other_TrancationSuccessfull = Other; 
		 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_EG_TS_Other_TrancationSuccessfull);
		 	        
		 	        
       
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	
    	
    	
    	
    	}
    	
    	
    	//******************* ConformationPending*********************************************
    	Select Conpending=new Select(Loginpage.BookingSatus());
    	Conpending.selectByIndex(4);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		String IScomTrancount=Loginpage.FlightResults_text().getText();
		System.out.println(IScomTrancount);
		
		
    	String Iscomtranstr = IScomTrancount.trim();
    	String[] IScomtransplited = Iscomtranstr.split("\\:");
    	System.out.println("No of Results Count"+IScomtransplited[1]);
    	Thread.sleep(1000);
    	String ConPen="Confirmation Pending";
    	
    	if("Flight Search Results : 0".equals(IScomTrancount))
    	{
    		Isreprice_EGConformationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConPen,0,0,0,0,0,0);
    		System.out.println("TrancationSuccess total:::----0");
    		
    		Isreprice_EG_CP_Wego =0;
    		Isreprice_EG_CP_b2c =0;
    		Isreprice_EG_CP_MobIos =0;
    		Isreprice_EG_CP_MobAnd =0;
    		Isreprice_EG_CP_skyscan =0;
 	         
    		Isreprice_EG_CP_Dhrehlat =0;
    		Isreprice_EG_CP_Aviasa =0;
    		Isreprice_EG_CP_Kayak =0;
	         
    		Isreprice_EG_CP_Dohop =0;
    		Isreprice_EG_CP_Farecompare =0;
    		Isreprice_EG_CP_Shoogloo =0;
 	         
	         int TotalValue = Isreprice_EG_CP_Wego + Isreprice_EG_CP_b2c +Isreprice_EG_CP_MobIos +Isreprice_EG_CP_skyscan+Isreprice_EG_CP_MobAnd
	 		        + Isreprice_EG_CP_Dhrehlat+ Isreprice_EG_CP_Aviasa +Isreprice_EG_CP_Kayak + Isreprice_EG_CP_Dohop+ Isreprice_EG_CP_Farecompare +Isreprice_EG_CP_Shoogloo;
	 				  
	         Isreprice_EG_CP_COnformationPending_Total = TotalValue; 
	 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_EG_CP_COnformationPending_Total);
	 				
	 				int Other =Isreprice_EG_CP_Dhrehlat + Isreprice_EG_CP_Aviasa +Isreprice_EG_CP_Kayak+ Isreprice_EG_CP_Dohop+ Isreprice_EG_CP_Farecompare+ Isreprice_EG_CP_Shoogloo;
	 		 	    	
	 				Isreprice_EG_CP_Other_ConformationPending = Other; 
	 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_EG_CP_Other_ConformationPending);
	 	        
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : WE1)
    		  {
    			 list.add(element1.getText());
    		  }
    		  ArrayList<String> unique = removeDuplicates(list);
    		  System.out.println("unique:"+unique.size());
    	        for (String element : unique) {
    	            System.out.println("element:"+element);
    	            
    	             
    	            
    	            
    	            String number=element;
    	           for(int j=0;j<unique.size();j++)
    	           {	
    	            switch(number){  
    	            case "WEGO": 
    	            	if(element.equals("WEGO")) 
    		    	       {
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
    		    	
    		    	
    		    	Isreprice_EG_CP_Wego =Integer.parseInt(Com_TS_Wego1);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Wego1 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Isreprice_EG_CP_Wego =Integer.parseInt(Com_TS_Wego1);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "B2C": 
    	            	   
    		    	       if(element.equals("B2C"))
    		    	       {
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
    		    	  
	    		    	
	    		    	
    		    	  Isreprice_EG_CP_b2c =Integer.parseInt(Com_TS_b2c1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Isreprice_EG_CP_b2c =Integer.parseInt(Com_TS_b2c1);
	    	            	}
    		    	      
    	            break;  
    	            case "MOBIOS": 
    	            	 if(element.equals("MOBIOS"))
    		    	       {   
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
    		    	
    		    	
    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
	    		    
    		    	 Isreprice_EG_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
    			    		    
    	            		 Isreprice_EG_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    	            	}
    	            break; 
    	            case "MOBAPP": 
    	            	 if(element.equals("MOBAPP"))
    		    	       {   
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
    		    	 
    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
		    		    
    		    	 Isreprice_EG_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    	            	}
    		    	      
    	            break; 
    	            case "SKYSCN": 
    	            	 if(element.equals("SKYSCN"))
    		    	       {        
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
    		    	
    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
		    		    
    		    	 Isreprice_EG_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "DHREHLAT": 
    	            	  if(element.equals("DHREHLAT"))
    		    	       {   
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
    		    	
    		    	
    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
	    		    
    		    	Isreprice_EG_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
    			    		    
    	            			Isreprice_EG_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    	            	}
    	            break; 
    	            case "AVIASALES": 
    	            	  if(element.equals("AVIASALES"))
    		    	       {        
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
    		    	
    		    	
    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
	    		    
    		    	Isreprice_EG_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_EG_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "KAYAK": 
    	            	  if(element.equals("KAYAK"))
    		    	       {   
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
    		    	
    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
	    		    
    		    	Isreprice_EG_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_EG_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    	            	}
    		    	       
    	            break; 
    	            case "DOHOP": 
    	            	if(element.equals("DOHOP"))
    		    	       {  
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
    		    	 
    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
		    		    
    		    	 Isreprice_EG_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
			    		    
    	            		Isreprice_EG_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
    	            	}
    		    	     
    	            break;
    	            case "FARECOMPARE": 
    	            	
    	            	  if(element.equals("FARECOMPARE"))
    		    	       {  
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
    		    	 
    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
		    		    
    		    	 Isreprice_EG_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Isreprice_EG_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    	            	}
    		    	      
    	            break; 
    	            case "SHOOGLOO": 
    	            	 if(element.equals("SHOOGLOO"))
    		    	       {     
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
    		    	
    		    	 
    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
		    		    
    		    	 Isreprice_EG_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    	            	}
    	            break;
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	  
    	  

	        
    	        int TotalValue = Isreprice_EG_CP_Wego + Isreprice_EG_CP_b2c +Isreprice_EG_CP_MobIos +Isreprice_EG_CP_skyscan+Isreprice_EG_CP_MobAnd
		 		        + Isreprice_EG_CP_Dhrehlat+ Isreprice_EG_CP_Aviasa +Isreprice_EG_CP_Kayak + Isreprice_EG_CP_Dohop+ Isreprice_EG_CP_Farecompare +Isreprice_EG_CP_Shoogloo;
		 				  
		         Isreprice_EG_CP_COnformationPending_Total = TotalValue; 
		 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_EG_CP_COnformationPending_Total);
		 				
		 				int Other =Isreprice_EG_CP_Dhrehlat + Isreprice_EG_CP_Aviasa +Isreprice_EG_CP_Kayak+ Isreprice_EG_CP_Dohop+ Isreprice_EG_CP_Farecompare+ Isreprice_EG_CP_Shoogloo;
		 		 	    	
		 				Isreprice_EG_CP_Other_ConformationPending = Other; 
		 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_EG_CP_Other_ConformationPending);
		 	        
		 	        
		 	        
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	}
    	
    	//******************* Partially Ticketed*********************************************
    	Select Partialy=new Select(Loginpage.BookingSatus());
    	Partialy.selectByIndex(2);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		String IScomParticket=Loginpage.FlightResults_text().getText();
		System.out.println(IScomParticket);
		
		
    	String Iscompar = IScomParticket.trim();
    	String[] IScompartiplited = Iscompar.split("\\:");
    	System.out.println("No of Results Count"+IScompartiplited[1]);
    	Thread.sleep(1000);
    	String PartillyTicket="Partially Ticketed";
    	
    	if("Flight Search Results : 0".equals(IScomParticket))
    	{
    		Isreprice_EGTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",PartillyTicket,0,0,0,0,0,0);
    		System.out.println("TrancationSuccess total:::----0");
    		
    		Isreprice_EG_PT_Wego =0;
    		Isreprice_EG_PT_b2c =0;
    		Isreprice_EG_PT_MobIos =0;
    		Isreprice_EG_PT_MobAnd =0;
    		Isreprice_EG_PT_skyscan =0;
 	         
    		Isreprice_EG_PT_Dhrehlat =0;
    		Isreprice_EG_PT_Aviasa =0;
    		Isreprice_EG_PT_Kayak =0;
	         
    		Isreprice_EG_PT_Dohop =0;
    		Isreprice_EG_PT_Farecompare =0;
    		Isreprice_EG_PT_Shoogloo =0;
 	         
	         int TotalValue = Isreprice_EG_PT_Wego + Isreprice_EG_PT_b2c +Isreprice_EG_PT_MobIos +Isreprice_EG_PT_skyscan+Isreprice_EG_PT_MobAnd
	 		        + Isreprice_EG_PT_Dhrehlat+ Isreprice_EG_PT_Aviasa +Isreprice_EG_PT_Kayak + Isreprice_EG_PT_Dohop+ Isreprice_EG_PT_Farecompare +Isreprice_EG_PT_Shoogloo;
	 				  
	         Isreprice_EG_PT_PartiallyTicketed_Total = TotalValue; 
	 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_EG_PT_PartiallyTicketed_Total);
	 				
	 				int Other =Isreprice_EG_PT_Dhrehlat + Isreprice_EG_PT_Aviasa +Isreprice_EG_PT_Kayak+ Isreprice_EG_PT_Dohop+ Isreprice_EG_PT_Farecompare+ Isreprice_EG_PT_Shoogloo;
	 		 	    	
	 				Isreprice_EG_PT_Other_PartiallyTicketed = Other; 
	 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_EG_PT_Other_PartiallyTicketed);
	 	        
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : WE1)
    		  {
    			 list.add(element1.getText());
    		  }
    		  ArrayList<String> unique = removeDuplicates(list);
    		  System.out.println("unique:"+unique.size());
    	        for (String element : unique) {
    	            System.out.println("element:"+element);
    	            
    	             
    	            
    	            
    	            String number=element;
    	           for(int j=0;j<unique.size();j++)
    	           {	
    	            switch(number){  
    	            case "WEGO": 
    	            	if(element.equals("WEGO")) 
    		    	       {
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
    		    	
    		    	
    		    	Isreprice_EG_PT_Wego =Integer.parseInt(Com_TS_Wego1);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Wego1 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Isreprice_EG_PT_Wego =Integer.parseInt(Com_TS_Wego1);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "B2C": 
    	            	   
    		    	       if(element.equals("B2C"))
    		    	       {
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
    		    	  
	    		    	
	    		    	
    		    	  Isreprice_EG_PT_b2c =Integer.parseInt(Com_TS_b2c1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Isreprice_EG_PT_b2c =Integer.parseInt(Com_TS_b2c1);
	    	            	}
    		    	      
    	            break;  
    	            case "MOBIOS": 
    	            	 if(element.equals("MOBIOS"))
    		    	       {   
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
    		    	
    		    	
    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
	    		    
    		    	 Isreprice_EG_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
    			    		    
    	            		 Isreprice_EG_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    	            	}
    	            break; 
    	            case "MOBAPP": 
    	            	 if(element.equals("MOBAPP"))
    		    	       {   
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
    		    	 
    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
		    		    
    		    	 Isreprice_EG_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    	            	}
    		    	      
    	            break; 
    	            case "SKYSCN": 
    	            	 if(element.equals("SKYSCN"))
    		    	       {        
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
    		    	
    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
		    		    
    		    	 Isreprice_EG_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "DHREHLAT": 
    	            	  if(element.equals("DHREHLAT"))
    		    	       {   
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
    		    	
    		    	
    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
	    		    
    		    	Isreprice_EG_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
    			    		    
    	            			Isreprice_EG_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    	            	}
    	            break; 
    	            case "AVIASALES": 
    	            	  if(element.equals("AVIASALES"))
    		    	       {        
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
    		    	
    		    	
    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
	    		    
    		    	Isreprice_EG_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_EG_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "KAYAK": 
    	            	  if(element.equals("KAYAK"))
    		    	       {   
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
    		    	
    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
	    		    
    		    	Isreprice_EG_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_EG_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    	            	}
    		    	       
    	            break; 
    	            case "DOHOP": 
    	            	if(element.equals("DOHOP"))
    		    	       {  
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
    		    	 
    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
		    		    
    		    	 Isreprice_EG_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
			    		    
    	            		Isreprice_EG_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
    	            	}
    		    	     
    	            break;
    	            case "FARECOMPARE": 
    	            	
    	            	  if(element.equals("FARECOMPARE"))
    		    	       {  
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
    		    	 
    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
		    		    
    		    	 Isreprice_EG_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Isreprice_EG_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    	            	}
    		    	      
    	            break; 
    	            case "SHOOGLOO": 
    	            	 if(element.equals("SHOOGLOO"))
    		    	       {     
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
    		    	
    		    	 
    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
		    		    
    		    	 Isreprice_EG_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_EG_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    	            	}
    	            break;
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	  
    	  

	        
    	        int TotalValue = Isreprice_EG_PT_Wego + Isreprice_EG_PT_b2c +Isreprice_EG_PT_MobIos +Isreprice_EG_PT_skyscan+Isreprice_EG_PT_MobAnd
		 		        + Isreprice_EG_PT_Dhrehlat+ Isreprice_EG_PT_Aviasa +Isreprice_EG_PT_Kayak + Isreprice_EG_PT_Dohop+ Isreprice_EG_PT_Farecompare +Isreprice_EG_PT_Shoogloo;
		 				  
		         Isreprice_EG_PT_PartiallyTicketed_Total = TotalValue; 
		 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_EG_PT_PartiallyTicketed_Total);
		 				
		 				int Other =Isreprice_EG_PT_Dhrehlat + Isreprice_EG_PT_Aviasa +Isreprice_EG_PT_Kayak+ Isreprice_EG_PT_Dohop+ Isreprice_EG_PT_Farecompare+ Isreprice_EG_PT_Shoogloo;
		 		 	    	
		 				Isreprice_EG_PT_Other_PartiallyTicketed = Other; 
		 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_EG_PT_Other_PartiallyTicketed);
		 	        
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	}
    	
    	
    	//*********************Transaction Hold*****************************
    	Select transactionHold=new Select(Loginpage.BookingSatus());
    	transactionHold.selectByIndex(1);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		String comTranHold=Loginpage.FlightResults_text().getText();
		System.out.println(comTranHold);
		
		
    	String comtranstrhold = comTranHold.trim();
    	String[] comtranholdsplited = comtranstrhold.split("\\:");
    	System.out.println("No of Results Count"+comtranholdsplited[1]);
    	Thread.sleep(1000);
    	
    	String tranHold="Transaction Hold";
    	if("Flight Search Results : 0".equals(comTranHold))
    	{
    	
    		Isreprice_EGTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
    		System.out.println("TransactionHold total:::----0");
    		
    		Isreprice_EG_TH_Wego =0;
    		Isreprice_EG_TH_b2c =0;
    		Isreprice_EG_TH_MobIos =0;
    		Isreprice_EG_TH_MobAnd =0;
    		Isreprice_EG_TH_skyscan =0;
		         
    		Isreprice_EG_TH_Dhrehlat =0;
    		Isreprice_EG_TH_Aviasa =0;
    		Isreprice_EG_TH_Kayak =0;
	         
    		Isreprice_EG_TH_Dohop =0;
    		Isreprice_EG_TH_Farecompare =0;
    		Isreprice_EG_TH_Shoogloo =0;
    		
	         int TotalValue =Isreprice_EG_TH_Wego + Isreprice_EG_TH_b2c +Isreprice_EG_TH_MobIos + Isreprice_EG_TH_MobAnd+ Isreprice_EG_TH_skyscan
	        +Isreprice_EG_TH_Dhrehlat +Isreprice_EG_TH_Aviasa +Isreprice_EG_TH_Kayak +Isreprice_EG_TH_Dohop+ Isreprice_EG_TH_Farecompare + Isreprice_EG_TH_Shoogloo ;
	         Isreprice_EG_TH_Transactionhold_total =  TotalValue; 
			 
			 int otherTotal=Isreprice_EG_TH_Dhrehlat+ Isreprice_EG_TH_Aviasa +Isreprice_EG_TH_Kayak + Isreprice_EG_TH_Dohop+ Isreprice_EG_TH_Farecompare +Isreprice_EG_TH_Shoogloo;
			 Isreprice_EG_Other_TH_Transactionhold_total =  otherTotal; 
		System.out.println("TransactionHold total:::----"+Isreprice_EG_Other_TH_Transactionhold_total);
			 
			 
			System.out.println("TransactionHold total:::----"+Isreprice_EG_TH_Transactionhold_total);
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
    		  
    		  
    		  ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	Isreprice_EG_TH_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	    	            		Isreprice_EG_TH_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  Isreprice_EG_TH_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    	    	   Isreprice_EG_TH_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 Isreprice_EG_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		 Isreprice_EG_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 Isreprice_EG_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Isreprice_EG_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 Isreprice_EG_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Isreprice_EG_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	Isreprice_EG_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			Isreprice_EG_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	Isreprice_EG_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Isreprice_EG_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	Isreprice_EG_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Isreprice_EG_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 Isreprice_EG_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		Isreprice_EG_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 Isreprice_EG_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 Isreprice_EG_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 Isreprice_EG_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Isreprice_EG_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
    	
    	
        
        
        
   
	    	        int TotalValue =Isreprice_EG_TH_Wego + Isreprice_EG_TH_b2c +Isreprice_EG_TH_MobIos + Isreprice_EG_TH_MobAnd+ Isreprice_EG_TH_skyscan
	    			        +Isreprice_EG_TH_Dhrehlat +Isreprice_EG_TH_Aviasa +Isreprice_EG_TH_Kayak +Isreprice_EG_TH_Dohop+ Isreprice_EG_TH_Farecompare + Isreprice_EG_TH_Shoogloo ;
	    			         Isreprice_EG_TH_Transactionhold_total =  TotalValue; 
	    					 
	    					 int otherTotal=Isreprice_EG_TH_Dhrehlat+ Isreprice_EG_TH_Aviasa +Isreprice_EG_TH_Kayak + Isreprice_EG_TH_Dohop+ Isreprice_EG_TH_Farecompare +Isreprice_EG_TH_Shoogloo;
	    					 Isreprice_EG_Other_TH_Transactionhold_total =  otherTotal; 
	    				System.out.println("TransactionHold total:::----"+Isreprice_EG_Other_TH_Transactionhold_total);
	    					 
	    					 
	    					System.out.println("TransactionHold total:::----"+Isreprice_EG_TH_Transactionhold_total);
    	}
    	
	}
    
 public static void IsRepriced_TS_SD_CN_TH_AE(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		//******************* Transaction Successfull*********************************************
    	Select transaction1=new Select(Loginpage.BookingSatus());
    	transaction1.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		waitforElement(driver);
		
		String comTrancount=Loginpage.FlightResults_text().getText();
		System.out.println(comTrancount);
		
		
    	String comtranstr = comTrancount.trim();
    	String[] comtransplited = comtranstr.split("\\:");
    	System.out.println("No of Results Count"+comtransplited[1]);
    	Thread.sleep(1000);
    	String tran="Transaction Successful";
    	
    	if("Flight Search Results : 0".equals(comTrancount))
    	{
    		Isreprice_AETrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
    		System.out.println("TrancationSuccess total:::----0");
    		
    		Isreprice_AE_TS_Wego =0;
    		Isreprice_AE_TS_b2c =0;
    		Isreprice_AE_TS_MobIos =0;
    		Isreprice_AE_TS_MobAnd =0;
    		Isreprice_AE_TS_skyscan =0;
 	         
    		Isreprice_AE_TS_Dhrehlat =0;
    		Isreprice_AE_TS_Aviasa =0;
    		Isreprice_AE_TS_Kayak =0;
	         
    		Isreprice_AE_TS_Dohop =0;
    		Isreprice_AE_TS_Farecompare =0;
    		Isreprice_AE_TS_Shoogloo =0;
 	         
	         int TotalValue = Isreprice_AE_TS_Wego + Isreprice_AE_TS_b2c +Isreprice_AE_TS_MobIos +Isreprice_AE_TS_skyscan+Isreprice_AE_TS_MobAnd
	 		        + Isreprice_AE_TS_Dhrehlat+ Isreprice_AE_TS_Aviasa +Isreprice_AE_TS_Kayak + Isreprice_AE_TS_Dohop+ Isreprice_AE_TS_Farecompare +Isreprice_AE_TS_Shoogloo;
	 				  
	         Isreprice_AE_TS_Transaction_Total = TotalValue; 
	 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_AE_TS_Transaction_Total);
	 				
	 				int Other =Isreprice_AE_TS_Dhrehlat + Isreprice_AE_TS_Aviasa +Isreprice_AE_TS_Kayak+ Isreprice_AE_TS_Dohop+ Isreprice_AE_TS_Farecompare+ Isreprice_AE_TS_Shoogloo;
	 		 	    	
	 				Isreprice_AE_TS_Other_TrancationSuccessfull = Other; 
	 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_AE_TS_Other_TrancationSuccessfull);
	 	        
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : WE1)
    		  {
    			 list.add(element1.getText());
    		  }
    		  ArrayList<String> unique = removeDuplicates(list);
    		  System.out.println("unique:"+unique.size());
    	        for (String element : unique) {
    	            System.out.println("element:"+element);
    	            
    	             
    	            
    	            
    	            String number=element;
    	           for(int j=0;j<unique.size();j++)
    	           {	
    	            switch(number){  
    	            case "WEGO": 
    	            	if(element.equals("WEGO")) 
    		    	       {
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
    		    	
    		    	
    		    	Isreprice_AE_TS_Wego =Integer.parseInt(Com_TS_Wego1);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Wego1 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Isreprice_AE_TS_Wego =Integer.parseInt(Com_TS_Wego1);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "B2C": 
    	            	   
    		    	       if(element.equals("B2C"))
    		    	       {
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
    		    	  
	    		    	
	    		    	
    		    	  Isreprice_AE_TS_b2c =Integer.parseInt(Com_TS_b2c1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Isreprice_AE_TS_b2c =Integer.parseInt(Com_TS_b2c1);
	    	            	}
    		    	      
    	            break;  
    	            case "MOBIOS": 
    	            	 if(element.equals("MOBIOS"))
    		    	       {   
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
    		    	
    		    	
    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
	    		    
    		    	 Isreprice_AE_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
    			    		    
    	            		 Isreprice_AE_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    	            	}
    	            break; 
    	            case "MOBAPP": 
    	            	 if(element.equals("MOBAPP"))
    		    	       {   
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
    		    	 
    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
		    		    
    		    	 Isreprice_AE_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    	            	}
    		    	      
    	            break; 
    	            case "SKYSCN": 
    	            	 if(element.equals("SKYSCN"))
    		    	       {        
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
    		    	
    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
		    		    
    		    	 Isreprice_AE_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "DHREHLAT": 
    	            	  if(element.equals("DHREHLAT"))
    		    	       {   
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
    		    	
    		    	
    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
	    		    
    		    	Isreprice_AE_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
    			    		    
    	            			Isreprice_AE_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    	            	}
    	            break; 
    	            case "AVIASALES": 
    	            	  if(element.equals("AVIASALES"))
    		    	       {        
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
    		    	
    		    	
    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
	    		    
    		    	Isreprice_AE_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_AE_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "KAYAK": 
    	            	  if(element.equals("KAYAK"))
    		    	       {   
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
    		    	
    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
	    		    
    		    	Isreprice_AE_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_AE_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    	            	}
    		    	       
    	            break; 
    	            case "DOHOP": 
    	            	if(element.equals("DOHOP"))
    		    	       {  
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
    		    	 
    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
		    		    
    		    	 Isreprice_AE_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
			    		    
    	            		Isreprice_AE_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
    	            	}
    		    	     
    	            break;
    	            case "FARECOMPARE": 
    	            	
    	            	  if(element.equals("FARECOMPARE"))
    		    	       {  
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
    		    	 
    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
		    		    
    		    	 Isreprice_AE_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Isreprice_AE_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    	            	}
    		    	      
    	            break; 
    	            case "SHOOGLOO": 
    	            	 if(element.equals("SHOOGLOO"))
    		    	       {     
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
    		    	
    		    	 
    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
		    		    
    		    	 Isreprice_AE_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    	            	}
    	            break;
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	 
   
	        
    	        int TotalValue = Isreprice_AE_TS_Wego + Isreprice_AE_TS_b2c +Isreprice_AE_TS_MobIos +Isreprice_AE_TS_skyscan+Isreprice_AE_TS_MobAnd
		 		        + Isreprice_AE_TS_Dhrehlat+ Isreprice_AE_TS_Aviasa +Isreprice_AE_TS_Kayak + Isreprice_AE_TS_Dohop+ Isreprice_AE_TS_Farecompare +Isreprice_AE_TS_Shoogloo;
		 				  
		         Isreprice_AE_TS_Transaction_Total = TotalValue; 
		 				 System.out.println("Isreprice_ Trancation Successfull total:::----"+Isreprice_AE_TS_Transaction_Total);
		 				
		 				int Other =Isreprice_AE_TS_Dhrehlat + Isreprice_AE_TS_Aviasa +Isreprice_AE_TS_Kayak+ Isreprice_AE_TS_Dohop+ Isreprice_AE_TS_Farecompare+ Isreprice_AE_TS_Shoogloo;
		 		 	    	
		 				Isreprice_AE_TS_Other_TrancationSuccessfull = Other; 
		 					System.out.println(" Isreprice_ Others domains Trancation Successfull total :::----"+Isreprice_AE_TS_Other_TrancationSuccessfull);
		 	        
		 	        
       
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	
    	
    	
    	
    	}
    	
    	
    	//******************* ConformationPending*********************************************
    	Select Conpending=new Select(Loginpage.BookingSatus());
    	Conpending.selectByIndex(4);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		String IScomTrancount=Loginpage.FlightResults_text().getText();
		System.out.println(IScomTrancount);
		
		
    	String Iscomtranstr = IScomTrancount.trim();
    	String[] IScomtransplited = Iscomtranstr.split("\\:");
    	System.out.println("No of Results Count"+IScomtransplited[1]);
    	Thread.sleep(1000);
    	String ConPen="Confirmation Pending";
    	
    	if("Flight Search Results : 0".equals(IScomTrancount))
    	{
    		Isreprice_AEConformationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",ConPen,0,0,0,0,0,0);
    		System.out.println("TrancationSuccess total:::----0");
    		
    		Isreprice_AE_CP_Wego =0;
    		Isreprice_AE_CP_b2c =0;
    		Isreprice_AE_CP_MobIos =0;
    		Isreprice_AE_CP_MobAnd =0;
    		Isreprice_AE_CP_skyscan =0;
 	         
    		Isreprice_AE_CP_Dhrehlat =0;
    		Isreprice_AE_CP_Aviasa =0;
    		Isreprice_AE_CP_Kayak =0;
	         
    		Isreprice_AE_CP_Dohop =0;
    		Isreprice_AE_CP_Farecompare =0;
    		Isreprice_AE_CP_Shoogloo =0;
 	         
	         int TotalValue = Isreprice_AE_CP_Wego + Isreprice_AE_CP_b2c +Isreprice_AE_CP_MobIos +Isreprice_AE_CP_skyscan+Isreprice_AE_CP_MobAnd
	 		        + Isreprice_AE_CP_Dhrehlat+ Isreprice_AE_CP_Aviasa +Isreprice_AE_CP_Kayak + Isreprice_AE_CP_Dohop+ Isreprice_AE_CP_Farecompare +Isreprice_AE_CP_Shoogloo;
	 				  
	         Isreprice_AE_CP_COnformationPending_Total = TotalValue; 
	 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_AE_CP_COnformationPending_Total);
	 				
	 				int Other =Isreprice_AE_CP_Dhrehlat + Isreprice_AE_CP_Aviasa +Isreprice_AE_CP_Kayak+ Isreprice_AE_CP_Dohop+ Isreprice_AE_CP_Farecompare+ Isreprice_AE_CP_Shoogloo;
	 		 	    	
	 				Isreprice_AE_CP_Other_ConformationPending = Other; 
	 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_AE_CP_Other_ConformationPending);
	 	        
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : WE1)
    		  {
    			 list.add(element1.getText());
    		  }
    		  ArrayList<String> unique = removeDuplicates(list);
    		  System.out.println("unique:"+unique.size());
    	        for (String element : unique) {
    	            System.out.println("element:"+element);
    	            
    	             
    	            
    	            
    	            String number=element;
    	           for(int j=0;j<unique.size();j++)
    	           {	
    	            switch(number){  
    	            case "WEGO": 
    	            	if(element.equals("WEGO")) 
    		    	       {
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
    		    	
    		    	
    		    	Isreprice_AE_CP_Wego =Integer.parseInt(Com_TS_Wego1);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Wego1 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Isreprice_AE_CP_Wego =Integer.parseInt(Com_TS_Wego1);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "B2C": 
    	            	   
    		    	       if(element.equals("B2C"))
    		    	       {
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
    		    	  
	    		    	
	    		    	
    		    	  Isreprice_AE_CP_b2c =Integer.parseInt(Com_TS_b2c1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Isreprice_AE_CP_b2c =Integer.parseInt(Com_TS_b2c1);
	    	            	}
    		    	      
    	            break;  
    	            case "MOBIOS": 
    	            	 if(element.equals("MOBIOS"))
    		    	       {   
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
    		    	
    		    	
    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
	    		    
    		    	 Isreprice_AE_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
    			    		    
    	            		 Isreprice_AE_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    	            	}
    	            break; 
    	            case "MOBAPP": 
    	            	 if(element.equals("MOBAPP"))
    		    	       {   
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
    		    	 
    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
		    		    
    		    	 Isreprice_AE_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    	            	}
    		    	      
    	            break; 
    	            case "SKYSCN": 
    	            	 if(element.equals("SKYSCN"))
    		    	       {        
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
    		    	
    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
		    		    
    		    	 Isreprice_AE_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "DHREHLAT": 
    	            	  if(element.equals("DHREHLAT"))
    		    	       {   
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
    		    	
    		    	
    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
	    		    
    		    	Isreprice_AE_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
    			    		    
    	            			Isreprice_AE_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    	            	}
    	            break; 
    	            case "AVIASALES": 
    	            	  if(element.equals("AVIASALES"))
    		    	       {        
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
    		    	
    		    	
    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
	    		    
    		    	Isreprice_AE_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_AE_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "KAYAK": 
    	            	  if(element.equals("KAYAK"))
    		    	       {   
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
    		    	
    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
	    		    
    		    	Isreprice_AE_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_AE_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    	            	}
    		    	       
    	            break; 
    	            case "DOHOP": 
    	            	if(element.equals("DOHOP"))
    		    	       {  
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
    		    	 
    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
		    		    
    		    	 Isreprice_AE_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
			    		    
    	            		Isreprice_AE_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
    	            	}
    		    	     
    	            break;
    	            case "FARECOMPARE": 
    	            	
    	            	  if(element.equals("FARECOMPARE"))
    		    	       {  
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
    		    	 
    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
		    		    
    		    	 Isreprice_AE_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Isreprice_AE_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    	            	}
    		    	      
    	            break; 
    	            case "SHOOGLOO": 
    	            	 if(element.equals("SHOOGLOO"))
    		    	       {     
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
    		    	
    		    	 
    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
		    		    
    		    	 Isreprice_AE_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    	            	}
    	            break;
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	  
    	  

	        
    	        int TotalValue = Isreprice_AE_CP_Wego + Isreprice_AE_CP_b2c +Isreprice_AE_CP_MobIos +Isreprice_AE_CP_skyscan+Isreprice_AE_CP_MobAnd
		 		        + Isreprice_AE_CP_Dhrehlat+ Isreprice_AE_CP_Aviasa +Isreprice_AE_CP_Kayak + Isreprice_AE_CP_Dohop+ Isreprice_AE_CP_Farecompare +Isreprice_AE_CP_Shoogloo;
		 				  
		         Isreprice_AE_CP_COnformationPending_Total = TotalValue; 
		 				 System.out.println("Isreprice_ Conformation Pending total:::----"+Isreprice_AE_CP_COnformationPending_Total);
		 				
		 				int Other =Isreprice_AE_CP_Dhrehlat + Isreprice_AE_CP_Aviasa +Isreprice_AE_CP_Kayak+ Isreprice_AE_CP_Dohop+ Isreprice_AE_CP_Farecompare+ Isreprice_AE_CP_Shoogloo;
		 		 	    	
		 				Isreprice_AE_CP_Other_ConformationPending = Other; 
		 					System.out.println(" Isreprice_ Others domains Conformation Pending total :::----"+Isreprice_AE_CP_Other_ConformationPending);
		 	        
		 	        
		 	        
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	}
    	
    	//******************* Partially Ticketed*********************************************
    	Select Partialy=new Select(Loginpage.BookingSatus());
    	Partialy.selectByIndex(2);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		String IScomParticket=Loginpage.FlightResults_text().getText();
		System.out.println(IScomParticket);
		
		
    	String Iscompar = IScomParticket.trim();
    	String[] IScompartiplited = Iscompar.split("\\:");
    	System.out.println("No of Results Count"+IScompartiplited[1]);
    	Thread.sleep(1000);
    	String PartillyTicket="Partially Ticketed";
    	
    	if("Flight Search Results : 0".equals(IScomParticket))
    	{
    		Isreprice_AETrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",PartillyTicket,0,0,0,0,0,0);
    		System.out.println("TrancationSuccess total:::----0");
    		
    		Isreprice_AE_PT_Wego =0;
    		Isreprice_AE_PT_b2c =0;
    		Isreprice_AE_PT_MobIos =0;
    		Isreprice_AE_PT_MobAnd =0;
    		Isreprice_AE_PT_skyscan =0;
 	         
    		Isreprice_AE_PT_Dhrehlat =0;
    		Isreprice_AE_PT_Aviasa =0;
    		Isreprice_AE_PT_Kayak =0;
	         
    		Isreprice_AE_PT_Dohop =0;
    		Isreprice_AE_PT_Farecompare =0;
    		Isreprice_AE_PT_Shoogloo =0;
 	         
	         int TotalValue = Isreprice_AE_PT_Wego + Isreprice_AE_PT_b2c +Isreprice_AE_PT_MobIos +Isreprice_AE_PT_skyscan+Isreprice_AE_PT_MobAnd
	 		        + Isreprice_AE_PT_Dhrehlat+ Isreprice_AE_PT_Aviasa +Isreprice_AE_PT_Kayak + Isreprice_AE_PT_Dohop+ Isreprice_AE_PT_Farecompare +Isreprice_AE_PT_Shoogloo;
	 				  
	         Isreprice_AE_PT_PartiallyTicketed_Total = TotalValue; 
	 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_AE_PT_PartiallyTicketed_Total);
	 				
	 				int Other =Isreprice_AE_PT_Dhrehlat + Isreprice_AE_PT_Aviasa +Isreprice_AE_PT_Kayak+ Isreprice_AE_PT_Dohop+ Isreprice_AE_PT_Farecompare+ Isreprice_AE_PT_Shoogloo;
	 		 	    	
	 				Isreprice_AE_PT_Other_PartiallyTicketed = Other; 
	 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_AE_PT_Other_PartiallyTicketed);
	 	        
	 	        
	        
          
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Conformation Pending:" + WE1.size());
    		
    		ArrayList<String>list=new ArrayList<>();
    		
    		 for (WebElement element1 : WE1)
    		  {
    			 list.add(element1.getText());
    		  }
    		  ArrayList<String> unique = removeDuplicates(list);
    		  System.out.println("unique:"+unique.size());
    	        for (String element : unique) {
    	            System.out.println("element:"+element);
    	            
    	             
    	            
    	            
    	            String number=element;
    	           for(int j=0;j<unique.size();j++)
    	           {	
    	            switch(number){  
    	            case "WEGO": 
    	            	if(element.equals("WEGO")) 
    		    	       {
    		    	        
    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

    		    	System.out.println("No of WEGO Conformation Pending:" + SWEGO.size());
    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
    		    	
    		    	
    		    	Isreprice_AE_PT_Wego =Integer.parseInt(Com_TS_Wego1);
    		    	
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Wego1 =String.format("%1s",0);
    	    		    	
    	    		    	
    	            		Isreprice_AE_PT_Wego =Integer.parseInt(Com_TS_Wego1);
    	            	}
    		    	      
    	            break; 
    	            
    	            case "B2C": 
    	            	   
    		    	       if(element.equals("B2C"))
    		    	       {
    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

    		    	  System.out.println("No of B2C Conformation Pending:" + SB2C.size());
    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
    		    	  
	    		    	
	    		    	
    		    	  Isreprice_AE_PT_b2c =Integer.parseInt(Com_TS_b2c1);
    		    	       }
    		    	       else
	    	            	{
    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
    		    		    	  
   		    		    	
   		    		    	
    		    	    	   Isreprice_AE_PT_b2c =Integer.parseInt(Com_TS_b2c1);
	    	            	}
    		    	      
    	            break;  
    	            case "MOBIOS": 
    	            	 if(element.equals("MOBIOS"))
    		    	       {   
    		    	       
    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

    		    	System.out.println("No of MOBIOS Conformation Pending:" + SMOBIOS.size());
    		    	
    		    	
    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
	    		    
    		    	 Isreprice_AE_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
    			    		    
    	            		 Isreprice_AE_PT_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    	            	}
    	            break; 
    	            case "MOBAPP": 
    	            	 if(element.equals("MOBAPP"))
    		    	       {   
    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

    		    	System.out.println("No of MOBAPP Conformation Pending:" + SMOBAPP.size());
    		    	 
    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
		    		    
    		    	 Isreprice_AE_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_PT_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    	            	}
    		    	      
    	            break; 
    	            case "SKYSCN": 
    	            	 if(element.equals("SKYSCN"))
    		    	       {        
    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

    		    	System.out.println("No of SKYSCN Conformation Pending:" + SSKYSCN.size());
    		    	
    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
		    		    
    		    	 Isreprice_AE_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_PT_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    	            	}
    		    	     
    		    	       
    	            break;  
    	            case "DHREHLAT": 
    	            	  if(element.equals("DHREHLAT"))
    		    	       {   
    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

    		    	System.out.println("No of DHREHLAT Conformation Pending:" + DHREHLAT.size());
    		    	
    		    	
    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
	    		    
    		    	Isreprice_AE_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
    		    	       }
    	            	  else
	    	            	{
    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
    			    		    
    	            			Isreprice_AE_PT_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    	            	}
    	            break; 
    	            case "AVIASALES": 
    	            	  if(element.equals("AVIASALES"))
    		    	       {        
    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

    		    	System.out.println("No of AVIASALES Conformation Pending:" + AVIASALES.size());
    		    	
    		    	
    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
	    		    
    		    	Isreprice_AE_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
    		    	
    		    	       }
    	            	  else
	    	            	{
    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_AE_PT_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    	            	}
    		    	      
    		    	     
    	            break;
    	            case "KAYAK": 
    	            	  if(element.equals("KAYAK"))
    		    	       {   
    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

    		    	System.out.println("No of KAYAK Conformation Pending:" + KAYAK.size());
    		    	
    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
	    		    
    		    	Isreprice_AE_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
    		    	       }
    		    	       
    	            	  else
	    	            	{
    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
    			    		    
    	            		  Isreprice_AE_PT_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    	            	}
    		    	       
    	            break; 
    	            case "DOHOP": 
    	            	if(element.equals("DOHOP"))
    		    	       {  
    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

    		    	System.out.println("No of DOHOP Conformation Pending:" + DOHOP.size());
    		    	 
    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
		    		    
    		    	 Isreprice_AE_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
    		    	       }
    	            	else
    	            	{
    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
			    		    
    	            		Isreprice_AE_PT_Dohop =Integer.parseInt(Com_TS_Dohop1);
    	            	}
    		    	     
    	            break;
    	            case "FARECOMPARE": 
    	            	
    	            	  if(element.equals("FARECOMPARE"))
    		    	       {  
    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

    		     	System.out.println("No of FARECOMPARE Conformation Pending:" + FARECOMPARE.size());
    		    	 
    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
		    		    
    		    	 Isreprice_AE_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
    		    	       }
    	            	  else
	    	            	{
    	            		  
    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
    				    		    
    		    		    	 Isreprice_AE_PT_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    	            	}
    		    	      
    	            break; 
    	            case "SHOOGLOO": 
    	            	 if(element.equals("SHOOGLOO"))
    		    	       {     
    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

    		    	System.out.println("No of SHOOGLOO Conformation Pending:" + SHOOGLOO.size());
    		    	
    		    	 
    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
		    		    
    		    	 Isreprice_AE_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
    		    	 
    		    	
    		    	       }
    	            	 else
	    	            	{
    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
 			    		    
    	            		 Isreprice_AE_PT_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    	            	}
    	            break;
    	            default:System.out.println("Not in 10, 20 or 30");  
    	         
    	            }
    	           }
    	        }
    	  
    	  

	        
    	        int TotalValue = Isreprice_AE_PT_Wego + Isreprice_AE_PT_b2c +Isreprice_AE_PT_MobIos +Isreprice_AE_PT_skyscan+Isreprice_AE_PT_MobAnd
		 		        + Isreprice_AE_PT_Dhrehlat+ Isreprice_AE_PT_Aviasa +Isreprice_AE_PT_Kayak + Isreprice_AE_PT_Dohop+ Isreprice_AE_PT_Farecompare +Isreprice_AE_PT_Shoogloo;
		 				  
		         Isreprice_AE_PT_PartiallyTicketed_Total = TotalValue; 
		 				 System.out.println("Isreprice_ Partially Ticketed total:::----"+Isreprice_AE_PT_PartiallyTicketed_Total);
		 				
		 				int Other =Isreprice_AE_PT_Dhrehlat + Isreprice_AE_PT_Aviasa +Isreprice_AE_PT_Kayak+ Isreprice_AE_PT_Dohop+ Isreprice_AE_PT_Farecompare+ Isreprice_AE_PT_Shoogloo;
		 		 	    	
		 				Isreprice_AE_PT_Other_PartiallyTicketed = Other; 
		 					System.out.println(" Isreprice_ Others domains Partially Ticketed total :::----"+Isreprice_AE_PT_Other_PartiallyTicketed);
		 	        
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
    	}
    	
    	
    	//*********************Transaction Hold*****************************
    	Select transactionHold=new Select(Loginpage.BookingSatus());
    	transactionHold.selectByIndex(1);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		waitforElement(driver);
		String comTranHold=Loginpage.FlightResults_text().getText();
		System.out.println(comTranHold);
		
		
    	String comtranstrhold = comTranHold.trim();
    	String[] comtranholdsplited = comtranstrhold.split("\\:");
    	System.out.println("No of Results Count"+comtranholdsplited[1]);
    	Thread.sleep(1000);
    	
    	String tranHold="Transaction Hold";
    	if("Flight Search Results : 0".equals(comTranHold))
    	{
    	
    		Isreprice_AETransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
    		System.out.println("TransactionHold total:::----0");
    		
    		Isreprice_AE_TH_Wego =0;
    		Isreprice_AE_TH_b2c =0;
    		Isreprice_AE_TH_MobIos =0;
    		Isreprice_AE_TH_MobAnd =0;
    		Isreprice_AE_TH_skyscan =0;
		         
    		Isreprice_AE_TH_Dhrehlat =0;
    		Isreprice_AE_TH_Aviasa =0;
    		Isreprice_AE_TH_Kayak =0;
	         
    		Isreprice_AE_TH_Dohop =0;
    		Isreprice_AE_TH_Farecompare =0;
    		Isreprice_AE_TH_Shoogloo =0;
    		
	         int TotalValue =Isreprice_AE_TH_Wego + Isreprice_AE_TH_b2c +Isreprice_AE_TH_MobIos + Isreprice_AE_TH_MobAnd+ Isreprice_AE_TH_skyscan
	        +Isreprice_AE_TH_Dhrehlat +Isreprice_AE_TH_Aviasa +Isreprice_AE_TH_Kayak +Isreprice_AE_TH_Dohop+ Isreprice_AE_TH_Farecompare + Isreprice_AE_TH_Shoogloo ;
	         Isreprice_AE_TH_Transactionhold_total =  TotalValue; 
			 
			 int otherTotal=Isreprice_AE_TH_Dhrehlat+ Isreprice_AE_TH_Aviasa +Isreprice_AE_TH_Kayak + Isreprice_AE_TH_Dohop+ Isreprice_AE_TH_Farecompare +Isreprice_AE_TH_Shoogloo;
			 Isreprice_AE_Other_TH_Transactionhold_total =  otherTotal; 
		System.out.println("TransactionHold total:::----"+Isreprice_AE_Other_TH_Transactionhold_total);
			 
			 
			System.out.println("TransactionHold total:::----"+Isreprice_AE_TH_Transactionhold_total);
    	}
    	else
    	{
    	
    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
    		 
    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
    		  
    		  
    		  ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	Isreprice_AE_TH_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	    	            		Isreprice_AE_TH_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  Isreprice_AE_TH_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    	    	   Isreprice_AE_TH_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 Isreprice_AE_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		 Isreprice_AE_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 Isreprice_AE_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Isreprice_AE_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 Isreprice_AE_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Isreprice_AE_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	Isreprice_AE_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			Isreprice_AE_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	Isreprice_AE_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Isreprice_AE_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	Isreprice_AE_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Isreprice_AE_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 Isreprice_AE_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		Isreprice_AE_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 Isreprice_AE_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 Isreprice_AE_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 Isreprice_AE_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Isreprice_AE_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
    	
    	
        
        
        
   
	    	        int TotalValue =Isreprice_AE_TH_Wego + Isreprice_AE_TH_b2c +Isreprice_AE_TH_MobIos + Isreprice_AE_TH_MobAnd+ Isreprice_AE_TH_skyscan
	    			        +Isreprice_AE_TH_Dhrehlat +Isreprice_AE_TH_Aviasa +Isreprice_AE_TH_Kayak +Isreprice_AE_TH_Dohop+ Isreprice_AE_TH_Farecompare + Isreprice_AE_TH_Shoogloo ;
	    			         Isreprice_AE_TH_Transactionhold_total =  TotalValue; 
	    					 
	    					 int otherTotal=Isreprice_AE_TH_Dhrehlat+ Isreprice_AE_TH_Aviasa +Isreprice_AE_TH_Kayak + Isreprice_AE_TH_Dohop+ Isreprice_AE_TH_Farecompare +Isreprice_AE_TH_Shoogloo;
	    					 Isreprice_AE_Other_TH_Transactionhold_total =  otherTotal; 
	    				System.out.println("TransactionHold total:::----"+Isreprice_AE_Other_TH_Transactionhold_total);
	    					 
	    					 
	    					System.out.println("TransactionHold total:::----"+Isreprice_AE_TH_Transactionhold_total);
    	}
    	
	}
				
	
		
public static void AllStatus_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
			
			COMDomainNames=String.format("%30s %30s %15s %15s %15s %15s %15s", "COM", "WEGO", "B2C", "MOBIOS", "MOBAPP","SKYSCN", "TOTAL");
			
		//	Loginpage.COM_link().click();
			driver.get("http://callcenter.rehlat.com/");
	    	Thread.sleep(1000);
	    	Login.LoginCallCenter(iTestCaseRow);
	    	Thread.sleep(1000);
			
	    	WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
	    	
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
	    	System.out.println("Current Url"+urldomain[1]);
	    	String[] urldomain1 = urldomain[1].split("\\/");
	    	System.out.println("Domain Name::"+urldomain1[0]);
	    	
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
	    	 Calendar cal = Calendar.getInstance();
		  	   DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	   cal.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));  
		  	  String st=dateFormat.format(cal.getTime());
		  	   String[] spliteddate = st.split("-");
		  	   System.out.println("Split the Date::"+spliteddate[0]);
	    	
	    	
			Loginpage.Select_dateFrom(spliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
	    	Select transaction1=new Select(Loginpage.BookingSatus());
	    	transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
	    	String comtranstr = comTrancount.trim();
	    	String[] comtransplited = comtranstr.split("\\:");
	    	System.out.println("No of Results Count"+comtransplited[1]);
	    	Thread.sleep(1000);
	    	String tran="Transaction Successful";
	    	
	    	if("Flight Search Results : 0".equals(comTrancount))
	    	{
	    		COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	    		
	    		  Com_TS_Wego =0;
	 	          Com_TS_b2c =0;
	 	         Com_TS_MobIos =0;
	 	         Com_TS_MobAnd =0;
	 	         Com_TS_skyscan =0;
	 	         
	 	        Com_TS_Dhrehlat =0;
		         Com_TS_Aviasa =0;
		         Com_TS_Kayak =0;
		         
		         Com_TS_Dohop =0;
		         Com_TS_Farecompare =0;
		         Com_TS_Shoogloo =0;
		         Com_TS_B2bAgent =0;
		         Com_TS_B2b_Skyshop =0;
	 	         
		         int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobIos +Com_TS_skyscan+Com_TS_MobAnd
		 		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo+Com_TS_B2bAgent+Com_TS_B2b_Skyshop;
		 				  
		 		        Com_TS_Transaction_Total = TotalValue; 
		 				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
		 				
		 				int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo+Com_TS_B2bAgent+Com_TS_B2b_Skyshop;
		 		 	    	
		 				 Com_TS_Other_TrancationSuccessfull = Other; 
		 					System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	 Com_TS_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	   	    		    	 Com_TS_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  Com_TS_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    		    	  Com_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 Com_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	    		    	 Com_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 Com_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 Com_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 Com_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	Com_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			Com_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	Com_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Com_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	Com_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Com_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 Com_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		Com_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 Com_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 Com_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 Com_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 Com_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2BAgent": 
	    	            	 if(element.equals("B2BAgent"))
	    		    	       {     
	    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

	    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
			    		    
	    		    	 Com_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2B_SKYSHOP": 
	    	            	 if(element.equals("B2B_SKYSHOP"))
	    		    	       {     
	    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

	    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
			    		    
	    		    	 Com_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
	    	
	    	              
	    	
	    	
	    	
	    	      
	      //Total count
	    	    // Com_TS_Wego =String.format("%1s",SWEGO.size());
		       // Com_TS_b2c =String.format("%1s",SB2C.size());
		        // Com_TS_MobIos =String.format("%1s",SMOBIOS.size());
		       //  Com_TS_MobAnd =String.format("%1s",SMOBAPP.size());
		        // Com_TS_skyscan =String.format("%1s",SSKYSCN.size());
		         //Com_TS_Dhrehlat =String.format("%1s",DHREHLAT.size());
		        /* Com_TS_Aviasa =String.format("%1s",AVIASALES.size());
		         Com_TS_Kayak =String.format("%1s",KAYAK.size());
		         
		         Com_TS_Dohop =String.format("%1s",DOHOP.size());
		         Com_TS_Farecompare =String.format("%1s",FARECOMPARE.size());
		         Com_TS_Shoogloo =String.format("%1s",SHOOGLOO.size());*/
		         
		         System.out.println("Com_TS_Wego:"+Com_TS_Wego);
		         System.out.println("Com_TS_b2c:"+Com_TS_b2c);
		         System.out.println("Com_TS_MobIos:"+Com_TS_MobIos);
		         System.out.println("Com_TS_skyscan:"+Com_TS_skyscan);
		         System.out.println("Com_TS_Dhrehlat:"+Com_TS_Dhrehlat);
		         System.out.println("Com_TS_Aviasa:"+Com_TS_Aviasa);
		         System.out.println("Com_TS_Kayak:"+Com_TS_Kayak);
		         System.out.println("Com_TS_Dohop:"+Com_TS_Dohop);
		         System.out.println("Com_TS_Farecompare:"+Com_TS_Farecompare);
		         System.out.println("Com_TS_Shoogloo:"+Com_TS_Shoogloo);
		         System.out.println("Com_TS_MobAnd:"+Com_TS_MobAnd);
		        
		        int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobIos +Com_TS_skyscan+Com_TS_MobAnd
		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo+Com_TS_B2bAgent+Com_TS_B2b_Skyshop;
				  
		        Com_TS_Transaction_Total = TotalValue; 
				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
				
				 int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo+Com_TS_B2bAgent+Com_TS_B2b_Skyshop;
		 	    	
				 Com_TS_Other_TrancationSuccessfull =Other; 
					System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);
	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}
	    	   
	    	SupplierCom.SupplierCOM_TS(driver,comTrancount);
	    	//Suppliers_Com(iTestCaseRow, driver);
	    
	    	//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String conpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(conpendingcount);
			
			
	    	String comconpendingstr = conpendingcount.trim();
	    	String[] comconpendingplited = comconpendingstr.split("\\:");
	    	System.out.println("No of Results Count"+comconpendingplited[1]);
	    	Thread.sleep(1000);
	    	String conformation_pending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(conpendingcount))
	    	{
	    		COMConfirmationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",conformation_pending,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	    		
	    		  Com_CP_Wego =0;
	 	          Com_CP_b2c =0;
	 	         Com_CP_MobIos =0;
	 	         Com_CP_MobAnd =0;
	 	         Com_CP_skyscan =0;
	 	         
	 	        Com_CP_Dhrehlat =0;
		         Com_CP_Aviasa =0;
		         Com_CP_Kayak =0;
		         
		         Com_CP_Dohop =0;
		         Com_CP_Farecompare =0;
		         Com_CP_Shoogloo =0;
		         Com_CP_B2bAgent=0;
		         Com_CP_B2b_Skyshop=0;
	 	         
		         int TotalValue = Com_CP_Wego + Com_CP_b2c +Com_CP_MobIos +Com_CP_skyscan+Com_CP_MobAnd
		 		        + Com_CP_Dhrehlat+ Com_CP_Aviasa +Com_CP_Kayak + Com_CP_Dohop+ Com_CP_Farecompare +Com_CP_Shoogloo+Com_CP_B2bAgent+Com_CP_B2b_Skyshop;
		 				  
		 		        Com_CP_conformation_pending_Total = TotalValue; 
		 				 System.out.println("Confirmation Pending total:::----"+Com_CP_conformation_pending_Total);
		 				
		 				int Other =Com_CP_Dhrehlat + Com_CP_Aviasa +Com_CP_Kayak+ Com_CP_Dohop+ Com_CP_Farecompare+ Com_CP_Shoogloo+Com_CP_B2bAgent+Com_CP_B2b_Skyshop;
		 		 	    	
		 				 Com_CP_Other_conformation_pending = Other; 
		 					System.out.println(" Others domains Confirmation Pending total :::----"+Com_CP_Other_conformation_pending);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	 Com_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	   	    		    	 Com_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  Com_CP_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    		    	  Com_CP_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 Com_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	    		    	 Com_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 Com_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 Com_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 Com_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	Com_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			Com_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	Com_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Com_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	Com_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  Com_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 Com_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		Com_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 Com_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 Com_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 Com_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 Com_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2BAgent": 
	    	            	 if(element.equals("B2BAgent"))
	    		    	       {     
	    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

	    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
			    		    
	    		    	 Com_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2B_SKYSHOP": 
	    	            	 if(element.equals("B2B_SKYSHOP"))
	    		    	       {     
	    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

	    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
			    		    
	    		    	 Com_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 Com_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
	    	
	    	              
	    	
	    	
	    	
	    	      
	    
		        
	    	        int TotalValue = Com_CP_Wego + Com_CP_b2c +Com_CP_MobIos +Com_CP_skyscan+Com_CP_MobAnd
			 		        + Com_CP_Dhrehlat+ Com_CP_Aviasa +Com_CP_Kayak + Com_CP_Dohop+ Com_CP_Farecompare +Com_CP_Shoogloo+Com_CP_B2bAgent+Com_CP_B2b_Skyshop;
			 				  
			 		        Com_CP_conformation_pending_Total = TotalValue; 
			 				 System.out.println("Confirmation Pending total:::----"+Com_CP_conformation_pending_Total);
			 				
			 				int Other =Com_CP_Dhrehlat + Com_CP_Aviasa +Com_CP_Kayak+ Com_CP_Dohop+ Com_CP_Farecompare+ Com_CP_Shoogloo+Com_CP_B2bAgent+Com_CP_B2b_Skyshop;
			 		 	    	
			 				 Com_CP_Other_conformation_pending = Other; 
			 					System.out.println(" Others domains Confirmation Pending total :::----"+Com_CP_Other_conformation_pending);
			 	        
			 	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}
	    	SupplierCom.SupplierCOM_CP(driver,conpendingcount);
	    	
//Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMRepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		 Com_RP_Wego =0;
		         Com_RP_b2c =0;
		         Com_RP_MobIos =0;
		         Com_RP_MobAnd =0;
		         Com_RP_skyscan =0;
		         
		         Com_RP_Dhrehlat =0;
		         Com_RP_Aviasa =0;
		         Com_RP_Kayak =0;
		         
		         Com_RP_Dohop =0;
		         Com_RP_Farecompare =0;
		         Com_RP_Shoogloo =0;
		         Com_RP_B2bAgent=0;
		         Com_RP_B2b_Skyshop=0;
		         
		         int TotalValue = Com_RP_Wego+ Com_RP_b2c+Com_RP_MobIos + Com_RP_MobAnd+Com_RP_skyscan
			        +Com_RP_Dhrehlat+ Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo+Com_RP_B2bAgent+Com_RP_B2b_Skyshop;
			       
			        
			        
			        Com_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+Com_RP_Repricing_Total);
					
					
					int Other =Com_RP_Dhrehlat +Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo+Com_RP_B2bAgent+Com_RP_B2b_Skyshop;
			 	    	
					 Com_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+Com_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 Com_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 Com_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = Com_RP_Wego+ Com_RP_b2c+Com_RP_MobIos + Com_RP_MobAnd+Com_RP_skyscan
		    			        +Com_RP_Dhrehlat+ Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo+Com_RP_B2bAgent+Com_RP_B2b_Skyshop;
		    			       
		    			        
		    			        
		    			        Com_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+Com_RP_Repricing_Total);
		    					
		    					
		    					int Other =Com_RP_Dhrehlat +Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo+Com_RP_B2bAgent+Com_RP_B2b_Skyshop;
		    			 	    	
		    					 Com_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+Com_RP_Other_Repricingtotal);
	    	
				
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	SupplierCom.SupplierCOM_RP(driver,Rcount);
	    	
	    	
	    	
	    
	    	//***********************Sold Outs**********************************
			Select s=new Select(Loginpage.BookingSatus());
			s.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
	    	String str = count.trim();
	    	String[] splited = str.split("\\:");
	    	System.out.println("No of Results Count"+splited[1]);
	    	Thread.sleep(1000);
	    	String soldout="SoldOuts";
	    	
	    	
	    	
	    	if("Flight Search Results : 0".equals(count))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMSoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
	    		
	    		 Com_SD_Wego =0;
		         Com_SD_b2c =0;
		         Com_SD_MobIos =0;
		         Com_SD_MobAnd =0;
		         Com_SD_skyscan =0;
		         
		         Com_SD_Dhrehlat =0;
		         Com_SD_Aviasa =0;
		         Com_SD_Kayak =0;
		         
		         Com_SD_Dohop =0;
		         Com_SD_Farecompare =0;
		         Com_SD_Shoogloo =0;
		         Com_SD_B2bAgent=0;
		         Com_SD_B2b_Skyshop=0;
		         
		         int TotalValue = Com_SD_Wego+ Com_SD_b2c+Com_SD_MobIos + Com_SD_MobAnd+Com_SD_skyscan
			        +Com_SD_Dhrehlat+ Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo+Com_SD_B2bAgent+Com_SD_B2b_Skyshop;
			       
			        
			        
			        Com_SD_SoldOut_Total = TotalValue; 
					System.out.println("SoldOuts total:::----"+Com_SD_SoldOut_Total);
					
					
					int Other =Com_SD_Dhrehlat +Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo+Com_SD_B2bAgent+Com_SD_B2b_Skyshop;
			 	    	
					 Com_SD_Other_SoldOutstotal = Other; 
						System.out.println(" Others domains SoldOuts total:::----"+Com_SD_Other_SoldOutstotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of soldOuts:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 Com_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 Com_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = Com_SD_Wego+ Com_SD_b2c+Com_SD_MobIos + Com_SD_MobAnd+Com_SD_skyscan
		    			        +Com_SD_Dhrehlat+ Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo+Com_SD_B2bAgent+Com_SD_B2b_Skyshop;
		    			       
		    			        
		    			        
		    			        Com_SD_SoldOut_Total = TotalValue; 
		    					System.out.println("SoldOuts total:::----"+Com_SD_SoldOut_Total);
		    					
		    					
		    					int Other =Com_SD_Dhrehlat +Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo+Com_SD_B2bAgent+Com_SD_B2b_Skyshop;
		    			 	    	
		    					 Com_SD_Other_SoldOutstotal = Other; 
		    						System.out.println(" Others domains SoldOuts total:::----"+Com_SD_Other_SoldOutstotal);
	    	
	    	
				
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	
	    	SupplierCom.SupplierCOM_SD(driver,count);
		
		
	    	//***********************Cancelled**********************************
			Select Cancelled=new Select(Loginpage.BookingSatus());
			Cancelled.selectByIndex(8);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String Cancelledcount=Loginpage.FlightResults_text().getText();
			System.out.println(Cancelledcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String strCancelled = Cancelledcount.trim();
	    	String[] Cancelledsplited = strCancelled.split("\\:");
	    	System.out.println("No of Results Count"+Cancelledsplited[1]);
	    	Thread.sleep(1000);
	    	String Cancelled1="Cancelled";
	    	
	    	
	    	
	    	if("Flight Search Results : 0".equals(Cancelledcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		COMCancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
	    		
	    		 Com_CN_Wego =0;
		         Com_CN_b2c =0;
		         Com_CN_MobIos =0;
		         Com_CN_MobAnd =0;
		         Com_CN_skyscan =0;
		         
		         Com_CN_Dhrehlat =0;
		         Com_CN_Aviasa =0;
		         Com_CN_Kayak =0;
		         
		         Com_CN_Dohop =0;
		         Com_CN_Farecompare =0;
		         Com_CN_Shoogloo =0;
		         Com_CN_B2bAgent=0;
		         Com_CN_B2b_Skyshop=0;
		         
		         int TotalValue = Com_CN_Wego +Com_CN_b2c +Com_CN_MobIos +Com_CN_MobAnd+ Com_CN_skyscan
 		        +Com_CN_Dhrehlat +Com_CN_Aviasa +Com_CN_Kayak +Com_CN_Dohop+Com_CN_Farecompare+Com_CN_Shoogloo+Com_CN_B2bAgent+Com_CN_B2b_Skyshop;
 				 Com_CN_CancelledTotal = TotalValue; 
 				System.out.println("Cancelled total:::----"+Com_CN_CancelledTotal);
 				
 				int Other =Com_CN_Dhrehlat + Com_CN_Aviasa +Com_CN_Kayak + Com_CN_Dohop+ Com_CN_Farecompare+ Com_CN_Shoogloo+Com_CN_B2bAgent+Com_CN_B2b_Skyshop;
     	    	
				 Com_CN_Other_CancelledTotal = Other; 
 				System.out.println("Cancelled total:::----"+Com_CN_Other_CancelledTotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Cancelled:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_CN_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_CN_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_CN_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_CN_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 Com_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 Com_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		        
		    	        int TotalValue = Com_CN_Wego +Com_CN_b2c +Com_CN_MobIos +Com_CN_MobAnd+ Com_CN_skyscan
		  		        +Com_CN_Dhrehlat +Com_CN_Aviasa +Com_CN_Kayak +Com_CN_Dohop+Com_CN_Farecompare+Com_CN_Shoogloo+Com_CN_B2bAgent+Com_CN_B2b_Skyshop;
		  				 Com_CN_CancelledTotal =  TotalValue; 
		  				System.out.println("Cancelled total:::----"+Com_CN_CancelledTotal);
		  				
		  				int Other =Com_CN_Dhrehlat + Com_CN_Aviasa +Com_CN_Kayak + Com_CN_Dohop+ Com_CN_Farecompare+ Com_CN_Shoogloo+Com_CN_B2bAgent+Com_CN_B2b_Skyshop;
		      	    	
		 				 Com_CN_Other_CancelledTotal =  Other; 
		  				System.out.println("Cancelled total:::----"+Com_CN_Other_CancelledTotal);
	      
	    	}
			
	    	Thread.sleep(2000);
	    	
	    	SupplierCom.SupplierCOM_CN(driver,Cancelledcount);

	    	//*********************Transaction Hold*****************************
	    	Select transactionHold=new Select(Loginpage.BookingSatus());
	    	transactionHold.selectByIndex(1);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String comTranHold=Loginpage.FlightResults_text().getText();
			System.out.println(comTranHold);
			
			
	    	String comtranstrhold = comTranHold.trim();
	    	String[] comtranholdsplited = comtranstrhold.split("\\:");
	    	System.out.println("No of Results Count"+comtranholdsplited[1]);
	    	Thread.sleep(1000);
	    	
	    	String tranHold="Transaction Hold";
	    	if("Flight Search Results : 0".equals(comTranHold))
	    	{
	    	
	    		COMTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
	    		System.out.println("TransactionHold total:::----0");
	    		
	    		 Com_TH_Wego =0;
  		       Com_TH_b2c =0;
  		         Com_TH_MobIos =0;
  		         Com_TH_MobAnd =0;
  		         Com_TH_skyscan =0;
  		         
  		       Com_TH_Dhrehlat =0;
		         Com_TH_Aviasa =0;
		         Com_TH_Kayak =0;
		         
		         Com_TH_Dohop =0;
		         Com_TH_Farecompare =0;
		         Com_TH_Shoogloo =0;
		         Com_TH_B2bAgent=0;
		         Com_TH_B2b_Skyshop=0;
		         
		         int TotalValue =Com_TH_Wego + Com_TH_b2c +Com_TH_MobIos + Com_TH_MobAnd+ Com_TH_skyscan
		        +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo+Com_TH_B2bAgent+Com_TH_B2b_Skyshop ;
				 Com_TH_Transactionhold_total =  TotalValue; 
				 
				 int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo+Com_TH_B2bAgent+Com_TH_B2b_Skyshop;
	        Com_Other_TH_Transactionhold_total =  otherTotal; 
			System.out.println("TransactionHold total:::----"+Com_Other_TH_Transactionhold_total);
				 
				 
				System.out.println("TransactionHold total:::----"+Com_TH_Transactionhold_total);
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
	    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
	    		  
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 Com_TH_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		   	    		    	 Com_TH_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  Com_TH_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    		    	  Com_TH_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 Com_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	    		    	 Com_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 Com_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 Com_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	Com_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			Com_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	Com_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	Com_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  Com_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 Com_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		Com_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 Com_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 Com_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 Com_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	    		    	 Com_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 Com_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 Com_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 Com_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
		    	       
		    	   
	    	
	    	
	        
	        
	        
	   
		    	        int TotalValue =Com_TH_Wego + Com_TH_b2c +Com_TH_MobIos + Com_TH_MobAnd+ Com_TH_skyscan
		 		        +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo+Com_TH_B2bAgent+Com_TH_B2b_Skyshop;
		 				 Com_TH_Transactionhold_total =  TotalValue; 
		 				 
		 				int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo+Com_TH_B2bAgent+Com_TH_B2b_Skyshop;
		 	        Com_Other_TH_Transactionhold_total =  otherTotal; 
		 			System.out.println("TransactionHold total:::----"+Com_Other_TH_Transactionhold_total);
		 				 
		 				 
		 				System.out.println("TransactionHold total:::----"+Com_TH_Transactionhold_total);
	        
	      
	      
	    	}
	    	
	    	SupplierCom.SupplierCOM_TH(driver,comTranHold);
	    	//Suppliers Script com
	    	/*SupplierCom.Suppliers_Com(iTestCaseRow, driver);
	    	Thread.sleep(2000);*/
	    	
	    	
	    	driver.findElement(By.id("IsRepriced")).click();
	    	Thread.sleep(4000);
	    	IsRepriced_TS_SD_CN_TH_com(iTestCaseRow, driver);
	    	
	    	Loginpage.ClickOnUsername().click();
	    	Thread.sleep(1000);
	    	Loginpage.Log_Out().click();
	    	Thread.sleep(2000);
	    	
	    	System.out.println("************************************************************************************");

	
	
}

public static void AllStatus_TS_SD_CN_TH_SA(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.SA_link().click();
	          driver.get("http://sacallcenter.rehlat.com/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
			System.out.println("Current Url"+urldomain[1]);
			String[] urldomain1 = urldomain[1].split("\\/");
			System.out.println("Domain Name::"+urldomain1[0]);
			
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Calendar calSA = Calendar.getInstance();
		  	   DateFormat SAdateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	 calSA.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+SAdateFormat.format(calSA.getTime()));  
		  	  String SAst=SAdateFormat.format(calSA.getTime());
		  	   String[] SAspliteddate = SAst.split("-");
		  	   System.out.println("Split the Date::"+SAspliteddate[0]);


			
			Loginpage.Select_dateFrom(SAspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(SAspliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Flight Search Results : 0".equals(comTrancount))
			{
				SATrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
				System.out.println("TrancationSuccess total:::----0");
				
				 SA_TS_Wego =0;
			        SA_TS_b2c =0;
			         SA_TS_MobIos =0;
			         SA_TS_MobAnd =0;
			         SA_TS_skyscan =0;
			         
			         SA_TS_Dhrehlat =0;
				     SA_TS_Aviasa =0;
				     SA_TS_Kayak =0;
			         
				     SA_TS_Dohop =0;
				     SA_TS_Farecompare =0;
				     SA_TS_Shoogloo =0;
				     SA_TS_B2bAgent=0;
				     SA_TS_B2b_Skyshop=0;
				     
				     int TotalValue = SA_TS_Wego + SA_TS_b2c +SA_TS_MobIos + SA_TS_MobAnd+ SA_TS_skyscan
				        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo+SA_TS_B2bAgent+SA_TS_B2b_Skyshop;
						 SA_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
					
						int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo+SA_TS_B2bAgent+SA_TS_B2b_Skyshop;
			 	    	
					 SA_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				 
				  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
				  
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	SA_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		SA_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  SA_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   SA_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 SA_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 SA_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 SA_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 SA_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	SA_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			SA_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	SA_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	SA_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 SA_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		SA_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 SA_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 SA_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 SA_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 SA_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 SA_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
		    	       
			
		    
		    
		    
		    	        int TotalValue = SA_TS_Wego + SA_TS_b2c +SA_TS_MobIos + SA_TS_MobAnd+ SA_TS_skyscan
				        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo+SA_TS_B2bAgent+SA_TS_B2b_Skyshop;
						 SA_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
					
						int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo+SA_TS_B2bAgent+SA_TS_B2b_Skyshop;
			 	    	
					 SA_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
		      
		  
		  
			}
			SupplierSA.SupplierSA_TS(driver,comTrancount);
			//Suppliers_SA(iTestCaseRow, driver);
			
			//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String conpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(conpendingcount);
			
			
	    	String comconpendingstr = conpendingcount.trim();
	    	String[] comconpendingplited = comconpendingstr.split("\\:");
	    	System.out.println("No of Results Count"+comconpendingplited[1]);
	    	Thread.sleep(1000);
	    	String conformation_pending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(conpendingcount))
	    	{
	    		SAConfirmationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",conformation_pending,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	    		
	    		  SA_CP_Wego =0;
	 	          SA_CP_b2c =0;
	 	         SA_CP_MobIos =0;
	 	         SA_CP_MobAnd =0;
	 	         SA_CP_skyscan =0;
	 	         
	 	        SA_CP_Dhrehlat =0;
		         SA_CP_Aviasa =0;
		         SA_CP_Kayak =0;
		         
		         SA_CP_Dohop =0;
		         SA_CP_Farecompare =0;
		         SA_CP_Shoogloo =0;
		         SA_CP_B2bAgent=0;
		         SA_CP_B2b_Skyshop=0;
		         
		         int TotalValue = SA_CP_Wego + SA_CP_b2c +SA_CP_MobIos +SA_CP_skyscan+SA_CP_MobAnd
		 		        + SA_CP_Dhrehlat+ SA_CP_Aviasa +SA_CP_Kayak + SA_CP_Dohop+ SA_CP_Farecompare +SA_CP_Shoogloo+SA_CP_B2bAgent+SA_CP_B2b_Skyshop;
		 				  
		 		        SA_CP_conformation_pending_Total = TotalValue; 
		 				 System.out.println("Confirmation Pending total:::----"+SA_CP_conformation_pending_Total);
		 				
		 				int Other =SA_CP_Dhrehlat + SA_CP_Aviasa +SA_CP_Kayak+ SA_CP_Dohop+ SA_CP_Farecompare+ SA_CP_Shoogloo+SA_CP_B2bAgent+SA_CP_B2b_Skyshop;
		 		 	    	
		 				 SA_CP_Other_conformation_pending = Other; 
		 					System.out.println(" Others domains Confirmation Pending total :::----"+SA_CP_Other_conformation_pending);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	 SA_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	   	    		    	 SA_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  SA_CP_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    		    	  SA_CP_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 SA_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	    		    	 SA_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 SA_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 SA_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 SA_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 SA_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	SA_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			SA_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	SA_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  SA_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	SA_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  SA_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 SA_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		SA_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 SA_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 SA_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 SA_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 SA_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2BAgent": 
	    	            	 if(element.equals("B2BAgent"))
	    		    	       {     
	    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

	    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
			    		    
	    		    	 SA_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 SA_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2B_SKYSHOP": 
	    	            	 if(element.equals("B2B_SKYSHOP"))
	    		    	       {     
	    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

	    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
			    		    
	    		    	 SA_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 SA_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
	    	
	    	              
	    	
	    	
	    	
	    	      
	    
		        
	    	        int TotalValue = SA_CP_Wego + SA_CP_b2c +SA_CP_MobIos +SA_CP_skyscan+SA_CP_MobAnd
			 		        + SA_CP_Dhrehlat+ SA_CP_Aviasa +SA_CP_Kayak + SA_CP_Dohop+ SA_CP_Farecompare +SA_CP_Shoogloo+SA_CP_B2bAgent+SA_CP_B2b_Skyshop;
			 				  
			 		        SA_CP_conformation_pending_Total = TotalValue; 
			 				 System.out.println("Confirmation Pending total:::----"+SA_CP_conformation_pending_Total);
			 				
			 				int Other =SA_CP_Dhrehlat + SA_CP_Aviasa +SA_CP_Kayak+ SA_CP_Dohop+ SA_CP_Farecompare+ SA_CP_Shoogloo+SA_CP_B2bAgent+SA_CP_B2b_Skyshop;
			 		 	    	
			 				 SA_CP_Other_conformation_pending = Other; 
			 					System.out.println(" Others domains Confirmation Pending total :::----"+SA_CP_Other_conformation_pending);
			 	        
			 	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}	
			
			
	    	SupplierSA.SupplierSA_CP(driver,conpendingcount);
			
 //Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		SARepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		SA_RP_Wego =0;
	    		SA_RP_b2c =0;
	    		SA_RP_MobIos =0;
	    		SA_RP_MobAnd =0;
	    		SA_RP_skyscan =0;
		         
	    		SA_RP_Dhrehlat =0;
	    		SA_RP_Aviasa =0;
	    		SA_RP_Kayak =0;
		         
	    		SA_RP_Dohop =0;
	    		SA_RP_Farecompare =0;
	    		SA_RP_Shoogloo =0;
	    		SA_RP_B2bAgent=0;
	    		SA_RP_B2b_Skyshop=0;
		         
		         int TotalValue = SA_RP_Wego+ SA_RP_b2c+SA_RP_MobIos + SA_RP_MobAnd+SA_RP_skyscan
			        +SA_RP_Dhrehlat+ SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo+SA_RP_B2bAgent+SA_RP_B2b_Skyshop;
			       
			        
			        
		         SA_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+SA_RP_Repricing_Total);
					
					
					int Other =SA_RP_Dhrehlat +SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo+SA_RP_B2bAgent+SA_RP_B2b_Skyshop;
			 	    	
					SA_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+SA_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Repricing:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 SA_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		SA_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Repricing:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  SA_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   SA_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 SA_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 SA_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 SA_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 SA_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	SA_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			SA_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	SA_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Repricing:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	SA_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Repricing:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 SA_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		SA_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 SA_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 SA_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 SA_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 SA_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 SA_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = SA_RP_Wego+ SA_RP_b2c+SA_RP_MobIos + SA_RP_MobAnd+SA_RP_skyscan
		    			        +SA_RP_Dhrehlat+ SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo+SA_RP_B2bAgent+SA_RP_B2b_Skyshop;
		    			       
		    			        
		    			        
		    		         SA_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+SA_RP_Repricing_Total);
		    					
		    					
		    					int Other =SA_RP_Dhrehlat +SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo+SA_RP_B2bAgent+SA_RP_B2b_Skyshop;
		    			 	    	
		    					SA_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+SA_RP_Other_Repricingtotal);
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	SupplierSA.SupplierSA_RP(driver,Rcount);
			
			
			//***********************Sold Outs**********************************
			Select s=new Select(Loginpage.BookingSatus());
			s.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
			String str = count.trim();
			String[] splited = str.split("\\:");
			System.out.println("No of Results Count"+splited[1]);
			Thread.sleep(1000);
			String soldout="SoldOuts";
			
			
			
			if("Flight Search Results : 0".equals(count))
			{
				//ExcelUtils.lable(2, 2,"No Results are Found");
				
				
				SASoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
				
				SA_SD_Wego =0;
				SA_SD_b2c =0;
				SA_SD_MobIos =0;
				SA_SD_MobAnd =0;
				SA_SD_skyscan =0;
				SA_SD_Dhrehlat =0;
				SA_SD_Aviasa =0;
				SA_SD_Kayak =0;
			    
				SA_SD_Dohop =0;
				SA_SD_Farecompare =0;
				SA_SD_Shoogloo =0;
				SA_SD_B2bAgent=0;
				SA_SD_B2b_Skyshop=0;
				
				int TotalValue =SA_SD_Wego +SA_SD_b2c+SA_SD_MobIos+ SA_SD_MobAnd+ SA_SD_skyscan
				        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo+SA_SD_B2bAgent+SA_SD_B2b_Skyshop;
						 
				        SA_SD_SoldOut_Total =  TotalValue; 
						System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
						
						int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo+SA_SD_B2bAgent+SA_SD_B2b_Skyshop ;
					    	
						 SA_SD_Other_SoldOutstotal =  Other; 
							System.out.println(" Others domains SoldOuts total:::----"+SA_SD_Other_SoldOutstotal);
				 
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				  
				 
				  
				  System.out.println("Total Number of soldOuts:" + WE1.size());
				  Thread.sleep(2000);
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 SA_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		SA_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  SA_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   SA_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 SA_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 SA_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 SA_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 SA_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	SA_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			SA_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	SA_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	SA_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  SA_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 SA_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		SA_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 SA_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 SA_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 SA_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 SA_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 SA_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 SA_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
		
		        
		    	        int TotalValue =SA_SD_Wego +SA_SD_b2c+SA_SD_MobIos+ SA_SD_MobAnd+ SA_SD_skyscan
		        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo +SA_SD_B2bAgent+SA_SD_B2b_Skyshop;
				 
		        SA_SD_SoldOut_Total =  TotalValue; 
				System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
				
				int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo+SA_SD_B2bAgent+SA_SD_B2b_Skyshop ;
			    	
				 SA_SD_Other_SoldOutstotal =  Other; 
					System.out.println(" Others domains SoldOuts total:::----"+SA_SD_Other_SoldOutstotal);
			
			
			
				
		  
			
				
		  
		    
		  
			}
			
			Thread.sleep(2000);
			SupplierSA.SupplierSA_SD(driver,count);
			//***********************Cancelled**********************************
					Select Cancelled=new Select(Loginpage.BookingSatus());
					Cancelled.selectByIndex(8);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String Cancelledcount=Loginpage.FlightResults_text().getText();
					System.out.println(Cancelledcount);
					//ExcelUtils.lable(0, 0,count);
					
			    	String strCancelled = Cancelledcount.trim();
			    	String[] Cancelledsplited = strCancelled.split("\\:");
			    	System.out.println("No of Results Count"+Cancelledsplited[1]);
			    	Thread.sleep(1000);
			    	String Cancelled1="Cancelled";
			    	
			    	
			    	
			    	if("Flight Search Results : 0".equals(Cancelledcount))
			    	{
			    		//ExcelUtils.lable(2, 2,"No Results are Found");
			    		
			    		
			    		SACancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
			    		
			    		SA_CN_Wego =0;
			    		SA_CN_b2c =0;
			    		SA_CN_MobIos =0;
			    		SA_CN_MobAnd =0;
			    		SA_CN_skyscan =0;
			    		
			    		SA_CN_Dhrehlat =0;
				    	SA_CN_Aviasa =0;
				    	SA_CN_Kayak =0;
				         
				    	SA_CN_Dohop =0;
				    	SA_CN_Farecompare =0;
				    	SA_CN_Shoogloo =0;
				    	SA_CN_B2bAgent=0;
				    	SA_CN_B2b_Skyshop=0;
				    	
					        
				    	int TotalValue = SA_CN_Wego + SA_CN_b2c +SA_CN_MobIos + SA_CN_MobAnd+SA_CN_skyscan
					        +SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo+SA_CN_B2bAgent+SA_CN_B2b_Skyshop;
							 SA_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+SA_CN_CancelledTotal);
			    	
							int Other = SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo+SA_CN_B2bAgent+SA_CN_B2b_Skyshop;
							
							SA_CN_Other_CancelledTotal =  Other; 
			 				System.out.println("Cancelled total:::----"+SA_CN_Other_CancelledTotal);
			    		 
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		  
			    		 
			    		  
			    		  System.out.println("Total Number of Cancelled:" + WE1.size());
			    		  Thread.sleep(2000);
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	SA_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		SA_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  SA_CN_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   SA_CN_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 SA_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 SA_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 SA_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 SA_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	SA_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			SA_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	SA_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	SA_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 SA_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		SA_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 SA_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 SA_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 SA_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2BAgent": 
				    	            	 if(element.equals("B2BAgent"))
				    		    	       {     
				    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

				    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
						    		    
				    		    	 SA_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2B_SKYSHOP": 
				    	            	 if(element.equals("B2B_SKYSHOP"))
				    		    	       {     
				    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

				    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
						    		    
				    		    	 SA_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
			    	
				        
				    	        int TotalValue = SA_CN_Wego + SA_CN_b2c +SA_CN_MobIos + SA_CN_MobAnd+SA_CN_skyscan
								        +SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo+SA_CN_B2bAgent+SA_CN_B2b_Skyshop;
										 SA_CN_CancelledTotal =  TotalValue; 
										System.out.println("Cancelled total:::----"+SA_CN_CancelledTotal);
						    	
										int Other = SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo+SA_CN_B2bAgent+SA_CN_B2b_Skyshop;
										
										SA_CN_Other_CancelledTotal =  Other; 
						 				System.out.println("Cancelled total:::----"+SA_CN_Other_CancelledTotal);
			      
			    	}
					
			    	Thread.sleep(2000);
			    	SupplierSA.SupplierSA_CN(driver,Cancelledcount);
			    	//*********************Transaction Hold*****************************
			    	Select transactionHold=new Select(Loginpage.BookingSatus());
			    	transactionHold.selectByIndex(1);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Flight Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		SATransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		SA_TH_Wego =0;
			    		SA_TH_b2c =0;
			    		SA_TH_MobIos =0;
			    		SA_TH_MobAnd =0;
			    		SA_TH_skyscan =0;
			    		
			    		SA_TH_Dhrehlat =0;
				    	SA_TH_Aviasa =0;
				    	SA_TH_Kayak =0;
				         
				    	SA_TH_Dohop =0;
				    	SA_TH_Farecompare =0;
				    	SA_TH_Shoogloo =0;
				    	SA_TH_B2bAgent=0;
				    	SA_TH_B2b_Skyshop=0;
					        
				    	int TotalValue = SA_TH_Wego + SA_TH_b2c +SA_TH_MobIos + SA_TH_MobAnd+ SA_TH_skyscan 
					        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo+SA_TH_B2bAgent+SA_TH_B2b_Skyshop;
							 SA_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
							
							int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo+SA_TH_B2bAgent +SA_TH_B2b_Skyshop;
								
								SA_TH_Other_TransactionholdTotal =  Other; 
				 				System.out.println("TransactionHold total:::----"+SA_TH_Other_TransactionholdTotal);
				        
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	SA_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		SA_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  SA_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   SA_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 SA_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 SA_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 SA_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 SA_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	SA_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			SA_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	SA_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	SA_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  SA_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 SA_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		SA_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 SA_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 SA_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 SA_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2BAgent": 
				    	            	 if(element.equals("B2BAgent"))
				    		    	       {     
				    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

				    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
						    		    
				    		    	 SA_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2B_SKYSHOP": 
				    	            	 if(element.equals("B2B_SKYSHOP"))
				    		    	       {     
				    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

				    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
						    		    
				    		    	 SA_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 SA_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
			    	
			        
			        
			        
				    	        int TotalValue = SA_TH_Wego + SA_TH_b2c +SA_TH_MobIos + SA_TH_MobAnd+ SA_TH_skyscan 
						        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo+SA_TH_B2bAgent +SA_TH_B2b_Skyshop;
								 SA_TH_Transactionhold_total =  TotalValue; 
								System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
								
								int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo+SA_TH_B2bAgent+SA_TH_B2b_Skyshop ;
									
									SA_TH_Other_TransactionholdTotal =  Other; 
					 				System.out.println("TransactionHold total:::----"+SA_TH_Other_TransactionholdTotal);
			    	}
			    	
			    	SupplierSA.SupplierSA_TH(driver,comTranHold);
			    	//Suppliers Script SA
			    	/*SupplierSA.Suppliers_SA(iTestCaseRow, driver);
			    	Thread.sleep(2000);*/
			    	
			    	driver.findElement(By.id("IsRepriced")).click();
			    	Thread.sleep(4000);
			    	IsRepriced_TS_SD_CN_TH_SA(iTestCaseRow, driver);
			    	Loginpage.ClickOnUsername().click();
			    	Thread.sleep(1000);
			    	Loginpage.Log_Out().click();
			    	Thread.sleep(2000);
			    	
			    	System.out.println("************************************************************************************");

			
			
		}

public static void AllStatus_TS_SD_CN_TH_AE(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.AE_link().click();
	//driver.get("http://callcenter.rehlat.ae/");
	driver.get("http://aecallcenter.rehlat.ae/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
			System.out.println("Current Url"+urldomain[1]);
			String[] urldomain1 = urldomain[1].split("\\/");
			System.out.println("Domain Name::"+urldomain1[0]);
			
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Calendar calAE = Calendar.getInstance();
		  	   DateFormat AEdateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	 calAE.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+AEdateFormat.format(calAE.getTime()));  
		  	  String AEst=AEdateFormat.format(calAE.getTime());
		  	   String[] AEspliteddate = AEst.split("-");
		  	   System.out.println("Split the Date::"+AEspliteddate[0]);


			
			Loginpage.Select_dateFrom(AEspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(AEspliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			waitforElement(driver);
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Flight Search Results : 0".equals(comTrancount))
			{
				AETrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
				System.out.println("TrancationSuccess total:::----0");
				
				AE_TS_Wego =0;
				AE_TS_b2c =0;
				AE_TS_MobIos =0;
				AE_TS_MobAnd =0;
				AE_TS_skyscan =0;
				
				AE_TS_Dhrehlat =0;
				 AE_TS_Aviasa =0;
				 AE_TS_Kayak =0;
			     
				 AE_TS_Dohop =0;
				 AE_TS_Farecompare =0;
				 AE_TS_Shoogloo =0;
				 AE_TS_B2bAgent=0;
				 AE_TS_B2b_Skyshop=0;
			        
				 int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobIos + AE_TS_MobAnd+AE_TS_skyscan
			        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo +AE_TS_B2bAgent+AE_TS_B2b_Skyshop;
					 AE_TS_Transaction_Total =  TotalValue; 
					System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
					
					int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo +AE_TS_B2bAgent+AE_TS_B2b_Skyshop;
			    	
					 AE_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
			    
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				 
				  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
				  
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	AE_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		AE_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  AE_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   AE_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 AE_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 AE_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 AE_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 AE_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	AE_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			AE_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	AE_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	AE_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 AE_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		AE_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 AE_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 AE_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 AE_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 AE_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 AE_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
			
		    
		    
		    
		    	        int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobIos + AE_TS_MobAnd+AE_TS_skyscan
				        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo +AE_TS_B2bAgent+AE_TS_B2b_Skyshop;
						 AE_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
						
						int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo +AE_TS_B2bAgent+AE_TS_B2b_Skyshop;
				    	
						 AE_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
				    
		  
			}
			SupplierAE.SupplierAE_TS(driver,comTrancount);
			//Suppliers_AE(iTestCaseRow, driver);
			
			//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String conpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(conpendingcount);
			
			
	    	String comconpendingstr = conpendingcount.trim();
	    	String[] comconpendingplited = comconpendingstr.split("\\:");
	    	System.out.println("No of Results Count"+comconpendingplited[1]);
	    	Thread.sleep(1000);
	    	String conformation_pending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(conpendingcount))
	    	{
	    		AEConfirmationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",conformation_pending,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	    		
	    		  AE_CP_Wego =0;
	 	          AE_CP_b2c =0;
	 	         AE_CP_MobIos =0;
	 	         AE_CP_MobAnd =0;
	 	         AE_CP_skyscan =0;
	 	         
	 	        AE_CP_Dhrehlat =0;
		         AE_CP_Aviasa =0;
		         AE_CP_Kayak =0;
		         
		         AE_CP_Dohop =0;
		         AE_CP_Farecompare =0;
		         AE_CP_Shoogloo =0;
		         AE_CP_B2bAgent=0;
		         AE_CP_B2b_Skyshop=0;
		         
		         int TotalValue = AE_CP_Wego + AE_CP_b2c +AE_CP_MobIos +AE_CP_skyscan+AE_CP_MobAnd
		 		        + AE_CP_Dhrehlat+ AE_CP_Aviasa +AE_CP_Kayak + AE_CP_Dohop+ AE_CP_Farecompare +AE_CP_Shoogloo+AE_CP_B2bAgent+AE_CP_B2b_Skyshop;
		 				  
		 		        AE_CP_conformation_pending_Total = TotalValue; 
		 				 System.out.println("Confirmation Pending total:::----"+AE_CP_conformation_pending_Total);
		 				
		 				int Other =AE_CP_Dhrehlat + AE_CP_Aviasa +AE_CP_Kayak+ AE_CP_Dohop+ AE_CP_Farecompare+ AE_CP_Shoogloo+AE_CP_B2bAgent+AE_CP_B2b_Skyshop;
		 		 	    	
		 				 AE_CP_Other_conformation_pending = Other; 
		 					System.out.println(" Others domains Confirmation Pending total :::----"+AE_CP_Other_conformation_pending);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	 AE_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	   	    		    	 AE_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  AE_CP_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    		    	  AE_CP_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 AE_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	    		    	 AE_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 AE_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 AE_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 AE_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	AE_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			AE_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	AE_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  AE_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	AE_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  AE_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 AE_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		AE_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 AE_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 AE_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 AE_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 AE_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2BAgent": 
	    	            	 if(element.equals("B2BAgent"))
	    		    	       {     
	    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

	    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
			    		    
	    		    	 AE_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2B_SKYSHOP": 
	    	            	 if(element.equals("B2B_SKYSHOP"))
	    		    	       {     
	    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

	    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
			    		    
	    		    	 AE_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 AE_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
	    	
	    	              
	    	
	    	
	    	
	    	      
	    
		        
	    	        int TotalValue = AE_CP_Wego + AE_CP_b2c +AE_CP_MobIos +AE_CP_skyscan+AE_CP_MobAnd
			 		        + AE_CP_Dhrehlat+ AE_CP_Aviasa +AE_CP_Kayak + AE_CP_Dohop+ AE_CP_Farecompare +AE_CP_Shoogloo+AE_CP_B2bAgent+AE_CP_B2b_Skyshop;
			 				  
			 		        AE_CP_conformation_pending_Total = TotalValue; 
			 				 System.out.println("Confirmation Pending total:::----"+AE_CP_conformation_pending_Total);
			 				
			 				int Other =AE_CP_Dhrehlat + AE_CP_Aviasa +AE_CP_Kayak+ AE_CP_Dohop+ AE_CP_Farecompare+ AE_CP_Shoogloo+AE_CP_B2bAgent+AE_CP_B2b_Skyshop;
			 		 	    	
			 				 AE_CP_Other_conformation_pending = Other; 
			 					System.out.println(" Others domains Confirmation Pending total :::----"+AE_CP_Other_conformation_pending);
			 	        
			 	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}	
	    	SupplierAE.SupplierAE_CP(driver,conpendingcount);
			
 //Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		AERepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		AE_RP_Wego =0;
	    		AE_RP_b2c =0;
	    		AE_RP_MobIos =0;
	    		AE_RP_MobAnd =0;
	    		AE_RP_skyscan =0;
		         
	    		AE_RP_Dhrehlat =0;
	    		AE_RP_Aviasa =0;
	    		AE_RP_Kayak =0;
		         
	    		AE_RP_Dohop =0;
	    		AE_RP_Farecompare =0;
	    		AE_RP_Shoogloo =0;
	    		AE_RP_B2bAgent=0;
	    		AE_RP_B2b_Skyshop=0;
		         
		         int TotalValue = AE_RP_Wego+ AE_RP_b2c+AE_RP_MobIos + AE_RP_MobAnd+AE_RP_skyscan
			        +AE_RP_Dhrehlat+ AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo+AE_RP_B2bAgent+AE_RP_B2b_Skyshop;
			       
			        
			        
		         AE_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+AE_RP_Repricing_Total);
					
					
					int Other =AE_RP_Dhrehlat +AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo+AE_RP_B2bAgent+AE_RP_B2b_Skyshop;
			 	    	
					AE_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+AE_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Repricing:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 AE_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		AE_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Repricing:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  AE_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   AE_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 AE_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 AE_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 AE_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 AE_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	AE_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			AE_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	AE_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Repricing:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	AE_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Repricing:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 AE_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		AE_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 AE_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 AE_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 AE_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 AE_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 AE_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = AE_RP_Wego+ AE_RP_b2c+AE_RP_MobIos + AE_RP_MobAnd+AE_RP_skyscan
		    			        +AE_RP_Dhrehlat+ AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo+AE_RP_B2bAgent+AE_RP_B2b_Skyshop;
		    			       
		    			        
		    			        
		    		         AE_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+AE_RP_Repricing_Total);
		    					
		    					
		    					int Other =AE_RP_Dhrehlat +AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo+AE_RP_B2bAgent+AE_RP_B2b_Skyshop;
		    			 	    	
		    					AE_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+AE_RP_Other_Repricingtotal);
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
	    	SupplierAE.SupplierAE_RP(driver,Rcount);
			
			
			//***********************Sold Outs**********************************
			Select s=new Select(Loginpage.BookingSatus());
			s.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
			String str = count.trim();
			String[] splited = str.split("\\:");
			System.out.println("No of Results Count"+splited[1]);
			Thread.sleep(1000);
			String soldout="SoldOuts";
			
			
			
			if("Flight Search Results : 0".equals(count))
			{
				//ExcelUtils.lable(2, 2,"No Results are Found");
				
				
				AESoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
				
				AE_SD_Wego =0;
				AE_SD_b2c =0;
				AE_SD_MobIos =0;
				AE_SD_MobAnd =0;
				AE_SD_skyscan =0;
				AE_SD_Dhrehlat =0;
				AE_SD_Aviasa =0;
				AE_SD_Kayak =0;
			    
				AE_SD_Dohop =0;
				AE_SD_Farecompare =0;
				AE_SD_Shoogloo =0;
				AE_SD_B2bAgent=0;
				AE_SD_B2b_Skyshop=0;
				
				int TotalValue = AE_SD_Wego + AE_SD_b2c +AE_SD_MobIos+ AE_SD_MobAnd+ AE_SD_skyscan
			        +AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo+AE_SD_B2bAgent+AE_SD_B2b_Skyshop;
					 AE_SD_SoldOut_Total =  TotalValue; 
					 
					System.out.println("SoldOuts total:::----"+AE_SD_SoldOut_Total);
					
					int Other =AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo+AE_SD_B2bAgent+AE_SD_B2b_Skyshop;
			    	
					 AE_SD_Other_SoldOutstotal =  Other; 
						System.out.println(" Others domains SoldOuts total:::----"+AE_SD_Other_SoldOutstotal);
				 
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				  
				 
				  
				  System.out.println("Total Number of soldOuts:" + WE1.size());
				  Thread.sleep(2000);
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	AE_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		AE_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  AE_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   AE_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 AE_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 AE_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 AE_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 AE_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	AE_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			AE_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	AE_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	AE_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  AE_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 AE_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		AE_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 AE_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 AE_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 AE_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 AE_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 AE_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 AE_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
			
			
		    	        int TotalValue = AE_SD_Wego + AE_SD_b2c +AE_SD_MobIos+ AE_SD_MobAnd+ AE_SD_skyscan
				        +AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo+AE_SD_B2bAgent+AE_SD_B2b_Skyshop;
						 AE_SD_SoldOut_Total =  TotalValue; 
						 
						System.out.println("SoldOuts total:::----"+AE_SD_SoldOut_Total);
						
						int Other =AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo+AE_SD_B2bAgent+AE_SD_B2b_Skyshop;
				    	
						 AE_SD_Other_SoldOutstotal =  Other; 
							System.out.println(" Others domains SoldOuts total:::----"+AE_SD_Other_SoldOutstotal);
			}
			
			Thread.sleep(2000);
			SupplierAE.SupplierAE_SD(driver,count);
			//***********************Cancelled**********************************
					Select Cancelled=new Select(Loginpage.BookingSatus());
					Cancelled.selectByIndex(8);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String Cancelledcount=Loginpage.FlightResults_text().getText();
					System.out.println(Cancelledcount);
					//ExcelUtils.lable(0, 0,count);
					
			    	String strCancelled = Cancelledcount.trim();
			    	String[] Cancelledsplited = strCancelled.split("\\:");
			    	System.out.println("No of Results Count"+Cancelledsplited[1]);
			    	Thread.sleep(1000);
			    	String Cancelled1="Cancelled";
			    	
			    	
			    	
			    	if("Flight Search Results : 0".equals(Cancelledcount))
			    	{
			    		//ExcelUtils.lable(2, 2,"No Results are Found");
			    		
			    		
			    		AECancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
			    		
			    		AE_CN_Wego =0;
			    		AE_CN_b2c =0;
			    		AE_CN_MobIos =0;
			    		AE_CN_MobAnd =0;
			    		AE_CN_skyscan =0;
			    		AE_CN_Dhrehlat =0;
				    	AE_CN_Aviasa =0;
				    	AE_CN_Kayak =0;
				         
				    	AE_CN_Dohop =0;
				    	AE_CN_Farecompare =0;
				    	AE_CN_Shoogloo =0;
				    	AE_CN_B2bAgent=0;
				    	AE_CN_B2b_Skyshop=0;
					        
				    	int TotalValue = AE_CN_Wego + AE_CN_b2c + AE_CN_MobIos  +  AE_CN_MobAnd+  AE_CN_skyscan  
					        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo+AE_CN_B2bAgent+AE_CN_B2b_Skyshop;
							 AE_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+AE_CN_CancelledTotal);
							
							int Other = AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo+AE_CN_B2bAgent+AE_CN_B2b_Skyshop;
							
							AE_CN_Other_CancelledTotal =  Other; 
			 				System.out.println("Cancelled total:::----"+AE_CN_Other_CancelledTotal);
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		  
			    		 
			    		  
			    		  System.out.println("Total Number of Cancelled:" + WE1.size());
			    		  Thread.sleep(2000);
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	AE_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		AE_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  AE_CN_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   AE_CN_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 AE_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 AE_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 AE_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 AE_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	AE_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			AE_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	AE_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	AE_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 AE_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		AE_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 AE_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 AE_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 AE_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2BAgent": 
				    	            	 if(element.equals("B2BAgent"))
				    		    	       {     
				    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

				    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
						    		    
				    		    	 AE_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2B_SKYSHOP": 
				    	            	 if(element.equals("B2B_SKYSHOP"))
				    		    	       {     
				    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

				    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
						    		    
				    		    	 AE_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
			    	
			    	
				    	        int TotalValue = AE_CN_Wego + AE_CN_b2c + AE_CN_MobIos  +  AE_CN_MobAnd+  AE_CN_skyscan  
						        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo +AE_CN_B2bAgent+AE_CN_B2b_Skyshop;
								 AE_CN_CancelledTotal =  TotalValue; 
								System.out.println("Cancelled total:::----"+AE_CN_CancelledTotal);
								
								int Other = AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo+AE_CN_B2bAgent+AE_CN_B2b_Skyshop;
								
								AE_CN_Other_CancelledTotal =  Other; 
				 				System.out.println("Cancelled total:::----"+AE_CN_Other_CancelledTotal);
			    	}
					
			    	Thread.sleep(2000);
			    	SupplierAE.SupplierAE_CN(driver,Cancelledcount);
			    	//*********************Transaction Hold*****************************
			    	Select transactionHold=new Select(Loginpage.BookingSatus());
			    	transactionHold.selectByIndex(1);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Flight Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		AETransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		AE_TH_Wego =0;
			    		AE_TH_b2c =0;
			    		AE_TH_MobIos =0;
			    		AE_TH_MobAnd =0;
			    		AE_TH_skyscan =0;
			    		
			    		AE_TH_Dhrehlat =0;
				    	AE_TH_Aviasa =0;
				    	AE_TH_Kayak =0;
				         
				    	AE_TH_Dohop =0;
				    	AE_TH_Farecompare =0;
				    	AE_TH_Shoogloo =0;
				    	AE_TH_B2bAgent=0; 
				    	AE_TH_B2b_Skyshop=0;
				    	
				    	int TotalValue =  AE_TH_Wego  +  AE_TH_b2c  + AE_TH_MobIos  +  AE_TH_MobAnd +  AE_TH_skyscan  
					        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent +AE_TH_B2b_Skyshop;
							 AE_TH_Transactionhold_total =  TotalValue; 
						
							System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
							
							int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent+AE_TH_B2b_Skyshop;
								
								AE_TH_Other_TransactionholdTotal =  Other; 
				 				System.out.println("TransactionHold total:::----"+AE_TH_Other_TransactionholdTotal);
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	AE_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		AE_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  AE_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   AE_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 AE_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 AE_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 AE_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 AE_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	AE_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			AE_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	AE_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	AE_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  AE_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 AE_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		AE_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 AE_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 AE_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 AE_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2BAgent": 
				    	            	 if(element.equals("B2BAgent"))
				    		    	       {     
				    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

				    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
						    		    
				    		    	 AE_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2B_SKYSHOP": 
				    	            	 if(element.equals("B2B_SKYSHOP"))
				    		    	       {     
				    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

				    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
						    		    
				    		    	 AE_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 AE_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
			    	
			        
			    	
			        
			        
			        
				    	        int TotalValue =  AE_TH_Wego  +  AE_TH_b2c  + AE_TH_MobIos  +  AE_TH_MobAnd +  AE_TH_skyscan  
						        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent+AE_TH_B2b_Skyshop ;
								 AE_TH_Transactionhold_total =  TotalValue; 
							
								System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
								
								int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent +AE_TH_B2b_Skyshop;
									
									AE_TH_Other_TransactionholdTotal =  Other; 
					 				System.out.println("TransactionHold total:::----"+AE_TH_Other_TransactionholdTotal);
			      
			      
			    	}
			    	SupplierAE.SupplierAE_TH(driver,comTranHold);
			    	//Suppliers Script AE
			    	/*SupplierAE.Suppliers_AE(iTestCaseRow, driver);
			    	Thread.sleep(2000);*/
			    	
			    	driver.findElement(By.id("IsRepriced")).click();
			    	Thread.sleep(4000);
			    	IsRepriced_TS_SD_CN_TH_AE(iTestCaseRow, driver);
			    	Loginpage.ClickOnUsername().click();
			    	Thread.sleep(1000);
			    	Loginpage.Log_Out().click();
			    	Thread.sleep(2000);
			    	
			    	System.out.println("************************************************************************************");

			
			
		}

public static void AllStatus_TS_SD_CN_TH_EG(int iTestCaseRow,WebDriver driver) throws Exception {
			
			
			
			//Loginpage.EG_link().click();
	driver.get("http://callcenter.rehlat.com.eg/");
			Thread.sleep(1000);
			Login.LoginCallCenter(iTestCaseRow);
			Thread.sleep(1000);
			
			WebElement checkbox = driver.findElement(By.id("DisablePagination"));
			// If the checkbox is unchecked then isSelected() will return false
			// and NOT of false is true, hence we can click on checkbox
			if (!checkbox.isSelected())
				checkbox.click();
			else
			{
				System.out.println("Alerdy Check Box is selected");
			}
			
			Loginpage.FromDate().click();
			Thread.sleep(1000);
			
			String CurrentUrl=driver.getCurrentUrl();
			String[] urldomain = CurrentUrl.split("\\//");
			System.out.println("Current Url"+urldomain[1]);
			String[] urldomain1 = urldomain[1].split("\\/");
			System.out.println("Domain Name::"+urldomain1[0]);
			
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Calendar calEG = Calendar.getInstance();
		  	   DateFormat EGdateFormat = new SimpleDateFormat("d-M-yyyy");
		  	 
		  	 calEG.add(Calendar.DATE, -1);
		  	   System.out.println("Yesterday's date was "+EGdateFormat.format(calEG.getTime()));  
		  	  String EGst=EGdateFormat.format(calEG.getTime());
		  	   String[] EGspliteddate = EGst.split("-");
		  	   System.out.println("Split the Date::"+EGspliteddate[0]);
			
			
			Loginpage.Select_dateFrom(EGspliteddate[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			//Loginpage.Month_back().click();
			//Thread.sleep(1000);
			Loginpage.Select_dateTo(EGspliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			waitforElement(driver);
			String comTrancount=Loginpage.FlightResults_text().getText();
			System.out.println(comTrancount);
			
			
			String comtranstr = comTrancount.trim();
			String[] comtransplited = comtranstr.split("\\:");
			System.out.println("No of Results Count"+comtransplited[1]);
			Thread.sleep(1000);
			String tran="Transaction Successful";
			
			if("Flight Search Results : 0".equals(comTrancount))
			{
				EGTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,0,0,0,0,0,0);
				System.out.println("TrancationSuccess total:::----0");
				
				EG_TS_Wego =0;
				EG_TS_b2c =0;
				EG_TS_MobIos =0;
				EG_TS_MobAnd =0;
				EG_TS_skyscan =0;
				EG_TS_Dhrehlat =0;
				EG_TS_Aviasa =0;
				EG_TS_Kayak =0;
			     
				EG_TS_Dohop =0;
				EG_TS_Farecompare =0;
				EG_TS_Shoogloo =0;
				EG_TS_B2bAgent=0;
				EG_TS_B2b_Skyshop=0;
			        
				int TotalValue = EG_TS_Wego +EG_TS_b2c + EG_TS_MobIos  +  EG_TS_MobAnd +  EG_TS_skyscan 
			        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo +EG_TS_B2bAgent+EG_TS_B2b_Skyshop ;
					 EG_TS_Transaction_Total =  TotalValue; 
					System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
					
					int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo +EG_TS_B2bAgent+EG_TS_B2b_Skyshop ;
			    	
					 EG_TS_Other_TrancationSuccessfull =  Other; 
						System.out.println(" Others domains Trancation Successfull total :::----"+EG_TS_Other_TrancationSuccessfull);
			   
		    
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				 
				  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
				  
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	EG_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		EG_TS_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  EG_TS_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   EG_TS_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 EG_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 EG_TS_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 EG_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 EG_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	EG_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			EG_TS_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	EG_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_TS_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	EG_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_TS_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 EG_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		EG_TS_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 EG_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 EG_TS_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 EG_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 EG_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 EG_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_TS_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
			
		    
		    
		    
		    	        int TotalValue = EG_TS_Wego +EG_TS_b2c + EG_TS_MobIos  +  EG_TS_MobAnd +  EG_TS_skyscan 
				        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo +EG_TS_B2bAgent+EG_TS_B2b_Skyshop ;
						 EG_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
						
						int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo +EG_TS_B2bAgent+EG_TS_B2b_Skyshop ;
				    	
						 EG_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+EG_TS_Other_TrancationSuccessfull);
				   
			    
		  
			}
			SupplierEG.SupplierEG_TS(driver,comTrancount);
			//Suppliers_EG(iTestCaseRow, driver);
			
			//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String conpendingcount=Loginpage.FlightResults_text().getText();
			System.out.println(conpendingcount);
			
			
	    	String comconpendingstr = conpendingcount.trim();
	    	String[] comconpendingplited = comconpendingstr.split("\\:");
	    	System.out.println("No of Results Count"+comconpendingplited[1]);
	    	Thread.sleep(1000);
	    	String conformation_pending="Confirmation Pending";
	    	
	    	if("Flight Search Results : 0".equals(conpendingcount))
	    	{
	    		EGConfirmationPending= String.format("%30s %23s %20s %20d %20d %25s %25s ",conformation_pending,0,0,0,0,0,0);
	    		System.out.println("TrancationSuccess total:::----0");
	    		
	    		  EG_CP_Wego =0;
	 	          EG_CP_b2c =0;
	 	         EG_CP_MobIos =0;
	 	         EG_CP_MobAnd =0;
	 	         EG_CP_skyscan =0;
	 	         
	 	        EG_CP_Dhrehlat =0;
		         EG_CP_Aviasa =0;
		         EG_CP_Kayak =0;
		         
		         EG_CP_Dohop =0;
		         EG_CP_Farecompare =0;
		         EG_CP_Shoogloo =0;
		         EG_CP_B2bAgent=0;
		         EG_CP_B2b_Skyshop=0;
	 	         
		         int TotalValue = EG_CP_Wego + EG_CP_b2c +EG_CP_MobIos +EG_CP_skyscan+EG_CP_MobAnd
		 		        + EG_CP_Dhrehlat+ EG_CP_Aviasa +EG_CP_Kayak + EG_CP_Dohop+ EG_CP_Farecompare +EG_CP_Shoogloo+EG_CP_B2bAgent+EG_CP_B2b_Skyshop;
		 				  
		 		        EG_CP_conformation_pending_Total = TotalValue; 
		 				 System.out.println("Confirmation Pending total:::----"+EG_CP_conformation_pending_Total);
		 				
		 				int Other =EG_CP_Dhrehlat + EG_CP_Aviasa +EG_CP_Kayak+ EG_CP_Dohop+ EG_CP_Farecompare+ EG_CP_Shoogloo+EG_CP_B2bAgent+EG_CP_B2b_Skyshop;
		 		 	    	
		 				 EG_CP_Other_conformation_pending = Other; 
		 					System.out.println(" Others domains Confirmation Pending total :::----"+EG_CP_Other_conformation_pending);
		 	        
		 	        
		        
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		 
	    		  System.out.println("Total Number of Trancation Successfull:" + WE1.size());
	    		
	    		ArrayList<String>list=new ArrayList<>();
	    		
	    		 for (WebElement element1 : WE1)
	    		  {
	    			 list.add(element1.getText());
	    		  }
	    		  ArrayList<String> unique = removeDuplicates(list);
	    		  System.out.println("unique:"+unique.size());
	    	        for (String element : unique) {
	    	            System.out.println("element:"+element);
	    	            
	    	             
	    	            
	    	            
	    	            String number=element;
	    	           for(int j=0;j<unique.size();j++)
	    	           {	
	    	            switch(number){  
	    	            case "WEGO": 
	    	            	if(element.equals("WEGO")) 
	    		    	       {
	    		    	        
	    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

	    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
	    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
	    		    	
	    		    	
	    		    	 EG_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    		    	
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Wego1 =String.format("%1s",0);
	    	    		    	
	    	    		    	
	   	    		    	 EG_CP_Wego =Integer.parseInt(Com_TS_Wego1);
	    	            	}
	    		    	      
	    	            break; 
	    	            
	    	            case "B2C": 
	    	            	   
	    		    	       if(element.equals("B2C"))
	    		    	       {
	    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

	    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
	    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
	    		    	  
		    		    	
		    		    	
	    		    	  EG_CP_b2c =Integer.parseInt(Com_TS_b2c1);
	    		    	       }
	    		    	       else
		    	            	{
	    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
	    		    		    	  
	   		    		    	
	   		    		    	
	    		    		    	  EG_CP_b2c =Integer.parseInt(Com_TS_b2c1);
		    	            	}
	    		    	      
	    	            break;  
	    	            case "MOBIOS": 
	    	            	 if(element.equals("MOBIOS"))
	    		    	       {   
	    		    	       
	    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

	    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
	    		    	
	    		    	
	    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
		    		    
	    		    	 EG_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
	    			    		    
	    	    		    	 EG_CP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    	            	}
	    	            break; 
	    	            case "MOBAPP": 
	    	            	 if(element.equals("MOBAPP"))
	    		    	       {   
	    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

	    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
	    		    	 
	    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
			    		    
	    		    	 EG_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 EG_CP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SKYSCN": 
	    	            	 if(element.equals("SKYSCN"))
	    		    	       {        
	    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

	    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
	    		    	
	    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
			    		    
	    		    	 EG_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 EG_CP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    	            	}
	    		    	     
	    		    	       
	    	            break;  
	    	            case "DHREHLAT": 
	    	            	  if(element.equals("DHREHLAT"))
	    		    	       {   
	    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

	    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
	    		    	
	    		    	
	    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
		    		    
	    		    	EG_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
	    			    		    
	    	            			EG_CP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    	            	}
	    	            break; 
	    	            case "AVIASALES": 
	    	            	  if(element.equals("AVIASALES"))
	    		    	       {        
	    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

	    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
	    		    	
	    		    	
	    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
		    		    
	    		    	EG_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
	    		    	
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  EG_CP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    	            	}
	    		    	      
	    		    	     
	    	            break;
	    	            case "KAYAK": 
	    	            	  if(element.equals("KAYAK"))
	    		    	       {   
	    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

	    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
	    		    	
	    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
		    		    
	    		    	EG_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
	    		    	       }
	    		    	       
	    	            	  else
		    	            	{
	    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
	    			    		    
	    	            		  EG_CP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    	            	}
	    		    	       
	    	            break; 
	    	            case "DOHOP": 
	    	            	if(element.equals("DOHOP"))
	    		    	       {  
	    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

	    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
	    		    	 
	    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
			    		    
	    		    	 EG_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    		    	       }
	    	            	else
	    	            	{
	    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
				    		    
	    	            		EG_CP_Dohop =Integer.parseInt(Com_TS_Dohop1);
	    	            	}
	    		    	     
	    	            break;
	    	            case "FARECOMPARE": 
	    	            	
	    	            	  if(element.equals("FARECOMPARE"))
	    		    	       {  
	    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

	    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
	    		    	 
	    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
			    		    
	    		    	 EG_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
	    		    	       }
	    	            	  else
		    	            	{
	    	            		  
	    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
	    				    		    
	    		    		    	 EG_CP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    	            	}
	    		    	      
	    	            break; 
	    	            case "SHOOGLOO": 
	    	            	 if(element.equals("SHOOGLOO"))
	    		    	       {     
	    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

	    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
			    		    
	    		    	 EG_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	    		    	 EG_CP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            case "B2BAgent": 
	    	            	 if(element.equals("B2BAgent"))
	    		    	       {     
	    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

	    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
			    		    
	    		    	 EG_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 EG_CP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            
	    	            case "B2B_SKYSHOP": 
	    	            	 if(element.equals("B2B_SKYSHOP"))
	    		    	       {     
	    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

	    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
	    		    	
	    		    	 
	    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
			    		    
	    		    	 EG_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
	    		    	 
	    		    	
	    		    	       }
	    	            	 else
		    	            	{
	    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
	 			    		    
	    	            		 EG_CP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    	            	}
	    	            break;
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
	    	   
	    	
	    	              
	    	
	    	
	    	
	    	      
	    
		        
	    	        int TotalValue = EG_CP_Wego + EG_CP_b2c +EG_CP_MobIos +EG_CP_skyscan+EG_CP_MobAnd
			 		        + EG_CP_Dhrehlat+ EG_CP_Aviasa +EG_CP_Kayak + EG_CP_Dohop+ EG_CP_Farecompare +EG_CP_Shoogloo+EG_CP_B2bAgent+EG_CP_B2b_Skyshop;
			 				  
			 		        EG_CP_conformation_pending_Total = TotalValue; 
			 				 System.out.println("Confirmation Pending total:::----"+EG_CP_conformation_pending_Total);
			 				
			 				int Other =EG_CP_Dhrehlat + EG_CP_Aviasa +EG_CP_Kayak+ EG_CP_Dohop+ EG_CP_Farecompare+ EG_CP_Shoogloo+EG_CP_B2bAgent+EG_CP_B2b_Skyshop;
			 		 	    	
			 				 EG_CP_Other_conformation_pending = Other; 
			 					System.out.println(" Others domains Confirmation Pending total :::----"+EG_CP_Other_conformation_pending);
			 	        
			 	        
	        
	       
				//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	    	}	
					
	    	SupplierEG.SupplierEG_CP(driver,conpendingcount);
			
//Repricing 
	    	
	    	Select re=new Select(Loginpage.BookingSatus());
			re.selectByIndex(13);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String Rcount=Loginpage.FlightResults_text().getText();
			System.out.println(Rcount);
			//ExcelUtils.lable(0, 0,count);
			
	    	String Rstr = Rcount.trim();
	    	String[] Rsplited = Rstr.split("\\:");
	    	System.out.println("No of Results Count"+Rsplited[1]);
	    	Thread.sleep(1000);
	    	String Repricing="Repricing";
	    	
	    	if("Flight Search Results : 0".equals(Rcount))
	    	{
	    		//ExcelUtils.lable(2, 2,"No Results are Found");
	    		
	    		
	    		EGRepricing= String.format("%30s %20s %20s %20d %20d %25s %25s ",Repricing,0,0,0,0,0,0);
	    		
	    		EG_RP_Wego =0;
	    		EG_RP_b2c =0;
	    		EG_RP_MobIos =0;
	    		EG_RP_MobAnd =0;
	    		EG_RP_skyscan =0;
		         
	    		EG_RP_Dhrehlat =0;
	    		EG_RP_Aviasa =0;
	    		EG_RP_Kayak =0;
		         
	    		EG_RP_Dohop =0;
	    		EG_RP_Farecompare =0;
	    		EG_RP_Shoogloo =0;
	    		EG_RP_B2bAgent=0;
	    		EG_RP_B2b_Skyshop=0;
		         
		         int TotalValue = EG_RP_Wego+ EG_RP_b2c+EG_RP_MobIos + EG_RP_MobAnd+EG_RP_skyscan
			        +EG_RP_Dhrehlat+ EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo+EG_RP_B2bAgent+EG_RP_B2b_Skyshop;
			       
			        
			        
		         EG_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+EG_RP_Repricing_Total);
					
					
					int Other =EG_RP_Dhrehlat +EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo+EG_RP_B2bAgent+EG_RP_B2b_Skyshop;
			 	    	
					EG_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+EG_RP_Other_Repricingtotal);
	          
	    	}
	    	else
	    	{
	    	
	    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
	    		  
	    		 
	    		  
	    		  System.out.println("Total Number of Repricing:" + WE1.size());
	    		  Thread.sleep(2000);
	    		  
	    		  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Repricing:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	 EG_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		EG_RP_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Repricing:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  EG_RP_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   EG_RP_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 EG_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 EG_RP_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 EG_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_RP_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 EG_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_RP_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	EG_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			EG_RP_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	EG_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_RP_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Repricing:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	EG_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_RP_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Repricing:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 EG_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		EG_RP_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 EG_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 EG_RP_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 EG_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_RP_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 EG_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_RP_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 EG_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_RP_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
	    	
	    	
		      
		    	        int TotalValue = EG_RP_Wego+ EG_RP_b2c+EG_RP_MobIos + EG_RP_MobAnd+EG_RP_skyscan
		    			        +EG_RP_Dhrehlat+ EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo+EG_RP_B2bAgent+EG_RP_B2b_Skyshop;
		    			       
		    			        
		    			        
		    		         EG_RP_Repricing_Total = TotalValue; 
		    					System.out.println("Repricing total:::----"+EG_RP_Repricing_Total);
		    					
		    					
		    					int Other =EG_RP_Dhrehlat +EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo+EG_RP_B2bAgent+EG_RP_B2b_Skyshop;
		    			 	    	
		    					EG_RP_Other_Repricingtotal = Other; 
		    						System.out.println(" Others domains Repricing total:::----"+EG_RP_Other_Repricingtotal);
	      
	    	
				
	      
	        
	      
	    	}
			
	    	Thread.sleep(2000);
			
	    	SupplierEG.SupplierEG_RP(driver,Rcount);
			
			//***********************Sold Outs**********************************
			Select s=new Select(Loginpage.BookingSatus());
			s.selectByIndex(11);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement(driver);
			String count=Loginpage.FlightResults_text().getText();
			System.out.println(count);
			//ExcelUtils.lable(0, 0,count);
			
			String str = count.trim();
			String[] splited = str.split("\\:");
			System.out.println("No of Results Count"+splited[1]);
			Thread.sleep(1000);
			String soldout="SoldOuts";
			
			
			
			if("Flight Search Results : 0".equals(count))
			{
				//ExcelUtils.lable(2, 2,"No Results are Found");
				
				
				EGSoldOuts= String.format("%30s %20s %20s %20d %20d %25s %25s ",soldout,0,0,0,0,0,0);
				
				EG_SD_Wego =0;
				EG_SD_b2c =0;
				EG_SD_MobIos =0;
				EG_SD_MobAnd =0;
				EG_SD_skyscan =0;
				 
				EG_SD_Dhrehlat =0;
				EG_SD_Aviasa =0;
				EG_SD_Kayak =0;
			    
				EG_SD_Dohop =0;
				EG_SD_Farecompare =0;
				EG_SD_Shoogloo =0;
				EG_SD_B2bAgent=0; 
				EG_SD_B2b_Skyshop=0;
				
				int TotalValue =  EG_SD_Wego  +  EG_SD_b2c  + EG_SD_MobIos  +  EG_SD_MobAnd +  EG_SD_skyscan 
			        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo +EG_SD_B2bAgent+EG_SD_B2b_Skyshop;
					 EG_SD_SoldOut_Total =  TotalValue; 
					System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
					
					int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo +EG_SD_B2bAgent+EG_SD_B2b_Skyshop;
			    	
					 EG_SD_Other_SoldOutstotal =  Other; 
						System.out.println(" Others domains SoldOuts total:::----"+EG_SD_Other_SoldOutstotal);
		      
			}
			else
			{
			
				List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
				  
				 
				  
				  System.out.println("Total Number of soldOuts:" + WE1.size());
				  Thread.sleep(2000);
				  
				  ArrayList<String>list=new ArrayList<>();
		    		
		    		 for (WebElement element1 : WE1)
		    		  {
		    			 list.add(element1.getText());
		    		  }
		    		  ArrayList<String> unique = removeDuplicates(list);
		    		  System.out.println("unique:"+unique.size());
		    	        for (String element : unique) {
		    	            System.out.println("element:"+element);
		    	            
		    	             
		    	            
		    	            
		    	            String number=element;
		    	           for(int j=0;j<unique.size();j++)
		    	           {	
		    	            switch(number){  
		    	            case "WEGO": 
		    	            	if(element.equals("WEGO")) 
		    		    	       {
		    		    	        
		    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

		    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
		    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
		    		    	
		    		    	
		    		    	EG_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    		    	
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Wego1 =String.format("%1s",0);
		    	    		    	
		    	    		    	
		    	            		EG_SD_Wego =Integer.parseInt(Com_TS_Wego1);
		    	            	}
		    		    	      
		    	            break; 
		    	            
		    	            case "B2C": 
		    	            	   
		    		    	       if(element.equals("B2C"))
		    		    	       {
		    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

		    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
		    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
		    		    	  
			    		    	
			    		    	
		    		    	  EG_SD_b2c =Integer.parseInt(Com_TS_b2c1);
		    		    	       }
		    		    	       else
			    	            	{
		    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
		    		    		    	  
		   		    		    	
		   		    		    	
		    		    	    	   EG_SD_b2c =Integer.parseInt(Com_TS_b2c1);
			    	            	}
		    		    	      
		    	            break;  
		    	            case "MOBIOS": 
		    	            	 if(element.equals("MOBIOS"))
		    		    	       {   
		    		    	       
		    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

		    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
		    		    	
		    		    	
		    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
			    		    
		    		    	 EG_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		 EG_SD_MobIos =Integer.parseInt(Com_TS_MobIos1);
			    	            	}
		    	            break; 
		    	            case "MOBAPP": 
		    	            	 if(element.equals("MOBAPP"))
		    		    	       {   
		    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

		    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
		    		    	 
		    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
				    		    
		    		    	 EG_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SKYSCN": 
		    	            	 if(element.equals("SKYSCN"))
		    		    	       {        
		    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

		    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
		    		    	
		    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
				    		    
		    		    	 EG_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_skyscan =Integer.parseInt(Com_TS_skyscan1);
			    	            	}
		    		    	     
		    		    	       
		    	            break;  
		    	            case "DHREHLAT": 
		    	            	  if(element.equals("DHREHLAT"))
		    		    	       {   
		    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

		    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
		    		    	
		    		    	
		    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
			    		    
		    		    	EG_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
		    			    		    
		    	            			EG_SD_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
			    	            	}
		    	            break; 
		    	            case "AVIASALES": 
		    	            	  if(element.equals("AVIASALES"))
		    		    	       {        
		    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

		    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
		    		    	
		    		    	
		    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
			    		    
		    		    	EG_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
		    		    	
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_SD_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
			    	            	}
		    		    	      
		    		    	     
		    	            break;
		    	            case "KAYAK": 
		    	            	  if(element.equals("KAYAK"))
		    		    	       {   
		    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

		    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
		    		    	
		    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
			    		    
		    		    	EG_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
		    		    	       }
		    		    	       
		    	            	  else
			    	            	{
		    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
		    			    		    
		    	            		  EG_SD_Kayak =Integer.parseInt(Com_TS_Kayak1);
			    	            	}
		    		    	       
		    	            break; 
		    	            case "DOHOP": 
		    	            	if(element.equals("DOHOP"))
		    		    	       {  
		    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

		    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
		    		    	 
		    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
				    		    
		    		    	 EG_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    		    	       }
		    	            	else
		    	            	{
		    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
					    		    
		    	            		EG_SD_Dohop =Integer.parseInt(Com_TS_Dohop1);
		    	            	}
		    		    	     
		    	            break;
		    	            case "FARECOMPARE": 
		    	            	
		    	            	  if(element.equals("FARECOMPARE"))
		    		    	       {  
		    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

		    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
		    		    	 
		    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
				    		    
		    		    	 EG_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
		    		    	       }
		    	            	  else
			    	            	{
		    	            		  
		    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
		    				    		    
		    		    		    	 EG_SD_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
			    	            	}
		    		    	      
		    	            break; 
		    	            case "SHOOGLOO": 
		    	            	 if(element.equals("SHOOGLOO"))
		    		    	       {     
		    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

		    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
				    		    
		    		    	 EG_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2BAgent": 
		    	            	 if(element.equals("B2BAgent"))
		    		    	       {     
		    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

		    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
				    		    
		    		    	 EG_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            case "B2B_SKYSHOP": 
		    	            	 if(element.equals("B2B_SKYSHOP"))
		    		    	       {     
		    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

		    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
		    		    	
		    		    	 
		    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
				    		    
		    		    	 EG_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
		    		    	 
		    		    	
		    		    	       }
		    	            	 else
			    	            	{
		    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
		 			    		    
		    	            		 EG_SD_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
			    	            	}
		    	            break;
		    	            default:System.out.println("Not in 10, 20 or 30");  
		    	         
		    	            }
		    	           }
		    	        }
		    	  
			
		    	        int TotalValue =  EG_SD_Wego  +  EG_SD_b2c  + EG_SD_MobIos  +  EG_SD_MobAnd +  EG_SD_skyscan 
			        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo +EG_SD_B2bAgent+EG_SD_B2b_Skyshop;
					 EG_SD_SoldOut_Total =  TotalValue; 
					System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
					
					int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo +EG_SD_B2bAgent+EG_SD_B2b_Skyshop;
			    	
					 EG_SD_Other_SoldOutstotal =  Other; 
						System.out.println(" Others domains SoldOuts total:::----"+EG_SD_Other_SoldOutstotal);
		  
			}
			
			Thread.sleep(2000);
			SupplierEG.SupplierEG_SD(driver,count);
			//***********************Cancelled**********************************
					Select Cancelled=new Select(Loginpage.BookingSatus());
					Cancelled.selectByIndex(8);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String Cancelledcount=Loginpage.FlightResults_text().getText();
					System.out.println(Cancelledcount);
					//ExcelUtils.lable(0, 0,count);
					
			    	String strCancelled = Cancelledcount.trim();
			    	String[] Cancelledsplited = strCancelled.split("\\:");
			    	System.out.println("No of Results Count"+Cancelledsplited[1]);
			    	Thread.sleep(1000);
			    	String Cancelled1="Cancelled";
			    	
			    	
			    	
			    	if("Flight Search Results : 0".equals(Cancelledcount))
			    	{
			    		//ExcelUtils.lable(2, 2,"No Results are Found");
			    		
			    		
			    		EGCancelled= String.format("%30s %20s %20s %20d %20d %25s %25s ",Cancelled1,0,0,0,0,0,0);
			    		
			    		EG_CN_Wego =0;
			    		EG_CN_b2c =0;
			    		EG_CN_MobIos =0;
			    		EG_CN_MobAnd =0;
			    		EG_CN_skyscan =0;
			    		
			    		EG_CN_Dhrehlat =0;
				    	EG_CN_Aviasa =0;
				    	EG_CN_Kayak =0;
				         
				    	EG_CN_Dohop =0;
				    	EG_CN_Farecompare =0;
				    	EG_CN_Shoogloo =0;
				    	EG_CN_B2bAgent=0;
				    	EG_CN_B2b_Skyshop=0;
					        
				    	int TotalValue =  EG_CN_Wego  +  EG_CN_b2c  + EG_CN_MobIos  +  EG_CN_MobAnd +  EG_CN_skyscan 
					        + EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo +EG_CN_B2bAgent+EG_CN_B2b_Skyshop;
							 EG_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+EG_CN_CancelledTotal);
							
							int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo +EG_CN_B2bAgent+EG_CN_B2b_Skyshop;
							
							EG_CN_Other_CancelledTotal =  Other; 
			 				System.out.println(" Other Cancelled total:::----"+EG_CN_Other_CancelledTotal);
			    	
			    		 
			          
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		  
			    		 
			    		  
			    		  System.out.println("Total Number of Cancelled:" + WE1.size());
			    		  Thread.sleep(2000);
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	EG_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		EG_CN_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  EG_CN_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   EG_CN_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 EG_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 EG_CN_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 EG_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 EG_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	EG_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			EG_CN_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	EG_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_CN_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	EG_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_CN_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 EG_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		EG_CN_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 EG_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 EG_CN_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 EG_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2BAgent": 
				    	            	 if(element.equals("B2BAgent"))
				    		    	       {     
				    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

				    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
						    		    
				    		    	 EG_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2B_SKYSHOP": 
				    	            	 if(element.equals("B2B_SKYSHOP"))
				    		    	       {     
				    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

				    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
						    		    
				    		    	 EG_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_CN_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
			    	
			    	
				    	        int TotalValue =  EG_CN_Wego  +  EG_CN_b2c  + EG_CN_MobIos  +  EG_CN_MobAnd +  EG_CN_skyscan 
						        + EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo +EG_CN_B2bAgent+EG_CN_B2b_Skyshop;
								 EG_CN_CancelledTotal =  TotalValue; 
								System.out.println("Cancelled total:::----"+EG_CN_CancelledTotal);
								
								int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo +EG_CN_B2bAgent+EG_CN_B2b_Skyshop;
								
								EG_CN_Other_CancelledTotal =  Other; 
				 				System.out.println(" Other Cancelled total:::----"+EG_CN_Other_CancelledTotal);
			        
			      
			    	}
					
			    	Thread.sleep(2000);
			    	SupplierEG.SupplierEG_CN(driver,Cancelledcount);
			    	//*********************Transaction Hold*****************************
			    	Select transactionHold=new Select(Loginpage.BookingSatus());
			    	transactionHold.selectByIndex(1);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					waitforElement(driver);
					String comTranHold=Loginpage.FlightResults_text().getText();
					System.out.println(comTranHold);
					
					
			    	String comtranstrhold = comTranHold.trim();
			    	String[] comtranholdsplited = comtranstrhold.split("\\:");
			    	System.out.println("No of Results Count"+comtranholdsplited[1]);
			    	Thread.sleep(1000);
			    	
			    	String tranHold="Transaction Hold";
			    	if("Flight Search Results : 0".equals(comTranHold))
			    	{
			    	
			    		EGTransactionHold= String.format("%30s %26s %20s %20d %20d %25s %25s ",tranHold,0,0,0,0,0,0);
			    		System.out.println("TransactionHold total:::----0");
			    		
			    		EG_TH_Wego =0;
			    		EG_TH_b2c =0;
			    		EG_TH_MobIos =0;
			    		EG_TH_MobAnd =0;
			    		EG_TH_skyscan =0;
			    		EG_TH_Dhrehlat =0;
				    	EG_TH_Aviasa =0;
				    	EG_TH_Kayak =0;
				         
				    	EG_TH_Dohop =0;
				    	EG_TH_Farecompare =0;
				    	EG_TH_Shoogloo =0;
				    	EG_TH_B2bAgent=0; 
				    	EG_TH_B2b_Skyshop=0;
				    	
				    	int TotalValue =  EG_TH_Wego  +  EG_TH_b2c  + EG_TH_MobIos  +  EG_TH_MobAnd +  EG_TH_skyscan 
					        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo +EG_TH_B2bAgent+EG_TH_B2b_Skyshop ;
							 EG_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
							
							int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo +EG_TH_B2bAgent +EG_TH_B2b_Skyshop;
							
							EG_TH_Other_TransactionHoldTotal =  Other; 
			 				System.out.println(" Other TransactionHold total:::----"+EG_TH_Other_TransactionHoldTotal);
			    	}
			    	else
			    	{
			    	
			    		List<WebElement> WE1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));
			    		 
			    		  System.out.println("Total Number of Trancation Hold:" + WE1.size());
			    		  
			    		  
			    		  ArrayList<String>list=new ArrayList<>();
				    		
				    		 for (WebElement element1 : WE1)
				    		  {
				    			 list.add(element1.getText());
				    		  }
				    		  ArrayList<String> unique = removeDuplicates(list);
				    		  System.out.println("unique:"+unique.size());
				    	        for (String element : unique) {
				    	            System.out.println("element:"+element);
				    	            
				    	             
				    	            
				    	            
				    	            String number=element;
				    	           for(int j=0;j<unique.size();j++)
				    	           {	
				    	            switch(number){  
				    	            case "WEGO": 
				    	            	if(element.equals("WEGO")) 
				    		    	       {
				    		    	        
				    		    	List<WebElement> SWEGO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

				    		    	System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
				    		    	String Com_TS_Wego1 =String.format("%1s",SWEGO.size());
				    		    	
				    		    	
				    		    	EG_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    		    	
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Wego1 =String.format("%1s",0);
				    	    		    	
				    	    		    	
				    	            		EG_TH_Wego =Integer.parseInt(Com_TS_Wego1);
				    	            	}
				    		    	      
				    	            break; 
				    	            
				    	            case "B2C": 
				    	            	   
				    		    	       if(element.equals("B2C"))
				    		    	       {
				    		    	  List<WebElement> SB2C=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

				    		    	  System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
				    		    	  String Com_TS_b2c1 =String.format("%1s",SB2C.size());
				    		    	  
					    		    	
					    		    	
				    		    	  EG_TH_b2c =Integer.parseInt(Com_TS_b2c1);
				    		    	       }
				    		    	       else
					    	            	{
				    		    	    	   String Com_TS_b2c1 =String.format("%1s",0);
				    		    		    	  
				   		    		    	
				   		    		    	
				    		    	    	   EG_TH_b2c =Integer.parseInt(Com_TS_b2c1);
					    	            	}
				    		    	      
				    	            break;  
				    	            case "MOBIOS": 
				    	            	 if(element.equals("MOBIOS"))
				    		    	       {   
				    		    	       
				    		    	List<WebElement> SMOBIOS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

				    		    	System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());
				    		    	
				    		    	
				    		    	 String Com_TS_MobIos1 =String.format("%1s",SMOBIOS.size());   		    	
					    		    
				    		    	 EG_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobIos1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		 EG_TH_MobIos =Integer.parseInt(Com_TS_MobIos1);
					    	            	}
				    	            break; 
				    	            case "MOBAPP": 
				    	            	 if(element.equals("MOBAPP"))
				    		    	       {   
				    		    	List<WebElement> SMOBAPP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

				    		    	System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());
				    		    	 
				    		    	 String Com_TS_MobAnd1 =String.format("%1s",SMOBAPP.size());   		    	
						    		    
				    		    	 EG_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_MobAnd1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_MobAnd =Integer.parseInt(Com_TS_MobAnd1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SKYSCN": 
				    	            	 if(element.equals("SKYSCN"))
				    		    	       {        
				    		    	List<WebElement> SSKYSCN=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

				    		    	System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());
				    		    	
				    		    	 String Com_TS_skyscan1 =String.format("%1s",SSKYSCN.size());   		    	
						    		    
				    		    	 EG_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_skyscan1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_skyscan =Integer.parseInt(Com_TS_skyscan1);
					    	            	}
				    		    	     
				    		    	       
				    	            break;  
				    	            case "DHREHLAT": 
				    	            	  if(element.equals("DHREHLAT"))
				    		    	       {   
				    		    	List<WebElement> DHREHLAT=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

				    		    	System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());
				    		    	
				    		    	
				    		    	String Com_TS_Dhrehlat1 =String.format("%1s",DHREHLAT.size());   		    	
					    		    
				    		    	EG_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            			String Com_TS_Dhrehlat1 =String.format("%1s",0);   		    	
				    			    		    
				    	            			EG_TH_Dhrehlat =Integer.parseInt(Com_TS_Dhrehlat1);
					    	            	}
				    	            break; 
				    	            case "AVIASALES": 
				    	            	  if(element.equals("AVIASALES"))
				    		    	       {        
				    		    	List<WebElement> AVIASALES=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

				    		    	System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());
				    		    	
				    		    	
				    		    	String Com_TS_Aviasa1 =String.format("%1s",AVIASALES.size());   		    	
					    		    
				    		    	EG_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
				    		    	
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Aviasa1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_TH_Aviasa =Integer.parseInt(Com_TS_Aviasa1);
					    	            	}
				    		    	      
				    		    	     
				    	            break;
				    	            case "KAYAK": 
				    	            	  if(element.equals("KAYAK"))
				    		    	       {   
				    		    	List<WebElement> KAYAK=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

				    		    	System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());
				    		    	
				    		    	String Com_TS_Kayak1 =String.format("%1s",KAYAK.size());   		    	
					    		    
				    		    	EG_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
				    		    	       }
				    		    	       
				    	            	  else
					    	            	{
				    	            		  String Com_TS_Kayak1 =String.format("%1s",0);   		    	
				    			    		    
				    	            		  EG_TH_Kayak =Integer.parseInt(Com_TS_Kayak1);
					    	            	}
				    		    	       
				    	            break; 
				    	            case "DOHOP": 
				    	            	if(element.equals("DOHOP"))
				    		    	       {  
				    		    	List<WebElement> DOHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

				    		    	System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());
				    		    	 
				    		    	 String Com_TS_Dohop1 =String.format("%1s",DOHOP.size());   		    	
						    		    
				    		    	 EG_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    		    	       }
				    	            	else
				    	            	{
				    	            		String Com_TS_Dohop1 =String.format("%1s",0);   		    	
							    		    
				    	            		EG_TH_Dohop =Integer.parseInt(Com_TS_Dohop1);
				    	            	}
				    		    	     
				    	            break;
				    	            case "FARECOMPARE": 
				    	            	
				    	            	  if(element.equals("FARECOMPARE"))
				    		    	       {  
				    		    	List<WebElement> FARECOMPARE=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

				    		     	System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());
				    		    	 
				    		    	 String Com_TS_Farecompare1 =String.format("%1s",FARECOMPARE.size());   		    	
						    		    
				    		    	 EG_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
				    		    	       }
				    	            	  else
					    	            	{
				    	            		  
				    		    		    	 String Com_TS_Farecompare1 =String.format("%1s",0);   		    	
				    				    		    
				    		    		    	 EG_TH_Farecompare =Integer.parseInt(Com_TS_Farecompare1);
					    	            	}
				    		    	      
				    	            break; 
				    	            case "SHOOGLOO": 
				    	            	 if(element.equals("SHOOGLOO"))
				    		    	       {     
				    		    	List<WebElement> SHOOGLOO=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

				    		    	System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",SHOOGLOO.size());   		    	
						    		    
				    		    	 EG_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_Shoogloo =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2BAgent": 
				    	            	 if(element.equals("B2BAgent"))
				    		    	       {     
				    		    	List<WebElement> B2BAgent=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2BAgent']"));

				    		    	System.out.println("No of B2BAgent Trancation Successfull:" + B2BAgent.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2BAgent.size());   		    	
						    		    
				    		    	 EG_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_B2bAgent =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            case "B2B_SKYSHOP": 
				    	            	 if(element.equals("B2B_SKYSHOP"))
				    		    	       {     
				    		    	List<WebElement> B2B_SKYSHOP=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2B_SKYSHOP']"));

				    		    	System.out.println("No of B2B_SKYSHOP Trancation Successfull:" + B2B_SKYSHOP.size());
				    		    	
				    		    	 
				    		    	 String Com_TS_Shoogloo1 =String.format("%1s",B2B_SKYSHOP.size());   		    	
						    		    
				    		    	 EG_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
				    		    	 
				    		    	
				    		    	       }
				    	            	 else
					    	            	{
				    	            		 String Com_TS_Shoogloo1 =String.format("%1s",0);   		    	
				 			    		    
				    	            		 EG_TH_B2b_Skyshop =Integer.parseInt(Com_TS_Shoogloo1);
					    	            	}
				    	            break;
				    	            default:System.out.println("Not in 10, 20 or 30");  
				    	         
				    	            }
				    	           }
				    	        }
				    	  
				    	       
			    	
			        
			    	
			        
			        
			        
			    	int TotalValue =  EG_TH_Wego  +  EG_TH_b2c  + EG_TH_MobIos  +  EG_TH_MobAnd +  EG_TH_skyscan 
					        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo +EG_TH_B2bAgent +EG_TH_B2b_Skyshop;
							 
			    	EG_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
							
							int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo +EG_TH_B2bAgent+EG_TH_B2b_Skyshop ;
							
							EG_TH_Other_TransactionHoldTotal =  Other; 
			 				System.out.println(" Other TransactionHold total:::----"+EG_TH_Other_TransactionHoldTotal);
			      
			    	}
			    	SupplierEG.SupplierEG_TH(driver,comTranHold);
			    	//Suppliers Script EG
			    	/*SupplierEG.Suppliers_EG(iTestCaseRow, driver);
			    	Thread.sleep(2000);*/
			    	
			    	driver.findElement(By.id("IsRepriced")).click();
			    	Thread.sleep(4000);
			    	IsRepriced_TS_SD_CN_TH_EG(iTestCaseRow, driver);
			    	Loginpage.ClickOnUsername().click();
			    	Thread.sleep(1000);
			    	Loginpage.Log_Out().click();
			    	Thread.sleep(2000);
			    	
			System.out.println("************************************************************************************");

			
			
		}
		

/*public static void Suppliers_Com(int iTestCaseRow,WebDriver driver) throws Exception
{
	
	//*******************Supplier  Transaction Successfull*********************************************
	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
	Supplier_transaction1.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	
	long timeoutInSeconds = 85;
	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
	String com_S_Trancount=Loginpage.FlightResults_text().getText();
	System.out.println(com_S_Trancount);
	
	
	String com_s_transtr = com_S_Trancount.trim();
	String[] com_s_transplited = com_s_transtr.split("\\:");
	System.out.println("No of Results Count"+com_s_transplited[1]);
	Thread.sleep(1000);
	String tran1="Transaction Successful";
	
	if("Flight Search Results : 0".equals(com_S_Trancount))
	{
		
		System.out.println("Supplier TrancationSuccess total:::----0");
		
		Com_TS_G_3R1=0;
		Com_TS_G_570E=0;
		Com_TS_G_5N61=0;
		Com_TS_G_7FK5=0;
		Com_TS_G_7JY2=0;
		Com_TS_G_7X7W=0;
		Com_TS_G_802N=0;
		Com_TS_G_802R=0;
		Com_TS_G_8SQ7=0;
		Com_TS_JAZEERA=0;
		Com_TS_KIWI=0;
		Com_TS_M_u=0;
		Com_TS_My_Fly=0;
		Com_TS_NESMA=0;
		Com_TS_PEGASUS=0;
		Com_TS_S_9JFH=0;
		Com_TS_S_ID2I=0;
		Com_TS_S_L8YI=0;
		Com_TS_S_L9AI=0;
		Com_TS_S_L9CI=0;
		Com_TS_S_T13I=0;
		Com_TS_S_T20I=0;
		Com_TS_SALAM=0;
		Com_TS_S_Jet=0;
		Com_TS_U_3R1G=0;
		Com_TS_U_570E=0;
		Com_TS_U_5N61=0;
		Com_TS_U_6E=0;
		Com_TS_U_7FK5=0;
		Com_TS_U_7JY2=0;
		Com_TS_U_802N=0;
		Com_TS_U_802R=0;
		Com_TS_U_8SQ7=0;
		Com_TS_WATANIYA=0;
		Com_TS_A_AR=0;
		Com_TS_A_AR_E=0;
		Com_TS_A_AR_M=0;
		Com_TS_A_I_E=0;
		Com_TS_FlyDubai=0;
		Com_TS_Flynas=0;
	         
		
		
         int TotalValue =0;
 		        Com_TS_Supplier_Transaction_Total = TotalValue; 
 				 System.out.println("Supplier Trancation Successfull total:::----"+Com_TS_Supplier_Transaction_Total);
 				
 				
 	        
        
      
	}
	else
	{
	
		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
		 
		  System.out.println("Total Number of Supplier:" + TS.size());
		
		ArrayList<String>list=new ArrayList<>();
		
		 for (WebElement element1 : TS)
		  {
			 list.add(element1.getText());
		  }
		  ArrayList<String> unique = removeDuplicates(list);
		  System.out.println("unique:"+unique.size());
	        for (String element : unique) {
	            System.out.println("element:"+element);
	            
	             
	            
	            
	            String number=element;
	           for(int j=0;j<unique.size();j++)
	           {	
	            switch(number){  
	            case "Galileo-3R1G": 
	            	if(element.equals("Galileo-3R1G")) 
		    	       {
		    	        
		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
		    	String Com_TS_G_3R11 =String.format("%1s",G_3R1.size());
		    	
		    	
		    	 Com_TS_G_3R1 =Integer.parseInt(Com_TS_G_3R11);
		    	
		    	       }
	            	else
	            	{
	            		String Com_TS_G_3R11 =String.format("%1s",0);
	    		    	
	    		    	
	            		Com_TS_G_3R1 =Integer.parseInt(Com_TS_G_3R11);
	            	}
		    	      
	            break; 
	            
	            case "Galileo-570E": 
	            	   
		    	       if(element.equals("Galileo-570E"))
		    	       {
		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
		    	  String Com_TS_G_570E1 =String.format("%1s",G_570E.size());
		    	  
    		    	
    		    	
		    	  Com_TS_G_570E =Integer.parseInt(Com_TS_G_570E1);
		    	       }
		    	       else
    	            	{
		    	    	   String Com_TS_G_570E1 =String.format("%1s",0);
		    		    	  
		    		    	
		    		    	
		    	    	   Com_TS_G_570E =Integer.parseInt(Com_TS_G_570E1);
    	            	}
		    	      
	            break;  
	            case "Galileo-5N61": 
	            	 if(element.equals("Galileo-5N61"))
		    	       {   
		    	       
		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
		    	
		    	
		    	 String Com_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
    		    
		    	 Com_TS_G_5N61 =Integer.parseInt(Com_TS_G_5N611);
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_G_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_G_5N61 =Integer.parseInt(Com_TS_G_5N611);
    	            	}
	            break; 
	            case "Galileo-7FK5": 
	            	 if(element.equals("Galileo-7FK5"))
		    	       {   
		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
		    	 
		    	 String Com_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
	    		    
		    	 Com_TS_G_7FK5 =Integer.parseInt(Com_TS_G_7FK51);
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_G_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_G_7FK5 =Integer.parseInt(Com_TS_G_7FK51);
    	            	}
		    	      
	            break; 
	            case "Galileo-7JY2": 
	            	 if(element.equals("Galileo-7JY2"))
		    	       {        
		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
		    	
		    	 String Com_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
	    		    
		    	 Com_TS_G_7JY2 =Integer.parseInt(Com_TS_G_7JY21);
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_G_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_G_7JY2 =Integer.parseInt(Com_TS_G_7JY21);
    	            	}
		    	     
		    	       
	            break;  
	            case "Galileo-7X7W": 
	            	  if(element.equals("Galileo-7X7W"))
		    	       {   
		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
		    	
		    	
		    	String Com_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
    		    
		    	Com_TS_G_7X7W =Integer.parseInt(Com_TS_G_7X7W1);
		    	       }
	            	  else
    	            	{
	            			String Com_TS_G_7X7W1 =String.format("%1s",0);   		    	
			    		    
	            			Com_TS_G_7X7W =Integer.parseInt(Com_TS_G_7X7W1);
    	            	}
	            break; 
	            case "Galileo-802N": 
	            	  if(element.equals("Galileo-802N"))
		    	       {        
		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
		    	
		    	
		    	String Com_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
    		    
		    	Com_TS_G_802N =Integer.parseInt(Com_TS_G_802N1);
		    	
		    	       }
	            	  else
    	            	{
	            		  String Com_TS_G_802N1 =String.format("%1s",0);   		    	
			    		    
	            		  Com_TS_G_802N =Integer.parseInt(Com_TS_G_802N1);
    	            	}
		    	      
		    	     
	            break;
	            case "Galileo-802R": 
	            	  if(element.equals("Galileo-802R"))
		    	       {   
		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
		    	
		    	String Com_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
    		    
		    	Com_TS_G_802R =Integer.parseInt(Com_TS_G_802R1);
		    	       }
		    	       
	            	  else
    	            	{
	            		  String Com_TS_G_802R1 =String.format("%1s",0);   		    	
			    		    
	            		  Com_TS_G_802R =Integer.parseInt(Com_TS_G_802R1);
    	            	}
		    	       
	            break; 
	            case "Galileo-8SQ7": 
	            	if(element.equals("Galileo-8SQ7"))
		    	       {  
		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
		    	 
		    	 String Com_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
	    		    
		    	 Com_TS_G_8SQ7 =Integer.parseInt(Com_TS_G_8SQ71);
		    	       }
	            	else
	            	{
	            		String Com_TS_G_8SQ71 =String.format("%1s",0);   		    	
		    		    
	            		Com_TS_G_8SQ7 =Integer.parseInt(Com_TS_G_8SQ71);
	            	}
		    	     
	            break;
	            case "JAZEERA": 
	            	
	            	  if(element.equals("JAZEERA"))
		    	       {  
		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
		    	 
		    	 String Com_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
	    		    
		    	 Com_TS_JAZEERA =Integer.parseInt(Com_TS_JAZEERA1);
		    	       }
	            	  else
    	            	{
	            		  
		    		    	 String Com_TS_JAZEERA1 =String.format("%1s",0);   		    	
				    		    
		    		    	 Com_TS_JAZEERA =Integer.parseInt(Com_TS_JAZEERA1);
    	            	}
		    	      
	            break; 
	            case "KIWI": 
	            	 if(element.equals("KIWI"))
		    	       {     
		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
		    	
		    	 
		    	 String Com_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
	    		    
		    	 Com_TS_KIWI =Integer.parseInt(Com_TS_KIWI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_KIWI1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_KIWI =Integer.parseInt(Com_TS_KIWI1);
    	            	}
	            break;
	            case "Manual": 
	            	 if(element.equals("Manual"))
		    	       {     
		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
		    	
		    	 
		    	 String Com_TS_M_u1 =String.format("%1s",M_u.size());   		    	
	    		    
		    	 Com_TS_M_u =Integer.parseInt(Com_TS_M_u1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_M_u1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_M_u =Integer.parseInt(Com_TS_M_u1);
    	            	}
	            break;
	            case "MystiFly": 
	            	 if(element.equals("MystiFly"))
		    	       {     
		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
		    	
		    	 
		    	 String Com_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
	    		    
		    	 Com_TS_My_Fly =Integer.parseInt(Com_TS_My_Fly1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_My_Fly1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_My_Fly =Integer.parseInt(Com_TS_My_Fly1);
    	            	}
	            break;
	            case "NESMA": 
	            	 if(element.equals("NESMA"))
		    	       {     
		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
		    	
		    	 
		    	 String Com_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
	    		    
		    	 Com_TS_NESMA =Integer.parseInt(Com_TS_NESMA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_NESMA1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_NESMA =Integer.parseInt(Com_TS_NESMA1);
    	            	}
	            break;
	            case "PEGASUS": 
	            	 if(element.equals("PEGASUS"))
		    	       {     
		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
		    	
		    	 
		    	 String Com_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
	    		    
		    	 Com_TS_PEGASUS =Integer.parseInt(Com_TS_PEGASUS1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_PEGASUS1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_PEGASUS =Integer.parseInt(Com_TS_PEGASUS1);
    	            	}
	            break;
	            case "SABRE-9JFH": 
	            	 if(element.equals("SABRE-9JFH"))
		    	       {     
		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
		    	
		    	 
		    	 String Com_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
	    		    
		    	 Com_TS_S_9JFH =Integer.parseInt(Com_TS_S_9JFH1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_9JFH1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_9JFH =Integer.parseInt(Com_TS_S_9JFH1);
    	            	}
	            break;
	            case "SABRE-ID2I": 
	            	 if(element.equals("SABRE-ID2I"))
		    	       {     
		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
		    	
		    	 
		    	 String Com_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
	    		    
		    	 Com_TS_S_ID2I =Integer.parseInt(Com_TS_S_ID2I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_ID2I1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_ID2I =Integer.parseInt(Com_TS_S_ID2I1);
    	            	}
	            break;
	            case "SABRE-L8YI": 
	            	 if(element.equals("SABRE-L8YI"))
		    	       {     
		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
		    	
		    	 
		    	 String Com_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
	    		    
		    	 Com_TS_S_L8YI =Integer.parseInt(Com_TS_S_L8YI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_L8YI1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_L8YI =Integer.parseInt(Com_TS_S_L8YI1);
    	            	}
	            break;
	            case "SABRE-L9AI": 
	            	 if(element.equals("SABRE-L9AI"))
		    	       {     
		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
		    	
		    	 
		    	 String Com_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
	    		    
		    	 Com_TS_S_L9AI =Integer.parseInt(Com_TS_S_L9AI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_L9AI1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_L9AI =Integer.parseInt(Com_TS_S_L9AI1);
    	            	}
	            break;
	            case "SABRE-L9CI": 
	            	 if(element.equals("SABRE-L9CI"))
		    	       {     
		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
		    	
		    	 
		    	 String Com_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
	    		    
		    	 Com_TS_S_L9CI =Integer.parseInt(Com_TS_S_L9CI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_L9CI1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_L9CI =Integer.parseInt(Com_TS_S_L9CI1);
    	            	}
	            break;
	            case "SABRE-T13I": 
	            	 if(element.equals("SABRE-T13I"))
		    	       {     
		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
		    	
		    	 
		    	 String Com_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
	    		    
		    	 Com_TS_S_T13I =Integer.parseInt(Com_TS_S_T13I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_T13I1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_T13I =Integer.parseInt(Com_TS_S_T13I1);
    	            	}
	            break;
	            case "SABRE-T20I": 
	            	 if(element.equals("SABRE-T20I"))
		    	       {     
		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
		    	
		    	 
		    	 String Com_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
	    		    
		    	 Com_TS_S_T20I =Integer.parseInt(Com_TS_S_T20I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_T20I1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_T20I =Integer.parseInt(Com_TS_S_T20I1);
    	            	}
	            break;
	            case "SALAM": 
	            	 if(element.equals("SALAM"))
		    	       {     
		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
		    	
		    	 
		    	 String Com_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
	    		    
		    	 Com_TS_SALAM =Integer.parseInt(Com_TS_SALAM1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_SALAM1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_SALAM =Integer.parseInt(Com_TS_SALAM1);
    	            	}
	            break;
	            case "SpiceJet": 
	            	 if(element.equals("SpiceJet"))
		    	       {     
		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
		    	
		    	 
		    	 String Com_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
	    		    
		    	 Com_TS_S_Jet =Integer.parseInt(Com_TS_S_Jet1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_S_Jet1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_S_Jet =Integer.parseInt(Com_TS_S_Jet1);
    	            	}
	            break;
	            case "UAPI-3R1G": 
	            	 if(element.equals("UAPI-3R1G"))
		    	       {     
		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
		    	
		    	 
		    	 String Com_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
	    		    
		    	 Com_TS_U_3R1G =Integer.parseInt(Com_TS_U_3R1G1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_3R1G1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_3R1G =Integer.parseInt(Com_TS_U_3R1G1);
    	            	}
	            break;
	            case "UAPI-570E": 
	            	 if(element.equals("UAPI-570E"))
		    	       {     
		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
		    	
		    	 
		    	 String Com_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
	    		    
		    	 Com_TS_U_570E =Integer.parseInt(Com_TS_U_570E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_570E1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_570E =Integer.parseInt(Com_TS_U_570E1);
    	            	}
	            break;
	            case "UAPI-5N61": 
	            	 if(element.equals("UAPI-5N61"))
		    	       {     
		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
		    	
		    	 
		    	 String Com_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
	    		    
		    	 Com_TS_U_5N61 =Integer.parseInt(Com_TS_U_5N611);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_5N61 =Integer.parseInt(Com_TS_U_5N611);
    	            	}
	            break;
	            case "UAPI-6E": 
	            	 if(element.equals("UAPI-6E"))
		    	       {     
		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
		    	
		    	 
		    	 String Com_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
	    		    
		    	 Com_TS_U_6E =Integer.parseInt(Com_TS_U_6E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_6E1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_6E =Integer.parseInt(Com_TS_U_6E1);
    	            	}
	            break;
	            case "UAPI-7FK5": 
	            	 if(element.equals("UAPI-7FK5"))
		    	       {     
		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
		    	
		    	 
		    	 String Com_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
	    		    
		    	 Com_TS_U_7FK5 =Integer.parseInt(Com_TS_U_7FK51);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_7FK5 =Integer.parseInt(Com_TS_U_7FK51);
    	            	}
	            break;
	            case "UAPI-7JY2": 
	            	 if(element.equals("UAPI-7JY2"))
		    	       {     
		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
		    	
		    	 
		    	 String Com_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
	    		    
		    	 Com_TS_U_7JY2 =Integer.parseInt(Com_TS_U_7JY21);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_7JY2 =Integer.parseInt(Com_TS_U_7JY21);
    	            	}
	            break;
	            case "UAPI-802N": 
	            	 if(element.equals("UAPI-802N"))
		    	       {     
		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
		    	
		    	 
		    	 String Com_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
	    		    
		    	 Com_TS_U_802N =Integer.parseInt(Com_TS_U_802N1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_802N1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_802N =Integer.parseInt(Com_TS_U_802N1);
    	            	}
	            break;
	            case "UAPI-802R": 
	            	 if(element.equals("UAPI-802R"))
		    	       {     
		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
		    	
		    	 
		    	 String Com_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
	    		    
		    	 Com_TS_U_802R =Integer.parseInt(Com_TS_U_802R1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_802R1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_802R =Integer.parseInt(Com_TS_U_802R1);
    	            	}
	            break;
	            case "UAPI-8SQ7": 
	            	 if(element.equals("UAPI-8SQ7"))
		    	       {     
		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
		    	
		    	 
		    	 String Com_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
	    		    
		    	 Com_TS_U_8SQ7 =Integer.parseInt(Com_TS_U_8SQ71);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_U_8SQ71 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_U_8SQ7 =Integer.parseInt(Com_TS_U_8SQ71);
    	            	}
	            break;
	            case "WATANIYA": 
	            	 if(element.equals("WATANIYA"))
		    	       {     
		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
		    	
		    	 
		    	 String Com_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
	    		    
		    	 Com_TS_WATANIYA =Integer.parseInt(Com_TS_WATANIYA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_WATANIYA1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_WATANIYA =Integer.parseInt(Com_TS_WATANIYA1);
    	            	}
	            break;
	            case "Air Arabia": 
	            	 if(element.equals("Air Arabia"))
		    	       {     
		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
		    	
		    	 
		    	 String Com_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
	    		    
		    	 Com_TS_A_AR =Integer.parseInt(Com_TS_A_AR1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_A_AR1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_A_AR =Integer.parseInt(Com_TS_A_AR1);
    	            	}
	            break;
	            case "Air Arabia Egypt": 
	            	 if(element.equals("Air Arabia Egypt"))
		    	       {     
		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
		    	
		    	 
		    	 String Com_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
	    		    
		    	 Com_TS_A_AR_E =Integer.parseInt(Com_TS_A_AR_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_A_AR_E1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_A_AR_E =Integer.parseInt(Com_TS_A_AR_E1);
    	            	}
	            break;
	            case "Air Arabia Moroc": 
	            	 if(element.equals("Air Arabia Moroc"))
		    	       {     
		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
		    	
		    	 
		    	 String Com_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
	    		    
		    	 Com_TS_A_AR_M =Integer.parseInt(Com_TS_A_AR_M1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_A_AR_M1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_A_AR_M =Integer.parseInt(Com_TS_A_AR_M1);
    	            	}
	            break;
	            case "AirIndiaExpress": 
	            	 if(element.equals("AirIndiaExpress"))
		    	       {     
		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
		    	
		    	 
		    	 String Com_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
	    		    
		    	 Com_TS_A_I_E =Integer.parseInt(Com_TS_A_I_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_A_I_E1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_A_I_E =Integer.parseInt(Com_TS_A_I_E1);
    	            	}
	            break;
	            case "FlyDubai": 
	            	 if(element.equals("FlyDubai"))
		    	       {     
		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
		    	
		    	 
		    	 String Com_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
	    		    
		    	 Com_TS_FlyDubai =Integer.parseInt(Com_TS_FlyDubai1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_FlyDubai1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_FlyDubai =Integer.parseInt(Com_TS_FlyDubai1);
    	            	}
	            break;
	            case "Flynas": 
	            	 if(element.equals("Flynas"))
		    	       {     
		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
		    	
		    	 
		    	 String Com_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
	    		    
		    	 Com_TS_Flynas =Integer.parseInt(Com_TS_Flynas1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String Com_TS_Flynas1 =String.format("%1s",0);   		    	
			    		    
	            		 Com_TS_Flynas =Integer.parseInt(Com_TS_Flynas1);
    	            	}
	            break;
	            
	            
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  
        
        int TotalValue = Com_TS_G_3R1+Com_TS_G_570E+Com_TS_G_5N61+Com_TS_G_7FK5+Com_TS_G_7JY2+Com_TS_G_7X7W+Com_TS_G_802N+Com_TS_G_802R
        		+Com_TS_G_8SQ7+Com_TS_JAZEERA+Com_TS_KIWI+Com_TS_M_u+Com_TS_My_Fly+Com_TS_NESMA+Com_TS_PEGASUS+Com_TS_S_9JFH+Com_TS_S_ID2I
        		+Com_TS_S_L8YI+Com_TS_S_L9AI+Com_TS_S_L9CI+Com_TS_S_T13I+Com_TS_S_T20I+Com_TS_SALAM+Com_TS_S_Jet+Com_TS_U_3R1G+Com_TS_U_570E
        		+Com_TS_U_5N61+Com_TS_U_6E+Com_TS_U_7FK5+Com_TS_U_7JY2+Com_TS_U_802N+Com_TS_U_802R+Com_TS_U_8SQ7+Com_TS_WATANIYA+Com_TS_A_AR
        		+Com_TS_A_AR_E+Com_TS_A_AR_M+Com_TS_A_I_E+Com_TS_FlyDubai+Com_TS_Flynas;
		  
        Com_TS_Supplier_Transaction_Total = TotalValue; 
		 System.out.println("Supplier Trancation Successfull total:::----"+Com_TS_Supplier_Transaction_Total);
		
		
    
   
		//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	}
	      
}

public static void Suppliers_AE(int iTestCaseRow,WebDriver driver) throws Exception
{
	//*******************Supplier  Transaction Successfull*********************************************
	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
	Supplier_transaction1.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	
	long timeoutInSeconds = 85;
	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
	String com_S_Trancount=Loginpage.FlightResults_text().getText();
	System.out.println(com_S_Trancount);
	
	
	String com_s_transtr = com_S_Trancount.trim();
	String[] com_s_transplited = com_s_transtr.split("\\:");
	System.out.println("No of Results Count"+com_s_transplited[1]);
	Thread.sleep(1000);
	String tran1="Transaction Successful";
	
	if("Flight Search Results : 0".equals(com_S_Trancount))
	{
		
		System.out.println("Supplier TrancationSuccess total:::----0");
		
		AE_TS_G_3R1=0;
		AE_TS_G_570E=0;
		AE_TS_G_5N61=0;
		AE_TS_G_7FK5=0;
		AE_TS_G_7JY2=0;
		AE_TS_G_7X7W=0;
		AE_TS_G_802N=0;
		AE_TS_G_802R=0;
		AE_TS_G_8SQ7=0;
		AE_TS_JAZEERA=0;
		AE_TS_KIWI=0;
		AE_TS_M_u=0;
		AE_TS_My_Fly=0;
		AE_TS_NESMA=0;
		AE_TS_PEGASUS=0;
		AE_TS_S_9JFH=0;
		AE_TS_S_ID2I=0;
		AE_TS_S_L8YI=0;
		AE_TS_S_L9AI=0;
		AE_TS_S_L9CI=0;
		AE_TS_S_T13I=0;
		AE_TS_S_T20I=0;
		AE_TS_SALAM=0;
		AE_TS_S_Jet=0;
		AE_TS_U_3R1G=0;
		AE_TS_U_570E=0;
		AE_TS_U_5N61=0;
		AE_TS_U_6E=0;
		AE_TS_U_7FK5=0;
		AE_TS_U_7JY2=0;
		AE_TS_U_802N=0;
		AE_TS_U_802R=0;
		AE_TS_U_8SQ7=0;
		AE_TS_WATANIYA=0;
		AE_TS_A_AR=0;
		AE_TS_A_AR_E=0;
		AE_TS_A_AR_M=0;
		AE_TS_A_I_E=0;
		AE_TS_FlyDubai=0;
		AE_TS_Flynas=0;
	         
		
		
         int TotalValue =0;
 		        AE_TS_Supplier_Transaction_Total = TotalValue; 
 				 System.out.println("Supplier Trancation Successfull total:::----"+AE_TS_Supplier_Transaction_Total);
 				
 				
 	        
        
      
	}
	else
	{
	
		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
		 
		  System.out.println("Total Number of Supplier:" + TS.size());
		
		ArrayList<String>list=new ArrayList<>();
		
		 for (WebElement element1 : TS)
		  {
			 list.add(element1.getText());
		  }
		  ArrayList<String> unique = removeDuplicates(list);
		  System.out.println("unique:"+unique.size());
	        for (String element : unique) {
	            System.out.println("element:"+element);
	            
	             
	            
	            
	            String number=element;
	           for(int j=0;j<unique.size();j++)
	           {	
	            switch(number){  
	            case "Galileo-3R1G": 
	            	if(element.equals("Galileo-3R1G")) 
		    	       {
		    	        
		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
		    	String AE_TS_G_3R11 =String.format("%1s",G_3R1.size());
		    	
		    	
		    	 AE_TS_G_3R1 =Integer.parseInt(AE_TS_G_3R11);
		    	
		    	       }
	            	else
	            	{
	            		String AE_TS_G_3R11 =String.format("%1s",0);
	    		    	
	    		    	
	            		AE_TS_G_3R1 =Integer.parseInt(AE_TS_G_3R11);
	            	}
		    	      
	            break; 
	            
	            case "Galileo-570E": 
	            	   
		    	       if(element.equals("Galileo-570E"))
		    	       {
		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
		    	  String AE_TS_G_570E1 =String.format("%1s",G_570E.size());
		    	  
    		    	
    		    	
		    	  AE_TS_G_570E =Integer.parseInt(AE_TS_G_570E1);
		    	       }
		    	       else
    	            	{
		    	    	   String AE_TS_G_570E1 =String.format("%1s",0);
		    		    	  
		    		    	
		    		    	
		    	    	   AE_TS_G_570E =Integer.parseInt(AE_TS_G_570E1);
    	            	}
		    	      
	            break;  
	            case "Galileo-5N61": 
	            	 if(element.equals("Galileo-5N61"))
		    	       {   
		    	       
		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
		    	
		    	
		    	 String AE_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
    		    
		    	 AE_TS_G_5N61 =Integer.parseInt(AE_TS_G_5N611);
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_G_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_G_5N61 =Integer.parseInt(AE_TS_G_5N611);
    	            	}
	            break; 
	            case "Galileo-7FK5": 
	            	 if(element.equals("Galileo-7FK5"))
		    	       {   
		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
		    	 
		    	 String AE_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
	    		    
		    	 AE_TS_G_7FK5 =Integer.parseInt(AE_TS_G_7FK51);
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_G_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_G_7FK5 =Integer.parseInt(AE_TS_G_7FK51);
    	            	}
		    	      
	            break; 
	            case "Galileo-7JY2": 
	            	 if(element.equals("Galileo-7JY2"))
		    	       {        
		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
		    	
		    	 String AE_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
	    		    
		    	 AE_TS_G_7JY2 =Integer.parseInt(AE_TS_G_7JY21);
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_G_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_G_7JY2 =Integer.parseInt(AE_TS_G_7JY21);
    	            	}
		    	     
		    	       
	            break;  
	            case "Galileo-7X7W": 
	            	  if(element.equals("Galileo-7X7W"))
		    	       {   
		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
		    	
		    	
		    	String AE_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
    		    
		    	AE_TS_G_7X7W =Integer.parseInt(AE_TS_G_7X7W1);
		    	       }
	            	  else
    	            	{
	            			String AE_TS_G_7X7W1 =String.format("%1s",0);   		    	
			    		    
	            			AE_TS_G_7X7W =Integer.parseInt(AE_TS_G_7X7W1);
    	            	}
	            break; 
	            case "Galileo-802N": 
	            	  if(element.equals("Galileo-802N"))
		    	       {        
		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
		    	
		    	
		    	String AE_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
    		    
		    	AE_TS_G_802N =Integer.parseInt(AE_TS_G_802N1);
		    	
		    	       }
	            	  else
    	            	{
	            		  String AE_TS_G_802N1 =String.format("%1s",0);   		    	
			    		    
	            		  AE_TS_G_802N =Integer.parseInt(AE_TS_G_802N1);
    	            	}
		    	      
		    	     
	            break;
	            case "Galileo-802R": 
	            	  if(element.equals("Galileo-802R"))
		    	       {   
		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
		    	
		    	String AE_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
    		    
		    	AE_TS_G_802R =Integer.parseInt(AE_TS_G_802R1);
		    	       }
		    	       
	            	  else
    	            	{
	            		  String AE_TS_G_802R1 =String.format("%1s",0);   		    	
			    		    
	            		  AE_TS_G_802R =Integer.parseInt(AE_TS_G_802R1);
    	            	}
		    	       
	            break; 
	            case "Galileo-8SQ7": 
	            	if(element.equals("Galileo-8SQ7"))
		    	       {  
		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
		    	 
		    	 String AE_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
	    		    
		    	 AE_TS_G_8SQ7 =Integer.parseInt(AE_TS_G_8SQ71);
		    	       }
	            	else
	            	{
	            		String AE_TS_G_8SQ71 =String.format("%1s",0);   		    	
		    		    
	            		AE_TS_G_8SQ7 =Integer.parseInt(AE_TS_G_8SQ71);
	            	}
		    	     
	            break;
	            case "JAZEERA": 
	            	
	            	  if(element.equals("JAZEERA"))
		    	       {  
		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
		    	 
		    	 String AE_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
	    		    
		    	 AE_TS_JAZEERA =Integer.parseInt(AE_TS_JAZEERA1);
		    	       }
	            	  else
    	            	{
	            		  
		    		    	 String AE_TS_JAZEERA1 =String.format("%1s",0);   		    	
				    		    
		    		    	 AE_TS_JAZEERA =Integer.parseInt(AE_TS_JAZEERA1);
    	            	}
		    	      
	            break; 
	            case "KIWI": 
	            	 if(element.equals("KIWI"))
		    	       {     
		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
		    	
		    	 
		    	 String AE_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
	    		    
		    	 AE_TS_KIWI =Integer.parseInt(AE_TS_KIWI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_KIWI1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_KIWI =Integer.parseInt(AE_TS_KIWI1);
    	            	}
	            break;
	            case "Manual": 
	            	 if(element.equals("Manual"))
		    	       {     
		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
		    	
		    	 
		    	 String AE_TS_M_u1 =String.format("%1s",M_u.size());   		    	
	    		    
		    	 AE_TS_M_u =Integer.parseInt(AE_TS_M_u1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_M_u1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_M_u =Integer.parseInt(AE_TS_M_u1);
    	            	}
	            break;
	            case "MystiFly": 
	            	 if(element.equals("MystiFly"))
		    	       {     
		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
		    	
		    	 
		    	 String AE_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
	    		    
		    	 AE_TS_My_Fly =Integer.parseInt(AE_TS_My_Fly1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_My_Fly1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_My_Fly =Integer.parseInt(AE_TS_My_Fly1);
    	            	}
	            break;
	            case "NESMA": 
	            	 if(element.equals("NESMA"))
		    	       {     
		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
		    	
		    	 
		    	 String AE_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
	    		    
		    	 AE_TS_NESMA =Integer.parseInt(AE_TS_NESMA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_NESMA1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_NESMA =Integer.parseInt(AE_TS_NESMA1);
    	            	}
	            break;
	            case "PEGASUS": 
	            	 if(element.equals("PEGASUS"))
		    	       {     
		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
		    	
		    	 
		    	 String AE_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
	    		    
		    	 AE_TS_PEGASUS =Integer.parseInt(AE_TS_PEGASUS1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_PEGASUS1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_PEGASUS =Integer.parseInt(AE_TS_PEGASUS1);
    	            	}
	            break;
	            case "SABRE-9JFH": 
	            	 if(element.equals("SABRE-9JFH"))
		    	       {     
		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
		    	
		    	 
		    	 String AE_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
	    		    
		    	 AE_TS_S_9JFH =Integer.parseInt(AE_TS_S_9JFH1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_9JFH1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_9JFH =Integer.parseInt(AE_TS_S_9JFH1);
    	            	}
	            break;
	            case "SABRE-ID2I": 
	            	 if(element.equals("SABRE-ID2I"))
		    	       {     
		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
		    	
		    	 
		    	 String AE_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
	    		    
		    	 AE_TS_S_ID2I =Integer.parseInt(AE_TS_S_ID2I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_ID2I1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_ID2I =Integer.parseInt(AE_TS_S_ID2I1);
    	            	}
	            break;
	            case "SABRE-L8YI": 
	            	 if(element.equals("SABRE-L8YI"))
		    	       {     
		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
		    	
		    	 
		    	 String AE_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
	    		    
		    	 AE_TS_S_L8YI =Integer.parseInt(AE_TS_S_L8YI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_L8YI1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_L8YI =Integer.parseInt(AE_TS_S_L8YI1);
    	            	}
	            break;
	            case "SABRE-L9AI": 
	            	 if(element.equals("SABRE-L9AI"))
		    	       {     
		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
		    	
		    	 
		    	 String AE_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
	    		    
		    	 AE_TS_S_L9AI =Integer.parseInt(AE_TS_S_L9AI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_L9AI1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_L9AI =Integer.parseInt(AE_TS_S_L9AI1);
    	            	}
	            break;
	            case "SABRE-L9CI": 
	            	 if(element.equals("SABRE-L9CI"))
		    	       {     
		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
		    	
		    	 
		    	 String AE_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
	    		    
		    	 AE_TS_S_L9CI =Integer.parseInt(AE_TS_S_L9CI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_L9CI1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_L9CI =Integer.parseInt(AE_TS_S_L9CI1);
    	            	}
	            break;
	            case "SABRE-T13I": 
	            	 if(element.equals("SABRE-T13I"))
		    	       {     
		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
		    	
		    	 
		    	 String AE_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
	    		    
		    	 AE_TS_S_T13I =Integer.parseInt(AE_TS_S_T13I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_T13I1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_T13I =Integer.parseInt(AE_TS_S_T13I1);
    	            	}
	            break;
	            case "SABRE-T20I": 
	            	 if(element.equals("SABRE-T20I"))
		    	       {     
		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
		    	
		    	 
		    	 String AE_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
	    		    
		    	 AE_TS_S_T20I =Integer.parseInt(AE_TS_S_T20I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_T20I1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_T20I =Integer.parseInt(AE_TS_S_T20I1);
    	            	}
	            break;
	            case "SALAM": 
	            	 if(element.equals("SALAM"))
		    	       {     
		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
		    	
		    	 
		    	 String AE_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
	    		    
		    	 AE_TS_SALAM =Integer.parseInt(AE_TS_SALAM1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_SALAM1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_SALAM =Integer.parseInt(AE_TS_SALAM1);
    	            	}
	            break;
	            case "SpiceJet": 
	            	 if(element.equals("SpiceJet"))
		    	       {     
		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
		    	
		    	 
		    	 String AE_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
	    		    
		    	 AE_TS_S_Jet =Integer.parseInt(AE_TS_S_Jet1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_S_Jet1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_S_Jet =Integer.parseInt(AE_TS_S_Jet1);
    	            	}
	            break;
	            case "UAPI-3R1G": 
	            	 if(element.equals("UAPI-3R1G"))
		    	       {     
		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
		    	
		    	 
		    	 String AE_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
	    		    
		    	 AE_TS_U_3R1G =Integer.parseInt(AE_TS_U_3R1G1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_3R1G1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_3R1G =Integer.parseInt(AE_TS_U_3R1G1);
    	            	}
	            break;
	            case "UAPI-570E": 
	            	 if(element.equals("UAPI-570E"))
		    	       {     
		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
		    	
		    	 
		    	 String AE_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
	    		    
		    	 AE_TS_U_570E =Integer.parseInt(AE_TS_U_570E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_570E1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_570E =Integer.parseInt(AE_TS_U_570E1);
    	            	}
	            break;
	            case "UAPI-5N61": 
	            	 if(element.equals("UAPI-5N61"))
		    	       {     
		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
		    	
		    	 
		    	 String AE_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
	    		    
		    	 AE_TS_U_5N61 =Integer.parseInt(AE_TS_U_5N611);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_5N61 =Integer.parseInt(AE_TS_U_5N611);
    	            	}
	            break;
	            case "UAPI-6E": 
	            	 if(element.equals("UAPI-6E"))
		    	       {     
		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
		    	
		    	 
		    	 String AE_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
	    		    
		    	 AE_TS_U_6E =Integer.parseInt(AE_TS_U_6E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_6E1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_6E =Integer.parseInt(AE_TS_U_6E1);
    	            	}
	            break;
	            case "UAPI-7FK5": 
	            	 if(element.equals("UAPI-7FK5"))
		    	       {     
		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
		    	
		    	 
		    	 String AE_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
	    		    
		    	 AE_TS_U_7FK5 =Integer.parseInt(AE_TS_U_7FK51);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_7FK5 =Integer.parseInt(AE_TS_U_7FK51);
    	            	}
	            break;
	            case "UAPI-7JY2": 
	            	 if(element.equals("UAPI-7JY2"))
		    	       {     
		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
		    	
		    	 
		    	 String AE_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
	    		    
		    	 AE_TS_U_7JY2 =Integer.parseInt(AE_TS_U_7JY21);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_7JY2 =Integer.parseInt(AE_TS_U_7JY21);
    	            	}
	            break;
	            case "UAPI-802N": 
	            	 if(element.equals("UAPI-802N"))
		    	       {     
		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
		    	
		    	 
		    	 String AE_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
	    		    
		    	 AE_TS_U_802N =Integer.parseInt(AE_TS_U_802N1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_802N1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_802N =Integer.parseInt(AE_TS_U_802N1);
    	            	}
	            break;
	            case "UAPI-802R": 
	            	 if(element.equals("UAPI-802R"))
		    	       {     
		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
		    	
		    	 
		    	 String AE_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
	    		    
		    	 AE_TS_U_802R =Integer.parseInt(AE_TS_U_802R1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_802R1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_802R =Integer.parseInt(AE_TS_U_802R1);
    	            	}
	            break;
	            case "UAPI-8SQ7": 
	            	 if(element.equals("UAPI-8SQ7"))
		    	       {     
		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
		    	
		    	 
		    	 String AE_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
	    		    
		    	 AE_TS_U_8SQ7 =Integer.parseInt(AE_TS_U_8SQ71);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_U_8SQ71 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_U_8SQ7 =Integer.parseInt(AE_TS_U_8SQ71);
    	            	}
	            break;
	            case "WATANIYA": 
	            	 if(element.equals("WATANIYA"))
		    	       {     
		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
		    	
		    	 
		    	 String AE_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
	    		    
		    	 AE_TS_WATANIYA =Integer.parseInt(AE_TS_WATANIYA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_WATANIYA1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_WATANIYA =Integer.parseInt(AE_TS_WATANIYA1);
    	            	}
	            break;
	            case "Air Arabia": 
	            	 if(element.equals("Air Arabia"))
		    	       {     
		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
		    	
		    	 
		    	 String AE_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
	    		    
		    	 AE_TS_A_AR =Integer.parseInt(AE_TS_A_AR1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_A_AR1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_A_AR =Integer.parseInt(AE_TS_A_AR1);
    	            	}
	            break;
	            case "Air Arabia Egypt": 
	            	 if(element.equals("Air Arabia Egypt"))
		    	       {     
		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
		    	
		    	 
		    	 String AE_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
	    		    
		    	 AE_TS_A_AR_E =Integer.parseInt(AE_TS_A_AR_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_A_AR_E1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_A_AR_E =Integer.parseInt(AE_TS_A_AR_E1);
    	            	}
	            break;
	            case "Air Arabia Moroc": 
	            	 if(element.equals("Air Arabia Moroc"))
		    	       {     
		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
		    	
		    	 
		    	 String AE_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
	    		    
		    	 AE_TS_A_AR_M =Integer.parseInt(AE_TS_A_AR_M1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_A_AR_M1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_A_AR_M =Integer.parseInt(AE_TS_A_AR_M1);
    	            	}
	            break;
	            case "AirIndiaExpress": 
	            	 if(element.equals("AirIndiaExpress"))
		    	       {     
		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
		    	
		    	 
		    	 String AE_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
	    		    
		    	 AE_TS_A_I_E =Integer.parseInt(AE_TS_A_I_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_A_I_E1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_A_I_E =Integer.parseInt(AE_TS_A_I_E1);
    	            	}
	            break;
	            case "FlyDubai": 
	            	 if(element.equals("FlyDubai"))
		    	       {     
		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
		    	
		    	 
		    	 String AE_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
	    		    
		    	 AE_TS_FlyDubai =Integer.parseInt(AE_TS_FlyDubai1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_FlyDubai1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_FlyDubai =Integer.parseInt(AE_TS_FlyDubai1);
    	            	}
	            break;
	            case "Flynas": 
	            	 if(element.equals("Flynas"))
		    	       {     
		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
		    	
		    	 
		    	 String AE_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
	    		    
		    	 AE_TS_Flynas =Integer.parseInt(AE_TS_Flynas1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String AE_TS_Flynas1 =String.format("%1s",0);   		    	
			    		    
	            		 AE_TS_Flynas =Integer.parseInt(AE_TS_Flynas1);
    	            	}
	            break;
	            
	            
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  
        
        int TotalValue = AE_TS_G_3R1+AE_TS_G_570E+AE_TS_G_5N61+AE_TS_G_7FK5+AE_TS_G_7JY2+AE_TS_G_7X7W+AE_TS_G_802N+AE_TS_G_802R
        		+AE_TS_G_8SQ7+AE_TS_JAZEERA+AE_TS_KIWI+AE_TS_M_u+AE_TS_My_Fly+AE_TS_NESMA+AE_TS_PEGASUS+AE_TS_S_9JFH+AE_TS_S_ID2I
        		+AE_TS_S_L8YI+AE_TS_S_L9AI+AE_TS_S_L9CI+AE_TS_S_T13I+AE_TS_S_T20I+AE_TS_SALAM+AE_TS_S_Jet+AE_TS_U_3R1G+AE_TS_U_570E
        		+AE_TS_U_5N61+AE_TS_U_6E+AE_TS_U_7FK5+AE_TS_U_7JY2+AE_TS_U_802N+AE_TS_U_802R+AE_TS_U_8SQ7+AE_TS_WATANIYA+AE_TS_A_AR
        		+AE_TS_A_AR_E+AE_TS_A_AR_M+AE_TS_A_I_E+AE_TS_FlyDubai+AE_TS_Flynas;
		  
        AE_TS_Supplier_Transaction_Total = TotalValue; 
		 System.out.println("Supplier Trancation Successfull total:::----"+AE_TS_Supplier_Transaction_Total);
		
		
    
   
		//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	}
}

public static void Suppliers_SA(int iTestCaseRow,WebDriver driver) throws Exception

{
	//*******************Supplier  Transaction Successfull*********************************************
	Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
	Supplier_transaction1.selectByIndex(3);
	Thread.sleep(1000);
	Loginpage.Search_button().click();
	Thread.sleep(1000);
	
	
	long timeoutInSeconds = 85;
	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
	String com_S_Trancount=Loginpage.FlightResults_text().getText();
	System.out.println(com_S_Trancount);
	
	
	String com_s_transtr = com_S_Trancount.trim();
	String[] com_s_transplited = com_s_transtr.split("\\:");
	System.out.println("No of Results Count"+com_s_transplited[1]);
	Thread.sleep(1000);
	String tran1="Transaction Successful";
	
	if("Flight Search Results : 0".equals(com_S_Trancount))
	{
		
		System.out.println("Supplier TrancationSuccess total:::----0");
		
		SA_TS_G_3R1=0;
		SA_TS_G_570E=0;
		SA_TS_G_5N61=0;
		SA_TS_G_7FK5=0;
		SA_TS_G_7JY2=0;
		SA_TS_G_7X7W=0;
		SA_TS_G_802N=0;
		SA_TS_G_802R=0;
		SA_TS_G_8SQ7=0;
		SA_TS_JAZEERA=0;
		SA_TS_KIWI=0;
		SA_TS_M_u=0;
		SA_TS_My_Fly=0;
		SA_TS_NESMA=0;
		SA_TS_PEGASUS=0;
		SA_TS_S_9JFH=0;
		SA_TS_S_ID2I=0;
		SA_TS_S_L8YI=0;
		SA_TS_S_L9AI=0;
		SA_TS_S_L9CI=0;
		SA_TS_S_T13I=0;
		SA_TS_S_T20I=0;
		SA_TS_SALAM=0;
		SA_TS_S_Jet=0;
		SA_TS_U_3R1G=0;
		SA_TS_U_570E=0;
		SA_TS_U_5N61=0;
		SA_TS_U_6E=0;
		SA_TS_U_7FK5=0;
		SA_TS_U_7JY2=0;
		SA_TS_U_802N=0;
		SA_TS_U_802R=0;
		SA_TS_U_8SQ7=0;
		SA_TS_WATANIYA=0;
		SA_TS_A_AR=0;
		SA_TS_A_AR_E=0;
		SA_TS_A_AR_M=0;
		SA_TS_A_I_E=0;
		SA_TS_FlyDubai=0;
		SA_TS_Flynas=0;
	         
		
		
         int TotalValue =0;
 		        SA_TS_Supplier_Transaction_Total = TotalValue; 
 				 System.out.println("Supplier Trancation Successfull total:::----"+SA_TS_Supplier_Transaction_Total);
 				
 				
 	        
        
      
	}
	else
	{
	
		List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
		 
		  System.out.println("Total Number of Supplier:" + TS.size());
		
		ArrayList<String>list=new ArrayList<>();
		
		 for (WebElement element1 : TS)
		  {
			 list.add(element1.getText());
		  }
		  ArrayList<String> unique = removeDuplicates(list);
		  System.out.println("unique:"+unique.size());
	        for (String element : unique) {
	            System.out.println("element:"+element);
	            
	             
	            
	            
	            String number=element;
	           for(int j=0;j<unique.size();j++)
	           {	
	            switch(number){  
	            case "Galileo-3R1G": 
	            	if(element.equals("Galileo-3R1G")) 
		    	       {
		    	        
		    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

		    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
		    	String SA_TS_G_3R11 =String.format("%1s",G_3R1.size());
		    	
		    	
		    	 SA_TS_G_3R1 =Integer.parseInt(SA_TS_G_3R11);
		    	
		    	       }
	            	else
	            	{
	            		String SA_TS_G_3R11 =String.format("%1s",0);
	    		    	
	    		    	
	            		SA_TS_G_3R1 =Integer.parseInt(SA_TS_G_3R11);
	            	}
		    	      
	            break; 
	            
	            case "Galileo-570E": 
	            	   
		    	       if(element.equals("Galileo-570E"))
		    	       {
		    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

		    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
		    	  String SA_TS_G_570E1 =String.format("%1s",G_570E.size());
		    	  
    		    	
    		    	
		    	  SA_TS_G_570E =Integer.parseInt(SA_TS_G_570E1);
		    	       }
		    	       else
    	            	{
		    	    	   String SA_TS_G_570E1 =String.format("%1s",0);
		    		    	  
		    		    	
		    		    	
		    	    	   SA_TS_G_570E =Integer.parseInt(SA_TS_G_570E1);
    	            	}
		    	      
	            break;  
	            case "Galileo-5N61": 
	            	 if(element.equals("Galileo-5N61"))
		    	       {   
		    	       
		    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

		    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
		    	
		    	
		    	 String SA_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
    		    
		    	 SA_TS_G_5N61 =Integer.parseInt(SA_TS_G_5N611);
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_G_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_G_5N61 =Integer.parseInt(SA_TS_G_5N611);
    	            	}
	            break; 
	            case "Galileo-7FK5": 
	            	 if(element.equals("Galileo-7FK5"))
		    	       {   
		    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

		    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
		    	 
		    	 String SA_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
	    		    
		    	 SA_TS_G_7FK5 =Integer.parseInt(SA_TS_G_7FK51);
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_G_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_G_7FK5 =Integer.parseInt(SA_TS_G_7FK51);
    	            	}
		    	      
	            break; 
	            case "Galileo-7JY2": 
	            	 if(element.equals("Galileo-7JY2"))
		    	       {        
		    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

		    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
		    	
		    	 String SA_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
	    		    
		    	 SA_TS_G_7JY2 =Integer.parseInt(SA_TS_G_7JY21);
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_G_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_G_7JY2 =Integer.parseInt(SA_TS_G_7JY21);
    	            	}
		    	     
		    	       
	            break;  
	            case "Galileo-7X7W": 
	            	  if(element.equals("Galileo-7X7W"))
		    	       {   
		    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

		    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
		    	
		    	
		    	String SA_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
    		    
		    	SA_TS_G_7X7W =Integer.parseInt(SA_TS_G_7X7W1);
		    	       }
	            	  else
    	            	{
	            			String SA_TS_G_7X7W1 =String.format("%1s",0);   		    	
			    		    
	            			SA_TS_G_7X7W =Integer.parseInt(SA_TS_G_7X7W1);
    	            	}
	            break; 
	            case "Galileo-802N": 
	            	  if(element.equals("Galileo-802N"))
		    	       {        
		    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

		    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
		    	
		    	
		    	String SA_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
    		    
		    	SA_TS_G_802N =Integer.parseInt(SA_TS_G_802N1);
		    	
		    	       }
	            	  else
    	            	{
	            		  String SA_TS_G_802N1 =String.format("%1s",0);   		    	
			    		    
	            		  SA_TS_G_802N =Integer.parseInt(SA_TS_G_802N1);
    	            	}
		    	      
		    	     
	            break;
	            case "Galileo-802R": 
	            	  if(element.equals("Galileo-802R"))
		    	       {   
		    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

		    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
		    	
		    	String SA_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
    		    
		    	SA_TS_G_802R =Integer.parseInt(SA_TS_G_802R1);
		    	       }
		    	       
	            	  else
    	            	{
	            		  String SA_TS_G_802R1 =String.format("%1s",0);   		    	
			    		    
	            		  SA_TS_G_802R =Integer.parseInt(SA_TS_G_802R1);
    	            	}
		    	       
	            break; 
	            case "Galileo-8SQ7": 
	            	if(element.equals("Galileo-8SQ7"))
		    	       {  
		    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

		    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
		    	 
		    	 String SA_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
	    		    
		    	 SA_TS_G_8SQ7 =Integer.parseInt(SA_TS_G_8SQ71);
		    	       }
	            	else
	            	{
	            		String SA_TS_G_8SQ71 =String.format("%1s",0);   		    	
		    		    
	            		SA_TS_G_8SQ7 =Integer.parseInt(SA_TS_G_8SQ71);
	            	}
		    	     
	            break;
	            case "JAZEERA": 
	            	
	            	  if(element.equals("JAZEERA"))
		    	       {  
		    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

		     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
		    	 
		    	 String SA_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
	    		    
		    	 SA_TS_JAZEERA =Integer.parseInt(SA_TS_JAZEERA1);
		    	       }
	            	  else
    	            	{
	            		  
		    		    	 String SA_TS_JAZEERA1 =String.format("%1s",0);   		    	
				    		    
		    		    	 SA_TS_JAZEERA =Integer.parseInt(SA_TS_JAZEERA1);
    	            	}
		    	      
	            break; 
	            case "KIWI": 
	            	 if(element.equals("KIWI"))
		    	       {     
		    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

		    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
		    	
		    	 
		    	 String SA_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
	    		    
		    	 SA_TS_KIWI =Integer.parseInt(SA_TS_KIWI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_KIWI1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_KIWI =Integer.parseInt(SA_TS_KIWI1);
    	            	}
	            break;
	            case "Manual": 
	            	 if(element.equals("Manual"))
		    	       {     
		    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

		    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
		    	
		    	 
		    	 String SA_TS_M_u1 =String.format("%1s",M_u.size());   		    	
	    		    
		    	 SA_TS_M_u =Integer.parseInt(SA_TS_M_u1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_M_u1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_M_u =Integer.parseInt(SA_TS_M_u1);
    	            	}
	            break;
	            case "MystiFly": 
	            	 if(element.equals("MystiFly"))
		    	       {     
		    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

		    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
		    	
		    	 
		    	 String SA_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
	    		    
		    	 SA_TS_My_Fly =Integer.parseInt(SA_TS_My_Fly1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_My_Fly1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_My_Fly =Integer.parseInt(SA_TS_My_Fly1);
    	            	}
	            break;
	            case "NESMA": 
	            	 if(element.equals("NESMA"))
		    	       {     
		    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

		    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
		    	
		    	 
		    	 String SA_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
	    		    
		    	 SA_TS_NESMA =Integer.parseInt(SA_TS_NESMA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_NESMA1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_NESMA =Integer.parseInt(SA_TS_NESMA1);
    	            	}
	            break;
	            case "PEGASUS": 
	            	 if(element.equals("PEGASUS"))
		    	       {     
		    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

		    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
		    	
		    	 
		    	 String SA_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
	    		    
		    	 SA_TS_PEGASUS =Integer.parseInt(SA_TS_PEGASUS1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_PEGASUS1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_PEGASUS =Integer.parseInt(SA_TS_PEGASUS1);
    	            	}
	            break;
	            case "SABRE-9JFH": 
	            	 if(element.equals("SABRE-9JFH"))
		    	       {     
		    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

		    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
		    	
		    	 
		    	 String SA_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
	    		    
		    	 SA_TS_S_9JFH =Integer.parseInt(SA_TS_S_9JFH1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_9JFH1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_9JFH =Integer.parseInt(SA_TS_S_9JFH1);
    	            	}
	            break;
	            case "SABRE-ID2I": 
	            	 if(element.equals("SABRE-ID2I"))
		    	       {     
		    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

		    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
		    	
		    	 
		    	 String SA_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
	    		    
		    	 SA_TS_S_ID2I =Integer.parseInt(SA_TS_S_ID2I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_ID2I1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_ID2I =Integer.parseInt(SA_TS_S_ID2I1);
    	            	}
	            break;
	            case "SABRE-L8YI": 
	            	 if(element.equals("SABRE-L8YI"))
		    	       {     
		    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

		    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
		    	
		    	 
		    	 String SA_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
	    		    
		    	 SA_TS_S_L8YI =Integer.parseInt(SA_TS_S_L8YI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_L8YI1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_L8YI =Integer.parseInt(SA_TS_S_L8YI1);
    	            	}
	            break;
	            case "SABRE-L9AI": 
	            	 if(element.equals("SABRE-L9AI"))
		    	       {     
		    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

		    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
		    	
		    	 
		    	 String SA_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
	    		    
		    	 SA_TS_S_L9AI =Integer.parseInt(SA_TS_S_L9AI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_L9AI1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_L9AI =Integer.parseInt(SA_TS_S_L9AI1);
    	            	}
	            break;
	            case "SABRE-L9CI": 
	            	 if(element.equals("SABRE-L9CI"))
		    	       {     
		    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

		    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
		    	
		    	 
		    	 String SA_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
	    		    
		    	 SA_TS_S_L9CI =Integer.parseInt(SA_TS_S_L9CI1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_L9CI1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_L9CI =Integer.parseInt(SA_TS_S_L9CI1);
    	            	}
	            break;
	            case "SABRE-T13I": 
	            	 if(element.equals("SABRE-T13I"))
		    	       {     
		    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

		    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
		    	
		    	 
		    	 String SA_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
	    		    
		    	 SA_TS_S_T13I =Integer.parseInt(SA_TS_S_T13I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_T13I1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_T13I =Integer.parseInt(SA_TS_S_T13I1);
    	            	}
	            break;
	            case "SABRE-T20I": 
	            	 if(element.equals("SABRE-T20I"))
		    	       {     
		    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

		    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
		    	
		    	 
		    	 String SA_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
	    		    
		    	 SA_TS_S_T20I =Integer.parseInt(SA_TS_S_T20I1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_T20I1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_T20I =Integer.parseInt(SA_TS_S_T20I1);
    	            	}
	            break;
	            case "SALAM": 
	            	 if(element.equals("SALAM"))
		    	       {     
		    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

		    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
		    	
		    	 
		    	 String SA_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
	    		    
		    	 SA_TS_SALAM =Integer.parseInt(SA_TS_SALAM1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_SALAM1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_SALAM =Integer.parseInt(SA_TS_SALAM1);
    	            	}
	            break;
	            case "SpiceJet": 
	            	 if(element.equals("SpiceJet"))
		    	       {     
		    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

		    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
		    	
		    	 
		    	 String SA_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
	    		    
		    	 SA_TS_S_Jet =Integer.parseInt(SA_TS_S_Jet1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_S_Jet1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_S_Jet =Integer.parseInt(SA_TS_S_Jet1);
    	            	}
	            break;
	            case "UAPI-3R1G": 
	            	 if(element.equals("UAPI-3R1G"))
		    	       {     
		    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

		    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
		    	
		    	 
		    	 String SA_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
	    		    
		    	 SA_TS_U_3R1G =Integer.parseInt(SA_TS_U_3R1G1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_3R1G1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_3R1G =Integer.parseInt(SA_TS_U_3R1G1);
    	            	}
	            break;
	            case "UAPI-570E": 
	            	 if(element.equals("UAPI-570E"))
		    	       {     
		    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

		    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
		    	
		    	 
		    	 String SA_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
	    		    
		    	 SA_TS_U_570E =Integer.parseInt(SA_TS_U_570E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_570E1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_570E =Integer.parseInt(SA_TS_U_570E1);
    	            	}
	            break;
	            case "UAPI-5N61": 
	            	 if(element.equals("UAPI-5N61"))
		    	       {     
		    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

		    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
		    	
		    	 
		    	 String SA_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
	    		    
		    	 SA_TS_U_5N61 =Integer.parseInt(SA_TS_U_5N611);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_5N611 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_5N61 =Integer.parseInt(SA_TS_U_5N611);
    	            	}
	            break;
	            case "UAPI-6E": 
	            	 if(element.equals("UAPI-6E"))
		    	       {     
		    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

		    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
		    	
		    	 
		    	 String SA_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
	    		    
		    	 SA_TS_U_6E =Integer.parseInt(SA_TS_U_6E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_6E1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_6E =Integer.parseInt(SA_TS_U_6E1);
    	            	}
	            break;
	            case "UAPI-7FK5": 
	            	 if(element.equals("UAPI-7FK5"))
		    	       {     
		    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

		    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
		    	
		    	 
		    	 String SA_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
	    		    
		    	 SA_TS_U_7FK5 =Integer.parseInt(SA_TS_U_7FK51);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_7FK51 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_7FK5 =Integer.parseInt(SA_TS_U_7FK51);
    	            	}
	            break;
	            case "UAPI-7JY2": 
	            	 if(element.equals("UAPI-7JY2"))
		    	       {     
		    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

		    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
		    	
		    	 
		    	 String SA_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
	    		    
		    	 SA_TS_U_7JY2 =Integer.parseInt(SA_TS_U_7JY21);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_7JY21 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_7JY2 =Integer.parseInt(SA_TS_U_7JY21);
    	            	}
	            break;
	            case "UAPI-802N": 
	            	 if(element.equals("UAPI-802N"))
		    	       {     
		    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

		    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
		    	
		    	 
		    	 String SA_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
	    		    
		    	 SA_TS_U_802N =Integer.parseInt(SA_TS_U_802N1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_802N1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_802N =Integer.parseInt(SA_TS_U_802N1);
    	            	}
	            break;
	            case "UAPI-802R": 
	            	 if(element.equals("UAPI-802R"))
		    	       {     
		    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

		    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
		    	
		    	 
		    	 String SA_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
	    		    
		    	 SA_TS_U_802R =Integer.parseInt(SA_TS_U_802R1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_802R1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_802R =Integer.parseInt(SA_TS_U_802R1);
    	            	}
	            break;
	            case "UAPI-8SQ7": 
	            	 if(element.equals("UAPI-8SQ7"))
		    	       {     
		    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

		    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
		    	
		    	 
		    	 String SA_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
	    		    
		    	 SA_TS_U_8SQ7 =Integer.parseInt(SA_TS_U_8SQ71);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_U_8SQ71 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_U_8SQ7 =Integer.parseInt(SA_TS_U_8SQ71);
    	            	}
	            break;
	            case "WATANIYA": 
	            	 if(element.equals("WATANIYA"))
		    	       {     
		    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

		    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
		    	
		    	 
		    	 String SA_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
	    		    
		    	 SA_TS_WATANIYA =Integer.parseInt(SA_TS_WATANIYA1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_WATANIYA1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_WATANIYA =Integer.parseInt(SA_TS_WATANIYA1);
    	            	}
	            break;
	            case "Air Arabia": 
	            	 if(element.equals("Air Arabia"))
		    	       {     
		    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

		    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
		    	
		    	 
		    	 String SA_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
	    		    
		    	 SA_TS_A_AR =Integer.parseInt(SA_TS_A_AR1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_A_AR1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_A_AR =Integer.parseInt(SA_TS_A_AR1);
    	            	}
	            break;
	            case "Air Arabia Egypt": 
	            	 if(element.equals("Air Arabia Egypt"))
		    	       {     
		    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

		    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
		    	
		    	 
		    	 String SA_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
	    		    
		    	 SA_TS_A_AR_E =Integer.parseInt(SA_TS_A_AR_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_A_AR_E1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_A_AR_E =Integer.parseInt(SA_TS_A_AR_E1);
    	            	}
	            break;
	            case "Air Arabia Moroc": 
	            	 if(element.equals("Air Arabia Moroc"))
		    	       {     
		    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

		    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
		    	
		    	 
		    	 String SA_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
	    		    
		    	 SA_TS_A_AR_M =Integer.parseInt(SA_TS_A_AR_M1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_A_AR_M1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_A_AR_M =Integer.parseInt(SA_TS_A_AR_M1);
    	            	}
	            break;
	            case "AirIndiaExpress": 
	            	 if(element.equals("AirIndiaExpress"))
		    	       {     
		    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

		    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
		    	
		    	 
		    	 String SA_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
	    		    
		    	 SA_TS_A_I_E =Integer.parseInt(SA_TS_A_I_E1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_A_I_E1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_A_I_E =Integer.parseInt(SA_TS_A_I_E1);
    	            	}
	            break;
	            case "FlyDubai": 
	            	 if(element.equals("FlyDubai"))
		    	       {     
		    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

		    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
		    	
		    	 
		    	 String SA_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
	    		    
		    	 SA_TS_FlyDubai =Integer.parseInt(SA_TS_FlyDubai1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_FlyDubai1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_FlyDubai =Integer.parseInt(SA_TS_FlyDubai1);
    	            	}
	            break;
	            case "Flynas": 
	            	 if(element.equals("Flynas"))
		    	       {     
		    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

		    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
		    	
		    	 
		    	 String SA_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
	    		    
		    	 SA_TS_Flynas =Integer.parseInt(SA_TS_Flynas1);
		    	 
		    	
		    	       }
	            	 else
    	            	{
	            		 String SA_TS_Flynas1 =String.format("%1s",0);   		    	
			    		    
	            		 SA_TS_Flynas =Integer.parseInt(SA_TS_Flynas1);
    	            	}
	            break;
	            
	            
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  
        
        int TotalValue = SA_TS_G_3R1+SA_TS_G_570E+SA_TS_G_5N61+SA_TS_G_7FK5+SA_TS_G_7JY2+SA_TS_G_7X7W+SA_TS_G_802N+SA_TS_G_802R
        		+SA_TS_G_8SQ7+SA_TS_JAZEERA+SA_TS_KIWI+SA_TS_M_u+SA_TS_My_Fly+SA_TS_NESMA+SA_TS_PEGASUS+SA_TS_S_9JFH+SA_TS_S_ID2I
        		+SA_TS_S_L8YI+SA_TS_S_L9AI+SA_TS_S_L9CI+SA_TS_S_T13I+SA_TS_S_T20I+SA_TS_SALAM+SA_TS_S_Jet+SA_TS_U_3R1G+SA_TS_U_570E
        		+SA_TS_U_5N61+SA_TS_U_6E+SA_TS_U_7FK5+SA_TS_U_7JY2+SA_TS_U_802N+SA_TS_U_802R+SA_TS_U_8SQ7+SA_TS_WATANIYA+SA_TS_A_AR
        		+SA_TS_A_AR_E+SA_TS_A_AR_M+SA_TS_A_I_E+SA_TS_FlyDubai+SA_TS_Flynas;
		  
        SA_TS_Supplier_Transaction_Total = TotalValue; 
		 System.out.println("Supplier Trancation Successfull total:::----"+SA_TS_Supplier_Transaction_Total);
		
		
    
   
		//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
	}
	      
}

public static void Suppliers_EG(int iTestCaseRow,WebDriver driver) throws Exception
{
	//*******************Supplier  Transaction Successfull*********************************************
		Select Supplier_transaction1=new Select(Loginpage.BookingSatus());
		Supplier_transaction1.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
		
		long timeoutInSeconds = 85;
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
		String com_S_Trancount=Loginpage.FlightResults_text().getText();
		System.out.println(com_S_Trancount);
		
		
		String com_s_transtr = com_S_Trancount.trim();
		String[] com_s_transplited = com_s_transtr.split("\\:");
		System.out.println("No of Results Count"+com_s_transplited[1]);
		Thread.sleep(1000);
		String tran1="Transaction Successful";
		
		if("Flight Search Results : 0".equals(com_S_Trancount))
		{
			
			System.out.println("Supplier TrancationSuccess total:::----0");
			
			EG_TS_G_3R1=0;
			EG_TS_G_570E=0;
			EG_TS_G_5N61=0;
			EG_TS_G_7FK5=0;
			EG_TS_G_7JY2=0;
			EG_TS_G_7X7W=0;
			EG_TS_G_802N=0;
			EG_TS_G_802R=0;
			EG_TS_G_8SQ7=0;
			EG_TS_JAZEERA=0;
			EG_TS_KIWI=0;
			EG_TS_M_u=0;
			EG_TS_My_Fly=0;
			EG_TS_NESMA=0;
			EG_TS_PEGASUS=0;
			EG_TS_S_9JFH=0;
			EG_TS_S_ID2I=0;
			EG_TS_S_L8YI=0;
			EG_TS_S_L9AI=0;
			EG_TS_S_L9CI=0;
			EG_TS_S_T13I=0;
			EG_TS_S_T20I=0;
			EG_TS_SALAM=0;
			EG_TS_S_Jet=0;
			EG_TS_U_3R1G=0;
			EG_TS_U_570E=0;
			EG_TS_U_5N61=0;
			EG_TS_U_6E=0;
			EG_TS_U_7FK5=0;
			EG_TS_U_7JY2=0;
			EG_TS_U_802N=0;
			EG_TS_U_802R=0;
			EG_TS_U_8SQ7=0;
			EG_TS_WATANIYA=0;
			EG_TS_A_AR=0;
			EG_TS_A_AR_E=0;
			EG_TS_A_AR_M=0;
			EG_TS_A_I_E=0;
			EG_TS_FlyDubai=0;
			EG_TS_Flynas=0;
		         
			
			
	         int TotalValue =0;
	 		        EG_TS_Supplier_Transaction_Total = TotalValue; 
	 				 System.out.println("Supplier Trancation Successfull total:::----"+EG_TS_Supplier_Transaction_Total);
	 				
	 				
	 	        
	        
	      
		}
		else
		{
		
			List<WebElement> TS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]"));
			 
			  System.out.println("Total Number of Supplier:" + TS.size());
			
			ArrayList<String>list=new ArrayList<>();
			
			 for (WebElement element1 : TS)
			  {
				 list.add(element1.getText());
			  }
			  ArrayList<String> unique = removeDuplicates(list);
			  System.out.println("unique:"+unique.size());
		        for (String element : unique) {
		            System.out.println("element:"+element);
		            
		             
		            
		            
		            String number=element;
		           for(int j=0;j<unique.size();j++)
		           {	
		            switch(number){  
		            case "Galileo-3R1G": 
		            	if(element.equals("Galileo-3R1G")) 
			    	       {
			    	        
			    	List<WebElement> G_3R1=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-3R1G ']"));

			    	System.out.println("No of G_3R1 Trancation Successfull:" + G_3R1.size());
			    	String EG_TS_G_3R11 =String.format("%1s",G_3R1.size());
			    	
			    	
			    	 EG_TS_G_3R1 =Integer.parseInt(EG_TS_G_3R11);
			    	
			    	       }
		            	else
		            	{
		            		String EG_TS_G_3R11 =String.format("%1s",0);
		    		    	
		    		    	
		            		EG_TS_G_3R1 =Integer.parseInt(EG_TS_G_3R11);
		            	}
			    	      
		            break; 
		            
		            case "Galileo-570E": 
		            	   
			    	       if(element.equals("Galileo-570E"))
			    	       {
			    	  List<WebElement> G_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-570E ']"));

			    	  System.out.println("No of Galileo-570E Trancation Successfull:" + G_570E.size());
			    	  String EG_TS_G_570E1 =String.format("%1s",G_570E.size());
			    	  
	    		    	
	    		    	
			    	  EG_TS_G_570E =Integer.parseInt(EG_TS_G_570E1);
			    	       }
			    	       else
	    	            	{
			    	    	   String EG_TS_G_570E1 =String.format("%1s",0);
			    		    	  
			    		    	
			    		    	
			    	    	   EG_TS_G_570E =Integer.parseInt(EG_TS_G_570E1);
	    	            	}
			    	      
		            break;  
		            case "Galileo-5N61": 
		            	 if(element.equals("Galileo-5N61"))
			    	       {   
			    	       
			    	List<WebElement> G_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-5N61 ']"));

			    	System.out.println("No of Galileo-5N61 Trancation Successfull:" + G_5N61.size());
			    	
			    	
			    	 String EG_TS_G_5N611 =String.format("%1s",G_5N61.size());   		    	
	    		    
			    	 EG_TS_G_5N61 =Integer.parseInt(EG_TS_G_5N611);
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_G_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_G_5N61 =Integer.parseInt(EG_TS_G_5N611);
	    	            	}
		            break; 
		            case "Galileo-7FK5": 
		            	 if(element.equals("Galileo-7FK5"))
			    	       {   
			    	List<WebElement> G_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7FK5 ']"));

			    	System.out.println("No of Galileo-7FK5 Trancation Successfull:" + G_7FK5.size());
			    	 
			    	 String EG_TS_G_7FK51 =String.format("%1s",G_7FK5.size());   		    	
		    		    
			    	 EG_TS_G_7FK5 =Integer.parseInt(EG_TS_G_7FK51);
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_G_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_G_7FK5 =Integer.parseInt(EG_TS_G_7FK51);
	    	            	}
			    	      
		            break; 
		            case "Galileo-7JY2": 
		            	 if(element.equals("Galileo-7JY2"))
			    	       {        
			    	List<WebElement> G_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7JY2 ']"));

			    	System.out.println("No of Galileo-7JY2 Trancation Successfull:" + G_7JY2.size());
			    	
			    	 String EG_TS_G_7JY21 =String.format("%1s",G_7JY2.size());   		    	
		    		    
			    	 EG_TS_G_7JY2 =Integer.parseInt(EG_TS_G_7JY21);
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_G_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_G_7JY2 =Integer.parseInt(EG_TS_G_7JY21);
	    	            	}
			    	     
			    	       
		            break;  
		            case "Galileo-7X7W": 
		            	  if(element.equals("Galileo-7X7W"))
			    	       {   
			    	List<WebElement> G_7X7W=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-7X7W ']"));

			    	System.out.println("No of Galileo-7X7W Trancation Successfull:" + G_7X7W.size());
			    	
			    	
			    	String EG_TS_G_7X7W1 =String.format("%1s",G_7X7W.size());   		    	
	    		    
			    	EG_TS_G_7X7W =Integer.parseInt(EG_TS_G_7X7W1);
			    	       }
		            	  else
	    	            	{
		            			String EG_TS_G_7X7W1 =String.format("%1s",0);   		    	
				    		    
		            			EG_TS_G_7X7W =Integer.parseInt(EG_TS_G_7X7W1);
	    	            	}
		            break; 
		            case "Galileo-802N": 
		            	  if(element.equals("Galileo-802N"))
			    	       {        
			    	List<WebElement> G_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802N ']"));

			    	System.out.println("No of Galileo-802N Trancation Successfull:" + G_802N.size());
			    	
			    	
			    	String EG_TS_G_802N1 =String.format("%1s",G_802N.size());   		    	
	    		    
			    	EG_TS_G_802N =Integer.parseInt(EG_TS_G_802N1);
			    	
			    	       }
		            	  else
	    	            	{
		            		  String EG_TS_G_802N1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_TS_G_802N =Integer.parseInt(EG_TS_G_802N1);
	    	            	}
			    	      
			    	     
		            break;
		            case "Galileo-802R": 
		            	  if(element.equals("Galileo-802R"))
			    	       {   
			    	List<WebElement> G_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-802R ']"));

			    	System.out.println("No of Galileo-802R Trancation Successfull:" + G_802R.size());
			    	
			    	String EG_TS_G_802R1 =String.format("%1s",G_802R.size());   		    	
	    		    
			    	EG_TS_G_802R =Integer.parseInt(EG_TS_G_802R1);
			    	       }
			    	       
		            	  else
	    	            	{
		            		  String EG_TS_G_802R1 =String.format("%1s",0);   		    	
				    		    
		            		  EG_TS_G_802R =Integer.parseInt(EG_TS_G_802R1);
	    	            	}
			    	       
		            break; 
		            case "Galileo-8SQ7": 
		            	if(element.equals("Galileo-8SQ7"))
			    	       {  
			    	List<WebElement> G_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Galileo-8SQ7 ']"));

			    	System.out.println("No of Galileo-8SQ7 Trancation Successfull:" + G_8SQ7.size());
			    	 
			    	 String EG_TS_G_8SQ71 =String.format("%1s",G_8SQ7.size());   		    	
		    		    
			    	 EG_TS_G_8SQ7 =Integer.parseInt(EG_TS_G_8SQ71);
			    	       }
		            	else
		            	{
		            		String EG_TS_G_8SQ71 =String.format("%1s",0);   		    	
			    		    
		            		EG_TS_G_8SQ7 =Integer.parseInt(EG_TS_G_8SQ71);
		            	}
			    	     
		            break;
		            case "JAZEERA": 
		            	
		            	  if(element.equals("JAZEERA"))
			    	       {  
			    	List<WebElement> JAZEERA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' JAZEERA ']"));

			     	System.out.println("No of JAZEERA Trancation Successfull:" + JAZEERA.size());
			    	 
			    	 String EG_TS_JAZEERA1 =String.format("%1s",JAZEERA.size());   		    	
		    		    
			    	 EG_TS_JAZEERA =Integer.parseInt(EG_TS_JAZEERA1);
			    	       }
		            	  else
	    	            	{
		            		  
			    		    	 String EG_TS_JAZEERA1 =String.format("%1s",0);   		    	
					    		    
			    		    	 EG_TS_JAZEERA =Integer.parseInt(EG_TS_JAZEERA1);
	    	            	}
			    	      
		            break; 
		            case "KIWI": 
		            	 if(element.equals("KIWI"))
			    	       {     
			    	List<WebElement> KIWI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' KIWI ']"));

			    	System.out.println("No of KIWI Trancation Successfull:" + KIWI.size());
			    	
			    	 
			    	 String EG_TS_KIWI1 =String.format("%1s",KIWI.size());   		    	
		    		    
			    	 EG_TS_KIWI =Integer.parseInt(EG_TS_KIWI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_KIWI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_KIWI =Integer.parseInt(EG_TS_KIWI1);
	    	            	}
		            break;
		            case "Manual": 
		            	 if(element.equals("Manual"))
			    	       {     
			    	List<WebElement> M_u=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Manual ']"));

			    	System.out.println("No of Manual Trancation Successfull:" + M_u.size());
			    	
			    	 
			    	 String EG_TS_M_u1 =String.format("%1s",M_u.size());   		    	
		    		    
			    	 EG_TS_M_u =Integer.parseInt(EG_TS_M_u1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_M_u1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_M_u =Integer.parseInt(EG_TS_M_u1);
	    	            	}
		            break;
		            case "MystiFly": 
		            	 if(element.equals("MystiFly"))
			    	       {     
			    	List<WebElement> My_Fly=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' MystiFly ']"));

			    	System.out.println("No of MystiFly Trancation Successfull:" + My_Fly.size());
			    	
			    	 
			    	 String EG_TS_My_Fly1 =String.format("%1s",My_Fly.size());   		    	
		    		    
			    	 EG_TS_My_Fly =Integer.parseInt(EG_TS_My_Fly1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_My_Fly1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_My_Fly =Integer.parseInt(EG_TS_My_Fly1);
	    	            	}
		            break;
		            case "NESMA": 
		            	 if(element.equals("NESMA"))
			    	       {     
			    	List<WebElement> NESMA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' NESMA ']"));

			    	System.out.println("No of NESMA Trancation Successfull:" + NESMA.size());
			    	
			    	 
			    	 String EG_TS_NESMA1 =String.format("%1s",NESMA.size());   		    	
		    		    
			    	 EG_TS_NESMA =Integer.parseInt(EG_TS_NESMA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_NESMA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_NESMA =Integer.parseInt(EG_TS_NESMA1);
	    	            	}
		            break;
		            case "PEGASUS": 
		            	 if(element.equals("PEGASUS"))
			    	       {     
			    	List<WebElement> PEGASUS=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' PEGASUS ']"));

			    	System.out.println("No of PEGASUS Trancation Successfull:" + PEGASUS.size());
			    	
			    	 
			    	 String EG_TS_PEGASUS1 =String.format("%1s",PEGASUS.size());   		    	
		    		    
			    	 EG_TS_PEGASUS =Integer.parseInt(EG_TS_PEGASUS1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_PEGASUS1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_PEGASUS =Integer.parseInt(EG_TS_PEGASUS1);
	    	            	}
		            break;
		            case "SABRE-9JFH": 
		            	 if(element.equals("SABRE-9JFH"))
			    	       {     
			    	List<WebElement> S_9JFH=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-9JFH ']"));

			    	System.out.println("No of SABRE-9JFH Trancation Successfull:" + S_9JFH.size());
			    	
			    	 
			    	 String EG_TS_S_9JFH1 =String.format("%1s",S_9JFH.size());   		    	
		    		    
			    	 EG_TS_S_9JFH =Integer.parseInt(EG_TS_S_9JFH1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_9JFH1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_9JFH =Integer.parseInt(EG_TS_S_9JFH1);
	    	            	}
		            break;
		            case "SABRE-ID2I": 
		            	 if(element.equals("SABRE-ID2I"))
			    	       {     
			    	List<WebElement> S_ID2I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-ID2I ']"));

			    	System.out.println("No of SABRE-ID2I Trancation Successfull:" + S_ID2I.size());
			    	
			    	 
			    	 String EG_TS_S_ID2I1 =String.format("%1s",S_ID2I.size());   		    	
		    		    
			    	 EG_TS_S_ID2I =Integer.parseInt(EG_TS_S_ID2I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_ID2I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_ID2I =Integer.parseInt(EG_TS_S_ID2I1);
	    	            	}
		            break;
		            case "SABRE-L8YI": 
		            	 if(element.equals("SABRE-L8YI"))
			    	       {     
			    	List<WebElement> S_L8YI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L8YI ']"));

			    	System.out.println("No of SABRE-L8YI Trancation Successfull:" + S_L8YI.size());
			    	
			    	 
			    	 String EG_TS_S_L8YI1 =String.format("%1s",S_L8YI.size());   		    	
		    		    
			    	 EG_TS_S_L8YI =Integer.parseInt(EG_TS_S_L8YI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_L8YI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_L8YI =Integer.parseInt(EG_TS_S_L8YI1);
	    	            	}
		            break;
		            case "SABRE-L9AI": 
		            	 if(element.equals("SABRE-L9AI"))
			    	       {     
			    	List<WebElement> S_L9AI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9AI ']"));

			    	System.out.println("No of SABRE-L9AI Trancation Successfull:" + S_L9AI.size());
			    	
			    	 
			    	 String EG_TS_S_L9AI1 =String.format("%1s",S_L9AI.size());   		    	
		    		    
			    	 EG_TS_S_L9AI =Integer.parseInt(EG_TS_S_L9AI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_L9AI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_L9AI =Integer.parseInt(EG_TS_S_L9AI1);
	    	            	}
		            break;
		            case "SABRE-L9CI": 
		            	 if(element.equals("SABRE-L9CI"))
			    	       {     
			    	List<WebElement> S_L9CI=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-L9CI ']"));

			    	System.out.println("No of SABRE-L9CI Trancation Successfull:" + S_L9CI.size());
			    	
			    	 
			    	 String EG_TS_S_L9CI1 =String.format("%1s",S_L9CI.size());   		    	
		    		    
			    	 EG_TS_S_L9CI =Integer.parseInt(EG_TS_S_L9CI1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_L9CI1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_L9CI =Integer.parseInt(EG_TS_S_L9CI1);
	    	            	}
		            break;
		            case "SABRE-T13I": 
		            	 if(element.equals("SABRE-T13I"))
			    	       {     
			    	List<WebElement> S_T13I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T13I ']"));

			    	System.out.println("No of SABRE-T13I Trancation Successfull:" + S_T13I.size());
			    	
			    	 
			    	 String EG_TS_S_T13I1 =String.format("%1s",S_T13I.size());   		    	
		    		    
			    	 EG_TS_S_T13I =Integer.parseInt(EG_TS_S_T13I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_T13I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_T13I =Integer.parseInt(EG_TS_S_T13I1);
	    	            	}
		            break;
		            case "SABRE-T20I": 
		            	 if(element.equals("SABRE-T20I"))
			    	       {     
			    	List<WebElement> S_T20I=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SABRE-T20I ']"));

			    	System.out.println("No of SABRE-T20I Trancation Successfull:" + S_T20I.size());
			    	
			    	 
			    	 String EG_TS_S_T20I1 =String.format("%1s",S_T20I.size());   		    	
		    		    
			    	 EG_TS_S_T20I =Integer.parseInt(EG_TS_S_T20I1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_T20I1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_T20I =Integer.parseInt(EG_TS_S_T20I1);
	    	            	}
		            break;
		            case "SALAM": 
		            	 if(element.equals("SALAM"))
			    	       {     
			    	List<WebElement> SALAM=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SALAM ']"));

			    	System.out.println("No of SALAM Trancation Successfull:" + SALAM.size());
			    	
			    	 
			    	 String EG_TS_SALAM1 =String.format("%1s",SALAM.size());   		    	
		    		    
			    	 EG_TS_SALAM =Integer.parseInt(EG_TS_SALAM1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_SALAM1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_SALAM =Integer.parseInt(EG_TS_SALAM1);
	    	            	}
		            break;
		            case "SpiceJet": 
		            	 if(element.equals("SpiceJet"))
			    	       {     
			    	List<WebElement> S_Jet=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' SpiceJet ']"));

			    	System.out.println("No of SpiceJet Trancation Successfull:" + S_Jet.size());
			    	
			    	 
			    	 String EG_TS_S_Jet1 =String.format("%1s",S_Jet.size());   		    	
		    		    
			    	 EG_TS_S_Jet =Integer.parseInt(EG_TS_S_Jet1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_S_Jet1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_S_Jet =Integer.parseInt(EG_TS_S_Jet1);
	    	            	}
		            break;
		            case "UAPI-3R1G": 
		            	 if(element.equals("UAPI-3R1G"))
			    	       {     
			    	List<WebElement> U_3R1G=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-3R1G ']"));

			    	System.out.println("No of UAPI-3R1G Trancation Successfull:" + U_3R1G.size());
			    	
			    	 
			    	 String EG_TS_U_3R1G1 =String.format("%1s",U_3R1G.size());   		    	
		    		    
			    	 EG_TS_U_3R1G =Integer.parseInt(EG_TS_U_3R1G1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_3R1G1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_3R1G =Integer.parseInt(EG_TS_U_3R1G1);
	    	            	}
		            break;
		            case "UAPI-570E": 
		            	 if(element.equals("UAPI-570E"))
			    	       {     
			    	List<WebElement> U_570E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-570E ']"));

			    	System.out.println("No of UAPI-570E Trancation Successfull:" + U_570E.size());
			    	
			    	 
			    	 String EG_TS_U_570E1 =String.format("%1s",U_570E.size());   		    	
		    		    
			    	 EG_TS_U_570E =Integer.parseInt(EG_TS_U_570E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_570E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_570E =Integer.parseInt(EG_TS_U_570E1);
	    	            	}
		            break;
		            case "UAPI-5N61": 
		            	 if(element.equals("UAPI-5N61"))
			    	       {     
			    	List<WebElement> U_5N61=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-5N61 ']"));

			    	System.out.println("No of UAPI-5N61 Trancation Successfull:" + U_5N61.size());
			    	
			    	 
			    	 String EG_TS_U_5N611 =String.format("%1s",U_5N61.size());   		    	
		    		    
			    	 EG_TS_U_5N61 =Integer.parseInt(EG_TS_U_5N611);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_5N611 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_5N61 =Integer.parseInt(EG_TS_U_5N611);
	    	            	}
		            break;
		            case "UAPI-6E": 
		            	 if(element.equals("UAPI-6E"))
			    	       {     
			    	List<WebElement> U_6E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-6E ']"));

			    	System.out.println("No of UAPI-6E Trancation Successfull:" + U_6E.size());
			    	
			    	 
			    	 String EG_TS_U_6E1 =String.format("%1s",U_6E.size());   		    	
		    		    
			    	 EG_TS_U_6E =Integer.parseInt(EG_TS_U_6E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_6E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_6E =Integer.parseInt(EG_TS_U_6E1);
	    	            	}
		            break;
		            case "UAPI-7FK5": 
		            	 if(element.equals("UAPI-7FK5"))
			    	       {     
			    	List<WebElement> U_7FK5=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7FK5 ']"));

			    	System.out.println("No of UAPI-7FK5 Trancation Successfull:" + U_7FK5.size());
			    	
			    	 
			    	 String EG_TS_U_7FK51 =String.format("%1s",U_7FK5.size());   		    	
		    		    
			    	 EG_TS_U_7FK5 =Integer.parseInt(EG_TS_U_7FK51);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_7FK51 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_7FK5 =Integer.parseInt(EG_TS_U_7FK51);
	    	            	}
		            break;
		            case "UAPI-7JY2": 
		            	 if(element.equals("UAPI-7JY2"))
			    	       {     
			    	List<WebElement> U_7JY2=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-7JY2 ']"));

			    	System.out.println("No of UAPI-7JY2 Trancation Successfull:" + U_7JY2.size());
			    	
			    	 
			    	 String EG_TS_U_7JY21 =String.format("%1s",U_7JY2.size());   		    	
		    		    
			    	 EG_TS_U_7JY2 =Integer.parseInt(EG_TS_U_7JY21);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_7JY21 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_7JY2 =Integer.parseInt(EG_TS_U_7JY21);
	    	            	}
		            break;
		            case "UAPI-802N": 
		            	 if(element.equals("UAPI-802N"))
			    	       {     
			    	List<WebElement> U_802N=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802N ']"));

			    	System.out.println("No of UAPI-802N Trancation Successfull:" + U_802N.size());
			    	
			    	 
			    	 String EG_TS_U_802N1 =String.format("%1s",U_802N.size());   		    	
		    		    
			    	 EG_TS_U_802N =Integer.parseInt(EG_TS_U_802N1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_802N1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_802N =Integer.parseInt(EG_TS_U_802N1);
	    	            	}
		            break;
		            case "UAPI-802R": 
		            	 if(element.equals("UAPI-802R"))
			    	       {     
			    	List<WebElement> U_802R=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-802R ']"));

			    	System.out.println("No of UAPI-802R Trancation Successfull:" + U_802R.size());
			    	
			    	 
			    	 String EG_TS_U_802R1 =String.format("%1s",U_802R.size());   		    	
		    		    
			    	 EG_TS_U_802R =Integer.parseInt(EG_TS_U_802R1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_802R1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_802R =Integer.parseInt(EG_TS_U_802R1);
	    	            	}
		            break;
		            case "UAPI-8SQ7": 
		            	 if(element.equals("UAPI-8SQ7"))
			    	       {     
			    	List<WebElement> U_8SQ7=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' UAPI-8SQ7 ']"));

			    	System.out.println("No of UAPI-8SQ7 Trancation Successfull:" + U_8SQ7.size());
			    	
			    	 
			    	 String EG_TS_U_8SQ71 =String.format("%1s",U_8SQ7.size());   		    	
		    		    
			    	 EG_TS_U_8SQ7 =Integer.parseInt(EG_TS_U_8SQ71);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_U_8SQ71 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_U_8SQ7 =Integer.parseInt(EG_TS_U_8SQ71);
	    	            	}
		            break;
		            case "WATANIYA": 
		            	 if(element.equals("WATANIYA"))
			    	       {     
			    	List<WebElement> WATANIYA=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' WATANIYA ']"));

			    	System.out.println("No of WATANIYA Trancation Successfull:" + WATANIYA.size());
			    	
			    	 
			    	 String EG_TS_WATANIYA1 =String.format("%1s",WATANIYA.size());   		    	
		    		    
			    	 EG_TS_WATANIYA =Integer.parseInt(EG_TS_WATANIYA1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_WATANIYA1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_WATANIYA =Integer.parseInt(EG_TS_WATANIYA1);
	    	            	}
		            break;
		            case "Air Arabia": 
		            	 if(element.equals("Air Arabia"))
			    	       {     
			    	List<WebElement> A_AR=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia ']"));

			    	System.out.println("No of Air Arabia Trancation Successfull:" + A_AR.size());
			    	
			    	 
			    	 String EG_TS_A_AR1 =String.format("%1s",A_AR.size());   		    	
		    		    
			    	 EG_TS_A_AR =Integer.parseInt(EG_TS_A_AR1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_A_AR1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_A_AR =Integer.parseInt(EG_TS_A_AR1);
	    	            	}
		            break;
		            case "Air Arabia Egypt": 
		            	 if(element.equals("Air Arabia Egypt"))
			    	       {     
			    	List<WebElement> A_AR_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Egypt ']"));

			    	System.out.println("No of Air Arabia Egypt Trancation Successfull:" + A_AR_E.size());
			    	
			    	 
			    	 String EG_TS_A_AR_E1 =String.format("%1s",A_AR_E.size());   		    	
		    		    
			    	 EG_TS_A_AR_E =Integer.parseInt(EG_TS_A_AR_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_A_AR_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_A_AR_E =Integer.parseInt(EG_TS_A_AR_E1);
	    	            	}
		            break;
		            case "Air Arabia Moroc": 
		            	 if(element.equals("Air Arabia Moroc"))
			    	       {     
			    	List<WebElement> A_AR_M=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Air Arabia Moroc ']"));

			    	System.out.println("No of Air Arabia Moroc Trancation Successfull:" + A_AR_M.size());
			    	
			    	 
			    	 String EG_TS_A_AR_M1 =String.format("%1s",A_AR_M.size());   		    	
		    		    
			    	 EG_TS_A_AR_M =Integer.parseInt(EG_TS_A_AR_M1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_A_AR_M1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_A_AR_M =Integer.parseInt(EG_TS_A_AR_M1);
	    	            	}
		            break;
		            case "AirIndiaExpress": 
		            	 if(element.equals("AirIndiaExpress"))
			    	       {     
			    	List<WebElement> A_I_E=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' AirIndiaExpress ']"));

			    	System.out.println("No of AirIndiaExpress Trancation Successfull:" + A_I_E.size());
			    	
			    	 
			    	 String EG_TS_A_I_E1 =String.format("%1s",A_I_E.size());   		    	
		    		    
			    	 EG_TS_A_I_E =Integer.parseInt(EG_TS_A_I_E1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_A_I_E1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_A_I_E =Integer.parseInt(EG_TS_A_I_E1);
	    	            	}
		            break;
		            case "FlyDubai": 
		            	 if(element.equals("FlyDubai"))
			    	       {     
			    	List<WebElement> FlyDubai=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' FlyDubai ']"));

			    	System.out.println("No of FlyDubai Trancation Successfull:" + FlyDubai.size());
			    	
			    	 
			    	 String EG_TS_FlyDubai1 =String.format("%1s",FlyDubai.size());   		    	
		    		    
			    	 EG_TS_FlyDubai =Integer.parseInt(EG_TS_FlyDubai1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_FlyDubai1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_FlyDubai =Integer.parseInt(EG_TS_FlyDubai1);
	    	            	}
		            break;
		            case "Flynas": 
		            	 if(element.equals("Flynas"))
			    	       {     
			    	List<WebElement> Flynas=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[7]/span[text()=' Flynas ']"));

			    	System.out.println("No of Flynas Trancation Successfull:" + Flynas.size());
			    	
			    	 
			    	 String EG_TS_Flynas1 =String.format("%1s",Flynas.size());   		    	
		    		    
			    	 EG_TS_Flynas =Integer.parseInt(EG_TS_Flynas1);
			    	 
			    	
			    	       }
		            	 else
	    	            	{
		            		 String EG_TS_Flynas1 =String.format("%1s",0);   		    	
				    		    
		            		 EG_TS_Flynas =Integer.parseInt(EG_TS_Flynas1);
	    	            	}
		            break;
		            
		            
		            default:System.out.println("Not in 10, 20 or 30");  
		         
		            }
		           }
		        }
		  
	        
	        int TotalValue = EG_TS_G_3R1+EG_TS_G_570E+EG_TS_G_5N61+EG_TS_G_7FK5+EG_TS_G_7JY2+EG_TS_G_7X7W+EG_TS_G_802N+EG_TS_G_802R
	        		+EG_TS_G_8SQ7+EG_TS_JAZEERA+EG_TS_KIWI+EG_TS_M_u+EG_TS_My_Fly+EG_TS_NESMA+EG_TS_PEGASUS+EG_TS_S_9JFH+EG_TS_S_ID2I
	        		+EG_TS_S_L8YI+EG_TS_S_L9AI+EG_TS_S_L9CI+EG_TS_S_T13I+EG_TS_S_T20I+EG_TS_SALAM+EG_TS_S_Jet+EG_TS_U_3R1G+EG_TS_U_570E
	        		+EG_TS_U_5N61+EG_TS_U_6E+EG_TS_U_7FK5+EG_TS_U_7JY2+EG_TS_U_802N+EG_TS_U_802R+EG_TS_U_8SQ7+EG_TS_WATANIYA+EG_TS_A_AR
	        		+EG_TS_A_AR_E+EG_TS_A_AR_M+EG_TS_A_I_E+EG_TS_FlyDubai+EG_TS_Flynas;
			  
	        EG_TS_Supplier_Transaction_Total = TotalValue; 
			 System.out.println("Supplier Trancation Successfull total:::----"+EG_TS_Supplier_Transaction_Total);
			
			
	    
	   
			//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
		}
		      
}
*/
public static void Supplier_Validate_TS()
{
	 ArrayList<String>values=new ArrayList<>();
	 values.addAll(Suppliers_TS_AE);
	 values.addAll(Suppliers_TS_COM);
	 values.addAll(Suppliers_TS_SA);
	 values.addAll(Suppliers_TS_EG);
	 
	 System.out.println("Total values of Suppliers:"+values);
	ArrayList<String> uniqueSupplier = removeDuplicates(values);
	System.out.println("After Remove TS Suppliers Names:"+uniqueSupplier);
	System.out.println("Suppliers value of range:"+uniqueSupplier.size());
	String GetValue=Integer.toString(uniqueSupplier.size());
	if(GetValue.equals("0"))
	{
		int add=uniqueSupplier.size();
		 TS_UNQ_VALUE=add;
		 System.out.println("TS_UNQ_VALUE:"+TS_UNQ_VALUE);
	}
	if(!GetValue.equals("0"))
	{
		int add=uniqueSupplier.size()+2;
		 TS_UNQ_VALUE=add;
		 System.out.println("TS_UNQ_VALUE:"+TS_UNQ_VALUE);
	}
}
public static void Supplier_Validate_CP()
{
	 ArrayList<String>values=new ArrayList<>();
	 values.addAll(Suppliers_CP_AE);
	 values.addAll(Suppliers_CP_COM);
	 values.addAll(Suppliers_CP_SA);
	 values.addAll(Suppliers_CP_EG);
	 
	 System.out.println("Total values of Suppliers:"+values);
	ArrayList<String> uniqueSupplier = removeDuplicates(values);
	System.out.println("After Remove CP Suppliers Names:"+uniqueSupplier);
	System.out.println("Suppliers value of range:"+uniqueSupplier.size());
	String GetValue=Integer.toString(uniqueSupplier.size());
	if(GetValue.equals("0"))
	{
		int add=uniqueSupplier.size();
		 CP_UNQ_VALUE=add;
		 System.out.println("CP_UNQ_VALUE:"+CP_UNQ_VALUE);
	}
	if(!GetValue.equals("0"))
	{
		int add=uniqueSupplier.size()+2;
		 CP_UNQ_VALUE=add;
		 System.out.println("CP_UNQ_VALUE:"+CP_UNQ_VALUE);
	}
	
}
public static void Supplier_Validate_RP()
{
	 ArrayList<String>values=new ArrayList<>();
	 values.addAll(Suppliers_RP_AE);
	 values.addAll(Suppliers_RP_COM);
	 values.addAll(Suppliers_RP_SA);
	 values.addAll(Suppliers_RP_EG);
	 
	 System.out.println("Total values of Suppliers:"+values);
	ArrayList<String> uniqueSupplier = removeDuplicates(values);
	System.out.println("After Remove RP Suppliers Names:"+uniqueSupplier);
	System.out.println("Suppliers value of range:"+uniqueSupplier.size());
	String GetValue=Integer.toString(uniqueSupplier.size());
	if(GetValue.equals("0"))
	{
		int add=uniqueSupplier.size();
		 RP_UNQ_VALUE=add;
		 System.out.println("RP_UNQ_VALUE:"+RP_UNQ_VALUE);
	}
	if(!GetValue.equals("0"))
	{
		int add=uniqueSupplier.size()+2;
		 RP_UNQ_VALUE=add;
		 System.out.println("RP_UNQ_VALUE:"+RP_UNQ_VALUE);
	}
}
public static void Supplier_Validate_SD()
{
	 ArrayList<String>values=new ArrayList<>();
	 values.addAll(Suppliers_SD_AE);
	 values.addAll(Suppliers_SD_COM);
	 values.addAll(Suppliers_SD_SA);
	 values.addAll(Suppliers_SD_EG);
	 
	 System.out.println("Total values of Suppliers:"+values);
	ArrayList<String> uniqueSupplier = removeDuplicates(values);
	System.out.println("After Remove SD Suppliers Names:"+uniqueSupplier);
	System.out.println("Suppliers value of range:"+uniqueSupplier.size());
	String GetValue=Integer.toString(uniqueSupplier.size());
	if(GetValue.equals("0"))
	{
		int add=uniqueSupplier.size();
		 SD_UNQ_VALUE=add;
		 System.out.println("SD_UNQ_VALUE:"+SD_UNQ_VALUE);
	}
	if(!GetValue.equals("0"))
	{
		int add=uniqueSupplier.size()+2;
		 SD_UNQ_VALUE=add;
		 System.out.println("SD_UNQ_VALUE:"+SD_UNQ_VALUE);
	}
}
public static void Supplier_Validate_CN()
{
	 ArrayList<String>values=new ArrayList<>();
	 values.addAll(Suppliers_CN_AE);
	 values.addAll(Suppliers_CN_COM);
	 values.addAll(Suppliers_CN_SA);
	 values.addAll(Suppliers_CN_EG);
	 
	 System.out.println("Total values of Suppliers:"+values);
	ArrayList<String> uniqueSupplier = removeDuplicates(values);
	System.out.println("After Remove CN Suppliers Names:"+uniqueSupplier);
	System.out.println("Suppliers value of range:"+uniqueSupplier.size());
	String GetValue=Integer.toString(uniqueSupplier.size());
	if(GetValue.equals("0"))
	{
		int add=uniqueSupplier.size();
		 CN_UNQ_VALUE=add;
		 System.out.println("CN_UNQ_VALUE:"+CN_UNQ_VALUE);
	}
	if(!GetValue.equals("0"))
	{
		int add=uniqueSupplier.size()+2;
		 CN_UNQ_VALUE=add;
		 System.out.println("CN_UNQ_VALUE:"+CN_UNQ_VALUE);
	}
}
public static void Supplier_Validate_TH()
{
	 ArrayList<String>values=new ArrayList<>();
	 values.addAll(Suppliers_TH_AE);
	 values.addAll(Suppliers_TH_COM);
	 values.addAll(Suppliers_TH_SA);
	 values.addAll(Suppliers_TH_EG);
	 
	 System.out.println("Total values of Suppliers:"+values);
	ArrayList<String> uniqueSupplier = removeDuplicates(values);
	System.out.println("After Remove TH Suppliers Names:"+uniqueSupplier);
	System.out.println("Suppliers value of range:"+uniqueSupplier.size());
	String GetValue=Integer.toString(uniqueSupplier.size());
	if(GetValue.equals("0"))
	{
		int add=uniqueSupplier.size();
		 TH_UNQ_VALUE=add;
		 System.out.println("TH_UNQ_VALUE:"+TH_UNQ_VALUE);
	}
	if(!GetValue.equals("0"))
	{
		int add=uniqueSupplier.size()+2;
		 TH_UNQ_VALUE=add;
		 System.out.println("TH_UNQ_VALUE:"+TH_UNQ_VALUE);
	}
}	

public static void waitforElement(WebDriver driver)
{
	long timeoutInSeconds = 85;
	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					
	}
static ArrayList<String> removeDuplicates(ArrayList<String> list) {

		        // Store unique items in result.
		        ArrayList<String> result = new ArrayList<>();

		        // Record encountered Strings in HashSet.
		        HashSet<String> set = new HashSet<>();

		        // Loop over argument list.
		        for (String item : list) {

		            // If String is not in set, add it to the list and the set.
		            if (!set.contains(item)) {
		                result.add(item);
		                set.add(item);
		            }
		        }
		        return result;
		    }

}
