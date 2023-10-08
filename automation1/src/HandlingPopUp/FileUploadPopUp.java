package HandlingPopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/agbhu/OneDrive/Desktop/fileupload.html");
		Thread.sleep(2000);
		File f=new File("./data/resume.docx");
		String abspath = f.getAbsolutePath();
		driver.findElement(By.id("CV")).sendKeys(abspath);
	}

}
