package pract.pract;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotofobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage containing the element you want to capture
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Find the element you want to capture
		WebElement element = driver.findElement(By.xpath("//button[text()='Log in']"));

		// Get the location and size of the element
//        element.getL

		Point location = element.getLocation();
		Dimension size = element.getSize();

		// Take a screenshot of the entire page
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			// Read the screenshot into memory
			BufferedImage fullImg = ImageIO.read(screenshot);
			
			

			// Crop the screenshot to include only the desired element
			BufferedImage elementScreenshot = fullImg.getSubimage(location.getX(), location.getY(), size.getWidth(),
					size.getHeight());

			// Save the cropped screenshot
			ImageIO.write(elementScreenshot, "png", screenshot);

			// Copy the cropped screenshot to a specific location
			File destinationFile = new File("element_screenshot.png");
			FileUtils.copyFile(screenshot, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Close the WebDriver
//		driver.quit();

	}

}
