package selniumlogic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollwithjs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		3 types of scroll
//		scroll/scrollTo( from intial postio)
//		- specific postion
//		- bottom of the page
//		- to the elment location
//		scroll by-- (relatoive to currenyt position)
//		scrollintoView
		
//		in this we are not performing action on dom here we are performin action on window

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.hyrtutorials.com");
		
		WebElement wb =driver.findElement(By.id("sidebar-wrapper"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(arguments[0],arguments[1])", wb.getLocation().getX(),wb.getLocation().getY());
		
		js.executeScript("window.scrollBy(0,1000)");
		
		js.executeScript("arguments[0].scrollIntoView()", wb);
	}

}
