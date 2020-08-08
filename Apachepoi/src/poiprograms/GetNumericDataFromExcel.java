package poiprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("C://testdata//userdata2.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		int d = (int)w1.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		FileOutputStream fos=new FileOutputStream("C://testdata//userdata2.xlsx");
		w1.write(fos);
		System.out.println(d);
		System.out.println("Successfully read");

	}

}
