package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shadowDom {
	
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://qavbox.github.io/demo/shadowDOM/");
	
	WebElement shadowHost =driver.findElement(By.tagName("my-open-component"));
	
	SearchContext   shadowRoot=  shadowHost.getShadowRoot();
	
	WebElement wb = shadowRoot.findElement(By.cssSelector("input[type='text']"));
	wb.sendKeys("hari");
	
//	/		intacting with closed shadowroot
	
	Actions act = new Actions(driver);
	
	act.keyDown(Keys.TAB).sendKeys("hari").perform();
	
	
<<<<<<< HEAD
	
//	hari
=======
//	?hello i am from manger commit
	
>>>>>>> 14d68700fa264c5b74867f856a6fb9efbb7d34aa
	
	
	
	
}

}
