package DiffrentReports;




import org.testng.annotations.Test;

import AppModules.Report2PM_diff;
import AppModules.Report4PM_diff;







public class Report_4PM_Dif {
	
	
	@Test
	public void different_Report_4PM() throws Exception
	{
		Report4PM_diff.Report_4_30PM();
		Report4PM_diff.Report_2_30PM();
		Report4PM_diff.Report_12_30PM();
		Report4PM_diff.Report_10_30AM();
		Report4PM_diff.Report_8_30AM();
		Report4PM_diff.deviation_Report_4PM();
		Report4PM_diff.html_table_for_4PM();
		
	}
	
}
