import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//89. How to handle Frames?
//90. Frames Techniques-real time example
public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//driver switch to the frame by webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		//switch to the frame by index
		//As there is only one frame on the webpage so index is 0.
		//driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//With the help of Actions class you can drag and drop the element.
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();	

		//How to know that how much frames in the webpage
		//Ans: frames start with the tagname iframe
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	
	//If you want to click on any element outside the frame or wabpage
	driver.switchTo().defaultContent();
	}

}
