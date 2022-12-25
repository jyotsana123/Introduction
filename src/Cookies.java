import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Section: 13
//Video - 105. Maximizing window and deleting cookies
//106. How to take Screenshots in Selenium
public class Cookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_107\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("SessionKey");
		//Click on any link
		//Login page - Verify login URL
		driver.get("https://google.com");
		
		//Take screenshot of webpage
		//Casting driver object to TakesScreenshot object
		//use method - getScreenshotAs(OutputType.FILE) 
		//Store screenshot in src destination
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Documents\\screenshot.png")); //Copy screenshot from src to our local system.
	}

}
