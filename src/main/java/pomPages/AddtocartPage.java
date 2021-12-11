package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plus;
	
	public WebElement getPlus() {
		return plus;
	}

	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cart;
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public void cartbtn() {
		cart.click();
	}
}
