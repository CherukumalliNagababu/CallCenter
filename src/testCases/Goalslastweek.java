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
import AppModules.NagaDummy;
import AppModules.AllDomainsSoldoutandSuccess;
import AppModules.AllStatus_tableView;

import AppModules.BookingStatusSearch;
import AppModules.Lastweekformate;
import AppModules.Lastweekgol;
import jxl.write.WriteException;
import pageobjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;

import utility.Utils;

public class Goalslastweek {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	String SiteName = null;
	/*
	 * String extentReportFile=System.getProperty("D:\\Reports\\RoundTrip")+
	 * "\\extentReportFile.html"; String
	 * extentReportImage=System.getProperty("D:\\Reports\\RoundTrip")+
	 * "\\extentReportImage.png";;
	 */
	String extentReportFile = Constant.ExtentReports + "\\Goalslastweek\\extentReportFile.html";
	String extentReportImage = Constant.ExtentReports + "\\Goalslastweek\\extentReportImage.png";
	ExtentReports extent = new ExtentReports(extentReportFile, false);
	ExtentTest extentTest;
	// ExtentTest extentTest= extent.startTest("RoundTrip_Search","Excutue ");

	@Parameters({ "url" })
	@BeforeMethod
	public void beforeMethod(String url, Method method) throws Exception {
	 //public void beforeMethod(Method method) throws Exception {

		extentTest = extent.startTest((this.getClass().getSimpleName() + " : :" + method.getName()), method.getName());
		extentTest.assignAuthor("NAGA BABU");
		extentTest.assignCategory("Regression test");
		extentTest.assignCategory(url);
		SiteName = url;
	

		sTestCaseName = this.toString();

		sTestCaseName = Utils.getTestCaseName(this.toString());

		//ExcelUtils.ExcelExport(sTestCaseName, 0, sTestCaseName);
		//ExcelUtils.lable(0, 45, "This Domain Name is::");
		//ExcelUtils.lable(0, 2, "Domain Name ::"+url);

		

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");

		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);

		// driver = Utils.OpenBrowser(iTestCaseRow);
		// ***************************************************************************************************
		// Grid Launch
		driver = Utils.GOpenBrowser(iTestCaseRow, url);
		// ****************************************************************************************************
		extentTest.log(LogStatus.INFO, "Browser Launched");

		new BaseClass(driver);
	}

	@Test
	public void testGoalslastweek() throws Exception {
		
		try {

			if (Constant.URL.equalsIgnoreCase("http://stagecallcenter.rehlat.com/")) {
				extentTest.log(LogStatus.INFO, "Navigated to" + " " + SiteName);
				
				//Dumyproj.Soldouts_com(iTestCaseRow, driver);
			/*Lastweekgol.Transaction_success_Com(iTestCaseRow, driver);
			Lastweekgol.Transaction_success_AE(iTestCaseRow, driver);
			Lastweekgol.Transaction_success_SA(iTestCaseRow, driver);
			Lastweekgol.Transaction_success_EG(iTestCaseRow, driver);
				
				Lastweekformate.TestFormate(iTestCaseRow, driver);
				*/
			NagaDummy.AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
				
				
			
				
				
			} 
			else {
				extentTest.log(LogStatus.INFO, "Navigated to" + " " + SiteName);
				
				/*Lastweekgol.Transaction_success_Com(iTestCaseRow, driver);
				Lastweekgol.Transaction_success_AE(iTestCaseRow, driver);
				Lastweekgol.Transaction_success_SA(iTestCaseRow, driver);
				Lastweekgol.Transaction_success_EG(iTestCaseRow, driver);
				Lastweekformate.TestFormate(iTestCaseRow, driver);*/
				NagaDummy.AllStatus_TS_SD_CN_TH_com(iTestCaseRow, driver);
			}
				
			if (BaseClass.bResult == true) {

				ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
			} 
			else {

				throw new Exception("Test Case Failed because of Verification");
			}

			}
		
			catch (Exception e) {

			ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
			extentTest.log(LogStatus.FAIL, e.getMessage());
			extentTest.log(LogStatus.INFO, "Error Snapshot : " + extentTest.addScreenCapture(extentReportImage));
			Utils.takeScreenshot(driver, sTestCaseName);

			

			throw (e);
		}

	}

	@AfterMethod
	public void afterMethod() throws WriteException, IOException {
		//ExcelUtils.CloseExcel();
		

		driver.close();

		extentTest.log(LogStatus.INFO, "Browser closed");

		// close report.
		extent.endTest(extentTest);

		// writing everything to document.
		extent.flush();

	}

}
