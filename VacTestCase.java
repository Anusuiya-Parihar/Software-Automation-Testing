package pages;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VacTestCase extends Browser_Factory{
@Test
public static void Vacancies() throws InterruptedException {
	Vacancies v=PageFactory.initElements(driver,Vacancies.class);
	v.button1();
	
	
		}
}



