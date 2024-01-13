set projectLocation=C:\Users\Pallavi\eclipse-workspace\GrotechMind_WeekDay_TestNG
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNg%projectLocation%\CrossBrowsertestng.xml
pause