package selniumlogic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		    WebElement revealed = driver.findElement(By.id("revealed"));
		    driver.findElement(By.id("reveal")).click();

//		    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		    wait.until(ExpectedConditions.visibilityOf(revealed));
		    	driver.close();

	}

}
