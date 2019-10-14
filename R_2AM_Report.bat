set projectLocation=D:\WorkSpacess\OctWorkSpace\CallCenter_RE
cd %projectLocation%
set classpath=%projectLocation%\bin;D:\jarfiles\*
java org.testng.TestNG %projectLocation%\Repricing_2_AM.xml
