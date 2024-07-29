package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void testcase() {
		Reporter.log("my first test",true);
		Reporter.log("hi");
	}

}
