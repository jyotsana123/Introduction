import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Section - 7
//66. Handling Java Alerts using Selenium Webdriver
public class Alertbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_107\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Jyotsana");
		driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.cssSelector("#name")).sendKeys("Nishu");
	    driver.findElement(By.id("confirmbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.cssSelector("#name")).sendKeys("Shree");
	    driver.findElement(By.id("confirmbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
	    driver.switchTo().alert().dismiss();
		

	}

}
