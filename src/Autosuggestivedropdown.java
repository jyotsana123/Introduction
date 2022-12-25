import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Section - 12
//Assignment - 8
//Autosuggestive dropdown


public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. Provide input
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		
		//2. Figure out the generic locator to extract the all values and then put into the list
		List <WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item div"));
		
		//3. Iterate over the list
		for(WebElement option :options)
		{
			//4. Use getText to get text of all the options, and see if it's matched to real value
			if (option.getText().equalsIgnoreCase("india"))
			{
				//5. And blindly click on matched value and then break to come out from loop
				option.click();
				break;
			}
			
		}
	}

}
