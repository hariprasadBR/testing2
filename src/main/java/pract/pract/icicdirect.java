package pract.pract;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class icicdirect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=pl&WT.mc_id=Desk_NLI_cms_pl_index_ChkEli&_gl=1*sasjeu*_ga*OTkwMDkwMTc5LjE2NTAwNDQ4NzQ.*_ga_SKB78GHTFV*MTY1MDA0NDg3NC4xLjAuStriMTY1MDA0NDg4MC41NA");

		WebElement wb = driver.findElement(By.id("CUSTCOMMUCITY"));

		wb.sendKeys("goa");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		WebElement city = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[starts-with(@id,'ui-id')]")));
		city.click();
		

		}

	}


