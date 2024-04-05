package selniumlogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://chercher.tech/practice/frames");
		WebElement f1 = driver.findElement(By.id("frame1"));	
		driver.switchTo().frame(f1);
		driver.switchTo().frame("frame3");
			
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		
//		driver.switchTo().defaultContent()
		
		WebElement tp =driver.findElement(By.xpath("//input[@type='text']"));
		tp.sendKeys("jyoti");
		
		driver.switchTo().defaultContent();
		WebElement f2 = driver.findElement(By.id("frame2"));	
		driver.switchTo().frame(f2);
		WebElement sel1 =driver.findElement(By.id("animals"));
		
		Select sel = new Select(sel1);
		
		sel.selectByVisibleText("Avatar");
	}

}
