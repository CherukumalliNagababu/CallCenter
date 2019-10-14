package AppModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Loginpage;

public class RepricingReports {
	static int Com_RP_Wego;
	static int Com_RP_b2c;
	static int Com_RP_MobIos;
	static int Com_RP_MobAnd;
	static int Com_RP_skyscan;
	static int Com_RP_Dhrehlat;
	static int Com_RP_Aviasa;
	static int Com_RP_Kayak;
	static int Com_RP_Dohop;
	static int Com_RP_Farecompare;
	static int Com_RP_Shoogloo;

	static int Com_RP_Repricing_Total;
	static int Com_RP_Other_Repricingtotal;
	static int Com_SD_SoldOut_Total;
	static int Com_SD_Other_SoldOutstotal;
	static int Com_CN_CancelledTotal;
	static int Com_CN_Other_CancelledTotal;
	static int Com_TH_Transactionhold_total;
	static int Com_Other_TH_Transactionhold_total;

	static int Com_CP_Wego;
	static int Com_CP_b2c;
	static int Com_CP_MobIos;
	static int Com_CP_MobAnd;
	static int Com_CP_skyscan;
	static int Com_CP_Dhrehlat;
	static int Com_CP_Aviasa;
	static int Com_CP_Kayak;
	static int Com_CP_Dohop;
	static int Com_CP_Farecompare;
	static int Com_CP_Shoogloo;

	static int Com_TS_Transaction_Total;
	static int Com_TS_Other_TrancationSuccessfull;
	static int Com_CP_conformation_pending_Total;
	static int Com_CP_Other_conformation_pending;

	// sa
	static int SA_RP_Wego;
	static int SA_RP_b2c;
	static int SA_RP_MobIos;
	static int SA_RP_MobAnd;
	static int SA_RP_skyscan;
	static int SA_RP_Dhrehlat;
	static int SA_RP_Aviasa;
	static int SA_RP_Kayak;
	static int SA_RP_Dohop;
	static int SA_RP_Farecompare;
	static int SA_RP_Shoogloo;

	static int SA_RP_Repricing_Total;
	static int SA_RP_Other_Repricingtotal;
	static int SA_SD_SoldOut_Total;
	static int SA_SD_Other_SoldOutstotal;
	static int SA_CN_CancelledTotal;
	static int SA_CN_Other_CancelledTotal;
	static int SA_TH_Transactionhold_total;
	static int SA_TH_Other_TransactionholdTotal;

	static int SA_CP_Wego;
	static int SA_CP_b2c;
	static int SA_CP_MobIos;
	static int SA_CP_MobAnd;
	static int SA_CP_skyscan;
	static int SA_CP_Dhrehlat;
	static int SA_CP_Aviasa;
	static int SA_CP_Kayak;
	static int SA_CP_Dohop;
	static int SA_CP_Farecompare;
	static int SA_CP_Shoogloo;

	static int SA_CP_conformation_pending_Total;
	static int SA_CP_Other_conformation_pending;

	// AE
	static int AE_RP_Wego;
	static int AE_RP_b2c;
	static int AE_RP_MobIos;
	static int AE_RP_MobAnd;
	static int AE_RP_skyscan;
	static int AE_RP_Dhrehlat;
	static int AE_RP_Aviasa;
	static int AE_RP_Kayak;
	static int AE_RP_Dohop;
	static int AE_RP_Farecompare;
	static int AE_RP_Shoogloo;

	static int AE_RP_Repricing_Total;
	static int AE_RP_Other_Repricingtotal;
	static int AE_SD_SoldOut_Total;
	static int AE_SD_Other_SoldOutstotal;
	static int AE_CN_CancelledTotal;
	static int AE_CN_Other_CancelledTotal;
	static int AE_TH_Transactionhold_total;
	static int AE_TH_Other_TransactionholdTotal;

	static int AE_CP_Wego;
	static int AE_CP_b2c;
	static int AE_CP_MobIos;
	static int AE_CP_MobAnd;
	static int AE_CP_skyscan;
	static int AE_CP_Dhrehlat;
	static int AE_CP_Aviasa;
	static int AE_CP_Kayak;
	static int AE_CP_Dohop;
	static int AE_CP_Farecompare;
	static int AE_CP_Shoogloo;

	static int AE_CP_conformation_pending_Total;
	static int AE_CP_Other_conformation_pending;

	// Eg

	static int EG_RP_Wego;
	static int EG_RP_b2c;
	static int EG_RP_MobIos;
	static int EG_RP_MobAnd;
	static int EG_RP_skyscan;
	static int EG_RP_Dhrehlat;
	static int EG_RP_Aviasa;
	static int EG_RP_Kayak;
	static int EG_RP_Dohop;
	static int EG_RP_Farecompare;
	static int EG_RP_Shoogloo;

	static int EG_RP_Repricing_Total;
	static int EG_RP_Other_Repricingtotal;
	static int EG_SD_SoldOut_Total;
	static int EG_SD_Other_SoldOutstotal;
	static int EG_CN_CancelledTotal;
	static int EG_CN_Other_CancelledTotal;
	static int EG_TH_Transactionhold_total;
	static int EG_TH_Other_TransactionHoldTotal;

	static int EG_CP_Wego;
	static int EG_CP_b2c;
	static int EG_CP_MobIos;
	static int EG_CP_MobAnd;
	static int EG_CP_skyscan;
	static int EG_CP_Dhrehlat;
	static int EG_CP_Aviasa;
	static int EG_CP_Kayak;
	static int EG_CP_Dohop;
	static int EG_CP_Farecompare;
	static int EG_CP_Shoogloo;

	static int EG_CP_conformation_pending_Total;
	static int EG_CP_Other_conformation_pending;
	
	
	
	
	
	static int com_byDefault;
	
	
	static int Sa_byDefault;
	
	
	static int Ae_byDefault;
	
	
	static int Eg_byDefault;

	public static void Repricing_com(int iTestCaseRow, WebDriver driver) throws Exception {

		driver.get("http://callcenter.rehlat.com/");
		Thread.sleep(1000);
		Login.LoginCallCenter(iTestCaseRow);
		Thread.sleep(1000);

		WebElement checkbox = driver.findElement(By.id("DisablePagination"));

		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Alerdy Check Box is selected");
		}
		WebElement isReprice = driver.findElement(By.id("IsRepriced"));
		if (!isReprice.isSelected())
			isReprice.click();
		else
		{
			System.out.println("Already IsRepriced Check Box is selected");
		}
    	

		Loginpage.FromDate().click();
		Thread.sleep(1000);

		String CurrentUrl = driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
		System.out.println("Current Url" + urldomain[1]);
		String[] urldomain1 = urldomain[1].split("\\/");
		System.out.println("Domain Name::" + urldomain1[0]);

		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Calendar cal2 = Calendar.getInstance();
		DateFormat dateFormat2 = new SimpleDateFormat("d-M-yyyy");

		cal2.add(Calendar.DATE, -2);
		System.out.println("Yesterday's date was " + dateFormat2.format(cal2.getTime()));
		String st2 = dateFormat2.format(cal2.getTime());
		String[] spliteddate2 = st2.split("-");
		System.out.println("Split the Date::" + spliteddate2[0]);

		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("d-M-yyyy");

		cal.add(Calendar.DATE, -1);
		System.out.println("Yesterday's date was " + dateFormat.format(cal.getTime()));
		String st = dateFormat.format(cal.getTime());
		String[] spliteddate = st.split("-");
		System.out.println("Split the Date::" + spliteddate[0]);
		
		
		 DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-d ");
			Date date = new Date();
			System.out.println(dateFormat3.format(date));
			String st3=dateFormat3.format(date);
			String[] spliteddate3 = st3.split("-");
	  	System.out.println("Split the Date::"+spliteddate3[2]);
	  String actualdate=spliteddate3[2];
	  	String exceptedDate="1";
	  	System.out.println(actualdate);
	  	System.out.println(exceptedDate);

		if ("11".equals("1")) {
			System.out.println("naga");
			Loginpage.Month_back().click();
			System.out.println("naga1");
			Loginpage.Select_dateFrom(spliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Month_back().click();
			Loginpage.Select_dateTo(spliteddate[0]);
			Thread.sleep(1000);
		}
		else if("12".equals("2"))
		{
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(spliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(spliteddate[0]);
			Thread.sleep(1000);
		}

		else
{
	Loginpage.Select_dateFrom(spliteddate2[0]);
	Thread.sleep(1000);
	Loginpage.ToDate().click();
	Thread.sleep(1000);
	// Loginpage.Month_back().click();
	// Thread.sleep(1000);
	Loginpage.Select_dateTo(spliteddate[0]);
	Thread.sleep(1000);
}
		
		// Repricing

		Select re = new Select(Loginpage.BookingSatus());
		re.selectByIndex(13);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String Rcount = Loginpage.FlightResults_text().getText();
		System.out.println(Rcount);
		// ExcelUtils.lable(0, 0,count);

		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);
		String Repricing = "Repricing";

		if ("Flight Search Results : 0".equals(Rcount)) {
			// ExcelUtils.lable(2, 2,"No Results are Found");

			Com_RP_Wego = 0;
			Com_RP_b2c = 0;
			Com_RP_MobIos = 0;
			Com_RP_MobAnd = 0;
			Com_RP_skyscan = 0;

			Com_RP_Dhrehlat = 0;
			Com_RP_Aviasa = 0;
			Com_RP_Kayak = 0;

			Com_RP_Dohop = 0;
			Com_RP_Farecompare = 0;
			Com_RP_Shoogloo = 0;

			int TotalValue = Com_RP_Wego + Com_RP_b2c + Com_RP_MobIos + Com_RP_MobAnd + Com_RP_skyscan + Com_RP_Dhrehlat
					+ Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare + Com_RP_Shoogloo;

			Com_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + Com_RP_Repricing_Total);

			int Other = Com_RP_Dhrehlat + Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare
					+ Com_RP_Shoogloo;

			Com_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + Com_RP_Other_Repricingtotal);
			
			 com_byDefault=0;

		} else {
			
			
			int result = 0;
			int count = 0;
			List<WebElement> list=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[9]"));
			for(WebElement e:list)
			{
				String s2t=e.getText();
				System.out.println("value::"+s2t);
				//28 Aug 2018 19:09:55
				
				String[] splited = s2t.split("\\s+");
				//System.out.println("3:"+splited[3]);
				String two=splited[3];
				String[] splited2 = two.split("\\:");
				//System.out.println("0:"+splited2[0]);
				 result = Integer.parseInt(splited2[0]);
				 
				 
					int i=1;
						if (result <=20) {  
						 
							System.out.println("result:::"+result);
							count=i+count;
							count++;
						}
						
						
			}
				
			
			System.out.println(count/2);
		
			com_byDefault=count/2;
				
			
			
			
		}

			/*List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Repricing:" + WE1.size());
			Thread.sleep(2000);

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							Com_RP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							Com_RP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							Com_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							Com_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							Com_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							Com_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							Com_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							Com_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							Com_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							Com_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							Com_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							Com_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							Com_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							Com_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							Com_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							Com_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							Com_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							Com_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							Com_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							Com_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							Com_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							Com_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = Com_RP_Wego + Com_RP_b2c + Com_RP_MobIos + Com_RP_MobAnd + Com_RP_skyscan + Com_RP_Dhrehlat
					+ Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare + Com_RP_Shoogloo;

			Com_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + Com_RP_Repricing_Total);

			int Other = Com_RP_Dhrehlat + Com_RP_Aviasa + Com_RP_Kayak + Com_RP_Dohop + Com_RP_Farecompare
					+ Com_RP_Shoogloo;

			Com_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + Com_RP_Other_Repricingtotal);

		}
		*/

		Thread.sleep(2000);
		// ******************* confirmation pending*********************************************
		Select conpending = new Select(Loginpage.BookingSatus());
		conpending.selectByIndex(4);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String conpendingcount = Loginpage.FlightResults_text().getText();
		System.out.println(conpendingcount);

		String comconpendingstr = conpendingcount.trim();
		String[] comconpendingplited = comconpendingstr.split("\\:");
		System.out.println("No of Results Count" + comconpendingplited[1]);
		Thread.sleep(1000);
		String conformation_pending = "Confirmation Pending";

		if ("Flight Search Results : 0".equals(conpendingcount)) {

			System.out.println("TrancationSuccess total:::----0");

			Com_CP_Wego = 0;
			Com_CP_b2c = 0;
			Com_CP_MobIos = 0;
			Com_CP_MobAnd = 0;
			Com_CP_skyscan = 0;

			Com_CP_Dhrehlat = 0;
			Com_CP_Aviasa = 0;
			Com_CP_Kayak = 0;

			Com_CP_Dohop = 0;
			Com_CP_Farecompare = 0;
			Com_CP_Shoogloo = 0;

			int TotalValue = Com_CP_Wego + Com_CP_b2c + Com_CP_MobIos + Com_CP_skyscan + Com_CP_MobAnd + Com_CP_Dhrehlat
					+ Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare + Com_CP_Shoogloo;

			Com_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + Com_CP_conformation_pending_Total);

			int Other = Com_CP_Dhrehlat + Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare
					+ Com_CP_Shoogloo;

			Com_CP_Other_conformation_pending = Other;
			System.out
					.println(" Others domains Confirmation Pending total :::----" + Com_CP_Other_conformation_pending);

		} else {

			List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Trancation Successfull:" + WE1.size());

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							Com_CP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							Com_CP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							Com_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							Com_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							Com_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							Com_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							Com_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							Com_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							Com_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							Com_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							Com_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							Com_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							Com_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							Com_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							Com_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							Com_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							Com_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							Com_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							Com_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							Com_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							Com_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							Com_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = Com_CP_Wego + Com_CP_b2c + Com_CP_MobIos + Com_CP_skyscan + Com_CP_MobAnd + Com_CP_Dhrehlat
					+ Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare + Com_CP_Shoogloo;

			Com_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + Com_CP_conformation_pending_Total);

			int Other = Com_CP_Dhrehlat + Com_CP_Aviasa + Com_CP_Kayak + Com_CP_Dohop + Com_CP_Farecompare
					+ Com_CP_Shoogloo;

			Com_CP_Other_conformation_pending = Other;
			System.out
					.println(" Others domains Confirmation Pending total :::----" + Com_CP_Other_conformation_pending);

			// COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d
			// %25s %25s
			// ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
		}

	}

	public static void Repricing_SA(int iTestCaseRow, WebDriver driver) throws Exception {

		// Loginpage.SA_link().click();
		driver.get("http://sacallcenter.rehlat.com/");
		Thread.sleep(1000);
		Login.LoginCallCenter(iTestCaseRow);
		Thread.sleep(1000);

		WebElement checkbox = driver.findElement(By.id("DisablePagination"));
		// If the checkbox is unchecked then isSelected() will return false
		// and NOT of false is true, hence we can click on checkbox
		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Alerdy Check Box is selected");
		}
		WebElement isReprice = driver.findElement(By.id("IsRepriced"));
		if (!isReprice.isSelected())
			isReprice.click();
		else
		{
			System.out.println("Already IsRepriced Check Box is selected");
		}
    	

		Loginpage.FromDate().click();
		Thread.sleep(1000);

		String CurrentUrl = driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
		System.out.println("Current Url" + urldomain[1]);
		String[] urldomain1 = urldomain[1].split("\\/");
		System.out.println("Domain Name::" + urldomain1[0]);

		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Calendar calSA2 = Calendar.getInstance();
		DateFormat SAdateFormat2 = new SimpleDateFormat("d-M-yyyy");

		calSA2.add(Calendar.DATE, -2);
		System.out.println("Yesterday's date was " + SAdateFormat2.format(calSA2.getTime()));
		String SAst2 = SAdateFormat2.format(calSA2.getTime());
		String[] SAspliteddate2 = SAst2.split("-");
		System.out.println("Split the Date::" + SAspliteddate2[0]);

		Calendar calSA = Calendar.getInstance();
		DateFormat SAdateFormat = new SimpleDateFormat("d-M-yyyy");
		calSA.add(Calendar.DATE, -1);
		System.out.println("Yesterday's date was " + SAdateFormat.format(calSA.getTime()));
		String SAst = SAdateFormat.format(calSA.getTime());
		String[] SAspliteddate = SAst.split("-");
		System.out.println("Split the Date::" + SAspliteddate[0]);
		
		if ("11".equals("1")) {
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(SAspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Month_back().click();
			Loginpage.Select_dateTo(SAspliteddate[0]);
			Thread.sleep(1000);
		}
		else if("12".equals("2"))
		{
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(SAspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(SAspliteddate[0]);
			Thread.sleep(1000);
		}
		else {
			Loginpage.Select_dateFrom(SAspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			// Loginpage.Month_back().click();
			// Thread.sleep(1000);
			Loginpage.Select_dateTo(SAspliteddate[0]);
			Thread.sleep(1000);
		}

		/*Loginpage.Select_dateFrom(SAspliteddate2[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Loginpage.Select_dateTo(SAspliteddate[0]);*/
		Thread.sleep(1000);
		// Repricing

		Select re = new Select(Loginpage.BookingSatus());
		re.selectByIndex(13);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String Rcount = Loginpage.FlightResults_text().getText();
		System.out.println(Rcount);
		// ExcelUtils.lable(0, 0,count);

		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);
		String Repricing = "Repricing";

		if ("Flight Search Results : 0".equals(Rcount)) {
			// ExcelUtils.lable(2, 2,"No Results are Found");

			SA_RP_Wego = 0;
			SA_RP_b2c = 0;
			SA_RP_MobIos = 0;
			SA_RP_MobAnd = 0;
			SA_RP_skyscan = 0;

			SA_RP_Dhrehlat = 0;
			SA_RP_Aviasa = 0;
			SA_RP_Kayak = 0;

			SA_RP_Dohop = 0;
			SA_RP_Farecompare = 0;
			SA_RP_Shoogloo = 0;

			int TotalValue = SA_RP_Wego + SA_RP_b2c + SA_RP_MobIos + SA_RP_MobAnd + SA_RP_skyscan + SA_RP_Dhrehlat
					+ SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + SA_RP_Repricing_Total);

			int Other = SA_RP_Dhrehlat + SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + SA_RP_Other_Repricingtotal);
			Sa_byDefault=0;

		} else {

			List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Repricing:" + WE1.size());
			Thread.sleep(2000);
			Sa_byDefault= WE1.size();
			
			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Repricing:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							SA_RP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							SA_RP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Repricing:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							SA_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							SA_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							SA_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							SA_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							SA_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							SA_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							SA_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							SA_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							SA_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							SA_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							SA_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							SA_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Repricing:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							SA_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							SA_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Repricing:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							SA_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							SA_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							SA_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							SA_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							SA_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							SA_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = SA_RP_Wego + SA_RP_b2c + SA_RP_MobIos + SA_RP_MobAnd + SA_RP_skyscan + SA_RP_Dhrehlat
					+ SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + SA_RP_Repricing_Total);

			int Other = SA_RP_Dhrehlat + SA_RP_Aviasa + SA_RP_Kayak + SA_RP_Dohop + SA_RP_Farecompare + SA_RP_Shoogloo;

			SA_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + SA_RP_Other_Repricingtotal);

		}

		Thread.sleep(2000);

		// ******************* confirmation
		// pending*********************************************
		Select conpending = new Select(Loginpage.BookingSatus());
		conpending.selectByIndex(4);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String conpendingcount = Loginpage.FlightResults_text().getText();
		System.out.println(conpendingcount);

		String comconpendingstr = conpendingcount.trim();
		String[] comconpendingplited = comconpendingstr.split("\\:");
		System.out.println("No of Results Count" + comconpendingplited[1]);
		Thread.sleep(1000);
		String conformation_pending = "Confirmation Pending";

		if ("Flight Search Results : 0".equals(conpendingcount)) {

			System.out.println("TrancationSuccess total:::----0");

			SA_CP_Wego = 0;
			SA_CP_b2c = 0;
			SA_CP_MobIos = 0;
			SA_CP_MobAnd = 0;
			SA_CP_skyscan = 0;

			SA_CP_Dhrehlat = 0;
			SA_CP_Aviasa = 0;
			SA_CP_Kayak = 0;

			SA_CP_Dohop = 0;
			SA_CP_Farecompare = 0;
			SA_CP_Shoogloo = 0;

			int TotalValue = SA_CP_Wego + SA_CP_b2c + SA_CP_MobIos + SA_CP_skyscan + SA_CP_MobAnd + SA_CP_Dhrehlat
					+ SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + SA_CP_conformation_pending_Total);

			int Other = SA_CP_Dhrehlat + SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + SA_CP_Other_conformation_pending);

		} else {

			List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Trancation Successfull:" + WE1.size());

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							SA_CP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							SA_CP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							SA_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							SA_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							SA_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							SA_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							SA_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							SA_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							SA_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							SA_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							SA_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							SA_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							SA_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							SA_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							SA_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							SA_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							SA_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							SA_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							SA_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							SA_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							SA_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							SA_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = SA_CP_Wego + SA_CP_b2c + SA_CP_MobIos + SA_CP_skyscan + SA_CP_MobAnd + SA_CP_Dhrehlat
					+ SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + SA_CP_conformation_pending_Total);

			int Other = SA_CP_Dhrehlat + SA_CP_Aviasa + SA_CP_Kayak + SA_CP_Dohop + SA_CP_Farecompare + SA_CP_Shoogloo;

			SA_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + SA_CP_Other_conformation_pending);

			// COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d
			// %25s %25s
			// ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
		}

	}

	public static void Repricing_AE(int iTestCaseRow, WebDriver driver) throws Exception {

		// Loginpage.AE_link().click();
		driver.get("http://callcenter.rehlat.ae/");
		Thread.sleep(1000);
		Login.LoginCallCenter(iTestCaseRow);
		Thread.sleep(1000);

		WebElement checkbox = driver.findElement(By.id("DisablePagination"));
		// If the checkbox is unchecked then isSelected() will return false
		// and NOT of false is true, hence we can click on checkbox
		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Alerdy Check Box is selected");
		}
		WebElement isReprice = driver.findElement(By.id("IsRepriced"));
		if (!isReprice.isSelected())
			isReprice.click();
		else
		{
			System.out.println("Already IsRepriced Check Box is selected");
		}
    	

		Loginpage.FromDate().click();
		Thread.sleep(1000);

		String CurrentUrl = driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
		System.out.println("Current Url" + urldomain[1]);
		String[] urldomain1 = urldomain[1].split("\\/");
		System.out.println("Domain Name::" + urldomain1[0]);

		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Calendar calAE2 = Calendar.getInstance();
		DateFormat AEdateFormat2 = new SimpleDateFormat("d-M-yyyy");

		calAE2.add(Calendar.DATE, -2);
		System.out.println("Yesterday's date was " + AEdateFormat2.format(calAE2.getTime()));
		String AEst2 = AEdateFormat2.format(calAE2.getTime());
		String[] AEspliteddate2 = AEst2.split("-");
		System.out.println("Split the Date::" + AEspliteddate2[0]);

		Calendar calAE = Calendar.getInstance();
		DateFormat AEdateFormat = new SimpleDateFormat("d-M-yyyy");

		calAE.add(Calendar.DATE, -1);
		System.out.println("Yesterday's date was " + AEdateFormat.format(calAE.getTime()));
		String AEst = AEdateFormat.format(calAE.getTime());
		String[] AEspliteddate = AEst.split("-");
		System.out.println("Split the Date::" + AEspliteddate[0]);
		
		
		if ("11".equals("1")) {
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(AEspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Month_back().click();
			Loginpage.Select_dateTo(AEspliteddate[0]);
			Thread.sleep(1000);
		}
		else if("12".equals("2"))
		{
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(AEspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(AEspliteddate[0]);
			Thread.sleep(1000);
		}
		else {
			Loginpage.Select_dateFrom(AEspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			// Loginpage.Month_back().click();
			// Thread.sleep(1000);
			Loginpage.Select_dateTo(AEspliteddate[0]);
			Thread.sleep(1000);
		}

		/*Loginpage.Select_dateFrom(AEspliteddate2[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Loginpage.Select_dateTo(AEspliteddate[0]);
		Thread.sleep(1000);*/

		// Repricing

		Select re = new Select(Loginpage.BookingSatus());
		re.selectByIndex(13);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String Rcount = Loginpage.FlightResults_text().getText();
		System.out.println(Rcount);
		// ExcelUtils.lable(0, 0,count);

		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);
		String Repricing = "Repricing";

		if ("Flight Search Results : 0".equals(Rcount)) {
			// ExcelUtils.lable(2, 2,"No Results are Found");

			AE_RP_Wego = 0;
			AE_RP_b2c = 0;
			AE_RP_MobIos = 0;
			AE_RP_MobAnd = 0;
			AE_RP_skyscan = 0;

			AE_RP_Dhrehlat = 0;
			AE_RP_Aviasa = 0;
			AE_RP_Kayak = 0;

			AE_RP_Dohop = 0;
			AE_RP_Farecompare = 0;
			AE_RP_Shoogloo = 0;

			int TotalValue = AE_RP_Wego + AE_RP_b2c + AE_RP_MobIos + AE_RP_MobAnd + AE_RP_skyscan + AE_RP_Dhrehlat
					+ AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + AE_RP_Repricing_Total);

			int Other = AE_RP_Dhrehlat + AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + AE_RP_Other_Repricingtotal);
			
			Ae_byDefault=0;

		} else {

			List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Repricing:" + WE1.size());
			Thread.sleep(2000);
			Ae_byDefault=WE1.size();

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Repricing:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							AE_RP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							AE_RP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Repricing:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							AE_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							AE_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							AE_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							AE_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							AE_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							AE_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							AE_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							AE_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							AE_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							AE_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							AE_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							AE_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Repricing:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							AE_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							AE_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Repricing:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							AE_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							AE_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							AE_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							AE_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							AE_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							AE_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = AE_RP_Wego + AE_RP_b2c + AE_RP_MobIos + AE_RP_MobAnd + AE_RP_skyscan + AE_RP_Dhrehlat
					+ AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + AE_RP_Repricing_Total);

			int Other = AE_RP_Dhrehlat + AE_RP_Aviasa + AE_RP_Kayak + AE_RP_Dohop + AE_RP_Farecompare + AE_RP_Shoogloo;

			AE_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + AE_RP_Other_Repricingtotal);

		}

		Thread.sleep(2000);

		// ******************* confirmation
		// pending*********************************************
		Select conpending = new Select(Loginpage.BookingSatus());
		conpending.selectByIndex(4);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String conpendingcount = Loginpage.FlightResults_text().getText();
		System.out.println(conpendingcount);

		String comconpendingstr = conpendingcount.trim();
		String[] comconpendingplited = comconpendingstr.split("\\:");
		System.out.println("No of Results Count" + comconpendingplited[1]);
		Thread.sleep(1000);
		String conformation_pending = "Confirmation Pending";

		if ("Flight Search Results : 0".equals(conpendingcount)) {

			System.out.println("TrancationSuccess total:::----0");

			AE_CP_Wego = 0;
			AE_CP_b2c = 0;
			AE_CP_MobIos = 0;
			AE_CP_MobAnd = 0;
			AE_CP_skyscan = 0;

			AE_CP_Dhrehlat = 0;
			AE_CP_Aviasa = 0;
			AE_CP_Kayak = 0;

			AE_CP_Dohop = 0;
			AE_CP_Farecompare = 0;
			AE_CP_Shoogloo = 0;

			int TotalValue = AE_CP_Wego + AE_CP_b2c + AE_CP_MobIos + AE_CP_skyscan + AE_CP_MobAnd + AE_CP_Dhrehlat
					+ AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + AE_CP_conformation_pending_Total);

			int Other = AE_CP_Dhrehlat + AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + AE_CP_Other_conformation_pending);

		} else {

			List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Trancation Successfull:" + WE1.size());

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							AE_CP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							AE_CP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							AE_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							AE_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							AE_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							AE_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							AE_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							AE_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							AE_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							AE_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							AE_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							AE_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							AE_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							AE_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							AE_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							AE_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							AE_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							AE_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							AE_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							AE_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							AE_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							AE_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = AE_CP_Wego + AE_CP_b2c + AE_CP_MobIos + AE_CP_skyscan + AE_CP_MobAnd + AE_CP_Dhrehlat
					+ AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + AE_CP_conformation_pending_Total);

			int Other = AE_CP_Dhrehlat + AE_CP_Aviasa + AE_CP_Kayak + AE_CP_Dohop + AE_CP_Farecompare + AE_CP_Shoogloo;

			AE_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + AE_CP_Other_conformation_pending);

			// COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d
			// %25s %25s
			// ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
		}

	}

	public static void Repricing_EG(int iTestCaseRow, WebDriver driver) throws Exception {

		// Loginpage.EG_link().click();
		driver.get("http://callcenter.rehlat.com.eg/");
		Thread.sleep(1000);
		Login.LoginCallCenter(iTestCaseRow);
		Thread.sleep(1000);

		WebElement checkbox = driver.findElement(By.id("DisablePagination"));
		// If the checkbox is unchecked then isSelected() will return false
		// and NOT of false is true, hence we can click on checkbox
		if (!checkbox.isSelected())
			checkbox.click();
		else {
			System.out.println("Alerdy Check Box is selected");
		}
		WebElement isReprice = driver.findElement(By.id("IsRepriced"));
		if (!isReprice.isSelected())
			isReprice.click();
		else
		{
			System.out.println("Already IsRepriced Check Box is selected");
		}
    	

		Loginpage.FromDate().click();
		Thread.sleep(1000);

		String CurrentUrl = driver.getCurrentUrl();
		String[] urldomain = CurrentUrl.split("\\//");
		System.out.println("Current Url" + urldomain[1]);
		String[] urldomain1 = urldomain[1].split("\\/");
		System.out.println("Domain Name::" + urldomain1[0]);

		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Calendar calEG2 = Calendar.getInstance();
		DateFormat EGdateFormat2 = new SimpleDateFormat("d-M-yyyy");

		calEG2.add(Calendar.DATE, -2);
		System.out.println("Yesterday's date was " + EGdateFormat2.format(calEG2.getTime()));
		String EGst2 = EGdateFormat2.format(calEG2.getTime());
		String[] EGspliteddate2 = EGst2.split("-");
		System.out.println("Split the Date::" + EGspliteddate2[0]);

		Calendar calEG = Calendar.getInstance();
		DateFormat EGdateFormat = new SimpleDateFormat("d-M-yyyy");

		calEG.add(Calendar.DATE, -1);
		System.out.println("Yesterday's date was " + EGdateFormat.format(calEG.getTime()));
		String EGst = EGdateFormat.format(calEG.getTime());
		String[] EGspliteddate = EGst.split("-");
		System.out.println("Split the Date::" + EGspliteddate[0]);
		
		
		
		if ("11".equals("1")) {
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(EGspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Month_back().click();
			Loginpage.Select_dateTo(EGspliteddate[0]);
			Thread.sleep(1000);
		}
		else if("12".equals("2"))
		{
			Loginpage.Month_back().click();
			Loginpage.Select_dateFrom(EGspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			Loginpage.Select_dateTo(EGspliteddate[0]);
			Thread.sleep(1000);
		}
		else {
			Loginpage.Select_dateFrom(EGspliteddate2[0]);
			Thread.sleep(1000);
			Loginpage.ToDate().click();
			Thread.sleep(1000);
			// Loginpage.Month_back().click();
			// Thread.sleep(1000);
			Loginpage.Select_dateTo(EGspliteddate[0]);
			Thread.sleep(1000);
		}


	/*	Loginpage.Select_dateFrom(EGspliteddate2[0]);
		Thread.sleep(1000);
		Loginpage.ToDate().click();
		Thread.sleep(1000);
		// Loginpage.Month_back().click();
		// Thread.sleep(1000);
		Loginpage.Select_dateTo(EGspliteddate[0]);
		Thread.sleep(1000);*/

		// Repricing

		Select re = new Select(Loginpage.BookingSatus());
		re.selectByIndex(13);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String Rcount = Loginpage.FlightResults_text().getText();
		System.out.println(Rcount);
		// ExcelUtils.lable(0, 0,count);

		String Rstr = Rcount.trim();
		String[] Rsplited = Rstr.split("\\:");
		System.out.println("No of Results Count" + Rsplited[1]);
		Thread.sleep(1000);
		String Repricing = "Repricing";

		if ("Flight Search Results : 0".equals(Rcount)) {
			// ExcelUtils.lable(2, 2,"No Results are Found");

			EG_RP_Wego = 0;
			EG_RP_b2c = 0;
			EG_RP_MobIos = 0;
			EG_RP_MobAnd = 0;
			EG_RP_skyscan = 0;

			EG_RP_Dhrehlat = 0;
			EG_RP_Aviasa = 0;
			EG_RP_Kayak = 0;

			EG_RP_Dohop = 0;
			EG_RP_Farecompare = 0;
			EG_RP_Shoogloo = 0;

			int TotalValue = EG_RP_Wego + EG_RP_b2c + EG_RP_MobIos + EG_RP_MobAnd + EG_RP_skyscan + EG_RP_Dhrehlat
					+ EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + EG_RP_Repricing_Total);

			int Other = EG_RP_Dhrehlat + EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + EG_RP_Other_Repricingtotal);

			Eg_byDefault=0;
		} else {
			
			
			int result = 0;
			int count = 0;
			List<WebElement> list=driver.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[9]"));
			for(WebElement e:list)
			{
				String s2t=e.getText();
				System.out.println("value::"+s2t);
				//28 Aug 2018 19:09:55
				
				String[] splited = s2t.split("\\s+");
				//System.out.println("3:"+splited[3]);
				String two=splited[3];
				String[] splited2 = two.split("\\:");
				//System.out.println("0:"+splited2[0]);
				 result = Integer.parseInt(splited2[0]);
				 
				 
					int i=1;
						if (result <=20) {  
						 
							System.out.println("result:::"+result);
							count=i+count;
							count++;
						}
						
						
			}
				
			
			System.out.println(count/2);
		
			Eg_byDefault=count/2;
				
			
			
			
		
			
			
		}

			/*List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Repricing:" + WE1.size());
			Thread.sleep(2000);

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Repricing:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							EG_RP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							EG_RP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Repricing:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							EG_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							EG_RP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Repricing:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							EG_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							EG_RP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Repricing:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							EG_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							EG_RP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Repricing:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							EG_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							EG_RP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Repricing:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							EG_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							EG_RP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Repricing:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							EG_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							EG_RP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Repricing:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							EG_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							EG_RP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Repricing:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							EG_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							EG_RP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Repricing:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							EG_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							EG_RP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Repricing:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							EG_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							EG_RP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = EG_RP_Wego + EG_RP_b2c + EG_RP_MobIos + EG_RP_MobAnd + EG_RP_skyscan + EG_RP_Dhrehlat
					+ EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Repricing_Total = TotalValue;
			System.out.println("Repricing total:::----" + EG_RP_Repricing_Total);

			int Other = EG_RP_Dhrehlat + EG_RP_Aviasa + EG_RP_Kayak + EG_RP_Dohop + EG_RP_Farecompare + EG_RP_Shoogloo;

			EG_RP_Other_Repricingtotal = Other;
			System.out.println(" Others domains Repricing total:::----" + EG_RP_Other_Repricingtotal);

		}
*/
		Thread.sleep(2000);

		// ******************* confirmation
		// pending*********************************************
		Select conpending = new Select(Loginpage.BookingSatus());
		conpending.selectByIndex(4);
		Thread.sleep(1000);
		Loginpage.Search_button().click();
		Thread.sleep(1000);

		String conpendingcount = Loginpage.FlightResults_text().getText();
		System.out.println(conpendingcount);

		String comconpendingstr = conpendingcount.trim();
		String[] comconpendingplited = comconpendingstr.split("\\:");
		System.out.println("No of Results Count" + comconpendingplited[1]);
		Thread.sleep(1000);
		String conformation_pending = "Confirmation Pending";

		if ("Flight Search Results : 0".equals(conpendingcount)) {

			System.out.println("TrancationSuccess total:::----0");

			EG_CP_Wego = 0;
			EG_CP_b2c = 0;
			EG_CP_MobIos = 0;
			EG_CP_MobAnd = 0;
			EG_CP_skyscan = 0;

			EG_CP_Dhrehlat = 0;
			EG_CP_Aviasa = 0;
			EG_CP_Kayak = 0;

			EG_CP_Dohop = 0;
			EG_CP_Farecompare = 0;
			EG_CP_Shoogloo = 0;

			int TotalValue = EG_CP_Wego + EG_CP_b2c + EG_CP_MobIos + EG_CP_skyscan + EG_CP_MobAnd + EG_CP_Dhrehlat
					+ EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + EG_CP_conformation_pending_Total);

			int Other = EG_CP_Dhrehlat + EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + EG_CP_Other_conformation_pending);

		} else {

			List<WebElement> WE1 = driver
					.findElements(By.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11]"));

			System.out.println("Total Number of Trancation Successfull:" + WE1.size());

			ArrayList<String> list = new ArrayList<>();

			for (WebElement element1 : WE1) {
				list.add(element1.getText());
			}
			ArrayList<String> unique = removeDuplicates(list);
			System.out.println("unique:" + unique.size());
			for (String element : unique) {
				System.out.println("element:" + element);

				String number = element;
				for (int j = 0; j < unique.size(); j++) {
					switch (number) {
					case "WEGO":
						if (element.equals("WEGO")) {

							List<WebElement> SWEGO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='WEGO']"));

							System.out.println("No of WEGO Trancation Successfull:" + SWEGO.size());
							String Com_TS_Wego1 = String.format("%1s", SWEGO.size());

							EG_CP_Wego = Integer.parseInt(Com_TS_Wego1);

						} else {
							String Com_TS_Wego1 = String.format("%1s", 0);

							EG_CP_Wego = Integer.parseInt(Com_TS_Wego1);
						}

						break;

					case "B2C":

						if (element.equals("B2C")) {
							List<WebElement> SB2C = driver.findElements(By
									.xpath(".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='B2C']"));

							System.out.println("No of B2C Trancation Successfull:" + SB2C.size());
							String Com_TS_b2c1 = String.format("%1s", SB2C.size());

							EG_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						} else {
							String Com_TS_b2c1 = String.format("%1s", 0);

							EG_CP_b2c = Integer.parseInt(Com_TS_b2c1);
						}

						break;
					case "MOBIOS":
						if (element.equals("MOBIOS")) {

							List<WebElement> SMOBIOS = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBIOS']"));

							System.out.println("No of MOBIOS Trancation Successfull:" + SMOBIOS.size());

							String Com_TS_MobIos1 = String.format("%1s", SMOBIOS.size());

							EG_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						} else {
							String Com_TS_MobIos1 = String.format("%1s", 0);

							EG_CP_MobIos = Integer.parseInt(Com_TS_MobIos1);
						}
						break;
					case "MOBAPP":
						if (element.equals("MOBAPP")) {
							List<WebElement> SMOBAPP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='MOBAPP']"));

							System.out.println("No of MOBAPP Trancation Successfull:" + SMOBAPP.size());

							String Com_TS_MobAnd1 = String.format("%1s", SMOBAPP.size());

							EG_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						} else {
							String Com_TS_MobAnd1 = String.format("%1s", 0);

							EG_CP_MobAnd = Integer.parseInt(Com_TS_MobAnd1);
						}

						break;
					case "SKYSCN":
						if (element.equals("SKYSCN")) {
							List<WebElement> SSKYSCN = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SKYSCN']"));

							System.out.println("No of SKYSCN Trancation Successfull:" + SSKYSCN.size());

							String Com_TS_skyscan1 = String.format("%1s", SSKYSCN.size());

							EG_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						} else {
							String Com_TS_skyscan1 = String.format("%1s", 0);

							EG_CP_skyscan = Integer.parseInt(Com_TS_skyscan1);
						}

						break;
					case "DHREHLAT":
						if (element.equals("DHREHLAT")) {
							List<WebElement> DHREHLAT = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DHREHLAT']"));

							System.out.println("No of DHREHLAT Trancation Successfull:" + DHREHLAT.size());

							String Com_TS_Dhrehlat1 = String.format("%1s", DHREHLAT.size());

							EG_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						} else {
							String Com_TS_Dhrehlat1 = String.format("%1s", 0);

							EG_CP_Dhrehlat = Integer.parseInt(Com_TS_Dhrehlat1);
						}
						break;
					case "AVIASALES":
						if (element.equals("AVIASALES")) {
							List<WebElement> AVIASALES = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='AVIASALES']"));

							System.out.println("No of AVIASALES Trancation Successfull:" + AVIASALES.size());

							String Com_TS_Aviasa1 = String.format("%1s", AVIASALES.size());

							EG_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);

						} else {
							String Com_TS_Aviasa1 = String.format("%1s", 0);

							EG_CP_Aviasa = Integer.parseInt(Com_TS_Aviasa1);
						}

						break;
					case "KAYAK":
						if (element.equals("KAYAK")) {
							List<WebElement> KAYAK = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='KAYAK']"));

							System.out.println("No of KAYAK Trancation Successfull:" + KAYAK.size());

							String Com_TS_Kayak1 = String.format("%1s", KAYAK.size());

							EG_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						else {
							String Com_TS_Kayak1 = String.format("%1s", 0);

							EG_CP_Kayak = Integer.parseInt(Com_TS_Kayak1);
						}

						break;
					case "DOHOP":
						if (element.equals("DOHOP")) {
							List<WebElement> DOHOP = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='DOHOP']"));

							System.out.println("No of DOHOP Trancation Successfull:" + DOHOP.size());

							String Com_TS_Dohop1 = String.format("%1s", DOHOP.size());

							EG_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						} else {
							String Com_TS_Dohop1 = String.format("%1s", 0);

							EG_CP_Dohop = Integer.parseInt(Com_TS_Dohop1);
						}

						break;
					case "FARECOMPARE":

						if (element.equals("FARECOMPARE")) {
							List<WebElement> FARECOMPARE = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='FARECOMPARE']"));

							System.out.println("No of FARECOMPARE Trancation Successfull:" + FARECOMPARE.size());

							String Com_TS_Farecompare1 = String.format("%1s", FARECOMPARE.size());

							EG_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						} else {

							String Com_TS_Farecompare1 = String.format("%1s", 0);

							EG_CP_Farecompare = Integer.parseInt(Com_TS_Farecompare1);
						}

						break;
					case "SHOOGLOO":
						if (element.equals("SHOOGLOO")) {
							List<WebElement> SHOOGLOO = driver.findElements(By.xpath(
									".//*[@id='searchresults']/div/div[2]/table/tbody/tr/td[11][text()='SHOOGLOO']"));

							System.out.println("No of SHOOGLOO Trancation Successfull:" + SHOOGLOO.size());

							String Com_TS_Shoogloo1 = String.format("%1s", SHOOGLOO.size());

							EG_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);

						} else {
							String Com_TS_Shoogloo1 = String.format("%1s", 0);

							EG_CP_Shoogloo = Integer.parseInt(Com_TS_Shoogloo1);
						}
						break;
					default:
						System.out.println("Not in 10, 20 or 30");

					}
				}
			}

			int TotalValue = EG_CP_Wego + EG_CP_b2c + EG_CP_MobIos + EG_CP_skyscan + EG_CP_MobAnd + EG_CP_Dhrehlat
					+ EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_conformation_pending_Total = TotalValue;
			System.out.println("Confirmation Pending total:::----" + EG_CP_conformation_pending_Total);

			int Other = EG_CP_Dhrehlat + EG_CP_Aviasa + EG_CP_Kayak + EG_CP_Dohop + EG_CP_Farecompare + EG_CP_Shoogloo;

			EG_CP_Other_conformation_pending = Other;
			System.out.println(" Others domains Confirmation Pending total :::----" + EG_CP_Other_conformation_pending);

			// COMTrancationSuccess= String.format("%30s %23s %20s %20d %20d
			// %25s %25s
			// ",tran,SWEGO.size(),SB2C.size(),SMOBIOS.size(),SMOBAPP.size(),SSKYSCN.size(),Com_TS_Transaction_Total);
		}

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
