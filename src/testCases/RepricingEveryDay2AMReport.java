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
import AppModules.NormalFormateForYesterday;
import AppModules.RepricingHtml;
import AppModules.RepricingReports;
import AppModules.Repricing_TH_CP_HTML_Reports;
import AppModules.Repricing_TH_CP_Reports;
import AppModules.BookingStatusSearch;


import AppModules.Flights_Yesterday_Bookings_of_All;
import AppModules.HtmlPage;
import jxl.write.WriteException;
import pageobjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;

import utility.Utils;

public class RepricingEveryDay2AMReport {
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
	String extentReportFile = Constant.ExtentReports + "\\LoginAndSearchSoldout\\extentReportFile.html";
	String extentReportImage = Constant.ExtentReports + "\\LoginAndSearchSoldout\\extentReportImage.png";
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

		ExcelUtils.ExcelExport(sTestCaseName, 0, sTestCaseName);
		//ExcelUtils.lable(0, 45, "This Domain Name is::");
		ExcelUtils.lable(0, 2, "Domain Name ::"+url);

		//Log.startTestCase(sTestCaseName);

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
	public void test_2AM_Flights_Results() throws Exception {
		
		try {

			if (Constant.URL.equalsIgnoreCase("http://stagecallcenter.rehlat.com/")) {
				extentTest.log(LogStatus.INFO, "Navigated to" + " " + SiteName);
				Repricing_TH_CP_Reports.Repricing_com(iTestCaseRow, driver);
				Repricing_TH_CP_Reports.Repricing_SA(iTestCaseRow, driver);
				Repricing_TH_CP_Reports.Repricing_AE(iTestCaseRow, driver);
				Repricing_TH_CP_Reports.Repricing_EG(iTestCaseRow, driver);
				Repricing_TH_CP_HTML_Reports.HtmlReport(iTestCaseRow, driver);
				Repricing_TH_CP_HTML_Reports.Slack( driver);
				
				
				
				extentTest.log(LogStatus.INFO, "Login to CallCenter");
				extentTest.log(LogStatus.INFO, "Search The Date Filter");
				extentTest.log(LogStatus.INFO, "Select the Transaction Hold");
				extentTest.log(LogStatus.INFO, "Check The PNR Status");
				
				
				
			
				
				
			
				
				
			} 
			else {
				extentTest.log(LogStatus.INFO, "Navigated to" + " " + SiteName);
				
				Repricing_TH_CP_Reports.Repricing_com(iTestCaseRow, driver);
				Repricing_TH_CP_Reports.Repricing_SA(iTestCaseRow, driver);
				Repricing_TH_CP_Reports.Repricing_AE(iTestCaseRow, driver);
				Repricing_TH_CP_Reports.Repricing_EG(iTestCaseRow, driver);
				Repricing_TH_CP_HTML_Reports.HtmlReport(iTestCaseRow, driver);
				Repricing_TH_CP_HTML_Reports.Slack(driver);
				
				extentTest.log(LogStatus.INFO, "Login to CallCenter");
				extentTest.log(LogStatus.INFO, "Search The Date Filter");
				extentTest.log(LogStatus.INFO, "Select the Transaction Hold");
				extentTest.log(LogStatus.INFO, "Check The PNR Status");
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

			//Log.error(e.getMessage());

			throw (e);
		}

	}

	@AfterMethod
	public void afterMethod() throws WriteException, IOException {
		ExcelUtils.CloseExcel();
		//Log.endTestCase(sTestCaseName);

		driver.quit();

		extentTest.log(LogStatus.INFO, "Browser closed");

		// close report.
		extent.endTest(extentTest);

		// writing everything to document.
		extent.flush();

	}

}
