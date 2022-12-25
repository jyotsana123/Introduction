import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_107\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		//div/div/h5
		
		driver.findElement(By.id("userEmail")).sendKeys("nishu@yopmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
		String product = "ZARA COAT 3";
		List <WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		for(int i=0;i<products.size();i++)
		{
			String items = products.get(i).getText();
			System.out.println(items);
			if(items.contains(product))
			{
				driver.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();
				System.out.println(product);
			}
		}
		
	}

}
