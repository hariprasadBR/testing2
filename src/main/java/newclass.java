import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobile+under+15000&crid=1AM6S7M06I4IB&sprefix=mobile+under+15000%2Caps%2C216&ref=nb_sb_noss_1");
		Thread.sleep(5000);
		WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("mobile under 15000");
		
		Thread.sleep(5000);
		List<WebElement> al =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for(WebElement a:al) {
			String b =a.getText();
			String c=b.replaceAll(",", "");
			System.out.println(c);
			
		}

	}

}
