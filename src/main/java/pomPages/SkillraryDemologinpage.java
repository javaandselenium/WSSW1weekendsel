package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemologinpage {
	
	public WebElement getCoursetab() {
		return coursetab;
	}

	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement selenimtraining;
	
	
	@FindBy(name="addresstype")
	private WebElement testingdd;
	
	public WebElement getTestingdd() {
		return testingdd;
	}

	public SkillraryDemologinpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtrainingtab() {
		selenimtraining.click();
	}
	

}
