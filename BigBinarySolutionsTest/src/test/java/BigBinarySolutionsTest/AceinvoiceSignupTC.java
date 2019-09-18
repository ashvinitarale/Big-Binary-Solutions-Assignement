/**
 * 
 */
package BigBinarySolutionsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BigBinarySolutionsPage.AceinvoicePage;

/**
 * @author ashvinitarale
 *
 */
public class AceinvoiceSignupTC {

	public static void main(String args[]) {

		AceinvoicePage aceinvoicePage = null;
		WebDriver chromeDriver = null;
		System.setProperty("webdriver.chrome.driver",
				"/Users/ashvinitarale/project/Big Binary Solutions Assignment/BigBinarySolutionsTest/chromedriver");
		chromeDriver = new ChromeDriver();

		aceinvoicePage = new AceinvoicePage(chromeDriver);
		chromeDriver.get("https://staging.aceinvoice.com/sign_in");
		aceinvoicePage.clickOnSignUpLink();

		String email = aceinvoicePage.enterSignupEmailId();
		aceinvoicePage.enterPassword();
		aceinvoicePage.enterBasicDetails();
		aceinvoicePage.enterOrgDetails();
		aceinvoicePage.clickOnContinueToAppBtn();

	}

}
