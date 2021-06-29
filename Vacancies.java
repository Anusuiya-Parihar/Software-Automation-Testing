package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Vacancies {
	@FindBy(how = How.XPATH, using="//b[contains(text(),'Recruitment')]")
	WebElement rc;
	@FindBy(how = How.ID, using="menu_recruitment_viewJobVacancy")
	WebElement jv;
	@FindBy(how = How.ID, using="vacancySearch_jobTitle")
	WebElement jt;
	@FindBy(how = How.NAME, using="vacancySearch[jobVacancy]")
	WebElement vc;
	@FindBy(how = How.ID, using="vacancySearch_hiringManager")
	WebElement hm;
	@FindBy(how = How.ID, using="vacancySearch_status")
	WebElement ss;
	@FindBy(how = How.ID, using="btnSrch")
	WebElement sc;
	@FindBy(how = How.ID, using="btnRst")
	WebElement rs;
	@FindBy(how = How.ID, using="btnAdd")
	WebElement ad;
	@FindBy(how = How.ID, using="addJobVacancy_jobTitle")
	WebElement j;
	@FindBy(how = How.NAME, using="addJobVacancy[name]")
	WebElement vn;
	@FindBy(how = How.ID, using="addJobVacancy_hiringManager")
	WebElement hr;
	@FindBy(how = How.NAME, using="btnSave")
	WebElement bs;
	@FindBy(how = How.NAME, using="btnSave")
	WebElement ed;
	@FindBy(how = How.NAME, using="addJobVacancy[description]")
	WebElement ds;
	@FindBy(how = How.NAME, using="btnSave")
	WebElement s;
	@FindBy(how = How.ID, using="btnAddAttachment")
	WebElement add;
	@FindBy(how = How.ID, using="cancelButton")
	WebElement cc;
	@FindBy(how = How.NAME, using="btnBack")
	WebElement ba;
	@FindBy(how = How.XPATH, using="//input[@id='ohrmList_chkSelectRecord_2']")
	WebElement vac;
	@FindBy(how = How.CLASS_NAME, using="delete")
	WebElement de;
	@FindBy(how = How.CLASS_NAME, using="btn")
	WebElement ok;
	
	
	public void button1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		rc.click();
	
		jv.click();
	
	
		Select unit1=new Select(jt);
		unit1.selectByVisibleText("Software Engineer");
		Thread.sleep(2000);
		
		Select unit2=new Select(vc);
		unit2.selectByIndex(1);
		Thread.sleep(2000);
	   
		Select unit3=new Select(hm);
		unit3.selectByIndex(1);
		Thread.sleep(2000);
	   
		Select unit5=new Select(ss);
		unit5.selectByIndex(1);
		Thread.sleep(2000);
		
		sc.click();
		Thread.sleep(2000);

		rs.click();
		Thread.sleep(2000);

		ad.click();
		Thread.sleep(2000);

		Select unit4=new Select(j);
		unit4.selectByVisibleText("QA Lead");
		Thread.sleep(2000);
		
		vn.sendKeys("Senior Team Lead");
		
		
		hr.sendKeys("Odis Adalwin");
		
		bs.click();
		Thread.sleep(2000);
		
		ed.click();
		Thread.sleep(2000);
		
		ds.sendKeys("Experienced");
		Thread.sleep(2000);
		
		s.click();
		Thread.sleep(2000);

		add.click();
		Thread.sleep(2000);

		cc.click();
		Thread.sleep(2000);

		ba.click();
		Thread.sleep(2000);

		vac.click();
		Thread.sleep(2000);

		de.click();
		Thread.sleep(2000);

		ok.click();
		Thread.sleep(2000);

	}
		 
}
