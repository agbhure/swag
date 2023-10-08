import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalloption {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
		WebElement alloption = driver.findElement(By.id("mtr"));
		Select s=new Select(alloption);
	List<WebElement> salloption = s.getOptions();
	for(int i=0;i<salloption.size();i++) {
		String text = salloption.get(i).getText();
		System.out.println(text);
		
	}
	
	
		
		
		
		
		
	}

}
