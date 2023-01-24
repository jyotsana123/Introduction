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
		//getWindowHandles() method give the id of all the window opened by selenium, return type of this method is set of strings Set<String>
		Set<String> windows = driver.getWindowHandles();
		//two window id is sitting in the windows object - [parentid, childid]
		//now you need to switch to the child window - driver.switchTo().window(pass the child id in the window argument);
		//to extract the value of Set collection which is ids of parent and child window we need to use iterator
		//with the help of windows.iterator() method we can pull the ids of windows from Set data structure. And return type of this method is Iterator of strings Iterator<String>
		Iterator<String> it = windows.iterator();
		//it object contains parent id and child id individually. it variable go and extract the value present in set collection
		//it.next() method is help you to get the next index of your Set, it variable is out side the set so control will go to the 0th index first.
		//on 0th index parent id is present so it grab it and store in new variable parentId which is string type
		//if you want childId you need to do one more next - it.next(), And again it store in new variable childId.
		String parentId = it.next();
		String childId = it.next();
		//After getting the ids you need to switch by driver.switchTo().window(childId);
		driver.switchTo().window(childId);
		String password = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" at ")[1].split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("password")).sendKeys(password);
	}

}
