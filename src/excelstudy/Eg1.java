package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		
		File myfile=new File("D:\\Abhay.xlsx");
		
		
		String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value1);
		
		
		double value2 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(2).getCell(2).getNumericCellValue();
		
		System.out.println(value2);
		
		
		String value3 = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(8).getCell(1).getStringCellValue();
		
System.out.println(value3);
	}

}
