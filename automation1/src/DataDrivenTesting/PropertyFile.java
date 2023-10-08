package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commendata.property");
		Properties p=new Properties();
		p.load(fis);
	String Url = p.getProperty("url");
	
	System.out.println(Url);
	
		
	}

}
