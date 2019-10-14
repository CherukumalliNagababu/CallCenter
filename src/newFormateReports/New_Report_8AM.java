package newFormateReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;
import newFormateData.CalculationMail;






public class New_Report_8AM {
	
	
	@Test
	public void Repricing_8AM() throws Exception
	{
		CalculationMail.Report_Generate_Time("08 AM");
		CalculationMail.html_table_Report();
		
		
	}
	
}
