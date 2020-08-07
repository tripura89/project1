package poiprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ShotWritingData {

	public static void main(String[] args) throws EncryptedDocumentException,IOException, InvalidFormatException {
		FileInputStream fis=new FileInputStream("C://testdata//userdata1.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet("Sheet1").createRow(3).createCell(3).setCellValue("Selenium");
		FileOutputStream fos=new FileOutputStream("C://testdata//userdata1.xlsx");
		w1.write(fos);
		System.out.println("Successfully written");

	}

}
