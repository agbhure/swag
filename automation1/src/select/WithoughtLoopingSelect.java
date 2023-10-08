package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoughtLoopingSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/hotel.html");
		WebElement selectoption = driver.findElement(By.id("mtr"));
		Select s=new Select(selectoption);
		String salloption = s.getWrappedElement().getText();
		System.out.println(salloption);

		
	}

}
