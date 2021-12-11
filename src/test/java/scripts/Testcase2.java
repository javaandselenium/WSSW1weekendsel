package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.FacebookPage;
import pomPages.SkillRrayLoginPage;
import pomPages.SkillraryDemologinpage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		utilies.switchTabs(driver);
		SkillraryDemologinpage d=new SkillraryDemologinpage(driver);
		utilies.dropdown(d.getTestingdd(),pdata.getData("dd"));
		
		TestingPage t=new TestingPage(driver);
		utilies.dragdrop(driver,t.getSeleniumtraining(),t.getMycart());
		t.facebookicon();
		
		FacebookPage fb=new FacebookPage(driver);
		fb.likebtn();
		
		
	}

}
