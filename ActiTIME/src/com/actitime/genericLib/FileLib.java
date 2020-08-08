package com.actitime.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib extends BaseTest{
	//Generic reusable method
			public String getCellData(String excelPath,String sheetName,int row,int cell) throws Throwable {
				FileInputStream fis=new FileInputStream(excelPath);
				Workbook wb=WorkbookFactory.create(fis);
				//String excelValue=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
				//this is for Invalidlogin test
				String excelValue=wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
				return excelValue;
			}
			public int getRowCount(String excelPath,String sheetName)throws Throwable{
				FileInputStream fis=new FileInputStream(excelPath);
				Workbook wb=WorkbookFactory.create(fis);
				int rowCount=wb.getSheet(sheetName).getLastRowNum();
				return rowCount;
			}
			public void setCellData(String excelPath,String sheetName,int row,int cell,String data) throws Throwable{
				
				FileInputStream fis=new FileInputStream(excelPath);
				Workbook wb=WorkbookFactory.create(fis);
				wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
				//open the file in write Mode
				FileOutputStream fos=new FileOutputStream(excelPath);
				//save the file
				wb.write(fos);
			}	
			
			public String getPropKeyValue(String propPath,String key) throws Throwable{
				
				FileInputStream fis= new FileInputStream(propPath);
				Properties prop=new Properties();
				prop.load(fis);
				String propValue=prop.getProperty(key,"Incorrect key");
				return propValue;
						
				
			}
}


