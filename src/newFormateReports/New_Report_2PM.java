package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_2PM {
	
	
	@Test
	public void Repricing_2PM() throws Exception
	{
		CalculationMail.Report_Generate_Time("02 PM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
