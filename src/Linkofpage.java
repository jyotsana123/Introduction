import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Section - 11
//91. Practise Exercise- print the links count in the Page
//92. Exercise 1.1-Limiting Webdriver scope
//93. How to open the links in Separate Tabs - Optimized solution
//94. Getting the Titles of child tabs with optimized while loop
public class Linkofpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1. Give me the link count of the entire web page
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    
	    //2. Give me the count of links which present only in footer section
	    WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
	    System.out.println(footerDriver.findElements(By.tagName("a")).size());
	    
	    //3. Give me the link count of 1st column in footer section
	 WebElement coloumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	 System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
	 
	 //4. Click on each link in the column to check link is working
	 for(int i=1; i<coloumnDriver.findElements(By.tagName("a")).size(); i++)
	 {
		 String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		 coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		 Thread.sleep(2000);
	 }
	 
	 //5. Give me the title of all open links
	Set<String> pageTitleSet = driver.getWindowHandles();
	Iterator<String> it = pageTitleSet.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	}

}
