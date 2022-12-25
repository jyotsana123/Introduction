import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//50. Handling Static dropdowns with Select webdriver API
//51. Updated lecture on latest Dropdown looping UI

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Select 4 passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
        int i = 1;
		while (i < 4) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");

		// Select currency, Static dropdown
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		// For static dropdwon we need to create object of select class, then by the
		// object we will use every method of select class to access the dropdowns
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		System.out.println(s.getFirstSelectedOption().getText()); // To print the value of static dropdown
		s.selectByValue("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("INR");
		System.out.println(s.getFirstSelectedOption().getText());

		// Select FROM city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DED']"))
				.click();
		Thread.sleep(2000);

		// Select TO city
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"))
				.click();

		// Select current date in Depart date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// Select friends and family check box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		// Total no. of check boxes present on the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6");
		
		
		//Autusuggestive dropdown, Select country INDIA
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement> list = driver.findElements(By.cssSelector(".ui-menu-item a"));
		for(WebElement option :list)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}

}
