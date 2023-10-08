package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelected {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
		WebElement foption = s.getFirstSelectedOption();
		String text = foption.getText();
		System.out.println(text);
		
		
		
	}

}
