package DiffrentReports;



import org.testng.annotations.Test;

import AppModules.Report10Am_diff;




public class Report_10AM_Dif {
	
	
	@Test
	public void Repricing_10AM() throws Exception
	{
		Report10Am_diff.Report_10_30AM();
		Report10Am_diff.Report_8_30AM();
		Report10Am_diff.deviation_Report_10AM();
		Report10Am_diff.html_table_for_10AM();
		
	}
	
}
