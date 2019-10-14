package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_8PM {
	
	
	@Test
	public void Repricing_8PM() throws Exception
	{
		CalculationMail.Report_Generate_Time("08 PM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
