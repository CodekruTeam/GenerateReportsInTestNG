package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CodekruTest {

	@Test
	public void test() {
		int a = 5;
		int b = 6;
		int c = 11;

		System.setProperty("org.uncommons.reportng.escape-output", "false");

		Reporter.log("Executing the test<br>"); // this will appear in our report
		Assert.assertTrue((a + b) == c);
		String message = "<font color = 'green'>" + "Test is successfully executed" + "</font>";
		Reporter.log(message); // this will also appear in our report but in green color
	}

}
