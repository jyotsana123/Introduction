import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Section - 10
//86. Window Handle concepts-real time example
//87. Live Example on working with Child windows

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String password = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" at ")[1].split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("password")).sendKeys(password);
	}

}
