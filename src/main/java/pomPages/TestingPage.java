package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement mycart;
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getMycart() {
		return mycart;
	}
	
	public void facebookicon() {
		facebook.click();
	}
	

}
