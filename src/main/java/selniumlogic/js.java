package selniumlogic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class js {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript(null, args)
		
//		flash
		js.executeScript("document.getELmentById('loginbutton').click();");

	}

}
