package AssignmentLabTask4;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodsAndLocators
{
	//All Locators
	@FindBy(how=How.ID,using="ta1")
	WebElement enteryourname;
	
	@FindBy(xpath="//*[ contains (text(), \"The cat was playing in the garden.\" ) ]")
	WebElement Fielddescription;
	
	
	
	@FindBy(xpath="//*[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//*[@type='password']")
	WebElement password;

	@FindBy(xpath="//*[@type='button']")
	WebElement login;
	
	@FindBy(xpath="//*[@id='table1']")
	WebElement table;
	
	@FindBy(id ="iframe1")
	WebElement frame1;
	
	@FindBy(id="iframe2")
	WebElement frame2;
	
	
	@FindBy(name="userid")
	WebElement username1;
	
	@FindBy(name="pswrd")
	WebElement pasword2;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement login2;
	
	
	@FindBy(xpath="//option[@value='audix']")
	WebElement Audi;
	
	@FindBy(xpath="//select[@id='drop1']")
	WebElement dropdown;
	
	@FindBy(xpath="//input[@name='fname']")
	WebElement clearandwrite;
	
	@FindBy(id="but2")
	WebElement clickonEnableButton;
	
	@FindBy(xpath="//*[@name='samename'][1]")
	WebElement clickonSubmitButton;
	
	@FindBy(xpath="//*[@name='samename'][1]")
	WebElement clickonLoginButton;
	
	@FindBy(xpath="//*[@name='samename'][1]")
	WebElement clickonRegisterButton;
	
	@FindBy(id="alert2")
	WebElement RemoveText;
	
	@FindBy(xpath="//button[text()='Try it']")
	WebElement clickontryitButton;
	
	@FindBy(xpath="//*[contains(text(),'Double click Here')]")
	WebElement clickondoubleclick;
	
	@FindBy(xpath="//button[text()='Check this']")
	WebElement checkthisButton;
	
	@FindBy(xpath="//a[text()='Open a popup window']")
	WebElement popupbutton;
	
	@FindBy(xpath="//input[@id='dte']")
	WebElement enablethebox;
	
	@FindBy(xpath="//body")
	WebElement fullbody;
	
	@FindBy(xpath="//input[@id='radio1']")
	WebElement clickradiobutton;
	
	@FindBy(xpath="//input[@id='alert1']")
	WebElement clickalerthandle;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	WebElement selectthebluecolor;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	WebElement deselecttheorange;
	
	@FindBy(xpath="//input[@id='rotb']")
	WebElement Displaythereadtext;
	
	@FindBy(xpath="//input[@id='prompt']")
	WebElement clickgetthepromt;
	
	@FindBy(xpath="//input[@id='confirm']")
	WebElement clickgetconfirmation;
	
	@FindBy(xpath="//div[@id='HTML24']/child::div/input[@class='classone']")
	WebElement boxOne;
	
	@FindBy(xpath="//div[@id='HTML28']/child::div/input[@class='classone")
	WebElement boxtwo;
	
	@FindBy(xpath="//input[@value='Car']")
	WebElement clickoncar;
	
	@FindBy(xpath="//input[@value='Book']")
	WebElement clickonbook;
	
	@FindBy(xpath="//input[@value='Bag']")
	WebElement deselectthebag;
	
	@FindBy(xpath="//button[@class='dropbtn']")
	WebElement selectthedropdown;
	

	
	@FindBy(xpath="//a[text()='Facebook']")
	WebElement selectthefacebook;
//ALL Methods
	WebDriver driver;
	
	MethodsAndLocators(WebDriver driver1){
		driver=driver1;
		PageFactory.initElements(driver1,this);}
public void Task1Writethename(String yourname) throws InterruptedException {
		enteryourname.sendKeys(yourname);
		Thread.sleep(4000);
		Assert.assertNotNull(enteryourname);}
public void Task1WriteYourDescription(String description1) throws InterruptedException {
	Fielddescription.getText();
	Fielddescription.clear();
	Fielddescription.sendKeys(description1);;
    	Thread.sleep(4000);
    	Assert.assertNotNull(Fielddescription);
    	driver.close();}
public void Task2Viewtable() throws Exception {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	int rowCount=driver.findElements(By.tagName("tr")).size();
	int ColumnCount=driver.findElements(By.xpath("//table/thead/tr/th")).size();
	System.out.println("Rows are : " + rowCount);
	System.out.println("Coulums are : " + ColumnCount);
	Thread.sleep(200);
	for(WebElement tabledata: driver.findElements(By.tagName("tr")))
	{
		System.out.println(tabledata.getText());
	}
	
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456789");
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[@type='button']")).click();
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	Thread.sleep(2000);
}
	public void Task2LoginFirstTime(String Entername1,String Enterpasword1) {
	    username.sendKeys(Entername1);	
	    password.sendKeys(Enterpasword1);
	    login.click();		
	    assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	    driver.close();
	
		List<WebElement> numberofrows=table.findElements(By.tagName("tr"));
   		List<WebElement> headings=table.findElements(By.tagName("th"));
   		for(int i=0;i<headings.size();i++) {
   			System.out.print(headings.get(i).getText()+"  ");}
   		for(int i=0;i<numberofrows.size();i++) {
   			List<WebElement>  coloms= numberofrows.get(i).findElements(By.tagName("td"));
   			
   			for(int j=0;j<coloms.size();j++) {
   				System.out.print(coloms.get(j).getText()+"  ");
   			}
   			System.out.println("  ");}}
public void Task3Windowframes() throws InterruptedException {
		
		Actions action1 =new Actions(driver);
    	action1.sendKeys(Keys.PAGE_DOWN).build().perform();
    	action1.sendKeys(Keys.PAGE_DOWN).build().perform(); 
   		String Mainwindow=driver.getWindowHandle();
   		driver.switchTo().frame(frame1);
   		Thread.sleep(2000);
   		driver.switchTo().window(Mainwindow);
   		Thread.sleep(2000);
   		driver.switchTo().frame(frame2);
   		Thread.sleep(2000);
   		driver.switchTo().window(Mainwindow);
   		Thread.sleep(2000);
   		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
   			}
public void Task3loginSeconedTime(String Entername2,String Enterpasword2) throws InterruptedException {
	     username1.sendKeys(Entername2);
	     pasword2.sendKeys(Enterpasword2);
	     login2.click();
		 Thread.sleep(2000);
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		 driver.close();
}	
public void Task4AudixCar1() throws InterruptedException {
	    Audi.click();
		String text=Audi.getText();
		assertEquals("Audi", text);
	}
public void Task4Selectdropdown1() throws InterruptedException {
		Select select= new Select(dropdown);
		Thread.sleep(2000);
		select.selectByVisibleText("doc 1");
		Thread.sleep(2000);
		String selectedoption = select.getFirstSelectedOption().getText();
		
		assertEquals("doc 1",selectedoption );}
public void Task4ClearAndWrite(String writedown) throws InterruptedException {
		clearandwrite.clear();
		Thread.sleep(3000);
		clearandwrite.sendKeys(writedown);
		Thread.sleep(3000);
		Assert.assertNotNull(clearandwrite);}
public void Task4ClickOnEnableButton() throws InterruptedException {
		clickonEnableButton.click();
		Thread.sleep(3000);
		String text=clickonEnableButton.getText();
		assertEquals("Button2", text);}	
public void Task4clicikonSubmitButton() throws InterruptedException {
		clickonSubmitButton.click();
		Thread.sleep(2000);
		String text=clickonSubmitButton.getText();
		assertEquals("Submit", text);}	
public void Task4clicikonLoginButton() throws InterruptedException{
		clickonLoginButton.click();
		Thread.sleep(2000);
		String text=clickonLoginButton.getText();
		assertEquals("Login", text);}
public void Task4clickonRegisterButton() throws InterruptedException {
		clickonRegisterButton.click();
		Thread.sleep(2000);
		String text=clickonRegisterButton.getText();
		assertEquals("Register", text);}
public void Task4RemoveText() throws InterruptedException {
			    RemoveText.click();
		Thread.sleep(2000);
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		driver.switchTo().alert().accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");}
public void Task4PopUpButtonClick() throws InterruptedException {
	String Mainwindow=driver.getWindowHandle();
	driver.switchTo().window(Mainwindow);
	driver.findElement(By.linkText("Open a popup window")).click();
	java.util.Set<String> windows=driver.getWindowHandles();
	Iterator<String> iterator = windows.iterator();
	while(iterator.hasNext()) {
		String window = iterator.next();
		driver.switchTo().window(window);
		if(driver.getTitle().equals("Basic Web Page Title")) {
			String text=driver.findElement(By.xpath("//*[body]")).getText();
			System.out.println(text);
			driver.close();}
		driver.switchTo().window(Mainwindow);
	}}
public void Task4clickontryitButton() throws InterruptedException {
		clickontryitButton.click();
		Thread.sleep(5000);
		Assert.assertFalse(clickontryitButton.isEnabled());
		}
	public void Task4DoubleClick() throws InterruptedException {
		Actions action2 = new Actions(driver);
		Thread.sleep(2000);
		action2.doubleClick(clickondoubleclick).perform();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
public void Task4checkthisButton() throws InterruptedException {
		checkthisButton.click();
		Thread.sleep(12000);
		enablethebox.click();
		Assert.assertTrue(checkthisButton.isEnabled());
		driver.close();
	}
	public void Task5clickradiobutton() throws InterruptedException {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		clickradiobutton.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radio1']"))).isEnabled();
		Assert.assertTrue(clickradiobutton.isEnabled());
	}
	public void Task5clickalerthandle() throws InterruptedException {
		clickalerthandle.click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	public void Task5selectthebluecolor() throws InterruptedException {
		selectthebluecolor.click();
		Thread.sleep(3000);
		deselecttheorange.click();
		Thread.sleep(3000);
		Assert.assertTrue(selectthebluecolor.isEnabled());
	}
	public void Task5Displaythereadthetext() throws InterruptedException {
		Displaythereadtext.isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(Displaythereadtext.isDisplayed());
	}
	public void Task5clickgetthepromt() throws InterruptedException {
		clickgetthepromt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Noman Sharif");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	public void Task5clickgetconfirmation() throws InterruptedException {
		clickgetconfirmation.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	public void Task5clickonbox1(String box1) throws InterruptedException {
		boxOne.sendKeys(box1);
		Thread.sleep(3000);
		Assert.assertNotNull(boxOne);
	}
	public void Task5clcickonbox2(String box2) throws InterruptedException {
		boxtwo.sendKeys(box2);
		Thread.sleep(3000);
		Assert.assertNotNull(boxtwo);	
	}
	public void Task5clickoncar() throws InterruptedException {
		clickoncar.click();
		Thread.sleep(3000);
		Assert.assertTrue(clickoncar.isEnabled());
	}
	public void Task5deselectbag() throws InterruptedException {
		Actions action3 = new Actions(driver);
		action3.doubleClick(clickonbook).perform();
		Thread.sleep(2000);
		deselectthebag.click();
		Thread.sleep(2000);
		clickonbook.click();
		Thread.sleep(2000);
		Assert.assertTrue(clickonbook.isEnabled());	
	}
	public void Task5Selectdropdown() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		selectthedropdown.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']"))).isDisplayed();
		//Thread.sleep(7000);
		selectthefacebook.click();
		assertEquals(driver.getTitle(), "Facebook – log in or sign up");	
	}

}
	
	
