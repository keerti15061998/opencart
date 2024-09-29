package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='last_name']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='user_login']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='user_email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='user_pass']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='user_confirm_password']")
	WebElement txtCnfPassword;

	@FindBy(xpath = "//textarea[@id='description']")
	WebElement txtBio;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement btnSubmit;

	@FindBy(xpath = "//ul[normalize-space()='User successfully registered.']")
	WebElement Confirmationmsg;

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setCnfPassword(String cnfpwd) {
		txtCnfPassword.sendKeys(cnfpwd);
	}

	public void setBio(String bio) {
		txtBio.sendKeys(bio);
	}

	public void clickSubmit() {
		btnSubmit.click();
	}

	public String getConfirmationMsg() {
		try {
			return (Confirmationmsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
