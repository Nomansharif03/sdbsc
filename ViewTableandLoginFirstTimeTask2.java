package AssignmentLabTask4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewTableandLoginFirstTimeTask2 {
	WebDriver driver=new ChromeDriver();
	MethodsAndLocators object =new MethodsAndLocators(driver);
	 @Test(description="View the table",priority =1)
	public void PrinttheTable() throws Exception {
		driver.get("https://omayo.blogspot.in/");
   		object.Task2Viewtable();
   		}
	 @Test(description="Enter Name and Password",priority=2)
		public void Task2LoginFirstTime() throws InterruptedException {
		 	driver.get("https://omayo.blogspot.in/");
			object.Task2LoginFirstTime("nomansharif03@gmail.com","123456789");}}