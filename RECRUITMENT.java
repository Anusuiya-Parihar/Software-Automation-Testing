package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RECRUITMENT {
	@FindBy(how = How.XPATH, using="//b[contains(text(),'Recruitment')]")
	WebElement rc;
	
	@FindBy(how = How.NAME, using="candidateSearch[candidateName]")
	WebElement cn;
	
	@FindBy(how = How.XPATH, using="//select[@id='candidateSearch_jobTitle']")
	WebElement dp1;
	
	@FindBy(how = How.ID, using="candidateSearch_jobVacancy")
	WebElement dp2;
	
	@FindBy(how = How.ID, using="candidateSearch_hiringManager")
	WebElement gp;
	
	@FindBy(how = How.XPATH, using="//select[@id='candidateSearch_status']")
	WebElement dp4;
	
	@FindBy(how = How.ID, using="candidateSearch_fromDate")
	WebElement fd;
	
	@FindBy(how = How.ID, using="candidateSearch_modeOfApplication")
	WebElement ma;
	
	@FindBy(how = How.ID, using="btnSrch")
	WebElement sc;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Download')]")
	WebElement dw;
	
	@FindBy(how = How.ID, using="btnRst")
	WebElement rs;
	
	@FindBy(how = How.ID, using="btnAdd")
	WebElement ad;
	
	@FindBy(how = How.ID, using="addCandidate_firstName")
	WebElement fn;
	
	@FindBy(how = How.ID, using="addCandidate_lastName")
	WebElement ln;
	
	@FindBy(how = How.ID, using="addCandidate_email")
	WebElement em;
	
	@FindBy(how = How.ID, using="btnSave")
	WebElement sv;
	
	@FindBy(how = How.ID, using="btnSave")
	WebElement ed;
	
	@FindBy(how = How.ID, using="addCandidate_firstName")
	WebElement fs1;
	
	@FindBy(how = How.ID, using="btnBack")
	WebElement cl;
	
	@FindBy(how = How.ID, using="btnBack")
	WebElement cl1;
	
	@FindBy(how = How.NAME, using="chkSelectRow[]")
	WebElement vac;

	@FindBy(how = How.CLASS_NAME, using="delete")
	WebElement de;
	
	@FindBy(how = How.CLASS_NAME, using="btn")
	WebElement ok;


	public void button() throws InterruptedException {
		// TODO Auto-generated method stub
		rc.click();
		Select unit1=new Select(dp1);
		unit1.selectByIndex(0);
		Thread.sleep(3000);
		Select unit2=new Select(dp2);
		unit2.selectByVisibleText("Senior Support Specialist");
		Thread.sleep(3000);
	    Select unit3=new Select(gp);
		unit3.selectByVisibleText("Dominic Chase");
		Thread.sleep(3000);
		Select unit4=new Select(dp4);
		unit4.selectByIndex(1);
		Thread.sleep(3000);
		cn.sendKeys("Chris Harris");
		fd.click();
		fd.sendKeys("2020-10-06");
	    Thread.sleep(2000);
		Select unit5=new Select(ma);
		unit5.selectByIndex(1);
		Thread.sleep(2000);
		sc.click();
		Thread.sleep(2000);
		dw.click();
		Thread.sleep(2000);
		rs.click();
		Thread.sleep(2000);
		ad.click();
		Thread.sleep(2000);
		fn.sendKeys("Chris");
		ln.sendKeys("Harris");
		em.sendKeys("ch@gmail.com");
		Thread.sleep(2000);
		sv.click();
		Thread.sleep(2000);
		ed.click();
		fs1.sendKeys("Anu");
		Thread.sleep(2000);
	    cl.click();
	    Thread.sleep(2000);
	    cl1.click();
	    Thread.sleep(2000);
	    vac.click();
		Thread.sleep(2000);
        de.click();
		Thread.sleep(2000);
        ok.click();
		Thread.sleep(2000);
	}
}
	

		
