package selniumlogic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightjs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		for changle single attrubute at a time
		js.executeScript("document.getElementById('email').style.border='2px solid red'");
				
				js.executeScript("		document.getElementById('email').style.background='2px solid red'");
		js.executeScript("document.getElementById('email').setAttribute('style','border:2px solid red; background:yellow');");
		Thread.sleep(5000);
//		higlist for 2 seconds 
//		remove highlist
		js.executeScript("document.getElementById('email').setAttribute('style','border; background');");
		

		
		
		

	}

}
