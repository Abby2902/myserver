package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelseparatemethods {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File mf=new File("D:\\SOFTWARE TESTING\\AUTOMATION TESTING\\selenium\\practicesheet.xlsx");

		
		Workbook file = WorkbookFactory.create(mf);
		
		Sheet sheet = file.getSheet("Abhaysinh");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		
		CellType type = cell.getCellType();
		
		
		System.out.println(type);
		
		
		System.out.println(cell.getStringCellValue());
		
		
		
		
		
		
		
		
		
		

	}

}
