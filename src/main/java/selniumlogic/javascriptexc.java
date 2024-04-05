package selniumlogic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
//		creating refrence of java scrpt  
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("alert('hello')");

	}

}
