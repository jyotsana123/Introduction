import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//Section - 12
//100. How to Perform Scrolling with in table and Window level using JavaScriptExecutor
//101. How to handle table Grids in webpage
//102. Parsing String and comparing with Generated Sum value -Exercise
public class Pagescroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//for scrolling page we need to write java script
		//window scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//table scroll
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		//Find sum of column 4 elements
		List <WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0; i<values.size(); i++)
		{
			//convert integer from string
			Integer.parseInt(values.get(i).getText());
			System.out.println(Integer.parseInt(values.get(i).getText()));
			sum = sum + Integer.parseInt(values.get(i).getText());
			}
		System.out.println("Total sum is " + sum);
		
		//compare two integers equals or not
		
//		String array[] = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
//		String number = array[1].trim();
//		System.out.println(number);
//		int num296 = Integer.parseInt(number);
//		System.out.println("both values are equal "+(sum==num296));
		int num = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, num);
	}

}
