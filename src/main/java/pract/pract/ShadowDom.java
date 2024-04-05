package pract.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/shadowDOM/");
		
//		interactig with open shadow root find nearest tag   
		//In case Shadow Root is not found, it will throw NoSuchShadowRootException.
		WebElement shadowHost =driver.findElement(By.tagName("my-open-component"));
		
		SearchContext  shadowroot =shadowHost.getShadowRoot();
		
		shadowroot.findElement(By.cssSelector("input[type='text']")).sendKeys("coforge");
		
		
//		intacting with closed shadowroot
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.TAB).sendKeys("hari").perform();
		
		
//		using javascript excutor
		
		

	}

}
