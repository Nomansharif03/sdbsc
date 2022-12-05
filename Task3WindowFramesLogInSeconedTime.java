package AssignmentLabTask4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3WindowFramesLogInSeconedTime 
{
	
	WebDriver driver=new ChromeDriver();
	MethodsAndLocators object =new MethodsAndLocators(driver);
	@Test(description="Switch frames ",priority=1)
   	public void Task3() throws InterruptedException {
		driver.get("https://omayo.blogspot.in/");
    	object.Task3Windowframes();}
	 @Test(description="Enter Name and Password Agian and Handle the Alert ",priority=2)
		public void Task3EnterNameandPasswordAgianandHandletheAlert() throws InterruptedException {
		 driver.get("https://omayo.blogspot.in/");
			object.Task3loginSeconedTime("asaddd", "fghggh");}}