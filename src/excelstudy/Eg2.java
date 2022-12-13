package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
File mf=new File("D:\\SOFTWARE TESTING\\AUTOMATION TESTING\\selenium\\practicesheet.xlsx");

		WorkbookFactory.create(mf);
		
		
		Sheet mysheet = WorkbookFactory.create(mf).getSheet("Sheet2");
		
		
		for (int i=0;i<=4;i++) {
			
			
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(value+"   ");
		}
		System.out.println();
		System.out.println("==================================");
		
		for(int i=0;i<=2;i++) {
			
			
			String value1 = mysheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(value1);
			
			
		}
		
		
		
		
		
		
	}

}
