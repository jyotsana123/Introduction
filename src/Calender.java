import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Section - 11
//96. Handling calendar UI in Travel websites
public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//Grab common attribute for dates//put into list and then iterate.
		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		int count = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
			 if(text.equalsIgnoreCase("12"))
			 {
				 driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				 break;
			 }
		}
		
	}

}
