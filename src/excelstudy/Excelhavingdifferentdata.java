package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelhavingdifferentdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
File mf=new File("D:\\SOFTWARE TESTING\\AUTOMATION TESTING\\selenium\\practicesheet.xlsx");

		
		Sheet mysheet = WorkbookFactory.create(mf).getSheet("Abhaysinh1");
		
		int totalrows = mysheet.getLastRowNum();
		
		
		int totalcells = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalrows;i++) {
			
			for(int j=0;j<=totalcells;j++) {
				
				CellType celldatatype = mysheet.getRow(i).getCell(j).getCellType();
				
				
				if(celldatatype==CellType.STRING) {
					
					
					String value1 = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value1+"    ");
					
					}
				
				
				else if(celldatatype==CellType.NUMERIC) {
					
					
					double value2 = mysheet.getRow(i).getCell(j).getNumericCellValue();
					
					System.out.print(value2+"    ");
				}
				
				else if(celldatatype==CellType.BOOLEAN) {
					
					
					boolean value3 = mysheet.getRow(i).getCell(j).getBooleanCellValue();
					
					System.out.print(value3+"    ");
					
				}
				
				else if(celldatatype==CellType._NONE) {
					
					
				}
				
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
	}

}
