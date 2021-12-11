package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRrayLoginPage {
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
    private WebElement skillrarydemo;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement go;
	
	
	public SkillRrayLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton() {
		gerasbtn.click();
	}
	
	
	public void skillrarydemoapp() {
		skillrarydemo.click();
	}
	
	public void serachtextbox(String name) {
		serachtb.sendKeys(name);
	}
	
	public void serachbtn() {
		go.click();
	}
	
	
	
	
}
