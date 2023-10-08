package HandlingPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChieldWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			Thread.sleep(1000);
	driver.switchTo().window(wh);
	driver.close();
		
		}
	}
}


