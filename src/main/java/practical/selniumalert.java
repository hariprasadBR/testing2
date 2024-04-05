package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selniumalert {
	
	// TODO Auto-generated method stub
			public static void main(String[] args) {
				WebDriver driver = new  ChromeDriver();
				driver.get("https://chercher.tech/practice/frames");
				driver.switchTo().frame("frame1");
				driver.switchTo().frame("frame3");
			WebElement checkbox=	driver.findElement(By.id("a"));
			checkbox.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame2");
			WebElement animal=driver.findElement(By.id("animals"));
			Select sel = new Select(animal);
			sel.selectByVisibleText("Cat");
			}


}
