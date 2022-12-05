package AssignmentLabTask4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.api.logs.Logger;

public class Task1EnterNameandDescription {
	Logger loger;
	WebDriver driver=new ChromeDriver();
	MethodsAndLocators object =new MethodsAndLocators(driver);
    
    @Test(description="Write Your Name ",priority =1)
	public void Task1Writethename() throws InterruptedException {
		
    	
		driver.get("https://omayo.blogspot.in/");
		object.Task1Writethename("Noman Sharif");

    }
    @Test(description="Write description",priority=2)
    public void Task1WriteYourDescription() throws InterruptedException {
		driver.get("https://omayo.blogspot.in/");
    	object.Task1WriteYourDescription("My Name is Khan");}}