package practical;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDom {
	
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://qavbox.github.io/demo/shadowDOM/");
	
	WebElement shadowHost =driver.findElement(By.tagName("my-open-component"));
	
	SearchContext   shadowRoot=  shadowHost.getShadowRoot();
	
	WebElement wb = shadowRoot.findElement(By.cssSelector("input[type='text']"));
	wb.sendKeys("hari");
	
	
	
	
	
	
	
	
}

}
