package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillRrayLoginPage;
import pomPages.SkillraryDemologinpage;

public class Testcase1 extends BaseClass{
@Test
public void tc1() {
SkillRrayLoginPage s=new SkillRrayLoginPage(driver);
s.gearsButton();
s.skillrarydemoapp();

utilies.switchTabs(driver);
SkillraryDemologinpage d=new SkillraryDemologinpage(driver);
utilies.mouseHover(driver,d.getCoursetab());
d.seleniumtrainingtab();

AddtocartPage a=new AddtocartPage(driver);
utilies.doubleClick(driver,a.getPlus());
a.cartbtn();
utilies.alertPopupOk(driver);



	
}

}
