package upstox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclassforupstox {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		driver.manage().window().maximize();
        Thread.sleep(1000);
        File myfile=new File("D:\\");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet(null);
        
		//object creation for calling methods from Upstoxloginpage class
		Upstoxloginpage u=new Upstoxloginpage(driver);
		
		u.enteruserid(mysheet.getRow(0).getCell(1).getStringCellValue());
		u.enterpassword(mysheet.getRow(0).getCell(2).getStringCellValue());
		u.clickonsigninbutton();
		
		//object creation for calling methods from Digitpasscodepage class
		Thread.sleep(1000);
		Digitpasscodepage d=new Digitpasscodepage(driver);
		
		d.enterpasscode(mysheet.getRow(0).getCell(3).getStringCellValue());
		
		
		//object creation for calling methods from welcomepage class
		Thread.sleep(5000);
		Welcomepage w=new Welcomepage(driver);
		
		
		w.clickonnoiamgoodbutton();
		Thread.sleep(1000);
		Homepage h=new Homepage(driver);
		h.getusername();
		
		Screenshot.screenshot1(driver, null);
		h.clickonfundstab();
		
		Thread.sleep(1000);
		Funds f=new Funds(driver);
		
		f.availablefundsinaccount();
		Thread.sleep(1000);
		
		h.logoutoption();
		
	}

}
