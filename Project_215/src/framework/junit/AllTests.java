package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
		({ 
			Before_And_AfterMethod.class, 
			BeforeClass_And_AfterClass.class, 
			IgnoreAllTests.class, 
			IgnoreTest.class,
		    Junit_Assertions.class, 
		    Junit_WebDriver_Test.class, 
		    Junit_With_Extent_Reports.class, 
		    MyJunitTest.class
		  })
public class AllTests 
{

}
