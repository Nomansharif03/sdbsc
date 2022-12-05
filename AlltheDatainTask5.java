package AssignmentLabTask4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlltheDatainTask5 {

	WebDriver driver=new ChromeDriver();
	MethodsAndLocators object =new MethodsAndLocators(driver);
	
	@Test(description="All the Data given  in Task5")
	public void AlltheDatagiveninTask5() throws InterruptedException {
		driver.get("https://omayo.blogspot.in/");
		object.Task5clickradiobutton();
		object.Task5clickalerthandle();
		object.Task5selectthebluecolor();
		object.Task5Displaythereadthetext();
		object.Task5clickgetthepromt();
		object.Task5clickgetconfirmation();
		object.Task5clickonbox1("Noman");
		object.Task5clcickonbox2("Sharif");
		object.Task5clickoncar();
		object.Task5deselectbag();
		object.Task5Selectdropdown();}}