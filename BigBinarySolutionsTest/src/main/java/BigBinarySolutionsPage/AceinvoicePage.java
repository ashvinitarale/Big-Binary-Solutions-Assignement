/**
 * 
 */
package BigBinarySolutionsPage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author ashvinitarale
 *
 */
public class AceinvoicePage {

	WebDriver webDriver;
	public String email = null;

	public AceinvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		webDriver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@href='/sign_up']")
	private WebElement signupbutton;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email Address']")
	private WebElement signupEmailId;

	@FindBy(how = How.XPATH, using = "//input[@name='get_started']")
	private WebElement getStartedButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"new_user\"]/div/div[1]/div[1]/input")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"new_user\"]/div/div[1]/div[2]/input")
	private WebElement passwordConfirmation;

	@FindBy(how = How.CLASS_NAME, using = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='user[first_name]']")
	private WebElement firstName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='user[last_name]']")
	private WebElement lastName;

	@FindBy(how = How.CLASS_NAME, using = "commit")
	private WebElement continueCommit;

	@FindBy(how = How.CLASS_NAME, using = "name")
	private WebElement OrgName;

	@FindBy(how = How.CLASS_NAME, using = "email")
	private WebElement OrgEmail;

	@FindBy(how = How.CLASS_NAME, using = "skip-step")
	private WebElement skipStepButton;

	@FindBy(how = How.XPATH, using = "//button[@text()='Continue to the app']]")
	private WebElement Continuetotheapp;

	@FindBy(how = How.XPATH, using = "//*[@id=\"team-members\"]/tbody/tr/td[2]/a")
	private WebElement registerUsername;

	@FindBy(how = How.XPATH, using = "//*[@id=\"team-members\"]/tbody/tr/td[3]")
	private WebElement registerEmailId;

	public void clickOnSignUpLink() {
		signupbutton.click();
	}

	public String enterSignupEmailId() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		email = "ashvini.tarale+" + randomInt + "@gmail.com";
		signupEmailId.sendKeys(email);
		// Click on Get Started Button
		getStartedButton.click();
		return email;
	}

	public void enterPassword() {
		password.sendKeys("xyz@123");
		passwordConfirmation.sendKeys("xyz@123");
		// Click on continue button
		continueButton.click();
	}

	public void enterBasicDetails() {
		firstName.sendKeys("fn");
		lastName.sendKeys("ln");
		continueCommit.click();
	}

	public void enterOrgDetails() {
		OrgName.sendKeys("org name");
		OrgEmail.sendKeys("test@test.com");
		// Click on continue button
		skipStepButton.click();
	}

	public void clickOnContinueToAppBtn() {
		Continuetotheapp.click();

	}

	public String getRegisterUserName() {
		return registerUsername.getText();
	}

	public String getRegisterEmailId() {
		return registerEmailId.getText();
	}

}
