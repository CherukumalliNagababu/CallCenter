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
import AppModules.YesterdayAlldomainsSoldAndSuccess;
import AppModules.AllDomainsSoldoutandSuccess;
import AppModules.BookingStatusSearch;
import jxl.write.WriteException;
import pageobjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;

import utility.Utils;

public class YesterdayAllDomainsSoldAndSuccessful {
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
	String extentReportFile = Constant.ExtentReports + "\\AllDomains\\extentReportFile.html";
	String extentReportImage = Constant.ExtentReports + "\\AllDomains\\extentReportImage.png";
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

		//LogstartTestCase(sTestCaseName);

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
	public void testRoundTrip_Search() throws Exception {
		
		try {

			if (Constant.URL.equalsIgnoreCase("http://stagecallcenter.rehlat.com/")) {
				extentTest.log(LogStatus.INFO, "Navigated to" + " " + SiteName);
				Login.LoginCallCenter(iTestCaseRow);
				YesterdayAlldomainsSoldAndSuccess.YesterdaySoldoutsAndSuccess(iTestCaseRow,driver);
				extentTest.log(LogStatus.INFO, "Login to CallCenter");
				extentTest.log(LogStatus.INFO, "Search The Date Filter");
				extentTest.log(LogStatus.INFO, "Select the Transaction Hold");
				extentTest.log(LogStatus.INFO, "Check The PNR Status");
				
				
				
			
				
				
			
				
				
			} 
			else {
				extentTest.log(LogStatus.INFO, "Navigated to" + " " + SiteName);
				Login.LoginCallCenter(iTestCaseRow);
				YesterdayAlldomainsSoldAndSuccess.YesterdaySoldoutsAndSuccess(iTestCaseRow,driver);
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

			//Logerror(e.getMessage());

			throw (e);
		}

	}

	@AfterMethod
	public void afterMethod() throws WriteException, IOException {
		//ExcelUtils.CloseExcel();
		//LogendTestCase(sTestCaseName);

		driver.close();

		extentTest.log(LogStatus.INFO, "Browser closed");

		// close report.
		extent.endTest(extentTest);

		// writing everything to document.
		extent.flush();

	}

}
