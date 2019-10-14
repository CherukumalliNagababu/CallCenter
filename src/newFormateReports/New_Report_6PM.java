package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_6PM {
	
	
	@Test
	public void Repricing_6PM() throws Exception
	{
		CalculationMail.Report_Generate_Time("06 PM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
