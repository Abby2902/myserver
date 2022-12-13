package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelwithoutknowledgeofrowsandcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
File mf=new File("D:\\SOFTWARE TESTING\\AUTOMATION TESTING\\selenium\\practicesheet.xlsx");

		
		Sheet mysheet = WorkbookFactory.create(mf).getSheet("Sheet2");
		
		int totalrows = mysheet.getLastRowNum();
		
		System.out.println(totalrows);
		
	       int totalcells = mysheet.getRow(0).getLastCellNum();
		
	System.out.println(	totalcells);
		int actualcells = totalcells-1;
		System.out.println(actualcells);
		
		for(int i=0;i<=totalrows;i++) {
			
			for(int j=0;j<=actualcells;j++) {
				
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+"   ");
				
				
				
			}
			System.out.println();
			
		}
		

	}

}
