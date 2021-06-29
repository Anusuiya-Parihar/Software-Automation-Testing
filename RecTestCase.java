package pages;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RecTestCase extends Browser_Factory{
@Test
public static void RECRUITMENT() throws InterruptedException {
	RECRUITMENT lp=PageFactory.initElements(driver,RECRUITMENT.class);
	lp.button();
	
	
		}
}



