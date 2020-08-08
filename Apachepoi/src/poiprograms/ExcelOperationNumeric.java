package poiprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelOperationNumeric{
    public static String readData(String sheetname,int rowno, int cellno) throws EncryptedDocumentException,IOException, InvalidFormatException
    {
    FileInputStream fis=new FileInputStream("C://testdata//userdata2.xlsx");
    Workbook w1 =WorkbookFactory.create(fis);
    String s= w1.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
    return s;
    }
    
    public static void writedata(String sheetname,int rowno,int cellno,String celldata) throws  EncryptedDocumentException,IOException, InvalidFormatException
    {
    	FileInputStream fis=new FileInputStream("C://testdata//userdata2.xlsx");
    	Workbook w1=WorkbookFactory.create(fis);
    	w1.getSheet(sheetname).getRow(rowno).createCell(cellno).setCellValue(celldata);
    	FileOutputStream fos=new FileOutputStream("C://testdata//userdata2.xlsx");
    	w1.write(fos);
    	}
    
    public static int readNumData(String sheetname, int rowno, int cellno, int cellnum) throws EncryptedDocumentException,IOException, InvalidFormatException
    {
    	FileInputStream fis=new FileInputStream("C://testdata//userdata2.xlsx");
    	Workbook w1 = WorkbookFactory.create(fis);
    	int i=(int)w1.getSheet(sheetname).getRow(1).getCell(0).getNumericCellValue();
    	System.out.println(i);
    	return i;    
}
}