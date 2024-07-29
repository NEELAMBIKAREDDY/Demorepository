package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstant {
	public static File fiepath= new File(Excel_Path);
	public String getData(String sheet,int row,int coloumn) throws EncryptedDocumentException, IOException {
		
		FileInputStream f=new FileInputStream(fiepath);
	Workbook w=WorkbookFactory.create(f);
	String data = w.getSheet(sheet).getRow(row).getCell(coloumn).getStringCellValue();
	return data;
		
	}
	
	
	public static Object [][] fetchexcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream(fiepath);
		Workbook w=WorkbookFactory.create(f);
		Sheet s = w.getSheet("sheet");
		int rows = s.getPhysicalNumberOfRows();
		int cell = s.getRow(0).getPhysicalNumberOfCells();
		Object [][]data=new Object [rows][cell];
				
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cell; j++) {
					 data[i][j]= w.getSheet("sheet").getRow(i).getCell(j).getStringCellValue();
						
						
					}
					
					
					
				}
				
				return data;
				
		
		
	}

}
