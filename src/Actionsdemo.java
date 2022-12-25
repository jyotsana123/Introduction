import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Section - 10
//84. Handling Ajax/Mouse Interactions
//85. Actions class-real time example

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		//For action (Mouse or keyboard interaction) we have to create object for Actions class, And by the object we can use every method of Actions class of mouse and keyboard interaction.
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));   
		a.moveToElement(move).build().perform();   //Move cursor to that webelement, We need to write build perform to perform the action of mouse and keyboard
		
		//type in search box in capital letter and select typed word
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//right click on webelement
		a.moveToElement(move).contextClick().build().perform();
	}

}
