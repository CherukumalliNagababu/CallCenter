package testCases;

import java.io.IOException;
import java.lang.reflect.Method;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import AppModules.Login;
import AppModules.Mail;
import AppModules.NormalFormate;


import AppModules.BookingStatusSearch;


import AppModules.Flights_BookingStatus_From_CallCenter;
import AppModules.HtmlPage;
import jxl.write.WriteException;
import pageobjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;

import utility.Utils;

public class ParellFlightDailyBookings {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	String SiteName = null;
	

	
	@BeforeMethod
	public void beforeMethod() throws Exception {
	 //public void beforeMethod(Method method) throws Exception {

		
		
		

		sTestCaseName = this.toString();

		sTestCaseName = Utils.getTestCaseName(this.toString());

		ExcelUtils.ExcelExport(sTestCaseName, 0, sTestCaseName);
		

		

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");

		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);

		
	
		new BaseClass(driver);
	}

	@Test
	public void A_BookingStatus() throws Exception {
	
				Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
				
				
				
			
				
			

	}
	@Test
	public void B_BookingStatus() throws Exception {
	
				
				Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_SA(iTestCaseRow, driver);
				
				
				
			
				
			

	}
	@Test
	public void C_BookingStatus() throws Exception {
	
				
				Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_AE(iTestCaseRow, driver);
				
				
			
				
			

	}
	@Test
	public void D_BookingStatus() throws Exception {
	
				
				Flights_BookingStatus_From_CallCenter.AllStatus_TS_SD_CN_TH_EG(iTestCaseRow, driver);
				
				
				
			
				
			

	}
	@Test
	public void E_BookingStatus() throws Exception {
				NormalFormate.TestFormate(iTestCaseRow, driver);
				
				
			
				
			

	}

	@AfterMethod
	public void afterMethod() throws WriteException, IOException {
		ExcelUtils.CloseExcel();
		

		driver.close();

		

		

		

	}

}
