import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropFTX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_109\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://propftxdevadmin.iworklab.com/");
		
		 driver.findElement(By.cssSelector("input[name='loginEmail']")).sendKeys("rahul.agarwal@mail.vinove.com");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div[2]/input")).sendKeys("Admin@123");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/button")).click();
		 //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/ul/div/li[1]/a")).click();
        Thread.sleep(10000);
       System.out.println(driver.findElement(By.cssSelector("#row-4")).getText());
	}

}
