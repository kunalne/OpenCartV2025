package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	public FileInputStream file;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path;
	
	public ExcelUtilities(String path) {
		this.path = path;
	}
	
	public int getRowCount(String sheetName) throws IOException {
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		file.close();
		return rowcount;	
	}
	
	public int getCellCount(String sheetName, int rowNumber) throws IOException {
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		int cellcount = row.getLastCellNum();
		workbook.close();
		file.close();
		return cellcount;	
	}
	
	public String getCellData(String sheetName, int rowNumber, int cellNumber) throws IOException {
		file = new FileInputStream(path);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(cellNumber);
		DataFormatter formatter = new DataFormatter();
		
		String data;
		try {
			data = formatter.formatCellValue(cell);
		} catch (Exception e) {
			data ="";
		}
		
		
		workbook.close();
		file.close();
		return data;
	}
	
	
	
	

}
