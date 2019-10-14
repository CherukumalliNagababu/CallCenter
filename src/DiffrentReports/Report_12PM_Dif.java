package DiffrentReports;




import org.testng.annotations.Test;

import AppModules.Report10Am_diff;
import AppModules.Report12Pm_diff;




public class Report_12PM_Dif {
	
	
	@Test
	public void different_Report_12PM() throws Exception
	{
		
		Report12Pm_diff.Report_12_30PM();
		Report12Pm_diff.Report_10_30AM();
		Report12Pm_diff.Report_8_30AM();
		Report12Pm_diff.deviation_Report_12PM();
		Report12Pm_diff.html_table_for_12PM();
		
	}
	
}
