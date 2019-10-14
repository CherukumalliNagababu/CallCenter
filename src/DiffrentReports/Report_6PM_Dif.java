package DiffrentReports;




import org.testng.annotations.Test;

import AppModules.Report4PM_diff;
import AppModules.Report6PM_diff;







public class Report_6PM_Dif {
	
	
	@Test
	public void different_Report_6PM() throws Exception
	{
		Report6PM_diff.Report_6_30PM();
		Report6PM_diff.Report_4_30PM();
		Report6PM_diff.Report_2_30PM();
		Report6PM_diff.Report_12_30PM();
		Report6PM_diff.Report_10_30AM();
		Report6PM_diff.Report_8_30AM();
		Report6PM_diff.deviation_Report_6PM();
		Report6PM_diff.html_table_for_6PM();
		
	}
	
}
