package selniumlogic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		
		
//		WebElement wb =driver.findElement(By.xpath("//div[@id='q']//child::input[1]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(9));
		WebElement wb =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='q']//child::input[1]")));
		
		wb.click();
		
//		driver.close();
		
		
		

	}

}
