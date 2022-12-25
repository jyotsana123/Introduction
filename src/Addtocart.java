import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Section - 8
//69. Problem - Adding Items into Cart for Ecommerce App
//70. Sending Array of Products to Cart for checkout
//71. Building Programming Logic to process items in array for Cart
//72. Debugging the code to understand how flow is being built
//73. Fixing the problem of inconsistent locators and making tests clean
public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jyotsana Pandey\\Downloads\\chromeversion_105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] products = { "Brocolli", "Cucumber", "Carrot" };
		List al = Arrays.asList(products);
		List<WebElement> allProducts = driver.findElements(By.cssSelector(".product-name"));
		for (int i = 0; i < allProducts.size(); i++) {
			String array = allProducts.get(i).getText();
			System.out.println(array);
			String[] items = array.split("-");
			String formettedProducts = items[0].trim();
			System.out.println(formettedProducts);

			if (al.contains(formettedProducts)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;

				if (j == products.length) {
					break;
				}
			}
		}
		// driver.findElement(By.cssSelector(".product-action")).click();

//		for(int i=0; i<allProducts.size();i++)
//		{
//			allProducts.get(i).getText().split("-")
//			if(al.contains(allProducts))
//			{
//				driver.findElement(By.cssSelector(".product-action")).click();
//			}
//		}
	}

}
