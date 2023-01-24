import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		//Get the total no. of frames available on the page by tagname "frame"
		System.out.println(driver.findElements(By.tagName("frame")).size());
		//Switch to desired frame
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		//Get total no. of frames available in top frame (Nested frame)
		System.out.println(driver.findElements(By.tagName("frame")).size());
		//Switch to middle frame
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		//Print the text of middle frame
	    System.out.println(driver.findElement(By.cssSelector("#content")).getText());
	}

}
