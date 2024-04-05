package pract2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class44 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement alt=driver.findElement(By.id("alertButton"));
		alt.click();
		
		
		Thread.sleep(5000);
		Alert alert =driver.switchTo().alert();
		String alert2=  alert.getText();
		alert.accept();
		
		
		 
		 
		System.out.println(alert2);

	}

}
