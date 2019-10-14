package DiffrentReports;

import org.testng.annotations.Test;

import AppModules.Report_yesterday_diff;



public class Report_Yesterday_Dif {

	@Test
	public void different_Yesterday_Report() throws Exception {
		Report_yesterday_diff.Yesterday_Report();
		Report_yesterday_diff.yesterday_deviation_Report();
		Report_yesterday_diff.html_table_for_Yesterday();
		
		

	}

}
