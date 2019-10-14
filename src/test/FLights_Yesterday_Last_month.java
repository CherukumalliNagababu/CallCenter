package test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AppModules.Flights_Yesterday_Bookings_of_All;
import AppModules.Login;
import AppModules.NormalFormateForYesterday;
import AppModules.Repricing_TH_CP_HTML_Reports;
import AppModules.Repricing_TH_CP_Reports;
import jxl.write.WriteException;
import pageobjects.BaseClass;
import pageobjects.Loginpage;
import utility.Constant;
import utility.Utils;



public class FLights_Yesterday_Last_month {
	static WebDriver driver;
	private int iTestCaseRow;
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
	
	@Test
	public void Flights_Yesterday_Lastmonth_Booking_Status_Report() throws Exception
	{
		AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
		AllStatus_TS_SD_CN_TH_SA(iTestCaseRow, driver);
		AllStatus_TS_SD_CN_TH_AE(iTestCaseRow, driver);
		AllStatus_TS_SD_CN_TH_EG(iTestCaseRow, driver);
		TestFormate(iTestCaseRow, driver);
	}
	@AfterMethod
	public void afterMethod() throws WriteException, IOException {
		
		driver.quit();
	}
	
	public static void IsRepriced_TS_SD_CN_TH_com(int iTestCaseRow,WebDriver driver) throws Exception {
		
		
		//******************* Transaction Successfull*********************************************
    	Select transaction1=new Select(Loginpage.BookingSatus());
    	transaction1.selectByIndex(3);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
long timeoutInSeconds = 85;
WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));

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
      
     int TotalValue = Com_TS_Wego + Com_TS_b2c +Com_TS_MobIos +Com_TS_skyscan+Com_TS_MobAnd
		        + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
				  
		        Com_TS_Transaction_Total = TotalValue; 
				 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
				
				int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
		 	    	
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
    + Com_TS_Dhrehlat+ Com_TS_Aviasa +Com_TS_Kayak + Com_TS_Dohop+ Com_TS_Farecompare +Com_TS_Shoogloo;
	  
    Com_TS_Transaction_Total = TotalValue; 
	 System.out.println("Trancation Successfull total:::----"+Com_TS_Transaction_Total);
	
	 int Other =Com_TS_Dhrehlat + Com_TS_Aviasa +Com_TS_Kayak+ Com_TS_Dohop+ Com_TS_Farecompare+ Com_TS_Shoogloo;
	    	
	 Com_TS_Other_TrancationSuccessfull =Other; 
		System.out.println(" Others domains Trancation Successfull total :::----"+Com_TS_Other_TrancationSuccessfull);



	//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
}
   
//******************* confirmation pending*********************************************
Select conpending=new Select(Loginpage.BookingSatus());
conpending.selectByIndex(4);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
      
     int TotalValue = Com_CP_Wego + Com_CP_b2c +Com_CP_MobIos +Com_CP_skyscan+Com_CP_MobAnd
		        + Com_CP_Dhrehlat+ Com_CP_Aviasa +Com_CP_Kayak + Com_CP_Dohop+ Com_CP_Farecompare +Com_CP_Shoogloo;
				  
		        Com_CP_conformation_pending_Total = TotalValue; 
				 System.out.println("Confirmation Pending total:::----"+Com_CP_conformation_pending_Total);
				
				int Other =Com_CP_Dhrehlat + Com_CP_Aviasa +Com_CP_Kayak+ Com_CP_Dohop+ Com_CP_Farecompare+ Com_CP_Shoogloo;
		 	    	
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
            default:System.out.println("Not in 10, 20 or 30");  
         
            }
           }
        }
  
       
   

              



      

    
        int TotalValue = Com_CP_Wego + Com_CP_b2c +Com_CP_MobIos +Com_CP_skyscan+Com_CP_MobAnd
 		        + Com_CP_Dhrehlat+ Com_CP_Aviasa +Com_CP_Kayak + Com_CP_Dohop+ Com_CP_Farecompare +Com_CP_Shoogloo;
 				  
 		        Com_CP_conformation_pending_Total = TotalValue; 
 				 System.out.println("Confirmation Pending total:::----"+Com_CP_conformation_pending_Total);
 				
 				int Other =Com_CP_Dhrehlat + Com_CP_Aviasa +Com_CP_Kayak+ Com_CP_Dohop+ Com_CP_Farecompare+ Com_CP_Shoogloo;
 		 	    	
 				 Com_CP_Other_conformation_pending = Other; 
 					System.out.println(" Others domains Confirmation Pending total :::----"+Com_CP_Other_conformation_pending);
 	        
 	        


	//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
}


//Repricing 

Select re=new Select(Loginpage.BookingSatus());
re.selectByIndex(13);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
	 
     
     int TotalValue = Com_RP_Wego+ Com_RP_b2c+Com_RP_MobIos + Com_RP_MobAnd+Com_RP_skyscan
        +Com_RP_Dhrehlat+ Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
       
        
        
        Com_RP_Repricing_Total = TotalValue; 
		System.out.println("Repricing total:::----"+Com_RP_Repricing_Total);
		
		
		int Other =Com_RP_Dhrehlat +Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
 	    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


  
	        int TotalValue = Com_RP_Wego+ Com_RP_b2c+Com_RP_MobIos + Com_RP_MobAnd+Com_RP_skyscan
			        +Com_RP_Dhrehlat+ Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
			       
			        
			        
			        Com_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+Com_RP_Repricing_Total);
					
					
					int Other =Com_RP_Dhrehlat +Com_RP_Aviasa +Com_RP_Kayak + Com_RP_Dohop+ Com_RP_Farecompare+ Com_RP_Shoogloo;
			 	    	
					 Com_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+Com_RP_Other_Repricingtotal);

	


	



}

Thread.sleep(2000);





//***********************Sold Outs**********************************
Select s=new Select(Loginpage.BookingSatus());
s.selectByIndex(11);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
	 
     
     int TotalValue = Com_SD_Wego+ Com_SD_b2c+Com_SD_MobIos + Com_SD_MobAnd+Com_SD_skyscan
        +Com_SD_Dhrehlat+ Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
       
        
        
        Com_SD_SoldOut_Total = TotalValue; 
		System.out.println("SoldOuts total:::----"+Com_SD_SoldOut_Total);
		
		
		int Other =Com_SD_Dhrehlat +Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
 	    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


  
	        int TotalValue = Com_SD_Wego+ Com_SD_b2c+Com_SD_MobIos + Com_SD_MobAnd+Com_SD_skyscan
			        +Com_SD_Dhrehlat+ Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
			       
			        
			        
			        Com_SD_SoldOut_Total = TotalValue; 
					System.out.println("SoldOuts total:::----"+Com_SD_SoldOut_Total);
					
					
					int Other =Com_SD_Dhrehlat +Com_SD_Aviasa +Com_SD_Kayak + Com_SD_Dohop+ Com_SD_Farecompare+ Com_SD_Shoogloo;
			 	    	
					 Com_SD_Other_SoldOutstotal = Other; 
						System.out.println(" Others domains SoldOuts total:::----"+Com_SD_Other_SoldOutstotal);


	


	



}

Thread.sleep(2000);




//***********************Cancelled**********************************
Select Cancelled=new Select(Loginpage.BookingSatus());
Cancelled.selectByIndex(8);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
     
     int TotalValue = Com_CN_Wego +Com_CN_b2c +Com_CN_MobIos +Com_CN_MobAnd+ Com_CN_skyscan
     +Com_CN_Dhrehlat +Com_CN_Aviasa +Com_CN_Kayak +Com_CN_Dohop+Com_CN_Farecompare+Com_CN_Shoogloo;
		 Com_CN_CancelledTotal = TotalValue; 
		System.out.println("Cancelled total:::----"+Com_CN_CancelledTotal);
		
		int Other =Com_CN_Dhrehlat + Com_CN_Aviasa +Com_CN_Kayak + Com_CN_Dohop+ Com_CN_Farecompare+ Com_CN_Shoogloo;
 	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


    
	        int TotalValue = Com_CN_Wego +Com_CN_b2c +Com_CN_MobIos +Com_CN_MobAnd+ Com_CN_skyscan
		        +Com_CN_Dhrehlat +Com_CN_Aviasa +Com_CN_Kayak +Com_CN_Dohop+Com_CN_Farecompare+Com_CN_Shoogloo;
				 Com_CN_CancelledTotal =  TotalValue; 
				System.out.println("Cancelled total:::----"+Com_CN_CancelledTotal);
				
				int Other =Com_CN_Dhrehlat + Com_CN_Aviasa +Com_CN_Kayak + Com_CN_Dohop+ Com_CN_Farecompare+ Com_CN_Shoogloo;
  	    	
				 Com_CN_Other_CancelledTotal =  Other; 
				System.out.println("Cancelled total:::----"+Com_CN_Other_CancelledTotal);

}

Thread.sleep(2000);



//*********************Transaction Hold*****************************
Select transactionHold=new Select(Loginpage.BookingSatus());
transactionHold.selectByIndex(1);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
     int TotalValue =Com_TH_Wego + Com_TH_b2c +Com_TH_MobIos + Com_TH_MobAnd+ Com_TH_skyscan
    +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo ;
	 Com_TH_Transactionhold_total =  TotalValue; 
	 
	 int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo;
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  
	       
	   






	        int TotalValue =Com_TH_Wego + Com_TH_b2c +Com_TH_MobIos + Com_TH_MobAnd+ Com_TH_skyscan
		        +Com_TH_Dhrehlat +Com_TH_Aviasa +Com_TH_Kayak +Com_TH_Dohop+ Com_TH_Farecompare + Com_TH_Shoogloo ;
				 Com_TH_Transactionhold_total =  TotalValue; 
				 
				int otherTotal=Com_TH_Dhrehlat+ Com_TH_Aviasa +Com_TH_Kayak + Com_TH_Dohop+ Com_TH_Farecompare +Com_TH_Shoogloo;
	        Com_Other_TH_Transactionhold_total =  otherTotal; 
			System.out.println("TransactionHold total:::----"+Com_Other_TH_Transactionhold_total);
				 
				 
				System.out.println("TransactionHold total:::----"+Com_TH_Transactionhold_total);



}
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
long timeoutInSeconds = 85;
WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));

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
         
	     int TotalValue = SA_TS_Wego + SA_TS_b2c +SA_TS_MobIos + SA_TS_MobAnd+ SA_TS_skyscan
	        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
			 SA_TS_Transaction_Total =  TotalValue; 
			System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
		
			int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
 	    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  
	       




	        int TotalValue = SA_TS_Wego + SA_TS_b2c +SA_TS_MobIos + SA_TS_MobAnd+ SA_TS_skyscan
	        +SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
			 SA_TS_Transaction_Total =  TotalValue; 
			System.out.println("Trancation Successfull total:::----"+SA_TS_Transaction_Total);
		
			int Other =SA_TS_Dhrehlat + SA_TS_Aviasa +SA_TS_Kayak+ SA_TS_Dohop+ SA_TS_Farecompare+SA_TS_Shoogloo;
 	    	
		 SA_TS_Other_TrancationSuccessfull =  Other; 
			System.out.println(" Others domains Trancation Successfull total :::----"+SA_TS_Other_TrancationSuccessfull);
  


}

//******************* confirmation pending*********************************************
Select conpending=new Select(Loginpage.BookingSatus());
conpending.selectByIndex(4);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
      
     int TotalValue = SA_CP_Wego + SA_CP_b2c +SA_CP_MobIos +SA_CP_skyscan+SA_CP_MobAnd
		        + SA_CP_Dhrehlat+ SA_CP_Aviasa +SA_CP_Kayak + SA_CP_Dohop+ SA_CP_Farecompare +SA_CP_Shoogloo;
				  
		        SA_CP_conformation_pending_Total = TotalValue; 
				 System.out.println("Confirmation Pending total:::----"+SA_CP_conformation_pending_Total);
				
				int Other =SA_CP_Dhrehlat + SA_CP_Aviasa +SA_CP_Kayak+ SA_CP_Dohop+ SA_CP_Farecompare+ SA_CP_Shoogloo;
		 	    	
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
            default:System.out.println("Not in 10, 20 or 30");  
         
            }
           }
        }
  
       
   

              



      

    
        int TotalValue = SA_CP_Wego + SA_CP_b2c +SA_CP_MobIos +SA_CP_skyscan+SA_CP_MobAnd
 		        + SA_CP_Dhrehlat+ SA_CP_Aviasa +SA_CP_Kayak + SA_CP_Dohop+ SA_CP_Farecompare +SA_CP_Shoogloo;
 				  
 		        SA_CP_conformation_pending_Total = TotalValue; 
 				 System.out.println("Confirmation Pending total:::----"+SA_CP_conformation_pending_Total);
 				
 				int Other =SA_CP_Dhrehlat + SA_CP_Aviasa +SA_CP_Kayak+ SA_CP_Dohop+ SA_CP_Farecompare+ SA_CP_Shoogloo;
 		 	    	
 				 SA_CP_Other_conformation_pending = Other; 
 					System.out.println(" Others domains Confirmation Pending total :::----"+SA_CP_Other_conformation_pending);
 	        
 	        


	//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
}	




//Repricing 

Select re=new Select(Loginpage.BookingSatus());
re.selectByIndex(13);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
	 
     
     int TotalValue = SA_RP_Wego+ SA_RP_b2c+SA_RP_MobIos + SA_RP_MobAnd+SA_RP_skyscan
        +SA_RP_Dhrehlat+ SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
       
        
        
     SA_RP_Repricing_Total = TotalValue; 
		System.out.println("Repricing total:::----"+SA_RP_Repricing_Total);
		
		
		int Other =SA_RP_Dhrehlat +SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
 	    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


  
	        int TotalValue = SA_RP_Wego+ SA_RP_b2c+SA_RP_MobIos + SA_RP_MobAnd+SA_RP_skyscan
			        +SA_RP_Dhrehlat+ SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
			       
			        
			        
		         SA_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+SA_RP_Repricing_Total);
					
					
					int Other =SA_RP_Dhrehlat +SA_RP_Aviasa +SA_RP_Kayak + SA_RP_Dohop+ SA_RP_Farecompare+ SA_RP_Shoogloo;
			 	    	
					SA_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+SA_RP_Other_Repricingtotal);


	



}

Thread.sleep(2000);



//***********************Sold Outs**********************************
Select s=new Select(Loginpage.BookingSatus());
s.selectByIndex(11);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
	
	int TotalValue =SA_SD_Wego +SA_SD_b2c+SA_SD_MobIos+ SA_SD_MobAnd+ SA_SD_skyscan
	        +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
			 
	        SA_SD_SoldOut_Total =  TotalValue; 
			System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
			
			int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
		    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


    
	        int TotalValue =SA_SD_Wego +SA_SD_b2c+SA_SD_MobIos+ SA_SD_MobAnd+ SA_SD_skyscan
    +SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
	 
    SA_SD_SoldOut_Total =  TotalValue; 
	System.out.println("SoldOuts total:::----"+SA_SD_SoldOut_Total);
	
	int Other =SA_SD_Dhrehlat + SA_SD_Aviasa+SA_SD_Kayak + SA_SD_Dohop+ SA_SD_Farecompare+ SA_SD_Shoogloo ;
    	
	 SA_SD_Other_SoldOutstotal =  Other; 
		System.out.println(" Others domains SoldOuts total:::----"+SA_SD_Other_SoldOutstotal);



	


	



}

Thread.sleep(2000);

//***********************Cancelled**********************************
		Select Cancelled=new Select(Loginpage.BookingSatus());
		Cancelled.selectByIndex(8);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
		        
	    	int TotalValue = SA_CN_Wego + SA_CN_b2c +SA_CN_MobIos + SA_CN_MobAnd+SA_CN_skyscan
		        +SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
				 SA_CN_CancelledTotal =  TotalValue; 
				System.out.println("Cancelled total:::----"+SA_CN_CancelledTotal);
    	
				int Other = SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
				
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
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
    	
	        
	    	        int TotalValue = SA_CN_Wego + SA_CN_b2c +SA_CN_MobIos + SA_CN_MobAnd+SA_CN_skyscan
					        +SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
							 SA_CN_CancelledTotal =  TotalValue; 
							System.out.println("Cancelled total:::----"+SA_CN_CancelledTotal);
			    	
							int Other = SA_CN_Dhrehlat +SA_CN_Aviasa +SA_CN_Kayak + SA_CN_Dohop+ SA_CN_Farecompare+ SA_CN_Shoogloo;
							
							SA_CN_Other_CancelledTotal =  Other; 
			 				System.out.println("Cancelled total:::----"+SA_CN_Other_CancelledTotal);
      
    	}
		
    	Thread.sleep(2000);

    	//*********************Transaction Hold*****************************
    	Select transactionHold=new Select(Loginpage.BookingSatus());
    	transactionHold.selectByIndex(1);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
		        
	    	int TotalValue = SA_TH_Wego + SA_TH_b2c +SA_TH_MobIos + SA_TH_MobAnd+ SA_TH_skyscan 
		        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
				 SA_TH_Transactionhold_total =  TotalValue; 
				System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
				
				int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
					
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
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
    	
        
        
        
	    	        int TotalValue = SA_TH_Wego + SA_TH_b2c +SA_TH_MobIos + SA_TH_MobAnd+ SA_TH_skyscan 
			        +SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
					 SA_TH_Transactionhold_total =  TotalValue; 
					System.out.println("TransactionHold total:::----"+SA_TH_Transactionhold_total);
					
					int Other =SA_TH_Dhrehlat + SA_TH_Aviasa +SA_TH_Kayak + SA_TH_Dohop+ SA_TH_Farecompare+SA_TH_Shoogloo ;
						
						SA_TH_Other_TransactionholdTotal =  Other; 
		 				System.out.println("TransactionHold total:::----"+SA_TH_Other_TransactionholdTotal);
    	}
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

long timeoutInSeconds = 85;
WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));

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
        
	 int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobIos + AE_TS_MobAnd+AE_TS_skyscan
        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
		 AE_TS_Transaction_Total =  TotalValue; 
		System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
		
		int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  





	        int TotalValue = AE_TS_Wego+ AE_TS_b2c +AE_TS_MobIos + AE_TS_MobAnd+AE_TS_skyscan
	        +AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
			 AE_TS_Transaction_Total =  TotalValue; 
			System.out.println("Trancation Successfull total:::----"+AE_TS_Transaction_Total);
			
			int Other =AE_TS_Dhrehlat +AE_TS_Aviasa +AE_TS_Kayak+ AE_TS_Dohop+ AE_TS_Farecompare+ AE_TS_Shoogloo ;
	    	
			 AE_TS_Other_TrancationSuccessfull =  Other; 
				System.out.println(" Others domains Trancation Successfull total :::----"+AE_TS_Other_TrancationSuccessfull);
	    

}
//******************* confirmation pending*********************************************
Select conpending=new Select(Loginpage.BookingSatus());
conpending.selectByIndex(4);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
      
     int TotalValue = AE_CP_Wego + AE_CP_b2c +AE_CP_MobIos +AE_CP_skyscan+AE_CP_MobAnd
		        + AE_CP_Dhrehlat+ AE_CP_Aviasa +AE_CP_Kayak + AE_CP_Dohop+ AE_CP_Farecompare +AE_CP_Shoogloo;
				  
		        AE_CP_conformation_pending_Total = TotalValue; 
				 System.out.println("Confirmation Pending total:::----"+AE_CP_conformation_pending_Total);
				
				int Other =AE_CP_Dhrehlat + AE_CP_Aviasa +AE_CP_Kayak+ AE_CP_Dohop+ AE_CP_Farecompare+ AE_CP_Shoogloo;
		 	    	
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
            default:System.out.println("Not in 10, 20 or 30");  
         
            }
           }
        }
  
       
   

              



      

    
        int TotalValue = AE_CP_Wego + AE_CP_b2c +AE_CP_MobIos +AE_CP_skyscan+AE_CP_MobAnd
 		        + AE_CP_Dhrehlat+ AE_CP_Aviasa +AE_CP_Kayak + AE_CP_Dohop+ AE_CP_Farecompare +AE_CP_Shoogloo;
 				  
 		        AE_CP_conformation_pending_Total = TotalValue; 
 				 System.out.println("Confirmation Pending total:::----"+AE_CP_conformation_pending_Total);
 				
 				int Other =AE_CP_Dhrehlat + AE_CP_Aviasa +AE_CP_Kayak+ AE_CP_Dohop+ AE_CP_Farecompare+ AE_CP_Shoogloo;
 		 	    	
 				 AE_CP_Other_conformation_pending = Other; 
 					System.out.println(" Others domains Confirmation Pending total :::----"+AE_CP_Other_conformation_pending);
 	        
 	        


	//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
}	
	

//Repricing 

Select re=new Select(Loginpage.BookingSatus());
re.selectByIndex(13);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
	 
     
     int TotalValue = AE_RP_Wego+ AE_RP_b2c+AE_RP_MobIos + AE_RP_MobAnd+AE_RP_skyscan
        +AE_RP_Dhrehlat+ AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
       
        
        
     AE_RP_Repricing_Total = TotalValue; 
		System.out.println("Repricing total:::----"+AE_RP_Repricing_Total);
		
		
		int Other =AE_RP_Dhrehlat +AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
 	    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


  
	        int TotalValue = AE_RP_Wego+ AE_RP_b2c+AE_RP_MobIos + AE_RP_MobAnd+AE_RP_skyscan
			        +AE_RP_Dhrehlat+ AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
			       
			        
			        
		         AE_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+AE_RP_Repricing_Total);
					
					
					int Other =AE_RP_Dhrehlat +AE_RP_Aviasa +AE_RP_Kayak + AE_RP_Dohop+ AE_RP_Farecompare+ AE_RP_Shoogloo;
			 	    	
					AE_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+AE_RP_Other_Repricingtotal);


	



}

Thread.sleep(2000);



//***********************Sold Outs**********************************
Select s=new Select(Loginpage.BookingSatus());
s.selectByIndex(11);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
        
	int TotalValue = AE_SD_Wego + AE_SD_b2c +AE_SD_MobIos+ AE_SD_MobAnd+ AE_SD_skyscan
        +AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
		 AE_SD_SoldOut_Total =  TotalValue; 
		 
		System.out.println("SoldOuts total:::----"+AE_SD_SoldOut_Total);
		
		int Other =AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  



	        int TotalValue = AE_SD_Wego + AE_SD_b2c +AE_SD_MobIos+ AE_SD_MobAnd+ AE_SD_skyscan
	        +AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
			 AE_SD_SoldOut_Total =  TotalValue; 
			 
			System.out.println("SoldOuts total:::----"+AE_SD_SoldOut_Total);
			
			int Other =AE_SD_Dhrehlat +AE_SD_Aviasa +AE_SD_Kayak + AE_SD_Dohop+AE_SD_Farecompare+ AE_SD_Shoogloo;
	    	
			 AE_SD_Other_SoldOutstotal =  Other; 
				System.out.println(" Others domains SoldOuts total:::----"+AE_SD_Other_SoldOutstotal);
}

Thread.sleep(2000);

//***********************Cancelled**********************************
		Select Cancelled=new Select(Loginpage.BookingSatus());
		Cancelled.selectByIndex(8);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
		        
	    	int TotalValue = AE_CN_Wego + AE_CN_b2c + AE_CN_MobIos  +  AE_CN_MobAnd+  AE_CN_skyscan  
		        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
				 AE_CN_CancelledTotal =  TotalValue; 
				System.out.println("Cancelled total:::----"+AE_CN_CancelledTotal);
				
				int Other = AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
				
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
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
    	
    	
	    	        int TotalValue = AE_CN_Wego + AE_CN_b2c + AE_CN_MobIos  +  AE_CN_MobAnd+  AE_CN_skyscan  
			        + AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
					 AE_CN_CancelledTotal =  TotalValue; 
					System.out.println("Cancelled total:::----"+AE_CN_CancelledTotal);
					
					int Other = AE_CN_Dhrehlat  +  AE_CN_Aviasa  + AE_CN_Kayak  +  AE_CN_Dohop+  AE_CN_Farecompare  +  AE_CN_Shoogloo;
					
					AE_CN_Other_CancelledTotal =  Other; 
	 				System.out.println("Cancelled total:::----"+AE_CN_Other_CancelledTotal);
    	}
		
    	Thread.sleep(2000);

    	//*********************Transaction Hold*****************************
    	Select transactionHold=new Select(Loginpage.BookingSatus());
    	transactionHold.selectByIndex(1);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
		        
	    	int TotalValue =  AE_TH_Wego  +  AE_TH_b2c  + AE_TH_MobIos  +  AE_TH_MobAnd +  AE_TH_skyscan  
		        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
				 AE_TH_Transactionhold_total =  TotalValue; 
			
				System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
				
				int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
					
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
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
    	
        
    	
        
        
        
	    	        int TotalValue =  AE_TH_Wego  +  AE_TH_b2c  + AE_TH_MobIos  +  AE_TH_MobAnd +  AE_TH_skyscan  
			        + AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
					 AE_TH_Transactionhold_total =  TotalValue; 
				
					System.out.println("TransactionHold total:::----"+AE_TH_Transactionhold_total);
					
					int Other =AE_TH_Dhrehlat  +  AE_TH_Aviasa  + AE_TH_Kayak  +  AE_TH_Dohop +  AE_TH_Farecompare +  AE_TH_Shoogloo  ;
						
						AE_TH_Other_TransactionholdTotal =  Other; 
		 				System.out.println("TransactionHold total:::----"+AE_TH_Other_TransactionholdTotal);
      
      
    	}
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

long timeoutInSeconds = 85;
WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"))));
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
        
	int TotalValue = EG_TS_Wego +EG_TS_b2c + EG_TS_MobIos  +  EG_TS_MobAnd +  EG_TS_skyscan 
        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
		 EG_TS_Transaction_Total =  TotalValue; 
		System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
		
		int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  





	        int TotalValue = EG_TS_Wego +EG_TS_b2c + EG_TS_MobIos  +  EG_TS_MobAnd +  EG_TS_skyscan 
	        + EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
			 EG_TS_Transaction_Total =  TotalValue; 
			System.out.println("Trancation Successfull total:::----"+EG_TS_Transaction_Total);
			
			int Other = EG_TS_Dhrehlat  +  EG_TS_Aviasa  + EG_TS_Kayak  +  EG_TS_Dohop +  EG_TS_Farecompare  +  EG_TS_Shoogloo  ;
	    	
			 EG_TS_Other_TrancationSuccessfull =  Other; 
				System.out.println(" Others domains Trancation Successfull total :::----"+EG_TS_Other_TrancationSuccessfull);
	   
    

}

//******************* confirmation pending*********************************************
Select conpending=new Select(Loginpage.BookingSatus());
conpending.selectByIndex(4);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
      
     int TotalValue = EG_CP_Wego + EG_CP_b2c +EG_CP_MobIos +EG_CP_skyscan+EG_CP_MobAnd
		        + EG_CP_Dhrehlat+ EG_CP_Aviasa +EG_CP_Kayak + EG_CP_Dohop+ EG_CP_Farecompare +EG_CP_Shoogloo;
				  
		        EG_CP_conformation_pending_Total = TotalValue; 
				 System.out.println("Confirmation Pending total:::----"+EG_CP_conformation_pending_Total);
				
				int Other =EG_CP_Dhrehlat + EG_CP_Aviasa +EG_CP_Kayak+ EG_CP_Dohop+ EG_CP_Farecompare+ EG_CP_Shoogloo;
		 	    	
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
            default:System.out.println("Not in 10, 20 or 30");  
         
            }
           }
        }
  
       
   

              



      

    
        int TotalValue = EG_CP_Wego + EG_CP_b2c +EG_CP_MobIos +EG_CP_skyscan+EG_CP_MobAnd
 		        + EG_CP_Dhrehlat+ EG_CP_Aviasa +EG_CP_Kayak + EG_CP_Dohop+ EG_CP_Farecompare +EG_CP_Shoogloo;
 				  
 		        EG_CP_conformation_pending_Total = TotalValue; 
 				 System.out.println("Confirmation Pending total:::----"+EG_CP_conformation_pending_Total);
 				
 				int Other =EG_CP_Dhrehlat + EG_CP_Aviasa +EG_CP_Kayak+ EG_CP_Dohop+ EG_CP_Farecompare+ EG_CP_Shoogloo;
 		 	    	
 				 EG_CP_Other_conformation_pending = Other; 
 					System.out.println(" Others domains Confirmation Pending total :::----"+EG_CP_Other_conformation_pending);
 	        
 	        


	//COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d %25s %25s ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
}	
		


//Repricing 

Select re=new Select(Loginpage.BookingSatus());
re.selectByIndex(13);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
	 
     
     int TotalValue = EG_RP_Wego+ EG_RP_b2c+EG_RP_MobIos + EG_RP_MobAnd+EG_RP_skyscan
        +EG_RP_Dhrehlat+ EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo;
       
        
        
     EG_RP_Repricing_Total = TotalValue; 
		System.out.println("Repricing total:::----"+EG_RP_Repricing_Total);
		
		
		int Other =EG_RP_Dhrehlat +EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo;
 	    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  


  
	        int TotalValue = EG_RP_Wego+ EG_RP_b2c+EG_RP_MobIos + EG_RP_MobAnd+EG_RP_skyscan
			        +EG_RP_Dhrehlat+ EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo;
			       
			        
			        
		         EG_RP_Repricing_Total = TotalValue; 
					System.out.println("Repricing total:::----"+EG_RP_Repricing_Total);
					
					
					int Other =EG_RP_Dhrehlat +EG_RP_Aviasa +EG_RP_Kayak + EG_RP_Dohop+ EG_RP_Farecompare+ EG_RP_Shoogloo;
			 	    	
					EG_RP_Other_Repricingtotal = Other; 
						System.out.println(" Others domains Repricing total:::----"+EG_RP_Other_Repricingtotal);


	



}

Thread.sleep(2000);



//***********************Sold Outs**********************************
Select s=new Select(Loginpage.BookingSatus());
s.selectByIndex(11);
Thread.sleep(1000);
Loginpage.Search_button().click();
Thread.sleep(1000);

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
        
	int TotalValue =  EG_SD_Wego  +  EG_SD_b2c  + EG_SD_MobIos  +  EG_SD_MobAnd +  EG_SD_skyscan 
        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
		 EG_SD_SoldOut_Total =  TotalValue; 
		System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
		
		int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
    	
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
	            default:System.out.println("Not in 10, 20 or 30");  
	         
	            }
	           }
	        }
	  

	        int TotalValue =  EG_SD_Wego  +  EG_SD_b2c  + EG_SD_MobIos  +  EG_SD_MobAnd +  EG_SD_skyscan 
        + EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
		 EG_SD_SoldOut_Total =  TotalValue; 
		System.out.println("SoldOuts total:::----"+EG_SD_SoldOut_Total);
		
		int Other =EG_SD_Dhrehlat  +  EG_SD_Aviasa  + EG_SD_Kayak  +  EG_SD_Dohop +  EG_SD_Farecompare +  EG_SD_Shoogloo ;
    	
		 EG_SD_Other_SoldOutstotal =  Other; 
			System.out.println(" Others domains SoldOuts total:::----"+EG_SD_Other_SoldOutstotal);

}

Thread.sleep(2000);

//***********************Cancelled**********************************
		Select Cancelled=new Select(Loginpage.BookingSatus());
		Cancelled.selectByIndex(8);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
		        
	    	int TotalValue =  EG_CN_Wego  +  EG_CN_b2c  + EG_CN_MobIos  +  EG_CN_MobAnd +  EG_CN_skyscan 
		        + EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
				 EG_CN_CancelledTotal =  TotalValue; 
				System.out.println("Cancelled total:::----"+EG_CN_CancelledTotal);
				
				int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
				
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
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
    	
    	
	    	        int TotalValue =  EG_CN_Wego  +  EG_CN_b2c  + EG_CN_MobIos  +  EG_CN_MobAnd +  EG_CN_skyscan 
			        + EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
					 EG_CN_CancelledTotal =  TotalValue; 
					System.out.println("Cancelled total:::----"+EG_CN_CancelledTotal);
					
					int Other = EG_CN_Dhrehlat  +  EG_CN_Aviasa  + EG_CN_Kayak  +  EG_CN_Dohop +  EG_CN_Farecompare +  EG_CN_Shoogloo ;
					
					EG_CN_Other_CancelledTotal =  Other; 
	 				System.out.println(" Other Cancelled total:::----"+EG_CN_Other_CancelledTotal);
        
      
    	}
		
    	Thread.sleep(2000);

    	//*********************Transaction Hold*****************************
    	Select transactionHold=new Select(Loginpage.BookingSatus());
    	transactionHold.selectByIndex(1);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);
		
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
		        
	    	int TotalValue =  EG_TH_Wego  +  EG_TH_b2c  + EG_TH_MobIos  +  EG_TH_MobAnd +  EG_TH_skyscan 
		        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
				 EG_TH_Transactionhold_total =  TotalValue; 
				System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
				
				int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
				
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
	    	            default:System.out.println("Not in 10, 20 or 30");  
	    	         
	    	            }
	    	           }
	    	        }
	    	  
	    	       
    	
        
    	
        
        
        
    	int TotalValue =  EG_TH_Wego  +  EG_TH_b2c  + EG_TH_MobIos  +  EG_TH_MobAnd +  EG_TH_skyscan 
		        + EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
				 
    	EG_TH_Transactionhold_total =  TotalValue; 
				System.out.println("TransactionHold total:::----"+EG_TH_Transactionhold_total);
				
				int Other =EG_TH_Dhrehlat  +  EG_TH_Aviasa  + EG_TH_Kayak  +  EG_TH_Dohop +  EG_TH_Farecompare +  EG_TH_Shoogloo  ;
				
				EG_TH_Other_TransactionHoldTotal =  Other; 
 				System.out.println(" Other TransactionHold total:::----"+EG_TH_Other_TransactionHoldTotal);
      
    	}
    	
    	driver.findElement(By.id("IsRepriced")).click();
    	Thread.sleep(4000);
    	IsRepriced_TS_SD_CN_TH_EG(iTestCaseRow, driver);
    	Loginpage.ClickOnUsername().click();
    	Thread.sleep(1000);
    	Loginpage.Log_Out().click();
    	Thread.sleep(2000);
    	
System.out.println("************************************************************************************");



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

public static void TestFormate(int iTestCaseRow,WebDriver driver) throws Exception {
	
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


//Transaction Successful
String COM_TS_Total = new Integer(Com_TS_Transaction_Total).toString();
String AE_TS_Total = new Integer(AE_TS_Transaction_Total).toString();
String SA_TS_Total = new Integer(SA_TS_Transaction_Total).toString();
String EG_TS_Total = new Integer(EG_TS_Transaction_Total).toString();



 int TS_TotalValue = Integer.parseInt(COM_TS_Total) + Integer.parseInt(AE_TS_Total) +Integer.parseInt(SA_TS_Total) + Integer.parseInt(EG_TS_Total);
 int All_TransactionSuccess_total = TS_TotalValue; 
System.out.println("TRANSACTION SUCCESS GRAND TOTAL:::----"+All_TransactionSuccess_total);


//Confirmation pending
String COM_CP_Total = new Integer(Com_CP_conformation_pending_Total).toString();
String AE_CP_Total = new Integer(AE_CP_conformation_pending_Total).toString();
String SA_CP_Total = new Integer(SA_CP_conformation_pending_Total).toString();
String EG_CP_Total = new Integer(EG_CP_conformation_pending_Total).toString();



int CP_TotalValue = Integer.parseInt(COM_CP_Total) + Integer.parseInt(AE_CP_Total) +Integer.parseInt(SA_CP_Total) + Integer.parseInt(EG_CP_Total);
int All_Confirmationpending_total = CP_TotalValue; 
System.out.println("CONFIRMATION PENDING GRAND TOTAL:::----"+All_Confirmationpending_total);

//Repricing
String COM_RP_Total = new Integer(Com_RP_Repricing_Total).toString();
String AE_RP_Total = new Integer(AE_RP_Repricing_Total).toString();
String SA_RP_Total = new Integer(SA_RP_Repricing_Total).toString();
String EG_RP_Total = new Integer(EG_RP_Repricing_Total).toString();

int RP_TotalValue = Integer.parseInt(COM_RP_Total) + Integer.parseInt(AE_RP_Total) +Integer.parseInt(SA_RP_Total) + Integer.parseInt(EG_RP_Total);
int All_Repricing_total = RP_TotalValue; 
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
	
	
	


String TS_Grand_Total=String.format("%7s " ,"TRANSACTION SUCCESS GRAND TOTAL :)- "+All_TransactionSuccess_total+"");
String Com_ts=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_TS_Transaction_Total+") :","-B2C("+Com_TS_b2c+")", "-MOBAPP("+Com_TS_MobAnd+")", "-MOBIOS("+Com_TS_MobIos+")", "-WEGO("+Com_TS_Wego+")","-SKYSCN("+Com_TS_skyscan+")", "-OTHERS("+Com_TS_Other_TrancationSuccessfull+")");
String AE_ts =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_TS_Transaction_Total+") :", "-B2C("+AE_TS_b2c+")", "-MOBAPP("+AE_TS_MobAnd+")", "-MOBIOS("+AE_TS_MobIos+")", "-WEGO("+AE_TS_Wego+")","-SKYSCN("+AE_TS_skyscan+")", "-OTHERS("+AE_TS_Other_TrancationSuccessfull+")");
String Sa_ts =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_TS_Transaction_Total+") :", "-B2C("+SA_TS_b2c+")", "-MOBAPP("+SA_TS_MobAnd+")", "-MOBIOS("+SA_TS_MobIos+")", "-WEGO("+SA_TS_Wego+")","-SKYSCN("+SA_TS_skyscan+")", "-OTHERS("+SA_TS_Other_TrancationSuccessfull+")");
String Eg_ts =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_TS_Transaction_Total+") :", "-B2C("+EG_TS_b2c+")", "-MOBAPP("+EG_TS_MobAnd+")", "-MOBIOS("+EG_TS_MobIos+")", "-WEGO("+EG_TS_Wego+")","-SKYSCN("+EG_TS_skyscan+")", "-OTHERS("+EG_TS_Other_TrancationSuccessfull+")");



//Reprice
	 String RP_Grand_Total=String.format("%7s " ,"REPRICING GRAND TOTAL :)- "+All_Repricing_total+"");
		String Com_Rp=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_RP_Repricing_Total+") :","-B2C("+Com_RP_b2c+")", "-MOBAPP("+Com_RP_MobAnd+")", "-MOBIOS("+Com_RP_MobIos+")", "-WEGO("+Com_RP_Wego+")","-SKYSCN("+Com_RP_skyscan+")", "-OTHERS("+Com_RP_Other_Repricingtotal+")");
		String AE_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_RP_Repricing_Total+") :", "-B2C("+AE_RP_b2c+")", "-MOBAPP("+AE_RP_MobAnd+")", "-MOBIOS("+AE_RP_MobIos+")", "-WEGO("+AE_RP_Wego+")","-SKYSCN("+AE_RP_skyscan+")", "-OTHERS("+AE_RP_Other_Repricingtotal+")");
		String Sa_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_RP_Repricing_Total+") :", "-B2C("+SA_RP_b2c+")", "-MOBAPP("+SA_RP_MobAnd+")", "-MOBIOS("+SA_RP_MobIos+")", "-WEGO("+SA_RP_Wego+")","-SKYSCN("+SA_RP_skyscan+")", "-OTHERS("+SA_RP_Other_Repricingtotal+")");
		String Eg_Rp =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_RP_Repricing_Total+") :", "-B2C("+EG_RP_b2c+")", "-MOBAPP("+EG_RP_MobAnd+")", "-MOBIOS("+EG_RP_MobIos+")", "-WEGO("+EG_RP_Wego+")","-SKYSCN("+EG_RP_skyscan+")", "-OTHERS("+EG_RP_Other_Repricingtotal+")");
		
		


String SD_Grand_Total=String.format("%7s " ,"SOLD OUTS GRAND TOTAL :)- "+All_SoldOut_total+"");
String Com_sd=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_SD_SoldOut_Total+") :","-B2C("+Com_SD_b2c+")", "-MOBAPP("+Com_SD_MobAnd+")", "-MOBIOS("+Com_SD_MobIos+")", "-WEGO("+Com_SD_Wego+")","-SKYSCN("+Com_SD_skyscan+")", "-OTHERS("+Com_SD_Other_SoldOutstotal+")");
String AE_sd =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_SD_SoldOut_Total+") :", "-B2C("+AE_SD_b2c+")", "-MOBAPP("+AE_SD_MobAnd+")", "-MOBIOS("+AE_SD_MobIos+")", "-WEGO("+AE_SD_Wego+")","-SKYSCN("+AE_SD_skyscan+")", "-OTHERS("+AE_SD_Other_SoldOutstotal+")");
String Sa_sd =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_SD_SoldOut_Total+") :", "-B2C("+SA_SD_b2c+")", "-MOBAPP("+SA_SD_MobAnd+")", "-MOBIOS("+SA_SD_MobIos+")", "-WEGO("+SA_SD_Wego+")","-SKYSCN("+SA_SD_skyscan+")", "-OTHERS("+SA_SD_Other_SoldOutstotal+")");
String Eg_sd =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_SD_SoldOut_Total+") :", "-B2C("+EG_SD_b2c+")", "-MOBAPP("+EG_SD_MobAnd+")", "-MOBIOS("+EG_SD_MobIos+")", "-WEGO("+EG_SD_Wego+")","-SKYSCN("+EG_SD_skyscan+")", "-OTHERS("+EG_SD_Other_SoldOutstotal+")");

String CN_Grand_Total=String.format("%7s " ,"CANCELLED GRAND TOTAL :)- "+All_Cancelled_total+"");
String Com_cn=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_CN_CancelledTotal+") :","-B2C("+Com_CN_b2c+")", "-MOBAPP("+Com_CN_MobAnd+")", "-MOBIOS("+Com_CN_MobIos+")", "-WEGO("+Com_CN_Wego+")","-SKYSCN("+Com_CN_skyscan+")", "-OTHERS("+Com_CN_Other_CancelledTotal+")");
String AE_cn =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_CN_CancelledTotal+") :", "-B2C("+AE_CN_b2c+")", "-MOBAPP("+AE_CN_MobAnd+")", "-MOBIOS("+AE_CN_MobIos+")", "-WEGO("+AE_CN_Wego+")","-SKYSCN("+AE_CN_skyscan+")", "-OTHERS("+AE_CN_Other_CancelledTotal+")");
String Sa_cn =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_CN_CancelledTotal+") :", "-B2C("+SA_CN_b2c+")", "-MOBAPP("+SA_CN_MobAnd+")", "-MOBIOS("+SA_CN_MobIos+")", "-WEGO("+SA_CN_Wego+")","-SKYSCN("+SA_CN_skyscan+")", "-OTHERS("+SA_CN_Other_CancelledTotal+")");
String Eg_cn =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_CN_CancelledTotal+") :", "-B2C("+EG_CN_b2c+")", "-MOBAPP("+EG_CN_MobAnd+")", "-MOBIOS("+EG_CN_MobIos+")", "-WEGO("+EG_CN_Wego+")","-SKYSCN("+EG_CN_skyscan+")", "-OTHERS("+EG_CN_Other_CancelledTotal+")");


String TH_Grand_Total=String.format("%7s " ,"TRANSACTION HOLD GRAND TOTAL :)- "+All_TransactionHold_total+"");
String Com_th=String.format("%7s %5s %5s %5s %5s %5s %5s", "COM("+Com_TH_Transactionhold_total+") :","-B2C("+Com_TH_b2c+")", "-MOBAPP("+Com_TH_MobAnd+")", "-MOBIOS("+Com_TH_MobIos+")", "-WEGO("+Com_TH_Wego+")","-SKYSCN("+Com_TH_skyscan+")", "-OTHERS("+Com_Other_TH_Transactionhold_total+")");
String AE_th =String.format("%7s %5s %5s %5s %5s %5s %5s", "AE"+"   "+"("+AE_TH_Transactionhold_total+") :", "-B2C("+AE_TH_b2c+")", "-MOBAPP("+AE_TH_MobAnd+")", "-MOBIOS("+AE_TH_MobIos+")", "-WEGO("+AE_TH_Wego+")","-SKYSCN("+AE_TH_skyscan+")", "-OTHERS("+AE_TH_Other_TransactionholdTotal+")");
String Sa_th =String.format("%7s %5s %5s %5s %5s %5s %5s", "SA"+"   "+"("+SA_TH_Transactionhold_total+") :", "-B2C("+SA_TH_b2c+")", "-MOBAPP("+SA_TH_MobAnd+")", "-MOBIOS("+SA_TH_MobIos+")", "-WEGO("+SA_TH_Wego+")","-SKYSCN("+SA_TH_skyscan+")", "-OTHERS("+SA_TH_Other_TransactionholdTotal+")");
String Eg_th =String.format("%7s %5s %5s %5s %5s %5s %5s", "EG"+"   "+"("+EG_TH_Transactionhold_total+") :", "-B2C("+EG_TH_b2c+")", "-MOBAPP("+EG_TH_MobAnd+")", "-MOBIOS("+EG_TH_MobIos+")", "-WEGO("+EG_TH_Wego+")","-SKYSCN("+EG_TH_skyscan+")", "-OTHERS("+EG_TH_Other_TransactionHoldTotal+")");




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
	
	
	//email.addTo("chaitanya.varigonda@rehlat.com ");
	//email.addTo("tariqraza@rehlat.com  ");
	
  // email.addTo("naga.ch199@gmail.com");
  
	
	System.out.println("3");
	email.send();
	System.out.println("END");
	









}

	
}
