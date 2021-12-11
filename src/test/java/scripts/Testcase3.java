package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillRrayLoginPage;
import pomPages.TwitterPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
	SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
	s.serachtextbox(pdata.getData("cousename"));
	s.serachbtn();
	
	CoursePage c=new CoursePage(driver);
	c.corejavacourse();
	
	TwitterPage t=new TwitterPage(driver);
	utilies.switchFrame(driver);
	t.playbutton();
	Thread.sleep(10000);
	t.pausebutton();
	utilies.switchBackframe(driver);
	t.twitterbutton();
	
	
	}

}
