import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Section - 11
//97. Generic method to handle calendar with month and date
public class Monthdatecalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		while (!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains("January"))
		{
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		int count = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("26"))
			{
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}
		
	}

}
