package DiffrentReports;

import org.testng.annotations.Test;

import AppModules.Report10PM_diff;
import AppModules.Report8PM_diff;

public class Report_10PM_Dif {

	@Test
	public void different_Report_8PM() throws Exception {
		Report10PM_diff.Report_10_30PM();
		Report10PM_diff.Report_8_30PM();
		Report10PM_diff.Report_6_30PM();
		Report10PM_diff.Report_4_30PM();
		Report10PM_diff.Report_2_30PM();
		Report10PM_diff.Report_12_30PM();
		Report10PM_diff.Report_10_30AM();
		Report10PM_diff.Report_8_30AM();
		Report10PM_diff.deviation_Report_10PM();
		Report10PM_diff.html_table_for_10PM();

	}

}
