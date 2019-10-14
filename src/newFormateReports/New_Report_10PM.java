package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_10PM {
	
	
	@Test
	public void Repricing_10PM() throws Exception
	{
		CalculationMail.Report_Generate_Time("10 PM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
