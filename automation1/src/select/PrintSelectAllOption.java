package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSelectAllOption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
	WebElement allOption = driver.findElement(By.id("slv"));
	Select s=new Select(allOption);
	List<WebElement> palloption = s.getAllSelectedOptions();
			for(int i=0;i<palloption.size();i++) {
				String text = palloption.get(i).getText();
				System.out.println(text);
			}
	
		
	}

}
