package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	void verify_account_registration() {

		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setUserName(randomeString());
		regpage.setEmail(randomeString() + "@gmail.com");
		String password = randomeNumber();
		regpage.setPassword(password);
		regpage.setCnfPassword(password);
		regpage.setBio(randomeString() + "Lucknow");
		regpage.clickSubmit();

		String cnf = regpage.getConfirmationMsg();
		Assert.assertEquals(cnf, "User successfully registered.");
	}

}
