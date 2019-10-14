package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_10AM {
	
	
	@Test
	public void Repricing_10AM() throws Exception
	{
		CalculationMail.Report_Generate_Time("10 AM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
