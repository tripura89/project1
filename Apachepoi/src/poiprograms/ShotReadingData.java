package poiprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ShotReadingData {

	public static void main(String[] args) throws EncryptedDocumentException,IOException, InvalidFormatException  {
		FileInputStream fis=new FileInputStream("C://testdata//userdata3.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		String s = w1.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		FileOutputStream fos=new FileOutputStream("C://testdata//userdata3.xlsx");
		w1.write(fos);
		System.out.println(s);
		System.out.println("Successfully read");

	}

}
