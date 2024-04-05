package pract.pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowdomusinjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://qavbox.github.io/demo/shadowDOM/");

//		interacting with open shadow root find nearest tag   
		// In case Shadow Root is not found, it will throw NoSuchShadowRootException.
		WebElement shadowHost = driver.findElement(By.tagName("my-open-component"));

		// Execute JavaScript to find the input field within the shadow DOM
		WebElement username = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot.querySelector('input[type=\"text\"]')", shadowHost);

		// Set value to the input field using JavaScript
		((JavascriptExecutor) driver).executeScript("arguments[0].value = 'hari'", username);
		
		
		

	}

}
