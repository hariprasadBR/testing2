package selniumlogic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleander {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// up casting
		WebDriver driver = new ChromeDriver();

		// Open specific URL
		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		Thread.sleep(4000);

		WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.click();
		Thread.sleep(1000);

		// WebElement fbox = driver.findElement(By.xpath("//input[@id='fromCity']"));
		// fbox.sendKeys("Pune");

		WebElement pune = driver.findElement(By.xpath("//p[text()='Pune, India']"));
		pune.click();
		Thread.sleep(1000);

		WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
		to.click();
		Thread.sleep(1000);

		WebElement delhi = driver.findElement(By.xpath("//p[text()='New Delhi, India']"));
		delhi.click();

		Thread.sleep(2000);

		//WebElement cal = driver.findElement(By.xpath("//label[@for='departure']"));
		//cal.click();

		 //Thread.sleep(2000);
		
			while (true) {
				WebElement month = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]"));

				String a = month.getText();
				System.out.println(a);
				// System.out.println(a);

				if (a.contains("September 2024")) {
					Thread.sleep(2000);
					WebElement smonth = driver.findElement(By.xpath("(//p[text()='20'])[1]"));
					smonth.click();
					Thread.sleep(1000);
					break;

				} else {
					WebElement next = driver
							.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
					Thread.sleep(1000);
					next.click();

				}

			}
			Thread.sleep(2000);
			WebElement search = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
			search.click();
			Thread.sleep(10000);
			//Take Screnshot
			
			// Down casting
			TakesScreenshot ts =(TakesScreenshot)driver;
			
			//capture screenshot using getScreenshotAs()
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			//destination to store screenshot
			File dest3 = new File("C:\\Users\\Nikhil\\eclipse-workspace\\SeleniumTutorial\\ScreenshotFolder\\Abc.png");
			
			//copy from src to dest
			FileUtils.copyFile(src, dest3);
	}

}
