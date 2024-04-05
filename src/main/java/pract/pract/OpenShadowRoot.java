package pract.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenShadowRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/shadowdom");
		
		
		WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-host"));
		
		
		SearchContext  shadowRoot = shadowHost.getShadowRoot();
		
		shadowRoot.findElement(By.cssSelector("button[type='button']")).click();
		
		

	}

}
