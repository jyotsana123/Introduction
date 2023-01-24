import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Section - 12
//Assignment: 7
//print no. of rows, column, 2nd row data
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_108\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//print no. of rows, column, 2nd row data
		
		//Print 2nd row data
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		List <WebElement> values = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
		for(int i=0; i<values.size(); i++)
		{
//			String val = values.get(i).getText();
//			System.out.println(val);
			System.out.println(values.get(i).getText());
		}
		
		//No. of rows or row count
		//System.out.println("No. of rows = " +driver.findElements(By.xpath("//fieldset/table/tbody/tr")).size());
		WebElement table = driver.findElement(By.id("product"));
		System.out.println("No. of row = " +table.findElements(By.tagName("tr")).size());
		//Column count
		//System.out.println("No. of column = " +driver.findElements(By.xpath("//fieldset/table/tbody/tr/th")).size());
		System.out.println("No. of column = " +table.findElements(By.tagName("th")).size());
		
	}

}
