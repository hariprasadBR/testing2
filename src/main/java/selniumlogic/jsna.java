package selniumlogic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('u_0_b_4u').value='jyoti'");

	}

}
