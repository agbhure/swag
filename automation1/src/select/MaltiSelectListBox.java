package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Value;

public class MaltiSelectListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("v");
		Thread.sleep(2000);
		s.selectByVisibleText("paddu");
		Thread.sleep(2000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("v");
		Thread.sleep(2000);
		s.deselectByVisibleText("paddu");
		
	}

}
