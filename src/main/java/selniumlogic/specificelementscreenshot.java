package selniumlogic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class specificelementscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/reg");

		// WebElement wb = driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']"));

//		Thread.sleep(3000);
//		WebElement wb = driver.findElement(By.name("lastname"));
//
//		File f = wb.getScreenshotAs(OutputType.FILE);
//
//		File dist = new File(System.getProperty("user.dir") + "\\Delhi\\a2.png");
//
//		FileUtils.copyFile(f, dist);
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("document.getElementById('day').value='3';");

	}

}
