set projectLocation=D:\WorkSpacess\OctWorkSpace\CallCenter_RE
cd %projectLocation%
set classpath=%projectLocation%\bin;D:\jarfiles\*
java org.testng.TestNG %projectLocation%\Flights_Daily_Report.xml
