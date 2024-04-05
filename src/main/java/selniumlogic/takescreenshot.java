package selniumlogic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+"\\jyoti\\a1.png");
		
		FileUtils.copyFile(src, dest);
		
		WebElement email =driver.findElement(By.id("email"));
		
		File src1 =email.getScreenshotAs(OutputType.FILE);
		
		File dest2 = new File(System.getProperty("user.dir")+"\\hari\\a4.png");
		
		
		FileUtils.copyFile(src1, dest2);

	}

}
