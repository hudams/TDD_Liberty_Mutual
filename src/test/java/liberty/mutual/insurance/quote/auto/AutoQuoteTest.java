package liberty.mutual.insurance.quote.auto;

import org.testng.annotations.Test;

import liberty.mutual.insurance.base.TestBase;

public class AutoQuoteTest extends TestBase{

	@Test
	public void getAutoQuoteTst() {
		homePage.inputZipCode("12345");
		homePage.clickGetMyPrice();
	}
}
