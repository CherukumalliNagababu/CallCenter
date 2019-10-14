package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_4PM {
	
	
	@Test
	public void Repricing_4PM() throws Exception
	{
		CalculationMail.Report_Generate_Time("04 PM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
