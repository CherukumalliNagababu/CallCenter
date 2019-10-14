package DiffrentReports;




import org.testng.annotations.Test;

import AppModules.Report12Pm_diff;
import AppModules.Report2PM_diff;




public class Report_2PM_Dif {
	
	
	@Test
	public void different_Report_2PM() throws Exception
	{
		Report2PM_diff.Report_2_30PM();
		Report2PM_diff.Report_12_30PM();
		Report2PM_diff.Report_10_30AM();
		Report2PM_diff.Report_8_30AM();
		Report2PM_diff.deviation_Report_2PM();
		Report2PM_diff.html_table_for_2PM();
		
	}
	
}
