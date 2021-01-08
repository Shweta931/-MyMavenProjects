package com.generics.facebook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getcellValue(String path,String sheet,int row,int cell) throws IOException 
	{
		FileInputStream file=new FileInputStream(excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
	}

}
