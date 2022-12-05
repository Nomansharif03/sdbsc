package AssignmentLabTask4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlltheDatainTask4
{

	WebDriver driver=new ChromeDriver();
	MethodsAndLocators object =new MethodsAndLocators(driver);
	
	@Test(description="All the Data in Task4 is given",priority=1)
	public void AlltheDatainTaask4() throws InterruptedException {
		driver.get("https://omayo.blogspot.in/");
		object.Task4AudixCar1();
		object.Task4Selectdropdown1();
		object.Task4ClearAndWrite("Noman Khan");
		object.Task4ClickOnEnableButton();
		object.Task4clicikonSubmitButton();
		object.Task4clicikonLoginButton();
		object.Task4clickonRegisterButton();
		object.Task4RemoveText();
		object.Task4PopUpButtonClick();
		object.Task4clickontryitButton();
		object.Task4DoubleClick();
		object.Task4checkthisButton();}}
