package Tests;

import java.io.*;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class FileReader {

	public static void main(String[] args) {
		 try { 
			 File file = new File ("path/.xlsx"); 
			 FileInputStream fis = new FileInputStream(file); 
			 XSSFWorkbook workbook = new XSSFWorkbook(fis);
			 XSSFSheet sheet = workbook.getSheetAt(0); 
			 
			 Iterator<Row> itr = sheet.iterator(); 
			 while(itr.hasNext()){ 
				 Row row = itr.next(); 
				 Iterator<Cell> cellitr = row.cellIterator(); 
				 
				 while(cellitr.hasNext()) { 
				  Cell cell =cellitr.next(); 
				 
					/*
					 * switch (cell.getCellType()) { case Cell.CELL_TYPE_STRING: //field that
					 * represents string cell type System.out.print(cell.getStringCellValue() +
					 * "\t\t\t"); break; case Cell.CELL_TYPE_NUMERIC: //field that represents number
					 * cell type System.out.print(cell.getNumericCellValue() + "\t\t\t"); break;
					 * default: }
					 */
				  }  
				  System.out.println("");  
				  }  
				  }  
				  catch(Exception e)  
				  {  
				  e.printStackTrace();  
				  }  
				  }  
				  }  
