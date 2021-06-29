package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginTestCase extends Browser_Factory{
@Test
public static void login() {
	Login lp=PageFactory.initElements(driver,Login.class);
	lp.loginbutton("Admin","admin123");
}
}
