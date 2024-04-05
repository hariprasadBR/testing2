package pract.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		title
		
//		sendkeys
		
//		click
		
//		background
		
//		highlit
		//draw broder
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		TakesScreenshot  ts = (TakesScreenshot)driver;
		
//		ts.getScreenshotAs(outp)
		
		driver.get("https://www.facebook.com/login.php/");
		
//		js.executeScript("null")
		js.executeScript("document.getElementById('email').value='jyoti'");
		
//		-->elemnt(javascript)    --<sendkey(javascript)
//		-->element(webdriver)    -->sendkeys(javascript)
		
		WebElement email =driver.findElement(By.id("email"));
		
//		js.executeScript(null, args)\\
		
		js.executeScript("arguments[0].value='hari'", email);
		
		WebElement pass =driver.findElement(By.id("pass"));
		
		//sendkeys
		js.executeScript("document.getElementById('pass').value='hari';");
		
		js.executeScript("arguments[0].value='gafgsns'", pass);
		
		WebElement buttonlogin = driver.findElement(By.id("loginbutton"));
		
		js.executeScript("arguments[0].click();",buttonlogin);
		

	}

}
