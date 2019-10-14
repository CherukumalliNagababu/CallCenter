package test;

import java.io.FileOutputStream;
import java.io.IOException;
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

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.Flight_Yesterday_Supplier_Bookings;
import AppModules.Flights_Yesterday_Supplier_Mail;
import AppModules.Login;
import SuppliersCode.SupplierAE;
import SuppliersCode.SupplierCom;
import SuppliersCode.SupplierEG;
import SuppliersCode.SupplierSA;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import pageobjects.BaseClass;
import pageobjects.Loginpage;
import utility.Constant;
import utility.Retry;
import utility.Utils;

public class Flights_Yesterday_LastMonth_Supplier_Report extends SupplierEG{
	
	static int All_TransactionSuccess_total;
	static int All_Confirmationpending_total;
	static int All_Repricing_total;
	
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
				
	
				
				static WebDriver driver;
				private int iTestCaseRow;
				@BeforeMethod
				public void test()
				{
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--start-maximized");
					System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
					driver = new ChromeDriver(options);

					//Log.info("New driver instantiated");
					driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					//Log.info("Implicit wait applied on the driver for 10 seconds");
					driver.manage().deleteAllCookies();
					driver.get(Constant.URL);
					new BaseClass(driver);
				}
				
				@Test(retryAnalyzer=Retry.class)
				public void Flights_Yesterday_Lastmonth_Booking_Status_Report() throws Exception
				{
					AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
					AllStatus_TS_SD_CN_TH_SA(iTestCaseRow, driver);
					AllStatus_TS_SD_CN_TH_AE(iTestCaseRow, driver);
					AllStatus_TS_SD_CN_TH_EG(iTestCaseRow, driver);
				    Supplier_Validate_TS();
					Supplier_Validate_CP();
					Supplier_Validate_RP();
					Supplier_Validate_SD();
					Supplier_Validate_CN();
					Supplier_Validate_TH();
					GenerateMail(iTestCaseRow, driver);
					getValues();
				}
				@AfterMethod
				public void afterMethod() throws WriteException, IOException {
					
					driver.quit();
				}
				
				
public static void waitforElement()
{
	long timeoutInSeconds = 85;
	WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
					
	}
				
public static void IsRepriced_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
					
					
					//******************* Transaction Successfull*********************************************
			    	Select transaction1=new Select(Loginpage.BookingSatus());
			    	transaction1.selectByIndex(3);
					Thread.sleep(1000);
					Loginpage.Search_button().click();
					Thread.sleep(1000);
					
					waitforElement();
					
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
					waitforElement();
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
					waitforElement();
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
					waitforElement();
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
					
					waitforElement();
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
					waitforElement();
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
					waitforElement();
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
					waitforElement();
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
		
		waitforElement();
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
		waitforElement();
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
		waitforElement();
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
		waitforElement();
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
		
		waitforElement();
		
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
		waitforElement();
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
		waitforElement();
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
		waitforElement();
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
	    	
			Loginpage.Month_back().click();
			Thread.sleep(1000);
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
			Loginpage.Month_back().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
	    	Select transaction1=new Select(Loginpage.BookingSatus());
	    	transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			waitforElement();
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
	    	
	    	//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			
			waitforElement();
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
			waitforElement();
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
			waitforElement();
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
			waitforElement();
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
			waitforElement();
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
		 		        +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo+Com_TH_B2bAgent+Com_TH_B2b_Skyshop ;
		 				 Com_TH_Transactionhold_total =  TotalValue; 
		 				 
		 				int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo+Com_TH_B2bAgent+Com_TH_B2b_Skyshop;
		 	        Com_Other_TH_Transactionhold_total =  otherTotal; 
		 			System.out.println("TransactionHold total:::----"+Com_Other_TH_Transactionhold_total);
		 				 
		 				 
		 				System.out.println("TransactionHold total:::----"+Com_TH_Transactionhold_total);
	        
	      
	      
	    	}
	    	
	    	SupplierCom.SupplierCOM_TH(driver,comtranstrhold);
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
			
			Loginpage.Month_back().click();
			Thread.sleep(1000);
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
			Loginpage.Month_back().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(SAspliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement();
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
			
			//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement();
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
			waitforElement();
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
			waitforElement();
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
				        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo+SA_SD_B2bAgent+SA_SD_B2b_Skyshop ;
						 
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
		        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo+SA_SD_B2bAgent+SA_SD_B2b_Skyshop ;
				 
		        SA_SD_SoldOut_Total =  TotalValue; 
				System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
				
				int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo +SA_SD_B2bAgent+SA_SD_B2b_Skyshop;
			    	
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
					waitforElement();
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
					waitforElement();
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
					        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo +SA_TH_B2bAgent+SA_TH_B2b_Skyshop;
							 SA_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
							
							int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo +SA_TH_B2bAgent+SA_TH_B2b_Skyshop;
								
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
						        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo+SA_TH_B2bAgent+SA_TH_B2b_Skyshop ;
								 SA_TH_Transactionhold_total =  TotalValue; 
								System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
								
								int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo +SA_TH_B2bAgent+SA_TH_B2b_Skyshop;
									
									SA_TH_Other_TransactionholdTotal =  Other; 
					 				System.out.println("TransactionHold total:::----"+SA_TH_Other_TransactionholdTotal);
			    	}
			    	
			    	SupplierSA.SupplierSA_TH(driver,comTranHold);
			    	Thread.sleep(2000);
			    	
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
			
			Loginpage.Month_back().click();
			Thread.sleep(1000);
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
			Loginpage.Month_back().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(AEspliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			waitforElement();
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
					
					int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo+AE_TS_B2bAgent+AE_TS_B2b_Skyshop ;
			    	
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
						
						int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo+AE_TS_B2bAgent+AE_TS_B2b_Skyshop ;
				    	
						 AE_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
				    
		  
			}
			SupplierAE.SupplierAE_TS(driver,comTrancount);
			
			//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement();
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
			waitforElement();
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
			waitforElement();
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
					waitforElement();
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
						        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo+AE_CN_B2bAgent+AE_CN_B2b_Skyshop;
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
					waitforElement();
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
					        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent +AE_TH_B2b_Skyshop ;
							 AE_TH_Transactionhold_total =  TotalValue; 
						
							System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
							
							int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent +AE_TH_B2b_Skyshop ;
								
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
						        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent +AE_TH_B2b_Skyshop ;
								 AE_TH_Transactionhold_total =  TotalValue; 
							
								System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
								
								int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo +AE_TH_B2bAgent +AE_TH_B2b_Skyshop ;
									
									AE_TH_Other_TransactionholdTotal =  Other; 
					 				System.out.println("TransactionHold total:::----"+AE_TH_Other_TransactionholdTotal);
			      
			      
			    	}
			    	
			    	SupplierAE.SupplierAE_TH(driver,comtranstrhold);
			    	Thread.sleep(2000);
			    	
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
			
			Loginpage.Month_back().click();
			Thread.sleep(1000);
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
			Loginpage.Month_back().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(EGspliteddate[0]);
			Thread.sleep(1000);
			
			
			//******************* Transaction Successfull*********************************************
			Select transaction1=new Select(Loginpage.BookingSatus());
			transaction1.selectByIndex(3);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			
			waitforElement();
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
			        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo+EG_TS_B2bAgent+EG_TS_B2b_Skyshop   ;
					 EG_TS_Transaction_Total =  TotalValue; 
					System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
					
					int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo+EG_TS_B2bAgent+EG_TS_B2b_Skyshop   ;
			    	
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
				        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo +EG_TS_B2bAgent+EG_TS_B2b_Skyshop  ;
						 EG_TS_Transaction_Total =  TotalValue; 
						System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
						
						int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo +EG_TS_B2bAgent+EG_TS_B2b_Skyshop  ;
				    	
						 EG_TS_Other_TrancationSuccessfull =  Other; 
							System.out.println(" Others domains Trancation Successfull total :::----"+EG_TS_Other_TrancationSuccessfull);
				   
			    
		  
			}
			SupplierEG.SupplierEG_TS(driver,comTrancount);
			//******************* confirmation pending*********************************************
	    	Select conpending=new Select(Loginpage.BookingSatus());
	    	conpending.selectByIndex(4);
			Thread.sleep(1000);
			Loginpage.Search_button().click();
			Thread.sleep(1000);
			waitforElement();
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
			waitforElement();
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
			waitforElement();
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
			        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo+EG_SD_B2bAgent+EG_SD_B2b_Skyshop ;
					 EG_SD_SoldOut_Total =  TotalValue; 
					System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
					
					int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo+EG_SD_B2bAgent+EG_SD_B2b_Skyshop ;
			    	
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
					waitforElement();
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
							
							int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo+EG_CN_B2bAgent+EG_CN_B2b_Skyshop ;
							
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
								
								int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo+EG_CN_B2bAgent+EG_CN_B2b_Skyshop ;
								
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
					waitforElement();
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
					        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  +EG_TH_B2bAgent+EG_TH_B2b_Skyshop ;
							 EG_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
							
							int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo+EG_TH_B2bAgent+EG_TH_B2b_Skyshop   ;
							
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
					        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo +EG_TH_B2bAgent+EG_TH_B2b_Skyshop  ;
							 
			    	EG_TH_Transactionhold_total =  TotalValue; 
							System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
							
							int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo +EG_TH_B2bAgent+EG_TH_B2b_Skyshop  ;
							
							EG_TH_Other_TransactionHoldTotal =  Other; 
			 				System.out.println(" Other TransactionHold total:::----"+EG_TH_Other_TransactionHoldTotal);
			      
			    	}
			    	SupplierEG.SupplierEG_TH(driver,comtranstrhold);
			    	Thread.sleep(2000);
			    	
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
	email.setSubject("Yesterday :(Date:"+Utils.Yesterdaytimestamp()+")-  Flight Booking Status Report - "+Utils.YesterdayName());
	System.out.println("2");
	
	
 
 
 

	
	email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 400 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center > <tr align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));

	
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
	
 
 
 
 
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >SOLDOUT</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>Com</td> <td>"+Com_SD_b2c+"</td><td>"+Com_SD_MobAnd+"</td><td>"+Com_SD_MobIos+"</td><td>"+Com_SD_Wego+"</td><td>"+Com_SD_skyscan+"</td><td>"+Com_SD_Other_SoldOutstotal+"</td><td>"+Com_SD_SoldOut_Total+"</td><td rowspan=5>"+All_SoldOut_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_SD_b2c+"</td><td>"+AE_SD_MobAnd+"</td><td>"+AE_SD_MobIos+"</td><td>"+AE_SD_Wego+"</td><td>"+AE_SD_skyscan+"</td><td>"+AE_SD_Other_SoldOutstotal+"</td><td>"+AE_SD_SoldOut_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_SD_b2c+"</td><td>"+SA_SD_MobAnd+"</td><td>"+SA_SD_MobIos+"</td><td>"+SA_SD_Wego+"</td><td>"+SA_SD_skyscan+"</td><td>"+SA_SD_Other_SoldOutstotal+"</td><td>"+SA_SD_SoldOut_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_SD_b2c+"</td><td>"+EG_SD_MobAnd+"</td><td>"+EG_SD_MobIos+"</td><td>"+EG_SD_Wego+"</td><td>"+EG_SD_skyscan+"</td><td>"+EG_SD_Other_SoldOutstotal+"</td><td>"+EG_SD_SoldOut_Total+"</td></tr>"));
	
 
 
 
 
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CANCELLED</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Com_CN_b2c+"</td><td>"+Com_CN_MobAnd+"</td><td>"+Com_CN_MobIos+"</td><td>"+Com_CN_Wego+"</td><td>"+Com_CN_skyscan+"</td><td>"+Com_CN_Other_CancelledTotal+"</td><td>"+Com_CN_CancelledTotal+"</td><td rowspan=5>"+All_Cancelled_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+AE_CN_b2c+"</td><td>"+AE_CN_MobAnd+"</td><td>"+AE_CN_MobIos+"</td><td>"+AE_CN_Wego+"</td><td>"+AE_CN_skyscan+"</td><td>"+AE_CN_Other_CancelledTotal+"</td><td>"+AE_CN_CancelledTotal+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+SA_CN_b2c+"</td><td>"+SA_CN_MobAnd+"</td><td>"+SA_CN_MobIos+"</td><td>"+SA_CN_Wego+"</td><td>"+SA_CN_skyscan+"</td><td>"+SA_CN_Other_CancelledTotal+"</td><td>"+SA_CN_CancelledTotal+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+EG_CN_b2c+"</td><td>"+EG_CN_MobAnd+"</td><td>"+EG_CN_MobIos+"</td><td>"+EG_CN_Wego+"</td><td>"+EG_CN_skyscan+"</td><td>"+EG_CN_Other_CancelledTotal+"</td><td>"+EG_CN_CancelledTotal+"</td></tr>"));
	
 
	

 
 
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


 
email.setHtmlMsg(""+htmlStringBuilder.append("</table></body></html>"));
	
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <tr>"));
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #4AF318 class=table table-bordered style=border-color:black>  Repriced PNR'S  </tr>"));
	
	
    email.setHtmlMsg(""+htmlStringBuilder.append(" <table width = 900 height = 400 cellpadding=5 border=1 cellspacing=5 style=font-size:12px;border-collapse:collapse; border-style: solid;border-spacing: 2px; border-width: thin;text-align:center  > <tr align=LEFT bgcolor=#FF7C00 style=border-color:black;color:#ffffff><th STYLE=color:#ffffff colspan=10>REPRICED PNR's</th></tr> <tr  align=center bgcolor=#18bcf2 class=m_-7593383128584549858table style=color:#ffffff ><th>BOOKING STATUS </th> <th>DOMAIN</th> <th>B2C</th><th>MOBAPP</th><th>MOBIOS</th> <th>WEGO</th> <th>SKYSCN</th> <th> OTHERS </th> <th> TOTAL</th><th> GRAND TOTAL </th></tr> "));
	
	
	
	
	
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION SUCCESSFUL</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_TS_b2c+"</td><td>"+Isreprice_Com_TS_MobAnd+"</td><td>"+Isreprice_Com_TS_MobIos+"</td><td>"+Isreprice_Com_TS_Wego+"</td><td>"+Isreprice_Com_TS_skyscan+"</td><td>"+Isreprice_Com_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_Com_TS_Transaction_Total+"</td><td rowspan=5>"+IR_All_TransactionSuccess_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_TS_b2c+"</td><td>"+Isreprice_AE_TS_MobAnd+"</td><td>"+Isreprice_AE_TS_MobIos+"</td><td>"+Isreprice_AE_TS_Wego+"</td><td>"+Isreprice_AE_TS_skyscan+"</td><td>"+Isreprice_AE_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_AE_TS_Transaction_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_TS_b2c+"</td><td>"+Isreprice_SA_TS_MobAnd+"</td><td>"+Isreprice_SA_TS_MobIos+"</td><td>"+Isreprice_SA_TS_Wego+"</td><td>"+Isreprice_SA_TS_skyscan+"</td><td>"+Isreprice_SA_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_SA_TS_Transaction_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_TS_b2c+"</td><td>"+Isreprice_EG_TS_MobAnd+"</td><td>"+Isreprice_EG_TS_MobIos+"</td><td>"+Isreprice_EG_TS_Wego+"</td><td>"+Isreprice_EG_TS_skyscan+"</td><td>"+Isreprice_EG_TS_Other_TrancationSuccessfull+"</td><td>"+Isreprice_EG_TS_Transaction_Total+"</td></tr>"));
	
	
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >PARTIALLY TICKETED</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_PT_b2c+"</td><td>"+Isreprice_Com_PT_MobAnd+"</td><td>"+Isreprice_Com_PT_MobIos+"</td><td>"+Isreprice_Com_PT_Wego+"</td><td>"+Isreprice_Com_PT_skyscan+"</td><td>"+Isreprice_Com_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_Com_PT_PartiallyTicketed_Total+"</td><td rowspan=5>"+IR_All_PartillyTicket_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_PT_b2c+"</td><td>"+Isreprice_AE_PT_MobAnd+"</td><td>"+Isreprice_AE_PT_MobIos+"</td><td>"+Isreprice_AE_PT_Wego+"</td><td>"+Isreprice_AE_PT_skyscan+"</td><td>"+Isreprice_AE_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_AE_PT_PartiallyTicketed_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_PT_b2c+"</td><td>"+Isreprice_SA_PT_MobAnd+"</td><td>"+Isreprice_SA_PT_MobIos+"</td><td>"+Isreprice_SA_PT_Wego+"</td><td>"+Isreprice_SA_PT_skyscan+"</td><td>"+Isreprice_SA_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_SA_PT_PartiallyTicketed_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_PT_b2c+"</td><td>"+Isreprice_EG_PT_MobAnd+"</td><td>"+Isreprice_EG_PT_MobIos+"</td><td>"+Isreprice_EG_PT_Wego+"</td><td>"+Isreprice_EG_PT_skyscan+"</td><td>"+Isreprice_EG_PT_Other_PartiallyTicketed+"</td><td>"+Isreprice_EG_PT_PartiallyTicketed_Total+"</td></tr>"));
	
	
	
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >CONFIRMATION PENDING</td> <tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_CP_b2c+"</td><td>"+Isreprice_Com_CP_MobAnd+"</td><td>"+Isreprice_Com_CP_MobIos+"</td><td>"+Isreprice_Com_CP_Wego+"</td><td>"+Isreprice_Com_CP_skyscan+"</td><td>"+Isreprice_Com_CP_Other_ConformationPending+"</td><td>"+Isreprice_Com_CP_COnformationPending_Total+"</td><td rowspan=5>"+IR_All_ConformationPending_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_CP_b2c+"</td><td>"+Isreprice_AE_CP_MobAnd+"</td><td>"+Isreprice_AE_CP_MobIos+"</td><td>"+Isreprice_AE_CP_Wego+"</td><td>"+Isreprice_AE_CP_skyscan+"</td><td>"+Isreprice_AE_CP_Other_ConformationPending+"</td><td>"+Isreprice_AE_CP_COnformationPending_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_CP_b2c+"</td><td>"+Isreprice_SA_CP_MobAnd+"</td><td>"+Isreprice_SA_CP_MobIos+"</td><td>"+Isreprice_SA_CP_Wego+"</td><td>"+Isreprice_SA_CP_skyscan+"</td><td>"+Isreprice_SA_CP_Other_ConformationPending+"</td><td>"+Isreprice_SA_CP_COnformationPending_Total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #FFFF00 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_CP_b2c+"</td><td>"+Isreprice_EG_CP_MobAnd+"</td><td>"+Isreprice_EG_CP_MobIos+"</td><td>"+Isreprice_EG_CP_Wego+"</td><td>"+Isreprice_EG_CP_skyscan+"</td><td>"+Isreprice_EG_CP_Other_ConformationPending+"</td><td>"+Isreprice_EG_CP_COnformationPending_Total+"</td></tr>"));
	
	
	
	
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td width = 50; align=center rowspan=5 >TRANSACTION HOLD</td> <tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>COM</td> <td>"+Isreprice_Com_TH_b2c+"</td><td>"+Isreprice_Com_TH_MobAnd+"</td><td>"+Isreprice_Com_TH_MobIos+"</td><td>"+Isreprice_Com_TH_Wego+"</td><td>"+Isreprice_Com_TH_skyscan+"</td><td>"+Isreprice_Com_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_Com_TH_Transactionhold_total+"</td><td rowspan=5>"+IR_All_TrancationHold_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>AE</td> <td>"+Isreprice_AE_TH_b2c+"</td><td>"+Isreprice_AE_TH_MobAnd+"</td><td>"+Isreprice_AE_TH_MobIos+"</td><td>"+Isreprice_AE_TH_Wego+"</td><td>"+Isreprice_AE_TH_skyscan+"</td><td>"+Isreprice_AE_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_AE_TH_Transactionhold_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>SA</td> <td>"+Isreprice_SA_TH_b2c+"</td><td>"+Isreprice_SA_TH_MobAnd+"</td><td>"+Isreprice_SA_TH_MobIos+"</td><td>"+Isreprice_SA_TH_Wego+"</td><td>"+Isreprice_SA_TH_skyscan+"</td><td>"+Isreprice_SA_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_SA_TH_Transactionhold_total+"</td></tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr align=center bgcolor= #ffa500 class=table table-bordered style=border-color:black><td>EG</td> <td>"+Isreprice_EG_TH_b2c+"</td><td>"+Isreprice_EG_TH_MobAnd+"</td><td>"+Isreprice_EG_TH_MobIos+"</td><td>"+Isreprice_EG_TH_Wego+"</td><td>"+Isreprice_EG_TH_skyscan+"</td><td>"+Isreprice_EG_Other_TH_Transactionhold_total+"</td><td>"+Isreprice_EG_TH_Transactionhold_total+"</td></tr>"));
	
	
	
	
	
	
	
	
	//email.setHtmlMsg(""+htmlStringBuilder.append("<tr> <td colspan=10> NOTE:--TS -- Transaction Successful ,SD -- Sold Out,CX -- Cancelled,TH -- Transaction Hold </td></tr>"));
 
 

	email.addTo("Sreenivas.bodige@rehlat.com");
	email.addCc("amanpreet@rehlat.com");
	email.addCc("amit.bajaj@rehlat.com");
	email.addCc("sankalp@rehlat.com");
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
	
	//email.addTo("chaitanya.varigonda@rehlat.com ");
	//email.addTo("tariqraza@rehlat.com  ");
	
  // email.addTo("naga.ch199@gmail.com");
  
	
	System.out.println("3");
	email.send();
	System.out.println("END");
	









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


public static void getValues() throws IOException, RowsExceededException, WriteException
{
	
	WritableWorkbook wwb;
	WritableSheet ws;
	
	
	Calendar cal = Calendar.getInstance();
	DateFormat lastweek = new SimpleDateFormat("dd_MMM_yyyy");
    cal.add(Calendar.DATE, -1);
    Date TO1 = cal.getTime();
   System.out.println(lastweek.format(TO1));
   String LDate1 = lastweek.format(TO1);
   String[] values=LDate1.split("_");
   System.out.println("Date"+values[0]);
   System.out.println("Month"+values[1]);
   System.out.println("Year"+values[2]); 
        
       
	FileOutputStream fo = new FileOutputStream("C:/DailyXLReports/"+values[2]+"/"+values[1]+"/"+LDate1+"/Report_Yesterday.xls");
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

}
