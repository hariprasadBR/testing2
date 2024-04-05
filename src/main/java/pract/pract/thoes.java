package pract.pract;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class thoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/buytickets/swatantrya-veer-savarkar-pune/movie-pune-ET00330062-MT/20240401");
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement h= wait.until(ExpectedConditions.elementToBeClickable(By.id("wzrk-cancel")));
		h.click();
//		driver.findElement(By.id("wzrk-cancel")).click();
		
		List<WebElement> wbelements = driver.findElements(By.xpath("//div[@class='slick-track']//child::div[@class='date-numeric']"));
		
		for(WebElement wb:wbelements) {
			
			
			String text =wb.getText();
			
			if(text.equals("02")) {
				wb.click();
				
			}
			
			
		}

	}

}
