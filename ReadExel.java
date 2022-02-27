package parameterisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.vel.config.Configurations;

public class ReadExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
	
		FileInputStream file = new FileInputStream("E:\\Velocity\\Setup\\Book1.xlsx"); 
		Sheet path = WorkbookFactory.create(file).getSheet("Sheet1");
		String username= path.getRow(0).getCell(0).getStringCellValue();
		System.out.println(username);
	
		String pass= path.getRow(0).getCell(1).getStringCellValue();
		System.out.println(pass);
		
		System.setProperty("webdriver.chrome.driver", Configurations.driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		
	}
}
