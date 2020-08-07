package poiprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	
	public static String readData(String sheetname, int rowno,int cellno) throws EncryptedDocumentException,IOException, InvalidFormatException
	{
		FileInputStream fis= new FileInputStream("C://testdata//userdata.xlsx");
		Workbook w1= WorkbookFactory.create(fis);
		String s=w1.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return s;
	}
		// this is the code for read data
		
		//Now this method writes the data into  excel
		
		
		public static void writeData(String sheetname, int rowno, int cellno, String celldata) throws EncryptedDocumentException,IOException, InvalidFormatException
		{
			
			FileInputStream fis =new FileInputStream("C://testdata//userdata.xlsx");
			Workbook w1= WorkbookFactory.create(fis);
			w1.getSheet(sheetname).getRow(rowno).createCell(cellno).setCellValue(celldata);
		    FileOutputStream fos=new FileOutputStream("C://testdata//userdata.xlsx");
			w1.write(fos);
		}
		
		
	}



