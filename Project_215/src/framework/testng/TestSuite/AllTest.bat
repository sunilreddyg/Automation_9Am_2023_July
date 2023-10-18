set projectLocation=D:\24th_July_2023_9Am\Project_215\src\framework\
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
