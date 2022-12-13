package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheethavingsamedata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
File mf=new File("D:\\SOFTWARE TESTING\\AUTOMATION TESTING\\selenium\\practicesheet.xlsx");

		
		Sheet mysheet = WorkbookFactory.create(mf).getSheet("Sheet2");
		
		
		for(int i=0;i<=2;i++) {
			
			for(int j=0;j<=4;j++) {
				
				
				String table = mysheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(table+"    ");
				
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
