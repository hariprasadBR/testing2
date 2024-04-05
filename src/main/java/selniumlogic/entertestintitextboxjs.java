package selniumlogic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class entertestintitextboxjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("http://www.facebook.com");

//2 ways we can do
//1) findElemnet in javascript + text by javascript
//2) find element by webdriver + text by javascript

WebElement element =driver.findElement(By.id("email"));

	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
//	js.executeScript("document.getElementById('email').value='hariprasad';");
	
	js.executeScript("arguments[0].value='nomula'", element);
	
//	to get the text
	String text =(String)js.executeScript("document.getElementById('email').value");
	System.out.println(text);
	}

}
