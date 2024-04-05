package pract2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
			WebElement frame1=	driver.findElement(By.xpath("(//div[@class='card']//iframe)[1]"));//iframe)[1]
			driver.switchTo().frame(frame1);
			WebElement cl =driver.findElement(By.id("Click"));
			cl.click();
			driver.switchTo().defaultContent();
			WebElement f2 =driver.findElement(By.xpath("(//div[@class='col-12 lg:col-6'])[2]//iframe"));
			driver.switchTo().frame(f2);
			WebElement innerf2 =driver.findElement(By.id("frame2"));
			driver.switchTo().frame(innerf2);
			driver.findElement(By.id("Click")).click();


	}

}
