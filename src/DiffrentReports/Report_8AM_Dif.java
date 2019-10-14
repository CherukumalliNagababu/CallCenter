package DiffrentReports;



import org.testng.annotations.Test;

import AppModules.Report8Am_diff;






public class Report_8AM_Dif {
	
	
	@Test
	public void Repricing_10AM() throws Exception
	{
		Report8Am_diff.Report_8_30AM();
		Report8Am_diff.deviation_Report_8AM();
		Report8Am_diff.html_table_for_8AM();
		
	}
	
}
