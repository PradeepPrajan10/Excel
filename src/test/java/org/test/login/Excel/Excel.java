package org.test.login.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public void excelUpd() throws Exception {
	File f = new File("C:\\Users\\lokesh\\eclipse-workspace\\Excel\\target\\excelred.xlsx");
		Workbook w = new XSSFWorkbook(); 
		Sheet s = w.createSheet("excelredd");
		Row row = s.createRow(0);
		Cell c = row.createCell(0);
		c.setCellValue("H");
		
		FileOutputStream k = new FileOutputStream(f);
		w.write(k);
		System.out.println("DONE");
					
	}
	
	public void excelWrite() throws Exception {
	File f = new File("C:\\Users\\lokesh\\eclipse-workspace\\Excel\\excelre.xlsx");
		
		FileInputStream f1 = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(f1); 
		
		Sheet s = w.getSheet("excelre");
		
		
			Row row = s.getRow(2);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				int i = c.getCellType();
				System.out.println("entered loop");
				if (i==1) {
					System.out.println("entered if type");
					String s1 = c.getStringCellValue();
					System.out.println(s1);
					if(s1.equals("H")) {
						System.out.println("entered if");
						c.setCellValue("K");
					FileOutputStream k = new FileOutputStream(f);
					w.write(k);
					System.out.println("DONE");
				}
					
					}
			}
			
	}
	public static void main(String[] args) throws Exception {
		Excel e = new Excel();
		e.excelUpd();
		e.excelWrite();
	
			
			
		}
	}
