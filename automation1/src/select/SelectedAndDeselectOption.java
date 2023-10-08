package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedAndDeselectOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
		WebElement allOption = driver.findElement(By.id("mtr"));
		Select s=new Select(allOption);
		List<WebElement> getoption = s.getOptions();
		int count = getoption.size();
		for(int i=0;i<count;i++) {
			Thread.sleep(500);
			s.selectByIndex(i);
		}
	
	
		for(int i=count-1;i>=0;i--) {
			Thread.sleep(i);
			s.deselectByIndex(i);
		}
		
	}

}
